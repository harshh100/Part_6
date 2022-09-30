import java.util.*;

class array{
   static Random R=new Random();
   static int[] a = new int[15];

    static
    {
        for (int i=0;i<15;i++){
            a[i]= R.nextInt(100);
        }
    }

}
class T1 extends array implements Runnable {

    public void run(){

        for (int i=0;i<15;i++){
            if(i%2!=0)
            {
                System.out.println("a["+i+"]"+a[i]);
            }
        }

    }
}

class T2 extends array implements Runnable{

    public void run(){

        for (int i=0;i<15;i++){
            if(i%2==0)
            {
                System.out.println("a["+i+"]"+a[i]);
            }
        }
    }
}

public class ex_2 {

    public static void main(String[] args) {


        T1 obj=new T1();
        T2 obj1=new T2();

        Thread T11=new Thread(obj);
        Thread T22=new Thread(obj1);

        T11.start();
        T22.start();
        System.out.println("Created by Harsh Patel__ID NO. 21CE090");

    }

}
