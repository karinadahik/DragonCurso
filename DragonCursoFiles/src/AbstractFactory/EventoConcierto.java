package AbstractFactory;

public class EventoConcierto extends Evento {
    private String artista;

    public EventoConcierto(String fecha, String ubicacion, int aforo, String artista) {
        super(fecha, ubicacion, aforo);
        this.artista = artista;
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Tipo de evento: Concierto");
        System.out.println("Artista: " + artista);
    }
}