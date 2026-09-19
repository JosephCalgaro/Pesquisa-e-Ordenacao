package Model;
import java.util.ArrayList;
import java.util.List;

public class Ordenacao {
    public static List<Aluno> ordenar(List<Aluno> lista){
        if(lista.size() <= 1){
            return lista;
        }
        int meio = lista.size() / 2;
        List<Aluno> esq = ordenar(new ArrayList<>(lista.subList(0, meio)));
        List<Aluno> dir = ordenar(new ArrayList<>(lista.subList(meio, lista.size())));
        return merge(esq, dir);
    }

    private static List<Aluno> merge(List<Aluno> esq, List<Aluno> dir) {
        List<Aluno> res = new ArrayList<>();
        int i = 0, j = 0;
        while (i < esq.size() && j < dir.size()) {
            if (esq.get(i).getChave().compareTo(dir.get(j).getChave()) <= 0) res.add(esq.get(i++));
            else res.add(dir.get(j++));
        }
        while (i < esq.size()) res.add(esq.get(i++));
        while (j < dir.size()) res.add(dir.get(j++));
        return res;
    }
}
