// EnvioSMS.java
public class EnvioSMS extends DecoradorCanal {
    public EnvioSMS(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void procesarYEnviar(PaqueteMensaje paquete) {
        super.procesarYEnviar(paquete); // Llama primero a la capa interna
        paquete.enviaSMS = true;
        System.out.println("[SMS] Despachando mensaje de texto a las antenas móviles...");
    }
}

