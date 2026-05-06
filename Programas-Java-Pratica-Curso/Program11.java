//Programa 11 - Cálculo da idade de uma pessoa e conversão em outras unidades de tempo

public class Program11{

	public static void main(String[] args){
	
		int Ano_Nasc,Ano_Atual,Idade_Anos,Idade_Meses,Idade_Dias,Idade_Semanas;
		
		//Solicita ao usuário o ano de nascimento
		System.out.printf("Insira o seu ano de nascimento: ");
		Ano_Nasc = Integer.parseInt(System.console().readLine());
		
		//Solicita ao usuário o ano atual
		System.out.printf("Insira o seu ano atual: ");
		Ano_Atual = Integer.parseInt(System.console().readLine());
		
		//Calcula os dados necessários e conversões
		Idade_Anos = Ano_Atual-Ano_Nasc;
		Idade_Meses = 12*Idade_Anos;
		Idade_Dias = 365*Idade_Anos;
		Idade_Semanas = 52*Idade_Anos;
		
		//Exibe na tela as conversões de tempo
		System.out.printf("Sua idade em anos: %d \nSua idade em meses: %d \nSua idade em dias: %d \nSua idade em semanas: %d",Idade_Anos,Idade_Meses,Idade_Dias,Idade_Semanas);
	}
}