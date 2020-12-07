package listaduplamenteencadeada;

public interface IListaDuplaEnca {
	
	public void inserirFim(int valor);
	
	public void remover(int valor) throws Exception;
	
	public void empty();
	
	public void imprimirLista();

	public void tamanho();

}
