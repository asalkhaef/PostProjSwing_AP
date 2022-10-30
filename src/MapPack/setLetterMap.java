package MapPack;

import MainPack.Letter;
import MainPack.startProj;
import sqlPack.MySql;

import java.sql.ResultSet;
import java.sql.SQLException;

public class setLetterMap extends Thread{
    @Override
    public void run(){
        String cmd = "SELECT * FROM letter";
        ResultSet rs = MySql.getMySql().ExecuteQuery(cmd);
        while (true){
            try {
                if (!rs.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                Letter x = new Letter(rs.getString("letterContent"),rs.getInt("receiverZc"),rs.getInt("senderZc"),rs.getInt("priority"),rs.getString("letterCode"));
                startProj.letterHashMap.put(x.getKey(),x);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
