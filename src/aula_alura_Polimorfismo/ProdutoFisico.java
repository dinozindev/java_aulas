package aula_alura_Polimorfismo;

public class ProdutoFisico extends Produto implements IVenda {

	private float peso;
	private float largura;
	
	public ProdutoFisico(String nome, float preco, float peso, float largura) {
		super(nome, preco);
		this.peso = peso;
		this.largura = largura;
		
	}

	@Override
	public void exibirDados() {
		
		vender();
	}

	@Override
	public void vender() {
		// TODO Auto-generated method stub
		
	}

}
