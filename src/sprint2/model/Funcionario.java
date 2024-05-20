package sprint2.model;

public class Funcionario {
    private int matricula;
    private String nome;
    private Cargo cargo;
    private CentroAutomotivo centroAutomotivo;
    private boolean disponibilidade;

    public Funcionario(int matricula, String nome, Cargo cargo, CentroAutomotivo centroAutomotivo, boolean disponibilidade) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.centroAutomotivo = centroAutomotivo;
        this.disponibilidade = disponibilidade;
    }


	public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public CentroAutomotivo getCentroAutomotivo() {
        return centroAutomotivo;
    }

    public void setCentroAutomotivo(CentroAutomotivo centroAutomotivo) {
        this.centroAutomotivo = centroAutomotivo;
    }
    
    public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public String toString() {
		return "Funcionário [matricula=" + matricula + ", nome=" + nome + ", cargo=" + cargo
				+ ", centroAutomotivo=" + centroAutomotivo + "]";
	}
    
}