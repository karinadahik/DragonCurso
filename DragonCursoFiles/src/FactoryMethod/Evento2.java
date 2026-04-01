package FactoryMethod;
public class Evento2 extends Evento {
    private String expositor;

    public Evento2(String fecha, String ubicacion, int aforo, String expositor) {
        super(fecha, ubicacion, aforo);
        this.expositor = expositor;
    }

    public String getExpositor() {
        return expositor;
    }

    public void setExpositor(String expositor) {
        this.expositor = expositor;
    }

    @Override
    public void realizarEvento() {
        System.out.println("Se está realizando la conferencia de " + expositor);
    }

    @Override
    public String getTipoEvento() {
        return "Conferencia";
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: " + getTipoEvento());
        System.out.println("Expositor: " + expositor);
    }
}