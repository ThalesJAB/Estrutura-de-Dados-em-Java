package filaestatica;

public interface IFilaEstatica {

	public void inserir(String nome) throws Exception;

	public String remover() throws Exception;
	
	public void consultar();

	public boolean isFull();

	public boolean isEmpty();

}
