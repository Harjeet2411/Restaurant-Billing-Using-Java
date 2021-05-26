
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

class Restaurant_Billing implements ActionListener {
    private static JCheckBox button1;
    private static JCheckBox button2;
    private static JCheckBox button3;
    private static JCheckBox button4;
    private static JCheckBox button5;
    private static JCheckBox button6;
    private static JCheckBox button7;
    private static JCheckBox button8;
    private static JCheckBox button9;
    private static JCheckBox button10;
    private static JCheckBox button11;
    private static JCheckBox button12;
    private static JButton bill;
    private static JLabel rate;
    private static JLabel label;
    private static JLabel total;
    private static JFormattedTextField totalvalue;
    private static JLabel quantity;
    private static JFormattedTextField Finnalbill;
    private static JFormattedTextField quantext;
    private static JFormattedTextField ratevalue;


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setTitle("RESTAURANT");
        frame.setFont(new Font("Comic Sans MS", Font.PLAIN, 35));
        frame.setSize(2000, 2000);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setForeground(Color.DARK_GRAY);
        panel.setLayout(null);
        panel.setBackground(Color.lightGray);
        label = new JLabel("CHILL 'N' CHIPS");
        label.setForeground(Color.ORANGE);
        label.setFont(new Font("Chiller", Font.BOLD, 150));
        label.setBounds(350, 500, 1700, 205);
        panel.add(label);

        button1 = new JCheckBox("VEG BURGER - Rs.100");
        button1.addActionListener(new Restaurant_Billing());
        button1.setForeground(Color.RED);
        button1.setBounds(35, 40, 200, 25);
        panel.add(button1);

        button5 = new JCheckBox("DOUBLE PATTY VEG BURGER - Rs.130");
        button5.addActionListener(new Restaurant_Billing());
        button5.setForeground(Color.RED);
        button5.setBounds(285, 40, 300, 25);
        panel.add(button5);

        button9 = new JCheckBox("VEGIE OVERLOADED BURGER - Rs.170");
        button9.addActionListener(new Restaurant_Billing());
        button9.setForeground(Color.RED);
        button9.setBounds(630, 40, 300, 25);
        panel.add(button9);

        button2 = new JCheckBox("CHICKEN BURGER - RS.150");
        button2.addActionListener(new Restaurant_Billing());
        button2.setBounds(35, 70, 200, 25);
        button2.setForeground(Color.RED);
        panel.add(button2);

        button6 = new JCheckBox("CRISPY & SPICY CHICKEN BURGER - Rs.200");
        button6.addActionListener(new Restaurant_Billing());
        button6.setForeground(Color.RED);
        button6.setBounds(285, 70, 300, 25);
        panel.add(button6);

        button10 = new JCheckBox("MEAT LOADED BURGER - Rs.230");
        button10.addActionListener(new Restaurant_Billing());
        button10.setForeground(Color.RED);
        button10.setBounds(630, 70, 300, 25);
        panel.add(button10);

        button3 = new JCheckBox("PIZZA SLICE Pc x 1 - Rs.50");
        button3.addActionListener(new Restaurant_Billing());
        button3.setBounds(35, 100, 200, 25);
        button3.setForeground(Color.RED);
        panel.add(button3);

        button7 = new JCheckBox("LOCK AND LOADED PIZZA Pc x 6 - Rs.350");
        button7.addActionListener(new Restaurant_Billing());
        button7.setForeground(Color.RED);
        button7.setBounds(285, 100, 300, 25);
        panel.add(button7);

        button11 = new JCheckBox("PIZZA SANDWICH - Rs.250");
        button11.addActionListener(new Restaurant_Billing());
        button11.setForeground(Color.RED);
        button11.setBounds(630, 100, 300, 25);
        panel.add(button11);

        button4 = new JCheckBox("FRENCH FRIES - Rs.40");
        button4.addActionListener(new Restaurant_Billing());
        button4.setBounds(35, 130, 200, 25);
        button4.setForeground(Color.RED);
        panel.add(button4);

        button8 = new JCheckBox("COKE 650ml - Rs.70");
        button8.addActionListener(new Restaurant_Billing());
        button8.setForeground(Color.RED);
        button8.setBounds(285, 130, 300, 25);
        panel.add(button8);

        button12 = new JCheckBox("LIME FRESHERS - Rs.50");
        button12.addActionListener(new Restaurant_Billing());
        button12.setForeground(Color.RED);
        button12.setBounds(630, 130, 300, 25);
        panel.add(button12);

        quantity = new JLabel("QUANTITY");
        quantity.setBounds(30, 200, 80, 25);
        quantity.setForeground(Color.BLACK);
        panel.add(quantity);
        quantext = new JFormattedTextField();
        quantext.setBounds(100, 200, 80, 25);
        quantext.setForeground(Color.BLUE);
        panel.add(quantext);

        rate = new JLabel("RATE");
        rate.setBounds(50, 240, 165, 25);
        rate.setForeground(Color.BLACK);
        panel.add(rate);

        ratevalue = new JFormattedTextField();
        ratevalue.setBounds(100, 240, 165, 25);
        ratevalue.setForeground(Color.BLUE);
        panel.add(ratevalue);

        total = new JLabel("TOTAL AMOUNT");
        total.setBounds(10, 280, 465, 40);
        total.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        total.setForeground(Color.BLUE);
        panel.add(total);


