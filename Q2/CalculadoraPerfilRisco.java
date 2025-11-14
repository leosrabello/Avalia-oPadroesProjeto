package br.com.empresa.investimentos.risco;

public class CalculadoraPerfilRisco {
    private ModeloRisco modeloRiscoAtual;

    public CalculadoraPerfilRisco(ModeloRisco modeloInicial) {
        this.modeloRiscoAtual = modeloInicial;
    }

    public void definirModelo(ModeloRisco modelo) {
        this.modeloRiscoAtual = modelo;
    }

    public double calcularPontuacao(DadosCliente dados) {
        if (modeloRiscoAtual == null) {
            throw new IllegalStateException("Nenhum modelo de risco definido.");
        }
        return modeloRiscoAtual.calcularPontuacao(dados);
    }

    public String modeloAtual() {
        return modeloRiscoAtual != null ? modeloRiscoAtual.nome() : "";
    }
}
