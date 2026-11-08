// GuerreroBase.java
public class GuerreroBase implements Personaje {
    private String nombre;
    private int vidaActual;

    public GuerreroBase(String nombre, int vidaMaxima) {
        this.nombre = nombre;
        this.vidaActual = vidaMaxima;
    }

    @Override public String getNombre() { return this.nombre; }
    @Override public int getVidaActual() { return this.vidaActual; }
    
    @Override 
    public void curar(int cantidad) { 
        this.vidaActual += cantidad; 
        System.out.println("-> [SISTEMA] " + nombre + " se cura " + cantidad + " HP. Vida actual: " + vidaActual);
    }

    @Override
    public ResultadoAtaque calcularAtaque(ResultadoAtaque ataqueActual) {
        // Fin de la cadena ofensiva: retorna el paquete físico inicial sin mutaciones elementales
        return ataqueActual; 
    }

    @Override
    public double mitigarDaño(double dañoEntrante, TipoAtaque tipo) {
        // Fin de la cadena defensiva: mitigación por defecto del personaje desnudo
        if (tipo == TipoAtaque.FISICO) {
            return Math.max(0, dañoEntrante - 5); // Reducción mínima por armadura natural
        }
        return dañoEntrante; // El daño elemental pasa directo si no hay equipo mágico
    }
}
