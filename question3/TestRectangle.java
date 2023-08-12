public class TestRectangle {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 3);
        MyPoint point2 = new MyPoint(6, 1);

        MyRectangle rectangle1 = new MyRectangle(point1, point2);
        System.out.println("Rectangle 1: " + rectangle1);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        MyRectangle rectangle2 = new MyRectangle(2, 4, 7, 0);
        System.out.println("Rectangle 2: " + rectangle2);
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
    }
}
