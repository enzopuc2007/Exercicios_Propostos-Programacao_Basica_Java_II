//Programa 4 - Calculo da media das idades

public class Program4{

	public static void main(String[] args){
	
		int Idade,Soma=0,Cont=0;
		
		double Media=0;
		
		//Solicitação e loop
		System.out.printf("Insira a idade: ");
		Idade = Integer.parseInt(System.console().readLine());
		
		while(Idade>0){
		
			Soma = Soma+Idade;
			Cont = Cont+1;
			
			System.out.printf("Insira a idade: ");
			Idade = Integer.parseInt(System.console().readLine());
		}
		
		Media = ((double)Soma/Cont);
		
		System.out.printf("Media das idades: %.2f",Media);
	}
}