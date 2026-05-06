//Programa 6 - Salário final do funcionário com comissão sobre vendas

public class Program6{

	public static void main(String[] args){
	
		float Sal_Fixo,Comis_Vendas,Total_Vendas,Sal_Final;
		
		//Solicita ao usuário o seu salario fixo
		System.out.printf("Insira o salario fixo do funcionario: ");
		Sal_Fixo = Float.parseFloat(System.console().readLine());
		
		//Solicita ao usuário o seu total de vendas
		System.out.printf("Insira o total de vendas do funcionario: ");
		Total_Vendas = Float.parseFloat(System.console().readLine());
		
		//Calcula dados para mostrar na tela
		Comis_Vendas = (Total_Vendas*4)/100;
		Sal_Final = Sal_Fixo+Comis_Vendas;
		
		//Exibe na tela a comissão do funcionário e o salário final deste
		System.out.printf("Comissão do funcionario: %.2f /n Salario final do funcionario: %.2f",Comis_Vendas,Sal_Final);
	}
}	
	