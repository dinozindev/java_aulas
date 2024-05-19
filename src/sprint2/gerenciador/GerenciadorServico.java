package sprint2.gerenciador;

import java.util.ArrayList;
import java.util.List;

import sprint2.model.Servico;

public class GerenciadorServico {
    // Atributos
    private List<Servico> servicos;

    // Construtor
    public GerenciadorServico() {
        this.servicos = new ArrayList<>();

        this.servicos.add(new Servico("Mecânica", "Troca de óleo", 100.0, 30));
        this.servicos.add(new Servico("Mecânica", "Troca de pneus", 300.0, 60));
        this.servicos.add(new Servico("Mecânica", "Revisão geral", 250.0, 120));
        this.servicos.add(new Servico("Eletrônica", "Troca de bateria", 200.0, 30));
        this.servicos.add(new Servico("Eletrônica", "Troca de lâmpadas", 50.0, 15));
        this.servicos.add(new Servico("Eletrônica", "Revisão de sistema elétrico", 150.0, 60));
    }

    // Métodos
    public List<Servico> getServicos() {
        return this.servicos;
    }

    public Servico getServico(String descricao) {
        for (Servico servico : this.servicos) {
            if (servico.getDescricao().equalsIgnoreCase(descricao)) {
                return servico;
            }
        }

        return null;
    }
}
