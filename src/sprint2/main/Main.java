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
    	
    	// Criação de um serviço e adição dele na lista de serviços
    	GerenciadorServico gerenciadorServico = new GerenciadorServico();
    	Servico servico2 = new Servico("Manutenção Automotiva", "Troca do filtro de cabine", 79.99, 15);
    	gerenciadorServico.adicionarServico(servico2);
    	gerenciadorServico.listarServicos();
    	
    	// remoção do serviço da lista
    	gerenciadorServico.removerServico(servico2);
    	gerenciadorServico.listarServicos();
    	
    	// obtenção de um serviço na lista através da descrição
    	System.out.println("\nObtenção do serviço pela descrição 'Troca de óleo'\n");
    	Servico servico1 = gerenciadorServico.retornaServico("Troca de óleo");
    	System.out.println(servico1.toString());
    	
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
        System.out.println("Dados do funcionário 1 alterados");
        System.out.println(funcionario1.toString());
        
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
        System.out.println("*-* Removendo oficina *-*");
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
        System.out.println("*-* Cargo retornado com base em seu nome *-*\n");
        Cargo cargoTeste = gerenciadorCargo.retornaCargo("Lavador");
        System.out.println(cargoTeste.toString());
        
        
        System.out.println("===================================");
        
        // cria peça, adiciona na lista e imprime
        Peca peca1 = new Peca(112, true, "Filtro de Cabine", 69.99);
        Peca peca2 = new Peca(113, false, "Disco de pastilha traseiro", 39.99);
        GerenciadorPecas gerenciadorPecas = new GerenciadorPecas();
        gerenciadorPecas.adicionarPeca(peca1);
        gerenciadorPecas.adicionarPeca(peca2);
        gerenciadorPecas.listarPecas();
        
        // consulta disponibilidade
        System.out.println("\n*-* Consulta disponibilidade *-*\n");
        gerenciadorPecas.consultarDisponibilidadePeca(peca1);
        gerenciadorPecas.consultarDisponibilidadePeca(peca2);
        
        // cria orcamento
        Orcamento orcamento1 = new Orcamento(000001, "Orçamento gerado", "Ativo", servico2, peca1);
        GerenciadorOrcamento gerenciadorOrcamento = new GerenciadorOrcamento(orcamento1);
        gerenciadorOrcamento.gerarOrcamento();
        gerenciadorOrcamento.imprimirOrcamento();
        
        // criando um usuario novo e logando
        GerenciadorUsuario gerenciadorUsuario = new GerenciadorUsuario();
        Usuario usuario1 = gerenciadorUsuario.cadastrar();
        // Usuario usuario2 = gerenciadorUsuario.cadastrar();
        gerenciadorUsuario.login();
        gerenciadorUsuario.imprimirUsuarios();
        
        // criando e adicionando veículos para cada usuário
        GerenciadorVeiculo gerenciadorVeiculo = new GerenciadorVeiculo();
        Veiculo veiculo1 = gerenciadorVeiculo.criarVeiculo();
        gerenciadorUsuario.adicionarVeiculoAoUsuario(veiculo1, usuario1);
        Veiculo veiculo2 = gerenciadorVeiculo.criarVeiculo();
        gerenciadorUsuario.adicionarVeiculoAoUsuario(veiculo2, usuario1);
        Veiculo veiculo3 = gerenciadorVeiculo.criarVeiculo();
        //gerenciadorUsuario.adicionarVeiculoAoUsuario(veiculo3, usuario2);
        Veiculo veiculo4 = gerenciadorVeiculo.criarVeiculo();
        //gerenciadorUsuario.adicionarVeiculoAoUsuario(veiculo4, usuario2);
        
        // imprime lista de veículos do usuário
        gerenciadorUsuario.listarVeiculosDoUsuario(usuario1);
        //gerenciadorUsuario.listarVeiculosDoUsuario(usuario2);
        
        // remove veículo do usuário
        gerenciadorUsuario.removerVeiculoDoUsuario(veiculo1, usuario1);
        gerenciadorUsuario.listarVeiculosDoUsuario(usuario1);
        
        

    }
}