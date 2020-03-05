import java.util.Collections;
import java.util.List;

/**
 * @author NikolayPirozhkov
 * @project Java
 */
public class Main {
    public final <T> void swap (T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public  final <T> void swap (List<T> l, int i, int j) {
        Collections.swap(l, i, j);
    }
    public static void main(String[] args) {

    }
}
