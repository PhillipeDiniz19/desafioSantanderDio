package funcionalidades;

public class ReprodutorMusical {
	public void tocar() {
		System.out.println("A musica começou a tocar");
	}
	
	public void pausar() {
		System.out.println("A musica foi pausada");
	}
	
	public void selecionarMusica(String musica) {
		System.out.println("A musica selecionada foi " + musica);
	}
}
