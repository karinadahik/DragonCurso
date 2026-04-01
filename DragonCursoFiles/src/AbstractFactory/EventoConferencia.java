package AbstractFactory;

public class EventoConferencia extends Evento {
    private String expositor;

    public EventoConferencia(String fecha, String ubicacion, int aforo, String expositor) {
        super(fecha, ubicacion, aforo);
        this.expositor = expositor;
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Tipo de evento: Conferencia");
        System.out.println("Expositor: " + expositor);
    }
}
