package br.com.empresa.logistica.relatorios;

import java.util.EnumMap;
import java.util.Map;

public class FabricaRelatorios {
    private final Map<TipoRelatorio, CriadorRelatorio> criadores = new EnumMap<>(TipoRelatorio.class);

    public FabricaRelatorios() {
        registrar(TipoRelatorio.DIARIO, new CriadorRelatorioDiario());
        registrar(TipoRelatorio.EMERGENCIAL, new CriadorRelatorioEmergencial());
    }

    public void registrar(TipoRelatorio tipo, CriadorRelatorio criador) {
        criadores.put(tipo, criador);
    }

    public String gerar(TipoRelatorio tipo, DadosOperacionais dados) {
        CriadorRelatorio criador = criadores.get(tipo);
        if (criador == null) {
            throw new IllegalArgumentException("Tipo de relatório não suportado: " + tipo);
        }
        return criador.gerarRelatorio(dados);
    }
}
