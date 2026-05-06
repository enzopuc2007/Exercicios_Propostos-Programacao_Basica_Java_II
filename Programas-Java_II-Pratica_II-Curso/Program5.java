//Programa 5 - Média do kilometro por litro feita por um dado carro

public class Program5{

	public static void main(String[] args){
	
		int Num_Viagens,Cont=1;
		
		double Vol_L,Km_Done,Media=0,Media_Total;
		
		//Solicitação do numero de viagens feito e calculo da media
		System.out.printf("Qual o numero total de viagens realizadas?: ");
		Num_Viagens = Integer.parseInt(System.console().readLine());
		
		while(Cont<=Num_Viagens){
		
			System.out.printf("Qual a distancia total percorrida na viagem %d?: ",Cont);
			Km_Done = Integer.parseInt(System.console().readLine());
			
			System.out.printf("Qual o volume de gasolina usado na viagem %d?: ",Cont);
			Num_Viagens = Integer.parseInt(System.console().readLine());
			
			Media = Media + (Km_Done/Num_Viagens);
			
			Cont = Cont+1;
		}
		
		Media_Total = Media/Num_Viagens;
		
		System.out.printf("A media total foi: %.2f",Media_Total);
	}
}
		