package sprint2.gerenciador;

import java.util.ArrayList;

import sprint2.model.Servico;

public class GerenciadorServico {
    // Atributos
    private ArrayList<Servico> servicos;

    // Construtor
    public GerenciadorServico() {
        this.servicos = new ArrayList<Servico>();

        this.servicos.add(new Servico("Mecânica", "Troca de óleo", 100.0, 30));
        this.servicos.add(new Servico("Mecânica", "Troca de pneus", 300.0, 60));
        this.servicos.add(new Servico("Mecânica", "Revisão geral", 250.0, 120));
        this.servicos.add(new Servico("Eletrônica", "Troca de bateria", 200.0, 30));
        this.servicos.add(new Servico("Eletrônica", "Troca de lâmpadas", 50.0, 15));
        this.servicos.add(new Servico("Eletrônica", "Revisão de sistema elétrico", 150.0, 60));
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

    public Servico retornaServico(String descricao) {
        for (Servico servico : this.servicos) {
            if (servico.getDescricao().equalsIgnoreCase(descricao)) {
                return servico;
            }
        }

        return null;
    }
}
