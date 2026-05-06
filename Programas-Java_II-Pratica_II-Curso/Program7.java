//Programa 7 - Apresenta os quadrados dos numeros inteiros de 15 a 200

public class Program7{

	public static void main(String[] args){
	
		int Num=15,Res;
		
		while(Num<=200){
		
			Res = Num*Num;
			
			System.out.printf("O quadrado do numero %d eh: %d \n",Num,Res);
			
			Num = Num+1;
		}
	}
}
		