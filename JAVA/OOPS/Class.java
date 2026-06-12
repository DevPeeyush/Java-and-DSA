package OOPS;

class Pen{
    String color;
    String type; //Gel or ball

    public void printColor(){
        System.out.println(this.color);
    }
    public void getType(){
        System.out.println(this.type);
    }
}
public class Class {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "blue";
        p1.type = "gel";
        p1.printColor();
        p1.getType();

    }
}
