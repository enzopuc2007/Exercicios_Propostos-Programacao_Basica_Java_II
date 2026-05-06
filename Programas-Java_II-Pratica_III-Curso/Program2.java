//Programa 2 - Vistoria geral Detran

public class Program2{

	public static void main(String[] args){
	
		int Placa,Final;
		
		System.out.printf("Insira os 4 digitos finais da placa: "); 
		
		Placa = Integer.parseInt(System.console().readLine());
		
		Final = Placa % 10;
		
		switch(Final){
		
			case 0: System.out.println("Fazer a vistoria em janeiro do próximo ano");
			break;
			
			case 1: System.out.println("Fazer a vistoria em fevereiro do próximo ano");
			break;
		
			case 2: System.out.println("Fazer a vistoria em março do próximo ano");
			break;
			
			case 3: System.out.println("Fazer a vistoria em abril do próximo ano");
			break;
			
			case 4: System.out.println("Fazer a vistoria em maio do próximo ano");
			break;
			
			case 5: System.out.println("Fazer a vistoria em junho do próximo ano");
			break;
			
			case 6: System.out.println("Fazer a vistoria em setembro deste ano");
			break;
			
			case 7: System.out.println("Fazer a vistoria em outubro deste ano");
			break;
			
			case 8: System.out.println("Fazer a vistoria em novembro deste ano");
			break;
			
			case 9: System.out.println("Fazer a vistoria em dezembro deste ano");
			break;
			
			default: System.out.println("Não foi possível entender");
		}
	}
}