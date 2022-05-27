class NewException extends Exception
{
    int d,n;
    NewException(int a,int b)
    {
        n=a;d=b;
    }
    public String toString()
    {
        return "Wrong Answer";
    }
}
class CustomException{
    public static void main(String[] args) throws NewException {
        int a = 4, b = 2;
        try {
            if(a%b==0) System.out.println("Divisble.");
            else throw new NewException(a,b);
        } catch (NewException e) {
            System.out.println(e);
        }
    }
}