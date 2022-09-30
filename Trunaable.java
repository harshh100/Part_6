class b implements Runnable{

    public void run(){
        System.out.println("Hello word");
    }
}


public class Trunaable {

    public static void main(String[] args) {

        b obj = new b();
        Thread t=new Thread(obj);
        t.start();
        System.out.println("Created by Harsh Patel__ID NO. 21CE090");
    }
}
