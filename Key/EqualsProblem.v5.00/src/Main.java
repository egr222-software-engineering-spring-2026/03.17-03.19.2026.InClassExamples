public class Main {
    public static void main(String[] args) {
        Point p1 = new Point3D(4,5, 0);
        Point p2 = new Point3D(4,5, 6);
        Point p3 = new Point(4,5);
        Point p4 = new Point(4,5);
        Point p5 = new Point3D(4,5, 6);

        System.out.println("p1 == p2 " + (p1 == p2) + "\t\t\t\t\t(FALSE because p1 and p2 are different objects)");
        System.out.println("p1 == p3 " + (p1 == p3) + "\t\t\t\t\t(FALSE because p1 and p2 are different objects)");
        System.out.println("p3 == p2 " + (p3 == p2) + "\t\t\t\t\t(FALSE because p1 and p2 are different objects)");

        System.out.println("p1.equals(p2) " + (p1.equals(p2)) + "\t\t\t\t(should be FALSE because the STATE of p1 and p2 are NOT the same)");
        System.out.println("p1.equals(p3) " + (p1.equals(p3)) + "\t\t\t\t(should be FALSE because the p1 and p3 are NOT the same TYPE)");
        System.out.println("p3.equals(p2) " + (p3.equals(p2)) + "\t\t\t\t(should be FALSE because the p3 and p2 are NOT the same TYPE)");
        System.out.println("p2.equals(p3) " + (p2.equals(p3)) + "\t\t\t\t(should be FALSE because the p2 and p3 are NOT the same TYPE)");
        System.out.println("p2.equals(p3) " + (p3.equals(p4)) + "\t\t\t\t(should be TRUE because the STATE of p3 and p4 ARE the same)");
        System.out.println("p2.equals(p3) " + (p5.equals(p2)) + "\t\t\t\t(should be TRUE because the STATE of p5 and p2 ARE the same)");

        System.out.println("Other: " + p1.equals("Hello World!") + "\t\t\t\t\t(should be FALSE because p1 is NOT a String object");
    }
}
