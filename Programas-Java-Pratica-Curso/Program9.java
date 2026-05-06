//Programa 9 - Área de um quadrado

public class Program9{

	public static void main(String[] args){
	
		float Area,Lado;
		
		//Solicita ao usuário o lado do triângulo
		System.out.printf("Insira o tamanho do lado do triângulo: ");
		Lado = Float.parseFloat(System.console().readLine());
		
		//Calcula a área do quadrado
		Area = Lado*Lado;
		
		//Exibe na tela a área do quadrado
		System.out.printf("A area do quadrado eh: %.2f",Area);
	}
}