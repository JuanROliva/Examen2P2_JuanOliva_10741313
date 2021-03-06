package exameniip2_juanoliva_10741313;

import java.io.Serializable;
import java.util.Random;

public class Carro_Ataque extends Carro implements Serializable{
    private float extraAtaque;
    private Random aleatorio = new Random();

    public static final long SerialVersionUID = 3l;
    
    public Carro_Ataque() {
        super();
    }

    public Carro_Ataque(int velocidad, float porcentajeDerrape, String nombre, int ataque, int vida) {
        super(velocidad, porcentajeDerrape, nombre, ataque, vida);
    }
    
    public void extraAtaque(){
        extraAtaque = .50F + (aleatorio.nextInt(50)/100);
        super.setAtaque((int) (super.getAtaque()*extraAtaque));
    }
}
