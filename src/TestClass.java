public class TestClass {

    public static void main(String args[]) {
     ComputeMethods compute = new ComputeMethods();  
        double CelsiusTemp = compute.fToC(100.4);
        System.out.println("A temperatura em Celsius e: " + CelsiusTemp);
        double length = compute.hypotenuse(6, 9);
        System.out.println("Hypotenuse e " + length);
        int total = compute.roll();
        System.out.println("A soma dos valores dos dados e: " + total);
       
    }
}
