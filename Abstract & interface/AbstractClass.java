public abstract class AbstractClass implements interfaceClass{
    public abstract void show();
    int x =10;
    public void display()
    {
        System.out.println("This is display from Abstract.");
    }
    public AbstractClass(){

    }
    final void hello()
    {
        System.out.println("This.");
    }
}
class SubClass extends AbstractClass{
    public void show()
    {
        System.out.println("This is show from Subclass.");
    }
    public void showMessage()
    {
        System.out.println("This is show from Interface.");
    }
    public void display()
    {
        super.display();
        //System.out.println("This is display from Subclass.");
    }
   

}


