package Entidades;

import java.time.LocalDate;

public class Frequencia {
    private int id;
    private int alunoId; // Alterado para armazenar apenas o ID do aluno
    private LocalDate data;
    private boolean presente;

    public Frequencia(int id, int alunoId, LocalDate data, boolean presente) {
        this.id = id;
        this.alunoId = alunoId;
        this.data = data;
        this.presente = presente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAlunoId() {
        return alunoId;
    }

    public LocalDate getData() {
        return data;
    }

    public boolean isPresente() {
        return presente;
    }

    @Override
    public String toString() {
        return "Frequencia: " +
               "id = " + id +
               ", alunoId = " + alunoId +
               ", data = " + data +
               ", presente = " + presente +
               '.';
    }
}
