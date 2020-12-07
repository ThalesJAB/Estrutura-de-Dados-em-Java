package pilhaestatica;

public class PilhaEstatica implements IPilhaEstatica{

	private String[] nomes;

	private int posicao;

	private int tamanho;

	public PilhaEstatica(int tamanho) {
		this.posicao = -1;
		this.tamanho = tamanho;
		this.nomes = new String[tamanho];

	}

	public void push(String nome) throws Exception {
		if (isFull()) {
			throw new Exception("PILHA CHEIA NÃO É POSSIVEL MAIS ADICIONAR");
		}
		this.posicao++;
		this.nomes[this.posicao] = nome;

	}

	public String pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("PILHA VAZIA, NÃO É POSSIVEL RETIRAR NADA");
		}

		String aux = this.nomes[posicao];
		this.posicao--;
		return aux;
	}
	
	public String top() throws Exception {
		if(isEmpty()) {
			throw new Exception("PILHA VAZIA, NÃO POSSUI TOP NENHUM");	
		}
		return this.nomes[this.posicao];
	}

	public boolean isEmpty() {
		return posicao == -1;
	}

	public boolean isFull() {
		return posicao >= tamanho;
	}

}
