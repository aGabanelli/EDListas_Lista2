package view;

import javax.swing.JOptionPane;

import controller.PlayerController;
import fatec.sp.gov.lib.listas.ListaGenerica;
import model.Musica;

public class Principal {
	public static void main(String[] args) {
		ListaGenerica<Musica> lista = new ListaGenerica<>();
		PlayerController playCont = new PlayerController();
		int opc = 0;

		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane
					.showInputDialog("Vitufy\n1- Adicionar Música\n2- Remover Música\n3- Executar Playlist\n9- Fim"));
			switch (opc) {
			case 1:
				String musica = JOptionPane.showInputDialog("Digite a música no formato 'nome;nomeArtista;duracao':");
				playCont.adicionaMusica(lista, musica);
				break;

			case 2:
				int posicao = Integer.parseInt(
						JOptionPane.showInputDialog("Digite a posição da música na playlist para ser removida:"));
				playCont.removeMusica(lista, posicao);
				break;

			case 3:
				playCont.executaPlaylist(lista);
				break;

			case 9:
				JOptionPane.showMessageDialog(null, "Fim");
				System.exit(0);

			default:
				JOptionPane.showMessageDialog(null, "Opção Invalida");
				break;

			}

		}

	}
}
