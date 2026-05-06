//Programa 2 - Calculo do somatório. soma dos quadrados e média aritmética entre n inteiros positivos

public class Program2{

	public static void main(String[] args){
	
		int Num,Cont=1,Soma=0,Soma_Quad=0;
		double Media;
		
		//Solicita ao usuário até qual inteiro deseja somar
		System.out.printf("Ate qual inteiro positivo voce deseja somar?: ");
		Num = Integer.parseInt(System.console().readLine());
		
		while(Cont<=Num){
		
			Soma = Soma + Cont;
			
			Soma_Quad = Soma_Quad + Cont*Cont;
			
			Cont = Cont+1;
		}
		
		Media = ((double)Soma/Num);
		
		System.out.printf("A soma eh: %d \nA soma ao quadrado eh: %d \nA media eh: %.2f",Soma,Soma_Quad,Media);
	}
}
		