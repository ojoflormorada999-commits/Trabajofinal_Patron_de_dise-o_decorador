// Personaje.java
public interface Personaje {
    String getNombre();
    int getVidaActual();
    void curar(int cantidad);
    
    // Flujo Ofensivo: muta el paquete de daño entrante
    ResultadoAtaque calcularAtaque(ResultadoAtaque ataqueActual);
    
    // Flujo Defensivo: reduce el daño entrante antes de restar vida
    double mitigarDaño(double dañoEntrante, TipoAtaque tipo);
}
