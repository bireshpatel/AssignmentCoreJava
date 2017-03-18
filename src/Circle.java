class Circle
{
    float radius;

    //final is used to declare constants

    final float PI = 3.14f;
    //a final member may or may not be static

    public Circle()
    {
        radius = 50;
    }

    public Circle(float r)
    {
        radius = r;
    }

    public void displayArea()
    {
        float result = PI*radius*radius;

        System.out.println("Area is:"+result);
    }

    public void displayCircum()
    {
        float ccf = 2*PI*radius;

        System.out.println("Circumference is:"+ccf);
    }

}

