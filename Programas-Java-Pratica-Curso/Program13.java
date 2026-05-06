//Programa 13 - Salário a receber por um trabalhador

public class Program13{

	public static void main(String[] args){
	
		int Horas_Trab;
		float Valor_Hora,Sal_Min,Sal_Bruto,Valor_Imp,Sal_Final;
		
		//Solicita ao usuário as informações necessárias
		System.out.printf("Insira o numero de horas trabalhadas: ");
		Horas_Trab = Integer.parseInt(System.console().readLine());
		System.out.printf("Insira o salario minimo: ");
		Sal_Min = Float.parseFloat(System.console().readLine());
		
		//Calcula os dados desejados
		Valor_Hora = Sal_Min/10;
		Sal_Bruto = Horas_Trab*Valor_Hora;
		Valor_Imp = (3*Sal_Bruto)/100;
		Sal_Final = Sal_Bruto-Valor_Imp;
		
		//Exibe na tela o salário final a ser recebido
		System.out.printf("O salario a ser recebido eh: %.2f",Sal_Final);
	}
}
		