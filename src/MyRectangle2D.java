public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width*height;
    }

    public double getPerimeter() {
        return 2*(height + width);
    }

    public boolean contains(MyRectangle2D r) {
        double topLeft = x - width/2 + height/2;
        double bottomLeft = x + width/2 - height/2;
        double bottomRight = x - width/2 - height/2;

        if (bottomLeft < r.x && bottomRight > r.x && topLeft > r.y && bottomLeft < r.y) {
            return true;
        }

        return false;
    }

    public boolean overlaps(MyRectangle2D r) {
        double topLeft = x - width/2 + height/2;
        double topRight = x + width/2 + height/2;
        double bottomLeft = x + width/2 - height/2;
        double bottomRight = x - width/2 - height/2;

        double rtopLeft = r.x - r.width/2 + r.height/2;
        double rtopRight = r.x + r.width/2 + r.height/2;
        double rbottomLeft = r.x + r.width/2 - r.height/2;
        double rbottomRight = r.x - r.width/2 - r.height/2;

        if (topLeft > rtopLeft && topRight > rtopRight && bottomLeft < rbottomLeft && bottomRight > rbottomRight) {
            return true;
        }

        return false;
    }
}
