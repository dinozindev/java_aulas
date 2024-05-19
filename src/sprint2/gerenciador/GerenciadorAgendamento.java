package sprint2.gerenciador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sprint2.model.Agendamento;

public class GerenciadorAgendamento {
    private List<Agendamento> agendamentos;
    
    public GerenciadorAgendamento() {
        this.agendamentos = new ArrayList<Agendamento>();
    }

    public void realizarAgendamento() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Datas disponíveis:");
        List<LocalDate> datasDisponiveis = new ArrayList<>();
        for (Agendamento agendamento : agendamentos) {
            LocalDate data = LocalDate.parse(agendamento.getData(), formatter);
            if (!datasDisponiveis.contains(data)) {
                datasDisponiveis.add(data);
            }
        }
        for (LocalDate data : datasDisponiveis) {
            System.out.println(data.format(formatter));
        }

        System.out.println("Digite a data desejada (dd/mm/yyyy):");
        String dataEscolhida = scanner.nextLine();
        LocalDate data = LocalDate.parse(dataEscolhida, formatter);

        if (verificarDataDisponivel(data)) {
            Agendamento agendamento = new Agendamento(dataEscolhida, "08:00", "Novo agendamento");
            agendamentos.add(agendamento);
            System.out.println("Agendamento realizado com sucesso!");
        } else {
            System.out.println("Data não disponível. Agendamento não realizado.");
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
