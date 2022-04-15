public class Triagle extends Figure{

    public  int c;

    public Triagle(int a, int b, int a1, int b1, int c) {
        super(a, b);
        this.c = c;
    }
    public Triagle(int size) {
        super(size, size);
        this.c = size;
    }

    @Override
    public double area() {
        int p = (getA() * getB() * c) / 2;
        int s = p * (p - getA()) * (p - getB()) * (p - c);
        return  Math.sqrt(s);
    }


}

