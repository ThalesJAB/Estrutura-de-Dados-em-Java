package pilhadinamica;

public interface IPilhaDinamica {
	
	public void push(int valor) throws Exception;

	public int pop() throws Exception;

	public int top() throws Exception;

	public boolean isEmpty();

}
