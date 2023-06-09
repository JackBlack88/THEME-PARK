public class TargetButton extends Button { // Inheritance from the button class
   private double min;
   private double max;

   public TargetButton(int height, int width, double min, double max) {
      super(height, width);
      setMax(max);
      setMin(min);
   }

   // Encaptlation
   public void setMin(double min) {
      this.min = min;
   }

   public void setMax(double max) {
      this.max = max;
   }

   public double getMin() {
      return min;
   }

   public double getMax() {
      return max;
   }

}
