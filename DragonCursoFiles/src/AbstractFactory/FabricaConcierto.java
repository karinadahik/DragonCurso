package AbstractFactory;

public class FabricaConcierto implements FabricaEventos {

    @Override
    public Evento crearEvento(String fecha, String ubicacion, int aforo) {
        return new EventoConcierto(fecha, ubicacion, aforo, "Artista invitado");
    }

    @Override
    public Entrada crearEntrada() {
        return new EntradaConcierto();
    }
}
