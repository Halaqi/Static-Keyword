import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     int r;
        System.out.println("Enter your radius:");
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
     Circle c = new Circle(r);
     Circle c1 = new Circle(5);
     Circle c2= new Circle(10);
     Circle c3= new Circle(15);
     int i;
     Circle [] circles = { c , c1, c2, c3};
    for (i=0 ;i<4;i++)
    {
        double area = circles[i].computeArea(r);
        System.out.println("Area of circle " + (i + 1) + ": " + area);
    }

   }
}
