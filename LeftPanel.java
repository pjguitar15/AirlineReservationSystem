import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

public class LeftPanel extends MainReservation {
  public LeftPanel() {
    initComponents();
  }

  public void initComponents() {
    JPanel leftPanel = new JPanel();
    leftPanel.setLayout(new GridBagLayout());
    GridBagConstraints gcon = new GridBagConstraints();
    // space between components
    gcon.insets = new Insets(5, 5, 5, 5);

    leftPanel.setBorder(new EmptyBorder(10, 25, 10, 25));
    leftPanel.setBackground(Color.WHITE);

    // comp1
    JLabel flightDetailLabel = new JLabel("Flight Details");
    flightDetailLabel.setHorizontalAlignment(JLabel.LEFT);
    flightDetailLabel.setFont(new Font("Roboto", Font.BOLD, 14));

    // constraints
    gcon.gridx = 0;
    gcon.gridy = 0;
    leftPanel.add(flightDetailLabel, gcon);

    // separator
    JSeparator separator = new JSeparator();
    separator.setPreferredSize(new Dimension(250, 1));
    separator.setForeground(Color.BLACK);
    gcon.gridx = 0;
    gcon.gridy = 1;
    gcon.gridwidth = 3;
    gcon.fill = GridBagConstraints.HORIZONTAL;
    leftPanel.add(separator, gcon);

    // Date field
    JLabel chooseDate = new JLabel("Choose date");
    chooseDate.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    chooseDate.setHorizontalAlignment(JLabel.LEFT);
    chooseDate.setFont(new Font("Roboto", Font.PLAIN, 12));
    gcon.gridx = 0;
    gcon.gridy = 2;
    leftPanel.add(chooseDate, gcon);

    JDateChooser dateChooser = new JDateChooser();
    dateChooser.setPreferredSize(new Dimension(150, 25));
    dateChooser.setBackground(Color.WHITE);
    // constraints
    gcon.gridx = 1;
    gcon.gridy = 2;

    leftPanel.add(dateChooser, gcon);

    // departure time
    JLabel departureLabel = new JLabel("Departure time");
    departureLabel.setHorizontalAlignment(JLabel.LEFT);
    departureLabel.setFont(new Font("Roboto", Font.PLAIN, 12));
    gcon.gridx = 0;
    gcon.gridy = 3;
    leftPanel.add(departureLabel, gcon);

    JTextField departureField = new JTextField();
    departureField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    departureField.setPreferredSize(new Dimension(150, 25));
    gcon.gridx = 1;
    gcon.gridy = 3;
    leftPanel.add(departureField, gcon);

    // flight number
    JLabel flightLabel = new JLabel("Flight No.");
    flightLabel.setHorizontalAlignment(JLabel.LEFT);
    flightLabel.setFont(new Font("Roboto", Font.PLAIN, 12));
    gcon.gridx = 0;
    gcon.gridy = 4;
    leftPanel.add(flightLabel, gcon);

    JTextField flightField = new JTextField();
    flightField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    flightField.setPreferredSize(new Dimension(150, 25));
    gcon.gridx = 1;
    gcon.gridy = 4;
    leftPanel.add(flightField, gcon);

    // From location
    JLabel fromLabel = new JLabel("From");
    fromLabel.setHorizontalAlignment(JLabel.LEFT);
    fromLabel.setFont(new Font("Roboto", Font.PLAIN, 12));
    gcon.gridx = 0;
    gcon.gridy = 5;
    leftPanel.add(fromLabel, gcon);

    JTextField fromField = new JTextField();
    fromField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    fromField.setPreferredSize(new Dimension(150, 25));
    gcon.gridx = 1;
    gcon.gridy = 5;
    leftPanel.add(fromField, gcon);

    // To location
    JLabel toLabel = new JLabel("To");
    toLabel.setHorizontalAlignment(JLabel.LEFT);
    toLabel.setFont(new Font("Roboto", Font.PLAIN, 12));
    gcon.gridx = 0;
    gcon.gridy = 6;
    leftPanel.add(toLabel, gcon);

    JTextField toField = new JTextField();
    toField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    toField.setPreferredSize(new Dimension(150, 25));
    gcon.gridx = 1;
    gcon.gridy = 6;
    leftPanel.add(toField, gcon);

    // Class
    JLabel classLabel = new JLabel("Class");
    classLabel.setHorizontalAlignment(JLabel.LEFT);
    classLabel.setFont(new Font("Roboto", Font.PLAIN, 12));
    gcon.gridx = 0;
    gcon.gridy = 7;
    leftPanel.add(classLabel, gcon);

    JTextField classField = new JTextField();
    classField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    classField.setPreferredSize(new Dimension(150, 25));
    gcon.gridx = 1;
    gcon.gridy = 7;
    leftPanel.add(classField, gcon);

    // Charge
    JLabel chargeLabel = new JLabel("Charge");
    chargeLabel.setHorizontalAlignment(JLabel.LEFT);
    chargeLabel.setFont(new Font("Roboto", Font.PLAIN, 12));
    gcon.gridx = 0;
    gcon.gridy = 8;
    leftPanel.add(chargeLabel, gcon);

    JTextField chargeField = new JTextField();
    chargeField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    chargeField.setPreferredSize(new Dimension(150, 25));
    gcon.gridx = 1;
    gcon.gridy = 8;
    leftPanel.add(chargeField, gcon);

    // separator
    JSeparator separator2 = new JSeparator();
    separator2.setPreferredSize(new Dimension(250, 1));
    separator2.setForeground(Color.WHITE);
    gcon.gridx = 0;
    gcon.gridy = 9;
    gcon.gridwidth = 3;
    gcon.fill = GridBagConstraints.HORIZONTAL;
    leftPanel.add(separator2, gcon);

    JButton confirmButton = new JButton("Confirm");
    confirmButton.setBorder(new EmptyBorder(7, 0, 7, 0));
    confirmButton.setBackground(Color.decode("#30336b"));
    confirmButton.setForeground(Color.WHITE);
    confirmButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    gcon.gridx = 0;
    gcon.gridy = 10;
    leftPanel.add(confirmButton, gcon);

    // Buttons
    JButton changeButton = new JButton("Change");
    changeButton.setBorder(new EmptyBorder(7, 0, 7, 0));
    changeButton.setBackground(Color.decode("#95afc0"));
    changeButton.setEnabled(false);
    changeButton.setForeground(Color.WHITE);
    changeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    gcon.gridx = 0;
    gcon.gridy = 11;
    leftPanel.add(changeButton, gcon);

    confirmButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // handle empty fields
        if (departureField.getText().isEmpty()) {
          JOptionPane.showMessageDialog(null, "Departure time cannot be empty");
        } else if (dateChooser.getDate() == null) {
          JOptionPane.showMessageDialog(null, "Date cannot be empty");
        } else if (flightField.getText().isEmpty()) {
          JOptionPane.showMessageDialog(null, "Flight number cannot be empty");
        } else if (fromField.getText().isEmpty()) {
          JOptionPane.showMessageDialog(null, "From field cannot be empty");
        } else if (toField.getText().isEmpty()) {
          JOptionPane.showMessageDialog(null, "To field cannot be empty");
        } else if (classField.getText().isEmpty()) {
          JOptionPane.showMessageDialog(null, "Class cannot be empty");
        } else if (chargeField.getText().isEmpty()) {
          JOptionPane.showMessageDialog(null, "Charge field cannot be empty");
        } else {
          // try catch
          try {
            flight = new FlightDetails(dateChooser.getDate().toString(), departureField.getText(),
                flightField.getText(), fromField.getText(), toField.getText(), classField.getText(),
                Double.parseDouble(chargeField.getText()));

            // success message
            JOptionPane.showMessageDialog(null, "Flight details successfully entered");

            // disable fields
            dateChooser.setEnabled(false);
            departureField.setEditable(false);
            flightField.setEditable(false);
            fromField.setEditable(false);
            toField.setEditable(false);
            classField.setEditable(false);
            chargeField.setEditable(false);
            confirmButton.setEnabled(false);

            // enable change button and change text color
            changeButton.setEnabled(true);
            passengerDetailsLabel.setForeground(Color.BLACK);

            // change button color
            confirmButton.setBackground(Color.decode("#95afc0"));
            changeButton.setBackground(Color.decode("#30336b"));

            passengerDetailsLabel.setText("Passenger Details for flight " + flight.getFlightNumber());

            System.out.println(flight.toString());
          } catch (Exception except) {
            JOptionPane.showMessageDialog(null, "Charge field should be a numeric value!", "Error",
                JOptionPane.ERROR_MESSAGE);
          }

        }
      }
    });

    changeButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // enable fields
        dateChooser.setEnabled(true);
        departureField.setEditable(true);
        flightField.setEditable(true);
        fromField.setEditable(true);
        toField.setEditable(true);
        classField.setEditable(true);
        chargeField.setEditable(true);
        confirmButton.setEnabled(true);

        // change button color
        confirmButton.setBackground(Color.decode("#30336b"));
        changeButton.setBackground(Color.decode("#95afc0"));
        passengerDetailsLabel.setText("PANEL DISABLED");

        // change text color
        passengerDetailsLabel.setForeground(Color.lightGray);

        // disable change button
        changeButton.setEnabled(false);
      }
    });

    // this.add(leftPanel, BorderLayout.WEST);
  }
}
