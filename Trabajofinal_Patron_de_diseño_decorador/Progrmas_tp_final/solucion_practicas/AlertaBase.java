// AlertaBase.java
public class AlertaBase implements Notificacion {
    @Override
    public void procesarYEnviar(PaqueteMensaje paquete) {
        System.out.println("[LOG SISTEMA] Registrando alerta base para el usuario: " + paquete.destinatario);
    }
}

