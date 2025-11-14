package br.com.empresa.investimentos.risco;

public class ModeloRiscoConservador implements ModeloRisco {
    @Override
    public String nome() {
        return "CONSERVADOR";
    }

    @Override
    public double calcularPontuacao(DadosCliente dados) {
        double base = 40;
        base -= (dados.getIdade() - 40) * 0.5;
        base -= dados.getPercentualRendaEmRendaVariavel() * 0.4;
        base += Math.max(0, 10 - dados.getHorizonteAnos()) * 1.5;
        return base;
    }
}
