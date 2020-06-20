

package Gaji;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS-PC AprianiMagfira
 */
public class FormGaji extends javax.swing.JFrame {

   GajiService service;
   int t,index,total;
   double b;
   
    
    public FormGaji() {
        initComponents();
        service = new GajiServiceImp();
        tampil();
        batal();
        ubah.setEnabled(false);
        
        batal.setEnabled(false);
    }

    public void tambah(){
        t = 0;
        nik.setEnabled(true);
        nama.setEnabled(true);
        jk.setEnabled(true);
        hp.setEnabled(true);
        alamat.setEnabled(true);
        jabatan.setEnabled(true);
        gaji.setEnabled(true);
        lembur.setEnabled(true);
        gaji1.setEnabled(true);
        gajit.setEnabled(true);
        
        nik.setText(" ");
        nama.setText(" ");
        hp.setText(" ");
        alamat.setText(" ");
        gaji.setText(" "); 
        gaji1.setText(" ");
        gajit.setText(" ");

        hitung.setEnabled(true);
        simpan.setEnabled(true);
        hapus.setEnabled(true);
        tambah.setEnabled(false);
        ubah.setEnabled(false);
    }
    
    public void ubah(){
    
        t = 1;
        nik.setEnabled(true);
        nama.setEnabled(true);
        jk.setEnabled(true);
        hp.setEnabled(true);
        alamat.setEnabled(true);
        jabatan.setEnabled(true);
        gaji.setEnabled(true);
        lembur.setEnabled(true);
        gaji1.setEnabled(true);
        gajit.setEnabled(true);
        
        hitung.setEnabled(true);
        simpan.setEnabled(true);
        hapus.setEnabled(false);
        tambah.setEnabled(true);
        ubah.setEnabled(false);
        batal.setEnabled(true);
        
    }
    
    public void  batal(){
        nik.setEnabled(false);
        nama.setEnabled(false);
        jk.setEnabled(false);
        hp.setEnabled(false);
        alamat.setEnabled(false);
        jabatan.setEnabled(false);
        gaji.setEnabled(false);
        lembur.setEnabled(false);
        gaji1.setEnabled(false);
        gajit.setEnabled(false);
        
        hitung.setEnabled(false);
        simpan.setEnabled(false);
        hapus.setEnabled(false);
        tambah.setEnabled(true);
        ubah.setEnabled(false);
        batal.setEnabled(false);
        
        nik.setText(" ");
        nama.setText(" ");
        hp.setText(" ");
        alamat.setText(" ");
        gaji.setText(" ");
        gajit.setText(" ");
        gaji1.setText(" ");
        
    }
    
    public void hitung(){
        int c = Integer.valueOf(gaji.getText());
        int d = Integer.valueOf(gaji1.getText());
        
        b = c + d ;
        gajit.setText(String.valueOf(b));
    }
    
    public void  hapus(){
        int konf = JOptionPane.showConfirmDialog(rootPane, "are you sure want to delete this data?", 
        "delete confirm", JOptionPane.YES_NO_OPTION);
        if (konf == JOptionPane.YES_OPTION){
            index = tbl.getSelectedRow();
            service.delete(index);
            total -- ; 
            batal();
            tampil();
        }
    }
    
    public void tampil(){
        tbl.setModel(service.tampil());
        total = tbl.getRowCount();
        txtotal.setText(String.valueOf(total));
    }
    
    public void simpan(){
        gaji ga = new gaji();
        
        ga.setNik(nik.getText());
        ga.setNama(nama.getText());
        ga.setNohp(hp.getText());
        ga.setAlamat(alamat.getText());
        ga.setJk(jk.getSelectedItem().toString());
        ga.setJabatan(jabatan.getSelectedItem().toString());
        ga.setGaji(Integer.valueOf(gaji.getText()));
        ga.setLembur(lembur.getSelectedItem().toString());
        ga.setGaji1(Integer.valueOf(gaji1.getText()));
        ga.setTot(Double.valueOf(gajit.getText()));
        
        if(t == 0){
            service.insert(ga);
            total ++;
        }else if (t ==1){
            index = tbl.getSelectedRow();
            service.update(index, ga);
        }
        batal();
        tampil();
    }
    
    public void lokasi(){
        int lo = tbl.getSelectedRowCount();
        if (lo > 0){
            ubah.setEnabled(true);
            hapus.setEnabled(true);
            index = tbl.getSelectedRow();
            
            nik.setText(tbl.getValueAt(index, 0).toString());
            
            nama.setText(tbl.getValueAt(index, 1).toString());
            
            jk.setSelectedItem(tbl.getValueAt(index,2).toString());
            
            jabatan.setSelectedItem(tbl.getValueAt(index,3).toString());
            
            hp.setText(tbl.getValueAt(index, 4).toString());
            
            alamat.setText(tbl.getValueAt(index, 5).toString());
            
            gaji.setText(tbl.getValueAt(index, 6).toString());
            
            lembur.setSelectedItem(tbl.getValueAt(index,7).toString());
            
            gaji1.setText(tbl.getValueAt(index, 8).toString());
            
            gajit.setText(tbl.getValueAt(index, 9).toString());    
        }
      
    }
    
