package FactoryMethod;
public class Main {
    public static void main(String[] args) {
        Evento e1 = EventoFactory.crearEvento("concierto", "20/04/2026", "Coliseo", 5000);
        Evento e2 = EventoFactory.crearEvento("conferencia", "25/04/2026", "Auditorio", 300);

        System.out.println("=== Evento 1 ===");
        e1.mostrarInformacion();
        e1.realizarEvento();

        System.out.println("\n=== Evento 2 ===");
        e2.mostrarInformacion();
        e2.realizarEvento();
    }
}