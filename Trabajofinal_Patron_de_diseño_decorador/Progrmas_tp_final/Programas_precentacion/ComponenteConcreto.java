// Archivo: ComponenteConcreto.java
public class ComponenteConcreto implements InterfaceComponente {
    private String estadoInterno;

    // Constructor que recibe el valor inicial
    public ComponenteConcreto(String valor) {
        this.estadoInterno = valor;
    }

    @Override
    public void operacionA() {
        System.out.println("ComponenteConcreto: Ejecutando operacionA. Estado = " + estadoInterno);
    }

    @Override
    public void operacionB() {
        System.out.println("ComponenteConcreto: Ejecutando operacionB.");
    }
}
    

