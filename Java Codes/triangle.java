//Q- WAP to accept 3 sides of a triangle, check and display if the triangle is possible.
public class triangle {
    public static void main(String[] args, int a, int b, int c) {
        if((a+b)>c && (b+c)>a && (a+c)>b)
        System.out.println("Triangle is possible");
        else
        System.out.println("Triangle is not possible");
    }
}
