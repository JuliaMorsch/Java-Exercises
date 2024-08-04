package lista_construtores_heranca;

public class LavaRoupa extends Eletrodomestico{

    private double quilos;
    
    public LavaRoupa(String modelo, String fabricante, double quilos) {
        super(modelo, fabricante);
        this.quilos = quilos;
    }

    public LavaRoupa() {
    }

    
}
