//Programa 8 - Verificação senha do usuário

public class Program8{

	public static void main(String[] args){
	
		int Senha;
		
		do{
		
			System.out.printf("Insira a senha: ");
			Senha = Integer.parseInt(System.console().readLine());
			
		}while(Senha != 1234);
		
		System.out.printf("Senha correta. Acesso liberado!");
	}
}