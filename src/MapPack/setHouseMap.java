package MapPack;

import MainPack.House;
import MainPack.startProj;
import sqlPack.MySql;

import java.sql.ResultSet;
import java.sql.SQLException;

public class setHouseMap extends Thread{
    @Override
    public void run(){
        String cmd = "SELECT * FROM house";
        ResultSet rs = MySql.getMySql().ExecuteQuery(cmd);
        while (true){
            try {
                if (!rs.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                House x = new House(rs.getInt("ownerNc"),rs.getDouble("price"),
                        rs.getInt("zipCode"),rs.getInt("area"),rs.getString("address"));
                startProj.houseHashMap.put(x.getKey(),x);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
