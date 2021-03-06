/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.de.clinique;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class GestionChambres extends javax.swing.JFrame {

    /**
     * Creates new form GestionChambres
     */
    DefaultTableModel model = new DefaultTableModel();
    public GestionChambres() {
        initComponents();
        model.addColumn("N° Chambre");
        model.addColumn("N° Patient");
        model.addColumn("Type");
        model.addColumn("N° Lit");
        model.addColumn("Date d'hospitalisation");
        model.addColumn("Date de sortie");
        
        afficher();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        private void deplace(int i){
        try{
            jtfId.setText(model.getValueAt(i, 0).toString());
            jtfIdP.setText(model.getValueAt(i, 1).toString());
            jtfType.setText(model.getValueAt(i, 2).toString());
            jtfLit.setText(model.getValueAt(i, 3).toString());
            jxdpHospitalisation.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(i, 4).toString()));
            jxdpSortie.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(i, 5).toString()));
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
    private void afficher(){
    try {
        model.setRowCount(0);
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/pi?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root", "");
            Statement stmt = (Statement) conn.createStatement();
            String query="SELECT * FROM chambres;";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                String id = rs.getString("idC");
                String idP = rs.getString("idP");
                String type=rs.getString("type");
                String nLit=rs.getString("NLit");
                String dateHospitalisation=rs.getString("DateHospitalisation");
                String dateSortie=rs.getString("dateSortie");
                

                model.addRow (new Object[] {id,idP, type,nLit,dateHospitalisation, dateSortie});
            }
            jtabChambre.setModel(model);

    }
    catch (SQLException e)
        {
            
        }

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnSupprimer = new javax.swing.JButton();
        toolBar = new javax.swing.JToolBar();
        tbtnMedecins = new javax.swing.JButton();
        tbtnChambres = new javax.swing.JButton();
        jbtnActualiser = new javax.swing.JButton();
        jbtnModifier = new javax.swing.JButton();
        jbtnRechercher = new javax.swing.JButton();
        jbtnAjouter = new javax.swing.JButton();
        jtfId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabChambre = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfLit = new javax.swing.JTextField();
        jtfType = new javax.swing.JTextField();
        jtfIdP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jxdpHospitalisation = new org.jdesktop.swingx.JXDatePicker();
        jxdpSortie = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnSupprimer.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbtnSupprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion/de/clinique/icon/supprimer.png"))); // NOI18N
        jbtnSupprimer.setText("Supprimer");
        jbtnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSupprimerActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSupprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 259, 130, 40));

        toolBar.setRollover(true);
        toolBar.setName("Rendez-vous"); // NOI18N

        tbtnMedecins.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbtnMedecins.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion/de/clinique/icon/Medecin.png"))); // NOI18N
        tbtnMedecins.setText("Gestion du Personnel");
        tbtnMedecins.setFocusable(false);
        tbtnMedecins.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtnMedecins.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbtnMedecins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnMedecinsActionPerformed(evt);
            }
        });
        toolBar.add(tbtnMedecins);

        tbtnChambres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbtnChambres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion/de/clinique/icon/chambre.jpg"))); // NOI18N
        tbtnChambres.setText("Gestion des Chambres");
        tbtnChambres.setFocusable(false);
        tbtnChambres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtnChambres.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbtnChambres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnChambresActionPerformed(evt);
            }
        });
        toolBar.add(tbtnChambres);

        getContentPane().add(toolBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 60));

        jbtnActualiser.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbtnActualiser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion/de/clinique/icon/actualiser.png"))); // NOI18N
        jbtnActualiser.setText("Actualiser");
        jbtnActualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActualiserActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnActualiser, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 315, 130, 40));

        jbtnModifier.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbtnModifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion/de/clinique/icon/modier.jpg"))); // NOI18N
        jbtnModifier.setText("Modifier ");
        jbtnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModifierActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnModifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 130, 40));

        jbtnRechercher.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbtnRechercher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion/de/clinique/icon/rechercher.png"))); // NOI18N
        jbtnRechercher.setText("Rechercher");
        jbtnRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRechercherActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnRechercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, 40));

        jbtnAjouter.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbtnAjouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion/de/clinique/icon/ajouter-icône.jpg"))); // NOI18N
        jbtnAjouter.setText("Ajouter");
        jbtnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAjouterActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnAjouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 130, -1));
        getContentPane().add(jtfId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 125, 40));

        jtabChambre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Chambre", "N° Patient", "Type", "N° Lit", "Date d'hospitalisation", "Date de Sortie"
            }
        ));
        jtabChambre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtabChambreMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtabChambre);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 690, 210));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Gestion des Chambres");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 460, 40));

        jLabel6.setText("Date de sortie");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));
        getContentPane().add(jtfLit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 82, -1));
        getContentPane().add(jtfType, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 80, -1));

        jtfIdP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdPActionPerformed(evt);
            }
        });
        getContentPane().add(jtfIdP, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 80, -1));

        jLabel9.setText("N° Chambre");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, 30));

        jLabel7.setText("N° Lit");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jLabel5.setText("Date d'hospitalisation");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        jLabel3.setText("Type");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jLabel2.setText("Numero Patient");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));
        getContentPane().add(jxdpHospitalisation, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));
        getContentPane().add(jxdpSortie, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfIdPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdPActionPerformed

    private void tbtnMedecinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnMedecinsActionPerformed
        new GestionPersonnels().setVisible(true);
    }//GEN-LAST:event_tbtnMedecinsActionPerformed

    private void tbtnChambresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnChambresActionPerformed
        new GestionChambres().setVisible(true);
    }//GEN-LAST:event_tbtnChambresActionPerformed

    private void jbtnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAjouterActionPerformed
        String id=jtfId.getText();
        String idP=jtfIdP.getText();
        String Type=jtfType.getText();
        String nLit=jtfLit.getText();
        String dateHospitalisation= new SimpleDateFormat("yyyyy-mm-dd").format(jxdpHospitalisation.getDate());
        String dateSortie= new SimpleDateFormat("yyyyy-mm-dd").format(jxdpSortie.getDate());
        
            
    
        if(id.isEmpty()||idP.isEmpty()||nLit.isEmpty()||dateHospitalisation.isEmpty()||dateSortie.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Veuillez remplir tous les champs");
            
        }
        else
        {
            try
            {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/pi?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root", "");
                Statement stmt=(Statement)conn.createStatement();   
                String query="Insert Into chambres values ('"+id+"','"+idP+"','"+Type+"','"+nLit+"','"+dateHospitalisation+"','"+dateSortie+"');";
                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(this,"Nouvelle chambre enregistrée");                            

            }
            catch( SQLException e)
            {
                JOptionPane.showMessageDialog(this,e.getMessage());
            }
        }
        afficher();
    }//GEN-LAST:event_jbtnAjouterActionPerformed

    private void jtabChambreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtabChambreMouseClicked
         try{
            int i=jtabChambre.getSelectedRow();
            deplace(i);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "erreur de deplacement");
        }
    }//GEN-LAST:event_jtabChambreMouseClicked

    private void jbtnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModifierActionPerformed
        if(jtfId.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Veuiller selectionner dans le tableau la ligne de la chambre à modifier");
       }
       else{
            try { 
                if (JOptionPane.showConfirmDialog (null,"confirmer la modification","modification",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/pi?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root", "");
                    Statement stmt = (Statement) conn.createStatement();
                    String query="UPDATE chambres SET idP='"+jtfIdP.getText()+"', Type='"+jtfType.getText()+"', NLit='"+jtfLit.getText()+"',DateHospitalisation='"+new SimpleDateFormat("yyyyy-mm-dd").format(jxdpHospitalisation.getDate())+"', dateSortie='"+new SimpleDateFormat("yyyyy-mm-dd").format(jxdpSortie.getDate())+"' WHERE idC= "+jtfId.getText()+";";
                    stmt.executeUpdate(query);
                    afficher();          
                } 
            } 
            catch (HeadlessException | SQLException e){
                JOptionPane.showMessageDialog(null,"erreur de modification!"+e.getMessage());
            }
        }
    }//GEN-LAST:event_jbtnModifierActionPerformed

    private void jbtnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSupprimerActionPerformed
        String supprimer;
        String Id="";
        supprimer=jtfId.getText();
        if(supprimer.isEmpty()){
            JOptionPane.showMessageDialog(this, "Veuillez saisir l id de la chambre à supprimer");
           jtfId.setText("saisisser l id ici");
        }
        else{
            try
            {
        	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/pi?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root", "");
        	Statement stmt=(Statement) conn.createStatement();
        	String query="select idC from chambres where idC='"+supprimer+"';";
                ResultSet rs=stmt.executeQuery(query);            
                while(rs.next())
                {
                    Id=rs.getString("idC");
                }
                
                if(supprimer.equals(Id))
                {
                    try
                    {
                    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/pi?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root", "");
                    	Statement stmt1=(Statement)con.createStatement();   
			String query1="delete from chambres where idC='"+supprimer+"';";
		        stmt1.executeUpdate(query1);
                        JOptionPane.showMessageDialog(this,"Chambre supprimée");	                                
		    }
                    catch(SQLException e)
                    {
                        JOptionPane.showMessageDialog(this,e.getMessage());
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Aucune chambre n'a cet Id pas dans la base");
                }
            }
            catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
        afficher();
    }//GEN-LAST:event_jbtnSupprimerActionPerformed

    private void jbtnActualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualiserActionPerformed
        afficher();
    }//GEN-LAST:event_jbtnActualiserActionPerformed

    private void jbtnRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRechercherActionPerformed
        try{
           model.setRowCount(0);
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/pi?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root", "");
            Statement stmt = (Statement) conn.createStatement();
            String query="SELECT * FROM chambres WHERE idC='"+jtfId.getText()+"';";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                String id = rs.getString("idC");
                String idP=rs.getString("idP");
                String nLit = rs.getString("NLit");
                String type = rs.getString("Type");
                String dateHospitalisation=rs.getString("DateHospitalisation");
                String dateSortie=rs.getString("dateSortie");
                
                model.addRow (new Object[] {id,idP,type,nLit,dateHospitalisation,dateSortie});
            }
            jtabChambre.setModel(model);
            if(model.getRowCount()==0)
                JOptionPane.showMessageDialog(null, "Il n'y a aucune chambre enregistré à ce numero");
            else{
                int i=0;
                deplace(i);
            }
           
       }
       catch(HeadlessException | SQLException e){
           JOptionPane.showMessageDialog(null,e.getMessage());
       }
    }//GEN-LAST:event_jbtnRechercherActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionChambres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionChambres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionChambres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionChambres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionChambres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnActualiser;
    private javax.swing.JButton jbtnAjouter;
    private javax.swing.JButton jbtnModifier;
    private javax.swing.JButton jbtnRechercher;
    private javax.swing.JButton jbtnSupprimer;
    private javax.swing.JTable jtabChambre;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfIdP;
    private javax.swing.JTextField jtfLit;
    private javax.swing.JTextField jtfType;
    private org.jdesktop.swingx.JXDatePicker jxdpHospitalisation;
    private org.jdesktop.swingx.JXDatePicker jxdpSortie;
    private javax.swing.JButton tbtnChambres;
    private javax.swing.JButton tbtnMedecins;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}
