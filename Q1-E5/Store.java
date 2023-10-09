import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
    itemList = new ArrayList();
    this.name = name;
    this.earnings=0;
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
    if (index<=itemList.size()-1){
      Item dummyItem = itemList.get(index);
      this.earnings+=dummyItem.getCost();
      System.out.printf("You sold this item: %s for the price of: %.0f\n", dummyItem.getName(), dummyItem.getCost());
    } else {
      System.out.println("Error 001: This index does not exist.");
    }
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
    boolean hasBeenFound=false;
    for(Item i : itemList){
      if (name.equals(i.getName())){
        hasBeenFound=true;
        this.earnings+=i.getCost();
        System.out.printf("You sold this item: %s for the price of: %.0f\n", i.getName(), i.getCost());
        return;
      }
    }
    if (hasBeenFound==true){
      System.out.println("Error 002: Entered name is not an item.");
    }
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
    if (itemList.contains(i)){
      this.earnings+=i.getCost();
      System.out.printf("You sold this item: %s for the price of: %.0f\n", i.getName(), i.getCost());
    } else {
      System.out.println("Error 003: Store does not contain this item.");
    }

  }
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
    System.out.printf("You added %s to %s's inventory.\n",i.getName(),this.name);
  }

  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    System.out.printf("The following are the available %s in %s.\n", type, this.name);
    for(Item i: itemList){
      if(type.equals(i.getType())){
        System.out.printf("Item: %s, Cost: %.0f\n", i.getName(), i.getCost());
      }
    }
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    System.out.printf("The following are items in %s with a cost lower than or equal to %.0f\n",this.name, maxCost);
    for(Item i: itemList){
      if(maxCost>=i.getCost()){
        System.out.printf("Item: %s, Cost: %.0f\n", i.getName(), i.getCost());
      }
    }
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    System.out.printf("The following are items in %s with a cost higher than or equal to %.0f\n",this.name, minCost);
    for(Item i: itemList){
      if(minCost<=i.getCost()){
        System.out.printf("Item: %s, Cost: %.0f\n", i.getName(), i.getCost());
      }
    }
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    System.out.println("Here are the list of stores and their earnings too.");
    for(Store i: storeList){
      System.out.printf("Store name: %s, with earnings %.0f\n", i.getName(), i.getEarnings());
    }
  }
}
