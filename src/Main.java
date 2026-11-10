//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "qwerty", 12, "smth" );
        Product product2 = new Product(2, "asdfgh", 23, "smth");
        Product[] products1 = new Product[];
        Product[] products2 = new Product[];
        Product[] products3 = new Product[4];
        Order o1 = new Order("Jill", products1);
        Order o2 = new Order("Till", products2);
        Order o3 = new Order("Bill", products3);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product1.equals(product2));
        System.out.println();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("o1 equals o2: " + o1.equals(o2));
        System.out.println("o1 equals o3: " + o1.equals(o3));

    }

}