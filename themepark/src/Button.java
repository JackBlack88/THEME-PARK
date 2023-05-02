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
      width = 100;
      return width;  
     }
     public boolean getClicked(){
      return clicked;  
     }
   
}
