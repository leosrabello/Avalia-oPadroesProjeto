package br.com.empresa.logistica.relatorios;

import java.time.LocalDate;
import java.util.List;

public class AplicacaoRelatorios {
    public static void main(String[] args) {
        DadosOperacionais dados = new DadosOperacionais(
                LocalDate.now(),
                List.of("Atraso em rota 23", "Falha de comunicação", "Entrega antecipada"),
                158,
                12.5
        );

        FabricaRelatorios fabrica = new FabricaRelatorios();

        String r1 = fabrica.gerar(TipoRelatorio.DIARIO, dados);
        System.out.println(r1);

        System.out.println("--------------------------------------------------");

        String r2 = fabrica.gerar(TipoRelatorio.EMERGENCIAL, dados);
        System.out.println(r2);
    }
}
