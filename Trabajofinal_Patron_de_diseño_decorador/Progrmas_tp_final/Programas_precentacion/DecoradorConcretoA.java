// Archivo: DecoradorConcretoA.java
public class DecoradorConcretoA extends Decorator {

    public DecoradorConcretoA(InterfaceComponente s) {
        super(s); // Pasa el objeto al constructor de Decorator
    }

    @Override
    public void operacionA() {
        super.operacionA(); // Llama al comportamiento base/anterior
        comportamientoExtraA(); // Añade la nueva funcionalidad
    }

    private void comportamientoExtraA() {
        System.out.println("-> [Decorador A]: Funcionalidad extra añadida a la operación A.");
    }
}
