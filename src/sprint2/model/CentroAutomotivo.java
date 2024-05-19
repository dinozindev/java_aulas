package sprint2.model;

public class CentroAutomotivo {
    private int idUnidade;
    private String nomeCentro;
    private String endereco;
    private String telefone;
    private String horarioFuncionamento;

    public CentroAutomotivo(int idUnidade, String nomeCentro, String endereco, String telefone, String horarioFuncionamento) {
        this.idUnidade = idUnidade;
        this.nomeCentro = nomeCentro;
        this.endereco = endereco;
        this.telefone = telefone;
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public int getIdUnidade() {
        return idUnidade;
    }

    public void setIdUnidade(int idUnidade) {
        this.idUnidade = idUnidade;
    }
    
    public String getNomeCentro() {
        return nomeCentro;
    }

    public void setNomeCentro(String nomeCentro) {
        this.nomeCentro = nomeCentro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

	public String toString() {
		return "CentroAutomotivo [idUnidade=" + idUnidade + ", nomeCentro=" + nomeCentro + ", endereco=" + endereco
				+ ", telefone=" + telefone + ", horarioFuncionamento=" + horarioFuncionamento + "]";
	}

    
}
