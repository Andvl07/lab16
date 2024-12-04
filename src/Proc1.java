

import java.util.Scanner;
//все задачи сделал в одной программе для каждой, в целях экономии времени
public class Proc1 {

    
    public static void PowerA3(double A, double[] B) { //инициализация метода
        B[0] = A * A * A; 
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение x (начало промежутка): ");
        double x = in.nextInt();
        System.out.print("Введите значение y (конец промежутка) "); //ввод данных в программу
        double y = in.nextInt();
        in.close();

        double sumCubes = 0; //переменная для хранения данных во время цикла и последующего вывода на консоль, значение B присваивается именно ей
        double[] cube = new double[1]; //массив для хранения куба

        for (double i = x; i <= y; i++) { //цикл для перебора значение от х по y включительно
            PowerA3(i, cube); //использование созданного метода
            sumCubes += cube[0];
        }

        System.out.printf("Сумма кубов равна:" + sumCubes); //вывод данных
    }
}