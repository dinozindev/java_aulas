package sprint2.gerenciador;

import java.util.ArrayList;
import java.util.List;
import sprint2.model.CentroAutomotivo;

public class GerenciadorCentro {
    private List<CentroAutomotivo> centrosAutomotivos;

    public GerenciadorCentro() {
        this.centrosAutomotivos = new ArrayList<CentroAutomotivo>();
    }

    public void adicionarUnidade(CentroAutomotivo centroAutomotivo) {
        this.centrosAutomotivos.add(centroAutomotivo);
    }
    
    public void removerUnidade(CentroAutomotivo centroAutomotivo) {
    	this.centrosAutomotivos.remove(centroAutomotivo);
    }

    public void listarUnidades() {
        System.out.println("\n*-* LISTA DE UNIDADES *-*\n");
        for (CentroAutomotivo centroAutomotivo : this.centrosAutomotivos) {
            System.out.println("ID: " + centroAutomotivo.getIdUnidade());
            System.out.println("Nome do Centro: " + centroAutomotivo.getNomeCentro());
            System.out.println("Endereço: " + centroAutomotivo.getEndereco());
            System.out.println("Telefone: " + centroAutomotivo.getTelefone());
            System.out.println("Horário de funcionamento: " + centroAutomotivo.getHorarioFuncionamento() + "\n");                   
        }
    }
}
