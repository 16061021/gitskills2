import java.util.*;
interface Animal{
    public void eat();
    public void travel();
}
public class Main implements Animal{
    public void eat(){
        System.out.println("eats");
    }
    public void travel(){
        System.out.println("travels");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.close();
        Main m = new Main();
        m.eat();
        m.travel();
    }
}
