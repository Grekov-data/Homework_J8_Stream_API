import java.util.Random;
import java.util.Scanner;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        //ÂÈÑÎÊÎÑÍÛÅ ÃÎÄÀ:
        System.out.println("çàäàíèå - ÂÈÑÎÊÎÑÍÛÅ ÃÎÄÀ.");
        System.out.print("Ââåäèòå äèàïàçîí ëåò, äëÿ âû÷èñëåíèÿ âèñîêîñíûõ:\n" +
                "îò ");
        int a = S.nextInt();
        System.out.print("äî ");
        int b = S.nextInt();
        System.out.println("Âèñîêîñíûå ãîäà:");
        IntStream.rangeClosed(a, b)
                .filter(n -> n% 400 == 0 || (n% 4 == 0 && n% 100 != 0))
                .forEach(System.out::println);

        //ÐÀÑÏÐÅÄÅËÅÍÈÅ ÏÎ ÇÀÊÎÍÓ ÍÎÐÌÀËÜÍÎÃÎ ÐÀÑÏÐÅÄÅËÅÍÈß
        System.out.println("çàäàíèå - ÐÀÑÏÐÅÄÅËÅÍÈÅ ÏÎ ÇÀÊÎÍÓ ÍÎÐÌÀËÜÍÎÃÎ ÐÀÑÏÐÅÄÅËÅÍÈß.");
        System.out.print("Ââåäèòå êîë-âî çàðïëàò - ");
        int c = S.nextInt();

        Random random = new Random();

        DoubleStream.generate(() -> random.nextGaussian(0,1)*11190 + 29267)
                .limit(c)
                .forEach(System.out::println);
    }
}