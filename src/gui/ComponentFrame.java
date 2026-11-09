package gui;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class ComponentFrame extends JFrame {
    private JPanel mainPanel;
    private JRadioButton rbSingle;
    private JRadioButton rbMarried;
    private JRadioButton rbWidowed;
    private JButton checkRadio;
    private JCheckBox cbPrimary;
    private JCheckBox cbSecondary;
    private JCheckBox cbPermanent;
    private JButton btnCheckBox;
    private JTextField tfKM;
    private JRadioButton rbRegular;
    private JRadioButton rbStudentSenior;
    private JButton btnCompute;
    private JLabel lbFare;
    private JComboBox cboxFruits;
    private JList listFruits;
    private JButton btnGetValues;

    public ComponentFrame() {
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        checkRadio.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //check which radio is selected
                String selection = "";
                if(rbSingle.isSelected())
                    selection = rbSingle.getText();
                else if (rbMarried.isSelected())
                    selection = rbMarried.getText();
                else
                    selection = rbWidowed.getText();
                JOptionPane.showMessageDialog(checkRadio, selection);
            }
        });
        btnCheckBox.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String choice = "";
                if(cbPrimary.isSelected()) choice = cbPrimary.getText() + "\n";
                if(cbSecondary.isSelected()) choice += cbSecondary.getText() + "\n";
                if(cbPermanent.isSelected()) choice += cbPermanent.getText();
                JOptionPane.showMessageDialog(btnCheckBox, choice);
            }
        });
        btnCompute.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //km used
                //parsing -> conversion String to numeric
                int km = Integer.parseInt(tfKM.getText());
                double fare = 12;
                fare += km > 4 ? (km - 4) * 3.75 : 0;
//                if(km > 4) fare += (km - 4) * 3.75;
                if(rbStudentSenior.isSelected()) fare -= fare * 0.2;
                lbFare.setText("Computed fare: " + fare);
                //sc/student: provide 20% discount
            }
        });
        btnGetValues.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
//                JOptionPane.showMessageDialog(btnGetValues, cboxFruits.getSelectedItem());
                for(Object item : listFruits.getSelectedValuesList()){
                    JOptionPane.showMessageDialog(btnGetValues, item);
                }
            }
        });
    }
}
