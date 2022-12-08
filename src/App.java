import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner tc = new Scanner(System.in);
        System.out.print("Por favor informe um número: ");
        int num1 = tc.nextInt();
        System.out.print("\nPor favor informe o segundo  número: ");
        int num2 = tc.nextInt();
        System.out.print("\nPor favor informe o terceiro numero: ");
        int num3 = tc.nextInt();
        tc.close();

        int soma = calcular(num1, num2, num3);
        System.out.println("\nA soma dos números informados é igual a: "+soma);
    }   

    static int calcular(int num1, int num2, int num3){
        int soma = num1 + num2 + num3;
        return soma;
    }
}