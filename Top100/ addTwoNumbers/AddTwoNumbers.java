/**
 * @description: AddTwoNumbers  https://leetcode-cn.com/problems/add-two-numbers/ <br>
 * @date: 2021/10/25 16:23 <br>
 * @author: MarkLau <br>
 */
public class AddTwoNumbers {
    public static void main(String[] args) {

    }
    /**
     * @Author MarkLau
     * @Description 将两个链表对位相加,进位是关键
     * @Date 16:30 2021/10/25
     * @TimeComplexity O(n)
     * @SpaceComplexity O(1)
     **/
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode res = new ListNode(0);
        ListNode temp = res;
        while (l1 != null || l2 != null) {
            int digit1 = l1 != null ? l1.val : 0;
            int digit2 = l2 != null ? l2.val : 0;
            int digit = (digit1 + digit2 + carry) % 10;
            carry = (digit1 + digit2 + carry) / 10;
            temp.next = new ListNode(digit);
            temp = temp.next;
            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;
        }
        if(carry != 0){
            temp.next = new ListNode(carry);
        }
        return res.next;
    }
}
