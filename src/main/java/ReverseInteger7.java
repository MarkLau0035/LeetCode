public class ReverseInteger7
{
    public int reverse(int x)
    {
        boolean isPositive = true;
        if (x < 0)
        {
            isPositive = false;
            x = -x;
        }
        ;
        StringBuffer buffer = new StringBuffer(String.valueOf(x));

        String resultStr = new StringBuffer(String.valueOf(x)).reverse().toString();

        //int result=Integer.parseInt(resultStr);
        Integer result = Integer.valueOf(resultStr).intValue();
//        System.out.println(resultStr);
        if (!isPositive)
        {
            result = -result;
        }
        return result;
    }

    ;
}
