import java.util.ArrayList;
import java.util.Scanner;

public class HW_18_2_Payment {

    ArrayList<HW_18_2_Items> itemsList;
    Scanner sc;

    public HW_18_2_Payment() {
        itemsList = new ArrayList<>();
        sc = new Scanner(System.in);
    }

   public ArrayList<HW_18_2_Items> getItemsList() {
        return itemsList;
    }

    public void setItemsList(ArrayList<HW_18_2_Items> itemsList) {
        this.itemsList = itemsList;
    }

    public void addItems() {
        String answer = "yes";
        while(!answer.equals("no")){
            HW_18_2_Items item = HW_18_2_Payment.enterItem();
            itemsList.add(item);
            System.out.println("Add one more item? (yes or no)");
            answer = sc.nextLine();
        }
    }
    public static HW_18_2_Items enterItem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to buy?");
        String itemName = sc.nextLine();
        System.out.println("How much does it cost?");
        while (!sc.hasNextDouble()){
            sc.next();
        }
        double itemPrice = sc.nextDouble();
        System.out.println("How much " + itemName + " items do you want to buy?");
        int itemNum = sc.nextInt();
        double itemSum = itemPrice * itemNum;
        HW_18_2_Items item = new HW_18_2_Items(itemName, itemPrice, itemNum, itemSum);
        return item;
    }

    public void printCheck(){
        double sum=0;
        System.out.println("Your order includes: ");
        System.out.println ("-------------------------------------------------------");
        for (HW_18_2_Items item: itemsList) {
            System.out.println(item.toString());
            System.out.println ("-------------------------------------------------------");
            sum = sum + item.getItemTotalSum();
        }
        System.out.println("Total sum of your order is: $" + sum);
    }
}