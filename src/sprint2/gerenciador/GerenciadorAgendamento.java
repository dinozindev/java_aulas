package sprint2.gerenciador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sprint2.model.Agendamento;

public class GerenciadorAgendamento {
    private List<Agendamento> agendamentos;
    private Scanner scanner;
    
    public GerenciadorAgendamento() {
        this.agendamentos = new ArrayList<Agendamento>();
    }

    public Agendamento realizarAgendamento() {
    	scanner = new Scanner(System.in);
    	while(true) {
    		System.out.println("Qual a data do agendamento (ex: dd/MM/yyyy)?: ");
    		scanner.next();
    	}
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
