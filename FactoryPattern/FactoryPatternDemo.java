public class FactoryPatternDemo {

    public static void main(String[] args) {
      ShapeFactoryClass ShapeFactoryClass = new ShapeFactoryClass();
 
       //获取 Circle 的对象，并调用它的 draw 方法
       Shape shape1 = ShapeFactoryClass.getShape("CIRCLE");
 
       //调用 Circle 的 draw 方法
       shape1.draw();
 
       //获取 Rectangle 的对象，并调用它的 draw 方法
       Shape shape2 = ShapeFactoryClass.getShape("RECTANGLE");
 
       //调用 Rectangle 的 draw 方法
       shape2.draw();
 
       //获取 Square 的对象，并调用它的 draw 方法
       Shape shape3 = ShapeFactoryClass.getShape("SQUARE");
 
       //调用 Square 的 draw 方法
       shape3.draw();
    }
 }