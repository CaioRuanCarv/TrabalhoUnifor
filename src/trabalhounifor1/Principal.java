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

         Moto moto = new Moto( marca: "Honda", modelo: "Fan 160", cor: "Vermelha", ano: 2023, combustivel "Do tipo flex: Gasolina e alcool");
              
        system.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("cor: " + moto.getCor()):
        System.out.println("Ano: " + moto.getAno());
        System.out.println("Combustível: " + moto.getCombustivel());


        moto.ligar();
        moto.acelerar();
        moto.freiar();
        moto.desligar();



    }
    
}
