
public class SteveJobs {

	public static void main(String[] args) {
		AparelhoTelefonico telefone = new Iphone();
		telefone.ligar();
		telefone.atender();
		telefone.iniciarCorreioVoz();

		NavegadorInternet navegador = new Iphone();
		navegador.exibirPagina();
		navegador.adicionarNovaAba();
		navegador.atualizarPagina();
		
		ReprodutorMusical player = new Iphone();
		player.tocar();
		player.pausar();
		player.selecionarMusica();
	}

}
