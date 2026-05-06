//Programa 15 - Conversão °C para °F

public class Program15{

	public static void main(String[] args){
	
		float Graus_Cel,Graus_Fah;
		
		//Solicita ao usuário as in formações necessarias para realização dos calculos
		System.out.printf("Insira a temperatura em graus Celsius: ");
		Graus_Cel = Float.parseFloat(System.console().readLine());
		
		Graus_Fah = (Graus_Cel*9)/5+32;
		
		//Exibe na tela a informação desejada
		System.out.printf("A temperatura equivalente na escala Fahrenheit eh: %.2f",Graus_Fah);
	}
}
		