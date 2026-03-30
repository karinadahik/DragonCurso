public class EventoFactory {

    public static Evento crearEvento(String tipo, String fecha, String ubicacion, int aforo) {
        if (tipo.equalsIgnoreCase("concierto")) {
            return new Evento1(fecha, ubicacion, aforo, "Artista invitado");
        } else if (tipo.equalsIgnoreCase("conferencia")) {
            return new Evento2(fecha, ubicacion, aforo, "Expositor principal");
        } else {
            return null;
        }
    }
}