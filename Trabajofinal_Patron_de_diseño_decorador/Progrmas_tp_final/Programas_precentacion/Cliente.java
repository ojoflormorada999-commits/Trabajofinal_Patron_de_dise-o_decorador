// Archivo: Cliente.java
public class Cliente {
    public static void main(String[] args) {
        
        System.out.println("--- 1. OBJETO BASE SIMPLE ---");
        InterfaceComponente componenteSimple = new ComponenteConcreto("ConfiguraciónInicial");
        componenteSimple.operacionA();
        componenteSimple.operacionB();

        System.out.println("\n--- 2. OBJETO CON DECORADOR A ---");
        // Envolvemos el objeto simple dentro del Decorador A
        InterfaceComponente conDecoradorA = new DecoradorConcretoA(componenteSimple);
        conDecoradorA.operacionA(); // Ejecutará la base + el extra de A

        System.out.println("\n--- 3. OBJETO TOTALMENTE DECORADO (A + B) ---");
        // Envolvemos el objeto ya decorado dentro del Decorador B
        InterfaceComponente completamenteDecorado = new DecoradorConcretoB(conDecoradorA);
        
        // Ejecuta todo el flujo acumulado
        completamenteDecorado.operacionA(); 
        completamenteDecorado.operacionB(); 
    }
}
