package mvc_dao_bd.view;

import java.util.List;

import mvc_dao_bd.model.vo.Produto;

public interface ProdutoView {
	
	public void exibirMensagem(String mensagem);
	public void atualizarListaProdutos(List<Produto> produtos);
	public void exibirProduto(Produto produto);
}
