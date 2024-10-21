package controller;

import javax.swing.JOptionPane;

import fatec.sp.gov.lib.listas.ListaGenerica;
import model.Musica;

public class PlayerController {
	public void adicionaMusica(ListaGenerica<Musica> lista, String musica) {
		Musica m = new Musica();
		String[] aux = musica.split(";");

		try {
			m.setNome(aux[0]);
			m.setNomeArtista(aux[1]);
			m.setDuracao(Integer.parseInt(aux[2]));
			lista.addLast(m);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "Formato Errado");
		}

	}

	public void removeMusica(ListaGenerica<Musica> lista, int posicao) {
		try {
			lista.remove(posicao);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public void executaPlaylist(ListaGenerica<Musica> lista) {
		if (lista.isEmpty()) {
			System.out.println("Playlist Vazia");
		} else {

			int tamanho = lista.size();

			for (int i = 0; i < tamanho; i++) {
				try {
					Musica m = lista.get(i);
					System.out.println("Música: " + m.getNome() + " - Artista: " + m.getNomeArtista() + " Duração: "
							+ m.getDuracao());

					Thread.sleep(m.getDuracao() + 2000);

				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
		}
	}
}
