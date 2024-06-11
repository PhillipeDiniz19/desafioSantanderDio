package celular;

import funcionalidades.AparelhoTelefone;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone {
	public static void main(String[] args) {
		
		ReprodutorMusical reprodutor = new ReprodutorMusical();
			reprodutor.selecionarMusica("OCEAN");
			reprodutor.tocar();
			reprodutor.pausar();
			
		System.out.println("///////////////");
		
		NavegadorInternet navegar = new NavegadorInternet();
			navegar.adicionarNovaAba();
			navegar.exibirPagina("Phillipe");
			navegar.atualizarPagina();
		System.out.println("///////////////");	
		
		AparelhoTelefone aparelho = new AparelhoTelefone();
			aparelho.ligar("(61) 981474028");
			aparelho.atender();
			aparelho.iniciarCorreioVoz();
	}
}
