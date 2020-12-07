package pilhaestatica;

public class PilhaEstaticaMain {

	public static void main(String[] args) throws Exception {
		
		//INSERE TAMANHO DA PILHA NO CONSTRUTOR -----v
		IPilhaEstatica pilhaEst = new PilhaEstatica(10);
		
		pilhaEst.push("a");
		pilhaEst.push("b");
		pilhaEst.push("c");
		pilhaEst.push("d");
		pilhaEst.push("e");
		pilhaEst.push("f");
		pilhaEst.push("g");
		pilhaEst.push("h");
		pilhaEst.push("i");
		pilhaEst.push("j");
		pilhaEst.pop();
		pilhaEst.pop();
		pilhaEst.pop();
		pilhaEst.pop();
		pilhaEst.pop();


		System.out.println(pilhaEst.top());
		

	}

}
