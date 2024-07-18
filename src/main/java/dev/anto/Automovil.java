package dev.anto;

public class Automovil {
    String marca;
    int modelo;
    int motor;
    enum tipoCom {Gasolina, Bioetanol, Diesel, Biodiesel, Gasnatural};
    tipoCom tipoCombustible;
    enum tipoA {Cuidad, Subcompacto, Compacto, Familiar, Ejecutivo, SUV};
    tipoA tipoAutomovil;
    int numeroPuertas;
    int cantidadAsientos;
    int velocidadMaxima;
    enum tipoColor {Blanco, Negro, Rojo, Naranja, Amarillo, Verde, Azul, Violeta};
    tipoColor color;
    int velocidadActual = 0;
    boolean esAutomatico;  // New attribute

    public Automovil(String marca, int modelo, int motor, tipoCom tipoCombustible, tipoA tipoAutomovil,
            int numeroPuertas, int cantidadAsientos, int velocidadMaxima, tipoColor color, int velocidadActual, boolean esAutomatico) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = velocidadActual;
        this.esAutomatico = esAutomatico;  // Initialize the new attribute
    }
    
    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public int getMotor() {
        return motor;
    }

    public tipoCom getTipoCombustible() {
        return tipoCombustible;
    }

    public tipoA getTipoAutomovil() {
        return tipoAutomovil;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public tipoColor getColor() {
        return color;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public boolean isEsAutomatico() {
        return esAutomatico;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public void setTipoAutomovil(tipoA tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void setColor(tipoColor color) {
        this.color = color;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public void setEsAutomatico(boolean esAutomatico) {
        this.esAutomatico = esAutomatico;
    }

    public void acelerar(int incrementoVelocidad) {
        if (velocidadActual + incrementoVelocidad < velocidadMaxima) {
            velocidadActual = velocidadActual + incrementoVelocidad;
        } else {
            System.out.println("No se puede incrementar una velocidad superior a la máxima del automóvil");
        }
    }

    public void desacelerar(int decrementoVelocidad) {
        if (velocidadActual - decrementoVelocidad > 0) {
            velocidadActual = velocidadActual - decrementoVelocidad;
        } else {
            System.out.println("No se puede decrementar una velocidad inferior a cero");
        }
    }

    public void frenar() {
        velocidadActual = 0;
    }

    public double calcularTiempoLlegada(int distancia) {
        return distancia/velocidadActual;
    }

    public void imprimir() {
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor);
        System.out.println("Tipo de combustible = " + tipoCombustible);
        System.out.println("Tipo de automóvil = " + tipoAutomovil);
        System.out.println("Número de puertas = " + numeroPuertas);
        System.out.println("Cantidad de asientos = " + cantidadAsientos);
        System.out.println("Velocidad máxima = " + velocidadMaxima);
        System.out.println("Color = " + color);
        System.out.println("Es automático = " + (esAutomatico ? "Sí" : "No"));
}
}

