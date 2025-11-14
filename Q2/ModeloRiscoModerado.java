package br.com.empresa.investimentos.risco;

public class ModeloRiscoModerado implements ModeloRisco {
    @Override
    public String nome() {
        return "MODERADO";
    }

    @Override
    public double calcularPontuacao(DadosCliente dados) {
        double base = 70;
        base += (50 - Math.min(dados.getIdade(), 70)) * 0.8;
        base += dados.getHorizonteAnos() * 1.0;
        base += dados.getPercentualRendaEmRendaVariavel() * 0.3;
        return base;
    }
}
