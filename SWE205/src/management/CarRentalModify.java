package management;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import exceptions.DateInThePastException;
import login.Costumer;
import login.Login;
import rental.ChoosePaymentReserved;
import rental.Reservation;

// This class is used to allow the customer to modify his reservation 
// or delete it
public class CarRentalModify extends javax.swing.JFrame {

    private Reservation reservation;
    private Costumer user;
    private String dateString;

    public CarRentalModify(Costumer user, Reservation reservation) {
        initComponents();
        this.user = user;
        this.reservation = reservation;
        // The following lines are for intilizing the component with the 
        // reservation data
        brandTextField.setText(reservation.getCar().getBrand());
        colorTextField.setText(reservation.getCar().getColor());
        sizeTextField.setText(reservation.getCar().getSize());
        modelTextField.setText(reservation.getCar().getModel());
        priceTextField.setText("" + reservation.getCar().getCostPerDay());
        newEndDateTextField.setText("DD/MM/YYYY");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        brandTextField = new javax.swing.JTextField();
        colorTextField = new javax.swing.JTextField();
        sizeTextField = new javax.swing.JTextField();
        modelTextField = new javax.swing.JTextField();
        newEndDateTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        priceTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\YASER\\Pictures\\car.png")); // NOI18N
        jLabel1.setAutoscrolls(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(3, 3));

        jLabel2.setText("Brand:");

        jLabel3.setText("Color:");

        jLabel4.setText("Size:");

        jLabel5.setText("Model:");

        jLabel6.setText("Price:");

        brandTextField.setEditable(false);
        brandTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandTextFieldActionPerformed(evt);
            }
        });

        colorTextField.setEditable(false);

        sizeTextField.setEditable(false);
        sizeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeTextFieldActionPerformed(evt);
            }
        });

        modelTextField.setEditable(false);
        modelTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setText("To:");

        priceTextField.setEditable(false);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(newEndDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(colorTextField)
                                                                        .addComponent(sizeTextField)
                                                                        .addComponent(modelTextField)
                                                                        .addComponent(priceTextField)
                                                                        .addComponent(brandTextField)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(133, 133, 133)
                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 25, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(brandTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(colorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(sizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(modelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(newEndDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("Logout");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Cancel Rental");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton2)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(48, 48, 48)
                                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(62, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(995, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void brandTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandTextFieldActionPerformed

    private void sizeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sizeTextFieldActionPerformed

    private void modelTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String message;
        double payday = Double.parseDouble(priceTextField.getText());
        dateString = newEndDateTextField.getText();
        // This is to foramt the date
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            df.setLenient(false);
            ;
            Date endDate = df.parse(dateString);
            // This is to get the start date of the reservation
            Date todayDate = Reservation.getTodayDate();
            // This is to get the total price of the reservation
            double total = Reservation.getTotalPrice(todayDate, endDate, reservation.getCar().getCostPerDay());
            double costDiffrence = total - reservation.getTotalPrice();
            if (costDiffrence == 0) {
                message = user.modifyReservationEqualCost(reservation, reservation.getCar(), endDate);
                JOptionPane.showMessageDialog(null, message, null, JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                new CarRentalManage(user).setVisible(true);
            } else if (costDiffrence < 0) {
                message = user.modifyReservationLessCost(reservation, reservation.getCar(), endDate);
                JOptionPane.showMessageDialog(null, message, null, JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                new CarRentalManage(user).setVisible(true);
            } else {
                this.setVisible(false);
                new ChoosePaymentReserved(user, reservation, costDiffrence, endDate).setVisible(true);
            }

        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Please Enter a Valid Date in The Format\nDD/MM/YYYY", "Not a Valid Date", JOptionPane.ERROR_MESSAGE);
        } catch (DateInThePastException e) {
            JOptionPane.showMessageDialog(null, "Please Enter a Valid Date", "Not a Valid Date", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void colorTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorTextActionPerformed

    }//GEN-LAST:event_colorTextActionPerformed

    private void newEndDateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEndDateTextActionPerformed

    }//GEN-LAST:event_newEndDateTextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // This opting is to make sure that the customer wnat to delete his reservation
        Object[] options1 = {"Yes", "No"};
        int optionSelected = JOptionPane.showOptionDialog(null, "Are You Sure You Want to Delete This Rental?", null,
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options1, options1[0]);
        switch (optionSelected) {
            case JOptionPane.YES_OPTION:
                // The next line is for deleting the resrvation and returning the 
                // promoting message
                String message = user.deleteReservation(reservation);
                JOptionPane.showMessageDialog(null, message, null, JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                new CarRentalManage(user).setVisible(true);

                break;
            case JOptionPane.NO_OPTION:

                break;
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void priceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTextActionPerformed

    }//GEN-LAST:event_priceTextActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        new CarRentalManage(user).setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField brandTextField;
    private javax.swing.JTextField colorTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField modelTextField;
    private javax.swing.JTextField newEndDateTextField;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JTextField sizeTextField;
    // End of variables declaration//GEN-END:variables
}
