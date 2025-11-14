package br.com.empresa.logistica.relatorios;

import java.time.format.DateTimeFormatter;

public class RelatorioEmergencial implements Relatorio {
    private final DadosOperacionais dados;

    public RelatorioEmergencial(DadosOperacionais dados) {
        this.dados = dados;
    }

    @Override
    public String gerar() {
        StringBuilder sb = new StringBuilder();
        sb.append("RELATÓRIO EMERGENCIAL DE RISCO OPERACIONAL");
        sb.append("Data/Evento: ")
          .append(dados.getDataReferencia().format(DateTimeFormatter.ISO_DATE))
          .append("\n\n");
        sb.append("Resumo rápido:\n");
        sb.append(" - Entregas no período: ")
          .append(dados.getQuantidadeEntregas())
          .append("\n");
        sb.append(" - Atrasos: ")
          .append(String.format("%.2f%%", dados.getPercentualAtrasos()))
          .append("\n\n");
        sb.append("Ocorrências críticas:\n");
        dados.getOcorrencias().stream()
                .filter(o -> o.toLowerCase().contains("atraso")
                          || o.toLowerCase().contains("falha")
                          || o.toLowerCase().contains("risco"))
                .forEach(o -> sb.append(" * ").append(o.toUpperCase()).append("\n"));
        return sb.toString();
    }
}
