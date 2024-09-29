package Exercise3;

abstract class Sortable {
    // Metode abstrak compare
    public abstract int compare(Sortable b);

    // Metode statis shell_sort untuk mengurutkan array Sortable
    public static void shell_sort(Sortable[] a) {
        int n = a.length;
        int gap = n / 2;

        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                Sortable temp = a[i];
                int j;
                for (j = i; j >= gap && a[j - gap].compare(temp) > 0; j -= gap) {
                    a[j] = a[j - gap];
                }
                a[j] = temp;
            }
            gap /= 2;
        }
    }
}
