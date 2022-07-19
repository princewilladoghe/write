package com.company;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.awt.*;
public class WriterExample extends Frame {
    private TextField t1;
    private Button B1,B2;
    private Label L,l;

    WriterExample(){
        setSize(400,300);
        setLayout(null);
        setVisible(true);
        t1=new TextField();
        t1.setBounds(100,100,200,30);
        L=new Label("value");
        L.setBounds(50,100,50,50);
        l=new Label();
        l.setBounds(100,200,100,50);
        B1=new Button("add");
        B1.setBounds(100,150,50,20);
        B2=new Button("clear");
        B2.setBounds(200,150,50,20);
        add(L);
        add(l);
        add(t1);
        add(B1);
        add(B2);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        B2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("");

            }
        });
        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Writer w = new FileWriter("C:\\Users\\HP\\IdeaProjects\\write\\testout.txt");
                    String content=t1.getText();
                    w.write("i love nigeria");
                    w.close();
                    System.out.println("done");
                    l.setText("done");
                }catch (IOException A){
                    A.printStackTrace();
                }

            }
        });

    }
    public static void main(String[] args) {
        new WriterExample();

    }
}
