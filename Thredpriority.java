

class thred extends Thread{

    public void run(){

        System.out.println(Thread.currentThread().getName());
    }

}



public class Thredpriority {

    public static void main(String[] args) {

        thred FRIST=new thred();
        thred SECOND=new thred();
        thred THIRD=new thred();

        FRIST.setPriority(3);
        SECOND.setPriority(5);
        THIRD.setPriority(7);

        System.out.println("FRIST thred priority : "+FRIST.getPriority());
        System.out.println("SECOND thred priority : "+SECOND.getPriority());
        System.out.println("THIRD thred priority : "+THIRD.getPriority());
        System.out.println("Created by Harsh Patel__ID NO. 21CE090");




    }

}
