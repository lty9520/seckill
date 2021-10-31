package com.github.lyrric.ui;

import com.github.lyrric.conf.Config;
import com.github.lyrric.model.Area;
import com.github.lyrric.model.BusinessException;
import com.github.lyrric.model.TableModel;
import com.github.lyrric.model.VaccineList;
import com.github.lyrric.service.SecKillService;
import com.github.lyrric.util.ParseUtil;
import org.apache.commons.lang3.StringUtils;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

/**
 * Created on 2020-07-21.
 *
 * @author wangxiaodong
 */
public class MainFrame extends JFrame {

    private myJTabbedPane myJTabbedPane = new myJTabbedPane();

    public MainFrame() {
        init();

    }

    private void init() {
        setLayout(null);
        setTitle("Just For Fun");
        setBounds(500 , 500, 680, 360);
        setLocationRelativeTo(null);
        setVisible(true);
        setContentPane(myJTabbedPane);
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
