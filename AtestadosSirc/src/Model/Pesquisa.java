package Model;

import java.util.List;

public class Pesquisa {
    public static boolean contem(List<Aluno> ordenada, String chave) {
        int ini = 0, fim = ordenada.size() - 1;
        while (ini <= fim) {
            int meio = (ini + fim) / 2;
            int cmp = ordenada.get(meio).getChave().compareTo(chave);
            if (cmp == 0) return true;
            if (cmp < 0) ini = meio + 1;
            else fim = meio - 1;
        }
        return false;
    }
}