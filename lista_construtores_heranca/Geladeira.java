package lista_construtores_heranca;

public class Geladeira extends Eletrodomestico {

    private double litros;
   
    public Geladeira(String modelo, String fabricante, double litros) {
        super(modelo, fabricante);
        this.litros = litros;
    }

    public Geladeira() {
    }
    
}