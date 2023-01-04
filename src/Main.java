import java.util.Random;
import java.util.Scanner;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        //ВИСОКОСНЫЕ ГОДА:
        System.out.println("задание - ВИСОКОСНЫЕ ГОДА.");
        System.out.print("Введите диапазон лет, для вычисления високосных:\n" +
                "от ");
        int a = S.nextInt();
        System.out.print("до ");
        int b = S.nextInt();
        System.out.println("Високосные года:");
        IntStream.rangeClosed(a, b)
                .filter(n -> n% 400 == 0 || (n% 4 == 0 && n% 100 != 0))
                .forEach(System.out::println);

        //РАСПРЕДЕЛЕНИЕ ПО ЗАКОНУ НОРМАЛЬНОГО РАСПРЕДЕЛЕНИЯ
        System.out.println("задание - РАСПРЕДЕЛЕНИЕ ПО ЗАКОНУ НОРМАЛЬНОГО РАСПРЕДЕЛЕНИЯ.");
        System.out.print("Введите кол-во зарплат - ");
        int c = S.nextInt();

        Random random = new Random();

        DoubleStream.generate(() -> random.nextGaussian(0,1)*11190 + 29267)
                .limit(c)
                .forEach(System.out::println);
    }
}
