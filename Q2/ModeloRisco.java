package br.com.empresa.investimentos.risco;

public interface ModeloRisco {
    String nome();
    double calcularPontuacao(DadosCliente dados);
}
