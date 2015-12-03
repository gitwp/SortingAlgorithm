package algorithm.sort.common;

/**
 * Created by gitwp on 15-12-3.
 */
public interface Sortable {
    /**
     * Sort the given array which consists of child class of {@link Comparable}<br/>
     *
     * @param array
     * @param ascend
     *            if true, using ascend, else using descend
     */
    <T extends Comparable<T>> void sort(T[] array, boolean ascend);
}
