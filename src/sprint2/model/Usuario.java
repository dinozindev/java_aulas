package sprint2.model;

import java.util.ArrayList;

public class Usuario {

    private String nomeUsuario;
    private String senha;
    private String email;
    private String telefone;
    private ArrayList<Veiculo> veiculos;
    private Agendamento agendamento;
    
    public Usuario(String nomeUsuario, String senha, String email, String telefone) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.email = email;
        this.telefone = telefone;
        this.veiculos = new ArrayList<Veiculo>();
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
    
    public Agendamento getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = agendamento;
	}
	

	public String toString() {
		return "Usuario [nomeUsuario=" + nomeUsuario + ", senha=" + senha + ", email=" + email + "]";
	}

}