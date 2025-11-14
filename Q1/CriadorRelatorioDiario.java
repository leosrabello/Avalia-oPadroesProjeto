package br.com.empresa.logistica.relatorios;

public class CriadorRelatorioDiario extends CriadorRelatorio {
    @Override
    protected Relatorio criarRelatorio(DadosOperacionais dados) {
        return new RelatorioDiario(dados);
    }
}
