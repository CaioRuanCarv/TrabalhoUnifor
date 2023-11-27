
package trabalhounifor1;
class Pessoa<T extends Veiculo> {
    private String nome;
    private Concessionaria concessionaria;
    private T veiculoComprado;

    public Pessoa(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Concessionaria getConcessionaria() {
        return concessionaria;
    }

    public void setConcessionaria(Concessionaria concessionaria) {
        this.concessionaria = concessionaria;
    }

    public T getVeiculoComprado() {
        return veiculoComprado;
    }

    public void setVeiculoComprado(T veiculoComprado) {
        this.veiculoComprado = veiculoComprado;
    }
    
    public void comprarVeiculo(Concessionaria concessionaria, T veiculo) {
        if (concessionaria.isAberto()) {
            System.out.println(nome + " comprou um veículo na concessionária.");
            veiculoComprado = veiculo;
        } else {
            System.out.println("Desculpe, a concessionária está fechada. " + nome + " não pode comprar um veículo agora.");
        }
    }
}
