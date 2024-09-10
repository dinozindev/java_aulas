// Eduardo Guilherme Dias RM557886
// Lucas Kenji Kikuchi RM554424

package cp4;

import java.util.ArrayList;

public class ProdutoFisico extends Produto implements IVenda, IPromocao {
	private float peso;
	private float dimensoes;
	private String cor;
	private String material;
	
	public ProdutoFisico(String nome, float preco, String descricao, float peso, float dimensoes, String cor, String material) {
		super(nome, preco, descricao);
		this.peso = peso;
		this.dimensoes = dimensoes;
		this.cor = cor;
		this.material = material;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getDimensoes() {
		return dimensoes;
	}

	public void setDimensoes(float dimensoes) {
		this.dimensoes = dimensoes;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	public float calcularFrete() {
		if (peso < 10) {
			return 5f;
		} else {
			return 10f;
		}
	}

	@Override
	public void vender(ArrayList<Produto> cc) {
		System.out.println("Venda realizada com sucesso!");
		emitirNotaFiscal(cc);	
	}
	
	// emite a nota fiscal
	@Override
	public void emitirNotaFiscal(ArrayList<Produto> cc) {
		int total = 0;
		boolean temDesconto = false;
		System.out.println("\n*-* NOTA FISCAL *-*");
		for (Produto p : cc) {
			temDesconto = verificarPromocao(p);
			aplicarDesconto(p, temDesconto);
			System.out.println("\n-----------------------\n");
			System.out.println("Nome: " + p.getNome());
			System.out.println("Valor unitário: R$" + p.getPreco());
			total+=p.calcularValorTotal();
		}
		System.out.println("\nTotal: R$" + total);
		
	}

	@Override
	public String obterDetalhes() {
		return "ProdutoFisico [nome=" + super.getNome() +  ", descrição= " + super.getDescricao() + ", peso=" + peso + ", dimensoes=" + dimensoes + ", cor=" + cor + ", material=" + material
				+ "]";
	}

	@Override
	public float calcularValorTotal() {
		return this.getPreco() + this.calcularFrete();
	}

	@Override
	public void aplicarDesconto(Produto p, boolean temPromocao) {
		if (temPromocao == true) {
			p.setPreco(p.getPreco() * 0.8f);
		}
	}

	@Override
	public boolean verificarPromocao(Produto p) {
		if (p.getPreco() > 100) {
			return true;
		} else {
			return false;
		}
	}
}

	
