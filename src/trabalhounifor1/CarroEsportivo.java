package trabalhounifor1;

public class CarroEsportivo extends Veiculo {

    private String marca;
    private int ano;
    private double preco;

    public CarroEsportivo(String modelo, String marca, int ano, double preco) {
        super(modelo);
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
    }


    public void fazerDrift() {
        System.out.println("Realizando drift com estilo!");
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
        System.out.println("Carro esportivo acelerando com potência!");
    }
}


