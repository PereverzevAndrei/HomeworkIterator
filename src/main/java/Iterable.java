import java.util.Iterator;

public interface Iterable<Integer> {
    Iterator<java.lang.Integer> iterator();

    boolean hasNext();

}
