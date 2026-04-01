package FactoryMethod;
public class Evento1 extends Evento {
    private String artista;

    public Evento1(String fecha, String ubicacion, int aforo, String artista) {
        super(fecha, ubicacion, aforo);
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public void realizarEvento() {
        System.out.println("Se está realizando el concierto de " + artista);
    }

    @Override
    public String getTipoEvento() {
        return "Concierto";
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: " + getTipoEvento());
        System.out.println("Artista: " + artista);
    }
}