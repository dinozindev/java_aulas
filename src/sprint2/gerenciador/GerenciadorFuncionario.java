package sprint2.gerenciador;

import sprint2.model.Cargo;
import sprint2.model.CentroAutomotivo;
import sprint2.model.Funcionario;

public class GerenciadorFuncionario {
    private Funcionario funcionario;

    public GerenciadorFuncionario(Funcionario funcionario) {
    	this.funcionario = funcionario;
    }

    public void alterarCargo(Cargo novoCargo) {
        this.funcionario.setCargo(novoCargo);
    }

    public void alterarCentroAutomotivo(CentroAutomotivo novoCentroAutomotivo) {
        this.funcionario.setCentroAutomotivo(novoCentroAutomotivo);
    }
}
