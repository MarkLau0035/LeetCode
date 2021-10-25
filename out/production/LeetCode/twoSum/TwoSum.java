package twoSum;

import jdk.jfr.Description;

import java.util.HashMap;
import java.util.Map;

/**
 * description: TwoSum <br>
 * date: 2021/10/24 20:57 <br>
 * author: MarkLau <br>
 * version: 1.0 <br>
 * @author MarkLau
 */

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("hello");
    }

    /**
     * @Author MarkLau
     * @Description 最容易理解,但也是最蠢的方法
     * @Date 21:22 2021/10/24
     * @TimeComplexity O(n^2)
     * @SpaceComplexity O(1)
     **/
    public int[] twoSum1(int[] nums, int target) {
        int first = 0;
        int second = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length && j != i; j++) {
                if(nums[i] + nums[j] == target){
                    first = i;
                    second = j;
                    break;
                }
            }
            if(first != second){
                break;
            }
        }
        return new int[]{first,second};
    }

    /**
     * @Author MarkLau
     * @Description 常见思路:用空间换时间,用一个HashMap将数组中所有元素都存储,然后用target-element看是否存在另一半
     * @Date 21:31 2021/10/24
     * @TimeComplexity O(n),对数组进行了两次线性遍历
     * @SpaceComplexity O(n),用一个HashMap存储了所有的元素
     **/
    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(target-nums[i]) != null && i != map.get(target-nums[i])) {
                return new int[]{i,map.get(target-nums[i])};
            }
        }
        return null;
    }
    /**
     * @Author MarkLau
     * @Description 与第二种方式基本一致,但是更加巧妙一点,只遍历了一遍
     * @Date 21:41 2021/10/24
     * @TimeComplexity O(n):
     * @SpaceComplexity O(n)
     **/
    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
