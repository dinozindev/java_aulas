package sprint2.model;

public class Agendamento {
    private String data;
    private String hora;
    private String descricao;
    private CentroAutomotivo centro;
    private Servico servico;

	public Agendamento() {
		
	}

    public Agendamento(String data, String hora, String descricao, CentroAutomotivo centro, Servico servico) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
        this.centro = centro;
        this.servico = servico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public CentroAutomotivo getCentro() {
		return centro;
	}

	public void setCentro(CentroAutomotivo centro) {
		this.centro = centro;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public String toString() {
		return "Agendamento [data=" + data + ", hora=" + hora + ", descricao=" + descricao + ", centro=" + centro
				+ ", servico=" + servico + "]";
	}
}
