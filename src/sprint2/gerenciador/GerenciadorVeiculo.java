package sprint2.gerenciador;

import java.util.ArrayList;
import java.util.InputMismatchException;

import sprint2.model.Veiculo;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GerenciadorVeiculo {
	private ArrayList<Veiculo> veiculosTotais;
	private Scanner scanner;
    
    public GerenciadorVeiculo() {
    	this.veiculosTotais = new ArrayList<Veiculo>();
    }
    
    public Veiculo criarVeiculo() {
    	Pattern patternPlaca = Pattern.compile("^[A-Z]{3}-[0-9]{1}[A-Z]{1}[0-9]{2}$");
    	Pattern patternAno = Pattern.compile("^(188[6-9]|189[0-9]|19[0-9][0-9]|20[0-1][0-9]|202[0-4])");
    	int anoConvertido;
    	String placa;
    	double quilometragem;
    	
    	System.out.println("\n*-* CRIANDO VEÍCULO *-*\n");
    	scanner = new Scanner(System.in);
        System.out.print("Digite a marca do veículo: ");
        String marca = scanner.nextLine();
        System.out.print("Digite o modelo do veículo: ");
        String modelo = scanner.nextLine();
        while (true) {
        	System.out.print("Digite o ano do veículo (entre 1886 e 2024): ");
        	String ano = scanner.nextLine(); 
        	Matcher matcher = patternAno.matcher(ano);
        	
        	if (matcher.matches()) {
        		anoConvertido = Integer.parseInt(ano);
        		break;
        	} else {
        		System.out.println("Digite um ano válido.");
        	}
        }
        while (true) {
        	System.out.print("Digite a placa do veículo (ex: ABC-1D23): ");
            placa = scanner.nextLine();
            Matcher matcher = patternPlaca.matcher(placa);
            if (matcher.matches()) {
            	break;
            } else {
            	System.out.println("Placa com formato inválido.");
            	continue;
            }
        }
        while (true) {
        	System.out.print("Digite a quilometragem do veículo: ");
        	try {
        		 quilometragem = scanner.nextDouble();
        		 if (Double.isNaN(quilometragem)) {
                 	System.out.println("Digite uma quilometragem válida.");
                 	continue;
                 } else {
                 	break;
                 }
        	} catch(InputMismatchException e) {
        		scanner.next();
        		System.out.println("Digite uma quilometragem válida.");
        	}  
        }
        

        Veiculo veiculo = new Veiculo(marca, modelo, anoConvertido, placa, quilometragem);
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
    		System.out.println(veiculo.getMarca() + " " + veiculo.getModelo() + " (" + veiculo.getAno() + ", " + veiculo.getPlaca() + ", " + veiculo.getQuilometragem() + "km)");
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
