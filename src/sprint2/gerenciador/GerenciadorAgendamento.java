package sprint2.gerenciador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import sprint2.model.Agendamento;
import sprint2.model.CentroAutomotivo;
import sprint2.model.Servico;
import sprint2.model.Usuario;
import sprint2.model.Veiculo;

public class GerenciadorAgendamento {
    private List<Agendamento> agendamentos;
    private Scanner scanner;
    
    public GerenciadorAgendamento() {
        this.agendamentos = new ArrayList<Agendamento>();
    }

    public Agendamento realizarAgendamento(GerenciadorServico gs, GerenciadorUsuario gu, Usuario usuario, GerenciadorCentro gc) {
    	System.out.println("\n*-* INICIANDO AGENDAMENTO *-*\n");
    	scanner = new Scanner(System.in);
    	Pattern regexHora = Pattern.compile("^(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9])(:([0-5][0-9]))?$");
    	Pattern regexData = Pattern.compile("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])$");
    	Agendamento agendamento = new Agendamento();
    	while (true) {
    		if (gu.getUsuarioLogado() != usuario) {
    			System.out.println("Você não está logado. Realize o login primeiro.");
    			break;
    		} else {
    			 agendamento.setUsuario(usuario);
    		}
    		while (true) {
	        	System.out.print("Qual a data do agendamento?: ");
	            String inputData = scanner.nextLine();
	            Matcher matcherData = regexData.matcher(inputData);
	            if (matcherData.matches()) {
	            	agendamento.setData(inputData);
	            	break;
	            } else {
	            	System.out.println("Data inválida.");
	            	continue;
	            }
	        }
    		while (true) {
    	        System.out.print("Qual o horário do agendamento?: ");
    	        String inputHora = scanner.nextLine();
    	        Matcher matcherHora = regexHora.matcher(inputHora);
    	           if (matcherHora.matches()) {
    	        	   agendamento.setHora(inputHora);
    	        	   break;
    	            } else {
    	            	System.out.println("Horário inválido.");
    	            	continue;
    	            }
    	        }
    		while(true) {
        		System.out.println("Qual serviço deseja agendar?: ");
        		String inputServico = scanner.nextLine();
        		for (Servico servico : gs.retornaListaServicos()) {
        			if (servico.getDescricao().equalsIgnoreCase(inputServico)) {
        				agendamento.setServico(servico); 
        				break;
        			} 
        		}
        		if (agendamento.getServico() != null) {
        			break;
        		} else {
        			continue;
        		}
        	}
        	while(true) {
        		System.out.println("Qual centro deseja realizar o serviço?: ");
        		String inputCentro = scanner.nextLine();
        		for (CentroAutomotivo centro : gc.retornaListaCentros()) {
        			if (centro.getNomeCentro().equalsIgnoreCase(inputCentro)) {
        				agendamento.setCentro(centro); 
        				break;
        			} 
        		}
        		if (agendamento.getCentro() != null) {
        			break;
        		} else {
        			continue;
        		}
        	}
        	while(true) {
        		System.out.println("Em qual veículo será realizado o serviço? (informe a placa): ");
        		String inputPlacaVeiculo = scanner.nextLine();
        		for (Veiculo veiculo : usuario.getVeiculos()) {
        			if (veiculo.getPlaca().equalsIgnoreCase(inputPlacaVeiculo)) {
        				agendamento.setVeiculo(veiculo);
        				break;
        			} 
        		}
        		if (agendamento.getVeiculo() != null) {
        			break;
        		} else {
        			continue;
        		}
        	}
        	System.out.println("\nAgendamento realizado com sucesso!\n");
        	break;
    	}
    	return agendamento;
    }
    
    public void adicionarAgendamento(Agendamento agendamento) {
    	agendamentos.add(agendamento);
    }
    
    public void imprimirAgendamentos() {
    	System.out.println("\n*-* LISTA DE AGENDAMENTOS *-*\n");
    	for (Agendamento agendamento : agendamentos) {
    		System.out.println("Serviço: " + agendamento.getServico().getDescricao());
    		System.out.println("Oficina: " + agendamento.getCentro().getNomeCentro());
    		System.out.println("Data...: " + agendamento.getData());
    		System.out.println("Horário: " + agendamento.getHora());
    		System.out.println("Usuário: " + agendamento.getUsuario().getNomeUsuario());
    		System.out.println("Veículo: " + agendamento.getVeiculo().getMarca() + " " + agendamento.getVeiculo().getModelo() + " " + agendamento.getVeiculo().getAno() + " " + agendamento.getVeiculo().getPlaca() + "\n");
    	}
    }
}
