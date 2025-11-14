package br.com.empresa.logistica.relatorios;

import java.time.format.DateTimeFormatter;

public class RelatorioDiario implements Relatorio {
    private final DadosOperacionais dados;

    public RelatorioDiario(DadosOperacionais dados) {
        this.dados = dados;
    }

    @Override
    public String gerar() {
        StringBuilder sb = new StringBuilder();
        sb.append("RELATÓRIO DIÁRIO DE OPERAÇÕES");
        sb.append("Data de referência: ")
          .append(dados.getDataReferencia().format(DateTimeFormatter.ISO_DATE))
          .append("\n\n");
        sb.append("Quantidade de entregas do dia: ")
          .append(dados.getQuantidadeEntregas())
          .append("\n");
        sb.append("Percentual de atrasos no dia: ")
          .append(String.format("%.2f%%", dados.getPercentualAtrasos()))
          .append("\n\n");
        sb.append("Ocorrências relevantes:\n");
        dados.getOcorrencias().forEach(o -> sb.append(" - ").append(o).append("\n"));
        return sb.toString();
    }
}
