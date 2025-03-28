class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        // Step 1: Create new nodes interleaved with original nodes
        Node temp = head;
        while (temp != null) {
            Node newNode = new Node(temp.val);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = newNode.next;
        }

        // Step 2: Assign random pointers
        temp = head;
        while (temp != null) {
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }

        // Step 3: Separate the two lists
        Node newHead = head.next;
        Node oldList = head, newList = newHead;
        while (oldList != null) {
            oldList.next = oldList.next.next;
            newList.next = (newList.next != null) ? newList.next.next : null;
            oldList = oldList.next;
            newList = newList.next;
        }

        return newHead;
    }
}
