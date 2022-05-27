public class ObjectsArray {
    public static void main(String args[]) {
        Account[] a = new Account[2];
        a[0] = new Account();
        a[0].SetData(2, 3," Ali");
        a[1] = new Account();
        a[1].SetData(3.4,5," Murad");
        for(int i = 0;i<2;i++)
        {
            a[i].ShowData();
        }
    }
}

class Account extends Name{
    int  b;
    int a;

    Account() {
        a = 0;
        b = 0;
    }
    Account(int x,int y) {
        a = x;
        b = y;
    }
    
    void SetData(double a, int b, String name) {
        this.a = (int)a;
        this.b = b;
        this.SetName(name);
    }

    void ShowData() {
        System.out.println("Name: " + name);
        System.out.println("Element 1: " + a);
        System.out.println("Element 2: " + b);
    }
}
class Name{
    String name;
    Name(String name)
    {
        this.name=name;
    }
    Name()
    {

    }
    void SetName(String name)
    {
        this.name=name;
    }
}