package java;

import java.awt.*;

public class FirstApp {
    public static void main(String[] args) {
        Frame frame = new Frame("My first app");
        frame.setLayout(new FlowLayout());

        Button button = new Button("OK");
        Label label= new Label("Name: ");
        TextField textField = new TextField(20);

        frame.add(label);
        frame.add(textField);
        frame.add(button);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
