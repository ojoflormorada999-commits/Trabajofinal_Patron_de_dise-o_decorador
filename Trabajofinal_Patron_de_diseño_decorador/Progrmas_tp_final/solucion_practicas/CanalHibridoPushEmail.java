// CanalHibridoPushEmail.java
public class CanalHibridoPushEmail extends DecoradorSeguridad {
    public CanalHibridoPushEmail(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void procesarYEnviar(PaqueteMensaje paquete) {
        super.procesarYEnviar(paquete);
        paquete.enviaPush = true;
        paquete.enviaEmail = true;
        System.out.println("[PUSH - Firebase] Enviando notificación en tiempo real a la app móvil...");
        System.out.println("[EMAIL - SMTP] Despachando correo electrónico certificado...");
    }
}

