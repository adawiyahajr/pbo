package pbo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAnadShowGUI();
            }
        });
    }

    private static void createAnadShowGUI() {
        // membuat frame
        JFrame frame = new JFrame("JTextField sum");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // membuat JTextField untuk input nilai
        JTextField textField1 = new JTextField(10);
        JTextField textField2 = new JTextField(10);

        // membuat JButton untuk menjumlahkan nilai
        JButton addButton = new JButton("Tambah");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // mengambil nilai JTextField
                int value1 = Integer.parseInt(textField1.getText());
                int value2 = Integer.parseInt(textField2.getText());

                // menjumlahkan nilai
                int sum = value1 + value2;

                // memeriksa apakah hasil penjumlahan adalah 12
                if (sum == 12) {
                    JOptionPane.showMessageDialog(frame, "Hasil penjumlahan adalah 12");
                } else {
                    JOptionPane.showMessageDialog(frame, "Hasil penjumlahan bukan 12");
                }
            }
        });

        // menambahkan komponen ko JFrame
        frame.add(new JLabel("nilai 1: "));
        frame.add(textField1);
        frame.add(new JLabel("nilai 2: "));
        frame.add(textField2);
        frame.add(addButton);

        // menampilkan JFrame
        frame.pack();
        frame.setVisible(true);
    }
}
