package sprint2.gerenciador;

import java.util.ArrayList;
import java.util.List;

import sprint2.model.Cargo;
import sprint2.model.CentroAutomotivo;
import sprint2.model.Funcionario;

public class GerenciadorFuncionario {
    private List<Funcionario> funcionarios;

    public GerenciadorFuncionario() {
    	this.funcionarios = new ArrayList<Funcionario>();
    }

    public void alterarCargo(Funcionario funcionario, Cargo novoCargo) {
    	funcionario.setCargo(novoCargo);
    }	

    public void alterarCentroAutomotivo(Funcionario funcionario, CentroAutomotivo novoCentroAutomotivo) {
        funcionario.setCentroAutomotivo(novoCentroAutomotivo);
    }
    
    public void alterarDisponibilidade(Funcionario funcionario) {
    	if(funcionario.isDisponibilidade() == true) {
    		funcionario.setDisponibilidade(false);
    	} else {
    		funcionario.setDisponibilidade(true);
    	}
    }
    
    public void alterarHorarioTrabalho(Funcionario funcionario, String novoHorarioTrabalho) {
    	funcionario.setHorarioTrabalho(novoHorarioTrabalho);
    }
    
    public void adicionarFuncionario(Funcionario funcionario) {
    	funcionarios.add(funcionario);
    }
    
    public void removerFuncionario(Funcionario funcionario) {
    	funcionarios.remove(funcionario);
    }
    
    public void listarFuncionarios() {
    	System.out.println("\n*-* LISTA DE FUNCIONÁRIOS *-*\n");
    	for (Funcionario funcionario : funcionarios) {
    		System.out.println("Matrícula: " + funcionario.getMatriculaFuncionario());
    		System.out.println("Nome: " + funcionario.getNomeFuncionario());
    		System.out.println("Cargo: " + funcionario.getCargo().getNomeCargo());
    		System.out.println("Área do Cargo: " + funcionario.getCargo().getAreaCargo());
    		System.out.println("Oficina: " + funcionario.getCentroAutomotivo().getNomeCentro());
    		System.out.println("Disponibilidade: " + (funcionario.isDisponibilidade() == true ? "Disponível" : "Indisponível"));
    		System.out.println("Horário de trabalho: " + funcionario.getHorarioTrabalho() + "\n");
    	}
    }
    
}
