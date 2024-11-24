package Entidades;

public class Professor {
    private String nome;
    private String disciplina;
    private int salario;
    private int id; 

    // Construtor
    public Professor(int id, String nome, String disciplina, int salario) {
        this.id = id;
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public int getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Professor: " +
                "id = " + id +
                ", nome = " + nome + ' ' +
                ", disciplina = " + disciplina + ' ' +
                ", salario = " + salario +
                '.';
    }
}