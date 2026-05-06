//Programa 2 - Divisão de dois números

public class Program2{

	public static void main(String[] args){
	
		float Num_1,Num_2,res;
		
		//Solicita ao usuário o numerador 
		System.out.printf("Insira o numerador: ");
		Num_1 = Float.parseFloat(System.console().readLine());
		
		//Solicita ao usuário o denominador 
		System.out.printf("Insira o denominador: ");
		Num_2 = Float.parseFloat(System.console().readLine());
		
		res = Num_1/Num_2;
		
		System.out.printf("A divisao eh: %.2f",res);
	}
}