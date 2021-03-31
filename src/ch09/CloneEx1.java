package ch09;

public class CloneEx1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point original = new Point(3, 5);
        Point copy = (Point) original.clone();
        System.out.println(original);
        System.out.println(copy);
    }
}

class Point implements Cloneable {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}
        return obj;
    }
}