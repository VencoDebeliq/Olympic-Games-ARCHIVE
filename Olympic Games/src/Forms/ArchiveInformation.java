/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;
import Code.Queries;
import Code.Operations;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class ArchiveInformation extends javax.swing.JFrame {

    private int query;

    public void setQuery(int query) {
        this.query = query;
    }

    public int getQuery() {
        return query;
    }
    /**
     * Creates new form SelectQueries
     */
    public ArchiveInformation(ArrayList <String> items, int query) {
        // items is the list that has the combobox information
        // query represents a number from 1 to 6 for each query called upon
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Select");
        setResizable(false);
        cbbChoose.removeAllItems();
        for (int i = 0; i < items.size(); ++i)
        {
            cbbChoose.addItem(items.get(i));
        }
        setQuery(query);
        if (query == 1 || query == 2 || query == 5)
            lblSure.setText("Choose discipline");
        else if (query == 3 || query == 4)
            lblSure.setText("Choose year of games");
        else
            lblSure.setText("Choose nationality");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblSure = new javax.swing.JLabel();
        cbbChoose = new javax.swing.JComboBox<>();
        btnBack5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(254, 255, 228));

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(163, 163, 0)));

        lblSure.setBackground(new java.awt.Color(254, 255, 228));
        lblSure.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSure.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSure.setText("Choose");

        cbbChoose.setBackground(new java.awt.Color(254, 255, 228));
        cbbChoose.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbbChoose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbChooseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblSure, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbbChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSure)
                    .addComponent(cbbChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        btnBack5.setBackground(new java.awt.Color(251, 255, 159));
        btnBack5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack5.setText("<-");
        btnBack5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack5ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnBack5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btnBack5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack5ActionPerformed
        Operations.btn(new SelectQueries(), this);
    }//GEN-LAST:event_btnBack5ActionPerformed

    private void cbbChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbChooseActionPerformed
        jTextArea1.setText("");
        if (getQuery() == 1)
        {
            String q = "SELECT Competitor.ID, Competitor.First_Name, Competitor.Last_Name, Discipline.Discipline_Name, Record.Description, Olympic_Games.Year_of_conduction, Record.Score\n" +
                        "FROM Olympic_Games INNER JOIN (Discipline INNER JOIN (Competitor INNER JOIN Record ON Competitor.ID = Record.Competitor_ID) ON Discipline.ID = Record.Discipline) ON Olympic_Games.ID = Record.Olympic_Games_ID\n" +
                        "WHERE (((Discipline.Discipline_Name) Like \"" + cbbChoose.getSelectedItem() + "\"));";
            try
            {
                ResultSet rs = new Queries(q).execute();
                while (rs.next())
                {
                    jTextArea1.append(rs.getString("First_Name") + " " + rs.getString("Last_Name") + ", " + rs.getString("Description") + ", Score: " + rs.getString("Score") + '\n');
                }
            }
            catch (Exception ex)
            {
                System.err.println(ex.getMessage());
            }
        }
        else if (getQuery() == 2)
        {
            String q = "SELECT Competitor.ID, Competitor.First_Name, Competitor.Last_Name, Discipline.Discipline_Name\n" +
                        "FROM Discipline INNER JOIN (Competitor INNER JOIN Competitor_has_Discipline ON Competitor.ID = Competitor_has_Discipline.Competitor_ID) ON Discipline.ID = Competitor_has_Discipline.Discipline_ID\n" +
                        "WHERE (((Discipline.Discipline_Name) Like " + "\"" + cbbChoose.getSelectedItem() + "\"));";
            try
            {
                ResultSet rs = new Queries(q).execute();
                while (rs.next())
                {
                    jTextArea1.append(rs.getString("First_Name") + " " + rs.getString("Last_Name") + '\n');
                }
            }
            catch (Exception ex)
            {
                System.err.println(ex.getMessage());
            }
        }
        else if (getQuery() == 3)
        {
            String q = "SELECT Competitor.ID, Competitor.First_Name, Competitor.Last_Name, Discipline.Discipline_Name, Record.Description, Olympic_Games.Year_of_conduction, Record.Score\n" +
                        "FROM Olympic_Games INNER JOIN (Discipline INNER JOIN (Competitor INNER JOIN Record ON Competitor.ID = Record.Competitor_ID) ON Discipline.ID = Record.Discipline) ON Olympic_Games.ID = Record.Olympic_Games_ID\n" +
                        "WHERE (((Olympic_Games.Year_of_conduction)=" + cbbChoose.getSelectedItem() + "));";
            try
            {
                ResultSet rs = new Queries(q).execute();
                while (rs.next())
                {
                    jTextArea1.append(rs.getString("First_Name") + " " + rs.getString("Last_Name") + ", " + rs.getString("Description") + ", Score: " + rs.getString("Score") + '\n');
                }
            }
            catch (NullPointerException e)
            {
                System.err.println(e.getMessage());
            }
            catch (Exception ex)
            {
                System.out.println("3");
                JOptionPane.showMessageDialog(this, "Something went wrong", "Error", JOptionPane.ERROR_MESSAGE);
                System.err.println(ex.getMessage());
            }
        }
        else if (getQuery() == 4)
        {
            String q = "SELECT Competitor.ID, Competitor.First_Name, Competitor.Last_Name, Discipline.Discipline_Name, Medal_Winners.Description, Medal_Type.Type_Name, Olympic_Games.Year_of_conduction\n" +
                        "FROM Medal_Type INNER JOIN (Discipline INNER JOIN (Olympic_Games INNER JOIN (Competitor INNER JOIN Medal_Winners ON Competitor.ID = Medal_Winners.Competitor_ID) ON Olympic_Games.ID = Medal_Winners.Olympic_Games_ID) ON Discipline.ID = Medal_Winners.Discipline_ID) ON Medal_Type.ID = Medal_Winners.Medal_Type_ID\n" +
                        "WHERE (((Olympic_Games.Year_of_conduction)=" + cbbChoose.getSelectedItem() + "));";
            try
            {
                ResultSet rs = new Queries(q).execute();
                while (rs.next())
                {
                    jTextArea1.append(rs.getString("First_Name") + " " + rs.getString("Last_Name") + '\n');
                }
            }
            catch (NullPointerException e)
            {
                System.err.println(e.getMessage());
            }
            catch (Exception ex)
            {
                System.err.println(ex.getMessage());
            }
        }
        else if (getQuery() == 5)
        {
            String q = "SELECT Competitor.ID, Competitor.First_Name, Competitor.Last_Name, Discipline.Discipline_Name\n" +
                        "FROM Discipline INNER JOIN (Competitor INNER JOIN Competitor_has_Discipline ON Competitor.ID = Competitor_has_Discipline.Competitor_ID) ON Discipline.ID = Competitor_has_Discipline.Discipline_ID\n" +
                        "WHERE (((Discipline.Discipline_Name) Like \"" + cbbChoose.getSelectedItem() +"\"));";
            try
            {
                ResultSet rs = new Queries(q).execute();
                while (rs.next())
                {
                    jTextArea1.append(rs.getString("First_Name") + " " + rs.getString("Last_Name") + '\n');
                }
            }
            catch (Exception ex)
            {
                System.err.println(ex.getMessage());
            }
        }
        else if (getQuery() == 6)
        {
            String q = "SELECT Competitor.ID, Competitor.First_Name, Competitor.Last_Name, Nationality.Nationality_Name AS Израз1, Discipline.Discipline_Name\n" +
                        "FROM Nationality INNER JOIN (Discipline INNER JOIN (Competitor INNER JOIN Competitor_has_Discipline ON Competitor.ID = Competitor_has_Discipline.Competitor_ID) ON Discipline.ID = Competitor_has_Discipline.Discipline_ID) ON Nationality.ID = Competitor.Nationality\n" +
                        "WHERE ((([Nationality].[Nationality_Name]) Like \"" + cbbChoose.getSelectedItem() + "\" ));";
            
            try
            {
                ResultSet rs = new Queries(q).execute();
                while (rs.next())
                {
                    jTextArea1.append(rs.getString("First_Name") + " " + rs.getString("Last_Name") + '\n');
                }
            }
            catch (Exception ex)
            {
                System.out.println("here");
                System.err.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_cbbChooseActionPerformed
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack5;
    private javax.swing.JComboBox<String> cbbChoose;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblSure;
    // End of variables declaration//GEN-END:variables
}
