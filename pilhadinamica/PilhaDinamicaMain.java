package pilhadinamica;

public class PilhaDinamicaMain {

	public static void main(String[] args) throws Exception {
		
		IPilhaDinamica pilha = new PilhaDinamica();
		
		pilha.push(4);
		pilha.push(10);
		pilha.push(5);
		pilha.push(6);
		pilha.push(7);
		pilha.pop();
		pilha.push(50);
		pilha.pop();
		pilha.pop();
		pilha.pop();
		
		System.out.println(pilha.top());
		
		System.out.println(pilha.isEmpty());

		


	}

}
