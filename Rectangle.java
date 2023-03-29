import java.util.*;
class Rectangle
{
public static void main(String args[])
{
int length,breadth,area,peri;

Scanner sc=new Scanner(System.in);
System.out.println("Please enter the length:");
length=sc.nextInt();
System.out.println("Please enter the breadth:");
breadth=sc.nextInt();

area=length*breadth;

System.out.println("Area of a rectangle is "+area);

peri=2*(length+breadth);

System.out.println("Perimeter of a rectangle is "+peri);
}
}