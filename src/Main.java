import java.util.Random;
import java.util.Scanner;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        //���������� ����:
        System.out.println("������� - ���������� ����.");
        System.out.print("������� �������� ���, ��� ���������� ����������:\n" +
                "�� ");
        int a = S.nextInt();
        System.out.print("�� ");
        int b = S.nextInt();
        System.out.println("���������� ����:");
        IntStream.rangeClosed(a, b)
                .filter(n -> n% 400 == 0 || (n% 4 == 0 && n% 100 != 0))
                .forEach(System.out::println);

        //������������� �� ������ ����������� �������������
        System.out.println("������� - ������������� �� ������ ����������� �������������.");
        System.out.print("������� ���-�� ������� - ");
        int c = S.nextInt();

        Random random = new Random();

        DoubleStream.generate(() -> random.nextGaussian(0,1)*11190 + 29267)
                .limit(c)
                .forEach(System.out::println);
    }
}