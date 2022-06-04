package Kuis2;

public class DLLPesanan_8 {
    Node_8 head, tail;
    public int size;

    public DLLPesanan_8() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    private void addFirst(Pesanan_8 item) {
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

    public void addLast(Pesanan_8 item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node_8 newNode = new Node_8(tail, item, null);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public Pesanan_8 removeFirst() {
        if (!isEmpty()) {
            Pesanan_8 item = head.data;
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
            Node_29 current = head;
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println("Daftar Pesanan Resto Royal Delish");
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("|No.\t|Nama Pesanan\t\t|Harga");
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        } else {
            System.out.println("List masih kosong");
        }
    }

    public void printSortByName() {
        if (!isEmpty()) {
            Node_8 current = head;
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("Daftar Pesanan Resto Royal Delish");
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("|No.\t|Nama Pesanan\t\t|Harga");
            int i = 0;
            while (i < size) {
                int j = i + 1;
                while (j < size) {
                    if (current.data.namaPesanan.charAt(0) < current.next.data.namaPesanan.charAt(0)) {
                        Pesanan_8 temp = current.data;
                        current.data = current.next.data;
                        current.next.data = temp;
                    }
                    current = current.next;
                    j++;
                }
                current = head;
                i++;
            }
        } else {
            System.out.println("List masih kosong");
        }
    }

    public void printSum() {
        if (!isEmpty()) {
            Node_8 current = head;
            int sum = 0;
            while (current != null) {
                sum += current.data.harga;
                current = current.next;
            }
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("TOTAL PENDAPATAN");
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("Pendapatan hari ini : " + sum);
        } else {
            System.out.println("List masih kosong");
        }
    }
}
