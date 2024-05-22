package sprint2.main;

import sprint2.gerenciador.GerenciadorAgendamento;
import sprint2.gerenciador.GerenciadorCargo;
import sprint2.gerenciador.GerenciadorCentro;
import sprint2.gerenciador.GerenciadorServico;
import sprint2.gerenciador.GerenciadorFuncionario;
import sprint2.gerenciador.GerenciadorOrcamento;
import sprint2.gerenciador.GerenciadorPecas;
import sprint2.gerenciador.GerenciadorUsuario;
import sprint2.gerenciador.GerenciadorVeiculo;
import sprint2.model.Agendamento;
import sprint2.model.Cargo;
import sprint2.model.CentroAutomotivo;
import sprint2.model.Servico;
import sprint2.model.Funcionario;
import sprint2.model.Orcamento;
import sprint2.model.Peca;
import sprint2.model.Usuario;
import sprint2.model.Veiculo;


public class Main {
    public static void main(String[] args) {
    	
    	// Criação de serviços e adição deles na lista de serviços
    	GerenciadorServico gerenciadorServico = new GerenciadorServico();
    	Servico servico2 = new Servico("Manutenção Automotiva", "Troca do filtro de cabine", 79.99, 15);
    	gerenciadorServico.adicionarServico(new Servico("Mecânica", "Troca de óleo", 100.0, 30));
    	gerenciadorServico.adicionarServico(new Servico("Mecânica", "Troca de pneus", 300.0, 60));
    	gerenciadorServico.adicionarServico(new Servico("Mecânica", "Revisão geral", 250.0, 120));
    	gerenciadorServico.adicionarServico(new Servico("Eletrônica", "Troca de bateria", 200.0, 30));
    	gerenciadorServico.adicionarServico(new Servico("Eletrônica", "Troca de lâmpadas", 50.0, 15));
    	gerenciadorServico.adicionarServico(new Servico("Eletrônica", "Revisão de sistema elétrico", 150.0, 60));
    	gerenciadorServico.adicionarServico(servico2);
    	gerenciadorServico.listarServicos();
    	
    	
    	System.out.println("*-* Removendo o servico2 da lista de serviços *-*");
    	// remoção do serviço da lista
    	gerenciadorServico.removerServico(servico2);
    	gerenciadorServico.listarServicos();
    	
    	// obtenção de um serviço na lista através da descrição
    	System.out.println("*-* Obtenção do serviço pela descrição 'Troca de óleo' *-*\n");
    	Servico servico1 = gerenciadorServico.retornaServico("Troca de óleo");
    	System.out.println("Serviço obtido: " + servico1.toString());
    	
    	System.out.println("\n===================================");
    	
    	// criação dos centrosAutomotivos
    	CentroAutomotivo centroAutomotivo1 = new CentroAutomotivo(111111, "Centro Automotivo Ipiranga", "R. Silva Bueno, 1176", "(11) 3476-0004", "8:30 - 19:30");
    	CentroAutomotivo centroAutomotivo2 = new CentroAutomotivo(121212, "Centro Automotivo Lins de Vasconcelos", "Av. Lins de Vasconcelos, 2474", "(11) 3294-1040", "7:30 - 20:30");
    	
    	// Criação dos cargos
    	Cargo cargo1 = new Cargo(01, "Mecânico", "Realiza os serviços de reparo e manutenção dos veículos", "Prática");
    	Cargo cargo2 = new Cargo(02, "Atendente", "Realiza o atendimento dos clientes no balcão", "Prática");
    	Cargo cargo3 = new Cargo(03, "Lavador", "Realiza a lavagem interna e externa dos veículos", "Prática");
    	
    	// Criação dos funcionários
    	Funcionario funcionario1 = new Funcionario(2222, "Mauricio", cargo1, centroAutomotivo1, true);
    	Funcionario funcionario2 = new Funcionario(2223, "Carlos", cargo2, centroAutomotivo2, false);
    	
    	// adiciona funcionários a lista de funcionários
    	GerenciadorFuncionario gerenciadorFuncionario = new GerenciadorFuncionario();
    	gerenciadorFuncionario.adicionarFuncionario(funcionario1);
    	gerenciadorFuncionario.adicionarFuncionario(funcionario2);
    	gerenciadorFuncionario.listarFuncionarios();
        
        // alteração dos dados do Funcionário
        gerenciadorFuncionario.alterarCargo(funcionario1, cargo2);
        gerenciadorFuncionario.alterarCentroAutomotivo(funcionario1, centroAutomotivo2);
        gerenciadorFuncionario.alterarDisponibilidade(funcionario1);
        System.out.println("*-* Alterando dados do funcionario1 *-*\n");
        System.out.println(funcionario1.toString());
        
        System.out.println("\n*-* Remoção do funcionário2 da lista de funcionários *-*");
        // remoção do funcionário
        gerenciadorFuncionario.removerFuncionario(funcionario2);
        gerenciadorFuncionario.listarFuncionarios();
        
        System.out.println("===================================");
        
        // adiciona unidades para a lista de centros automotivos
        GerenciadorCentro gerenciadorCentro = new GerenciadorCentro();
        gerenciadorCentro.adicionarUnidade(centroAutomotivo1);
        gerenciadorCentro.adicionarUnidade(centroAutomotivo2);
        gerenciadorCentro.listarUnidades();
        
        // remove centroAutomotivo da lista
        System.out.println("*-* Removendo centroAutomotivo1 da lista de unidades *-*");
        gerenciadorCentro.removerUnidade(centroAutomotivo1);
        gerenciadorCentro.listarUnidades();
        
        System.out.println("===================================");
        
        // adiciona os cargos a lista e imprime
        GerenciadorCargo gerenciadorCargo = new GerenciadorCargo();
        gerenciadorCargo.adicionarCargo(cargo1);
        gerenciadorCargo.adicionarCargo(cargo2);
        gerenciadorCargo.adicionarCargo(cargo3);
        gerenciadorCargo.listarCargos();
        
        // remove cargo da lista
        System.out.println("*-* Removendo cargo 1 da lista *-*");
        gerenciadorCargo.removerCargo(cargo1);
        gerenciadorCargo.listarCargos();
        
        // retorna cargo com base no nome
        System.out.println("*-* Cargo 'Lavador' retornado com base em seu nome *-*\n");
        Cargo cargoTeste = gerenciadorCargo.retornaCargo("Lavador");
        System.out.println(cargoTeste.toString());
        
        
        System.out.println("\n===================================\n");
        
        // cria peça, adiciona na lista e imprime
        System.out.println("*-* Criando e adicionando peças para a lista de peças *-*\n");
        Peca peca1 = new Peca(112, true, "Filtro de Cabine", 69.99);
        Peca peca2 = new Peca(113, false, "Disco de pastilha traseiro", 39.99);
        Peca peca3 = new Peca(114, true, "Bateria 40ah", 69.99);
        GerenciadorPecas gerenciadorPecas = new GerenciadorPecas();
        gerenciadorPecas.adicionarPeca(peca1);
        gerenciadorPecas.adicionarPeca(peca2);
        gerenciadorPecas.adicionarPeca(peca3);
        gerenciadorPecas.listarPecas();
        
        // consulta disponibilidade
        System.out.println("*-* Consulta disponibilidade de peças *-*\n");
        gerenciadorPecas.consultarDisponibilidadePeca(peca1);
        gerenciadorPecas.consultarDisponibilidadePeca(peca2);
        gerenciadorPecas.consultarDisponibilidadePeca(peca3);
        
        // alterando a disponibilidade da peça
        gerenciadorPecas.alterarDisponibilidadePeca(peca3);
        System.out.println("\n*-* Alterando a disponibilidade da peca3 *-*");
        System.out.println("\nDisponibilidade peca3: " + peca3.isDisponibilidadePeca());
        
        // remove uma peça
        System.out.println("\n*-* Removendo peca3 da lista de peças *-*\n");
        gerenciadorPecas.removerPeca(peca3);
        gerenciadorPecas.listarPecas();
        
        // cria orcamento
        Orcamento orcamento1 = new Orcamento(000001, "Orçamento gerado", "Ativo", servico2, peca1);
        GerenciadorOrcamento gerenciadorOrcamento = new GerenciadorOrcamento(orcamento1);
        gerenciadorOrcamento.gerarOrcamento();
        gerenciadorOrcamento.imprimirOrcamento();
        
        // criando um usuario novo e logando
        GerenciadorUsuario gerenciadorUsuario = new GerenciadorUsuario();
        Usuario usuario1 = gerenciadorUsuario.cadastrar();
        //Usuario usuario2 = gerenciadorUsuario.cadastrar();
        gerenciadorUsuario.imprimirUsuarios();
        
        System.out.println("*-* Tentativa Logout sem estar logado *-*\n");
        gerenciadorUsuario.logout();
        gerenciadorUsuario.login();
       
        
        // criando e adicionando veículos para cada usuário
        GerenciadorVeiculo gerenciadorVeiculo = new GerenciadorVeiculo();
        Veiculo veiculo1 = gerenciadorVeiculo.criarVeiculo();
        gerenciadorUsuario.adicionarVeiculoAoUsuario(veiculo1, usuario1);
        Veiculo veiculo2 = gerenciadorVeiculo.criarVeiculo();
        gerenciadorUsuario.adicionarVeiculoAoUsuario(veiculo2, usuario1);
        //Veiculo veiculo3 = gerenciadorVeiculo.criarVeiculo();
        //gerenciadorUsuario.adicionarVeiculoAoUsuario(veiculo3, usuario2);
        //Veiculo veiculo4 = gerenciadorVeiculo.criarVeiculo();
        //gerenciadorUsuario.adicionarVeiculoAoUsuario(veiculo4, usuario2);
        
        System.out.println("======================================");
        
        // solicitando um agendamento
        GerenciadorAgendamento gerenciadorAgendamento = new GerenciadorAgendamento();
        Agendamento agendamento1 = gerenciadorAgendamento.realizarAgendamento(gerenciadorServico, gerenciadorUsuario, usuario1, gerenciadorCentro);
        gerenciadorAgendamento.adicionarAgendamento(agendamento1);
        gerenciadorAgendamento.imprimirAgendamentos();
        
        System.out.println("======================================");
        
        //gerenciadorUsuario.listarVeiculosDoUsuario(usuario2);
        
        // remove veículo do usuário
        gerenciadorUsuario.removerVeiculoDoUsuario(veiculo1, usuario1);
        gerenciadorUsuario.listarVeiculosDoUsuario(usuario1);
        
        gerenciadorUsuario.logout();
        //gerenciadorUsuario.adicionarVeiculoAoUsuario(veiculo3, usuario2);
        //gerenciadorUsuario.adicionarVeiculoAoUsuario(veiculo4, usuario2);
        
        

    }
}