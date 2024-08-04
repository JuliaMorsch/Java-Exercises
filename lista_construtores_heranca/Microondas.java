package lista_construtores_heranca;

public class Microondas extends Eletrodomestico {
    
    private double litros;
    
    public Microondas(String modelo, String fabricante, double litros) {
        super(modelo, fabricante);
        this.litros = litros;
    }

    public Microondas() {
    }

}
