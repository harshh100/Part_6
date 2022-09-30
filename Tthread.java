class a extends Thread{

    public void run(){
        System.out.println("Hello word");
    }
}


public class Tthread {

    public static void main(String[] args) {

        a obj = new a();
        obj.start();
        System.out.println("Created by Harsh Patel__ID NO. 21CE090");
    }
}
