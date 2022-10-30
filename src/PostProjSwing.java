import MainPack.Menu;

import java.sql.SQLException;

public class PostProjSwing {
    public static void main(String[] args) {
        try {
            Menu.firstPage();
        } catch (SQLException | InterruptedException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
