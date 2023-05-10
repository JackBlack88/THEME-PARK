public class Button {
    private int height;
    private int width;

    // Constructor for the button class that takes in two perimeters: height and
    // width
    public Button(int height, int width) {
        //constructor sets height and width using the "setHeight" and "setWidth" methods
        setWidth(width);
        setHeight(height);

    }

    // Setter method
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Getter method
    public int getHeight() {

        return height;
    }

    public int getWidth() {

        return width;
    }
}
