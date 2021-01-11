import javax.swing.JFrame;
public class HelloFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}