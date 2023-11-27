package trabalhounifor1;
public class Principal {
    public static void main(String[] args) {
        Concessionaria concessionaria = new Concessionaria(true);
        Carro carro = new Carro("Carro A");
        Moto moto = new Moto("Moto B");
        CarroEsportivo carroEsportivo = new CarroEsportivo("Carro Esportivo C");

        Pessoa<Veiculo> pessoa1 = new Pessoa<>("Roberta");
        Pessoa<Veiculo> pessoa2 = new Pessoa<>("Mateus");
        Pessoa<Veiculo> pessoa3 = new Pessoa<>("Marcos");

        pessoa1.comprarVeiculo(concessionaria, carro);
        pessoa2.comprarVeiculo(concessionaria, carroEsportivo); 
        pessoa3.comprarVeiculo(concessionaria, moto);
        System.out.println(pessoa1.getVeiculoComprado().getModelo()); 
        System.out.println(pessoa2.getVeiculoComprado().getModelo()); 
        System.out.println(pessoa3.getVeiculoComprado().getModelo()); 
    }
    
}
