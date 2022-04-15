public class React extends Figure{
    int a;
    int b;


    public React(int a, int b) {
        super(a, b);
    }



    public React (int size) {

        super(size, size);
    }

    @Override
    public double area() {
        return getA() * getB();
    }
}
