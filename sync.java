class Hii {

    public synchronized void display(String name){

        for (int i=0;i<3;i++){
            System.out.print("hi,it's ");
            try{
                Thread.sleep(2000);
            }catch (Exception e){}

            System.out.println(name);
        }

    }

}

class Mythred extends Thread{

    Hii obj=new Hii();
    String name;

    Mythred(Hii obj,String name){
        this.obj=obj;
        this.name=name;
    }

    public void run(){
        obj.display(name);
    }


}

public class sync {

    public static void main(String[] args) {
        Hii obj1=new Hii();
        Mythred obj2=new Mythred(obj1,"HARSH PATEL");
        Mythred obj3=new Mythred(obj1,"21CE090");
        obj2.start();
        obj3.start();
        System.out.println("Created by HARSH PATEL__21CE090");

    }

}
