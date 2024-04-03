interface Shape {
    void draw();
    static int a = 10;
  }
  
interface Color {
    void fillColor();
  }
  
class Square implements Shape {
    @Override
    public void draw() {
      System.out.println("Drawing a square");
    }
  }
  
  class Red implements Color {
    @Override
    public void fillColor() {
      System.out.println("Filling with red color");
    }
  }
  
  class RedSquare extends Square implements Color {
    @Override
    public void fillColor(){
    //   super.fillColor(); // Call parent method if needed
    }
  }
  
  public class MultipleInheritance {
    public static void main(String[] args) {
      RedSquare redSquare = new RedSquare();
      redSquare.draw();
      redSquare.fillColor();
    }
  }
