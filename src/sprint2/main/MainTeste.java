package sprint2.main;

import java.util.Scanner;

import sprint2.gerenciador.GerenciadorAgendamento;
import sprint2.gerenciador.GerenciadorCentro;
import sprint2.gerenciador.GerenciadorServico;
import sprint2.gerenciador.GerenciadorFuncionario;
import sprint2.gerenciador.GerenciadorUsuario;
import sprint2.gerenciador.GerenciadorVeiculo;
import sprint2.model.Agendamento;
import sprint2.model.Cargo;
import sprint2.model.CentroAutomotivo;
import sprint2.model.Servico;
import sprint2.model.Funcionario;
import sprint2.model.Usuario;
import sprint2.model.Veiculo;


public class MainTeste {
    public static void main(String[] args) {
    	
    	// retorno de um serviço
    	GerenciadorServico gerenciadorServico = new GerenciadorServico();
    	Servico servico1 = gerenciadorServico.getServico("Troca de óleo");
    	System.out.println(servico1.toString());
    	
    	System.out.println("===================================");
    	
    	// criação de um centroAutomotivo
    	CentroAutomotivo centroAutomotivo1 = new CentroAutomotivo(111111, "Centro Automotivo Ipiranga", "Rua Quatro", "11 98293-4988", "8:30 - 19:30");
    	
    	// Criação de um técnico e do seu gerenciador
    	Cargo cargo1 = new Cargo(01, "Mecânico", "Realiza os serviços de reparo e manutenção dos veículos", "Prática");
    	Funcionario funcionario1 = new Funcionario("2222", "Mauricio", cargo1, centroAutomotivo1);
        GerenciadorFuncionario gerenciadorTecnico = new GerenciadorFuncionario(funcionario1);
        System.out.println(funcionario1.toString());
        
        // alteração dos dados do Técnico
        Cargo cargo2 = new Cargo(02, "Lavador", "Realiza a lavagem interna e externa dos veículos", "Prática");
        gerenciadorTecnico.alterarCargo(cargo2);
        CentroAutomotivo centroAutomotivo2 = new CentroAutomotivo(121212, "Centro Automotivo Lins de Vasconcelos", "Rua Doze", "11 92839-3948", "7:30 - 20:30");
        gerenciadorTecnico.alterarCentroAutomotivo(centroAutomotivo2);
        System.out.println(funcionario1.toString());
        
        System.out.println("===================================");
        
        // adiciona unidades para a lista de centros automotivos
        GerenciadorCentro gerenciadorCentro = new GerenciadorCentro();
        gerenciadorCentro.adicionarUnidade(centroAutomotivo1);
        gerenciadorCentro.adicionarUnidade(centroAutomotivo2);
        gerenciadorCentro.listarUnidades();
        
        
        // criando um usuario novo e logando
        GerenciadorUsuario gerenciadorUsuario = new GerenciadorUsuario();
        Usuario usuario1 = gerenciadorUsuario.cadastrar();
        gerenciadorUsuario.login();
        
        // criando e adicionando um veiculo novo para o usuario
        GerenciadorVeiculo gerenciadorVeiculo = new GerenciadorVeiculo();
        Veiculo veiculo1 = gerenciadorVeiculo.criarVeiculo(usuario1);
        gerenciadorUsuario.adicionarVeiculoAoUsuario(veiculo1, usuario1);
        Veiculo veiculo2 = gerenciadorVeiculo.criarVeiculo(usuario1);
        gerenciadorUsuario.adicionarVeiculoAoUsuario(veiculo2, usuario1);
        
        // imprime lista de veículos do usuário
        usuario1.listarVeiculos();
      
        
        
        
        
        GerenciadorAgendamento gerenciadorAgendamento = new GerenciadorAgendamento();
        
       
        
        
        
        
        

        Scanner scanner = new Scanner(System.in);

    }
}