import java.util.HashMap;
import java.util.Map;

public class TwoSum1
{
    public int[] twoSum(int[] nums, int target)
    {
        int[] result = new int[2];
        for (int startCnt = 0; startCnt < nums.length - 1; startCnt++)
        {
            for (int second = startCnt + 1; second < nums.length; second++)
            {
                if (nums[startCnt] + nums[second] == target)
                {
                    result[0] = startCnt;
                    result[1] = second;
                }
            }
        }
        return result;
    }


    public int[] twoSum2(int[] nums, int target)
    {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], i);
        }
        for (int first = 0; first < nums.length - 1; first++)
        {
            Integer Second = target - nums[first];
            if (map.containsKey(Second) && map.get(Second) != first)
            {
                result[0] = first;
                result[1] = map.get(Second);
                break;
            }
        }
        return result;
        
    }


    public int[] twoSum3(int[] nums, int target)
    {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int other;
        for (int nowCnt = 0; nowCnt < nums.length; nowCnt++)
        {
            other = target - nums[nowCnt];
            if (map.containsKey(other))
            {
                result[0] = map.get(other);
                result[1] = nowCnt;
                break;
            }
            map.put(nums[nowCnt], nowCnt);
        }
        return result;
    }
}



