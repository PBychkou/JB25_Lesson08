import java.util.Objects;

public class HW_18_1_BankAccount {
	public enum Currency {
        USD, EUR, BLR};
    
    private int number;
    private double ammount;
    private String owner;
    private Currency currency;

    public HW_18_1_BankAccount(String owner, int number, double ammount, Currency cur) {
        this.number = number;
        this.ammount = ammount;
        this.owner = owner;
        this.currency = cur;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        HW_18_1_BankAccount other = (HW_18_1_BankAccount) obj;
        if (number == 0) {
            if (other.number != 0)
                return false;
        } else if (number != other.number)
            return false;
        if (ammount == 0) {
            if (other.ammount != 0)
                return false;
        } else if (ammount != other.ammount)
            return false;
        if (owner == null) {
            if (other.owner != null)
                return false;
        } else if (!owner.equals(other.owner))
            return false;
        if (currency == null) {
            if (other.currency != null)
                return false;
        } else if (!currency.equals(other.currency))
            return false;
        return true;
    }


    @Override
    public int hashCode() {
        return Objects.hash(owner, number, ammount, currency);
    }

    @Override
    public String toString(){
        return "[" + "owner = " + owner + ", number = " + number + ", ammount = " + ammount + ", currency = " + currency + "]";
    }

}