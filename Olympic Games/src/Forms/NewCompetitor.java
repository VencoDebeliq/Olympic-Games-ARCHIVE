/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;
import Code.Queries;
import Code.Operations;
import java.sql.*;
import javax.swing.JComboBox;
/**
 *
 * @author v_pai
 */
public class NewCompetitor extends javax.swing.JFrame {

    /**
     * Creates new form newCompetitor
     */
    public NewCompetitor() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Add new competitor");
        setResizable(false);
        cbbNationality.removeAllItems();
        for (String s: Operations.generateNationality())
        {
            cbbNationality.addItem(s);
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
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblSex = new javax.swing.JLabel();
        lblNationality = new javax.swing.JLabel();
        lblDateOfBirth = new javax.swing.JLabel();
        pnlButtons = new javax.swing.JPanel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtDateOfBirth = new javax.swing.JTextField();
        cbbNationality = new javax.swing.JComboBox<>();
        cbbSex = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();

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

        lblFirstName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblFirstName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFirstName.setText("First name");

        lblLastName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblLastName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLastName.setText("Last name");

        lblSex.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSex.setText("Sex");

        lblNationality.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblNationality.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNationality.setText("Nationality");

        lblDateOfBirth.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDateOfBirth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDateOfBirth.setText("Date of birth");

        pnlButtons.setBackground(new java.awt.Color(255, 255, 102));

        txtFirstName.setBackground(new java.awt.Color(254, 255, 228));
        txtFirstName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFirstName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        txtLastName.setBackground(new java.awt.Color(254, 255, 228));
        txtLastName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtLastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtDateOfBirth.setBackground(new java.awt.Color(254, 255, 228));
        txtDateOfBirth.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDateOfBirth.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cbbNationality.setBackground(new java.awt.Color(254, 255, 228));
        cbbNationality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbNationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbNationalityActionPerformed(evt);
            }
        });

        cbbSex.setBackground(new java.awt.Color(254, 255, 228));
        cbbSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        cbbSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlButtonsLayout = new javax.swing.GroupLayout(pnlButtons);
        pnlButtons.setLayout(pnlButtonsLayout);
        pnlButtonsLayout.setHorizontalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDateOfBirth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(cbbNationality, 0, 167, Short.MAX_VALUE)
                    .addComponent(cbbSex, javax.swing.GroupLayout.Alignment.TRAILING, 0, 167, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlButtonsLayout.setVerticalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbbSex, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(cbbNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSave.setBackground(new java.awt.Color(254, 240, 228));
        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl2Layout = new javax.swing.GroupLayout(pnl2);
        pnl2.setLayout(pnl2Layout);
        pnl2Layout.setHorizontalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNationality, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDateOfBirth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(pnlButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnl2Layout.setVerticalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFirstName)
                        .addGap(18, 18, 18)
                        .addComponent(lblLastName)
                        .addGap(26, 26, 26)
                        .addComponent(lblSex)
                        .addGap(28, 28, 28)
                        .addComponent(lblNationality)
                        .addGap(18, 18, 18)
                        .addComponent(lblDateOfBirth)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave))
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
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Operations.btn(new Choice(), this);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try
        {
            String q = "INSERT INTO Competitor(First_Name, Last_Name, Sex, Nationality, Date_of_birth)\n"
                + "VALUES("
                + "\"" + txtFirstName.getText() + "\", " 
                + "\"" + txtLastName.getText() + "\", "
                + getSex(cbbSex) + ", " 
                + getNationality(cbbNationality) + ", "
                + "#" + txtDateOfBirth.getText() + "#);";
            Queries query = new Queries(q);
            System.out.println(query);
            Confirm openPageConfirm = new Confirm(this, btnSave, query);
            openPageConfirm.setVisible(true);
            btnSave.setEnabled(false);
        }
        catch (Exception ex)
        {
            // MAKE A WINDOW TELLING THE USER ITS INCORRECT INPUT
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private int getSex(JComboBox sex)
    {
        System.out.println("HERE");
        if ("Male".equals(sex.getSelectedItem())) return 1;
        else if ("Female".equals(sex.getSelectedItem())) return 2;
        return -1;
    }
    
    private int getNationality(JComboBox nat) throws Exception
    {
        String sql = "SELECT Nationality.ID FROM Nationality\n"
                + "WHERE (((Nationality.Nationality_Name) Like \""
                + nat.getSelectedItem() + "\"));";
        Queries q = new Queries(sql);
        ResultSet rs = q.execute();
        rs.next();
        return rs.getInt(1);
    }
    
    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void cbbNationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbNationalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbNationalityActionPerformed

    private void cbbSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbSexActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbbNationality;
    private javax.swing.JComboBox<String> cbbSex;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblNationality;
    private javax.swing.JLabel lblSex;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    // End of variables declaration//GEN-END:variables
}
