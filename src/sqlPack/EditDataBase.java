package sqlPack;

import MainPack.Menu;

import java.sql.SQLException;
import java.util.Scanner;

public class EditDataBase {
    private static Scanner input =new Scanner(System.in);

    public static void editPerson() throws SQLException, InterruptedException, ClassNotFoundException {
        System.out.println("enter your nationalCode please : ");
        Integer NC = input.nextInt();
        System.out.println("*** Enter new information please : ***");
        System.out.println("Enter name : ");
        String name = input.next();
        System.out.println("Enter familyName : ");
        String familyName = input.next();
        System.out.println("Enter bitrhPlace : ");
        String birthPlace = input.next();

        String sqlcmd = String.format("UPDATE person SET name='%s',familyName='%s',birthPlace='%s' WHERE nationalCode=%d",name,familyName,birthPlace,NC);
        sqlPack.MySql.getMySql().ExecuteSQL(sqlcmd);
        System.out.println("person updated successfully!");
        Menu.firstPage();
    }

    public static void editHouse() throws SQLException, InterruptedException, ClassNotFoundException {
        System.out.println("Enter Owner-NationalCode please : ");
        int nationalCode = input.nextInt();
        System.out.println("*** Enter new information please : ***");
        System.out.println("Enter price : ");
        double price = input.nextDouble();
        System.out.println("Enter area : ");
        int area = input.nextInt();
        System.out.println("Enter address : ");
        String address = input.next();

        String sqlcmd = String.format("UPDATE house SET price=%f,area=%d,address='%s' WHERE ownerNc=%d",price,area,address,nationalCode);
        sqlPack.MySql.getMySql().ExecuteSQL(sqlcmd);
        System.out.println("MainPack.House updated successfully!");
        Menu.firstPage();
    }

    public static void editLetter() throws SQLException, InterruptedException, ClassNotFoundException {

        System.out.println("Enter letterCode : ");
        String letterCode = input.next();
        System.out.println("Enter new information please : ");
        System.out.println("Enter letterContent : ");
        String content = input.next();
        System.out.println("Enter priority : ");
        int priority = input.nextInt();

        String sqlcmd = String.format("UPDATE letter SET letterContent='%s',priority=%d WHERE letterCode='%s'",content,priority,letterCode);
        sqlPack.MySql.getMySql().ExecuteSQL(sqlcmd);
        System.out.println("letter updated successfully!");
        Menu.firstPage();
    }
}
