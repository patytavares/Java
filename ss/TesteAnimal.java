package Anayr;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro trovao = new Cachorro ("trovao",1,"\n preto ", 7 );
	       trovao.ImprimirInformacoesp();
	       System.out.println("\n");
	       Cavalo dio = new Cavalo("dio",6," \n branco ", 1 );
	       dio.ImprimirInformacoes();
	       System.out.println("\n");
	       Preguica sono = new Preguica("sono",3," \n cinza ", 7 );
	       sono.ImprimirInformcoesm();
	       System.out.println("\n");
	       trovao.emitirSom();
	       dio.emitirSom();
	       sono.emitirSom();
	}

}
