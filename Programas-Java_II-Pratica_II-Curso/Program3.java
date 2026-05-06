//Programa 3 - Exibe o quadrado do numero digitado até o numero digitado ser negativo

public class Program3{

	public static void main(String[] args){
	
		double Num,Quad_Num=0;
		
		//Loop parametrizado com solicitação ao usuario
		System.out.printf("Insira o numero a ser quadrado: ");
		Num = Double.parseDouble(System.console().readLine());
		
		while(Num>=0){
		
			Quad_Num = Num*Num;
			
			System.out.printf("O quadrado do numero %f eh: %f\n\n",Num,Quad_Num);
			
			System.out.printf("Insira o numero a ser quadrado: ");
			Num = Double.parseDouble(System.console().readLine());
		}
	}
}