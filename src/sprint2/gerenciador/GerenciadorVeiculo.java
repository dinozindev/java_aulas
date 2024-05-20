package sprint2.gerenciador;

import java.util.ArrayList;
import sprint2.model.Veiculo;
import java.util.Scanner;

public class GerenciadorVeiculo {
	private ArrayList<Veiculo> veiculosTotais;
	private Scanner scanner;
    
    public GerenciadorVeiculo() {
    	this.veiculosTotais = new ArrayList<Veiculo>();
    }
    
    public Veiculo criarVeiculo() {
    	System.out.println("\n*-* CRIANDO VEÍCULO *-*\n");
    	scanner = new Scanner(System.in);
        System.out.print("Digite a marca do veículo: ");
        String marca = scanner.nextLine();
        System.out.print("Digite o modelo do veículo: ");
        String modelo = scanner.nextLine();
        System.out.print("Digite o ano do veículo: ");
        int ano = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite a placa do veículo: ");
        String placa = scanner.nextLine();
        System.out.print("Digite a quilometragem do veículo: ");
        double quilometragem = scanner.nextDouble();

        Veiculo veiculo = new Veiculo(marca, modelo, ano, placa, quilometragem);
        veiculosTotais.add(veiculo);
        System.out.println("\nVeículo criado com sucesso!");
        return veiculo;
        
    }
    
    public void removerVeiculoDosCadastrados(Veiculo veiculo) {
    	veiculosTotais.remove(veiculo);
    }
    
    public void listarVeiculosCadastrados() {
    	System.out.println("*-* VEÍCULOS CADASTRADOS *-*");
    	for (Veiculo veiculo: veiculosTotais) {
    		System.out.println(veiculo.getMarca() + " " + veiculo.getModelo() + " (" + veiculo.getAno() + ", " + veiculo.getPlaca() + ", " + veiculo.getQuilometragem() + ")");
    	}
    }

    public ArrayList<Veiculo> buscarVeiculosPorModelo(String modelo) {
        ArrayList<Veiculo> veiculosEncontrados = new ArrayList<>();
        for (Veiculo veiculo : veiculosTotais) {
            if (veiculo.getModelo().equalsIgnoreCase(modelo)) {
                veiculosEncontrados.add(veiculo);
            }
        }
        return veiculosEncontrados;
    }
}
