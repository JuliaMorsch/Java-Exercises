package lista_construtores_heranca;

public class Geladeira {
    private String modelo;
    private String fabricante;
    private double litros;
   
    public Geladeira(String modelo, String fabricante, double litros) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.litros = litros;
    }

    public Geladeira() {
    }
    
}