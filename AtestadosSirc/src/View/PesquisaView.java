package View;

import Model.Aluno;
import Model.ResultadoComparacao;
import java.util.ArrayList;
import java.util.List;

public class PesquisaView {
    public void exibirLista(String titulo, List<Aluno> lista){
        System.out.println("=== " + titulo + " (ordenada) ===");
        for (Aluno a : lista) System.out.println(a.getNome());
        System.out.println();
    }

    public void exibirResultado(ResultadoComparacao r) {
        Aluno a = r.getaluno();
        List<Integer> listas = new ArrayList<>();
        if (r.isPresenteLista2()) listas.add(2);
        if (r.isPresenteLista3()) listas.add(3);
        if (r.isPresenteLista4()) listas.add(4);
        if (r.isPresenteLista5()) listas.add(5);

        String base = a.getNome() + " | CPF: " + a.getCpf();
        if (listas.isEmpty()) System.out.println(base + " -> não encontrado | atestado: " + a.isAtestado());
        else System.out.println(base + " -> apareceu na(s) lista(s) " + listas + " | atestado: " + a.isAtestado());
    }

    public void exibirResumo(int total, int comAtestado) {
        System.out.println("\nTotal de inscritos: " + total + " | com atestado: " + comAtestado);
    }

    public void exibirErro(String msg) { System.err.println("Erro: " + msg); }
}

