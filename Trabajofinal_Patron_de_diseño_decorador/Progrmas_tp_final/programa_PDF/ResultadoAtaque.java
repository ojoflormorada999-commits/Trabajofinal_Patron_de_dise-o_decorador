// ResultadoAtaque.java
public class ResultadoAtaque {
    public int dañoFisico;
    public int dañoFuego;
    public int dañoSangre;
    public boolean aplicaQuemadura;

    // Constructor inicial: un golpe siempre empieza con daño físico base
    public ResultadoAtaque(int dañoFisico) {
        this.dañoFisico = dañoFisico;
        this.dañoFuego = 0;
        this.dañoSangre = 0;
        this.aplicaQuemadura = false;
    }

    // Calcula de forma dinámica el impacto total sumando todos los elementos
    public int getDañoTotal() {
        return dañoFisico + dañoFuego + dañoSangre;
    }
}
