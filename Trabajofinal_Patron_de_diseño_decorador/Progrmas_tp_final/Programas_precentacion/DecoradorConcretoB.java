// Archivo: DecoradorConcretoB.java
public class DecoradorConcretoB extends Decorator {

    public DecoradorConcretoB(InterfaceComponente s) {
        super(s);
    }

    @Override
    public void operacionB() {
        // En este ejemplo, el comportamiento extra se ejecuta ANTES del original
        comportamientoExtraB(); 
        super.operacionB(); 
    }

    private void comportamientoExtraB() {
        System.out.println("-> [Decorador B]: Alerta! Preparando entorno antes de operación B.");
    }
}
