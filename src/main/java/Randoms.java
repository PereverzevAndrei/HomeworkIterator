import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;

    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            Random random = new Random();

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {

                return random.nextInt((int) (min + Math.random() * max));
            }
        };
    }
}

