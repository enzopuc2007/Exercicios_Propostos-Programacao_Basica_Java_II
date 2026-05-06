//Programa 1 - Subtração dois números

public class Program1{

	public static void main(String[] args){
		
		float Num_1,Num_2,result;
		
		//Solicita ao usuário que digite o primeiro número
		System.out.print("Digite o primeiro numero: ");
		Num_1 = Float.parseFloat(System.console().readLine());
		
		//Solicita ao usuário que digite o segundo número
		System.out.print("\nDigite o segundo numero: ");
		Num_2 = Float.parseFloat(System.console().readLine());
		
		//Calcula o resultado da divisão
		result = Num_1 - Num_2;
		
		//Exibe o resultado na tela
		System.out.printf("\n O resultado obtido foi: %.2f",result);
	}
}