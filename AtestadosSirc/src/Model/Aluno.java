package Model;

public class Aluno {
    String nome;
    String cpf;
    String dataInscricao;


    public Aluno(String nome, String cpf, String dataInscricao) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataInscricao = dataInscricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(String dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    @Override
    public String toString() {
        return nome + " " + cpf + " " + dataInscricao;
    }
}
