package com.github.lyrric.ui;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName JTabbedPanel
 * @Description
 * @Author lhy
 * @Date 2021-10-31 13:31
 * @Version 1.0
 */
public class myJTabbedPane extends JPanel {

    private JTabbedPane jTabbedPane = new JTabbedPane();
    private String[] tabNames = {"秒苗", "约苗"};

    public myJTabbedPane() {
        initTabbedPanel();
    }

    private void initTabbedPanel() {
        int i = 0;
        JPanel mmPanel = new miaoMiaoTab();
        jTabbedPane.addTab(tabNames[i++], null, mmPanel, "秒苗小程序");

        JPanel ymPanel = new JPanel();
        jTabbedPane.addTab(tabNames[i++], null, ymPanel, "约苗公众号");

        setLayout(new GridLayout(1, 1));
        add(jTabbedPane);
    }
}