    /**
     *
     */
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nik = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        hp = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jabatan = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        gaji = new javax.swing.JTextField();
        lembur = new javax.swing.JComboBox<>();
        gaji1 = new javax.swing.JTextField();
        gajit = new javax.swing.JTextField();
        hitung = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jk = new javax.swing.JComboBox<>();
        tambah = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtotal = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        tbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tblMouseDragged(evt);
            }
        });
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabel12.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("CV. APRIANI MAGFIRA \n\n");

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("JL. Dr. Wahidin Sudirohusodo Benteng Selayar ,0414-22312. 92812");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(153, 153, 255));

        jLabel1.setText("NIK");

        jLabel2.setText("NAMA");

        jLabel3.setText("JENIS KELAMIN");

        jLabel4.setText("ALAMAT");

        jLabel5.setText("NO.HP");

        hp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hpActionPerformed(evt);
            }
        });

        alamat.setColumns(20);
        alamat.setRows(5);
        jScrollPane2.setViewportView(alamat);

        jLabel6.setText("GOLONGAN");

        jLabel7.setText("GAJI");

        jLabel8.setText("LEMBUR");

        jabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH ", "I", "II", "III", "IV", "V" }));
        jabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jabatanActionPerformed(evt);
            }
        });

        jLabel9.setText("GAJI LEMBUR");

        jLabel10.setText("GAJI TOTAL");

        gaji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gajiActionPerformed(evt);
            }
        });

        lembur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH ", "gol 1", "gol 2 ", "gol 3 ", "gol 4 ", "gol 5" }));
        lembur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lemburActionPerformed(evt);
            }
        });

        gaji1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gaji1ActionPerformed(evt);
            }
        });

        hitung.setBackground(new java.awt.Color(204, 255, 255));
        hitung.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        hitung.setText("Count");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });

        simpan.setBackground(new java.awt.Color(204, 255, 255));
        simpan.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        simpan.setText("Save");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        hapus.setBackground(new java.awt.Color(204, 255, 255));
        hapus.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        hapus.setText("Delete");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        jk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH", "Laki- Laki", "Perempuan", " " }));
        jk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(nik, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hp, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nama)
                    .addComponent(jk, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(hitung)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lembur, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(gaji, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                        .addComponent(gajit, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(gaji1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(simpan)
                        .addGap(30, 30, 30)
                        .addComponent(hapus)))
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(gaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(lembur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(gaji1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(29, 29, 29)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(hitung)
                                    .addComponent(simpan)
                                    .addComponent(hapus)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(gajit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        tambah.setBackground(new java.awt.Color(204, 255, 255));
        tambah.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tambah.setText("Add Data");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        ubah.setBackground(new java.awt.Color(204, 255, 255));
        ubah.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        ubah.setText("Change Data");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        batal.setBackground(new java.awt.Color(204, 255, 255));
        batal.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        batal.setText("Cancel");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        jLabel11.setText("DATA");

        txtotal.setText("O");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tambah, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(batal, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ubah, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(27, 27, 27)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(tambah)
                        .addGap(69, 69, 69)
                        .addComponent(ubah)
                        .addGap(58, 58, 58)
                        .addComponent(batal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtotal))
                .addGap(30, 30, 30))
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

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        batal();
    }//GEN-LAST:event_batalActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        ubah();
    }//GEN-LAST:event_ubahActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        tambah();
    }//GEN-LAST:event_tambahActionPerformed

    private void jkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jkActionPerformed
        if (jk.getSelectedItem().equals("PILIH")){

        }else if(jk.getSelectedItem().equals("Laki-Laki")){

        } else if (jk.getSelectedItem().equals("Perempuan")){
        } else {

        }
    }//GEN-LAST:event_jkActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        hapus();
    }//GEN-LAST:event_hapusActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        simpan();
    }//GEN-LAST:event_simpanActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        hitung();
    }//GEN-LAST:event_hitungActionPerformed

    private void lemburActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemburActionPerformed
        if (lembur.getSelectedItem().equals("PILIH")){

        } else if (lembur.getSelectedItem().equals("gol 1")){
            gaji1.setText("5000");
        }else if (lembur.getSelectedItem().equals("gol 2")){
             gaji1.setText("3000");
        } else if (lembur.getSelectedItem().equals("gol 3")){
            gaji1.setText("2000");
        } else if (lembur.getSelectedItem().equals("gol 4")){
            gaji1.setText("1500");
        } else if (lembur.getSelectedItem().equals("gol 5")){
            gaji1.setText("1000");
        } 
        //else {}
    }//GEN-LAST:event_lemburActionPerformed

    private void jabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jabatanActionPerformed
        if (jabatan.getSelectedItem().equals("PILIH")){

        } else if (jabatan.getSelectedItem().equals("I")){
            gaji.setText("500000");
        }else if (jabatan.getSelectedItem().equals("II")){
            gaji.setText("300000");
        } else if (jabatan.getSelectedItem().equals("III")){
            gaji.setText("250000");
        } else if (jabatan.getSelectedItem().equals("IV")){
            gaji.setText("100000");
        } else if (jabatan.getSelectedItem().equals("IV")){
            gaji.setText("50000");
        } 
       // else {}
    }//GEN-LAST:event_jabatanActionPerformed

    private void hpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hpActionPerformed

    private void gaji1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gaji1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gaji1ActionPerformed

    private void gajiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gajiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gajiActionPerformed

    private void tblMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMouseDragged

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        lokasi();
    }//GEN-LAST:event_tblMouseClicked

    
    
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
            java.util.logging.Logger.getLogger(FormGaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormGaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormGaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormGaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormGaji().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamat;
    private javax.swing.JButton batal;
    private javax.swing.JTextField gaji;
    private javax.swing.JTextField gaji1;
    private javax.swing.JTextField gajit;
    private javax.swing.JButton hapus;
    private javax.swing.JButton hitung;
    private javax.swing.JTextField hp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jabatan;
    private javax.swing.JComboBox<String> jk;
    private javax.swing.JComboBox<String> lembur;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nik;
    private javax.swing.JButton simpan;
    private javax.swing.JButton tambah;
    private javax.swing.JTable tbl;
    private javax.swing.JLabel txtotal;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
