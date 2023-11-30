package trabalhounifor1;

public class Carro extends Veiculo {
    private String modelo;
    private String marca;
    private int ano;
    private double preco;

    public Carro(String modelo, String marca, int ano, double preco) {
        super(modelo);
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void acelerar() {
        System.out.println("Carro acelerando...");
    }

    public void freiar() {
        System.out.println("Carro freando!");
    }

    public void chamarMetodoDaMoto(Moto moto) {
        moto.ligar();
    }
}
