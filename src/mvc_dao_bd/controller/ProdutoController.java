package mvc_dao_bd.controller;

import java.sql.SQLException;
import java.util.List;

import mvc_dao_bd.model.dao.ProdutoDAO;
import mvc_dao_bd.model.vo.Produto;
import mvc_dao_bd.view.ProdutoView;

public class ProdutoController {

	private ProdutoDAO dao;
	private ProdutoView view;
	
	public ProdutoController(ProdutoDAO dao, ProdutoView view) {
		this.dao = dao;
		this.view = view;
	}
	
	public void salvarProduto(Produto produto) {
		try {
			dao.inserir(produto);
			view.exibirMensagem("Produto cadastrado com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Produto> listarProdutos(){
		try {
			return dao.listar();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void exibirProdutoPorId(int id) {
		try {
			Produto produto = dao.buscarPorId(id);
			if(produto != null) {
				view.exibirProduto(produto);
			}else {
				view.exibirMensagem("Produto não encontrado!");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void atualizarProduto(Produto produto) {
		try {
			dao.atualizar(produto);
			view.exibirMensagem("Produto atualizado com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}