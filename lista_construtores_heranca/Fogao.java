package lista_construtores_heranca;

public class Fogao {
 
    private String modelo;
    private String fabricante;
    private int bocas;
    
    public Fogao(String modelo, String fabricante, int bocas) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.bocas = bocas;
    }

    public Fogao() {
    }

}
