import java.util.HashMap;

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Node head2 = new Node(head.val);
        Node temp = head;
        Node temp2 = head2;
        
        while (temp.next != null) {  // Fixed: Ensure loop runs correctly
            temp = temp.next;
            Node dup = new Node(temp.val);
            temp2.next = dup;
            temp2 = temp2.next;  // Fixed: Move temp2 forward
        }

        HashMap<Node, Node> map = new HashMap<>();
        temp = head;
        temp2 = head2;
        
        while (temp != null) {  // Fixed: Populate HashMap correctly
            map.put(temp, temp2);
            temp = temp.next;
            temp2 = temp2.next;
        }

        temp = head;
        temp2 = head2;

        for (Node original : map.keySet()) {  // Fixed: keySet() syntax
            Node duplicate = map.get(original);
            if (original.random != null) {
                duplicate.random = map.get(original.random);
            }
        }

        return head2;  // Fixed: Return statement outside loop
    }
}
