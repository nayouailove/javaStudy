package etc.access.ex;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("마늘", 200,2);
        Item item2 = new Item("상추 ", 3000,23);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItem();
    }
}
