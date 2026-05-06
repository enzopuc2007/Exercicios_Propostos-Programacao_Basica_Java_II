//Programa 4 - Calcula as raizes de uma equação do segundo grau com os parametros A, B e C 

public class Program4 {
    public static void main(String[] args) {
        double a, b, c, delta;

        a = Double.parseDouble(System.console().readLine("Digite o valor de a: "));
        b = Double.parseDouble(System.console().readLine("Digite o valor de b: "));
        c = Double.parseDouble(System.console().readLine("Digite o valor de c: "));

        delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Nao tem raizes reais");
        } else if (delta == 0) {
            System.out.println("Tem uma raiz real");
            System.out.println((-b + Math.sqrt(delta)) / (2 * a));
        } else {
            System.out.println("Tem duas raizes reais");
            System.out.println((-b + Math.sqrt(delta)) / (2 * a));
            System.out.println((-b - Math.sqrt(delta)) / (2 * a));
        }
    }
}
