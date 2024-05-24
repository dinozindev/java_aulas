package aula18_HerancaUpa;

public class Medico extends Funcionario {
	private String crm;
	
	public Medico(String crm, String nome, String ctps) {
		super(nome, ctps);
		this.crm = crm;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	@Override
	public String toString() {
		return "Medico [crm=" + crm + " \n Dr: ]" + super.toString();
	}
	
	
}
