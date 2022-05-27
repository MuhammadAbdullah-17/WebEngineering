public class AccountHolder {
    String name, accNumber;
    int pin;
    double amount;
    AccountHolder(String n, String acc, int p, double a)
    {
        name = n;
        accNumber = acc;
        pin = p;
        amount = a + 1000;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAccNumber(String accNumber)
    {
        this.accNumber = accNumber;
    }
    public void setPin(int pin)
    {
        this.pin = pin;
    }
    public void setAmount(double amount)
    {
        this.amount = amount;
    }
    public String getName(){
        return name;
    }
    public String getAccNumber(){
        return accNumber;
    }
    public int getPin(){
        return pin;
    }
    public double getAmount(){
        return amount;
    }
    public void DisplayAccountHolder()
    {
        System.out.println("Name of Account Holder: "+ this.getName() +
        "\nAccount Number: "+ this.getAccNumber()
        + "\nPIN Code: "+ this.getPin()
        + "\nAmount: "+ this.getAmount()
        );
    }

public static void main(String args[])
{
    //AccountHolder a = new AccountHolder("mak","02000222", 2222, 4000.53);
    //a.DisplayAccountHolder(); 
    Bank b = new Bank();
    b.AddNewRecord();
    b.AddNewRecord();
    b.DisplayPerson("123");
    b.DisplayPerson("456");
    b.Transfer("123", "456", 500);
    b.DisplayPerson("123");
    b.DisplayPerson("456");
    //b.DisplayPerson("12356");
    //b.Withdraw("123456", 500);

}
}
