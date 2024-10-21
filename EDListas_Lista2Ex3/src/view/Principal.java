package view;

import controller.ListaController;
import fatec.sp.gov.lib.listas.ListaGenerica;

public class Principal {

	public static void main(String[] args) throws Exception {
		ListaGenerica<Integer> listaA = new ListaGenerica<>();
		ListaGenerica<Integer> listaB = new ListaGenerica<>();
		ListaController<Integer> listCont = new ListaController<Integer>();

		listaA.addLast(3);
		listaA.addLast(5);
		listaA.addLast(8);
		listaA.addLast(12);
		listaA.addLast(9);
		listaA.addLast(7);
		listaA.addLast(16);

		listaB.addLast(9);
		listaB.addLast(6);
		listaB.addLast(2);
		listaB.addLast(3);
		listaB.addLast(7);

		ListaGenerica<Integer> listaI = new ListaGenerica<>();
		ListaGenerica<Integer> listaU = new ListaGenerica<>();

		listaI = listCont.interseccao(listaA, listaB);
		listaU = listCont.uniao(listaA, listaB);
		int tamanhoA = listaA.size();
		int tamanhoB = listaB.size();
		int tamanhoI = listaI.size();
		int tamanhoU = listaU.size();

		System.out.println("Lista A:");
		for (int i = 0; i < tamanhoA; i++) {
			System.out.print(listaA.get(i) + " ");
		}

		System.out.println("\n\nLista B: ");
		for (int i = 0; i < tamanhoB; i++) {
			System.out.print(listaB.get(i) + " ");
		}
		System.out.println("\n\nIntersecção:");
		for (int i = 0; i < tamanhoI; i++) {
			System.out.print(listaI.get(i) + " ");
		}

		System.out.println("\n\nUnião");
		for (int i = 0; i < tamanhoU; i++) {
			System.out.print(listaU.get(i) + " ");
		}
	}

}
