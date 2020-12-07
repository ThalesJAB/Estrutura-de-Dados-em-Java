package filadinamica;

public interface IFilaDinamica {

	public void inserir(String nome);
	
	public String remover() throws Exception;

	public boolean isEmpty();

	public void consulta();

}
