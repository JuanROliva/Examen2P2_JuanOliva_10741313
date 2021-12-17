package exameniip2_juanoliva_10741313;

import java.io.Serializable;
import java.util.Random;

public class Carro_Malvado extends Carro implements Serializable{
    private Random aleatorio = new Random();
    
    public static final long SerialVersionUID = 4l;

    public Carro_Malvado() {
    }

    public Carro_Malvado(int velocidad, float porcentajeDerrape, String nombre, int ataque, int vida) {
        super(velocidad, porcentajeDerrape, nombre, ataque, vida);
    }
    
    public void setVidaEspecial(){
        super.setVida(1000+aleatorio.nextInt(5000));
    }
    
}
