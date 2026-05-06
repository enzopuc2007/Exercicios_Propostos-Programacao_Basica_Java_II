//Programa 5 - Programa que arredonda um número real informado pelo usuário para quantas casas decimais o usuário solicitar

public class Program5 {
    public static void main(String[] args) {
        double numero, casas;

        numero = Double.parseDouble(System.console().readLine("Digite um numero real: "));
        casas = Double.parseDouble(System.console().readLine("Digite o numero de casas decimais: "));

        System.out.println(Math.round(numero * Math.pow(10, casas)) / Math.pow(10, casas));
    }
}