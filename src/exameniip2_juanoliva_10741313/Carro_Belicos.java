package exameniip2_juanoliva_10741313;

import java.util.Random;

public class Carro_Belicos extends Carro{ 
    
    private Random aleaotio = new Random();

    public Carro_Belicos() {
        super();
    }
    
    public void vidasAletorio(){
        super.setVida((1+aleaotio.nextInt(50))/100);
    }
    
}
