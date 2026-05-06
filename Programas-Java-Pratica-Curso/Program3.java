//Programa 3 - Média de 4 notas

public class Program3{
 
	public static void main(String[] args){
	
		float N1,N2,N3,media;
	
		//Solicita ao usuário a nota 1
		System.out.printf("Insira a nota 1: ");
		N1 = Float.parseFloat(System.console().readLine());
		
		//Solicita ao usuário a nota 2
		System.out.printf("Insira a nota 2: ");
		N2 = Float.parseFloat(System.console().readLine());
		
		//Solicita ao usuário a nota 3
		System.out.printf("Insira a nota 3: ");
		N3 = Float.parseFloat(System.console().readLine());
		
		media = (N1+N2+N3)/3;
		
		System.out.printf("A media das notas eh: %.2f",media);
	}
}