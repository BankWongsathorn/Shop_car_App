
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Windows 10
 */
public class projectshopcar extends javax.swing.JFrame {
    
    /**
     * Creates new form projectshopcar
     */
     String car_name = "";
     int page = 1;
     
     
    public projectshopcar() {
        initComponents();
        jButton1.setEnabled(false);
        jButton4.setEnabled(false);
        jButton3.setEnabled(false);

       //jPanel1.setIcon(new ImageIcon("src\\photocar\\carshop.png"));
          
    }

    private projectshopcar(String car_name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Car Shop");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("◄");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 410, -1, 43));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 460, 433, 413));
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 465, 388));

        jButton3.setText("►");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 410, -1, 43));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows 10\\Documents\\NetBeansProjects\\projectcarr\\src\\photosuv\\subaru xv 2.0i-p eyesight.jpg")); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 28, 250, 210));

        jButton11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows 10\\Documents\\NetBeansProjects\\projectcarr\\src\\photosuv\\Nissan KICKS 1.2L e 2021.jpg")); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 28, 250, 210));

        jButton12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows 10\\Documents\\NetBeansProjects\\projectcarr\\src\\photosuv\\Land Rover.jpg")); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 28, 250, 210));

        jButton13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows 10\\Documents\\NetBeansProjects\\projectcarr\\src\\photosuv\\Lexus NX 350h Luxury 2021.jpg")); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 283, 250, 210));

        jButton14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows 10\\Documents\\NetBeansProjects\\projectcarr\\src\\photosuv\\HAVAL H6 hybrid SUv ULTRA 2021.jpg")); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 283, 250, 210));

        jButton15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows 10\\Documents\\NetBeansProjects\\projectcarr\\src\\photosuv\\peugeot 5008 allure 2021.jpg")); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 283, 250, 210));

        jTabbedPane1.addTab("SUV", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows 10\\Documents\\NetBeansProjects\\projectcarr\\src\\photo\\nissan march e2021.jpg")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows 10\\Documents\\NetBeansProjects\\projectcarr\\src\\photo\\nissan almera el2021.jpg")); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows 10\\Documents\\NetBeansProjects\\projectcarr\\src\\photo\\nissan march s2021.jpg")); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows 10\\Documents\\NetBeansProjects\\projectcarr\\src\\photo\\suzuki swift gl plus 2021.jpg")); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows 10\\Documents\\NetBeansProjects\\projectcarr\\src\\photo\\nissan note e2021.jpg")); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows 10\\Documents\\NetBeansProjects\\projectcarr\\src\\photo\\toyota yaris ativ entry my2021.jpg")); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ECO", jPanel2);

        jPanel4.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton16.setBackground(new java.awt.Color(51, 51, 255));
        jButton16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows 10\\Documents\\NetBeansProjects\\projectcarr\\src\\photocar\\bill.png")); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 720, 381, 126));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 102, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows 10\\Documents\\NetBeansProjects\\projectcarr\\src\\photocar\\buy.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 720, 378, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        String Peugeot = "Peugeot 5008 allure 2021\n\nรถอเนกประสงค์ SUV\n\nเชื้อเพลิง เบนซิน95,แก๊สโซฮอล์95(E10)\n\nขนาดเครื่องยนต์1,598 cc 197แรงม้า\n\nรุ่นเครื่องยนต์ 4 สูบแถวเรียง DOHC 16วาล์ว \nTwin Scroll Turbo High PRessure ผสานระบบ \nAdvance Grip Control\n\nระบบขับเคลื่อน ขับเคลื่อนล้อหน้า เกียร์ออโต้ 6AT";
        jTextArea1.setText(Peugeot);
        jButton1.setEnabled(true);
        car_name = "Peugeot_5008_allure";
        jLabel1.setIcon(new ImageIcon("src\\photocar\\Peugeot_5008_allure\\1.png"));
        jButton4.setEnabled(true);
        jButton3.setEnabled(true);
        page =1;
        if(page==1)jButton4.setEnabled(false);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        String haval = "HAVAL H6 hybrid SUV ULTRA 2021\nรถไฮบริด,รถอเนกประสงค์ SUV\n\nเชื้อเพลิง เบนซิน95,เบนซิน91,แก๊สโซฮอล์95(E10)\n\nขนาดเครื่องยนต์1,499 cc 150แรงม้า(HP)\n\nรุ่นเครื่องยนต์ เครื่องยนต์1.5ลิตร พร้อมเทอร์โบซูปเปอร์\nชาร์จเจอร์(VGT)ทำงานร่วมกับมอเตอร์ไฟฟ้าให้กำลัง\nสูงสุด 243\n\nระบบขับเคลื่อน ขับเคลื่อนล้อหน้า \n\nเกียร์ออโต้ 7AT";
        jTextArea1.setText(haval);
        jButton1.setEnabled(true);
        car_name = "HAVAL_H6_hybrid_SUv_ULTRA";
        jLabel1.setIcon(new ImageIcon("src\\photocar\\HAVAL_H6_hybrid_SUv_ULTRA\\1.png"));
        jButton4.setEnabled(true);
        jButton3.setEnabled(true);
        page =1;
        if(page==1)jButton4.setEnabled(false);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        String Lexus = "Lexus NX 350h Luxury 2021\n\nรถอเนกประสงค์ SUV\n\nเชื้อเพลิง เบนซิน 95,แก๊สโซฮอล์95 ,ไฮบริด\n\nขนาดเครื่องยนต์ 2,487 cc 187 แรงม้า \n\nรุ่นเครื่องยนต์ เครื่องยนต์ A25A-FXS 4 สูบแถวเรียง \nขนาด2.5 ลิตร ระบบปลั๊กไฮบริด กำลังสูงสุด187 แรงม้า\n\nระบบขับเคลื่อน ขับเคลื่อนสี่ล้อFull Time \n\nเกียร์ออโตแบบCVT";
        jTextArea1.setText(Lexus);
        jButton1.setEnabled(true);
        car_name = "Lexus_NX_350h_Luxury";
        jLabel1.setIcon(new ImageIcon("src\\photocar\\Lexus_NX_350h_Luxury\\1.png"));
        jButton4.setEnabled(true);
        jButton3.setEnabled(true);
        page =1;
        if(page==1)jButton4.setEnabled(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        String land = "Land Rover \nรถอเนกประสงค์ SUV (5ประตู)\n\nเชื้อเพลิง เบนซิน95,เบนซิน91,แก๊สโซฮอล์95(E10)\n\nแก๊สโซฮอล์91,เบนซินE20\n\nขนาดเครื่องยนต์ เครื่องยนต์ 4 สูบ เบนซินพร้อมมอเตอร์\nไฟฟ้า 105 กิโลวัตต์ที่ขับเคลื่อนด้วยแบตเตอรี่19.2กิโลวัต\n\nระบบขับเคลื่อน ขับเคลื่อนสี่ล้อ Full Time \n\nเกียร์ออโต้ 8AT";
        jTextArea1.setText(land);
        jButton1.setEnabled(true);
        car_name = "Land_Rover_Defender";
        jLabel1.setIcon(new ImageIcon("src\\photocar\\Land_Rover_Defender\\1.png"));
        jButton4.setEnabled(true);
        jButton3.setEnabled(true);
        page =1;
        if(page==1)jButton4.setEnabled(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        String kicks = "Nissan KICKS 1.2L e 2021\n รถอเนกประสงค์ SUV \n\nเชื้อเพลิง เบนซิน95,เบนซิน91,แก๊สโซฮอล์95(E10)\n\nแก๊สโซฮอล์91\n\nขนาดเครื่องยนต์ 129 แรงม้า\n\nรุ่นเครื่องยนต์ อี-เพาเวอร์ ติดตั้งเครื่องยนต์สันดาปภายใน\nขนาดเล็กๆ รหัสHR12DE ขนาดความจุ1.2ลิตร\n\nระบบขับเคลื่อน ขับเคลื่อนล้อหน้า \n\n1จังหวะ(Single Speed Gear Reduction)";
        jTextArea1.setText(kicks);
        jButton1.setEnabled(true);
        car_name = "Nissan_KICKS_1.2L_e";
        jLabel1.setIcon(new ImageIcon("src\\photocar\\Nissan_KICKS_1.2L_e\\1.png"));
        jButton4.setEnabled(true);
        jButton3.setEnabled(true);
        page =1;
        if(page==1)jButton4.setEnabled(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        String subaru = "Subaru xv 2.0i-p eyesight\nรถอเนกประสงค์ SUV (Crossover)\n\nเชื้อเพลิง เบนซิน95,แก๊สโซฮอล์95 (E10)\n\nขนาดเครื่องยนต์ 1,995 cc 156 แรงม้า\n\nรุ่นเครื่องยนต์ เบนซินลูกสูบนอน 4 สูบ 4 จังหวะ\nDOHC 16 วาล์ว ไดเรคอินเจคชั่น\n\nระบบขับเคลื่อน ขับเคลื่อนสี่ล้อ FullTime \n\nเกียร์ออโต้แบบ CVT";
        jTextArea1.setText(subaru);
        jButton1.setEnabled(true);
        car_name = "Subaru_XV";
        jLabel1.setIcon(new ImageIcon("src\\photocar\\Subaru_XV\\1.png"));
        jButton4.setEnabled(true);
        jButton3.setEnabled(true);
        page =1;
        if(page==1)jButton4.setEnabled(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        String toyota = "Toyota yaris ativ entry my2021\n\nรถเก๋ง4ประตู,Eco car-รถอีโคคาร์ \n\nเชื้อเพลิง เบนซิน95,เบนซิน91,แก๊สโซฮอล์95(E10)\n\nแก๊สโซฮอล์91,เบนซินE20\n\nขนาดเครื่องยนต์ 1,197 cc 92 แรงม้า(PS)\n\nรุ่นเครื่องยนต์3NR-FKE1,200ซีซี DUAL VVT -iE4 \nสูบ DOHC 16วาล์วมาตรฐานไอเสีย EURO5 \nอัตตราการประหยัดน้ำมัน 23.3\n\nระบบขับเคลื่อน ขับเคลื่อนล้อหน้า \n\nเกียร์ออโต้แบบCVT(Super CVT-iพร้อม Shift Lock) ";
        jTextArea1.setText(toyota);
        jButton1.setEnabled(true);
        car_name = "Toyota_yaris_ATIV_Entry_MY2021";
        jLabel1.setIcon(new ImageIcon("src\\photocar\\Toyota_yaris_ATIV_Entry_MY2021\\1.png"));
        jButton4.setEnabled(true);
        jButton3.setEnabled(true);
        page =1;
        if(page==1)jButton4.setEnabled(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        String notee = "Nissan note e2021\nรถเก๋ง 5 ประตู Eco car - รถอีโคคาร์ \n\nเชื้อเพลิง เบนซิน95,เบนซิน91,แก๊สโซฮอล์95(E10)\n\nแก๊สโซฮอล์91,เบนซินE20\n\nขนาดเครื่องยนต์ 1,198 cc. 79แรงม้า(PS)\n\nรุ่นเครื่องยนต์ เครื่องยนต์ HR12DE 3สูบแถวเรียง \nDOHC1,198 ซีซี 79แรงม้าที่6,000รอบต่อนาทีแรงบิด106 \n\nระบบขับเคลื่อน ขับเคลื่อนล้อหน้า \n\nเกียร์ออโต้แบบ CVT";
        jTextArea1.setText(notee);
        jButton1.setEnabled(true);
        car_name = "Nissan_note_e";
        jLabel1.setIcon(new ImageIcon("C:\\Users\\Windows 10\\Documents\\NetBeansProjects\\projectcarr\\src\\photocar\\Nissan_note_e\\1.png"));
        jButton4.setEnabled(true);
        jButton3.setEnabled(true);
        page =1;
        if(page==1)jButton4.setEnabled(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String suzuki = "Suzuki swift gl plus 2021\n\nรถเก๋ง 5ประตู, Eco car -รถอีโคคาร์ \n\nเชื้อเพลิง เบนซิน95,เบนซิน91,แก๊สโซฮอล์95(E10)\n\nแก๊สโซฮอล์91,เบนซินE20\n\nขนาดเครื่องยนต์ 1,197 cc. 83แรงม้า (PS)\n\nรุ่นเครื่องยนต์K12M, DUALJET 4 สูบ DOHC 16วาล์ว\n\nระบบขับเคลื่อน ขับเคลื่อนล้อหน้า \n\nเกียร์ออโต้แบบCVT ";
        jTextArea1.setText(suzuki);
        jButton1.setEnabled(true);
        car_name = "Suzuki_swift_gl_plus";
        jLabel1.setIcon(new ImageIcon("src\\photocar\\Suzuki_swift_gl_plus\\1.png"));
        jButton4.setEnabled(true);
        jButton3.setEnabled(true);
        page =1;
        if(page==1)jButton4.setEnabled(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String marchrs="Nissan march s2021\nรถเก๋ง 5 ประตู Eco car - รถอีโคคาร์ \n\nเชื้อเพลิง เบนซิน95,เบนซิน91,แก๊สโซฮอล์95(E10)\n\nแก๊สโซฮอล์91,เบนซินE20\n\nขนาดเครื่องยนต์ 1,198 cc. 79แรงม้า\n\nรุ่นเครื่องยนต์ HR12DE, 3สูบ DOHC 12วาล์ว CVTC \n\nระบบขับเคลื่อน ขับเคลื่อนล้อหน้า \n\nเกียร์ธรรมดา 5MT";
        jTextArea1.setText(marchrs);
        jButton1.setEnabled(true);
        car_name = "Nissan_march_s";
        jLabel1.setIcon(new ImageIcon("C:\\Users\\Windows 10\\Documents\\NetBeansProjects\\projectcarr\\src\\photocar\\Nissan_march_s\\1.png"));
        jButton4.setEnabled(true);
        jButton3.setEnabled(true);
        page =1;
        if(page==1)jButton4.setEnabled(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String almera = "Nissan almera el2021\n\nรถเก๋ง 4 ประตู,Eco Car-รถอีโคคาร์ \n\nเชื้อเพลิง เบนซิน95,เบนซิน91,แก๊สโซฮอล์95(E10)\n\nแก๊สโซฮอล์91,เบนซินE20\n\nขนาดเครื่องยนต์ 999 cc 100แรงม้า(PS)\n\nรุ่นเครื่องยนต์ ขุมพลังใหม่ เครื่องยนต์1.0ลิตร เทอร์โบ \nรหัส HRAO ของนิสสัน อัลเมร่า ใหม่ ให้กำลังสูงสุด 100\n\nระบบขับเคลื่อน ขับเคลื่อนล้อหน้า \n\n เกียร์ออโต้แบบCVT ";
        jTextArea1.setText(almera);
        jButton1.setEnabled(true);
        car_name = "Nissan_almera_el";
        jLabel1.setIcon(new ImageIcon("src\\photocar\\Nissan_almera_el\\1.png"));
        jButton4.setEnabled(true);
        jButton3.setEnabled(true);
        page =1;
        if(page==1)jButton4.setEnabled(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String march = "Nissan march e2021\nรถเก๋ง 5 ประตู Eco car - รถอีโคคาร์ \n\nเชื้อเพลิง เบนซิน95,เบนซิน91,แก๊สโซฮอล์95(E10)\n\nแก๊สโซฮอล์91,เบนซินE20\n\nขนาดเครื่องยนต์ 1,198 cc. 79แรงม้า\n\nรุ่นเครื่องยนต์ HR12DE, 3สูบ DOHC 12วาล์ว CVTC \n\nระบบขับเคลื่อน ขับเคลื่อนล้อหน้า \n\nเกียร์ธรรมดา 5MT";
        jTextArea1.setText(march);
        jButton1.setEnabled(true);
        car_name = "Nissan_march_e";
        jLabel1.setIcon(new ImageIcon("C:\\Users\\Windows 10\\Documents\\NetBeansProjects\\projectcarr\\build\\classes\\photocar\\Nissan_march_e\\1.png"));
        jButton4.setEnabled(true);
        jButton3.setEnabled(true);
        page =1;
        if(page==1)jButton4.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        page--;
        if(page>1)jButton4.setEnabled(true);
        if(page==1)jButton4.setEnabled(false);
        if(page<5)jButton3.setEnabled(true);
        if(page==5)jButton3.setEnabled(false);
        
        
        jLabel1.setIcon(new ImageIcon("src\\photocar\\"+car_name+"\\"+(page)+".png"));
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        page++;
        if(page<5)jButton3.setEnabled(true);
        if(page==5)jButton3.setEnabled(false);
        if(page>1)jButton4.setEnabled(true);
        if(page==1)jButton4.setEnabled(false);
        
        
        
        jLabel1.setIcon(new ImageIcon("src\\photocar\\"+car_name+"\\"+(page)+".png"));
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        

        new shop(car_name).setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        
        
        new Bill().setVisible(true);

        
        
        
    }//GEN-LAST:event_jButton16ActionPerformed

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
            java.util.logging.Logger.getLogger(projectshopcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(projectshopcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(projectshopcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(projectshopcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new projectshopcar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
