public class Main {
    public static void main(String[] args) {

        Point point = new Point(5.0f, 6.0f);
        MoveablePoint moveablePoint = new MoveablePoint(point.getX(), point.getY(), 6.0f, 7.0f);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
        moveablePoint.move();

    }
}