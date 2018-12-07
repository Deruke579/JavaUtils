package com.example;

import org.apache.log4j.Logger;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Kelly on 2018/12/7.
 */
public class MainFrame extends JFrame{

    private static Logger logger = Logger.getLogger(MainFrame.class);

    private JScrollPane jScrollPane1;
    private JPanel panel;
    private JButton btnConnect;
    private JTextField textField_Port;
    private JLabel lblNewLabel;
    private JCheckBox checkBox;
    private JCheckBox checkBox1;
    private JButton btnStopServer;
    private JScrollPane scrollPane;
    private JTable table;
    private JButton buttonClearLog;

    // 是否不显示心跳日志
    private JCheckBox checkBox_HideHeartLog;

    public MainFrame() {
        setBackground(Color.LIGHT_GRAY);
        initComponents();
        initParameter();
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
        new MainFrame().setVisible(true);
    }

    private void initParameter(){
        setTitle("MainFrame");
    }
    private void initComponents(){
        this.jScrollPane1 = new JScrollPane();

        setDefaultCloseOperation(3);

        panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 1));

        panel.setSize(100, 100);

        lblNewLabel = new JLabel("运管服务器端口：");
        panel.add(lblNewLabel);

        textField_Port = new JTextField();
        panel.add(textField_Port);
        textField_Port.setColumns(5);

        btnConnect = new JButton("启动");

        panel.add(btnConnect);

        btnStopServer = new JButton("停止");
        btnStopServer.setEnabled(false);

        getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
        panel.add(btnStopServer);

        checkBox = new JCheckBox("加密");

        panel.add(checkBox);

        checkBox1 = new JCheckBox("显示定位包");

        panel.add(checkBox1);

        buttonClearLog = new JButton("清空日志");
        buttonClearLog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                DefaultTableModel tb = (DefaultTableModel) table.getModel();
                tb.setRowCount(0);
            }
        });


        checkBox_HideHeartLog = new JCheckBox("显示心跳日志及实时数据");

        panel.add(checkBox_HideHeartLog);
        panel.add(buttonClearLog);
        getContentPane().add(jScrollPane1);

        jScrollPane1.setColumnHeaderView(panel);
        scrollPane = new JScrollPane();
        jScrollPane1.setViewportView(scrollPane);

        table = new JTable();
        table.setFont(new Font("宋体", Font.PLAIN, 14));
        table.setModel(new DefaultTableModel(new Object[][]{
                {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},}, new String[]{
                "消息类型", "子标识", "消息内容", "发送时间", "车牌号", "颜色", "原始数据报文"}));
        table.getColumnModel().getColumn(0).setPreferredWidth(65);
        table.getColumnModel().getColumn(0).setMaxWidth(80);
        table.getColumnModel().getColumn(1).setPreferredWidth(260);
        table.getColumnModel().getColumn(1).setMaxWidth(1000);
        table.getColumnModel().getColumn(2).setPreferredWidth(275);
        table.getColumnModel().getColumn(2).setMaxWidth(1050);
        table.getColumnModel().getColumn(3).setPreferredWidth(155);
        table.getColumnModel().getColumn(3).setMaxWidth(400);
        table.getColumnModel().getColumn(4).setPreferredWidth(95);
        table.getColumnModel().getColumn(4).setMaxWidth(450);
        table.getColumnModel().getColumn(5).setPreferredWidth(63);
        table.getColumnModel().getColumn(5).setMaxWidth(150);
        table.getColumnModel().getColumn(6).setPreferredWidth(187);
        scrollPane.setViewportView(table);

        pack();

        final Component c = this;
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int option = JOptionPane.showConfirmDialog(c, "确定要退出吗？", " 提示",
                        JOptionPane.OK_CANCEL_OPTION);
                if (JOptionPane.OK_OPTION == option) {

                } else {
                    MainFrame.this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });


    }

}
