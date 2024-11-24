public class Customer {
    private String name;
    private int iteams;
    private int processTime;

    public Customer(String name, int iteams) {
        this.name = name;
        this.iteams = iteams;
        processTime = int (Math.random() * 10) *iteams;
    }
}
