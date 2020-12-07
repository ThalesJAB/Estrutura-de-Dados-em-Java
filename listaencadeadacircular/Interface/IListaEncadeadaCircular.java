package listaencadeadacircular;

public interface IListaEncadeadaCircular {

	public void inserirFim(int valor);

	public void inserirInicio(int valor);

	public void inserirMeio(int valor);

	public void mostrarLista();

	public void buscar(int valor);

	public void remover(int valor);

	public int tamanho();

	public boolean isEmpty();

}
