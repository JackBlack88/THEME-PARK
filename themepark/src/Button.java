public class Button {
   private double min;
   private double max;
   private int height;
   private int width;

   public Button(int height, int width, double min, double max) {
      setWidth(width);
      setHeight(height);
      setMax(max);
      setMin(min);

   }

   // encaptlation
   public void setWidth(int width) {
      this.width = width;
   }

   public void setHeight(int height) {
      this.height = height;
   }

   public void setMin(double min) {
      this.min = min;
   }

   public void setMax(double max) {
      this.max = max;
   }

   public int getHeight() {

      return height;
   }

   public int getWidth() {

      return width;
   }

   public double getMin() {
      return min;
   }

   public double getMax() {
      return max;
   }

}
