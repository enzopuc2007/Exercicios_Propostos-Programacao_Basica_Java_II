//Programa 4 - Desconto sobre produto

public class Program4{

	public static void main(String[] args){
		
		float Preco_Prod,Desc,Novo_Preco;
		
		//Solicita ao usuário o preço do produto
		System.out.printf("Insira o preco do produto: ");
		Preco_Prod = Float.parseFloat(System.console().readLine());
		
		//Calcula o valor do desconto
		Desc = 10*Preco_Prod/100;
		
		//Calcula o valor do preço do produto com desconto
		Novo_Preco = Preco_Prod - Desc;
		
		//Exibe na tela o novo preço do produto
		System.out.printf("O novo preço com desconto é: %.2f",Novo_Preco);
	}
}