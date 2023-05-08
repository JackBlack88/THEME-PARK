public class Frame {
    private int height;
    private int width;

    public Frame(int height, int width) {
        setWidth(width);
        setHeight(height);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {

        return height;
     }
  
     public int getWidth() {
  
        return width;
     }
}
