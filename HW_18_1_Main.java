public class HW_18_1_Main {

	
    public static void main(String[] args) {

        HW_18_1_BankAccount account1 = new HW_18_1_BankAccount("Chris Froom", 986532, 125.35, HW_18_1_BankAccount.Currency.USD);
        HW_18_1_BankAccount account2 = new HW_18_1_BankAccount("Richie Port", 12354, 560012.02, HW_18_1_BankAccount.Currency.BLR);
        HW_18_1_BankAccount account3 = new HW_18_1_BankAccount("Nairo Kintana", 12841, -6941.124, HW_18_1_BankAccount.Currency.EUR);
        
        System.out.println("Hashcode of the account1 " + account1 + " is " + account1.hashCode());
        System.out.println("Hashcode of the account2 " + account2 + " is " + account2.hashCode());
        System.out.println("Hashcode of the account3 " + account3 + " is " + account3.hashCode());
        System.out.println("--------------------------------------");
        
        if (account1.equals(account2)) {
        	System.out.println("BankAccount1 is equal to BankAccount2");
        }
        else {
        	System.out.println("BankAccount1 is not equal to BankAccount2");
        }
        if (account2.equals(account3)) {
        	System.out.println("BankAccount2 is equal to BankAccount3");
        }
        else {
        	System.out.println("BankAccount2 is not equal to BankAccount3");
        }
        if (account3.equals(account1)) {
        	System.out.println("BankAccount3 is equal to BankAccount1");
        }
        else {
        	System.out.println("BankAccount3 is not equal to BankAccount1");
        }      
    }
}