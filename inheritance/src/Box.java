
public class Box {
    private double width;
    private double height;
    private double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public Box(double size) {
        this.width = size;
        this.height = size;
        this.length = size;

    }
    public Box(Box box) {
        this.width = box.width;
        this.height = box.height;
        this.length = box.length;
    }
    public Box(Box box1, Box box2) {
        this.width = box1.width + box2.width;
        this.length = box1.length + box2.length;
        this.height = box1.height + box2.height;
    }

    public Box() {
    }
    public void showInfo() {
        System.out.println("Вес коробки  " + width  + " Длина коробки  " + length  + " Высота коробки  " +  height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public Box increase(int i) {
        return new Box(width *i, height *i, length*i);
    }
    public Box sumBox(Box box) {
        return new Box(this.width + box.width, this.height + box.height, this.length + box.length);
    }

    public double volume()  {
        return width * height * length;

    }
    public void showVolume() {
        double volume = width * height * length;
        System.out.println(volume);
    }
    public int compare(Box box) {
        double thisVolume = volume();
        double boxVolume = box.volume();
        if (thisVolume > boxVolume) {
            return 1;
        }else if (thisVolume < boxVolume) {
            return -1;
        }else {
            return 0;
        }

    }

}
