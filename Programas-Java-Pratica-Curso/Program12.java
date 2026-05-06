//Programa 12 - Custo ao consumidor de um carro novo

public class Program12{

	public static void main(String[] args){
	
		float Preco_Fab,Per_Luc,Valor_Luc_Per,Per_Imp,Valor_Imp,Preco_Final;
		
		//Solicita ao usuário as informações necessárias
		System.out.printf("Insira o preco de fabrica do carro: ");
		Preco_Fab = Float.parseFloat(System.console().readLine());
		System.out.printf("Insira o percentual de lucro do distribuidor: ");
		Per_Luc = Float.parseFloat(System.console().readLine());
		System.out.printf("Insira o percentual de imposto: ");
		Per_Imp = Float.parseFloat(System.console().readLine());
		
		//Cálculo dos valores necessários
		Valor_Luc_Per = Per_Luc*Preco_Fab/100;
		Valor_Imp = Per_Imp*Preco_Fab/100;
		Preco_Final = Preco_Fab+Valor_Luc_Per+Valor_Imp;
		
		//Exibe na tela os valores desejados
		System.out.printf("O valor do lucro do distribuidor eh: %.2f \nO valor dos impostos eh: %.2f\nO preco final do carro eh: %.2f",Valor_Luc_Per,Valor_Imp,Preco_Final);
	}
}
		