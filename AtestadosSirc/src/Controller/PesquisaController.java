package Controller;

import Model.*;
import View.PesquisaView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PesquisaController {
    private static final String PASTA = "AtestadosSirc/src/Listas/";
    private static final String[] ARQUIVOS = {
            "1_lista_inscricao.csv", "2_lista_1.csv", "3_lista_2.csv", "4_lista_3.csv", "5_lista_4.csv"
    };
    private final PesquisaView view = new PesquisaView();

    public void executar() {
        try {
            // 1. Ler e ordenar as 5 listas
            List<List<Aluno>> listas = new ArrayList<>();
            for (int i = 0; i < ARQUIVOS.length; i++) {
                List<Aluno> ordenada = Ordenacao.ordenar(CsvReader.ler(PASTA + ARQUIVOS[i]));
                listas.add(ordenada);
                view.exibirLista("Lista " + (i + 1), ordenada);
            }

            // 2. Pesquisar cada inscrito nas listas 2 a 5
            List<Aluno> inscricao = listas.get(0);
            int comAtestado = 0;
            for (Aluno a : inscricao) {
                boolean[] achou = new boolean[4];
                for (int i = 0; i < 4; i++) {
                    achou[i] = Pesquisa.contem(listas.get(i + 1), a.getChave());
                }
                boolean algum = achou[0] || achou[1] || achou[2] || achou[3];
                if (algum) { a.setAtestado(true); comAtestado++; }

                view.exibirResultado(new ResultadoComparacao(a, achou[0], achou[1], achou[2], achou[3]));
            }
            view.exibirResumo(inscricao.size(), comAtestado);

        } catch (IOException e) {
            view.exibirErro("não foi possível ler os arquivos: " + e.getMessage());
        }
    }
}
