package br.com.empresa.investimentos.risco;

public class AplicacaoAnaliseRisco {
    public static void main(String[] args) {
        DadosCliente cliente = new DadosCliente(
                32,
                350000.0,
                15000.0,
                40.0,
                15
        );

        FabricaModelosRisco fabrica = new FabricaModelosRisco();

        ModeloRisco modeloAgressivo = fabrica.criar(TipoModeloRisco.AGRESSIVO);
        ModeloRisco modeloModerado = fabrica.criar(TipoModeloRisco.MODERADO);
        ModeloRisco modeloConservador = fabrica.criar(TipoModeloRisco.CONSERVADOR);

        CalculadoraPerfilRisco calculadora = new CalculadoraPerfilRisco(modeloModerado);

        double pontuacaoModerado = calculadora.calcularPontuacao(cliente);
        System.out.println("Modelo atual: " + calculadora.modeloAtual() + " -> pontuação: " + pontuacaoModerado);

        calculadora.definirModelo(modeloAgressivo);
        double pontuacaoAgressivo = calculadora.calcularPontuacao(cliente);
        System.out.println("Modelo atual: " + calculadora.modeloAtual() + " -> pontuação: " + pontuacaoAgressivo);

        calculadora.definirModelo(modeloConservador);
        double pontuacaoConservador = calculadora.calcularPontuacao(cliente);
        System.out.println("Modelo atual: " + calculadora.modeloAtual() + " -> pontuação: " + pontuacaoConservador);
    }
}
