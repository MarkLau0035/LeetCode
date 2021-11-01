import java.util.HashMap;

/**
 * @description: LongestSubstringWithoutRepeatingCharacters https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 * @date: 2021/10/28 9:43
 * @author: MarkLau
 */
public class LongestSubstringWithoutRepeatingCharacters {


    /**
     * @Author MarkLau
     * @Description 滑动窗口思想,在这个窗口内需要满足一个非常重要的条件:没有重复的字符.例如以abcdad为例,之前abcd进入都是满足条件,而abcda却不满足,所以我们移动窗口
     * @Date 13:52 2021/11/1
     * @TimeComplexity O(n) 字符串的长度
     * @SpaceComplexity O(n)同上
     **/
    public int lengthOfLongestSubstring(String s) {
        if (( s == null || s.length() == 0)) {
            return 0;
        }
        int start = 0;
        int max = 1;
        char[] str = s.toCharArray();
        HashMap<Character, Integer> charIndex = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            if(charIndex.containsKey(str[i])) {
                start = Math.max(start, charIndex.get(str[i]) + 1);
            }
            max = Math.max(max,i - start + 1);
            charIndex.put(str[i],i);
        }
        return max;
    }
}
