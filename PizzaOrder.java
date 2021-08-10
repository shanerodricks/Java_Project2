public class PizzaOrder
{
  private Pizza[] order;
  private int numPizzas;

  public PizzaOrder() {
    this.numPizzas = 1;
    order = new Pizza[1];
    Pizza pizzaOrder1 = new Pizza();
    order[0] = pizzaOrder1;
  }

  public PizzaOrder(int orderSize){
    this.numPizzas = 0;
    order = new Pizza[orderSize];
  }

  public int addPizza(Pizza pizzaOrder1){
    if(numPizzas >= order.length) {
      return -1;
	   }
    order[numPizzas] = pizzaOrder1;
  	numPizzas += 1;
	  return 1;
  }

  public double calcTotal() {
    double totalCost = 0.0;
    for(int i = 0; i < order.length; i++)
    {
      totalCost = totalCost + order[i].calcCost();
    }
    return totalCost;

  }

  public String toString() {
    String result1;
    for(int i = 0; i < order.length; i++)
    {
      order[i].toString();
    }
    result1 = "Total cost = $ " + calcTotal();
    return result1;
  }
}
