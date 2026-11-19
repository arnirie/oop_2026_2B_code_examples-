package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabActivity extends  JFrame{
    private JPanel mainPanel;
    private JComboBox cboxItems;
    private JTextField tfQty;
    private JButton btnAdd;
    private JList listAddedItems;
    private JLabel lbTotal;
    private JButton deleteButton;
    private DefaultListModel<String> model;

    public LabActivity(){
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);

        //jlist
        model = new DefaultListModel<>();
        listAddedItems.setModel(model);

        btnAdd.addActionListener(new ActionListener() {
            double total = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                String item = cboxItems.getSelectedItem().toString();
                double price = Double.parseDouble(item.split("-")[1]);
                int qty = 0;
                try {
                    qty = Integer.parseInt(tfQty.getText());
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(mainPanel, "Invalid quantity value");
                    return;
                }
                total += qty * price;
                model.addElement(item.split("-")[0] + " - " + qty);
                lbTotal.setText("Total: " + total);
            }
        });
    }
}
