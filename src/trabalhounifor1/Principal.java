package trabalhounifor1;
public class Principal {
    public static void main(String[] args) {
        //Abri concessionaria
        Concessionaria concessionaria = new Concessionaria(true);
        Carro carro = new Carro("ModeloCarro", "MarcaCarro", 2022, 50000.00);
        Moto moto = new Moto( "Honda", "Fan 160", "Vermelha",  2023, "Do tipo flex: Gasolina e alcool");
        CarroEsportivo carroEsportivo = new CarroEsportivo("ModeloEsportivo", "MarcaEsportiva", 2023, 100000.00);

        //venda um
        Pessoa<Veiculo> pessoa1 = new Pessoa<>("Roberta");
        pessoa1.comprarVeiculo(concessionaria, carro);

        // Imprimindo informações do carro
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Preço: R$" + carro.getPreco());

        carro.acelerar();

        System.out.println(pessoa1.getVeiculoComprado().getModelo());

        //venda dois
        Pessoa<Veiculo> pessoa2 = new Pessoa<>("Mateus");
        System.out.println(pessoa2.getVeiculoComprado().getModelo());
        pessoa2.comprarVeiculo(concessionaria, moto);


        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("cor: " + moto.getCor());
        System.out.println("Ano: " + moto.getAno());
        System.out.println("Combustível: " + moto.getCombustivel());

        moto.ligar();
        moto.acelerar();
        moto.freiar();
        moto.desligar();


        //venda tres
        Pessoa<Veiculo> pessoa3 = new Pessoa<>("Marcos");
        pessoa2.comprarVeiculo(concessionaria, carroEsportivo);
        System.out.println(pessoa3.getVeiculoComprado().getModelo());


        // Chamando os métodos específicos do carro esportivo
        //meuCarroEsportivo.ativarTurbo();
        carroEsportivo.fazerDrift();
        carroEsportivo.acelerar();


    }
    
}
