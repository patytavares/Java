package Anayr;

public class Cavalo extends Animal {
	private String cor;
	private int altura;

	public Cavalo(String cor, int altura, String nome, int idade) {
		super(nome,idade);
		this.cor = cor;
		this.altura = altura;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	public void ImprimirInformacoes() {
		System.out.println("\nO cavalo se chama: dio \nCor branco \ntem 1 metro de altura ");
	}

	@Override
	public void emitirSom() {
		System.out.println("rilinchin");
		
	}

}