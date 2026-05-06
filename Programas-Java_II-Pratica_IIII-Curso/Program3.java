//Programa 3 - Programa que lê uma string em binario e converte para decimal

public class Program3 {
    public static void main(String[] args) {
        String binario = null;

        binario = System.console().readLine();

        int decimal = Integer.parseInt(binario, 2);
        System.out.println(decimal);
    }
}
