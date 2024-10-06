package mvc_dao_bd.Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import mvc_dao_bd.controller.ProdutoController;
import mvc_dao_bd.model.dao.ProdutoDAO;
import mvc_dao_bd.model.dao.ProdutoDAOImpl;
import mvc_dao_bd.model.vo.Produto;
import mvc_dao_bd.view.ProdutoViewConsole;

public class Main {
	
	public static void main(String[] args) {
		
		//Conexão com o banco de dados Oracle
		String url = "jdbc:oracle:thin:@localhost:1521/XE";
		String username = "system";
		String password = "oracle";
		
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(url);
			ProdutoDAO dao = new ProdutoDAOImpl(connection);
			ProdutoController controller = new ProdutoController(dao, new ProdutoViewConsole());
			
			//exemplo de fluxo de uso para cadastrar um novo produto
			Produto novoProduto = new Produto(0, "Novo Produto", 100);
			controller.salvarProduto(novoProduto);
			System.out.println("Mensagem: " + controller.listarProdutos());
			
			//simular a exibição - exemplo de listagem de todos os produtos
			List<Produto> produtos = controller.listarProdutos();
			for (Produto produto : produtos) {
				System.out.println("Produto" + produto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
