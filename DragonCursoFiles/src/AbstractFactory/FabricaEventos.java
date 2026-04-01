package AbstractFactory;

public interface FabricaEventos {
    Evento crearEvento(String fecha, String ubicacion, int aforo);
    Entrada crearEntrada();
}
