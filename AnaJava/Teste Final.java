package Anayr;

public class Final{

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
       Cachorro trovão = new Cachorro ("trovão",1,"\n preto ", 7 );
       trovão.ImprimirInformacoesp();
       System.out.println("\n");
       Cavalo dio = new Cavalo("dio",6," \n branco ", 1 );
       dio.ImprimirInformacoes();
       System.out.println("\n");
       Preguica sono = new Preguica("sono",3," \n cinza ", 7 );
       sono.ImprimirInformcoesm();
       System.out.println("\n");
       trovão.emitirSom();
       dio.emitirSom();
       sono.emitirSom();
	} 
	
	}


