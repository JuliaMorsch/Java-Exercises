package lista_construtores_heranca;

public class Eletrodomestico {
    
    private String modelo;
    private String fabricante;
    private double consumoEnergia;
   
    public Eletrodomestico(String modelo, String fabricante, double consumoEnergia) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.consumoEnergia = consumoEnergia;
    }

    public Eletrodomestico() {
    }

    
}
