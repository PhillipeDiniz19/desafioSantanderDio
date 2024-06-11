package funcionalidades;

public class AparelhoTelefone {
	public void ligar(String numero) {
		System.out.println("Você está ligando para o número: " + numero);
		iniciarCorreioVoz();
	}
	public void atender() {
		System.out.println("Atendeu a ligação");
	}
	private void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado");
	}
}
