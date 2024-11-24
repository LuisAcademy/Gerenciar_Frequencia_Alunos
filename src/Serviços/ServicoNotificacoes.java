package Serviços;

import Entidades.Notificacao;
import Repositorios.RepositorioNotificacoes;

import java.util.List;

public class ServicoNotificacoes {
    private final RepositorioNotificacoes repositorio;

    public ServicoNotificacoes(RepositorioNotificacoes repositorio) {
        this.repositorio = repositorio;
    }

    public void adicionar(String mensagem) {
        Notificacao notificacao = new Notificacao(mensagem);
        repositorio.adicionarNotificacao(notificacao);
    }

    public List<Notificacao> listar() {
        return repositorio.listarNotificacoes();
    }
}