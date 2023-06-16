public class Rectangle {
    double wight;
    double height;

    // public Rectangle() {
    //     height = 8;
    //     wight = 2;
    // }

    public Rectangle(double height, double wight ) {
        this.height = height;
        this.wight = wight;
    }
    void calculateArea() {
        System.out.println("Площадь прямоугольника = " + height * wight);
    }
    void calculatePerimeter() {
        System.out.println("Периметр прямоугольника = " + (height + wight) * 2);
    }

//     void setWight(double wight) {
//         this.wight = wight;
// }
//     void setHeight(double height) {
//         this.height = height;
// }
//     double getWight() {
//         return wight;
// }
//     double getHeight() {
//         return height;
//     }    

}
