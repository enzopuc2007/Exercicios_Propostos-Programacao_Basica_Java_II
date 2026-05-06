//Programa 8 - Área de um triângulo

public class Program8{

	public static void main(String[] args){
	
		float Area,Base,Altura;
		
		//Solicita ao usuário o tamanho da base do triângulo
		System.out.printf("Insira o tamanho da base do triângulo: ");
		Base = Float.parseFloat(System.console().readLine());
		
		//Solicita ao usuário o tamanho da altura do triângulo
		System.out.printf("Insira o tamanho da altura do triângulo: ");
		Altura = Float.parseFloat(System.console().readLine());
		
		//Calcula a área do triângulo
		Area = (Base*Altura)/2;
		
		//Exibe a área na tela
		System.out.printf("A area do triangulo eh: %.2f",Area);
	}
}