package exameniip2_juanoliva_10741313;
public class Carro {
    private int velocidad;
    private float porcentajeDerrape;
    private String nombre;
    private int ataque;
    private int vida;

    public Carro() {
    }

    public Carro(int velocidad, float porcentajeDerrape, String nombre, int ataque, int vida) {
        this.velocidad = velocidad;
        this.porcentajeDerrape = porcentajeDerrape;
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public float getPorcentajeDerrape() {
        return porcentajeDerrape;
    }

    public void setPorcentajeDerrape(float porcentajeDerrape) {
        this.porcentajeDerrape = porcentajeDerrape;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
