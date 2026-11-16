package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnotherComponents extends JFrame{
    private JComboBox cboxItems;
    private JTextField tfQty;
    private JButton btnCompute;
    private JLabel lbCost;
    private JPanel mainPanel;
    private JList listAddedItems;
    private JSpinner spinner1;
    private JButton button1;
    private JTabbedPane tabbedPane1;
    private JSlider slider1;
    private JButton startProgressButton;
    private JTextArea textArea1;
    private JProgressBar progressBar1;
    private DefaultListModel<String> model;
    static int progressValue = 0;

    public AnotherComponents() {
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        model = new DefaultListModel<>();
        listAddedItems.setModel(model);
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //add: product - qty
                String product = cboxItems.getSelectedItem().toString();
                String item = product.split("-")[0] + " - " + tfQty.getText();
                model.addElement(item);
//                model.addElement("sample");
//                int itemIndex = cboxItems.getSelectedIndex();
//                int qty = Integer.parseInt(tfQty.getText());
//                double[] prices = {5.5, 2.45, 125, 56};
//                double cost = qty * prices[itemIndex];
                //variable declation -> assigned value
                //prices:
                //Pen - 5.5
                //Pencil - 2.45
                //Paper - 125
                //Ink - 56
//                if(itemIndex == 0) cost = 5.5 * qty;
//                else if(itemIndex == 1) cost = 2.45 * qty;
//                else if(itemIndex == 2) cost = 125 * qty;
//                else if(itemIndex == 3) cost = 56 * qty;
//                lbCost.setText("Cost: " + cost);

            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IO.println(spinner1.getValue());
                IO.println(slider1.getValue());
                IO.println(textArea1.getText());
            }
        });

        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                progressValue+=2;
                progressBar1.setValue(progressValue);
                if(progressValue >= 100){
                    ((Timer)e.getSource()).stop();
                    IO.println("timer stopped");
                }
            }
        });

        startProgressButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //increase 1 progressbar value per second
                //delay milliseconds 1000ms - 1 second
                timer.start();

            }
        });
    }
}
