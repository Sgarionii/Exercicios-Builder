import builder.RelatorioBuilder;
import entidades.Relatorio;

public class Main {
    public static void main(String[] args) {
        executarRelatorio();
    }

    public static void executarRelatorio() {
        Relatorio relatorioViagem = new RelatorioBuilder().setTitulo("Relatório de viagem").setCorpo("Fiz uma viagem para...").build();
        Relatorio relatorioEstudo = new RelatorioBuilder().setTitulo("Relatório de Estudos").setCorpo("Estou estudando para...").setRodape("Escrito por...").build();

        System.out.println(relatorioViagem.toString());
        System.out.println(relatorioEstudo.toString());
    }
}