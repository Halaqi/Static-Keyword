public class Circle {
    private static double Pl = 3.141519;
    private int radius;
    Circle (int r)
    {
        radius = r;
    }

    double computeArea(double r)
    {
        double area = Pl*(radius*radius);
        return area;
    }
}
