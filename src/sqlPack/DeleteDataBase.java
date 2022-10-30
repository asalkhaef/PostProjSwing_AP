package sqlPack;

import MainPack.Menu;

import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDataBase {
    private static Scanner input = new Scanner(System.in);
    public static void deletePerson() throws SQLException, InterruptedException, ClassNotFoundException {
        System.out.println("please enter you national code : ");
        Integer nationalCode = input.nextInt();
        System.out.println("please enter you zip code : ");
        Integer zipCode = input.nextInt();
        String cmd = String.format("DELETE FROM `person` WHERE nationalCode = %d",nationalCode);
        sqlPack.MySql.getMySql().deleteSQl(cmd);
        String cmd1 = String.format("DELETE FROM `house` WHERE ownerNc = %d",nationalCode);
        sqlPack.MySql.getMySql().deleteSQl(cmd1);
        String cmd2 = String.format("DELETE FROM `letter` WHERE senderZc = %d OR receiverZc = %d" ,zipCode,zipCode);
        sqlPack.MySql.getMySql().deleteSQl(cmd2);
        System.out.println("person,house,letter deleted successfully!");
        Menu.firstPage();
    }
    public static void deleteHouse() throws SQLException, InterruptedException, ClassNotFoundException {
        System.out.println("please enter you zip code : ");
        Integer zipCode = input.nextInt();
        String cmd1 = String.format("DELETE FROM `house` WHERE zipCode = %d",zipCode);
        sqlPack.MySql.getMySql().deleteSQl(cmd1);
        String cmd2 = String.format("DELETE FROM `letter` WHERE senderZc = %d OR receiverZc = %d" ,zipCode,zipCode);
        sqlPack.MySql.getMySql().deleteSQl(cmd2);
        System.out.println("house,letter deleted successfully!");
        Menu.firstPage();
    }
    public static void deleteLetter() throws SQLException, InterruptedException, ClassNotFoundException {
        System.out.println("please enter you zip code : ");
        Integer zipCode = input.nextInt();
        String cmd2 = String.format("DELETE FROM `letter` WHERE senderZc = %d OR receiverZc = %d" ,zipCode,zipCode);
        sqlPack.MySql.getMySql().deleteSQl(cmd2);
        System.out.println("letter deleted successfully!");
        Menu.firstPage();
    }
}
