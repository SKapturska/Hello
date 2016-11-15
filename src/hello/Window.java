package hello;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Window extends JFrame implements ActionListener{

    JLabel label;
    JTextField textField;
    JButton button;
    String name;
    
    Window(){
        setTitle("Hello");
        setSize(350,200);
        setLocation(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        
        label = new JLabel("Podaj imię ");
        label.setSize(100,30);
        label.setLocation(10,30);
        label.setFont(new Font("SansSerif", Font.BOLD, 18));
        add(label);
        
        textField = new JTextField();
        textField.setSize(130,30);
        textField.setLocation(120,30);
        add(textField);
        
        button = new JButton("Click me!");
        button.setSize(150,30);
        button.setLocation(80,80);
        add(button);
        button.addActionListener(this);
  
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        name = textField.getText().trim();
        JOptionPane.showMessageDialog(null, "Cześć " + name, "Hi", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
