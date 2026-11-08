// DecoradorEquipamiento.java
public abstract class DecoradorEquipamiento implements Personaje {
    protected Personaje personajeEnvuelto;

    public DecoradorEquipamiento(Personaje personaje) {
        this.personajeEnvuelto = personaje;
    }

    @Override public String getNombre() { return personajeEnvuelto.getNombre(); }
    @Override public int getVidaActual() { return personajeEnvuelto.getVidaActual(); }
    @Override public void curar(int cantidad) { personajeEnvuelto.curar(cantidad); }
    
    @Override
    public ResultadoAtaque calcularAtaque(ResultadoAtaque ataqueActual) {
        // Delega la llamada de ataque hacia la capa interior
        return personajeEnvuelto.calcularAtaque(ataqueActual);
    }
    
    @Override
    public double mitigarDaño(double dañoEntrante, TipoAtaque tipo) {
        // Delega la llamada de defensa hacia la capa interior
        return personajeEnvuelto.mitigarDaño(dañoEntrante, tipo);
    }
}
