package practical7.movable;

public class MovableRectangleDemo {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 0, 10, 5, 2, 3);
        System.out.println("До движения: " + rectangle);
        System.out.println("Скорости совпадают: " + rectangle.SpeedTest());
        rectangle.moveRight(); rectangle.moveDown(); rectangle.moveLeft(); rectangle.moveUp();
        System.out.println("После четырёх перемещений: " + rectangle);
    }
}
