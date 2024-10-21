package controller;

import fatec.sp.gov.lib.listas.ListaGenerica;

public class ListaController<T> {

	public ListaGenerica<T> uniao(ListaGenerica<T> listaA, ListaGenerica<T> listaB) {
		ListaGenerica<T> listaU = new ListaGenerica<>();

		int tamanhoA = listaA.size();
		int tamanhoB = listaB.size();

		try {
			for (int i = 0; i < tamanhoA; i++) {
				listaU.addLast(listaA.get(i));
			}

			for (int i = 0; i < tamanhoB; i++) {
				if (!contains(listaU, listaB.get(i))) {
					listaU.addLast(listaB.get(i));
				} 
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return listaU;

	}
	
	public ListaGenerica<T> interseccao(ListaGenerica<T> listaA, ListaGenerica<T> listaB){
		ListaGenerica<T> listaI = new ListaGenerica<>();
		
		int tamanho = listaA.size();
		try {
			for(int i = 0; i < tamanho; i++ ) {
				if(contains(listaB, listaA.get(i))) {
					listaI.addLast(listaA.get(i));
				}
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		return listaI;
	}
	
	private boolean contains(ListaGenerica<T> lista, T valor) throws Exception {
		int tamanho = lista.size();

		try {
			for (int i = 0; i < tamanho; i++) {
				if (valor == lista.get(i)) {
					return true;
				}
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		return false;
	}
	
}
