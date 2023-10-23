import java.util.ArrayList;

public class Lab4 {
    public static  void main(String arg[])
    {
        ArrayList<String>
                a=new ArrayList<>();
        a.add("java");
        a.add("test");
        a.add("university");
        System.out.println("a:" +a);

        ArrayList<String>
                b=new ArrayList<>();
        b.add("car");
        b.add("university");
        b.add("plane");
        System.out.println("b:" +b);
        a.retainAll(b);
        System.out.println("Elementele comune:" +a);
    }
   }