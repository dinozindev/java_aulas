package sprint2.gerenciador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sprint2.model.Agendamento;
import sprint2.model.Servico;

public class GerenciadorAgendamento {
    private List<Agendamento> agendamentos;
    private Scanner scanner;
    
    public GerenciadorAgendamento() {
        this.agendamentos = new ArrayList<Agendamento>();
    }

    public Agendamento realizarAgendamento(GerenciadorServico gs) {
    	scanner = new Scanner(System.in);
    	Servico servicoEscolhido = null;
    	while(true) {
    		System.out.println("Qual serviço deseja agendar?: ");
    		String inputServico = scanner.nextLine();
    		for (Servico servico : gs.retornaListaServicos()) {
    			if (servico.getDescricao().equalsIgnoreCase(inputServico)) {
    				System.out.println("Serviço encontrado.");
    				servicoEscolhido = servico;
    				break;
    			} 
    		}
    		if (servicoEscolhido != null) {
    			break;
    		} else {
    			continue;
    		}
    	}
    	System.out.println("sai do while");
    }
    
    public boolean verificarDataDisponivel(LocalDate data) {
        for (Agendamento agendamento : agendamentos) {
            LocalDate agendamentoData = LocalDate.parse(agendamento.getData(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            if (agendamentoData.equals(data)) {
                return false; // data não disponível
            }
        }
        return true; // data disponível
    }
}
