//Programa 14 - Energia consumida

public class Program14{

	public static void main(String[] args){
	
		float Sal_Min,Quant_Kwh,Kwh_Unit,Valor_Pagar,Valor_Desc;
		
		//Solicita ao usuário os dados necessários
		System.out.printf("Insira o salario minimo: ");
		Sal_Min = Float.parseFloat(System.console().readLine());
		System.out.printf("Insira a quantidade de Kwh total: ");
		Quant_Kwh = Float.parseFloat(System.console().readLine());
		
		//Cálculos necessarios para obter as informações desejadas
		Kwh_Unit = Sal_Min/5;
		Valor_Pagar = Kwh_Unit*Quant_Kwh;
		Valor_Desc = Valor_Pagar-(15*Valor_Pagar/100);
		
		//Exibição dos resultados na tela
		System.out.printf("Valor do Kwh unitario: %.2f \nValor que iria pagar: %.2f \nValor a pagar, com desconto, eh: %.2f",Kwh_Unit,Valor_Pagar,Valor_Desc);
	}
}