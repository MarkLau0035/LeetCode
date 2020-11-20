import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main
{
    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++)
        {
            executorService.execute(new Runnable()
            {
                public void run()
                {
                    for (int i = 0; i <10 ; i++)
                    {
                        System.out.println(Thread.currentThread());
                        Thread.currentThread().stop();
                    }
                }
            });
        }
    }

    //TODO
    public Double fun1(double a,double b)
    {

        return null;
    }

    public double calculateRectangleArea(int length,int width)
    {
        double area=length*width;
        return area;
    }
}
