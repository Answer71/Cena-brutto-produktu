import java.lang.invoke.SwitchPoint;

public class Main {
    public static void main(String[] args) {
        Category books = new Category(0.05);
        Category toys = new Category(0.22);
        Product book1 = new Product("Quo Vadis", "książka historyczna", 25.99, books);
        Product toy1 = new Product("Rewolver", "Pistolet zabawkowy", 54.89, toys);

        Switch (books) {
            case 0.13:

                System.out.println(netPrice*books);
        }


    }
}
