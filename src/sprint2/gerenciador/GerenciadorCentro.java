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

    public void listarUnidades() {
        System.out.println("\n*-* LISTA DE UNIDADES *-*\n");
        for (CentroAutomotivo centroAutomotivo : this.centrosAutomotivos) {
            System.out.println("ID: " + centroAutomotivo.getIdUnidade() +
            		" Nome do Centro: " + centroAutomotivo.getNomeCentro() +
                    " Endereço: " + centroAutomotivo.getEndereco() +
                    " Telefone: " + centroAutomotivo.getTelefone() +
                    " Horário de funcionamento: " + centroAutomotivo.getHorarioFuncionamento());
        }
    }
}
