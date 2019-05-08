
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sunny
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        adduser = new javax.swing.JButton();
        deleteuser = new javax.swing.JButton();
        updateuser = new javax.swing.JButton();
        Product = new javax.swing.JButton();
        Transaction = new javax.swing.JButton();
        Customer = new javax.swing.JButton();
        Supplier = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1375, 765));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 70, 1370, 10);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(200, 10, 10, 50);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 80, 1370, 610);

        adduser.setToolTipText("add user");
        adduser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        adduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adduserActionPerformed(evt);
            }
        });
        getContentPane().add(adduser);
        adduser.setBounds(10, 10, 50, 50);

        deleteuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteuserActionPerformed(evt);
            }
        });
        getContentPane().add(deleteuser);
        deleteuser.setBounds(70, 10, 50, 50);

        updateuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateuserActionPerformed(evt);
            }
        });
        getContentPane().add(updateuser);
        updateuser.setBounds(130, 10, 50, 50);

        Product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductActionPerformed(evt);
            }
        });
        getContentPane().add(Product);
        Product.setBounds(210, 10, 50, 50);

        Transaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransactionActionPerformed(evt);
            }
        });
        getContentPane().add(Transaction);
        Transaction.setBounds(290, 10, 50, 50);

        Customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerActionPerformed(evt);
            }
        });
        getContentPane().add(Customer);
        Customer.setBounds(370, 10, 50, 50);

        Supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierActionPerformed(evt);
            }
        });
        getContentPane().add(Supplier);
        Supplier.setBounds(430, 10, 50, 50);

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(490, 10, 50, 50);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(190, 10, 10, 50);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(270, 10, 10, 50);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(350, 10, 10, 50);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(280, 10, 10, 50);

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(360, 10, 10, 50);

        jMenuBar2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenu3.setText("User");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Product");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Transaction");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Customer");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("Supplier");
        jMenuBar2.add(jMenu7);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         BufferedImage img = null, jb1=null,jb2=null,jb3=null,jb4=null,jb5=null,jb6=null,jb7=null,jb8=null;
try {
    img = ImageIO.read(new File("C:\\Project\\Inventory Management.png"));
    jb1 = ImageIO.read(new File("C:\\Project\\user_add.png"));//read image from external source
    jb2 = ImageIO.read(new File("C:\\Project\\user_delete.png"));//read image from external source
    jb3 = ImageIO.read(new File("C:\\Project\\update.png"));//read image from external source
    jb4 = ImageIO.read(new File("C:\\Project\\product.png"));//read image from external source
    jb5 = ImageIO.read(new File("C:\\Project\\transaction.png"));//read image from external source
    jb6 = ImageIO.read(new File("C:\\Project\\customer.png"));//read image from external source
    jb7 = ImageIO.read(new File("C:\\Project\\supplier.png"));//read image from external source
    jb8 = ImageIO.read(new File("C:\\Project\\exit.png"));//read image from external source
} catch (Exception e) {
}
Image dimg = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(),Image.SCALE_SMOOTH);
Image jb1img = jb1.getScaledInstance(adduser.getWidth(), adduser.getHeight(),Image.SCALE_SMOOTH);
Image jb2img = jb2.getScaledInstance(deleteuser.getWidth(), deleteuser.getHeight(),Image.SCALE_SMOOTH);
Image jb3img = jb3.getScaledInstance(updateuser.getWidth(), updateuser.getHeight(),Image.SCALE_SMOOTH);
Image jb4img = jb4.getScaledInstance(Product.getWidth(), Product.getHeight(),Image.SCALE_SMOOTH);
Image jb5img = jb5.getScaledInstance(Transaction.getWidth(), Transaction.getHeight(),Image.SCALE_SMOOTH);
Image jb6img = jb6.getScaledInstance(Customer.getWidth(), Customer.getHeight(),Image.SCALE_SMOOTH);
Image jb7img = jb7.getScaledInstance(Supplier.getWidth(), Supplier.getHeight(),Image.SCALE_SMOOTH);
Image jb8img = jb8.getScaledInstance(jButton8.getWidth(), jButton8.getHeight(),Image.SCALE_SMOOTH);
ImageIcon imageIcon = new ImageIcon(dimg);
ImageIcon b1 = new ImageIcon(jb1img);
ImageIcon b2 = new ImageIcon(jb2img);
ImageIcon b3 = new ImageIcon(jb3img);
ImageIcon b4 = new ImageIcon(jb4img);
ImageIcon b5 = new ImageIcon(jb5img);
ImageIcon b6 = new ImageIcon(jb6img);
ImageIcon b7 = new ImageIcon(jb7img);
ImageIcon b8 = new ImageIcon(jb8img);
jLabel1.setIcon(imageIcon);
adduser.setIcon(b1);
deleteuser.setIcon(b2);
updateuser.setIcon(b3);
Product.setIcon(b4);
Transaction.setIcon(b5);
Customer.setIcon(b6);
Supplier.setIcon(b7);
jButton8.setIcon(b8);

adduser.setContentAreaFilled(false);
deleteuser.setContentAreaFilled(false);
updateuser.setContentAreaFilled(false);
Product.setContentAreaFilled(false);
Transaction.setContentAreaFilled(false);
Customer.setContentAreaFilled(false);
Supplier.setContentAreaFilled(false);
jButton8.setContentAreaFilled(false);

    }//GEN-LAST:event_formWindowOpened

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void ProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductActionPerformed
        new product().setVisible(true);
    }//GEN-LAST:event_ProductActionPerformed

    private void adduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adduserActionPerformed
        new add_user().setVisible(true);
    }//GEN-LAST:event_adduserActionPerformed

    private void deleteuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteuserActionPerformed
        new Delete_User().setVisible(true);
    }//GEN-LAST:event_deleteuserActionPerformed

    private void updateuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateuserActionPerformed
        new Update_user().setVisible(true);
    }//GEN-LAST:event_updateuserActionPerformed

    private void TransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransactionActionPerformed
        new Transaction().setVisible(true);
    }//GEN-LAST:event_TransactionActionPerformed

    private void CustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerActionPerformed
        new Customer().setVisible(true);
    }//GEN-LAST:event_CustomerActionPerformed

    private void SupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierActionPerformed
        new Supplier().setVisible(true);
    }//GEN-LAST:event_SupplierActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Customer;
    private javax.swing.JButton Product;
    private javax.swing.JButton Supplier;
    private javax.swing.JButton Transaction;
    private javax.swing.JButton adduser;
    private javax.swing.JButton deleteuser;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JButton updateuser;
    // End of variables declaration//GEN-END:variables
}
