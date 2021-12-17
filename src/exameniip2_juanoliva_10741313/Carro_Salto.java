package exameniip2_juanoliva_10741313;

import java.util.Random;

public class Carro_Salto extends Carro{
    private int cantidadSalto;
    private Random aleatorio = new Random();

    public Carro_Salto() {
        super();
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
