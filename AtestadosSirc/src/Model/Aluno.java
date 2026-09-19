package Model;

import java.text.Normalizer;

public class Aluno {
    String nome;
    String cpf;
    String dataInscricao;
    private boolean atestado = false;


    public Aluno(String nome, String cpf, String dataInscricao) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataInscricao = dataInscricao;
    }

    public boolean isAtestado() { return atestado; }

    public void setAtestado(boolean atestado) { this.atestado = atestado; }

    public String getChave() {
        return Normalizer.normalize(nome, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "").trim().toLowerCase();
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
