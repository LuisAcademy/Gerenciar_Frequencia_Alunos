package Serviços;

import Entidades.Frequencia;
import Repositorios.RepositorioFrequencia;

import java.time.LocalDate;
import java.util.List;

public class ServicoFrequencia {
    private RepositorioFrequencia repositorio;

    public ServicoFrequencia(RepositorioFrequencia repositorio) {
        this.repositorio = repositorio;
    }

    public void adicionar(int alunoId, LocalDate data, boolean presente) {
        // Gerar um ID único para a frequência
        int id = gerarId();

        // Criar e adicionar a frequência
        repositorio.adicionarFrequencia(new Frequencia(id, alunoId, data, presente));
    }

    public List<Frequencia> listar() {
        return repositorio.listarFrequencias();
    }

    public void atualizar(int id, Frequencia novaFrequencia) {
        repositorio.atualizarFrequencia(id, novaFrequencia);
    }

    public boolean remover(int id) {
        return repositorio.removerFrequencia(id);
    }

    private int gerarId() {
        return repositorio.listarFrequencias().size() + 1;
    }
}
