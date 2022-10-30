package MainPack;

import Gui.showList;
import Gui.showParcel;
import sqlPack.DeleteDataBase;
import sqlPack.EditDataBase;
import sqlPack.InsertDataBase;

import javax.swing.*;
import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    private static Scanner input = new Scanner(System.in);
    public static void firstPage() throws SQLException, InterruptedException, ClassNotFoundException {
        System.out.println("**** welcome to Post ****");
        System.out.println("please enter your order : ");
        System.out.println("1 : create new MainPack.Person ");
        System.out.println("2 : create new MainPack.House  ");
        System.out.println("3 : create new MainPack.Letter ");
        System.out.println("4 : delete MainPack.Person");
        System.out.println("5 : delete MainPack.House");
        System.out.println("6 : delete MainPack.Letter");
        System.out.println("7 : edit MainPack.Person");
        System.out.println("8 : edit MainPack.House");
        System.out.println("9 : edit MainPack.Letter");
        System.out.println("10 : read info from dataBase ");
        System.out.println("11 : show lists graphic panel ");
        System.out.println("12 : show parcelPost list graphic panel ");
        System.out.println("13 : exit ");

        int order = input.nextInt();
        switch (order){
            case 1:
            {
                InsertDataBase.insertPerson();
                break;
            }
            case 2:
            {
                InsertDataBase.insertHouse();
                break;
            }
            case 3:
            {
                InsertDataBase.insertLetter();
                break;
            }
            case 4:
            {
                DeleteDataBase.deletePerson();
                break;
            }
            case 5:
            {
                DeleteDataBase.deleteHouse();
                break;
            }
            case 6:
            {
                DeleteDataBase.deleteLetter();
                break;
            }
            case 7:
            {
                EditDataBase.editPerson();
                break;
            }
            case 8:
            {
                EditDataBase.editHouse();
                break;
            }
            case 9:
            {
                EditDataBase.editLetter();
                break;
            }
            case 10:
            {
                startProj.runThis();
                break;
            }
            case 11:
            {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        showList page = new showList();
                        page.setVisible(true);
                        page.setText();
                    }
                });
                Menu.firstPage();
                break;
            }
            case 12:
            {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        showParcel page = new showParcel();
                        page.setVisible(true);
                        page.setText(startProj.parcelPostPriorityQueue);
                    }
                });
                Menu.firstPage();
                break;
            }
            case 13:
            {
                System.out.println("Best Wishes!!!");
                System.exit(1);
                break;
            }
            default:{
                System.out.println("enter valid order!!!");
                Menu.firstPage();
            }
        }


    }
}
