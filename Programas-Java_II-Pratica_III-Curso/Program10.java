//Programa 10 - Menu de opções com operações matemáticas

public class Program10{

	public static void main(String[] args){
	
		int N1,N2,Control;
		
		System.out.println("Menu de opcoes:");
		System.out.println("1. Somar dois numeros");
		System.out.println("2. Numero ao quadrado");
		System.out.printf("\nEscolha a opcao: ");
		Control=Integer.parseInt(System.console().readLine());
		
		switch(Control){
		
			case 1: 
			System.out.printf("\n\nInsira o numero 1 a ser somado: ");
			N1=Integer.parseInt(System.console().readLine());
			System.out.printf("\nInsira o numero 2 a ser somado: ");
			N2=Integer.parseInt(System.console().readLine());
			
			N1 = N1+N2;
			
			System.out.printf("\n\nO resultado eh: %d",N1);
			break;
			
			case 2: 
			System.out.printf("\n\nInsira o numero a ser elevado ao quadrado: ");
			N1=Integer.parseInt(System.console().readLine());
			
			N1 = N1*N1;
			
			System.out.printf("O resultado eh: %d",N1);
			break;
			
			default:
			System.out.printf("Nao existe esse comando");
		}
	}
}