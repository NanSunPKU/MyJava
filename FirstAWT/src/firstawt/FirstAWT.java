/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstawt;

import java.awt.*;

/**
 *
 * @author nsun3
 */

class MyFrame extends Frame {
    Label l;
    TextField tf;
    Button b;
    
    public MyFrame() {
        super("My app");
        setLayout(new FlowLayout());
        
        l = new Label("Name");
        tf = new TextField(20);
        b = new Button("OK");
        
        add(l);
        add(tf);
        add(b);
    }
}


public class FirstAWT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyFrame f = new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
        
        
//        Frame frame = new Frame("My first app");
//        frame.setLayout(new FlowLayout());
//
//        Button button = new Button("OK");
//        Label label= new Label("Name: ");
//        TextField textField = new TextField(20);
//
//        frame.add(label);
//        frame.add(textField);
//        frame.add(button);
//
//        frame.setSize(300, 300);
//        frame.setVisible(true);
    }
    
}
