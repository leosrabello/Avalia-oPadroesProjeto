package br.com.empresa.logistica.relatorios;

public class CriadorRelatorioEmergencial extends CriadorRelatorio {
    @Override
    protected Relatorio criarRelatorio(DadosOperacionais dados) {
        return new RelatorioEmergencial(dados);
    }
}
