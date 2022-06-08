package FindMaximum;
public class IntNum<T extends Comparable<T>> {
    T[] values;
    public IntNum(T[] o) {
        values = o;
    }
    public T max() {
        T val = values[0];
        for (int i = 1; i < values.length; i++)
            if (values[i].compareTo(val) > 0)
                val = values[i];
        return val;
    }
}
