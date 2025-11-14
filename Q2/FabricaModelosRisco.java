package br.com.empresa.investimentos.risco;

public class FabricaModelosRisco {
    public ModeloRisco criar(TipoModeloRisco tipo) {
        return switch (tipo) {
            case AGRESSIVO -> new ModeloRiscoAgressivo();
            case MODERADO -> new ModeloRiscoModerado();
            case CONSERVADOR -> new ModeloRiscoConservador();
        };
    }
}
