public class ListStructure {
    Node head; //Listemizin head'ini oluşturduk. Head önemli!
    Node tail; //Listemizin sonunu oluşturduk.

    void add(int x) {
        Node nodeElement = new Node(); //Node türünde yeni bir değişken oluşturduk.
        nodeElement.data = x; //Oluşturduğumuz bu değişkenin data özelliğine parametremizi atadık.

        if (head == null) { /* Burada eğer liste sınıfının özelliğinden olan head null ise head'e nodeElement'i atadık ayrıca tail'a da nodeElement'i atadık. Yani örneğin add(1) dersek
        ilk elemanımız 1 olur ve son elemanımızda 1 olur.
        */
            head = nodeElement;
            tail = nodeElement;
            System.out.println("İlk düğüm eklendi!");
        }
        //Eğer hali hazırda head varsa bu sefer tail'a yani son elemana nodeElement'i atadık ayrıca tail içerisindeki pointer'a da bunu atamış olduk.
        tail.pointer = nodeElement;
        tail = nodeElement;
        System.out.println("Son Düğüm Eklendi");
    }

    void print() {
        if (head == null) {
            System.out.println("Bağlı Liste Boş");
        }

        Node temp = head; //Geçici bir Node sınıfı türünden temp örneği oluşturup buna head'i atadık.

        System.out.print("\nbaş -> ");

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.pointer;
        }

        System.out.println("son -> ");
    }

    void addHead(int x) {
        Node element = new Node();
        element.data = x;

        if (head == null) {
            element.pointer = null;
            head = element;
            tail = element;
            System.out.println("Liste yapısı oluşturuldu, ilk eleman eklendi");
        }

        element.pointer = head;
        head = element;
        System.out.println("Başa Eleman Eklendi");
    }

    void addTail(int x) {
        Node element = new Node();
        element.data = x;

        if (head == null) {
            element.pointer = null;
            head = element;
            tail = element;
            System.out.println("Liste yapısı oluşturuldu, ilk eleman eklendi");
        }

        tail.pointer = element; //ekleme yaptık
        tail = element; //ismini güncelledik
        System.out.println("Sona Eleman Eklendi");
    }

    void insertion(int indis, int x) {
        Node element = new Node();
        element.data = x;

        if (head == null && indis == 0) {
            head = element;
            tail = element;
            element.pointer = null;
            System.out.println("Liste yapısı oluşturuldu, ilk eleman eklendi.");
        } else if (head != null && indis == 0) {
            element.pointer = head;
            head = element;
            System.out.println("İlk indisin bir sonraki indisine eleman eklendi.");
        } else {

            Node temp = head;
            Node temp2 = head;
            int counter = 0;

            while (temp.pointer != null) {
                counter++;
                temp2 = temp;//temp2 şuan en son indisten önceki indisi tutuyor.
                temp = temp.pointer;
            }

            if (indis == counter) {
                temp2.pointer = element;
                element.pointer = temp;
                System.out.println("Son indisin bir önceki indisine yeni eleman eklendi!");
            } else {
                temp = head;
                temp2 = head;

                int i = 0;
                while (i != indis) {
                    temp2 = temp;
                    temp = temp.pointer;
                    i++;
                }

                temp2.pointer = element;
                element.pointer = temp;
                System.out.println("Eleman araya eklendi!");

            }
        }
    }

    void removeHead() {
        if (head == null) {
            System.out.println("LinkedList boş!");
        } else if (head.pointer == null) {
            head = null;
            System.out.println("LinkedList'teki Son Eleman Silindi!");
        } else {
            head = head.pointer; //garbage collector bir önceki indisi siliyor.
            System.out.println("İlk Eleman Silindi! ");
        }
    }

    void removeTail() {
        if (head == null) {
            System.out.println("LinkedList Boş");
        } else {
            Node temp = head;
            Node temp2 = head;

            while (temp.pointer != null) {
                temp2 = temp;
                temp = temp.pointer;
            }

            temp2.pointer = null;
        }
    }

    void deleteInsertion(int indis) {
        if (head == null) {
            System.out.println("LinkedList boş");
        } else {
            Node temp = head;
            Node temp2 = head;
            Node temp3 = head;
            int i = 0;
            while (i != indis + 1) {
                temp3 = temp2;
                temp2 = temp;
                temp = temp.pointer;
                i++;
            }
            temp3.pointer = temp2.pointer;
        }
    }

}
