
import java.util.LinkedList;
import java.util.Arrays;

public class str {
    public static void main(String[] args) {
        float StrukturBaris = 1.14f;
        String SusunanKataBaru = "pian bujuran santri lah?";
    
        int[] DelapanAngka = {10, 12, 18, 23, 33, 58, 67, 82};

        String[][] DuaAngka = {
            {"2", "4", "6"},
            {"8", "10", "12"},
            {"14", "16", "18"}
        };

        LinkedList<Integer> UrutanListAngka = new LinkedList<Integer>();
        UrutanListAngka.addFirst(15);
        UrutanListAngka.add(28);
        UrutanListAngka.addLast(33);
        UrutanListAngka.add(47);
        UrutanListAngka.add(59);

        System.out.println("String: " + SusunanKataBaru);
        System.out.println("Array 1D: " + DelapanAngka[3]);
        System.out.println("Array 2D: " + DuaAngka[2][2]);
        System.out.println("Linked List: " + UrutanListAngka.get(4));

    }
}