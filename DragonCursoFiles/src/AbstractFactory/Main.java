package AbstractFactory;

public class Main {
    public static void main(String[] args) {

        FabricaEventos fabrica1 = new FabricaConcierto();
        Evento evento1 = fabrica1.crearEvento("20/04/2026", "Coliseo", 5000);
        Entrada entrada1 = fabrica1.crearEntrada();

        System.out.println("=== FAMILIA CONCIERTO ===");
        evento1.mostrarInformacionBase();
        evento1.mostrarTipo();
        entrada1.mostrarDetallesEntrada();

        System.out.println();

        FabricaEventos fabrica2 = new FabricaConferencia();
        Evento evento2 = fabrica2.crearEvento("25/04/2026", "Auditorio", 300);
        Entrada entrada2 = fabrica2.crearEntrada();

        System.out.println("=== FAMILIA CONFERENCIA ===");
        evento2.mostrarInformacionBase();
        evento2.mostrarTipo();
        entrada2.mostrarDetallesEntrada();
    }
}
