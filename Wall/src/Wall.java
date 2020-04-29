public class Wall {
    //fields
    private double width;
    private double height;

    //constructors
    public Wall(){
        this(0, 0);
    }

    public Wall(double width, double height) {

        if(width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (height < 0) {
            this.height = 0;
        } else
            this.height = height;
    }

    // get
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    //set
    public void setWidth(double width) {
        if(width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else
            this.height = height;
    }

    //getArea
    public double getArea() {
        return getWidth() * getHeight();
    }

}
