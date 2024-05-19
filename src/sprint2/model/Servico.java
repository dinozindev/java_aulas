package sprint2.model;

public class Servico {
    private String tipo;
    private String descricao;
    private double preco;
    private int duracaoEstimada;

    public Servico(String tipo, String descricao, double preco, int duracaoEstimada) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.preco = preco;
        this.duracaoEstimada = duracaoEstimada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getDuracaoEstimada() {
        return duracaoEstimada;
    }

    public void setDuracaoEstimada(int duracaoEstimada) {
        this.duracaoEstimada = duracaoEstimada;
    }

	public String toString() {
		return "Servico [tipo=" + tipo + ", descricao=" + descricao + ", preco=" + preco + ", duracaoEstimada="
				+ duracaoEstimada + "]";
	}
    
}
