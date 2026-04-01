package AbstractFactory;

public abstract class Evento {
    protected String fecha;
    protected String ubicacion;
    protected int aforo;

    public Evento(String fecha, String ubicacion, int aforo) {
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.aforo = aforo;
    }

    public void mostrarInformacionBase() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Aforo: " + aforo);
    }

    public abstract void mostrarTipo();
}
