package br.com.empresa.logistica.relatorios;

public abstract class CriadorRelatorio {
    public String gerarRelatorio(DadosOperacionais dados) {
        Relatorio relatorio = criarRelatorio(dados);
        return relatorio.gerar();
    }

    protected abstract Relatorio criarRelatorio(DadosOperacionais dados);
}
