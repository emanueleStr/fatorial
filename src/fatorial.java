import java.util.Scanner;

public class fatorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos descobrir o valor fatorial de um número:");

        System.out.println("Por favor, digite um número inteiro: ");
        int num = sc.nextInt();

        long fatorial = 1;

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        System.out.println(num + "! = " + fatorial);
    }
}
