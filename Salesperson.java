package StudiKasus3;

public class Salesperson implements Comparable<Salesperson> {
    private String firstName, lastName;
    private int totalSales;

    public Salesperson(String first, String last, int sales) {
        this.firstName = first;
        this.lastName = last;
        this.totalSales = sales;
    }

    // Method toString untuk menampilkan data sales
    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    // Method equals untuk membandingkan dua objek berdasarkan nama
    public boolean equals(Object other) {
        return lastName.equals(((Salesperson) other).getLastName()) &&
                firstName.equals(((Salesperson) other).getFirstName());
    }

    // Method compareTo untuk membandingkan objek berdasarkan total sales
    public int compareTo(Salesperson other) {
        if (this.totalSales != other.totalSales) {
            return this.totalSales - other.totalSales;
        } else {
            return this.lastName.compareTo(other.lastName);
        }
    }

    // Getter untuk firstName
    public String getFirstName() {
        return firstName;
    }

    // Getter untuk lastName
    public String getLastName() {
        return lastName;
    }

    // Getter untuk totalSales
    public int getSales() {
        return totalSales;
    }
}
