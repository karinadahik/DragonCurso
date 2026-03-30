public abstract class Evento implements GestionEvento {
    protected String fecha;
    protected String ubicacion;
    protected int aforo;

    public Evento(String fecha, String ubicacion, int aforo) {
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.aforo = aforo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getAforo() {
        return aforo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Aforo: " + aforo);
    }

    public abstract String getTipoEvento();
}