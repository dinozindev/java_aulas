package sprint2.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import sprint2.gerenciador.GerenciadorAgendamento;
import sprint2.gerenciador.GerenciadorCentro;
import sprint2.gerenciador.GerenciadorServico;
import sprint2.gerenciador.GerenciadorFuncionario;
import sprint2.gerenciador.GerenciadorUsuario;
import sprint2.gerenciador.GerenciadorVeiculo;
import sprint2.model.Agendamento;
import sprint2.model.Funcionario;


public class Main {
    public static void main(String[] args) {
        GerenciadorUsuario gerenciadorUsuario = new GerenciadorUsuario();
        GerenciadorAgendamento gerenciadorAgendamento = new GerenciadorAgendamento();
        GerenciadorServico gerenciadorServico = new GerenciadorServico();
        GerenciadorVeiculo gerenciadorVeiculo = new GerenciadorVeiculo();
        GerenciadorCentro gerenciadorCentro = new GerenciadorCentro();
        Funcionario tecnicoResponsavel1 = new Funcionario("2222", "Mauricio", "Mecanico Auxiliar","Centro Automotivo 123");
        GerenciadorFuncionario gerenciadorTecnico = new GerenciadorFuncionario(tecnicoResponsavel1);

        gerenciadorTecnico.alterarCargo("Mecanico Junior");
        gerenciadorTecnico.alterarCentroAutomotivo("Centro Automotivo ABC");
        
        System.out.println(tecnicoResponsavel1.toString());

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBem-vindo a Porto Auto Tech");
            System.out.println("1. Cadastrar");
            System.out.println("2. Login");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                // cadastrar usuário
                gerenciadorUsuario.cadastrar();
            } else if (opcao == 2) {
                // logar usuário
                gerenciadorUsuario.login();

                while (true) {
                    System.out.println("\nBem-vindo, " + gerenciadorUsuario.getUsuarioLogado().getNomeUsuario() + "!");
                    System.out.println("1. Adicionar veículo");
                    System.out.println("2. Realizar diagnostico");
                    System.out.println("3. Sair");
                    System.out.print("Escolha uma opção: ");
                    int opcao2 = scanner.nextInt();

                    if (opcao2 == 1) {
                        // adicionar veículo ao usuário
                        gerenciadorUsuario.adicionarVeiculo(gerenciadorUsuario.getUsuarioLogado());
                    } else if (opcao2 == 2) {
                        // realizar diagnostico do veículo
                        gerenciadorUsuario.getUsuarioLogado();
                    } else if (opcao2 == 3) {
                        // sair do sistema
                        System.out.println("Até mais!");
                        break;
                    } else {
                        System.out.println("Opção inválida.");
                    }
                }
            } else if (opcao == 3) {
                // sair do sistema
                System.out.println("Esperamos que tenhamos o ajudado.");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        gerenciadorAgendamento.realizarAgendamento();
        gerenciadorAgendamento.realizarAgendamento();
        gerenciadorAgendamento.realizarAgendamento();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite a data do agendamento no formato dd/mm/yyyy:");
        String dataEscolhida = scanner.nextLine();
        LocalDate data = LocalDate.parse(dataEscolhida, formatter);

        if (gerenciadorAgendamento.verificarDataDisponivel(data)) {
            gerenciadorAgendamento.realizarAgendamento();
        } else {
            System.out.println("Data não disponível. Agendamento não realizado.");
        }

        // display all appointments
        System.out.println("Todos os agendamentos:");
        for (Agendamento agendamento : gerenciadorAgendamento.getAgendamentos()) {
            System.out.println(agendamento.getData() + " - " + agendamento.getHora() + " - " + agendamento.getDescricao());
        }


        scanner.close();
    }
}