interface I1 {
    abstract void test(int i); 
    int x = 10;
  }
  
  
  
  interface I2 {
    abstract void test(int s);
  }
  
  
  
  
  public class MultInterfaces implements I1, I2 {
  
  
    public void test(int i)   {   System.out.println("In MultInterfaces.I1.test" + " " +i); }
  
    
  public static void main(String[] a) {
      MultInterfaces t = new MultInterfaces();
      t.test(42);
      t.test(2);
      }
  
  
  }