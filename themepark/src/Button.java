public class Button {
private double xValue;
private double yValue;
   private int height;
   private int width;


   public Button(int height, int width) {
      setWidth(width);
      setHeight(height);

   }
   // encaptlation
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
