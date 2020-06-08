public class Main {
    public static void main(String[] args) {
//        MyThread t1 = new MyThread();
//        MyThread t2 = new MyThread();
//        t1.start();
//        t2.start();

//        Thread t1 = new Thread(new MyRunnableClass());
//        Thread t2 = new Thread(new MyRunnableClass());
//        t1.start();
//        t2.start();

        // 3 способ
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=500; i<600; i++){
                    System.out.println(i);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=900; i>800; i--){
                    System.out.println(i);
                }
            }
        });
        t1.start();
        t2.start();


    }
}

// 2 способ task_6.1
class MyRunnableClass implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<100; i++){
            System.out.println(i);
        }
    }
}

// 1 способ task_6.2
class MyThread extends Thread{
    @Override
    public void run(){
        for (int i=0; i<100; i++){
            System.out.println(i);
        }
    }
}
