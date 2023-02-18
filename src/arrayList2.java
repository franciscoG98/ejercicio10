import java.util.ArrayList;
import java.util.List;

public class arrayList2 {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }
        System.out.println("arrayList " +  arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) % 2 == 0) {
                arrayList.remove(i);
            }
        }

        System.out.println("arrayList solo impares " +  arrayList);

    }
}
