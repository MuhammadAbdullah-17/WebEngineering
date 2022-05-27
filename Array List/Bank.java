import java.util.*;
public class Bank {
    Scanner in = new Scanner(System.in);
    ArrayList <AccountHolder>  persons;
    public Bank() {
        persons  = new  ArrayList <AccountHolder>();
    }
    public void AddNewRecord()
    {
        System.out.println("Enter Account Holder Name: ");
        String name = in.next();
        System.out.println("Enter Account Number: ");
        String accnum = in.next();
        System.out.println("Enter PIN: ");
        int pin = in.nextInt();
        System.out.println("Enter Amount for initial deposit: ");
        double amount = in.nextDouble();
        AccountHolder a = new AccountHolder(name, accnum, pin, amount);
        persons.add(a);
    }
    public void DisplayPerson(String accnum)
    {
        for (int i = 0; i< persons.size(); i++)
        {
            AccountHolder a = (AccountHolder) persons.get(i);
            if(accnum.equals(a.getAccNumber()))
            a.DisplayAccountHolder();
        }
    }
    public void Withdraw(String accnum, int amount)
    {
        for (int i = 0; i< persons.size(); i++)
        {
            AccountHolder a = (AccountHolder) persons.get(i);
            if(accnum.equals(a.getAccNumber()))
            a.setAmount(a.getAmount() - amount);
            System.out.println("Amount has been withdrawn from your account. Your remaining balance is:"+ a.getAmount());
        }
    }
    public void Transfer(String accnum1, String accnum2, int amount)
    {
        for (int i = 0; i< persons.size(); i++)
        {
            AccountHolder a = (AccountHolder) persons.get(i);
            if(accnum1.equals(a.getAccNumber()))
            a.setAmount(a.getAmount() - amount);
            if(accnum2.equals(a.getAccNumber()))
            a.setAmount(a.getAmount() + amount);
        }
    }
}
