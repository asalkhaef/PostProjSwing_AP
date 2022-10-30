package MapPack;

import MainPack.Person;
import MainPack.startProj;
import sqlPack.MySql;

import java.sql.ResultSet;
import java.sql.SQLException;

public class setPersonMap extends Thread{
    @Override
    public void run(){
            String cmd = "SELECT `name`, `familyName`, `nationalCode`, `birthPlace` FROM `person`";
            ResultSet rs = MySql.getMySql().ExecuteQuery(cmd);
            while (true){
                try {
                    if (!rs.next()) break;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    Person x = new Person(rs.getString("name"),rs.getString("familyName"),rs.getInt("nationalCode"),rs.getString("birthPlace"));
                    startProj.personHashMap.put(x.getKey(),x);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
    }
}
