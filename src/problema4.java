import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduceti un numar daca este prim sau nu: ");
        int number= sc.nextInt();
        if(isPrime(number)) {
            System.out.println(number + este mumar prim");
        }
        else{
            System.out.println(number + " nu este numar prim");
        }
    }
    static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }


}