package Repositorios;

import Entidades.Frequencia;

import java.util.ArrayList;
import java.util.List;

public class RepositorioFrequencia {
    private List<Frequencia> frequencias = new ArrayList<>();

    public void adicionarFrequencia(Frequencia frequencia) {
        frequencias.add(frequencia);
        System.out.println("Frequência registrada com ID do aluno: " + frequencia.getAlunoId());
    }

    public List<Frequencia> listarFrequencias() {
        return frequencias;
    }

    public void atualizarFrequencia(int id, Frequencia novaFrequencia) {
        for (int i = 0; i < frequencias.size(); i++) {
            if (frequencias.get(i).getId() == id) {
                frequencias.set(i, novaFrequencia);
                System.out.println("Frequência atualizada com sucesso. ID: " + id);
                return;
            }
        }
        System.out.println("Frequência com ID " + id + " não encontrada.");
    }

    public boolean removerFrequencia(int id) {
        return frequencias.removeIf(frequencia -> frequencia.getId() == id);
    }
}
