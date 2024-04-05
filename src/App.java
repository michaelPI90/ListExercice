import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner entrada = new Scanner(System.in);
       System.out.println("Digite um número: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = entrada.nextInt();
        int soma = num1 * num2;
        System.out.println("A soma dos números é: " + soma);
    }
}
