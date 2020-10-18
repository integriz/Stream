import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class Principal {
	public static void main(String[] args) throws IOException {
		JogadorImpl jogImpl = new JogadorImpl();
		String enderecoDir = "D:\\projetos\\workspace-java\\Teste";
		String nomeArquivo = "jogadores.txt";
		List<Jogador> listaDeJogadores = jogImpl.getListaDeJogadores(Paths.get(enderecoDir + "\\" + nomeArquivo));
		if (!jogImpl.verificarArquivoExiste(Paths.get(enderecoDir))) {
			System.out.println("Arquivo não encontrado");
		} else {
			jogImpl.imprimirJogadorArtilheiro(listaDeJogadores);
			jogImpl.imprimirJogadorMaisVelho(listaDeJogadores);
			jogImpl.imprimirJogadorMaisNovo(listaDeJogadores);
		}
	}
}