package br.com.empresa.investimentos.risco;

public class ModeloRiscoAgressivo implements ModeloRisco {
    @Override
    public String nome() {
        return "AGRESSIVO";
    }

    @Override
    public double calcularPontuacao(DadosCliente dados) {
        double base = 100;
        base += (30 - Math.min(dados.getIdade(), 60)) * 1.2;
        base += dados.getHorizonteAnos() * 2.0;
        base += dados.getPercentualRendaEmRendaVariavel() * 0.5;
        return base;
    }
}
