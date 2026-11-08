// PaqueteMensaje.java
public class PaqueteMensaje {
    public String contenido;
    public String destinatario;
    public boolean enviaSMS;
    public boolean enviaEmail;
    public boolean enviaPush;

    public PaqueteMensaje(String contenido, String destinatario) {
        this.contenido = contenido;
        this.destinatario = destinatario;
        this.enviaSMS = false;
        this.enviaEmail = false;
        this.enviaPush = false;
    }
}
