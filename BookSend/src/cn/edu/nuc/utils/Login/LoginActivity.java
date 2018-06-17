package cn.edu.nuc.utils.Login;

/**
 * Created by Administrator on 2017/6/10.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cn.edu.nuc.utils.DBSystemManage;
import cn.edu.nuc.utils.ui.ManagerActivity;
import cn.edu.nuc.utils.ui.TeacherActivity;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class LoginActivity extends JFrame {
    private Statement mStatement = DBSystemManage.getInstance().mStatement;

    /**
     * Creates new form LoginActivity
     */
    public LoginActivity() {
        //mStatement = DBSystemManage.getInstance().mStatement;

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

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jComboBox1 = new JComboBox<>();
        jTextField1 = new JTextField();
        jTextField2 = new JPasswordField();
        jButton1 = new JButton();
        jButton2 = new JButton();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new Font("宋体", 1, 36)); // NOI18N
        jLabel1.setText(" 教材征订与分发管理系统");

        jLabel2.setFont(new Font("宋体", 1, 18)); // NOI18N
        jLabel2.setText("用户：");

        jLabel3.setFont(new Font("宋体", 1, 18)); // NOI18N
        jLabel3.setText("密码：");

        jLabel4.setFont(new Font("宋体", 1, 18)); // NOI18N
        jLabel4.setText("角色：");

        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "管理员", "教师" }));



        jButton1.setFont(new Font("宋体", 1, 14)); // NOI18N
        jButton1.setText("登录");
        jButton1.addActionListener(evt -> jButton1ActionPerformed(evt));

        jButton2.setFont(new Font("宋体", 1, 14)); // NOI18N
        jButton2.setText("注册");
        jButton2.addActionListener((java.awt.event.ActionEvent evt) ->jButton2ActionPerformed(evt));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(236, 236, 236)
                                                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(45, 45, 45)
                                                        .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(203, 203, 203)
                                                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabel3, GroupLayout.Alignment.TRAILING))
                                                                .addComponent(jLabel4, GroupLayout.Alignment.TRAILING))
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jTextField1)
                                                                .addComponent(jTextField2)
                                                                .addComponent(jComboBox1, 0, 174, Short.MAX_VALUE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(95, 95, 95)
                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 457, GroupLayout.PREFERRED_SIZE)))
                                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51))
        );

        pack();

    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String user = jTextField1.getText();
        String password = jTextField2.getText();

        //管理员状态
        if (jComboBox1.getSelectedIndex()==0){
            System.out.println("管理员状态");
            ResultSet mResultSet = null;
            try {
                mResultSet = mStatement.executeQuery("select * from manager where Mname="+"'"+user+"'");
                if (mResultSet.next()){
                    System.out.println("用户存在");
                    String finalid= mResultSet.getString(1);
                    System.out.println(finalid);

                    JOptionPane.showMessageDialog(this,"用户存在");
                    String realPassword = mResultSet.getString(3);
                    if (realPassword.equals(password)){
                        JOptionPane.showMessageDialog(this,"登录成功");
                        ManagerActivity mAdminManageActivity = new ManagerActivity(finalid);
                        mAdminManageActivity.setLocation(200,200);
                        mAdminManageActivity.setVisible(true);
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
                    String realPassword = mResultSet.getString(3);
                    if (realPassword.equals(password)){
                        JOptionPane.showMessageDialog(this,"登录成功");
                        TeacherActivity mTeacherManageActivity = new TeacherActivity(finalid);
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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        LoginActivity mLoginActivity = new LoginActivity();
        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {

                mLoginActivity.setLocation(600,200);
                mLoginActivity.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private JButton jButton1;
    private JButton jButton2;
    private JComboBox<String> jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JTextField jTextField1;
    private JPasswordField jTextField2;
    // End of variables declaration
}