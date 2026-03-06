public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(5,3);
        Point p2 = new Point(5,3);
        Point p3 = p2;

        System.out.println("p1 == p2 " + (p1 == p2) + "\t\t\t\t\t(false because p1 and p2 are different objects)");
        System.out.println("p1 == p3 " + (p1 == p3) + "\t\t\t\t\t(false because p1 and p3 are different objects)");
        System.out.println("p3 == p2 " + (p3 == p2) + "\t\t\t\t\t(true because p2 and p3 reference the SAME object)");

        System.out.println("p1.equals(p2) " + (p1.equals(p2)) + "\t\t\t\t(should be true because the STATE of p1 and p2 are the same)");
        System.out.println("p1.equals(p3) " + (p1.equals(p3)) + "\t\t\t\t(should be true because the STATE of p1 and p3 are the same)");
        System.out.println("p3.equals(p2) " + (p3.equals(p2)) + "\t\t\t\t(should be true because the STATE of p2 and p3 are the same - they are the same object)");
//
        System.out.println("Other: " + p1.equals("Hello World!") + "\t\t\t\t\t(should be false because p1 is NOT a String object");
    }
}