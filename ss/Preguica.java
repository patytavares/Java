package Anayr;

public class Preguica extends Animal {
      private String raca;
      private int tempo;
      
      public Preguica (String raca, int tempo, String nome, int idade) {
  		super(nome,idade);
  		this.raca = raca;
  		this.tempo = tempo;
      
}
	public String getraca() {
		return raca;
	}

	public void setraca(String tamanho, String raca) {
		this.raca = raca;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
		
		public void ImprimirInformcoesm() {
			System.out.println( 
					"\nO Preguica se chama: sono " + "\nIdade:3 anos  " + "raca:cinza " + "\nleva o tempo de :7 minutos para andar ");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("shuuuuuu");
		
	}
}