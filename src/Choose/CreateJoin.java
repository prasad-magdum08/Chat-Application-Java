package Choose;

import Client.Client;
import Client.Info;
import Login_SignUp.Login;
import Server.Server;
import java.awt.*;
import javax.swing.*;

public class CreateJoin extends JFrame {

    public CreateJoin() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab = new javax.swing.JLayeredPane();
        ImageIcon image4 = new ImageIcon(ClassLoader.getSystemResource("icon\\close.png"));
        Image image5 = image4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon image6 = new ImageIcon(image5);
        close = new javax.swing.JLabel(image6);
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icon\\left-back.png"));
        Image image2 = image1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        back = new javax.swing.JLabel(image3);
        body = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        CreateServer = new javax.swing.JButton();
        JoinServer = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        tab.setBackground(new java.awt.Color(255, 255, 255));
        tab.setMinimumSize(new java.awt.Dimension(100, 30));
        tab.setOpaque(true);
        tab.setPreferredSize(new java.awt.Dimension(300, 30));

        close.setBackground(new java.awt.Color(255, 255, 255));
        close.setMaximumSize(new java.awt.Dimension(30, 30));
        close.setMinimumSize(new java.awt.Dimension(30, 30));
        close.setOpaque(true);
        close.setPreferredSize(new java.awt.Dimension(30, 30));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setMaximumSize(new java.awt.Dimension(30, 30));
        back.setMinimumSize(new java.awt.Dimension(30, 30));
        back.setOpaque(true);
        back.setPreferredSize(new java.awt.Dimension(30, 30));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        add(tab, BorderLayout.NORTH);

        tab.setLayer(close, javax.swing.JLayeredPane.DEFAULT_LAYER);
        tab.setLayer(back, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout tabLayout = new javax.swing.GroupLayout(tab);
        tab.setLayout(tabLayout);
        tabLayout.setHorizontalGroup(
            tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabLayout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        tabLayout.setVerticalGroup(
            tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabLayout.createSequentialGroup()
                .addGroup(tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(close, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(0, 1, 0, 5));

        CreateServer.setBackground(new Color(6, 90, 179));
        CreateServer.setForeground(new java.awt.Color(255, 255, 255));
        CreateServer.setText("Create Server");
        CreateServer.setFocusable(false);
        CreateServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateServerActionPerformed(evt);
            }
        });
        jPanel1.add(CreateServer);

        JoinServer.setBackground(new Color(6, 90, 179));
        JoinServer.setForeground(new java.awt.Color(255, 255, 255));
        JoinServer.setText("Join Server");
        JoinServer.setFocusable(false);
        JoinServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JoinServerActionPerformed(evt);
            }
        });
        jPanel1.add(JoinServer);

        body.add(jPanel1);
        jPanel1.setBounds(70, 80, 150, 90);

        image.setBackground(new java.awt.Color(255, 255, 255));
        image.setOpaque(true);
        body.add(image);
        image.setBounds(0, 0, 300, 270);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addComponent(tab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JoinServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JoinServerActionPerformed
        dispose();
        Info client = new Info();
        client.setVisible(true);
    }//GEN-LAST:event_JoinServerActionPerformed

    private void CreateServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateServerActionPerformed
        dispose();
        Server server = new Server();
        server.setVisible(true);
        Info client = new Info();
        client.setVisible(true);
    }//GEN-LAST:event_CreateServerActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        dispose();
        Login login = new Login();
        login.setVisible(true);
        
    }//GEN-LAST:event_backMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        dispose();
    }//GEN-LAST:event_closeMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateJoin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateServer;
    private javax.swing.JButton JoinServer;
    private javax.swing.JLabel back;
    private javax.swing.JLayeredPane body;
    private javax.swing.JLabel close;
    private javax.swing.JLabel image;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLayeredPane tab;
    // End of variables declaration//GEN-END:variables
}
