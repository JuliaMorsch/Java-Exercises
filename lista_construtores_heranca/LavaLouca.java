package lista_construtores_heranca;

public class LavaLouca extends Eletrodomestico{
    
    private double litros;
    
    public LavaLouca(String modelo, String fabricante, double litros) {
        super(modelo, fabricante);
        this.litros = litros;
    }

    public LavaLouca() {
    }

}
