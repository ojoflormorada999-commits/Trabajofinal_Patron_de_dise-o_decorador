// Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("=== CONFIGURACIÓN DEL PERSONAJE ===");
        
        // 1. Instanciamos nuestro componente concreto (Héroe Base)
        Personaje heroe = new GuerreroBase("Arthas", 500);
        System.out.println("Se ha creado a " + heroe.getNombre() + " con " + heroe.getVidaActual() + " HP.");

        // 2. Equipamos las ranuras de inventario de forma dinámica mediante envolturas
        heroe = new FiloIneo(heroe);            // Ranura Arma
        heroe = new ArmaduraPlacas(heroe);      // Ranura Armadura
        heroe = new AnilloFuegoYPlacas(heroe);  // Ranura Accesorio (Híbrido)
        
        System.out.println("\n=== SIMULACIÓN DE FLUJO OFENSIVO (CALCULAR ATAQUE) ===");
        // Inicializamos un paquete de ataque físico base con 50 puntos
        ResultadoAtaque reporteEnvio = new ResultadoAtaque(50);
        
        // Ejecutamos la llamada polimórfica que recorrerá todas las capas
        ResultadoAtaque golpeFinal = heroe.calcularAtaque(reporteEnvio);
        
        // Imprimimos el reporte final acumulado consolidado por el patrón
        System.out.println("\n[REPORTE DE DAÑO EMITIDO]:");
        System.out.println("-> Daño Físico Neto: " + golpeFinal.dañoFisico);
        System.out.println("-> Daño Fuego Elemental: " + golpeFinal.dañoFuego);
        System.out.println("-> Daño Total Combinado: " + golpeFinal.getDañoTotal());
        System.out.println("-> ¿Aplica Estado Alterado (Quemadura)?: " + golpeFinal.aplicaQuemadura);

        System.out.println("\n=== SIMULACIÓN DE FLUJO DEFENSIVO (RECIBIR IMPACTO) ===");
        // Simulamos que una criatura enemiga nos asesta un golpe físico de 100 puntos
        double dañoImpactoEnemigo = 100.0;
        System.out.println("¡Alerta! Un monstruo te ataca con " + dañoImpactoEnemigo + " de Daño Físico.");
        
        // La llamada ingresa por la capa externa (Anillo) -> Placas -> GuerreroBase
        double dañoNetoSufriendo = heroe.mitigarDaño(dañoImpactoEnemigo, TipoAtaque.FISICO);
        
        System.out.println("\n[REPORTE DE MITIGACIÓN]:");
        System.out.println("-> Daño que superó las capas y golpeó la salud: " + dañoNetoSufriendo + " HP.");
    }
}
