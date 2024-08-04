package lista_construtores_heranca;

public class Fogao extends Eletrodomestico{
 
    private int bocas;
    
    public Fogao(String modelo, String fabricante, int bocas) {
        super(modelo, fabricante);
        this.bocas = bocas;
    }

    public Fogao() {
    }

}
