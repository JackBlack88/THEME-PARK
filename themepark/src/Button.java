public class Button {
   private boolean clicked;
   private int height;
   private int width;
   private String color;
   
   
public Button (String color, int height, int width){
setWidth(width);
setColor(color);
setHeight(height);

}
//encaptlation
   public String getColor(){
      
    return color;  
   }
   public int getHeight(){
      
      return height;  
     }
     public int getWidth(){
      
      return width;  
     }
     public boolean getClicked(){
      return clicked;  
     }
     public void setColor(String color){
this.color = color;
     }
   public void setWidth(int color){
      this.width = width;
     }
     public void setHeight(int color){
      this.height = height;
     }
}
