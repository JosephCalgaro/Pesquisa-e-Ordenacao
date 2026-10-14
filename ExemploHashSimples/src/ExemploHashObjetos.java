import java.util.HashSet;
import java.util.Objects;

class Aluno{
    int matricula;
    String nome;

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }
}

public class ExemploHashObjetos {
    public static void main(String[] args) {
        HashSet<Aluno> tabelaHashAluno = new HashSet<>();

        tabelaHashAluno.add(new Aluno(1,"alexandre"));
        tabelaHashAluno.add(new Aluno(2,"Hermes"));
        tabelaHashAluno.add(new Aluno(1,"alexandre"));
        tabelaHashAluno.add(new Aluno(2,"davi"));

        for (Aluno a : tabelaHashAluno){
            System.out.println(a);
        }
    }
}
