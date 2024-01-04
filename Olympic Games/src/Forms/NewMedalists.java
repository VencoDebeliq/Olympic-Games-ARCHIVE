/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;
import Code.Queries;
import Code.Operations;
import Entitys.Competitor;
import javax.swing.JComboBox;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author v_pai
 */
public class NewMedalists extends javax.swing.JFrame {
    private ArrayList <Competitor> competitors = Competitor.getAll();
    /**
     * Creates new form NewMedalists
     */
    public NewMedalists() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Add new medalists");
        setResizable(false);
        cbbDisc.removeAllItems();
        for (String s: Operations.generateDiscipline())
        {
            cbbDisc.addItem(s);
        }
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
        lblMedal = new javax.swing.JLabel();
        lblDisc = new javax.swing.JLabel();
        lblDescr = new javax.swing.JLabel();
        pnlButtons = new javax.swing.JPanel();
        txtOGID = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        cbbDisc = new javax.swing.JComboBox<>();
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
        lblCompID.setText("Competitor ID");

        lblOGID.setBackground(new java.awt.Color(255, 255, 102));
        lblOGID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblOGID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOGID.setText("Olympic games");

        lblMedal.setBackground(new java.awt.Color(255, 255, 102));
        lblMedal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblMedal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMedal.setText("Medal type");

        lblDisc.setBackground(new java.awt.Color(255, 255, 102));
        lblDisc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDisc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDisc.setText("Discipline");

        lblDescr.setBackground(new java.awt.Color(255, 255, 102));
        lblDescr.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDescr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescr.setText("Description");

        pnlButtons.setBackground(new java.awt.Color(255, 255, 102));

        txtOGID.setBackground(new java.awt.Color(254, 255, 228));
        txtOGID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtOGID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtDesc.setBackground(new java.awt.Color(254, 255, 228));
        txtDesc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDesc.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jComboBox1.setBackground(new java.awt.Color(254, 255, 228));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gold", "Silver", "Bronze" }));

        cbbDisc.setBackground(new java.awt.Color(254, 255, 228));
        cbbDisc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
                    .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                        .addComponent(txtOGID, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbbDisc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(15, 15, 15)
                .addComponent(cbbDisc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnSaveMedals.setBackground(new java.awt.Color(254, 255, 228));
        btnSaveMedals.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSaveMedals.setText("Save");
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
                            .addComponent(lblOGID, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(lblDisc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMedal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDescr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSaveMedals, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnl2Layout.setVerticalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCompID)
                        .addGap(18, 18, 18)
                        .addComponent(lblOGID)
                        .addGap(18, 18, 18)
                        .addComponent(lblDisc)
                        .addGap(18, 18, 18)
                        .addComponent(lblMedal)
                        .addGap(18, 18, 18)
                        .addComponent(lblDescr))
                    .addComponent(pnlButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
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
            .addComponent(pnl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Operations.btn(new Choice(), this);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveMedalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveMedalsActionPerformed
        try
        {
            String q = "INSERT INTO Medal_Winners ( Competitor_ID, Olympic_Games_ID, Discipline_ID, Medal_Type_ID, Description )\n" +
                        "VALUES("
                    + getCompID(cbbComp) + ", "
                    + txtOGID.getText() + ", "
                    + getDiscID(cbbDisc) + ", "
                    + (jComboBox1.getSelectedIndex() + 1) + ", "
                    + "\"" + txtDesc.getText() + "\");";
        
            System.out.println(q);
            Queries query = new Queries(q);
            Confirm openPageConfirm = new Confirm(this, btnSaveMedals, query);
            openPageConfirm.setVisible(true);
            btnSaveMedals.setEnabled(false);
        }
        catch (Exception ex)
        {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnSaveMedalsActionPerformed

    private void cbbCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbCompActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbCompActionPerformed
   
    private int getDiscID(JComboBox disc) throws Exception
    {
        String sql = "SELECT Discipline.ID FROM Discipline\n"
                + "WHERE (((Discipline.Discipline_Name) Like \""
                + disc.getSelectedItem() + "\"));";
        Queries q = new Queries(sql);
        ResultSet rs = q.execute();
        rs.next();
        return rs.getInt(1);
    }
    
    private int getCompID(JComboBox <String> comp)
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
    private javax.swing.JComboBox<String> cbbDisc;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lblCompID;
    private javax.swing.JLabel lblDescr;
    private javax.swing.JLabel lblDisc;
    private javax.swing.JLabel lblMedal;
    private javax.swing.JLabel lblOGID;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtOGID;
    // End of variables declaration//GEN-END:variables
}
