package movable;

public class TestMovable {
    public static void main(String[] args){
        MovableCircle b = new MovableCircle(3, 5, 7,8,9 );
        MovablePoint h = new MovablePoint(4,6,7,3);
        MovableRectangle g = new MovableRectangle(4,6,2,9,1,8);
        System.out.println(b);
        System.out.println(h);
        System.out.println(g);
    }
}
