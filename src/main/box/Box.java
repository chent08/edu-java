
public class Box<T> {
    private T item1;
    private T item2;
    private int num;

    // Constructor
    public Box(T item1, T item2, int num) {
        this.item1 = item1;
        this.item2 = item2;
        this.num = num;
    }

    // Getters and Setters
    public T getItem1() {
        return item1;
    }

    public void setItem1(T item1) {
        this.item1 = item1;
    }

    public T getItem2() {
        return item2;
    }

    public void setItem2(T item2) {
        this.item2 = item2;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    
    public String toString() {
        return "Box{" +
                "item1=" + item1 +
                ", item2=" + item2 +
                ", num=" + num +
                '}';
    }
}
