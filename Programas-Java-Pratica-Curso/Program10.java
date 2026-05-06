//Programa 10 - Conversão entre medidas

public class Program10{

	public static void main(String[] args){
	
		float Num_Pes,Num_Pol,Num_Jardas,Num_Miles;
		
		//Solicita ao usuário o número de pés da medida que deseja-se converter
		System.out.printf("Insira o numero de pes da medida desejada: ");
		Num_Pes = Float.parseFloat(System.console().readLine());
		
		//Calcula as conversões desejadas
		Num_Pol = Num_Pes*12;
		Num_Jardas = Num_Pes/3;
		Num_Miles = Num_Pes/5280;
		
		//Exibe na tela o resultado das conversões desejadas
		System.out.printf("Em polegadas: %.2f \nEm jardas: %.2f \nEm milhas: %f",Num_Pol,Num_Jardas,Num_Miles);
	}
}