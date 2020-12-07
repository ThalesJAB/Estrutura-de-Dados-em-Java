package listaduplamenteencadeada;

public class ListaDuplaEncaDinamica implements IListaDuplaEnca {

	private Integer dado;
	private ListaDuplaEncaDinamica proximo;
	private ListaDuplaEncaDinamica anterior;
	private int tamanho = 0;

	public ListaDuplaEncaDinamica() {

	}

	public ListaDuplaEncaDinamica(int dado) {
		tamanho++;
		this.dado = dado;
		this.proximo = null;
		this.anterior = null;
	}

	public ListaDuplaEncaDinamica getProximo() {
		return proximo;
	}

	public void setProximo(ListaDuplaEncaDinamica proximo) {
		this.proximo = proximo;
	}

	public ListaDuplaEncaDinamica getAnterior() {
		return anterior;
	}

	public void setAnterior(ListaDuplaEncaDinamica anterior) {
		this.anterior = anterior;
	}

	public void inserirFim(int valor) {
		if (this.proximo == null) {
			this.proximo = new ListaDuplaEncaDinamica(valor);
			this.proximo.setAnterior(this);
			this.tamanho++;
		} else {
			this.proximo.inserirFim(valor);
			this.tamanho++;
		}
	}

	public void remover(int valor) throws Exception {

		if (this.dado == null) {
			this.proximo.remover(valor);
			tamanho--;
		} else if (this.dado == valor) {
			if (this.proximo == null) {
				tamanho--;
				this.anterior.setProximo(null);

			} else {
				this.anterior.setProximo(this.proximo);
				this.proximo.setAnterior(this.anterior);
			}
		} else if (this.proximo != null) {
			this.proximo.remover(valor);
			this.tamanho--;
		}

		else {
			throw new Exception("Essa Lista não possui este número");
		}

	}

	public void empty() {
		if (this.tamanho == 0) {
			System.out.println("A lista está vazia");

		} else {
			System.out.println("A lista não está vazia");
		}
	}

	public void imprimirLista() {

		if (this.tamanho >= 1) {
			if (this.dado != null) {
				
				System.out.printf("[%d], ", this.dado);
				if (this.proximo != null) {
					this.proximo.imprimirLista();
				}
			}else {
				this.proximo.imprimirLista();
			}

		} else {
			System.out.println("Lista Vazia não possui nada para listar");
		}
	}

	public void tamanho() {
		System.out.printf("\nTamanho igual á: %d\n\n", tamanho);
	}

}
