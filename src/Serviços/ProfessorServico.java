package Serviços;

import Repositorios.RepositorioProfessor;
import Entidades.Professor;

public class ProfessorServico {
    private RepositorioProfessor repositorio;

    public ProfessorServico(RepositorioProfessor repositorio) {
        this.repositorio = repositorio;
    }

    public void adicionar(String nome, String disciplina, int salario) {
        int id = gerarId(); 
        repositorio.adicionar(new Professor(id, nome, disciplina, salario));
    }

    public void listar() {
        System.out.println("Lista de Professores:" );
        repositorio.listar();
    }

    public void atualizar(int id, Professor novoProfessor) { 
        repositorio.atualizar(id, novoProfessor);
    }

    public boolean remover(int id) { 
        return repositorio.remover(id);
    }
    
    private int gerarId() {
        return repositorio.getTamanho() + 1; 
    }
}
