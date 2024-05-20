package sprint2.model;

import java.util.ArrayList;

public class Usuario {

    private String nomeUsuario;
    private String senha;
    private String email;
    private ArrayList<Veiculo> veiculos;
    private Agendamento agendamento;
    
    public Usuario(String nomeUsuario, String senha, String email) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.email = email;
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

	public void listarVeiculos() {
    		System.out.println("\n*-* VEÍCULOS DO USUÁRIO " + nomeUsuario.toUpperCase() + " *-*\n");
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo.getMarca() + " " + veiculo.getModelo() + " (" + veiculo.getAno() + ", " + veiculo.getPlaca() + ")");
        }
    }
}