        totalvalue = new JFormattedTextField();
        totalvalue.setBounds(200, 290, 165, 25);
        panel.add(totalvalue);


        bill = new JButton(" End Purchase....");
        bill.addActionListener(new Restaurant_Billing());
        bill.setForeground(Color.BLACK);
        bill.setBounds(1000, 280, 300, 25);
        panel.add(bill);


        frame.setVisible(true);

    }



    public void actionPerformed(ActionEvent e)
    {
        int qty;
        double amount1=0,amount2=0,amount3=0,amount4=0,amount5=0,amount6=0,amount7=0,amount8=0,amount9=0,amount10=0,amount11=0,amount12=0,amount=0;
        if (e.getSource() != bill)
        {

            if (button1.isSelected()) {
                qty = Integer.parseInt(JOptionPane.showInputDialog("ENTER THE NUMBER OF ITEMS"));
                quantext.setText("" + qty);
                int rate = 100;
                amount1 = qty * rate;
                amount = amount + amount1;
                ratevalue.setText(""+rate);
                totalvalue.setText(""+amount1);
            }
            else if (button2.isSelected())
            {
                qty = Integer.parseInt(JOptionPane.showInputDialog("ENTER THE NUMBER OF ITEMS"));
                quantext.setText("" + qty);
                int rate = 150;
                amount2 = (qty * rate);
                amount = amount + amount2;
                ratevalue.setText(""+rate);
                totalvalue.setText(""+amount2);

            }
            else if (button3.isSelected())
            {
                qty = Integer.parseInt(JOptionPane.showInputDialog("ENTER THE NUMBER OF ITEMS"));
                quantext.setText("" + qty);
                int rate = 50;
                amount3 = (qty * rate);
                amount = amount + amount3;
                ratevalue.setText(""+rate);
                totalvalue.setText(""+amount3);
            }
            else if (button4.isSelected())
            {
                qty = Integer.parseInt(JOptionPane.showInputDialog("ENTER THE NUMBER OF ITEMS"));
                quantext.setText("" + qty);
                int rate = 30;
                amount4 = (qty * rate);
                amount = amount + amount4;
                ratevalue.setText(""+rate);
                totalvalue.setText(""+amount4);
            }
            else if (button5.isSelected())
            {
                qty = Integer.parseInt(JOptionPane.showInputDialog("ENTER THE NUMBER OF ITEMS"));
                quantext.setText("" + qty);
                int rate = 130;
                amount5 = (qty * rate);
                amount = amount + amount5;
                ratevalue.setText(""+rate);
                totalvalue.setText(""+amount5);
            }
            else if (button6.isSelected())
            {
                qty = Integer.parseInt(JOptionPane.showInputDialog("ENTER THE NUMBER OF ITEMS"));
                quantext.setText("" + qty);
                int rate = 200;
                amount6 = (qty * rate);
                amount = amount + amount5;
                ratevalue.setText(""+rate);
                totalvalue.setText(""+amount6);
            }
            else if (button7.isSelected())
            {
                qty = Integer.parseInt(JOptionPane.showInputDialog("ENTER THE NUMBER OF ITEMS"));
                quantext.setText("" + qty);
                int rate = 350;
                amount7 = (qty * rate);
                amount = amount + amount6;
                ratevalue.setText(""+rate);
                totalvalue.setText(""+amount7);
            }
            else if (button8.isSelected())
            {
                qty = Integer.parseInt(JOptionPane.showInputDialog("ENTER THE NUMBER OF ITEMS"));
                quantext.setText("" + qty);
                int rate = 70;
                amount8 = (qty * rate);
                amount = amount + amount8;
                ratevalue.setText(""+rate);
                totalvalue.setText(""+amount8);
            }
            else if (button9.isSelected())
            {
                qty = Integer.parseInt(JOptionPane.showInputDialog("ENTER THE NUMBER OF ITEMS"));
                quantext.setText("" + qty);
                int rate = 170;
                amount9 = (qty * rate);
                amount = amount + amount9;
                ratevalue.setText(""+rate);
                totalvalue.setText(""+amount9);
            }
            else if (button10.isSelected())
            {
                qty = Integer.parseInt(JOptionPane.showInputDialog("ENTER THE NUMBER OF ITEMS"));
                quantext.setText("" + qty);
                int rate = 230;
                amount10 = (qty * rate);
                amount = amount + amount10;
                ratevalue.setText(""+rate);
                totalvalue.setText(""+amount10);
            }
            else if (button11.isSelected())
            {
                qty = Integer.parseInt(JOptionPane.showInputDialog("ENTER THE NUMBER OF ITEMS"));
                quantext.setText("" + qty);
                int rate = 250;
                amount11 =  (qty * rate);
                amount = amount + amount11;
                ratevalue.setText(""+rate);
                totalvalue.setText(""+amount11);
            }
            else if (button12.isSelected())
            {
                qty = Integer.parseInt(JOptionPane.showInputDialog("ENTER THE NUMBER OF ITEMS"));
                quantext.setText("" + qty);
                int rate = 50;
                amount12 = (qty * rate);
                amount = amount + amount12;
                ratevalue.setText(""+rate);
                totalvalue.setText(""+amount12);
            }

        }
        if (e.getSource()==bill)
        {
            totalvalue.setText(""+ amount);
            JOptionPane.showMessageDialog(null, "TOTAL AMOUNT TO BE PAID: " + "\n", "BILL!!!", JOptionPane.QUESTION_MESSAGE);
        }


    }

}