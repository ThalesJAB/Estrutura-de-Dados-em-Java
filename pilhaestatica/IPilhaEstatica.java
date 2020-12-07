package pilhaestatica;

public interface IPilhaEstatica {

	public void push(String nome) throws Exception;

	public String pop() throws Exception;

	public String top() throws Exception;

	public boolean isEmpty();

	public boolean isFull();

}
