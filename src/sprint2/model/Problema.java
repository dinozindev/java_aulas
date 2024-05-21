package sprint2.model;


public class Problema {
	private int idProblema;
	private String nomeProblema;
	private String descricaoProblema;
	private String categoriaProblema;
	private String gravidadeProblema;
	
	public Problema(int idProblema, String nomeProblema, String descricaoProblema, String categoriaProblema, String gravidadeProblema) {
		this.idProblema = idProblema;
		this.nomeProblema = nomeProblema;
		this.descricaoProblema = descricaoProblema;
		this.categoriaProblema = categoriaProblema;
		this.gravidadeProblema = gravidadeProblema;
	}

	public int getIdProblema() {
		return idProblema;
	}

	public void setIdProblema(int idProblema) {
		this.idProblema = idProblema;
	}

	public String getNomeProblema() {
		return nomeProblema;
	}

	public void setNomeProblema(String nomeProblema) {
		this.nomeProblema = nomeProblema;
	}

	public String getDescricaoProblema() {
		return descricaoProblema;
	}

	public void setDescricaoProblema(String descricaoProblema) {
		this.descricaoProblema = descricaoProblema;
	}

	public String getCategoriaProblema() {
		return categoriaProblema;
	}

	public void setCategoriaProblema(String categoriaProblema) {
		this.categoriaProblema = categoriaProblema;
	}

	public String getGravidadeProblema() {
		return gravidadeProblema;
	}

	public void setGravidadeProblema(String gravidadeProblema) {
		this.gravidadeProblema = gravidadeProblema;
	}

	public String toString() {
		return "Problema [idProblema=" + idProblema + ", nomeProblema=" + nomeProblema + ", descricaoProblema="
				+ descricaoProblema + ", categoriaProblema=" + categoriaProblema + ", gravidadeProblema="
				+ gravidadeProblema + "]";
	}
}
