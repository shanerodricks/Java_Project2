public class Pizza
{
  private String pizzaSize;
  private int numCheese = 0;
  private int numPepperoni = 0;
  private int numVeggies = 0;

  public Pizza(String pizzaSize, int numCheese, int numPepperoni, int numVeggies){
    this.pizzaSize = pizzaSize;
    this.numCheese = numCheese;
    this.numPepperoni = numPepperoni;
    this.numVeggies = numVeggies;
  }

  public Pizza(){
    pizzaSize = "small";
    numCheese = 1;
    numPepperoni = 0;
    numVeggies = 0;
  }

  public Pizza(Pizza originalPizza){
    pizzaSize = originalPizza.getpizzaSize();
    numCheese = originalPizza.getnumCheese();
    numPepperoni = originalPizza.getnumPepperoni();
    numVeggies = originalPizza.getnumVeggies();
  }

  public String getpizzaSize(){
    return pizzaSize;
  }

  public int getnumCheese(){
    return numCheese;
  }

  public int getnumPepperoni(){
    return numPepperoni;
  }

  public int getnumVeggies() {
    return numVeggies;
  }

  public double calcCost() {
    double cost;
    if(pizzaSize == "small") {
      cost = 10.0 + (2.0 * numCheese) + (2.0 * numPepperoni) + (2.0 * numVeggies);
    }
    else if(pizzaSize == "medium"){
      cost = 12.0 + (2.0 * numCheese) + (2.0 * numPepperoni) + (2.0 * numVeggies);
    }
    else {
      cost = 14.0 + (2.0 * numCheese) + (2.0 * numPepperoni) + (2.0 * numVeggies);
    }
    return cost;
  }

  public String toString(){
    String result = "";
    result = result + "Size: " + getpizzaSize() + "\n";
    result = result + "Cheese toppings: " + getnumCheese() + "\n";
    result = result + "Pepperoni toppings: " + getnumPepperoni() + "\n";
    result = result + "Veggie toppings: " + getnumVeggies() + "\n";
    result = result + "Cost: " + calcCost() + "\n";
    return result;

  }
}
