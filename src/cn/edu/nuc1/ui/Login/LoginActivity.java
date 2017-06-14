package cn.edu.nuc1.ui.Login;

/**
 * Created by Administrator on 2017/6/10.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cn.edu.nuc1.DBSystemManage;
import cn.edu.nuc1.ui.manage.AdminManageActivity;
import cn.edu.nuc1.ui.manage.TeacherManageActivity;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class LoginActivity extends javax.swing.JFrame {
    private Statement mStatement = DBSystemManage.getInstance().mStatement;

    /**
     * Creates new form LoginActivity
     */
    public LoginActivity() {
        mStatement = DBSystemManage.getInstance().mStatement;

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        jLabel1.setText(" 教材征订与分发管理系统");

        jLabel2.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel2.setText("用户：");

        jLabel3.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel3.setText("密码：");

        jLabel4.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel4.setText("角色：");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "管理员", "教师" }));



        jButton1.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jButton1.setText("登录");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jButton2.setText("注册");
        jButton2.addActionListener((java.awt.event.ActionEvent evt) ->jButton2ActionPerformed(evt));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(236, 236, 236)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(45, 45, 45)
                                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(203, 203, 203)
                                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jTextField1)
                                                                .addComponent(jTextField2)
                                                                .addComponent(jComboBox1, 0, 174, Short.MAX_VALUE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(95, 95, 95)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51))
        );

        pack();

    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String user = jTextField1.getText();
        String password = jTextField2.getText();

        // TODO add your handling code here:
        //管理员状态
        if (jComboBox1.getSelectedIndex()==0){
            System.out.println("管理员状态");

            ResultSet mResultSet = null;
            try {
                mResultSet = mStatement.executeQuery("select * from adminator where Mname="+"'"+user+"'");
                if (mResultSet.next()){
                    System.out.println("用户存在");
                    String finalid= mResultSet.getString(1);
                    System.out.println(finalid);

                    //JOptionPane.showMessageDialog(this,"用户存在");
                    String realPassword = mResultSet.getString(4);
                    if (realPassword.equals(password)){
                        JOptionPane.showMessageDialog(this,"登录成功");
                        AdminManageActivity mAdminManageActivity = new AdminManageActivity(finalid);
                        mAdminManageActivity.setLocation(200,200);
                        mAdminManageActivity.setVisible(true);
                        //this.setVisible(false);
                    }else {
                        JOptionPane.showMessageDialog(this,"密码错误");
                    }
                }else {
                    JOptionPane.showMessageDialog(this,"用户不存在");

                }
            } catch (SQLException mE) {
                mE.printStackTrace();
            }


        }
        //教师状态
        if (jComboBox1.getSelectedIndex() == 1){
            System.out.println("教师状态");
            ResultSet mResultSet = null;
            try {
                mResultSet = mStatement.executeQuery("select * from teacher where Tname="+"'"+user+"'");
                if (mResultSet.next()){
                    System.out.println("用户存在");
                    String finalid= mResultSet.getString(1);
                    System.out.println(finalid);
                    //JOptionPane.showMessageDialog(this,"用户存在");
                    String realPassword = mResultSet.getString(4);
                    if (realPassword.equals(password)){
                        JOptionPane.showMessageDialog(this,"登录成功");
                        TeacherManageActivity mTeacherManageActivity = new TeacherManageActivity(finalid);
                        mTeacherManageActivity.setLocation(200,200);
                        mTeacherManageActivity.setVisible(true);

                        this.setVisible(false);
                    }else {
                        JOptionPane.showMessageDialog(this,"密码错误");
                    }
                }else {
                    JOptionPane.showMessageDialog(this,"用户不存在");

                }
            } catch (SQLException mE) {
                mE.printStackTrace();
            }

        }

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //管理员注册状态
        if (jComboBox1.getSelectedIndex()==0){
            System.out.println("管理员状态");
            AdminRegistActivity mAdminRegistActivity = new AdminRegistActivity();
            mAdminRegistActivity.setLocation(400,200);
            mAdminRegistActivity.setVisible(true);
            this.setVisible(false);
        }
        //教师注册状态
        if (jComboBox1.getSelectedIndex() == 1){
            System.out.println("教师状态");
            TeacherRegistActivity mTeacherRegistActivity = new TeacherRegistActivity();
            mTeacherRegistActivity.setLocation(400,200);
            mTeacherRegistActivity.setVisible(true);
            this.setVisible(false);
        }

    }

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
            java.util.logging.Logger.getLogger(LoginActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        LoginActivity mLoginActivity = new LoginActivity();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                mLoginActivity.setLocation(600,200);
                mLoginActivity.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField jTextField2;
    // End of variables declaration
}