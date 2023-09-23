
package coffeeshop;
import javax.swing.JOptionPane;


public class login extends javax.swing.JFrame {
         private String username;
         private String password;
   
    public login() {
        initComponents();
    }   
    
    public String getUsername() {
        return username;
    }

   
    public void setUsername(String username) {
        this.username = username;
    }

    
    public String getPassword() {
        return password;
    }

   
    public void setPassword(String password) {
        this.password = password;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        txtusername = new javax.swing.JLabel();
        txtpassword = new javax.swing.JLabel();
        cbusername = new javax.swing.JTextField();
        cbpassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtlogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtusername.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtusername.setForeground(new java.awt.Color(255, 102, 0));
        txtusername.setText(" username :");
        getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 96, 90, 20));

        txtpassword.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(255, 102, 0));
        txtpassword.setText("password  :");
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 134, 70, -1));

        cbusername.setForeground(new java.awt.Color(255, 51, 0));
        cbusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbusernameActionPerformed(evt);
            }
        });
        getContentPane().add(cbusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 97, 108, -1));

        cbpassword.setForeground(new java.awt.Color(204, 51, 0));
        cbpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(cbpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 131, 108, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("LOGIN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 29, 104, -1));

        txtlogin.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtlogin.setForeground(new java.awt.Color(255, 102, 0));
        txtlogin.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Downloads\\login.png")); // NOI18N
        txtlogin.setText("LOGIN");
        txtlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtloginActionPerformed(evt);
            }
        });
        getContentPane().add(txtlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 165, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 32, 23));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Downloads\\roasted-coffee-beans-1570x1047.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtloginActionPerformed
        String inputUsername = cbusername.getText();
                String inputPassword = new String(cbpassword.getPassword());

                if (inputUsername.equals(getUsername()) && inputPassword.equals(getPassword())) {
                    menucoffeeshop coffeeShop = new menucoffeeshop();
                    coffeeShop.setVisible(true);
                    dispose(); 
                } else {
                    JOptionPane.showMessageDialog(null, "Username atau Password salah", "Error", JOptionPane.ERROR_MESSAGE);
                }
    
    }//GEN-LAST:event_txtloginActionPerformed

    private void cbusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbusernameActionPerformed

    private void cbpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbpasswordActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                login loginPage = new login();
                loginPage.setUsername("admin");
                loginPage.setPassword("wisdom");
                loginPage.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField cbpassword;
    private javax.swing.JTextField cbusername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton txtlogin;
    private javax.swing.JLabel txtpassword;
    private javax.swing.JLabel txtusername;
    // End of variables declaration//GEN-END:variables
}
