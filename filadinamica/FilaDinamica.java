package filadinamica;

public class FilaDinamica implements IFilaDinamica{

	class No {
		private String nomes;
		private No proximo;
	}

	private No cabeca;
	private No inicio;
	private int tamanho = 0;

	public FilaDinamica() {

	}



	public void inserir(String nome) {
		No no = new No();
		no.nomes = nome;
		no.proximo = inicio;
		inicio = no;

		if (tamanho == 0) {
			cabeca = no;
		}

		tamanho++;
	}

	public String remover() throws Exception {
		if (isEmpty()) {
			throw new Exception("FILA VAZIA, NÃO É POSSIVEL RETIRAR NADA");
		}

		String nome = this.cabeca.nomes;

		if (tamanho == 1) {
			inicio = null;
			cabeca = null;
					
		} else {

			No aux = this.inicio;

			while (aux.proximo != this.cabeca) {
				aux = aux.proximo;
			}

			this.cabeca = aux;
			this.cabeca.proximo = null;

		}
		
		this.tamanho--;
		return nome;

	}

	public boolean isEmpty() {
		return tamanho == 0;
	}
	
	public void consulta() {
		if (cabeca == null) {
			cabeca = null;
		}
		
		System.out.printf("\nPrimeiro da fila: %s", cabeca.nomes);
		System.out.printf("\n\nUltimo da fila: %s", inicio.nomes);

	

	}

}
