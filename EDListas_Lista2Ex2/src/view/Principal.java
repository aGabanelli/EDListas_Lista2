package view;

import fatec.sp.gov.lib.listas.ListaGenerica;

public class Principal {

	public static void main(String[] args) throws Exception {

		ListaGenerica<Integer> lista = new ListaGenerica<>();
		ListaGenerica<Integer> auxiliar = new ListaGenerica<>();

		lista.addLast(10);
		lista.addLast(5);
		lista.addLast(8);
		lista.addLast(1);
		lista.addLast(9);
		lista.addLast(2);
		lista.addLast(4);
		lista.addLast(7);
		lista.addLast(3);
		lista.addLast(6);

		int tamanho = lista.size();
		System.out.println("Lista Original:");
		for (int i = 0; i < tamanho; i++) {
			System.out.print(lista.get(i) + " ");
		}

		for (int i = 0; i < tamanho - 1; i++) {
			for (int j = (i + 1); j < tamanho; j++) {
				if (lista.get(i) > lista.get(j)) {
					auxiliar.addLast(lista.get(j));
					lista.remove(j);
					lista.add(auxiliar.get(0), i);
					auxiliar.clear();
				}
			}
		}

		System.out.println("\nLista Ordenada:");
		for (int i = 0; i < tamanho; i++) {
			System.out.print(lista.get(i) + " ");
		}

	}

}
