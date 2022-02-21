
class FetchData extends Thread{
    public void run(){
        for(int i=1; i<=3; i++){
            try {
                Thread.sleep(3000);
                System.out.println(".....Fetchdata thread is running....." + Thread.currentThread().getName());  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ProcessData implements Runnable{
    public void run(){
        for(int i=1; i<=3; i++){
            try {
                Thread.sleep(1000);
                System.out.println(".....Processdata thread is running..... "+ Thread.currentThread().getName());  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Question3 {
    public static void main(String[] args) throws InterruptedException{
        FetchData obj1 = new FetchData();
        Thread obj2 = new Thread(new ProcessData(), "Thread-1");

        obj1.start();
        obj1.join();
        obj2.start();
        obj2.join();
        
    }
}
