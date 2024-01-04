/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;
import Code.Queries;
import Code.Operations;
import Entitys.Competitor;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

/**
 *
 * @author v_pai
 */
public class UpdateReocrd extends javax.swing.JFrame {

    /**
     * Creates new form NewReocrd
     */
    public UpdateReocrd() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Update record");
        setResizable(false);
        cbbDisc.removeAllItems();
        for(String s: Operations.generateDiscipline()){
            cbbDisc.addItem(s);
        }
        cbbComp.removeAllItems();
        for(Competitor c: Competitor.getAll()){
            cbbComp.addItem(c.getFirst_Name() + " " + c.getLast_Name());
        }
        addDescription();
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
        lblDisc1 = new javax.swing.JLabel();
        lblDescript = new javax.swing.JLabel();
        lblNewDesc = new javax.swing.JLabel();
        lblOGID = new javax.swing.JLabel();
        pnlButtons = new javax.swing.JPanel();
        txtNewDescript = new javax.swing.JTextField();
        txtOGID = new javax.swing.JTextField();
        cbbDisc = new javax.swing.JComboBox<>();
        cbbDesc = new javax.swing.JComboBox<>();
        cbbComp = new javax.swing.JComboBox<>();
        btnSaveMedals = new javax.swing.JButton();
        lblComp1 = new javax.swing.JLabel();

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

        lblDisc1.setBackground(new java.awt.Color(255, 255, 102));
        lblDisc1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDisc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDisc1.setText("Discipline");

        lblDescript.setBackground(new java.awt.Color(255, 255, 102));
        lblDescript.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDescript.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescript.setText("Description");

        lblNewDesc.setBackground(new java.awt.Color(255, 255, 102));
        lblNewDesc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblNewDesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNewDesc.setText("New Description");

        lblOGID.setBackground(new java.awt.Color(255, 255, 102));
        lblOGID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblOGID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOGID.setText("Olympic games");

        pnlButtons.setBackground(new java.awt.Color(255, 255, 102));

        txtNewDescript.setBackground(new java.awt.Color(254, 255, 228));
        txtNewDescript.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNewDescript.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtOGID.setBackground(new java.awt.Color(254, 255, 228));
        txtOGID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtOGID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOGID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOGIDActionPerformed(evt);
            }
        });

        cbbDisc.setBackground(new java.awt.Color(254, 255, 228));
        cbbDisc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbbDisc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbDiscActionPerformed(evt);
            }
        });

        cbbDesc.setBackground(new java.awt.Color(254, 255, 228));
        cbbDesc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbbDesc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbDescActionPerformed(evt);
            }
        });

        cbbComp.setBackground(new java.awt.Color(254, 255, 228));
        cbbComp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbbComp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pnlButtonsLayout = new javax.swing.GroupLayout(pnlButtons);
        pnlButtons.setLayout(pnlButtonsLayout);
        pnlButtonsLayout.setHorizontalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbbDisc, 0, 337, Short.MAX_VALUE)
                    .addComponent(cbbDesc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNewDescript)
                    .addComponent(cbbComp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOGID)))
        );
        pnlButtonsLayout.setVerticalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbbDisc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbbDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(txtNewDescript, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbbComp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtOGID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSaveMedals.setBackground(new java.awt.Color(254, 255, 228));
        btnSaveMedals.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSaveMedals.setText("Save");
        btnSaveMedals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveMedalsActionPerformed(evt);
            }
        });

        lblComp1.setBackground(new java.awt.Color(255, 255, 102));
        lblComp1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblComp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblComp1.setText("New Competitor");

        javax.swing.GroupLayout pnl2Layout = new javax.swing.GroupLayout(pnl2);
        pnl2.setLayout(pnl2Layout);
        pnl2Layout.setHorizontalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblComp1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNewDesc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(lblDisc1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDescript, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblOGID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSaveMedals, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnl2Layout.setVerticalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDisc1)
                        .addGap(18, 18, 18)
                        .addComponent(lblDescript)
                        .addGap(18, 18, 18)
                        .addComponent(lblNewDesc)
                        .addGap(18, 18, 18)
                        .addComponent(lblComp1)
                        .addGap(23, 23, 23)
                        .addComponent(lblOGID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addComponent(pnlButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addComponent(btnSaveMedals))
        );

        javax.swing.GroupLayout pnl1Layout = new javax.swing.GroupLayout(pnl1);
        pnl1.setLayout(pnl1Layout);
        pnl1Layout.setHorizontalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl1Layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnl1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(pnl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        Queries query = new Queries();
        Confirm openPageConfirm = new Confirm(this, btnSaveMedals, query);
        openPageConfirm.setVisible(true);
        btnSaveMedals.setEnabled(false);
    }//GEN-LAST:event_btnSaveMedalsActionPerformed

    private void txtOGIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOGIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOGIDActionPerformed

    private void cbbDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbDescActionPerformed

    private void cbbDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbDiscActionPerformed
        addDescription();
    }//GEN-LAST:event_cbbDiscActionPerformed

    private ArrayList <String> getDescriptionFromDisc()
    {
        ArrayList <String> ans = new ArrayList <> ();
        String sql = "SELECT Record.Description FROM Record\n"
                + "WHERE (Record.Discipline = " + getDiscID(cbbDisc) + ");";
        Queries q = new Queries(sql);
        ResultSet rs = q.execute();
        try
        {
            while (rs.next())
            {
                ans.add(rs.getString(1));
            }
        }
        catch (Exception ex)
        {
            System.err.println(ex.getMessage());
        }
        return ans;
    }
    
    private int getDiscID(JComboBox <String> disc)
    {
        String name = (String) disc.getSelectedItem();
        String sql = "SELECT Discipline.ID FROM Discipline\n"
                + "WHERE (Discipline.Discipline_Name Like \"" + name + "\");";
        Queries q = new Queries(sql);
        ResultSet rs = q.execute();
        try
        {
            rs.next();
            return rs.getInt(1);
        }
        catch (Exception ex)
        {
            System.err.println(ex.getMessage());
            return -1;
        }
    }
    
    private void addDescription()
    {
        cbbDesc.removeAllItems();
        for (String s: getDescriptionFromDisc())
        {
            cbbDesc.addItem(s);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSaveMedals;
    private javax.swing.JComboBox<String> cbbComp;
    private javax.swing.JComboBox<String> cbbDesc;
    private javax.swing.JComboBox<String> cbbDisc;
    private javax.swing.JLabel lblComp1;
    private javax.swing.JLabel lblDescript;
    private javax.swing.JLabel lblDisc1;
    private javax.swing.JLabel lblNewDesc;
    private javax.swing.JLabel lblOGID;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JTextField txtNewDescript;
    private javax.swing.JTextField txtOGID;
    // End of variables declaration//GEN-END:variables
}