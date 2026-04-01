package AbstractFactory;

public class EntradaConferencia implements Entrada {
    @Override
    public void mostrarDetallesEntrada() {
        System.out.println("Entrada para conferencia: acceso a sala de ponencias.");
    }
}
