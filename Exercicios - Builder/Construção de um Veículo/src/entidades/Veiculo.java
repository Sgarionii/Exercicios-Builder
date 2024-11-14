package entidades;

public class Veiculo {

    private String tipo = "";
    private String cor = "";
    private int quantidadeRoda = 0;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setQuantidadeRoda(int quantidadeRoda) {
        this.quantidadeRoda = quantidadeRoda;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + " " +
                "Cor: " + cor + " " +
                "Quantidade de rodas: " + quantidadeRoda;
    }

}
