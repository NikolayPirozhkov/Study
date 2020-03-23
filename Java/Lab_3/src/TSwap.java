import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;

/**
 * @author NikolayPirozhkov
 * @project Java
 */
public class TSwap {
    public final <T> void swap (T[] a, final int i, final int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public  final <T> void swap (List<T> l, final int i, final int j) {
        Collections.swap(l, i, j);
    }

    public void swap(final Object array, final int i, final int j) {
        final Object atI = Array.get(array, i);
        Array.set(array, i, Array.get(array, j));
        Array.set(array, j, atI);
    }
}
