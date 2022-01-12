package ca.nait.dmit.domain;

public class Circle {
    private double radius;

    //Accesses a data field
    public double getRadius() {
        return radius;
    }

    //Allows us to change a field
    public void setRadius(double radius) {
        this.radius = radius;
    }


    //Checked exception example
//    public void setRadius(double radius) throws Exception {
//        if(radius <=0)
//        {
//            //Throw an exception if radius is <=0
//            //2 types of exceptions - a check exception and a runtime exception
//            //a check exception means if this exception is thrown we have to do something about it and need to specify that this method can throw an exception
//            throw new Exception("Radius must be greater than 0");
//        }
//        this.radius = radius;
//    }

    //Runtime exception
//    public void setRadius(double radius)
//    {
//        if(radius <= 0)
//        {
//            throw new RuntimeException("Radius must be greater than 0");
//        }
//        this.radius = radius;
//    }
}
