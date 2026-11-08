// AnilloFuegoYPlacas.java
public class AnilloFuegoYPlacas extends DecoradorAccesorio {
    private int bonoLlamas;
    private int bonoPlacas;

    public AnilloFuegoYPlacas(Personaje personaje) {
        super(personaje);
        this.bonoLlamas = 15;
        this.bonoPlacas = 2;
    }

    @Override
    public ResultadoAtaque calcularAtaque(ResultadoAtaque ataqueActual) {
        ResultadoAtaque ataque = super.calcularAtaque(ataqueActual);
        ataque.dañoFuego += this.bonoLlamas;
        System.out.println("[Anillo Místico]: El brillo rúnico añade +" + this.bonoLlamas + " de Daño de Fuego.");
        return ataque;
    }

    @Override
    public double mitigarDaño(double dañoEntrante, TipoAtaque tipo) {
        if (tipo == TipoAtaque.FISICO) {
            double dañoReducido = Math.max(0, dañoEntrante - this.bonoPlacas);
            System.out.println("[Anillo Místico]: Desviando pasivamente +" + this.bonoPlacas + " de daño físico.");
            return super.mitigarDaño(dañoReducido, tipo);
        }
        return super.mitigarDaño(dañoEntrante, tipo);
    }
}
