public class circle extends polygon {
    circle(double r){
        super(r,r);
    }

    @Override
    void getArea() {
        double result= 3.1416*dim1*dim2;
        System.out.println("circle area: "+result);
    }
}
