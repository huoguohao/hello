public class Main implements Runnable{
    synchronized void hit(long n){
        for (int i=1;i<3;i++)//1 2 
            System.out.print(n+"-"+i+" ");
    }
    public static void main(String[] args){
       /* NullTest my=null;
        System.out.print(my.getInt());*/
       new Thread(new Main()).start();
       new Thread(new Main()).start();
       new Thread(new Main()).start();
//       TODO today
//		qu.saveApps("jdbc:mysql://28.4.192.52:3306/calcserver?useUnicode=true&characterEncoding=utf-8&useSSL=false",
//				"root","root","jdbc:db2://22.5.237.92:50000/ESMPDB","citic","citic@123");
    }

    @Override
    public void run() {
        hit(Thread.currentThread().getId());
    }
}

class NullTest{
    public static int getInt(){
        return 1;
    }
}
