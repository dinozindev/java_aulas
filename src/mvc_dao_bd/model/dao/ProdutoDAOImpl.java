package mvc_dao_bd.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mvc_dao_bd.model.vo.Produto;

public class ProdutoDAOImpl implements ProdutoDAO{

	private Connection connection;
	
	public ProdutoDAOImpl(Connection connection) {
		this.connection = connection;
	}
	
	@Override
	public void inserir(Produto produto) {
		String sql = "INSERT INTO tb_produto (nome, preco) VALUES (?, ?)";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, produto.getNome());
			statement.setFloat(2, produto.getPreco());
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Produto> listar() throws SQLException {
		List<Produto> produtos = new ArrayList<Produto>();
		
		String sql = "SELECT * FROM tb_produto";
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet resultSet = statement.executeQuery();
	
		while(resultSet.next()) {
			int id = resultSet.getInt("id"); //acesso pelo label
			String nome = resultSet.getString("nome");
			float preco = resultSet.getFloat("preco");
			
			//criar um objeto de Produto
			Produto produto = new Produto(id, nome, preco);
			produtos.add(produto);
		}
		
		return produtos;
	}

	@Override
	public Produto buscarPorId(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(Produto produto) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
