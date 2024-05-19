package sprint2.gerenciador;

import java.util.ArrayList;
import java.util.List;

import sprint2.model.Usuario;
import sprint2.model.Veiculo;
import java.util.Scanner;

public class GerenciadorVeiculo {
    private Scanner scanner;

    public GerenciadorVeiculo() {

    }
    
    public Veiculo criarVeiculo(Usuario usuario) {
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
        System.out.println("\nVeículo criado com sucesso!");
        return veiculo;
        
    }

    public List<Veiculo> buscarVeiculosPorModelo(String modelo, Usuario usuario) {
        List<Veiculo> veiculosEncontrados = new ArrayList<>();
        for (Veiculo veiculo : usuario.getVeiculos()) {
            if (veiculo.getModelo().equalsIgnoreCase(modelo)) {
                veiculosEncontrados.add(veiculo);
            }
        }
        return veiculosEncontrados;
    }
}
