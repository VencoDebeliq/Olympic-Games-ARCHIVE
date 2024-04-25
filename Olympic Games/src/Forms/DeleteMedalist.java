/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;
import Code.Queries;
import Code.Operations;
import Code.Regex;
import Entitys.Competitor;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class DeleteMedalist extends javax.swing.JFrame {
    private ArrayList <Competitor> competitors = Competitor.getAll();
    /**
     * Creates new form DeleteCommpetitor
     */
    public DeleteMedalist() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Delete medalist");
        setResizable(false);
        cbbComp.removeAllItems();
        for (Competitor c: competitors)
        {
            cbbComp.addItem(c.getFirst_Name() + " " + c.getLast_Name());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        pnl2 = new javax.swing.JPanel();
        lblCompID = new javax.swing.JLabel();
        lblOGID = new javax.swing.JLabel();
        pnlButtons = new javax.swing.JPanel();
        txtOGID = new javax.swing.JTextField();
        cbbComp = new javax.swing.JComboBox<>();
        btnSaveMedals = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl1.setBackground(new java.awt.Color(254, 255, 228));

        btnBack.setBackground(new java.awt.Color(254, 255, 228));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("<-");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        pnl2.setBackground(new java.awt.Color(255, 255, 102));

        lblCompID.setBackground(new java.awt.Color(255, 255, 102));
        lblCompID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblCompID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompID.setText("Competitor");

        lblOGID.setBackground(new java.awt.Color(255, 255, 102));
        lblOGID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblOGID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOGID.setText("Olympic games");

        pnlButtons.setBackground(new java.awt.Color(255, 255, 102));

        txtOGID.setBackground(new java.awt.Color(254, 255, 228));
        txtOGID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtOGID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cbbComp.setBackground(new java.awt.Color(254, 255, 228));
        cbbComp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbCompActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlButtonsLayout = new javax.swing.GroupLayout(pnlButtons);
        pnlButtons.setLayout(pnlButtonsLayout);
        pnlButtonsLayout.setHorizontalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOGID, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbComp, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlButtonsLayout.setVerticalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbbComp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(txtOGID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSaveMedals.setBackground(new java.awt.Color(254, 255, 228));
        btnSaveMedals.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSaveMedals.setText("Delete");
        btnSaveMedals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveMedalsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl2Layout = new javax.swing.GroupLayout(pnl2);
        pnl2.setLayout(pnl2Layout);
        pnl2Layout.setHorizontalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCompID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblOGID, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSaveMedals, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnl2Layout.setVerticalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCompID)
                        .addGap(18, 18, 18)
                        .addComponent(lblOGID))
                    .addComponent(pnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSaveMedals))
        );

        javax.swing.GroupLayout pnl1Layout = new javax.swing.GroupLayout(pnl1);
        pnl1.setLayout(pnl1Layout);
        pnl1Layout.setHorizontalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(pnl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Operations.btn(new Choice(), this);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveMedalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveMedalsActionPerformed
        try
        {
            if (!Regex.checkOlympicID(txtOGID.getText())) throw new Exception("Regex exception");
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
            System.err.println(ex.getMessage());
        }
        String sql = "DELETE " +
                    "FROM Medal_Winners\n" +
                    "WHERE (((Medal_Winners.Competitor_ID)=" + getCompID(cbbComp) + ") AND ((Medal_Winners.Olympic_Games_ID)=" + txtOGID.getText() + "));";
        System.out.println(sql);
        Queries query = new Queries(sql);
        Confirm openPageConfirm = new Confirm(this, btnSaveMedals, query);
        openPageConfirm.setVisible(true);
        btnSaveMedals.setEnabled(false);
    }//GEN-LAST:event_btnSaveMedalsActionPerformed

    private void cbbCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbCompActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbCompActionPerformed

    private int getCompID(JComboBox <String> comp) // returns the ID of a competitor given his name
    {
        String el = (String) comp.getSelectedItem();
        for (Competitor c: competitors)
        {
            String names = c.getFirst_Name() + " " + c.getLast_Name();
            if (el.equals(names)) return c.getID();
        }
        return -1;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSaveMedals;
    private javax.swing.JComboBox<String> cbbComp;
    private javax.swing.JLabel lblCompID;
    private javax.swing.JLabel lblOGID;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JTextField txtOGID;
    // End of variables declaration//GEN-END:variables
}
