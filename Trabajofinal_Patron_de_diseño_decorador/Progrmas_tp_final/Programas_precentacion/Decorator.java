
 // Archivo: Decorator.java
public abstract class Decorator implements InterfaceComponente {
    // El rombo del diagrama: la referencia al objeto envuelto
    protected InterfaceComponente envoltorio;

    // Constructor que recibe el componente a decorar
    public Decorator(InterfaceComponente s) {
        this.envoltorio = s;
    }

    // Delegan el comportamiento por defecto al envoltorio
    @Override
    public void operacionA() {
        envoltorio.operacionA();
    }

    @Override
    public void operacionB() {
        envoltorio.operacionB();
    }
}
 
    

