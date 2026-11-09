package gui;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class LoginFrame extends JFrame{
    private JPanel main;
    private JPanel header;
    private JPanel footer;
    private JButton btnLogin;
    private JButton btnReset;
    private JPanel form;
    private JTextField tfUsername;
    private JTextField tfIDNumber;
    private JPasswordField tfPassword;

    public LoginFrame(){
        setTitle("SIS :: Login");
        setContentPane(this.main);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        btnLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //show JOP tf
                JOptionPane.showMessageDialog(btnLogin, "Username: " + tfUsername.getText() + "\nStudentID: " + tfIDNumber.getText() + "\nPassword: " + new String(tfPassword.getPassword()));
            }
        });
        btnReset.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                tfUsername.setText("");
                tfIDNumber.setText("");
                tfPassword.setText("");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                IO.print("mouse pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                IO.print("released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                IO.println("mouse enter");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                IO.println("mouse exit");
            }

            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                super.mouseWheelMoved(e);
                IO.println("scroll");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                IO.println("mouse moving");
            }
        });
    }

}
