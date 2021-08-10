public class Main
{
  public static void main(String [] args) {
    Pizza pizza1 = new Pizza("small", 1, 0, 1);
    Pizza pizza2 = new Pizza("medium", 2, 2, 0);
    Pizza pizza3 = new Pizza("large", 2, 0, 0);
    PizzaOrder order = new PizzaOrder(3);
    System.out.println(order.addPizza(pizza1));
    System.out.println(order.addPizza(pizza2));
    System.out.println(order.addPizza(pizza3));


  }

}
