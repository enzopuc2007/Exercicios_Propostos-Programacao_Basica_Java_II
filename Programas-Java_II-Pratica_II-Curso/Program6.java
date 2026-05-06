//Programa 6 - Calculadora de faturamento mensal de um armazem

public class Program6{

	public static void main(String[] args){
	
		String Nome_Prod;
		
		int Num_Prod,Cont=1;
		
		double Preco_Unit,Quant_Total_Mes,Valor_Total_Mes=0;
		
		//Solicita o numero de produtos comercializados
		System.out.printf("Qual o numero de produtos comercializados: ");
		Num_Prod = Integer.parseInt(System.console().readLine());
		
		//Solicita as informações e gera o valor total no mes
		while(Cont<=Num_Prod){
			System.out.printf("Qual o nome do produto comercializado: ");
			Nome_Prod = System.console().readLine();
			
			System.out.printf("Preco unitario do "+Nome_Prod+": ");
			Preco_Unit = Double.parseDouble(System.console().readLine());
			
			System.out.printf("Qual o numero total de "+Nome_Prod+" comercializados: ");
			Quant_Total_Mes = Integer.parseInt(System.console().readLine());
			
			Valor_Total_Mes = Valor_Total_Mes + Preco_Unit*Quant_Total_Mes;
			
			Cont = Cont+1;
		}
		
		System.out.printf("O valor total vendido nesse mes foi: %.2f",Valor_Total_Mes);
	}
}
		