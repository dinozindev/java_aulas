// Eduardo Guilherme Dias RM557886
// Lucas Kenji Kikuchi RM554424

package cp4;

import java.util.ArrayList;

public class ProdutoDigital extends Produto implements IVenda, IPromocao {
	private float tamanhoArquivo;
	private float duracao;
	private String formatoArquivo;
	
	public ProdutoDigital(String nome, float preco, String descricao, float tamanhoArquivo, float duracao, String formatoArquivo) {
		super(nome, preco, descricao);
		this.tamanhoArquivo = tamanhoArquivo;
		this.duracao = duracao;
		this.formatoArquivo = formatoArquivo;
	}

	public float getTamanhoArquivo() {
		return tamanhoArquivo;
	}

	public void setTamanhoArquivo(float tamanhoArquivo) {
		this.tamanhoArquivo = tamanhoArquivo;
	}

	public float getDuracao() {
		return duracao;
	}

	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}

	public String getFormatoArquivo() {
		return formatoArquivo;
	}

	public void setFormatoArquivo(String formatoArquivo) {
		this.formatoArquivo = formatoArquivo;
	}
	
	public void baixarProduto(ProdutoDigital produto) {
		System.out.println("O produto " + produto.getNome() + " foi baixado com sucesso!");
	}

	@Override
	public void vender(ArrayList<Produto> cc) {
		System.out.println("Venda realizada com sucesso!");
		emitirNotaFiscal(cc);
		
	}

	@Override
	public void emitirNotaFiscal(ArrayList<Produto> cc) {
		int total = 0;
		boolean temDesconto = false;
		for (Produto p : cc) {
			temDesconto = verificarPromocao(p);
			aplicarDesconto(p, temDesconto);
			System.out.println("\n------------");
			System.out.println("Nome: " + p.getNome());
			System.out.println("Valor unitário: " + p.getPreco());
			total+=p.calcularValorTotal();
		}
		System.out.println("Total: " + total);
		
	}

	@Override
	public String obterDetalhes() {
		return "ProdutoDigital [nome=" + super.getNome() +  ", descrição= " + super.getDescricao() + ", tamanhoArquivo=" + tamanhoArquivo + ", duracao=" + duracao + ", formatoArquivo="
				+ formatoArquivo + "]";
	}

	@Override
	public float calcularValorTotal() {
		return this.getPreco();
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
