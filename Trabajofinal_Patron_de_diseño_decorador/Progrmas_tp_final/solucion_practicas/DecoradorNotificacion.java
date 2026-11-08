// DecoradorNotificacion.java
public abstract class DecoradorNotificacion implements Notificacion {
    protected Notificacion notificacionEnvuelta;

    public DecoradorNotificacion(Notificacion notificacion) {
        this.notificacionEnvuelta = notificacion;
    }

    @Override
    public void procesarYEnviar(PaqueteMensaje paquete) {
        notificacionEnvuelta.procesarYEnviar(paquete);
    }
}

