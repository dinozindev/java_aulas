package sprint2.gerenciador;

import java.util.ArrayList;

import sprint2.model.Servico;

public class GerenciadorServico {
    // Atributos
    private ArrayList<Servico> servicos;

    // Construtor
    public GerenciadorServico() {
        this.servicos = new ArrayList<Servico>();

    }

    // Métodos
    public void adicionarServico(Servico servico) {
    	servicos.add(servico);
    }
    
    public void removerServico(Servico servico) {
    	servicos.remove(servico);
    }
    
    public void listarServicos() {
    	System.out.println("\n*-* LISTA DE SERVIÇOS *-*\n");
        for (Servico servico: servicos) {
        	System.out.println("Tipo do serviço: " + servico.getTipo());
        	System.out.println("Descrição: " + servico.getDescricao());
        	System.out.println("Preço: R$" + servico.getPreco());
        	System.out.println("Duração estimada: " + servico.getDuracaoEstimada() + " minutos\n");
        }
    }
    
    public ArrayList<Servico> retornaListaServicos() {
    	return servicos;
    }

    public Servico retornaServico(String descricao) {
        for (Servico servico : this.servicos) {
            if (servico.getDescricao().equalsIgnoreCase(descricao)) {
                return servico;
            }
        }

        return null;
    }
}
