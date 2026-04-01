package AbstractFactory;
public class FabricaConferencia implements FabricaEventos {

    @Override
    public Evento crearEvento(String fecha, String ubicacion, int aforo) {
        return new EventoConferencia(fecha, ubicacion, aforo, "Expositor principal");
    }

    @Override
    public Entrada crearEntrada() {
        return new EntradaConferencia();
    }
}