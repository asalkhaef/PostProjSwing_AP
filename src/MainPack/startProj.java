package MainPack;

import MainPack.*;
import MapPack.setHouseMap;
import MapPack.setLetterMap;
import MapPack.setPersonMap;

import java.sql.SQLException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class startProj {
    public static HashMap<Integer, Person> personHashMap = new HashMap<>();
    public static HashMap<Integer, House> houseHashMap = new HashMap<>();
    public static HashMap<String, Letter> letterHashMap = new HashMap<>();
    static PriorityQueue<ParcelPost> parcelPostPriorityQueue = new PriorityQueue<>(new Comparator<ParcelPost>() {
        @Override
        public int compare(ParcelPost o1, ParcelPost o2) {
            int result = o1.compareTo(o2);
            return result;
        }
    });
    public static void runThis() throws InterruptedException, SQLException, ClassNotFoundException {
        Thread personThread = new Thread(new setPersonMap());
        Thread houseThread = new Thread(new setHouseMap());
        Thread letterThread = new Thread(new setLetterMap());

        personThread.start();
        personThread.join();
        houseThread.start();
        houseThread.join();
        letterThread.start();
        letterThread.join();


        System.out.println(personHashMap);
        System.out.println(houseHashMap);
        System.out.println(letterHashMap);


        ParcelManager.makeParcel(letterHashMap);
        System.out.println(parcelPostPriorityQueue);

        Menu.firstPage();
    }
}
