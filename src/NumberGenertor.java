public class NumberGenertor implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(i);
            System.out.println(this.hashCode());
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
