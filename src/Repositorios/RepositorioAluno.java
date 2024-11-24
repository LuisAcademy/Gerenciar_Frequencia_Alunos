package Repositorios;

import Entidades.Aluno;
import java.util.ArrayList;
import java.util.List;

public class RepositorioAluno {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> listarAlunos() {
        return alunos;
    }

    // Other repository methods could be added here.
}
