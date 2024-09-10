// Eduardo Guilherme Dias RM557886
// Lucas Kenji Kikuchi RM554424

package cp4;

public interface IPromocao {
	public void aplicarDesconto(Produto p, boolean temPromocao);
	public boolean verificarPromocao(Produto p);
}
