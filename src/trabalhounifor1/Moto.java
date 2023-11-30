package trabalhounifor1;
   class Moto extends Veiculo{

    private String marca;
    private String modelo;
    private String cor;
    private String combustivel;
    private int ano;

    public Moto (String marca, String modelo, String cor, int ano, String combustivel) {
        super(modelo); 
        this.marca = marca;
        this.cor = cor;
        this.combustivel = combustivel;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getCor() {
        return cor;
    }
    public int getAno() {
        return ano;
    }
    public String getCombustivel() {
        return combustivel;
    }


    public void ligar() {
        System.out.println("A moto está ligada.");
    }

    public void acelerar() {
        System.out.println("A moto está acelerando.");
    }

    public void freiar() {
        System.out.println("A moto está freando.");
    }

    public void desligar() {
        System.out.println("A moto está desligada.");
    }
}