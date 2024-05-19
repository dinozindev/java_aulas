package sprint2.model;

public class Cargo {
	private int idCargo;
	private String nomeCargo;
	private String descricaoCargo;
	private String areaCargo;
	
	public Cargo(int idCargo, String nomeCargo, String descricaoCargo, String areaCargo) {
		this.idCargo = idCargo;
		this.nomeCargo = nomeCargo;
		this.descricaoCargo = descricaoCargo;
		this.areaCargo = areaCargo;
	}

	public int getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(int idCargo) {
		this.idCargo = idCargo;
	}

	public String getNomeCargo() {
		return nomeCargo;
	}

	public void setNomeCargo(String nomeCargo) {
		this.nomeCargo = nomeCargo;
	}

	public String getDescricaoCargo() {
		return descricaoCargo;
	}

	public void setDescricaoCargo(String descricaoCargo) {
		this.descricaoCargo = descricaoCargo;
	}

	public String getAreaCargo() {
		return areaCargo;
	}

	public void setAreaCargo(String areaCargo) {
		this.areaCargo = areaCargo;
	}

	public String toString() {
		return "Cargo [idCargo=" + idCargo + ", nomeCargo=" + nomeCargo + ", descricaoCargo=" + descricaoCargo
				+ ", areaCargo=" + areaCargo + "]";
	}
}
