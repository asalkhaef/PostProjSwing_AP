package Gui;

import MainPack.House;
import MainPack.Letter;
import MainPack.Person;
import MainPack.startProj;

import java.awt.*;
import java.util.Map;
import java.util.Set;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Fri Jul 01 14:10:47 IRDT 2022
 */



/**
 * @author unknown
 */
public class showList extends JFrame {
    public showList() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Parnian
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        scrollPane2 = new JScrollPane();
        textArea2 = new JTextArea();
        scrollPane3 = new JScrollPane();
        textArea3 = new JTextArea();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();

        //======== this ========
        setBackground(new Color(0, 255, 204));
        setAlwaysOnTop(true);
        var contentPane = getContentPane();

        //======== scrollPane1 ========
        {

            //---- textArea1 ----
            textArea1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
            scrollPane1.setViewportView(textArea1);
        }

        //======== scrollPane2 ========
        {

            //---- textArea2 ----
            textArea2.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
            scrollPane2.setViewportView(textArea2);
        }

        //======== scrollPane3 ========
        {

            //---- textArea3 ----
            textArea3.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
            scrollPane3.setViewportView(textArea3);
        }

        //---- label1 ----
        label1.setText("MainPack.Person");
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setFont(new Font("Segoe UI Black", Font.ITALIC, 20));
        label1.setBackground(new Color(102, 255, 204));

        //---- label2 ----
        label2.setText("MainPack.House");
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setFont(new Font("Segoe UI Black", Font.ITALIC, 20));
        label2.setBackground(new Color(102, 255, 204));

        //---- label3 ----
        label3.setText("MainPack.Letter");
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setFont(new Font("Segoe UI Black", Font.ITALIC, 20));
        label3.setBackground(new Color(153, 255, 204));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(42, Short.MAX_VALUE)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                    .addGap(75, 75, 75)
                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                    .addGap(63, 63, 63))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(scrollPane1)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 334, GroupLayout.PREFERRED_SIZE)
                                .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 334, GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Parnian
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JScrollPane scrollPane2;
    private JTextArea textArea2;
    private JScrollPane scrollPane3;
    private JTextArea textArea3;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public void setText(){
        this.getContentPane().setBackground(new Color(102,178,255));
        Set<Map.Entry<Integer, Person>> personSet = startProj.personHashMap.entrySet();
        for(Map.Entry<Integer,Person> x : personSet){
            textArea1.append("\nkey : "+x.getKey()+"\n");
            textArea1.append(x.getValue().toString());
            textArea1.append("\n..............................................");
        }
        Set<Map.Entry<Integer,House>> HouseSet = startProj.houseHashMap.entrySet();
        for(Map.Entry<Integer, House> y : HouseSet){
            textArea2.append("\nkey : "+y.getKey()+"\n");
            textArea2.append(y.getValue().toString());
            textArea2.append("\n..............................................");
        }
        Set<Map.Entry<String,Letter>> LetterSet = startProj.letterHashMap.entrySet();
        for(Map.Entry<String, Letter> z : LetterSet){
            textArea3.append("\nkey : "+z.getKey()+"\n");
            textArea3.append(z.getValue().toString());
            textArea3.append("\n..............................................");
        }

    }
}
