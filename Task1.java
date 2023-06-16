

public class Task1 {
    public static void main(String[] args) {
        //Rectangle r1 = new Rectangle();
        Rectangle s1 = new Rectangle(12, 4);

        //r1.calculateArea();
        s1.calculateArea();
        //r1.calculatePerimeter();
        s1.calculatePerimeter();

        Operator_1<Integer> num_1=(w,e)->(w*e);
        int s2 = num_1.apply(12,4);
        System.out.println("Площадь прямоугольника = " + s2);

        Parallelogram<Integer> num_2=(w,e)->(w*e);
        int s3 = num_2.apply(8,4);
        System.out.println("Площадь параллелограмма = " + s3);

        Square<Integer> num_3 = x -> x * x;
        int s4 = num_3.apply(4);
        System.out.println("Площадь квадрата = " + s4);

        UnaryOperator_1<Double> f1xf2 = x -> x * x * 3.14;
              
        System.out.print("Площадь круга = " + f1xf2.applyAsDouble(15.2));


    }
    
    
}
