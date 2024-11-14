import builders.VeiculoBuilder;
import entidades.Veiculo;

public class Main {
    public static void main(String[] args) {
        executarVeiculo();
    }

    public static void executarVeiculo() {
        Veiculo carro = new VeiculoBuilder().setTipo("Carro").setCor("Rosa").setQuantidadeRoda(4).build();
        Veiculo moto = new VeiculoBuilder().setTipo("Moto").setCor("Azul").setQuantidadeRoda(2).build();

        System.out.println(carro.toString());
        System.out.println(moto.toString());
    }
}