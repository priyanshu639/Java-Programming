// import javax.swing.*;

// class TextFieldExample {  
//     public static void main(String args[]) {  
//         JFrame f = new JFrame("TextField Example");  
//         JTextField t1, t2;  

//         // Correcting the quotation marks
//         t1 = new JTextField("Welcome to Java.");  
//         t1.setBounds(50, 100, 200, 30);  

//         t2 = new JTextField("welcome");  // Fixed incorrect quotes
//         t2.setBounds(50, 150, 200, 30);  

//         // Adding components to frame
//         f.add(t1);  
//         f.add(t2);  

//         // Frame settings
//         f.setSize(400, 400);  
//         f.setLayout(null);  
//         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation added
//         f.setVisible(true);  
//     }  
// }
// // 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TextFieldExample {
public static void main(String[] args) {
// Create the main frame
JFrame frame = new JFrame("Enhanced Swing Event Demo");
frame.setSize(600, 600);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(new FlowLayout());

JButton button = new JButton("Click Me");
button.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(frame, "Button clicked!");
}
});
frame.add(button);
}
}