import java.util.Scanner;
public class proc3 {


    public static void Mean(double X, double Y, double[] result) {
        if (X <= 0 || Y <= 0) {
            System.err.println("Ошибка: вводимые числа должны быть положительными!");
            result[0] = Double.NaN; //вывод ошибки на консоль
            result[1] = Double.NaN;
            return;
        }
        result[0] = (X + Y) / 2;
        result[1] = Math.sqrt(X * Y);
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
            
        double[] result = new double[2]; // массив для хранения AMean и GMean
    
        Mean(A, B, result);
        System.out.println("Среднее арифметическое (A, B): " + result[0]);
        System.out.println("Среднее геометрическое (A, B): " + result[1]);
    
        Mean(A, C, result);
        System.out.println("Среднее арифметическое (A, C): " + result[0]);
        System.out.println("Среднее геометрическое (A, C): " + result[1]);
    
        Mean(A, D, result);
        System.out.println("Среднее арифметическое (A, D): " + result[0]);
        System.out.println("Среднее геометрическое (A, D): " + result[1]);
       //вывод данных на консоль
    }
}

