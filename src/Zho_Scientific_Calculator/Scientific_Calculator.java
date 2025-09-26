
package Zho_Scientific_Calculator;

import com.sun.glass.events.KeyEvent;


public class Scientific_Calculator extends javax.swing.JFrame {
    double firstnum;
    double secondnum;
    double result;
    String operations;
    private Object math;
  
    public Scientific_Calculator() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtDisplay = new javax.swing.JTextField();
        jbtn8 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtnminus = new javax.swing.JButton();
        jbtndot = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtnplusminus = new javax.swing.JButton();
        jbtnequal = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtndivide = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtnmultipy = new javax.swing.JButton();
        jbtnclear = new javax.swing.JButton();
        jbtnBackspace = new javax.swing.JButton();
        jbtnroot = new javax.swing.JButton();
        jbtnplus = new javax.swing.JButton();
        jbtnxpow2 = new javax.swing.JButton();
        jbtnCos = new javax.swing.JButton();
        jbtnrnd = new javax.swing.JButton();
        jbtnpi = new javax.swing.JButton();
        jbtncosh = new javax.swing.JButton();
        jbtntan = new javax.swing.JButton();
        jbtnxpowy = new javax.swing.JButton();
        jbtntanh = new javax.swing.JButton();
        jbtnsin = new javax.swing.JButton();
        jbtnlog = new javax.swing.JButton();
        jbtnsinh = new javax.swing.JButton();
        jbtnxpow3 = new javax.swing.JButton();
        jbtn00 = new javax.swing.JButton();
        jbtncbrt = new javax.swing.JButton();
        jbtnbin = new javax.swing.JButton();
        jbtnhex = new javax.swing.JButton();
        jbtnoct = new javax.swing.JButton();
        jbtnln = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jtxtDisplay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtDisplay.setForeground(new java.awt.Color(102, 102, 255));
        jtxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtDisplay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDisplayKeyTyped(evt);
            }
        });

        jbtn8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn8.setForeground(new java.awt.Color(0, 0, 153));
        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });

        jbtn7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn7.setForeground(new java.awt.Color(0, 0, 153));
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jbtn9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn9.setForeground(new java.awt.Color(0, 51, 153));
        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });

        jbtnminus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnminus.setForeground(new java.awt.Color(153, 0, 51));
        jbtnminus.setText("-");
        jbtnminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnminusActionPerformed(evt);
            }
        });

        jbtndot.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtndot.setForeground(new java.awt.Color(153, 51, 0));
        jbtndot.setText(".");
        jbtndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndotActionPerformed(evt);
            }
        });

        jbtn0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn0.setForeground(new java.awt.Color(0, 51, 153));
        jbtn0.setText("0");
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });

        jbtnplusminus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnplusminus.setForeground(new java.awt.Color(153, 0, 51));
        jbtnplusminus.setText("±");
        jbtnplusminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnplusminusActionPerformed(evt);
            }
        });

        jbtnequal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnequal.setForeground(new java.awt.Color(153, 0, 51));
        jbtnequal.setText("=");
        jbtnequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnequalActionPerformed(evt);
            }
        });

        jbtn2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn2.setForeground(new java.awt.Color(0, 51, 204));
        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jbtn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn1.setForeground(new java.awt.Color(0, 51, 153));
        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtn3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn3.setForeground(new java.awt.Color(0, 51, 153));
        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtndivide.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtndivide.setForeground(new java.awt.Color(153, 0, 51));
        jbtndivide.setText("/");
        jbtndivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndivideActionPerformed(evt);
            }
        });

        jbtn5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn5.setForeground(new java.awt.Color(0, 51, 153));
        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });

        jbtn4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn4.setForeground(new java.awt.Color(0, 51, 153));
        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtn6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn6.setForeground(new java.awt.Color(0, 51, 153));
        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbtnmultipy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnmultipy.setForeground(new java.awt.Color(153, 0, 51));
        jbtnmultipy.setText("*");
        jbtnmultipy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnmultipyActionPerformed(evt);
            }
        });

        jbtnclear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnclear.setForeground(new java.awt.Color(153, 0, 51));
        jbtnclear.setText("C");
        jbtnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnclearActionPerformed(evt);
            }
        });

        jbtnBackspace.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnBackspace.setForeground(new java.awt.Color(153, 0, 51));
        jbtnBackspace.setText("←");
        jbtnBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackspaceActionPerformed(evt);
            }
        });

        jbtnroot.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnroot.setForeground(new java.awt.Color(153, 0, 51));
        jbtnroot.setText("√");
        jbtnroot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnrootActionPerformed(evt);
            }
        });

        jbtnplus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnplus.setForeground(new java.awt.Color(153, 0, 51));
        jbtnplus.setText("+");
        jbtnplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnplusActionPerformed(evt);
            }
        });

        jbtnxpow2.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jbtnxpow2.setForeground(new java.awt.Color(0, 102, 102));
        jbtnxpow2.setText("x^2");
        jbtnxpow2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnxpow2ActionPerformed(evt);
            }
        });

        jbtnCos.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jbtnCos.setForeground(new java.awt.Color(0, 204, 204));
        jbtnCos.setText("Cos");
        jbtnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCosActionPerformed(evt);
            }
        });

        jbtnrnd.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jbtnrnd.setForeground(new java.awt.Color(204, 0, 0));
        jbtnrnd.setText("Rnd");
        jbtnrnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnrndActionPerformed(evt);
            }
        });

        jbtnpi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnpi.setForeground(new java.awt.Color(102, 0, 102));
        jbtnpi.setText(" π ");
        jbtnpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnpiActionPerformed(evt);
            }
        });

        jbtncosh.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jbtncosh.setForeground(new java.awt.Color(204, 0, 204));
        jbtncosh.setText("Cosh");
        jbtncosh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncoshActionPerformed(evt);
            }
        });

        jbtntan.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jbtntan.setForeground(new java.awt.Color(0, 204, 204));
        jbtntan.setText("Tan");
        jbtntan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtntanActionPerformed(evt);
            }
        });

        jbtnxpowy.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jbtnxpowy.setForeground(new java.awt.Color(0, 102, 102));
        jbtnxpowy.setText("x^y");
        jbtnxpowy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnxpowyActionPerformed(evt);
            }
        });

        jbtntanh.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jbtntanh.setForeground(new java.awt.Color(204, 0, 204));
        jbtntanh.setText("Tanh");
        jbtntanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtntanhActionPerformed(evt);
            }
        });

        jbtnsin.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbtnsin.setForeground(new java.awt.Color(0, 204, 204));
        jbtnsin.setText("Sin");
        jbtnsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsinActionPerformed(evt);
            }
        });

        jbtnlog.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbtnlog.setForeground(new java.awt.Color(0, 0, 255));
        jbtnlog.setText("Log");
        jbtnlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnlogActionPerformed(evt);
            }
        });

        jbtnsinh.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jbtnsinh.setForeground(new java.awt.Color(204, 0, 204));
        jbtnsinh.setText("Sinh");
        jbtnsinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsinhActionPerformed(evt);
            }
        });

        jbtnxpow3.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jbtnxpow3.setForeground(new java.awt.Color(0, 102, 102));
        jbtnxpow3.setText("x^3");
        jbtnxpow3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnxpow3ActionPerformed(evt);
            }
        });

        jbtn00.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jbtn00.setForeground(new java.awt.Color(0, 0, 255));
        jbtn00.setText("00");
        jbtn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn00ActionPerformed(evt);
            }
        });

        jbtncbrt.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbtncbrt.setForeground(new java.awt.Color(204, 0, 0));
        jbtncbrt.setText("cbrt");
        jbtncbrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncbrtActionPerformed(evt);
            }
        });

        jbtnbin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnbin.setForeground(new java.awt.Color(0, 153, 51));
        jbtnbin.setText("Bin");
        jbtnbin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnbinActionPerformed(evt);
            }
        });

        jbtnhex.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbtnhex.setForeground(new java.awt.Color(0, 153, 51));
        jbtnhex.setText("Hex");
        jbtnhex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnhexActionPerformed(evt);
            }
        });

        jbtnoct.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbtnoct.setForeground(new java.awt.Color(0, 153, 51));
        jbtnoct.setText("Oct");
        jbtnoct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnoctActionPerformed(evt);
            }
        });

        jbtnln.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbtnln.setForeground(new java.awt.Color(0, 0, 204));
        jbtnln.setText("lnx");
        jbtnln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnlnActionPerformed(evt);
            }
        });

        jMenu1.setText(" Mode");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Standard");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Scientific");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jbtnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jbtnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbtnroot, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jbtnplus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jbtnlog, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jbtnsin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbtnsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbtnminus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jbtnpi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jbtnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbtncosh, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbtnmultipy, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jbtnoct, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jbtnxpowy, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtntan, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtntanh, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbtndivide, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnbin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jbtnxpow2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jbtncbrt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jbtnrnd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jbtndot, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbtnplusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbtnequal, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jbtnhex, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jbtnxpow3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnln, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn00, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jbtnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jbtnroot, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jbtnplus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jbtnlog, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jbtnsin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jbtnsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnminus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jbtnpi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jbtnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jbtncosh, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jbtnmultipy, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jbtnoct, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnxpowy, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtntan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtntanh, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtndivide, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnbin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jbtnxpow2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jbtncbrt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jbtnrnd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtndot, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnplusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnequal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnhex, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnxpow3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnln, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtn00, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setResizable(true);
        this.setSize(268, 480);
    }//GEN-LAST:event_formWindowActivated

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         this.setResizable(true);
        this.setSize(268, 480);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
         this.setResizable(true);
        this.setSize(568, 380);
        jtxtDisplay.setSize(468,40);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

   
      
    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        String iNum = jtxtDisplay.getText() + jbtn7.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
         String iNum = jtxtDisplay.getText() + jbtn8.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
         String iNum = jtxtDisplay.getText() + jbtn9.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
         String iNum = jtxtDisplay.getText() + jbtn4.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        String iNum = jtxtDisplay.getText() + jbtn5.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
         String iNum = jtxtDisplay.getText() + jbtn6.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
         String iNum = jtxtDisplay.getText() + jbtn1.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
         String iNum = jtxtDisplay.getText() + jbtn2.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
         String iNum = jtxtDisplay.getText() + jbtn3.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
         String iNum = jtxtDisplay.getText() + jbtn0.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn0ActionPerformed

    private void jbtnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnclearActionPerformed

       jtxtDisplay.setText("");
    }//GEN-LAST:event_jbtnclearActionPerformed

    private void jbtnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackspaceActionPerformed
      String bsp = null;
      if(jtxtDisplay.getText().length() > 0){
      StringBuilder strB = new StringBuilder(jtxtDisplay.getText());
      strB.deleteCharAt(jtxtDisplay.getText().length() - 1);
      bsp = strB.toString();
      jtxtDisplay.setText(bsp);
      }
    }//GEN-LAST:event_jbtnBackspaceActionPerformed

    private void jbtndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndotActionPerformed
        if(!jtxtDisplay.getText().contains("."))
        {
        jtxtDisplay.setText(jtxtDisplay.getText() + jbtndot.getText());
        }
    }//GEN-LAST:event_jbtndotActionPerformed

    private void jbtnplusminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnplusminusActionPerformed
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = ops * (-1);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnplusminusActionPerformed

    private void jbtnrootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnrootActionPerformed
         double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.sqrt(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnrootActionPerformed

    private void jbtnlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnlogActionPerformed
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.log(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnlogActionPerformed

    private void jbtnsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsinActionPerformed
           double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.sin(Math.toRadians(ops));
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnsinActionPerformed

    private void jbtncbrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncbrtActionPerformed
           double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.cbrt(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtncbrtActionPerformed

    private void jbtnrndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnrndActionPerformed
           double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.round(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnrndActionPerformed

    private void jbtnsinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsinhActionPerformed
           double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.sinh(Math.toRadians(ops));
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnsinhActionPerformed

    private void jbtnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCosActionPerformed
           double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.cos(Math.toRadians(ops));
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnCosActionPerformed

    private void jbtncoshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncoshActionPerformed
          double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.cosh(Math.toRadians(ops));
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtncoshActionPerformed

    private void jbtntanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtntanActionPerformed
           double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.tan(Math.toRadians(ops));
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtntanActionPerformed

    private void jbtntanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtntanhActionPerformed
           double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.tanh(Math.toRadians(ops));
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtntanhActionPerformed

    private void jbtnpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnpiActionPerformed
        double ops;
        ops = Math.PI;
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnpiActionPerformed

    private void jbtnxpowyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnxpowyActionPerformed
           double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.pow(ops, ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnxpowyActionPerformed

    private void jbtnxpow2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnxpow2ActionPerformed
         double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = (ops * ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnxpow2ActionPerformed

    private void jbtnxpow3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnxpow3ActionPerformed
         double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = (ops * ops * ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnxpow3ActionPerformed

    private void jbtnbinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnbinActionPerformed
        int a = Integer.parseInt(jtxtDisplay.getText());
        jtxtDisplay.setText(Integer.toString(a,2));
    }//GEN-LAST:event_jbtnbinActionPerformed

    private void jbtnhexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnhexActionPerformed
        int a = Integer.parseInt(jtxtDisplay.getText());
        jtxtDisplay.setText(Integer.toString(a,16));
    }//GEN-LAST:event_jbtnhexActionPerformed

    private void jbtnoctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnoctActionPerformed
       int a = Integer.parseInt(jtxtDisplay.getText());
        jtxtDisplay.setText(Integer.toString(a,8));
    }//GEN-LAST:event_jbtnoctActionPerformed

    private void jtxtDisplayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDisplayKeyTyped
       char c = evt.getKeyChar();
       if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACKSPACE) || 
               (c == KeyEvent.VK_DELETE))){
       getToolkit().beep();
       evt.consume();
       }
    }//GEN-LAST:event_jtxtDisplayKeyTyped

    private void jbtnequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnequalActionPerformed
        String answer;
        secondnum = Double.parseDouble(jtxtDisplay.getText());
        if(operations == "+"){
            result = firstnum + secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        }
        else if(operations == "-"){
            result = firstnum - secondnum;
            answer = String.format("%.2f", result);
             jtxtDisplay.setText(answer);
        }
        else if(operations == "*"){
            result = firstnum * secondnum;
            answer = String.format("%.2f", result);
             jtxtDisplay.setText(answer);
        }
        else if(operations == "/"){
            result = firstnum / secondnum;
            answer = String.format("%.2f", result);
             jtxtDisplay.setText(answer);
        }
    }//GEN-LAST:event_jbtnequalActionPerformed

    private void jbtnplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnplusActionPerformed
         firstnum = Double.parseDouble(jtxtDisplay.getText());
         jtxtDisplay.setText(null);
         operations = ("+");
    }//GEN-LAST:event_jbtnplusActionPerformed

    private void jbtnminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnminusActionPerformed
         firstnum = Double.parseDouble(jtxtDisplay.getText());
         jtxtDisplay.setText(null);
         operations = ("-");
    }//GEN-LAST:event_jbtnminusActionPerformed

    private void jbtnmultipyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnmultipyActionPerformed
         firstnum = Double.parseDouble(jtxtDisplay.getText());
         jtxtDisplay.setText(null);
         operations = ("*");
    }//GEN-LAST:event_jbtnmultipyActionPerformed

    private void jbtndivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndivideActionPerformed
         firstnum = Double.parseDouble(jtxtDisplay.getText());
         jtxtDisplay.setText(null);
         operations = ("/");
    }//GEN-LAST:event_jbtndivideActionPerformed

    private void jbtnlnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnlnActionPerformed
          double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.log10(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnlnActionPerformed

    private void jbtn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn00ActionPerformed
          String iNum = jtxtDisplay.getText() + jbtn00.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn00ActionPerformed
   
  
    public static void main(String args[]){
        
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scientific_Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn00;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnBackspace;
    private javax.swing.JButton jbtnCos;
    private javax.swing.JButton jbtnbin;
    private javax.swing.JButton jbtncbrt;
    private javax.swing.JButton jbtnclear;
    private javax.swing.JButton jbtncosh;
    private javax.swing.JButton jbtndivide;
    private javax.swing.JButton jbtndot;
    private javax.swing.JButton jbtnequal;
    private javax.swing.JButton jbtnhex;
    private javax.swing.JButton jbtnln;
    private javax.swing.JButton jbtnlog;
    private javax.swing.JButton jbtnminus;
    private javax.swing.JButton jbtnmultipy;
    private javax.swing.JButton jbtnoct;
    private javax.swing.JButton jbtnpi;
    private javax.swing.JButton jbtnplus;
    private javax.swing.JButton jbtnplusminus;
    private javax.swing.JButton jbtnrnd;
    private javax.swing.JButton jbtnroot;
    private javax.swing.JButton jbtnsin;
    private javax.swing.JButton jbtnsinh;
    private javax.swing.JButton jbtntan;
    private javax.swing.JButton jbtntanh;
    private javax.swing.JButton jbtnxpow2;
    private javax.swing.JButton jbtnxpow3;
    private javax.swing.JButton jbtnxpowy;
    private javax.swing.JTextField jtxtDisplay;
    // End of variables declaration//GEN-END:variables
}
