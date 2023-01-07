public class Shoop {
    public static void main(String[] args) {
        Product product1 = new Product("Mleko", 4.89);
        Product product2 = new Product("Mleko", 4.89);

        System.out.println(product1==product2);//F - różne obiekty
        System.out.println(product1.equals(product2));//trzeba dostarczyć implementację metody equals
    }
}
