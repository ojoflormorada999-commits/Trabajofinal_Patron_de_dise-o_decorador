// ArmaduraPlacas.java
public class ArmaduraPlacas extends DecoradorArmadura {
    private int armaduraFisica;

    public ArmaduraPlacas(Personaje personaje) {
        super(personaje);
        this.armaduraFisica = 25; // Aporte de protección estática
    }

    @Override
    public double mitigarDaño(double dañoEntrante, TipoAtaque tipo) {
        // Intercepta solo si el impacto enemigo es de tipo físico
        if (tipo == TipoAtaque.FISICO) {
            double dañoReducido = Math.max(0, dañoEntrante - this.armaduraFisica);
            System.out.println("[Armadura de Placas]: Absorbiendo " + this.armaduraFisica + " de daño físico.");
            // Propaga el daño ya reducido hacia la capa interior
            return super.mitigarDaño(dañoReducido, tipo);
        }
        
        // Si es daño elemental o de estado, pasa directo a la siguiente capa
        return super.mitigarDaño(dañoEntrante, tipo);
    }
}
