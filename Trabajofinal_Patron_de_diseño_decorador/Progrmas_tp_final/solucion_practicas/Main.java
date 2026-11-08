// Main.java
public class Main {
    public static void main(String[] args) {
        // 1. Instanciamos la alerta base
        Notificacion alertaFraude = new AlertaBase();

        // 2. Envolvemos dinámicamente en el orden exacto solicitado
        alertaFraude = new FirmaLegal(alertaFraude);
        alertaFraude = new EnvioSMS(alertaFraude);
        alertaFraude = new CanalHibridoPushEmail(alertaFraude);

        // Creamos el paquete de datos del evento crítico
        PaqueteMensaje paquete = new PaqueteMensaje(
            "ALERTA DE SEGURIDAD: Transferencia sospechosa detectada por $250.000.",
            "carlos.gomez@fintech.com"
        );

        // 3. Ejecutamos desde la envoltura más externa
        System.out.println("=== INICIANDO DESPACHO DE ALERTA ===");
        alertaFraude.procesarYEnviar(paquete);

        // Verificamos cómo quedó mutado el paquete al finalizar
        System.out.println("\n=== ESTADO FINAL DEL PAQUETE ===");
        System.out.println("Destinatario: " + paquete.destinatario);
        System.out.println("Contenido final:\n" + paquete.contenido);
        System.out.println("Canales activados -> SMS: " + paquete.enviaSMS + 
                           " | Email: " + paquete.enviaEmail + 
                           " | Push: " + paquete.enviaPush);
    }
}
