//Programa 1 - Calculo da soma de 10 números inseridos pelo usuário

public class Program1{

	public static void main(String[] args){
	
		int Cont=1;
		double Soma=0,Num;
		
		//Loop controlado e inseri dados do usuário
		while(Cont<=10){
			
			System.out.printf("Insira o numero %d: ",Cont);
			Num = Double.parseDouble(System.console().readLine());
			
			//Calcula o resultado da soma
			Soma = Soma + Num;
			Cont = Cont + 1;
		}
		
		System.out.printf("A soma dos numeros foi: %.2f",Soma);
	}
}