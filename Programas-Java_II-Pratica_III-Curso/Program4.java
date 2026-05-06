//Programa 4 - Realização do exercicio 2 do módulo passado com For

public class Program4{

	public static void main(String[] args){
	
		int Cont,Soma=0,Num;
		
		double SomaQuad=0,Med;
		
		System.out.printf("Escolha um numero n para fazer o somatorio, a soma dos quadrados e a media destes numeros: ");
		Num = Integer.parseInt(System.console().readLine());
		
		for(Cont=1;Cont<=Num;Cont++){
		
			Soma = Soma + Cont;
		}
		
		for(Cont=1;Cont<=Num;Cont++){
		
			SomaQuad = SomaQuad + Cont*Cont;
		}
		
		Med = (double)Soma/Num;
		
		System.out.printf("\n Somatório = %d \n Somatório dos quadrados = %.2f \n Media = %.2f",Soma,SomaQuad,Med);
	}
}