//Programa 7 - Média das notas de acordo com os seus respectivos pesos

public class Program7{

	public static void main(String[] args){
		
		float Nota1,Nota2,Nota3,Peso1,Peso2,Peso3,Media;
		
		//Solicita ao usuário a nota 1
		System.out.printf("Insira a nota 1: ");
		Nota1 = Float.parseFloat(System.console().readLine());
		
		//Solicita ao usuário o peso 1
		System.out.printf("Insira o peso 1: ");
		Peso1 = Float.parseFloat(System.console().readLine());
		
		//Solicita ao usuário a nota 2
		System.out.printf("Insira a nota 2: ");
		Nota2 = Float.parseFloat(System.console().readLine());
		
		//Solicita ao usuário o peso 2
		System.out.printf("Insira o peso 2: ");
		Peso2 = Float.parseFloat(System.console().readLine());
		
		//Solicita ao usuário a nota 3
		System.out.printf("Insira a nota 3: ");
		Nota3 = Float.parseFloat(System.console().readLine());
		
		//Solicita ao usuário o peso 3
		System.out.printf("Insira o peso 3: ");
		Peso3 = Float.parseFloat(System.console().readLine());
		
		//Calculo da média do aluno
		Media = (Nota1*Peso1+Nota2*Peso2+Nota3*Peso3)/(Peso1+Peso2+Peso3);
		
		//Exibe na tela a média 
		System.out.printf("A media eh: %.2f",Media);
	}
}
		
		