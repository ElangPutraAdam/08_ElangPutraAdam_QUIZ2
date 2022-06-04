package Kuis2;

public class DLLPembeli_8 {
    Node_8 head, tail;
    public int size;

    public DLLPembeli_8() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    private void addFirst(Pembeli_8 item) {
        if (isEmpty()) {
            head = new Node_8(null, item, null);
            tail = head;
        } else {
            Node_8 newNode = new Node_8(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Pembeli_8 item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node_8 newNode = new Node_8(tail, item, null);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public Pembeli_8 removeFirst() {
        if (!isEmpty()) {
            Pembeli_8 item = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            } else {
                head.prev = null;
            }
            size--;
            return item;
        } else {
            return null;
        }
    }

    public void print() {
        if (!isEmpty()) {
            Node_8 current = head;
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println("Daftar Antrian Resto Royal Delish");
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("|No.\t|Nama Customer\t\t|No hp");
            int i = 1;
            while (current != null) {
                System.out.println("|" + i + current.data);
                current = current.next;
                i++;
            }
            System.out.println("Total Antrian : " + size);
        } else {
            System.out.println("List masih kosong");
        }
    }
}
