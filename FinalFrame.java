/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project3_6581178;

/**
 *
 * @author kyawz
 */


import javax.swing.*;
import java.awt.*;

public class FinalFrame extends JFrame {
    public FinalFrame() {
        setTitle("You Reached the Hospital!");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Rescue Complete! Thank you!", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        add(label);

        setVisible(true);
    }
}
