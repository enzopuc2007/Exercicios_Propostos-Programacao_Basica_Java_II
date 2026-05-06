//Programa 5 - Realização do exercicio 5 do módulo passado com For

public class Program5{

	public static void main(String[] args){
	
		double Km,QuntL,SomaKm=0,SomaQuntL=0,Med;
		int NumViagem;
		
		System.out.printf("Insira o numero de viagens a ser calculado: ");
		NumViagem = Integer.parseInt(System.console().readLine());
		
		for(;NumViagem>0;NumViagem--){
			System.out.printf("Insira a quantidade de kilometros feito na viagem: ");
			Km = Double.parseDouble(System.console().readLine());
			System.out.printf("Insira a quantidade de litros de gasolina usada para realizar a viagem: ");
			QuntL = Double.parseDouble(System.console().readLine());
			
			SomaKm = SomaKm + Km;
			SomaQuntL = SomaQuntL + QuntL;
		}
		
		Med = SomaKm/SomaQuntL;
		
		System.out.printf("A media feita pelo carro eh: %.2f",Med);
	}
}