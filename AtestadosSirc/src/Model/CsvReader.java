package Model;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    public static List<Aluno> ler(String caminho) throws IOException{
        List<Aluno> alunos = new ArrayList<>();
        List<String> linhas = Files.readAllLines(Paths.get(caminho), StandardCharsets.UTF_8);
        for (int i = 1; i < linhas.size(); i++) {
            String linha = linhas.get(i).trim();
            if (linha.isEmpty()) {continue;}
            String[] c = linha.split(";");
            alunos.add(new Aluno(c[0].trim(),c[1].trim(),c[2].trim()));
        }
        return alunos;
    }

}
