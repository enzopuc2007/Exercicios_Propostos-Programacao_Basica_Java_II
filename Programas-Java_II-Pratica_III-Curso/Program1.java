//Programa 1 - Algoritmo que escreve a data escolhida

public class Program1{

	public static void main(String[] args){
		
		int Dia,Ano;
		String Mes;
		
		//Solicita ao usuário o dia 
		System.out.printf("Insira o dia do ano em numeros: ");
		Dia = Integer.parseInt(System.console().readLine());
		System.out.printf("Insira o mes do ano escrito tudo minusculo: ");
		Mes = System.console().readLine();
		System.out.printf("Insira o ano em numeros: ");
		Ano = Integer.parseInt(System.console().readLine());
		System.out.printf("\n");
		
		switch(Dia){
			
			case 1: System.out.printf("1");
			break;
			
			case 2: System.out.printf("2");
			break;
			
			case 3: System.out.printf("3");
			break;
			
			case 4: System.out.printf("4");
			break;
			
			case 5: System.out.printf("5");
			break;
			
			case 6: System.out.printf("6");
			break;
			
			case 7: System.out.printf("7");
			break;
			
			case 8: System.out.printf("8");
			break;
			
			case 9: System.out.printf("9");
			break;
			
			case 10: System.out.printf("10");
			break;
			
			case 11: System.out.printf("11");
			break;
			
			case 12: System.out.printf("12");
			break;
			
			case 13: System.out.printf("13");
			break;
			
			case 14: System.out.printf("14");
			break;
			
			case 15: System.out.printf("15");
			break;
			
			case 16: System.out.printf("16");
			break;
			
			case 17: System.out.printf("17");
			break;
			
			case 18: System.out.printf("18");
			break;
			
			case 19: System.out.printf("19");
			break;
			
			case 20: System.out.printf("20");
			break;
			
			case 21: System.out.printf("21");
			break;
			
			case 22: System.out.printf("22");
			break;
			
			case 23: System.out.printf("23");
			break;
			
			case 24: System.out.printf("24");
			break;
			
			case 25: System.out.printf("25");
			break;
			
			case 26: System.out.printf("26");
			break;
			
			case 27: System.out.printf("27");
			break;
			
			case 28: System.out.printf("28");
			break;
			
			case 29: System.out.printf("29");
			break;
			
			case 30: System.out.printf("30");
			break;
			
			case 31: System.out.printf("31");
			break;
			
			default: System.out.printf("Não foi possível entender");
		}
		
		System.out.printf(" de ");
		
		switch(Mes){
			
			case "janeiro": System.out.printf("Janeiro");
			break;
			
			case "fevereiro": System.out.printf("Fevereiro");
			break;
			
			case "marco": System.out.printf("Marco");
			break;
			
			case "abril": System.out.printf("Abril");
			break;
			
			case "maio": System.out.printf("Maio");
			break;
			
			case "junho": System.out.printf("Junho");
			break;
			
			case "julho": System.out.printf("Julho");
			break;
			
			case "agosto": System.out.printf("Agosto");
			break;
			
			case "setembro": System.out.printf("Setembro");
			break;
			
			case "outubro": System.out.printf("Outubro");
			break;
			
			case "novembro": System.out.printf("Novembro");
			break;
			
			case "dezembro": System.out.printf("Dezembro");
			break;
		
			default: System.out.printf("Nao foi possivel entender");
		}
		
		System.out.printf(" de ");
		
		System.out.printf("%d",Ano);
	}
}
		