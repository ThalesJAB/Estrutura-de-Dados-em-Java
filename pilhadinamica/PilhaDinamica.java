package pilhadinamica;

public class PilhaDinamica implements IPilhaDinamica {
	
	class No{
		private int valor;
		private No proximo;
	}
	
	private No topo;
	private int tamanho = 0;
	
	PilhaDinamica(){
		topo = null;
	}
	
	
	public void push(int valor) throws Exception {
		No no = new No();
		no.valor = valor;
		no.proximo = topo;
		topo = no;
		this.tamanho++;

	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("PILHA VAZIA, NÃO É POSSIVEL RETIRAR NADA");
		}

		int aux = topo.valor;
		topo = topo.proximo;
		tamanho--;
		return aux;
		
	}
	
	public int top() throws Exception {
		if(isEmpty()) {
			throw new Exception("PILHA VAZIA, NÃO POSSUI TOP NENHUM");	
		}
		return topo.valor;
	}

	public boolean isEmpty() {
		return tamanho == 0;
	}

}
