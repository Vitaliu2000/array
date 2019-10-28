package HomeWork;

import java.util.ArrayList;

public class MyTestClass {
    public static void main(String[] args) {
        DIYarrayList yarrayList = new DIYarrayList();
        ArrayList arrayList = new ArrayList();

        yarrayList.add("A");
        yarrayList.add("B");
        yarrayList.add("C");

        arrayList.add("X");
        arrayList.add("Y");
        arrayList.add("Z");

        yarrayList.addAll(arrayList);

        //TODO При попытке запустить код ошибка NullPointerException.
        System.out.println(yarrayList);

    }



}
