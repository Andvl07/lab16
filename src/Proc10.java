import java.util.Scanner;
public class Proc10 {

    public static void Swap(double X, double Y) {
        double temp = X;
        X = Y;
        Y = temp;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение A: ");
        double A = in.nextInt();
        System.out.print("Введите значение B: "); //ввод данных в программу
        double B = in.nextInt();
        System.out.println("Введите значение C: ");
        double C = in.nextInt();
        System.out.println("Введите значение D:");
        double D = in.nextInt();
        in.close();

        System.out.println("Исходные значения: A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);

        // перемена содержимого переменных А и В
        Swap(A, B);
        A = (A + B)/2; 
        B = (A + B)/2;
        System.out.println("Результат смены содержимого А и В: А = " + A + ", B = " + B + ", C = " + C + ", D = " + D);



        // перемена содержимого переменных С и D
        Swap(C, D);
        C = (C + D)/2;
        D = (C + D)/2;
        System.out.println("результат смены содержимого C и D: A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);


        // перемена содержимого переменных В и С
        Swap(B, C);
        B = (B + C)/2;
        C = (B + C)/2;
        System.out.println("результат смены содержимого В и С: A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);


    }
}
