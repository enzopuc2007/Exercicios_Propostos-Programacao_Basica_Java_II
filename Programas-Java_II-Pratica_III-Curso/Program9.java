//Programa 9 - Sequência Fibomacci

public class Program9{

	public static void main(String[] args){
		
		int a=1,b=1,Cont=4;
		
		System.out.printf("1,1");
		
		do{
			System.out.printf(",");
		
			a = a + b;
			
			System.out.printf("%d,",a);
			
			b = a + b;
			
			System.out.printf("%d",b);
			
			Cont--;
		}while(Cont>0);
		
		System.out.printf("\nO numero 10 da sequencia de Fibonacci eh: %d",b);
	}
}