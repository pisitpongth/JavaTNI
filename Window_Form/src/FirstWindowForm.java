import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstWindowForm {
    private JPanel first_win_form;
    private JLabel lbl_firstname;
    private JLabel lbl_lastname;
    private JTextField txt_firstname;
    private JTextField txt_lastname;
    private JButton btn_submit;
    private JButton btn_reset;
    private JFrame frame;

    public FirstWindowForm() {
        frame = new JFrame();
        frame.setContentPane(first_win_form);
        frame.setTitle("My Window Form");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        btn_submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txt_firstname.getText().isEmpty() || txt_lastname.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Please fill in your First Name or Last Name",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Hello! " + txt_firstname.getText() + " " + txt_lastname.getText());
                }
            }
        });

        btn_reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_firstname.setText("");
                txt_lastname.setText("");
            }
        });
    }

    public static void main(String[] args) {
        FirstWindowForm winform = new FirstWindowForm();
    }
}
