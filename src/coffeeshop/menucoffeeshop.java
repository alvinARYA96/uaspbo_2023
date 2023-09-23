
package coffeeshop;
import java.util.ArrayList;

  class Minuman {
    protected String nama;
    protected int harga;
    protected int jumlah;

    public Minuman(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public int hitungTotal() {
        return harga * jumlah;
    }

    @Override
    public String toString() {
        return nama + " Rp." + harga + " x " + jumlah + " = " + hitungTotal();
    }
}

class sweettea extends Minuman {
    public sweettea(int jumlah) {
        super("lemontea", 10000);
        this.jumlah = jumlah;
    }
}

class lemontea extends Minuman {
    public lemontea(int jumlah) {
        super("lemontea", 25000);
        this.jumlah = jumlah;
    }
}

class espresso extends Minuman {
    public espresso(int jumlah) {
        super("espresso", 35000);
        this.jumlah = jumlah;
    }
}

class coffeelatte extends Minuman {
    public coffeelatte(int jumlah) {
        super("coffeelatte", 30000);
        this.jumlah = jumlah;
    }
}

class cappucino extends Minuman {
    public cappucino(int jumlah) {
        super("cappucino", 30000);
        this.jumlah = jumlah;
    }
}

class matchalatte extends Minuman {
    public matchalatte(int jumlah) {
        super("matchalatte", 35000);
        this.jumlah = jumlah;
    }
}

class redvelvet extends Minuman {
    public redvelvet(int jumlah) {
        super("redvelvet", 30000);
        this.jumlah = jumlah;
    }
}

class americano extends Minuman {
    public americano(int jumlah) {
        super("americano", 25000);
        this.jumlah = jumlah;
    }
}

class machiato extends Minuman {
    public machiato(int jumlah) {
        super("machiato", 20000);
        this.jumlah = jumlah;
    }
}

class Pesanan {
    private ArrayList<Minuman> daftarPesanan = new ArrayList<>();

    public void tambahPesanan(Minuman minuman) {
        daftarPesanan.add(minuman);
    }

    public int hitungTotalBayar() {
        int totalBayar = 0;
        for (Minuman minuman : daftarPesanan) {
            totalBayar += minuman.hitungTotal();
        }
        return totalBayar;
    }

    public String tampilkanStruk() {
        StringBuilder struk = new StringBuilder();
        for (Minuman minuman : daftarPesanan) {
            struk.append(minuman.toString()).append("\n");
        }
        struk.append("====================\n");
        struk.append("Total bayar = ").append(hitungTotalBayar());
        return struk.toString();
    }
}

public class menucoffeeshop extends javax.swing.JFrame {
        private Pesanan pesanan = new Pesanan();
         private boolean loggedIn = false;
   
    public menucoffeeshop() {
        initComponents();
         loggedIn = true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbxsweettea = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        txtjumlah1 = new javax.swing.JTextField();
        cbxlemontea = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        txtjumlah2 = new javax.swing.JTextField();
        cbxespresso = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        txtjumlah3 = new javax.swing.JTextField();
        cbxcoffeelatte = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        txtjumlah4 = new javax.swing.JTextField();
        cbxcappucino = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        txtjumlah5 = new javax.swing.JTextField();
        cbxmatchalatte = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        txtjumlah6 = new javax.swing.JTextField();
        cbxredvelvet = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        txtjumlah7 = new javax.swing.JTextField();
        cbxmachiato = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        txtjumlah9 = new javax.swing.JTextField();
        cbxamericano = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        txtjumlah8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txapesan = new javax.swing.JTextArea();
        btnpesan = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txtlogout = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        jLabel17.setText("jLabel17");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 102, 0));
        addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                formHierarchyChanged(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 102));
        jLabel1.setText("menu coffee  shop :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 61, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 102));
        jLabel2.setText("harga :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 61, 43, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 102));
        jLabel3.setText("jumlah :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 61, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 102));
        jLabel4.setText("menu coffee  shop :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 61, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 102));
        jLabel5.setText("harga :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 61, 43, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 102));
        jLabel6.setText("jumlah :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 61, -1, -1));

        cbxsweettea.setBackground(new java.awt.Color(102, 0, 0));
        cbxsweettea.setForeground(new java.awt.Color(255, 204, 102));
        cbxsweettea.setText("sweet tea");
        cbxsweettea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxsweetteaActionPerformed(evt);
            }
        });
        getContentPane().add(cbxsweettea, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 90, 90, -1));

        jLabel7.setForeground(new java.awt.Color(255, 204, 102));
        jLabel7.setText("Rp.10.000");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 92, -1, -1));

        txtjumlah1.setForeground(new java.awt.Color(255, 204, 102));
        getContentPane().add(txtjumlah1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 89, 70, -1));

        cbxlemontea.setBackground(new java.awt.Color(102, 0, 0));
        cbxlemontea.setForeground(new java.awt.Color(255, 204, 102));
        cbxlemontea.setText("lemon tea");
        cbxlemontea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxlemonteaActionPerformed(evt);
            }
        });
        getContentPane().add(cbxlemontea, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 118, 90, -1));

        jLabel8.setForeground(new java.awt.Color(255, 204, 102));
        jLabel8.setText("Rp.15.000");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 117, -1, -1));

        txtjumlah2.setForeground(new java.awt.Color(255, 204, 102));
        txtjumlah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlah2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtjumlah2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 117, 70, -1));

        cbxespresso.setBackground(new java.awt.Color(102, 0, 0));
        cbxespresso.setForeground(new java.awt.Color(255, 204, 102));
        cbxespresso.setText("espresso");
        cbxespresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxespressoActionPerformed(evt);
            }
        });
        getContentPane().add(cbxespresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 146, 90, -1));

        jLabel9.setForeground(new java.awt.Color(255, 204, 102));
        jLabel9.setText("Rp.25.000");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 148, -1, -1));

        txtjumlah3.setForeground(new java.awt.Color(255, 204, 102));
        txtjumlah3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlah3ActionPerformed(evt);
            }
        });
        getContentPane().add(txtjumlah3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 145, 70, -1));

        cbxcoffeelatte.setBackground(new java.awt.Color(102, 0, 0));
        cbxcoffeelatte.setForeground(new java.awt.Color(255, 204, 102));
        cbxcoffeelatte.setText("coffee latte");
        cbxcoffeelatte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxcoffeelatteActionPerformed(evt);
            }
        });
        getContentPane().add(cbxcoffeelatte, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 174, 90, -1));

        jLabel10.setForeground(new java.awt.Color(255, 204, 102));
        jLabel10.setText("Rp.35.000");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 176, -1, -1));

        txtjumlah4.setForeground(new java.awt.Color(255, 204, 102));
        txtjumlah4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlah4ActionPerformed(evt);
            }
        });
        getContentPane().add(txtjumlah4, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 173, 70, -1));

        cbxcappucino.setBackground(new java.awt.Color(102, 0, 0));
        cbxcappucino.setForeground(new java.awt.Color(255, 204, 102));
        cbxcappucino.setText("cappucino");
        cbxcappucino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxcappucinoActionPerformed(evt);
            }
        });
        getContentPane().add(cbxcappucino, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 202, 90, -1));

        jLabel11.setForeground(new java.awt.Color(255, 204, 102));
        jLabel11.setText("Rp.30.000");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 204, -1, -1));

        txtjumlah5.setForeground(new java.awt.Color(255, 204, 102));
        txtjumlah5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlah5ActionPerformed(evt);
            }
        });
        getContentPane().add(txtjumlah5, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 201, 70, -1));

        cbxmatchalatte.setBackground(new java.awt.Color(102, 0, 0));
        cbxmatchalatte.setForeground(new java.awt.Color(255, 204, 102));
        cbxmatchalatte.setText("matcha latte");
        cbxmatchalatte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxmatchalatteActionPerformed(evt);
            }
        });
        getContentPane().add(cbxmatchalatte, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 204, 102));
        jLabel12.setText("Rp.30.000");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 92, -1, -1));

        txtjumlah6.setForeground(new java.awt.Color(255, 204, 102));
        txtjumlah6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlah6ActionPerformed(evt);
            }
        });
        getContentPane().add(txtjumlah6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 70, -1));

        cbxredvelvet.setBackground(new java.awt.Color(102, 0, 0));
        cbxredvelvet.setForeground(new java.awt.Color(255, 204, 102));
        cbxredvelvet.setText("red velvet");
        cbxredvelvet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxredvelvetActionPerformed(evt);
            }
        });
        getContentPane().add(cbxredvelvet, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 90, 20));

        jLabel13.setForeground(new java.awt.Color(255, 204, 102));
        jLabel13.setText("Rp.30.000");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 120, -1, -1));

        txtjumlah7.setForeground(new java.awt.Color(255, 204, 102));
        txtjumlah7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlah7ActionPerformed(evt);
            }
        });
        getContentPane().add(txtjumlah7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 117, 70, -1));

        cbxmachiato.setBackground(new java.awt.Color(102, 0, 0));
        cbxmachiato.setForeground(new java.awt.Color(255, 204, 102));
        cbxmachiato.setText("machiato");
        cbxmachiato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxmachiatoActionPerformed(evt);
            }
        });
        getContentPane().add(cbxmachiato, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 90, -1));

        jLabel14.setForeground(new java.awt.Color(255, 204, 102));
        jLabel14.setText("Rp.20.000");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 60, 20));

        txtjumlah9.setForeground(new java.awt.Color(255, 204, 102));
        getContentPane().add(txtjumlah9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 70, -1));

        cbxamericano.setBackground(new java.awt.Color(102, 0, 0));
        cbxamericano.setForeground(new java.awt.Color(255, 204, 102));
        cbxamericano.setText("americano");
        cbxamericano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxamericanoActionPerformed(evt);
            }
        });
        getContentPane().add(cbxamericano, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 90, 20));

        jLabel15.setForeground(new java.awt.Color(255, 204, 102));
        jLabel15.setText("Rp.25.000");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 148, -1, -1));

        txtjumlah8.setForeground(new java.awt.Color(255, 204, 102));
        getContentPane().add(txtjumlah8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 145, 70, -1));

        jLabel16.setForeground(new java.awt.Color(255, 153, 51));
        jLabel16.setText("menu yang di pesan :");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 241, -1, -1));

        txapesan.setBackground(new java.awt.Color(153, 83, 13));
        txapesan.setColumns(20);
        txapesan.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        txapesan.setForeground(new java.awt.Color(255, 255, 255));
        txapesan.setRows(5);
        jScrollPane1.setViewportView(txapesan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 241, 399, 158));

        btnpesan.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        btnpesan.setForeground(new java.awt.Color(255, 102, 0));
        btnpesan.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Downloads\\add to cart.png")); // NOI18N
        btnpesan.setText("pesan");
        btnpesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesanActionPerformed(evt);
            }
        });
        getContentPane().add(btnpesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 110, 30));

        btnreset.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        btnreset.setForeground(new java.awt.Color(255, 102, 0));
        btnreset.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Downloads\\clear.png")); // NOI18N
        btnreset.setText("reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 110, 30));

        jLabel18.setFont(new java.awt.Font("Onyx", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 102, 0));
        jLabel18.setText("WISDOM COFFEE");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 160, 40));

        txtlogout.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        txtlogout.setForeground(new java.awt.Color(255, 102, 0));
        txtlogout.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Downloads\\change Password.png")); // NOI18N
        txtlogout.setText("logout");
        txtlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(txtlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 110, 30));

        jLabel19.setForeground(new java.awt.Color(255, 204, 102));
        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Downloads\\kopi-kintamani.jpg")); // NOI18N
        jLabel19.setText("jLabel19");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void cbxsweetteaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxsweetteaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxsweetteaActionPerformed

    private void cbxlemonteaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxlemonteaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxlemonteaActionPerformed

    private void txtjumlah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah2ActionPerformed

    private void cbxespressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxespressoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxespressoActionPerformed

    private void txtjumlah3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah3ActionPerformed

    private void cbxcoffeelatteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxcoffeelatteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxcoffeelatteActionPerformed

    private void txtjumlah4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah4ActionPerformed

    private void cbxcappucinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxcappucinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxcappucinoActionPerformed

    private void txtjumlah5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah5ActionPerformed

    private void cbxmatchalatteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxmatchalatteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxmatchalatteActionPerformed

    private void txtjumlah6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah6ActionPerformed

    private void cbxredvelvetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxredvelvetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxredvelvetActionPerformed

    private void txtjumlah7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah7ActionPerformed

    private void cbxmachiatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxmachiatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxmachiatoActionPerformed

    private void cbxamericanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxamericanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxamericanoActionPerformed

    private void btnpesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesanActionPerformed
        String tampil = "";
        int bayar = 0;

        if (cbxsweettea.isSelected()) {
            int jumlah = Integer.parseInt(txtjumlah1.getText());
            sweettea sweettea = new sweettea(jumlah);
            pesanan.tambahPesanan(sweettea);
        }

        if (cbxlemontea.isSelected()) {
            int jumlah = Integer.parseInt(txtjumlah2.getText());
            lemontea lemontea = new lemontea(jumlah);
            pesanan.tambahPesanan(lemontea);
        }
        if (cbxespresso.isSelected()) {
            int jumlah = Integer.parseInt(txtjumlah3.getText());
            espresso espresso = new espresso(jumlah);
            pesanan.tambahPesanan(espresso);
        }
         
       if (cbxcoffeelatte.isSelected()) {
            int jumlah = Integer.parseInt(txtjumlah4.getText());
            coffeelatte coffeeLatte = new coffeelatte(jumlah); 
            pesanan.tambahPesanan(coffeeLatte);
        }

        if (cbxcappucino.isSelected()) {
            int jumlah = Integer.parseInt(txtjumlah5.getText());
            cappucino cappuccino = new cappucino(jumlah);
            pesanan.tambahPesanan(cappuccino);
        }

        if (cbxmatchalatte.isSelected()) {
            int jumlah = Integer.parseInt(txtjumlah6.getText());
            matchalatte matchaLatte = new matchalatte(jumlah);
            pesanan.tambahPesanan(matchaLatte);
        }
          
          if (cbxredvelvet.isSelected()) {
            int jumlah = Integer.parseInt(txtjumlah7.getText());
            redvelvet redvelvet = new redvelvet(jumlah);
            pesanan.tambahPesanan(redvelvet);
        }
         
          if (cbxamericano.isSelected()) {
            int jumlah = Integer.parseInt(txtjumlah8.getText());
            americano americano= new americano(jumlah);
            pesanan.tambahPesanan(americano);
        }
          
          if (cbxmachiato.isSelected()) {
            int jumlah = Integer.parseInt(txtjumlah9.getText());
            machiato machiato = new machiato(jumlah);
            pesanan.tambahPesanan(machiato);
        }
          txapesan.setText(pesanan.tampilkanStruk());
    }//GEN-LAST:event_btnpesanActionPerformed

    private void formHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formHierarchyChanged

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        txapesan  .setText("");
        txtjumlah1.setText("");
        txtjumlah2.setText("");
        txtjumlah3.setText("");
        txtjumlah4.setText("");
        txtjumlah5.setText("");
        txtjumlah6.setText("");
        txtjumlah7.setText("");
        txtjumlah8.setText("");
        txtjumlah9.setText("");
        cbxsweettea.setSelected(false);
        cbxlemontea.setSelected(false);
        cbxespresso.setSelected(false);
        cbxcoffeelatte.setSelected(false);
        cbxcappucino.setSelected(false);
        cbxmatchalatte.setSelected(false);
        cbxredvelvet.setSelected(false);
        cbxmachiato.setSelected(false);
        cbxamericano.setSelected(false);
    }//GEN-LAST:event_btnresetActionPerformed

    private void txtlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlogoutActionPerformed
       login loginFrame = new login(); 
    loginFrame.setVisible(true);
    dispose(); 
    
    }//GEN-LAST:event_txtlogoutActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menucoffeeshop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnpesan;
    private javax.swing.JButton btnreset;
    private javax.swing.JCheckBox cbxamericano;
    private javax.swing.JCheckBox cbxcappucino;
    private javax.swing.JCheckBox cbxcoffeelatte;
    private javax.swing.JCheckBox cbxespresso;
    private javax.swing.JCheckBox cbxlemontea;
    private javax.swing.JCheckBox cbxmachiato;
    private javax.swing.JCheckBox cbxmatchalatte;
    private javax.swing.JCheckBox cbxredvelvet;
    private javax.swing.JCheckBox cbxsweettea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txapesan;
    private javax.swing.JTextField txtjumlah1;
    private javax.swing.JTextField txtjumlah2;
    private javax.swing.JTextField txtjumlah3;
    private javax.swing.JTextField txtjumlah4;
    private javax.swing.JTextField txtjumlah5;
    private javax.swing.JTextField txtjumlah6;
    private javax.swing.JTextField txtjumlah7;
    private javax.swing.JTextField txtjumlah8;
    private javax.swing.JTextField txtjumlah9;
    private javax.swing.JButton txtlogout;
    // End of variables declaration//GEN-END:variables
}
