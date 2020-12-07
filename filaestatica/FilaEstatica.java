package filaestatica;

public class FilaEstatica implements IFilaEstatica{
	
	private String[] nomes;
	private int primeiro;
	private int ultimo;
	private int tamanho = 0;

	
	
	public FilaEstatica(int tamanho) {
		this.nomes = new String[tamanho];
		this.primeiro = 0;
		this.ultimo = 0;
		
	}
	
	public void inserir(String nome) throws Exception {
		
		if(isFull()) {
			throw new Exception("A FILA JA ESTA NO LIMITE");
		}
		this.nomes[ultimo] = nome;
		this.ultimo = (this.ultimo + 1) % nomes.length;
		tamanho++;
	}
	
	public String remover() throws Exception {
		if(isEmpty()) {
			throw new Exception("A FILA NÃO POSSUI NINGUEM PARA SAIR");
		}
		String primeiro = this.nomes[this.primeiro];
		this.primeiro = (this.primeiro + 1) % nomes.length;
		
		tamanho--;
		return primeiro;
		
	}
	
	public void consultar() {
		
		System.out.printf("\nO primeiro da fila é: %s\n\n", this.nomes[primeiro] );
		
	}
	
	public boolean isFull() {
		return this.tamanho == this.nomes.length;
	}
	
	public boolean isEmpty() {
		return tamanho == 0;
		
	}
	
	
	

}
