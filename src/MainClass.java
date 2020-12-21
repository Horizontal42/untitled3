import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите скорость ветра:");
        int a = in.nextInt();
        switch (a)
        {
            case 1,2,3,4: System.out.println("Слабый"); break;
            case 5,6,7,9,10: System.out.println("Умеренный"); break;
            case 11,12,13,14,15,16,17,18: System.out.println("Сильный"); break;
            default: System.out.println("Ураганный");
        }
    }
}