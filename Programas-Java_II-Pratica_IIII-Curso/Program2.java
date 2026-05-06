//Programa 2 - Programa que mostra os numeros de 0 a 100 ao lado de seus respectivos binários

public class Program2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i + " - " + Integer.toBinaryString(i));
        }
    }
}