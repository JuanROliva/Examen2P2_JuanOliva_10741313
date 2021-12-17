package exameniip2_juanoliva_10741313;

import java.io.Serializable;
import java.util.Random;

public class Carro_Belicos extends Carro implements Serializable{ 
    
    public static final long SerialVersionUID = 1l;
    
    private Random aleaotio = new Random();

    public Carro_Belicos() {
        super();
    }

    public Carro_Belicos(int velocidad, float porcentajeDerrape, String nombre, int ataque, int vida) {
        super(velocidad, porcentajeDerrape, nombre, ataque, vida);
    }
    
    public void vidasAletorio(){
        super.setVida((1+aleaotio.nextInt(50))/100);
    }
}
