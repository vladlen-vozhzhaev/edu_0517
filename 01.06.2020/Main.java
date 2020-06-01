import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.print("Enter first num: ");
        a = scanner.nextInt();
        System.out.print("Enter second num: ");
        b = scanner.nextInt();

        if (a>b) {
            System.out.println("a больше b");
        }
        else if (a<b) {
            System.out.println("a меньше b");
        }
        else {
            System.out.println("a равен b");
        }



        /* Комментарий */
        /*float num1 = 15;
        float num2 = 7;
        System.out.println("Сумма: "+(num1 + num2));
        System.out.println("Разность: "+(num1-num2));
        System.out.println("Умножение: "+num1*num2);
        System.out.println("Деление: "+num1/num2);
        System.out.println("Остаток от деления: "+num1%num2);*/
    }
}
