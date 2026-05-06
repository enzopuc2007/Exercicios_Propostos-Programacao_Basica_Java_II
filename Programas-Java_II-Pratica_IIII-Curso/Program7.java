// Programa 7 - Programa que recebe dois numeros do usuário e faz uma das
// operações listadas

public class Program7 {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(System.console().readLine("Digite o primeiro numero: "));
        double num2 = Double.parseDouble(System.console().readLine("Digite o segundo numero: "));

        System.out.println("\nEscolha uma operacao:");
        System.out.println("1 - Elevar o primeiro numero pelo segundo numero");
        System.out.println("2 - Raiz quadrada de cada um dos numeros");
        System.out.println("3 - Raiz cubica de cada um dos numeros");

        int opcao = Integer.parseInt(System.console().readLine("Opcao: "));

        switch (opcao) {
            case 1:
                double potencia = Math.pow(num1, num2);
                System.out.println("Resultado de " + num1 + " elevado a " + num2 + ": " + potencia);
                break;
            case 2:
                System.out.println("Raiz quadrada do primeiro (" + num1 + "): " + Math.sqrt(num1));
                System.out.println("Raiz quadrada do segundo (" + num2 + "): " + Math.sqrt(num2));
                break;
            case 3:
                System.out.println("Raiz cubica do primeiro (" + num1 + "): " + Math.cbrt(num1));
                System.out.println("Raiz cubica do segundo (" + num2 + "): " + Math.cbrt(num2));
                break;
            default:
                System.out.println("Opcao invalida! Por favor, escolha 1, 2 ou 3.");
                break;
        }
    }
}