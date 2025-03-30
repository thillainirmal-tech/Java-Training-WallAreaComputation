public class Wall {

    private double width;
    private double height;

    // == Constructors ==
    public Wall() {
        this.width = 0.0;
        this.height = 0.0;
    }

    public Wall(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    // == Getters and Setters ==
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = (width < 0) ? 0 : width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = (height < 0) ? 0 : height;
    }

    // == Utility Method ==
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return String.format("Wall [Width: %.2f, Height: %.2f, Area: %.2f]", 
                width, height, getArea());
    }

    // == Main Method for Testing ==
    public static void main(String[] args) {
        Wall wall1 = new Wall(5.5, 4.0);
        System.out.println(wall1);

        // Testing negative values
        Wall wall2 = new Wall(-3, -2);
        System.out.println(wall2);

        // Testing setters
        wall2.setWidth(10.0);
        wall2.setHeight(7.5);
        System.out.println(wall2);
    }
}
