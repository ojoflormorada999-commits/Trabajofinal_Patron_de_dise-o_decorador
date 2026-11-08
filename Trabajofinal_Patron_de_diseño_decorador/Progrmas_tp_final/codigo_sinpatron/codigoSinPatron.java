public // 1. Clase Base
public class Espada {
    public int calcularDanio() {
        return 15; // Daño físico base
    }
    public String getDescripcion() {
        return "Espada Básica";
    }
}

// 2. Subclases de efectos individuales
public class EspadaFuego extends Espada {
    @Override
    public int calcularDanio() {
        return super.calcularDanio() + 5;
    }
    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Fuego";
    }
}

public class EspadaHielo extends Espada {
    @Override
    public int calcularDanio() {
        return super.calcularDanio() + 3;
    }
    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Hielo";
    }
}

// 3. Inicio de la explosión de clases por combinación
public class EspadaFuegoYHielo extends Espada {
    @Override
    public int calcularDanio() {
        return super.calcularDanio() + 5 + 3; // Código duplicado/Hardcodeado
    }
    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Fuego + Hielo";
    }
}
 {
    
}
