package pkg1;
class MultiThredingOne extends Thread{
    public void run(){
        try{
            System.out.println("Thread"+Thread.currentThread().getId()+" is running");
        }
        catch (Exception e){
            System.out.println("Exception is caught");
        }
    }
}
public class Multithreading{
    public static void main(String[] args){
        for(int i=0;i<8;i++) {
                MultiThredingOne mt1=new MultiThredingOne();
                mt1.start();
        }
    }
}