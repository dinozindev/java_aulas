package gs.model;

import java.util.ArrayList;

public class IlhaLixo {
    private int idIlhaLixo;
    private String coordenadasIlhaLixo;
    private String statusLimpeza;
    private double tamanhoIlhaLixo;
    private String tipoLixo;
    private ArrayList<Organizacao> organizacoesAssociadas;
	
    public IlhaLixo(int idIlhaLixo, String coordenadasIlhaLixo, String statusLimpeza, double tamanhoIlhaLixo, String tipoLixo) {
		this.idIlhaLixo = idIlhaLixo;
		this.coordenadasIlhaLixo = coordenadasIlhaLixo;
		this.statusLimpeza = statusLimpeza;
		this.tamanhoIlhaLixo = tamanhoIlhaLixo;
		this.tipoLixo = tipoLixo;
		this.organizacoesAssociadas = new ArrayList<Organizacao>();
	}

	public int getIdIlhaLixo() {
		return idIlhaLixo;
	}

	public void setIdIlhaLixo(int idIlhaLixo) {
		this.idIlhaLixo = idIlhaLixo;
	}

	public String getCoordenadasIlhaLixo() {
		return coordenadasIlhaLixo;
	}

	public void setCoordenadasIlhaLixo(String coordenadasIlhaLixo) {
		this.coordenadasIlhaLixo = coordenadasIlhaLixo;
	}

	public String getStatusLimpeza() {
		return statusLimpeza;
	}

	public void setStatusLimpeza(String statusLimpeza) {
		this.statusLimpeza = statusLimpeza;
	}

	public double getTamanhoIlhaLixo() {
		return tamanhoIlhaLixo;
	}

	public void setTamanhoIlhaLixo(double tamanhoIlhaLixo) {
		this.tamanhoIlhaLixo = tamanhoIlhaLixo;
	}

	public String getTipoLixo() {
		return tipoLixo;
	}

	public void setTipoLixo(String tipoLixo) {
		this.tipoLixo = tipoLixo;
	}
    
	public ArrayList<Organizacao> getOrganizacoesAssociadas() {
		return organizacoesAssociadas;
	}

	public void setOrganizacoesAssociadas(ArrayList<Organizacao> organizacoesAssociadas) {
		this.organizacoesAssociadas = organizacoesAssociadas;
	}

	public void imprimirIlhaLixo() {
		System.out.println("ID Ilha de Lixo: " + getIdIlhaLixo());
		System.out.println("Coordenadas: " + getCoordenadasIlhaLixo());
		System.out.println("Tamanho: " + getTamanhoIlhaLixo() + "km²");
		System.out.println("Tipo de Lixo: " + getTipoLixo());
		System.out.println("Status de Limpeza: " + getStatusLimpeza() + "\n");
	}
}
