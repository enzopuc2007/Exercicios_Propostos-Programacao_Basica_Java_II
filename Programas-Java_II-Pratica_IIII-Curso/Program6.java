//Programa 6 - Programa que simula o lançamento de um dado entre 1 a 6, e mostre a face sorteada

public class Program6 {
    public static void main(String[] args) {
        int dado = (int) (Math.random() * 6) + 1;
        System.out.println("Face sorteada: " + dado);
    }
}
