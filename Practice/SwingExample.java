import javax.swing.*;

public class SwingExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Swing in VS Code");
        JButton button = new JButton("Click Me!");

        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Hello, Swing!"));

        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
