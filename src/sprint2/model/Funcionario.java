package sprint2.model;

public class Funcionario {
    private String matricula;
    private String nome;
    private Cargo cargo;
    private CentroAutomotivo centroAutomotivo;

    public Funcionario(String matricula, String nome, Cargo cargo, CentroAutomotivo centroAutomotivo) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.centroAutomotivo = centroAutomotivo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
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

	public String toString() {
		return "Funcionário [matricula=" + matricula + ", nome=" + nome + ", cargo=" + cargo
				+ ", centroAutomotivo=" + centroAutomotivo + "]";
	}
    
}