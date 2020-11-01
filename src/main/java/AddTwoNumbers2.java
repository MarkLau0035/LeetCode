import com.sun.javafx.binding.BindingHelperObserver;
import com.sun.javafx.binding.StringFormatter;
import com.sun.org.apache.bcel.internal.generic.BIPUSH;

import java.math.BigInteger;
import java.util.List;

public class AddTwoNumbers2
{
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    public class ListNode
    {
        int val;
        ListNode next;

        ListNode()
        {
        }

        ListNode(int val)
        {
            this.val = val;
        }

        ListNode(int val, ListNode next)
        {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {

        StringBuffer buffer1 = new StringBuffer();
        StringBuffer buffer2 = new StringBuffer();
        for (int cnt = 0; l1 != null; cnt++)
        {
            buffer1.append(l1.val);
            l1 = l1.next;
        }
        for (int cnt = 0; l2 != null; cnt++)
        {
            buffer2.append(l2.val);
            l2 = l2.next;
        }
        BigInteger num1 = new BigInteger(buffer1.reverse().toString());
        BigInteger num2 = new BigInteger(buffer2.reverse().toString());
        String result = new StringBuffer(num1.add(num2).toString()).reverse().toString();
        ListNode listNode = new ListNode(0, null);
        String a = result.charAt(0) + "";
        listNode.val = Integer.parseInt(a);
        ListNode temp = listNode;
        for (int cnt = 1; cnt < result.length(); cnt++)
        {
            temp.next = new ListNode();
            temp = temp.next;
            temp.val = Integer.parseInt(result.charAt(cnt) + "");
        }
        return listNode;
    }

}
