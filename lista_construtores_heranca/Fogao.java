package lista_construtores_heranca;

public class Fogao extends Eletrodomestico{
 
    private int bocas;
    
    public Fogao(String modelo, String fabricante, double consumoEnergia, int bocas) {
        super(modelo, fabricante, consumoEnergia);
        this.bocas = bocas;
    }

    public Fogao() {
    }

}
