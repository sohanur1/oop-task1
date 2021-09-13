public class triangle extends polygon {
    triangle(double dim1,double dim2){
        super(dim1,dim2);
    }

    @Override
    void getArea() {
        double result=0.5*dim1*dim2;
        System.out.println("triangle area: "+result);
    }
}
