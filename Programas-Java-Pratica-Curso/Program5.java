//Programa 5 - Salário líquido funcionário

public class Program5{

	public static void main(String[] args){
	
		float Sal_Base,Gratif,Sal_Novo;
	
		//Solicita o salário base do funcionário
		System.out.printf("Insira o salario base: ");
		Sal_Base = Float.parseFloat(System.console().readLine());
		
		//Realiza as contas necessárias para mandar o salário final
		Gratif = (Sal_Base*5)/100;
		Sal_Novo = (Gratif+Sal_Base) - ((Gratif+Sal_Base)*7)/100;
		
		//Exibe ao usuário o salário líquido
		System.out.printf("O salario liquido do funcionario eh: %.2f",Sal_Novo);
	}
}