package MainPack;

import java.sql.SQLException;
import java.util.HashMap;

public class ParcelManager {
    public static void makeParcel(HashMap<String,Letter> myMap) throws SQLException, InterruptedException, ClassNotFoundException {
        for (String key : myMap.keySet()){
            Letter temp = startProj.letterHashMap.get(key);
            Integer receiverZc = temp.getReceiverZC();
            House receiverH = startProj.houseHashMap.get(temp.getReceiverZC());
            House senderH = startProj.houseHashMap.get(temp.getSenderZC());
            Person receiver = startProj.personHashMap.get(receiverH.getOwnerNC());
            Person sender = startProj.personHashMap.get(senderH.getOwnerNC());
            if(receiverH.getAddress().equals("")){
                receiverH.setAddress("null");
                ParcelPost pack = new ParcelPost(temp,sender.getName(),receiver.getName(),senderH.getAddress(),receiverH.getAddress(),senderH.getZipCode(),receiverH.getZipCode(),true);
                startProj.parcelPostPriorityQueue.add(pack);
            }
            else {
                ParcelPost pack = new ParcelPost(temp,sender.getName(),receiver.getName(),senderH.getAddress(),receiverH.getAddress(),senderH.getZipCode(),receiverH.getZipCode(),false);
                startProj.parcelPostPriorityQueue.add(pack);
            }
        }
        Menu.firstPage();
    }

}


