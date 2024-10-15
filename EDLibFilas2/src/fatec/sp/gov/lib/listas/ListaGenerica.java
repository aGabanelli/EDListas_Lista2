package fatec.sp.gov.lib.listas;

public class ListaGenerica<T> {

	No<T> primeiro;
	
	public ListaGenerica() {
		primeiro = null;
	}
	
	public boolean isEmpty() {
		if(primeiro == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int size() {
		int cont = 0;
		if(isEmpty() == false) {
			No<T> auxiliar = primeiro;
			while(auxiliar != null) {
				cont ++;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}
	
	public No<T> getNo(int posicao) throws Exception {
		if(isEmpty() == true) {
			throw new Exception("Lista vazia");
		}
		
		int tamanho = size();
		if(posicao < 0 || posicao > tamanho -1) {
			throw new Exception("Posição inválida");
		}
		No<T> auxiliar = primeiro;
		int cont = 0;
		while(cont < posicao) {
			auxiliar = auxiliar.proximo;
			cont ++;
		}
		return auxiliar;	
	}
	
	public void addFirst(T valor) {
		No<T>  elemento = new No<T> ();
		elemento.dado = valor;
		elemento.proximo = primeiro;
		primeiro = elemento;
	}
	
	public void addLast(T valor) throws Exception {
		if(isEmpty() == true) {
			//throw new Exception("Lista vazia");
			addFirst(valor);
		}
		int tamanho = size();
		No<T> elemento = new No<T> ();
		elemento.dado = valor;
		elemento.proximo = null;
		No<T>  ultimo = getNo(tamanho-1);
		ultimo.proximo = elemento;
	}
	
	public void add(T valor, int posicao) throws Exception {
		int tamanho = size();
		if(posicao < 0 || posicao > tamanho) {
			throw new Exception("Posição inválida");
		}
		if(posicao == 0) {
			addFirst(valor);
		} else if(posicao == tamanho) {
			addLast(valor);
		}else {
			No<T>  elemento = new No<T> ();
			elemento.dado = valor;
			No<T>  anterior = getNo(posicao - 1);
			elemento.proximo = anterior.proximo;
			anterior.proximo = elemento;
		}
	}
	
	public void removeFirst() throws Exception {
		if(isEmpty() == true) {
			throw new Exception("Lista vazia");
		}
		primeiro = primeiro.proximo;
	}
	
	public void removeLast() throws Exception {
		if(isEmpty() == true) {
			throw new Exception("Lista vazia");
		}
		int tamanho = size();
		if(tamanho == 1) {
			removeFirst();
		}
		else {
			No<T> penultimo = getNo(tamanho - 2);
			penultimo.proximo = null;
		}
	}
	
	public void remove(int posicao) throws Exception {
		if(isEmpty() == true) {
			throw new Exception("Lista vazia");
		}
		int tamanho = size();
		if(posicao < 0 || posicao > tamanho -1) {
			throw new Exception("Posição inválida");
		}
		if(posicao == 0) {
			removeFirst();
		} else if(posicao == tamanho) {
			removeLast();
		}else {
			No<T>  anterior = getNo(posicao - 1);
			No<T>  atual = getNo(posicao);
			anterior.proximo = atual.proximo;
		}
	}
	
	public void clear() throws Exception {
		if(isEmpty() == true) {
			throw new Exception("Lista vazia");
		}else {
			while(!isEmpty()) {
				removeFirst();
			}
		}
	}
	
	public T get(int posicao) throws Exception {
		if(isEmpty() == true) {
			throw new Exception("Lista vazia");
		}
		int tamanho = size();
		if(posicao < 0 || posicao > tamanho -1) {
			throw new Exception("Posição inválida");
		}
		int cont = 0;
		No<T> auxiliar = primeiro;
		while(cont < posicao) {
			auxiliar = auxiliar.proximo;
			cont++;
		}
		return auxiliar.dado;
	}
}