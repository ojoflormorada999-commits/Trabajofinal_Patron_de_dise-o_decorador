// DecoradorCanal.java
public abstract class DecoradorCanal extends DecoradorNotificacion {
    public DecoradorCanal(Notificacion notificacion) {
        super(notificacion);
    }
}

// DecoradorFormato.java
abstract class DecoradorFormato extends DecoradorNotificacion {
    public DecoradorFormato(Notificacion notificacion) {
        super(notificacion);
    }
}

// DecoradorSeguridad.java
abstract class DecoradorSeguridad extends DecoradorNotificacion {
    public DecoradorSeguridad(Notificacion notificacion) {
        super(notificacion);
    }
}

