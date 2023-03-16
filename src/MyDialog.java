import javax.swing.*;
import java.awt.*;

public class MyDialog extends JDialog {

    public MyDialog(Frame parent, String title) {
        super(parent, title, true);

        //створення написів та текстових полів
        JLabel label1 = new JLabel("Логін:");
        JTextField textField1 = new JTextField(10);
        JLabel label2 = new JLabel("Пароль:");
        JTextField textField2 = new JTextField(10);

        //створення кнопок
        JButton okButton = new JButton("ОК");
        JButton cancelButton = new JButton("Відміна");

        //створення панелі з FlowLayout та додавання на неї елементів
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(okButton);
        panel.add(cancelButton);

        //додавання панелі до вікна
        getContentPane().add(panel);

        //задання розміру вікна та відображення його на екрані
        setSize(300, 150);
        setLocationRelativeTo(parent);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Вікно входу");
        JButton button = new JButton("Open Dialog");
        button.addActionListener(e -> {
            MyDialog dialog = new MyDialog(frame, "My Dialog");
            dialog.setVisible(true);
        });
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(button);
        frame.add(panel);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
