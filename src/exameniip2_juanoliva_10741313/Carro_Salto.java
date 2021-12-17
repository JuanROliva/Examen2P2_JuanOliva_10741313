package exameniip2_juanoliva_10741313;

import java.io.Serializable;
import java.util.Random;

public class Carro_Salto extends Carro implements Serializable{
    private int cantidadSalto;
    private Random aleatorio = new Random();
    
    public static final long SerialVersionUID = 2l;

    public Carro_Salto() {
        super();
    }

    public Carro_Salto(int velocidad, float porcentajeDerrape, String nombre, int ataque, int vida) {
        super(velocidad, porcentajeDerrape, nombre, ataque, vida);
    }
    
    public int getCantidadSalto() {
        return cantidadSalto;
    }

    public void setCantidadSalto(int cantidadSalto) {
        this.cantidadSalto = cantidadSalto;
    }
    
    public void saltoAletorio(){
        cantidadSalto = 1+aleatorio.nextInt(50);
    }
}
