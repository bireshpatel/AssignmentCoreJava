public class FinalDemo {
    public static void main(String args[]) {
        final double ABC = 1.34;

        //ABC = 4.56;//compiler error, since ABC is final
        Circle obj;
        obj = new Circle();
        obj.displayArea();

        obj.displayCircum();

        //object can also eb declared as final
        final Circle obj1 = new Circle(8.32f);
        obj1.displayArea();

        obj1.displayCircum();

        //obj1 = new Circle(4.5f);//error, since obj1 is final
    }

}