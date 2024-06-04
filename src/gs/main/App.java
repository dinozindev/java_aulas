package gs.main;

import gs.gerenciador.GerenciadorDenuncia;
import gs.gerenciador.GerenciadorDoacao;
import gs.gerenciador.GerenciadorEspecieMarinha;
import gs.gerenciador.GerenciadorIlhaLixo;
import gs.gerenciador.GerenciadorOrganizacao;
import gs.gerenciador.GerenciadorRecibo;
import gs.gerenciador.GerenciadorRecompensa;
import gs.gerenciador.GerenciadorReconhecimentoImagem;
import gs.model.Doacao;
import gs.model.EspecieMarinha;
import gs.model.Organizacao;
import gs.model.Recibo;
import gs.model.Recompensa;
import gs.model.Usuario;
import gs.gerenciador.GerenciadorUsuario;

public class App {
    public static void main(String[] args) {
        GerenciadorDenuncia gerenciadorDenuncia =  new GerenciadorDenuncia();
        GerenciadorOrganizacao gerenciadorOrg = new GerenciadorOrganizacao();
        GerenciadorRecibo gerenciadorRecibo = new GerenciadorRecibo();
        GerenciadorRecompensa gerenciadorRecompensa = new GerenciadorRecompensa();
        GerenciadorReconhecimentoImagem gerenciadorRecEspec = new GerenciadorReconhecimentoImagem();
        GerenciadorDoacao gerenciadorDoacao = new GerenciadorDoacao();
        GerenciadorIlhaLixo gerenciadorIlhaLixo = new GerenciadorIlhaLixo();
        GerenciadorUsuario gerenciadorUsuario = new GerenciadorUsuario();
        GerenciadorEspecieMarinha gerenciadorEspecie = new GerenciadorEspecieMarinha();


        //ORGANIZAÇÃO
        
        System.out.println("\n============== { ORGANIZAÇÕES } ==============\n");

        // Cria organizacões
        Organizacao org1 = new Organizacao("1234567890", "Azul Profundo", "Azul Profundo é uma organização não governamental dedicada à preservação e restauração dos ecossistemas marinhos. Com foco em projetos de conservação, educação ambiental e pesquisa científica, a ONG trabalha para proteger a biodiversidade oceânica e promover práticas sustentáveis.", "ONG");
        Organizacao org2 = new Organizacao("9876543210", "OceanCare Solutions", "OceanCare Solutions é uma empresa inovadora que desenvolve tecnologias e serviços para a proteção dos oceanos. Especializada em sistemas de monitoramento ambiental e soluções de mitigação de poluição, a empresa colabora com indústrias, governos e ONGs para implementar práticas de gestão sustentável.", "Empresa");
        Organizacao org3 = new Organizacao("1111111111", "Programa Mar Azul", "O Programa Mar Azul é uma iniciativa governamental criada para promover a conservação marinha e a sustentabilidade dos recursos oceânicos. Através de políticas públicas, financiamento de projetos de pesquisa e parcerias com a sociedade civil, o programa busca proteger habitats marinhos críticos, regulamentar atividades pesqueiras e combater a poluição.", "Governamental");

        // Cadastra as organizações na lista
        System.out.println("*-* Adicionando organizações a lista *-*\n");
        gerenciadorOrg.cadastrarOrganizacao(org1);
        gerenciadorOrg.cadastrarOrganizacao(org2);
        gerenciadorOrg.cadastrarOrganizacao(org3);

        // lista todas as organizacoes
        gerenciadorOrg.imprimirOrganizacoes();
        
        // Get dos pontos da organização
        System.out.println("*-* Procurando os pontos da organização pelo CNPJ *-*\n");
        String cnpj = "1234567890";
        int pontos = gerenciadorOrg.getPontosOrganizacao(cnpj);
        System.out.println("Pontos da organização " + cnpj + ": " + pontos);

        // Pesquisa organização por CNPJ
        System.out.println("\n*-* Pesquisando organização pelo CNPJ *-*\n");
        Organizacao org = gerenciadorOrg.buscarOrganizacaoPorCnpj(cnpj);
        if (org != null) {
            System.out.println("Organização encontrada: " + org.getNomeOrganizacao());
        } else {
            System.out.println("Organização não encontrada");
        }
        
        // removendo organizacao da lista
        System.out.println("\n*-* Removendo organização Programa Mar Azul da lista *-*\n");
        gerenciadorOrg.removerOrganizacao(org3);
        gerenciadorOrg.imprimirOrganizacoes();
        
        // adicionando pontos a organizacao 
        System.out.println("*-* Adicionando pontos a OceanCare *-*\n");
        gerenciadorOrg.adicionarPontosOrganizacao(org2, 120);
        org2.imprimirOrganizacao();
        
        // ESPECIES MARINHAS
        System.out.println("\n============== { ESPÉCIES MARINHAS } ==============\n");
        
        EspecieMarinha esp1 = new EspecieMarinha(0001, "Tartaruga-verde", "Chelonia mydas", "Em Perigo", "A tartaruga-verde é uma grande tartaruga marinha encontrada principalmente em mares tropicais e subtropicais. É herbívora e se alimenta principalmente de algas e ervas marinhas.");
        EspecieMarinha esp2 = new EspecieMarinha(0002, "Baleia-azul", "Balaenoptera musculus", "Em Perigo", "A baleia-azul é o maior animal conhecido a ter existido, podendo atingir mais de 30 metros de comprimento. Alimenta-se principalmente de krill e outras pequenas criaturas marinhas.");
        EspecieMarinha esp3 = new EspecieMarinha(0003, "Peixe-palhaço", "Amphiprioninae", "Pouco Preocupante", "O peixe-palhaço é conhecido por sua relação simbiótica com anêmonas-do-mar. Possui cores vibrantes e é popular em aquários marinhos.");
        EspecieMarinha esp4 = new EspecieMarinha(0004, "Vaquita", "Phocoena sinus", "Criticamente em perigo", "A vaquita é a menor espécie de cetáceo e é encontrada apenas no norte do Golfo da Califórnia, no México.");
        EspecieMarinha esp5 = new EspecieMarinha(0005, "Peixe-serra-longo", "Pristis pristis", "Criticamente em perigo", "O peixe-serra-longo é um grande peixe de água salgada com um focinho serrilhado distinto. É encontrado em águas tropicais e subtropicais, mas suas populações têm diminuído drasticamente devido à pesca e à perda de habitat.");
        EspecieMarinha esp6 = new EspecieMarinha(0006, "Estrela-do-mar girassol", "Pycnopodia helianthoides", "Em Perigo", "A estrela-do-mar girassol é uma das maiores espécies de estrela-do-mar, encontrada no Pacífico Norte. Tem muitas pernas e é um predador eficiente.");
        
        // adicionando especies a lista
        System.out.println("*-* Adicionando espécies a lista *-*\n");
        gerenciadorEspecie.adicionarEspecie(esp1);
        gerenciadorEspecie.adicionarEspecie(esp2);
        gerenciadorEspecie.adicionarEspecie(esp3);
        gerenciadorEspecie.adicionarEspecie(esp4);
        gerenciadorEspecie.adicionarEspecie(esp5);
        gerenciadorEspecie.adicionarEspecie(esp6);
        
        // imprimindo lista de especies
        gerenciadorEspecie.consultarEspecies();
        
        // buscando especie com base no nome
        System.out.println("*-* Buscando espécie com base no nome científico *-*\n");
        gerenciadorEspecie.buscarEspecieNomeCientifico("Amphiprioninae");
        
        // remove especie da lista
        System.out.println("*-* Removendo espécie Estrela-do-mar girassol da lista *-*\n");
        gerenciadorEspecie.removerEspecie(esp6);
        gerenciadorEspecie.consultarEspecies();
        
        //USUARIO
        
        System.out.println("\n============== { USUÁRIO } ==============\n");
        
        // cadastro usuario
        Usuario usuario1 = gerenciadorUsuario.cadastrar();
        
        // tentando deslogar sem estar logado
        System.out.println("\n*-* Tentando deslogar sem estar logado *-*\n");
        gerenciadorUsuario.logout();
        
        // login usuario
        gerenciadorUsuario.login();
        
        System.out.println("\n============== { DOAÇÃO E RECIBO } ==============\n");

        //DOAÇÃO
        // criando nova doação
        Doacao doacao = new Doacao(100001, "07/06", "13:39", 134.39, "Cartão de Débito", usuario1);
        gerenciadorDoacao.adicionarDoacao(doacao);
        
        // imprimindo doações
        gerenciadorDoacao.listarDoacoes();
        
        // somando a doação as doações atuais do usuario e atribuindo 
        double doacaoAtual = gerenciadorUsuario.somar(0.0, doacao.getQuantiaDoacao());
        usuario1.setValorDoado(doacaoAtual);
        System.out.println("*-* Adicionando o valor da doação para o total doado do usuário *-*");
        System.out.println("Valor doado: R$" + usuario1.getValorDoado() + "\n");
        
        // criando recibo e imprimindo
        Recibo recibo = gerenciadorRecibo.gerarRecibo(doacao);
        gerenciadorRecibo.adicionarRecibo(recibo);
        gerenciadorRecibo.listarRecibos();
        
        //RECOMPENSA
        // Cria recompensas
        Recompensa recompensa1 = new Recompensa(1,8500,"troféu, viagem de cruzeiro");
        Recompensa recompensa2 = new Recompensa(2,500,"certificado, boné e camiseta personalizado");
        Recompensa recompensa3 = new Recompensa(3,2300,"viagem em frente a praia");





    }
}