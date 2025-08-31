public class Area {
    public  double areaOfCircle(double radius){
        double area = 3.14 * radius*radius;
        return area;
    }

    public static void main(String[] args) {
        Area circleArea = new Area();
        System.out.println("Area of circle is = "+ circleArea.areaOfCircle(5));
    }

}
