package Repositorios;

import Entidades.Professor;

public class RepositorioProfessor {

    // Classe interna para representar um nó da lista duplamente encadeada
    private class Nodo {
        Professor professor;
        Nodo anterior;
        Nodo proximo;

        public Nodo(Professor professor) {
            this.professor = professor;
        }
    }

    private Nodo inicio;
    private Nodo fim;
    private int tamanho;

    public RepositorioProfessor() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void adicionar(Professor professor) {
        if (professor == null) {
            System.out.println("Não é possível adicionar um professor nulo.");
            return;
        }

        Nodo novoNodo = new Nodo(professor);

        if (inicio == null) { // Lista vazia
            inicio = fim = novoNodo;
        } else {
            fim.proximo = novoNodo;
            novoNodo.anterior = fim;
            fim = novoNodo;
        }

        tamanho++;
        System.out.println("Professor adicionado: " + professor.getNome());
    }

    public void listar() {
        if (inicio == null) {
            System.out.println("A lista está vazia.");
            return;
        }

        Nodo atual = inicio;
        while (atual != null) {
            System.out.println("Professor: " + atual.professor.getNome() + " (ID: " + atual.professor.getId() + ") /" + " Disciplina = " + atual.professor.getDisciplina() + " /"+ " Salario = " + atual.professor.getSalario());
            atual = atual.proximo;
        }
    }

    public void atualizar(int id, Professor professorAtualizado) {
        if (inicio == null) {
            System.out.println("A lista está vazia.");
            return;
        }

        Nodo atual = inicio;
        while (atual != null) {
            if (atual.professor.getId() == id) {
                atual.professor = professorAtualizado;
                System.out.println("Professor atualizado: " + professorAtualizado.getNome());
                return;
            }
            atual = atual.proximo;
        }

        System.out.println("Professor com ID '" + id + "' não encontrado.");
    }

    public boolean remover(int id) {
        if (inicio == null) {
            System.out.println("A lista está vazia.");
            return false;
        }

        Nodo atual = inicio;

        while (atual != null) {
            if (atual.professor.getId() == id) {
                if (atual.anterior == null) { // Remover o primeiro nó
                    inicio = atual.proximo;
                    if (inicio != null) {
                        inicio.anterior = null;
                    }
                } else {
                    atual.anterior.proximo = atual.proximo;
                }

                if (atual.proximo == null) { // Remover o último nó
                    fim = atual.anterior;
                } else {
                    atual.proximo.anterior = atual.anterior;
                }

                tamanho--;
                System.out.println("Professor removido: " + atual.professor.getNome());
                return true;
            }

            atual = atual.proximo;
        }

        System.out.println("Professor com ID '" + id + "' não encontrado.");
        return false;
    }

    public int getTamanho() {
        return tamanho;
    }
}
