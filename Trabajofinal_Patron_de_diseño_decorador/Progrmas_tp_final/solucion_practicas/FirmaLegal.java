// FirmaLegal.java
public class FirmaLegal extends DecoradorFormato {
    public FirmaLegal(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void procesarYEnviar(PaqueteMensaje paquete) {
        // Modifica el contenido ANTES de pasarlo a la siguiente capa
        paquete.contenido += "\n[TÉRMINOS Y CONDICIONES: Este mensaje es confidencial y está regulado por normativas financieras vigentes.]";
        super.procesarYEnviar(paquete);
    }
}

