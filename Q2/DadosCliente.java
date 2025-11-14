package br.com.empresa.investimentos.risco;

public class DadosCliente {
    private final int idade;
    private final double patrimonioTotal;
    private final double rendaMensal;
    private final double percentualRendaEmRendaVariavel;
    private final int horizonteAnos;

    public DadosCliente(int idade, double patrimonioTotal, double rendaMensal, double percentualRendaEmRendaVariavel, int horizonteAnos) {
        this.idade = idade;
        this.patrimonioTotal = patrimonioTotal;
        this.rendaMensal = rendaMensal;
        this.percentualRendaEmRendaVariavel = percentualRendaEmRendaVariavel;
        this.horizonteAnos = horizonteAnos;
    }

    public int getIdade() {
        return idade;
    }

    public double getPatrimonioTotal() {
        return patrimonioTotal;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public double getPercentualRendaEmRendaVariavel() {
        return percentualRendaEmRendaVariavel;
    }

    public int getHorizonteAnos() {
        return horizonteAnos;
    }
}
