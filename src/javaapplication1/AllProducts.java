/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author saleh
 */
public class AllProducts extends javax.swing.JFrame {

    /**
     * Creates new form AllProducts
     */
    String[] laptopcat ={"...","Laptop","Gaming Laptop","Tablet","Laptop Ram","Laptop Adapter","Laptop Battery","Laptop Cooler"};
    
    String[] laptopbrand ={"...","Acer","Apple","Asus","Dell","Gigabyte","HP","Huawei","Lenovo","MSI","Razer","Walton"};
    String[] gaminglaptopbrand ={"...","Acer Gaming Laptop","Asus Gaming Laptop","Dell Gaming Laptop","Gigabyte Gaming Laptop","HP Gaming Laptop","Lenovo Gaming Laptop","MSI Gaming Laptop","Walton Gaming Laptop"};
    String[] tabletbrand ={"...","Apple","Huawei","Lenovo","Walton"};
    String[] lrambrand ={"...","Adata","Crucial","G.Skill","HP","Patriot","Team","Transcend","Walton"};
    String[] adapterbrand ={"...","Acer","Apple","Asus","Dell","HP","Lenovo","Samsung"};
    String[] batterybrand ={"...","Acer","Apple","Asus","Dell","HP","Lenovo"};
    String[] coolerbrand={"...","Cooler Master","DeepCool","Thermaltake"};
    
    
    
    String[] pccat ={"...","Casing","Processor","Motherboard","Graphics Card","Desktop Ram","Internal SSD","Internal Hard-Disk","Power Supply","CPU Cooler","Casing Fan","UPS"};
    
    String[] casingbrand ={"...","Aigo","Antec","Asus","CoolerMaster","Corsair","Cougar","DeepCool","Fantech","Gamdias","Gigabyte","Lian Li","MSI","MonTech","NZXT","Phanteks","Thermaltake","Xigmatek"};
    String[] cpubrand ={"...","Intel","AMD Ryzen"};
    String[] mobobrand ={"...","Asrock(Intel)","Asrock(Ryzen)","Asus(Intel)","Asus(Ryzen)","Gigabyte(Intel)","Gigabyte(Ryzen)","MSI(Intel)","MSI(Ryzen)","NZXT(Intel)","NZXT(Ryzen)"};
    String[] gpubrand ={"...","Asrock","Asus","Colorful","EVGA","Gigabyte","Galax","MSI","Sapphire","XFX","ZOTAC"};
    String[] drambrand ={"...","Adata","Antec","Corsair","G.Skill","Gigabyte","Kingston","Patriot","PNY","Team","Thermaltake","Transcend","Walton"};
    String[] ssdbrand ={"...","Adata","Colorful","Corsair","Gigabyte","HP","Intel","PNY","Patriot","Samsung","Seagate","Team","Transcend","Walton","Western Digital"};
    String[] hddbrand ={"...","Seagate","Toshiba","Transcend","Western Digital"};
    String[] psubrand ={"...","Antec","Asus","Cooler Master","Corsair","Gamdias","Gigabyte","MSI","Seasonic","Thermaltake"};
    String[] cpucoolerbrand ={"...","Antec","Asus","Bykski","Cooler Master","Corsair","DeepCool","EKWB","Gamdias","Gigabyte","Lian Li","MSI","NZXT","Noctua","Thermaltake"};
    String[] casingfanbrand ={"...","Antec","Asus","CoolerMaster","Corsair","Cougar","DeepCool","EKWB","Fantech","Gamdias","Lian Li","Montech","NZXT","Noctua","Thermaltake"};
    String[] upsbrand ={"...","Apollo","Power Guard","Prolink","Santak","Technoware","Walton"};
    
    
    
    String[] acccat={"...","Webcam","Keyboard","Mouse","Mousepad","Headphone","Earphone","Microphone","Gamepad","Pendrive","Memory Card","Portable Hard-Disk","Portable SSD","Capture Card","USB HUB","Power Strip","LED Strip","Chair","Table"};
    
    String[] webcambrand ={"..."};
    String[] keyboardbrand ={"..."};
    String[] mousebrand ={"..."};
    String[] mousepadbrand ={"..."};
    String[] headphonebrand ={"..."};
    String[] earphonebrand ={"..."};
    String[] microphonebrand ={"..."};
    String[] gamepadbrand ={"..."};
    String[] pendrivebrand ={"..."};
    String[] memorycardbrand ={"..."};
    String[] phddbrand ={"..."};
    String[] pssdbrand ={"..."};
    String[] ccbrand ={"..."};
    String[] usbhubbrand ={"..."};
    String[] pstripbrand ={"..."};
    String[] lstripbrand ={"..."};
    String[] chairbrand ={"..."};
    String[] tablebrand ={"..."};
    
    
    
