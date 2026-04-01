package AbstractFactory;

public class EntradaConcierto implements Entrada {
    @Override
    public void mostrarDetallesEntrada() {
        System.out.println("Entrada para concierto: acceso a zona musical.");
    }
}
