package Model;

public class ResultadoComparacao {
    private Aluno aluno;
    private boolean pLista2, pLista3, pLista4, pLista5;

    public ResultadoComparacao(Aluno aluno, boolean pLista2, boolean pLista3, boolean pLista4, boolean pLista5) {
        this.aluno = aluno;
        this.pLista2 = pLista2;
        this.pLista3 = pLista3;
        this.pLista4 = pLista4;
        this.pLista5 = pLista5;
    }

    public Aluno getaluno() { return aluno; }
    public boolean isPresenteLista2() { return pLista2; }
    public boolean isPresenteLista3() { return pLista3; }
    public boolean isPresenteLista4() { return pLista4; }
    public boolean isPresenteLista5() { return pLista5; }

    public String toCsv() {
        return aluno.getNome() + ";" + aluno.getCpf() + ";" + aluno.getDataInscricao() + ";"
                + pLista2 + ";" + pLista3 + ";" + pLista4 + ";" + pLista5;
    }
}