    String[] routcat={"...","Router","Network Switch","Network Extender"};
    
    String[] routerbrand ={"...","Asus","DLink","Huawei","Netgear","Tenda","Tp-Link","Xiaomi"};
    String[] ntwrkswitchbrand ={"...","DLink","Netgear","Tp-Link"};
    String[] ntwrkextndrbrand ={"...","DLink","Netgear","Tp-Link","Xiaomi"};
    
    
    
    String[] moncat ={"...","UHD(4K)","Ultra Wide","QHD(2K)","FHD(1080p)"};
    
    String[] monbrand ={"...","AOC","Acer","Asus","Benq","Dell","Gigabyte","HP","LG","MSI","Philips","Samsung","ViewSonic","Walton","Xiaomi"};
    
    
    
    String[] tvcat ={"...","Television","Speaker","Portable Speaker"};
    
    String[] tvbrand ={"...","LG","Samsung","Sony","Xiaomi"};
    String[] speakerbrand ={"...","Creative","Edifier","F&D","JBL","Logitech","Microlab"};
    String[] portablespeakerbrand ={"...","Beats","Creative","F&D","JBL"};
    
    
    
    public AllProducts() {
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

        jPanel1 = new javax.swing.JPanel();
        backBTN = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AllProductsTable = new javax.swing.JTable();
        SearchBox = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        catDDBox = new javax.swing.JComboBox<>();
        braDDBox = new javax.swing.JComboBox<>();
        laptopRad = new javax.swing.JRadioButton();
        pcRad = new javax.swing.JRadioButton();
        accRad = new javax.swing.JRadioButton();
        monRad = new javax.swing.JRadioButton();
        tvRad = new javax.swing.JRadioButton();
        routRad = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sortBtn = new javax.swing.JButton();
        copyright = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(150, 100));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(29, 31, 47));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBTN.setBackground(new java.awt.Color(29, 31, 47));
        backBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/undo.png"))); // NOI18N
        backBTN.setMaximumSize(new java.awt.Dimension(58, 32));
        backBTN.setMinimumSize(new java.awt.Dimension(58, 32));
        backBTN.setPreferredSize(new java.awt.Dimension(58, 32));
        backBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBTNMouseClicked(evt);
            }
        });
        jPanel1.add(backBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        name.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("All Products");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 10, -1, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(910, 700));

        AllProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Category", "Brand", "Type", "Quantity", "Warranty", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AllProductsTable.setName(""); // NOI18N
        AllProductsTable.setOpaque(false);
        AllProductsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(AllProductsTable);
        if (AllProductsTable.getColumnModel().getColumnCount() > 0) {
            AllProductsTable.getColumnModel().getColumn(1).setPreferredWidth(250);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        SearchBox.setBackground(new java.awt.Color(255, 255, 255));
        SearchBox.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        SearchBox.setForeground(new java.awt.Color(102, 102, 102));
        SearchBox.setText("Search here...");
        SearchBox.setPreferredSize(new java.awt.Dimension(300, 45));
        SearchBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SearchBoxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SearchBoxFocusLost(evt);
            }
        });
        jPanel1.add(SearchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        SearchBtn.setBackground(new java.awt.Color(29, 31, 47));
        SearchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/magnifying-glass.png"))); // NOI18N
        SearchBtn.setPreferredSize(new java.awt.Dimension(40, 45));
        SearchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchBtnMouseClicked(evt);
            }
        });
        jPanel1.add(SearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        catDDBox.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        catDDBox.setPreferredSize(new java.awt.Dimension(340, 24));
        catDDBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catDDBoxActionPerformed(evt);
            }
        });
        jPanel1.add(catDDBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        braDDBox.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        braDDBox.setPreferredSize(new java.awt.Dimension(340, 24));
        jPanel1.add(braDDBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        laptopRad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        laptopRad.setForeground(new java.awt.Color(255, 255, 255));
        laptopRad.setText("Laptop & Tablet");
        laptopRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laptopRadActionPerformed(evt);
            }
        });
        jPanel1.add(laptopRad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        pcRad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pcRad.setForeground(new java.awt.Color(255, 255, 255));
        pcRad.setText("PC Components");
        pcRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcRadActionPerformed(evt);
            }
        });
        jPanel1.add(pcRad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        accRad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        accRad.setForeground(new java.awt.Color(255, 255, 255));
        accRad.setText("Accessories");
        accRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accRadActionPerformed(evt);
            }
        });
        jPanel1.add(accRad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        monRad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        monRad.setForeground(new java.awt.Color(255, 255, 255));
        monRad.setText("Monitor");
        monRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monRadActionPerformed(evt);
            }
        });
        jPanel1.add(monRad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        tvRad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tvRad.setForeground(new java.awt.Color(255, 255, 255));
        tvRad.setText("TV & Speaker");
        tvRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tvRadActionPerformed(evt);
            }
        });
        jPanel1.add(tvRad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        routRad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        routRad.setForeground(new java.awt.Color(255, 255, 255));
        routRad.setText("Router & Network");
        routRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routRadActionPerformed(evt);
            }
        });
        jPanel1.add(routRad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("All Category");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Category");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Brand");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        sortBtn.setBackground(new java.awt.Color(29, 31, 47));
        sortBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/right-arrow.png"))); // NOI18N
        sortBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sortBtnMouseClicked(evt);
            }
        });
        jPanel1.add(sortBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 580, -1, -1));

        copyright.setForeground(new java.awt.Color(255, 255, 255));
        copyright.setText("Copyright © 2021, TechnoBot BD");
        jPanel1.add(copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 700, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBTNMouseClicked
        // TODO add your handling code here:
        HomePage hp = new HomePage();
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBTNMouseClicked

    private void SearchBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchBoxFocusGained
        // TODO add your handling code here:
        if(SearchBox.getText().equals("Search here...")){
            SearchBox.setText("");
            SearchBox.requestFocus();
            SearchBox.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_SearchBoxFocusGained

    private void SearchBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchBoxFocusLost
        // TODO add your handling code here:
        if(SearchBox.getText().length()== 0){
            SearchBox.setText("Search here...");
            SearchBox.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_SearchBoxFocusLost

    private void laptopRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laptopRadActionPerformed
        // TODO add your handling code here:
        if(laptopRad.isSelected())
        {
            pcRad.setSelected(false);
            accRad.setSelected(false);
            routRad.setSelected(false);
            monRad.setSelected(false);
            tvRad.setSelected(false);
            
            catDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(laptopcat));
            braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());

        }
        else{
            catDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
            braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
        }
    }//GEN-LAST:event_laptopRadActionPerformed

    private void pcRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcRadActionPerformed
        // TODO add your handling code here:
        if(pcRad.isSelected())
        {
            laptopRad.setSelected(false);
            accRad.setSelected(false);
            routRad.setSelected(false);
            monRad.setSelected(false);
            tvRad.setSelected(false);
            
            
            catDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(pccat));
            braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());

        }
        else{
            catDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
            braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
        }
    }//GEN-LAST:event_pcRadActionPerformed

    private void accRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accRadActionPerformed
        // TODO add your handling code here:
        if(accRad.isSelected())
        {
            pcRad.setSelected(false);
            laptopRad.setSelected(false);
            routRad.setSelected(false);
            monRad.setSelected(false);
            tvRad.setSelected(false);
            
            
            catDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(acccat));
            braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
        }
        else{
            catDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
            braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
        }
    }//GEN-LAST:event_accRadActionPerformed

    private void routRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routRadActionPerformed
        // TODO add your handling code here:
        if(routRad.isSelected())
        {
            pcRad.setSelected(false);
            accRad.setSelected(false);
            laptopRad.setSelected(false);
            monRad.setSelected(false);
            tvRad.setSelected(false);
            
            
            catDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(routcat));
            braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
        }
        else{
            catDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
            braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
        }
    }//GEN-LAST:event_routRadActionPerformed

    private void monRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monRadActionPerformed
        // TODO add your handling code here:
        if(monRad.isSelected())
        {
            pcRad.setSelected(false);
            accRad.setSelected(false);
            routRad.setSelected(false);
            laptopRad.setSelected(false);
            tvRad.setSelected(false);
            
            
            catDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(moncat));
            braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(monbrand));
        }
        else{
            catDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
            braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
        }
    }//GEN-LAST:event_monRadActionPerformed

    private void tvRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tvRadActionPerformed
        // TODO add your handling code here:
        if(tvRad.isSelected())
        {
            pcRad.setSelected(false);
            accRad.setSelected(false);
            routRad.setSelected(false);
            monRad.setSelected(false);
            laptopRad.setSelected(false);
            
            
            catDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(tvcat));
            braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
        }
        else{
            catDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
            braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
        }
    }//GEN-LAST:event_tvRadActionPerformed

    private void SearchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBtnMouseClicked
        // TODO add your handling code here:
        laptopRad.setSelected(false);
        pcRad.setSelected(false);
        accRad.setSelected(false);
        routRad.setSelected(false);
        monRad.setSelected(false);
        tvRad.setSelected(false);
        
        
        catDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
        braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
    }//GEN-LAST:event_SearchBtnMouseClicked

    private void catDDBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catDDBoxActionPerformed
        // TODO add your handling code here:
        if(laptopRad.isSelected())
        {
            
            if(catDDBox.getSelectedItem().equals("Laptop"))
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(laptopbrand)); 
            }
            else if(catDDBox.getSelectedItem().equals("Gaming Laptop"))
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(gaminglaptopbrand));
            }
            else if(catDDBox.getSelectedItem().equals("Tablet"))
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(tabletbrand));
            }
            else if(catDDBox.getSelectedItem().equals("Laptop Ram"))
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(lrambrand));
            }
            else if(catDDBox.getSelectedItem().equals("Laptop Adapter"))
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(adapterbrand));
            }
            else if(catDDBox.getSelectedItem().equals("Laptop Battery"))
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(batterybrand));
            }
            else if(catDDBox.getSelectedItem().equals("Laptop Cooler"))
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(coolerbrand));
            }
            else
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
            }
        }
        else if(pcRad.isSelected())
        {
            if(catDDBox.getSelectedItem().equals("Casing"))
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(casingbrand)); 
            }
            else if(catDDBox.getSelectedItem().equals("Processor"))
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(cpubrand));
            }
            else if(catDDBox.getSelectedItem().equals("Motherboard"))
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(mobobrand));
            }
            else if(catDDBox.getSelectedItem().equals("Graphics Card"))
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(gpubrand));
            }
            else if(catDDBox.getSelectedItem().equals("Desktop Ram"))
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(drambrand));
            }
            else if(catDDBox.getSelectedItem().equals("Internal SSD"))
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(ssdbrand));
            }
            else if(catDDBox.getSelectedItem().equals("Internal Hard-Disk"))
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(hddbrand));
            }
            else if(catDDBox.getSelectedItem().equals("Power Supply"))
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(psubrand));
            }
            else if(catDDBox.getSelectedItem().equals("CPU Cooler"))
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(cpucoolerbrand));
            }
            else if(catDDBox.getSelectedItem().equals("Casing Fan"))
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(casingfanbrand));
            }
            else if(catDDBox.getSelectedItem().equals("UPS"))
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(upsbrand));
            }
            else
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
            }
        }
        else if(accRad.isSelected())
        {
            if(catDDBox.getSelectedItem().equals("Webcam"))
            {
                
            }
            else
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
            }
        }
        else if(routRad.isSelected())
        {
            if(catDDBox.getSelectedItem().equals("Router"))
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(routerbrand));
            }
            else if(catDDBox.getSelectedItem().equals("Network Switch"))
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(ntwrkswitchbrand));
            }
            else if(catDDBox.getSelectedItem().equals("Network Extender"))
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(ntwrkextndrbrand));
            }
            else
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
            }
        }
        /*else if(monRad.isSelected())
        {
            if(catDDBox.getSelectedItem().equals("Webcam"))
            {
                
            }
            else
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
            }
        }*/
        else if(tvRad.isSelected())
        {
            if(catDDBox.getSelectedItem().equals("Television"))
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(tvbrand));
            }
            else if(catDDBox.getSelectedItem().equals("Speaker"))
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(speakerbrand));
            }
            else if(catDDBox.getSelectedItem().equals("Portable Speaker"))
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>(portablespeakerbrand));
            }
            else
            {
                braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
            }
        }
    }//GEN-LAST:event_catDDBoxActionPerformed

    private void sortBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sortBtnMouseClicked
        // TODO add your handling code here:
        if(laptopRad.isSelected() || pcRad.isSelected() || accRad.isSelected() || routRad.isSelected() || monRad.isSelected() || tvRad.isSelected())
        {
            
        }
        else{
            JOptionPane.showMessageDialog(null, "No catagory was selected\nPlease select one", "Caution", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_sortBtnMouseClicked

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
            java.util.logging.Logger.getLogger(AllProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AllProductsTable;
    private javax.swing.JTextField SearchBox;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JRadioButton accRad;
    private javax.swing.JButton backBTN;
    private javax.swing.JComboBox<String> braDDBox;
    private javax.swing.JComboBox<String> catDDBox;
    private javax.swing.JLabel copyright;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton laptopRad;
    private javax.swing.JRadioButton monRad;
    private javax.swing.JLabel name;
    private javax.swing.JRadioButton pcRad;
    private javax.swing.JRadioButton routRad;
    private javax.swing.JButton sortBtn;
    private javax.swing.JRadioButton tvRad;
    // End of variables declaration//GEN-END:variables
}
