// FiloIneo.java
public class FiloIneo extends DecoradorArma {
    public FiloIneo(Personaje personaje) {
        super(personaje);
    }

    @Override
    public ResultadoAtaque calcularAtaque(ResultadoAtaque ataqueActual) {
        // 1. Propaga la llamada hacia las capas más internas primero
        ResultadoAtaque ataque = super.calcularAtaque(ataqueActual);
        
        // 2. Inyecta su propio comportamiento ofensivo elemental
        ataque.dañoFuego += 35;
        ataque.aplicaQuemadura = true;
        System.out.println("[Efecto Filo Ígneo]: Las llamas envuelven el arma (+35 Daño Fuego, Aplica Quemadura).");
        
        return ataque;
    }
}
