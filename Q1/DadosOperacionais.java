package br.com.empresa.logistica.relatorios;

import java.time.LocalDate;
import java.util.List;

public class DadosOperacionais {
    private final LocalDate dataReferencia;
    private final List<String> ocorrencias;
    private final int quantidadeEntregas;
    private final double percentualAtrasos;

    public DadosOperacionais(LocalDate dataReferencia, List<String> ocorrencias, int quantidadeEntregas, double percentualAtrasos) {
        this.dataReferencia = dataReferencia;
        this.ocorrencias = ocorrencias;
        this.quantidadeEntregas = quantidadeEntregas;
        this.percentualAtrasos = percentualAtrasos;
    }

    public LocalDate getDataReferencia() {
        return dataReferencia;
    }

    public List<String> getOcorrencias() {
        return ocorrencias;
    }

    public int getQuantidadeEntregas() {
        return quantidadeEntregas;
    }

    public double getPercentualAtrasos() {
        return percentualAtrasos;
    }
}
