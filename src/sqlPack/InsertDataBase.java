package sqlPack;

import MainPack.Menu;

import java.sql.SQLException;
import java.util.Scanner;

public class InsertDataBase {
    private static Scanner input = new Scanner(System.in);
    public static void insertPerson() throws SQLException, InterruptedException, ClassNotFoundException {
        System.out.println("Enter name : ");
        String name = input.next();
        System.out.println("Enter familyName : ");
        String familyName = input.next();
        System.out.println("Enter NationalCode : ");
        int nationalCode = input.nextInt();
        System.out.println("Enter bitrhPlace : ");
        String birthPlace = input.next();
        System.out.println("1");
        String cmd = String.format("INSERT INTO person (name,familyName,nationalCode,birthPlace) VALUES('%s','%s',%d,'%s')",name,familyName,nationalCode,birthPlace);
        System.out.println("2");
        sqlPack.MySql.getMySql().ExecuteSQL(cmd);
        System.out.println("3");
        System.out.println("person added successfully!");
        Menu.firstPage();
    }
    public static void insertHouse() throws SQLException, InterruptedException, ClassNotFoundException {
        System.out.println("Enter Owner-NationalCode : ");
        int nationalCode = input.nextInt();
        System.out.println("Enter price : ");
        double price = input.nextDouble();
        System.out.println("Enter zipCode : ");
        String zipCode = input.next();
        System.out.println("Enter area : ");
        int area = input.nextInt();
        System.out.println("Enter address : ");
        String address = input.next();

        String cmd = String.format("INSERT INTO house (ownerNc,price,zipCode,area,address) VALUES(%d,%f,'%s',%d,'%s')",nationalCode,price,zipCode,area,address);
        sqlPack.MySql.getMySql().ExecuteSQL(cmd);
        System.out.println("MainPack.House added successfully!");
        Menu.firstPage();
    }
    public static void insertLetter() throws SQLException, InterruptedException, ClassNotFoundException {

        System.out.println("Enter letterContent : ");
        String content = input.next();
        System.out.println("Enter receiverZipCode : ");
        Integer RZ = input.nextInt();
        System.out.println("Enter senderZipCode : ");
        Integer SZ = input.nextInt();
        System.out.println("Enter priority : ");
        int priority = input.nextInt();
        System.out.println("Enter letterCode : ");
        String letterCode = input.next();

        String cmd = String.format("INSERT INTO letter (letterContent,receiverZc,senderZc,priority,letterCode) VALUES('%s',%d,%d,%d,'%s')",content,RZ,SZ,priority,letterCode);
        sqlPack.MySql.getMySql().ExecuteSQL(cmd);
        System.out.println("letter added successfully!");
        Menu.firstPage();
    }
}
