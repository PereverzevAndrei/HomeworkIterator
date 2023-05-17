import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        while (true) {
            Randoms randoms = new Randoms(90, 110);
            Iterator<Integer> random = randoms.iterator();
            int r = random.next();
            if (r != 100) {
                System.out.println("Случайное число: " + r);
            } else {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}
