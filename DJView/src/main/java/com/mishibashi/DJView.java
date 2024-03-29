package com.mishibashi;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class DJView implements ActionListener, BeatObserver, BPMObserver{
    BeatModelInterface model;
    ControllerInterface controller;
    JFrame viewFrame;
    JPanel viewPanel;
    BeatBar beatBar;
    JLabel bpmOutputLabel;

    JFrame controlFrame;
    JPanel controlPanel;
    JLabel bpmLabel;
    JTextField bpmTextField;
    JButton setBPMButton;
    JButton increaseBPMButton;
    JButton decreaseBPMButton;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem startMenuItem;
    JMenuItem stopMenuItem;

    public DJView(ControllerInterface controller, BeatModelInterface model){
        this.controller = controller;
        this.model = model;
        model.registerObserver((BeatObserver)this);
        model.registerObserver((BPMObserver)this);
    }

    public void createView(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        viewPanel = new JPanel(new GridLayout(1, 2));
        viewFrame = new JFrame("ビュー");
        viewFrame.setSize(new Dimension(100, 80));
        bpmOutputLabel = new JLabel("オフライン", SwingConstants.CENTER);
        beatBar = new BeatBar();
        beatBar.setValue(0);
        JPanel bpmPanel = new JPanel(new GridLayout(2, 1));
        bpmPanel.add(beatBar);
        bpmPanel.add(bpmOutputLabel);
        viewPanel.add(bpmPanel);
        viewFrame.getContentPane().add(viewPanel, BorderLayout.CENTER);
        viewFrame.pack();
        viewFrame.setVisible(true);
    }

    public void updateBPM(){
        int bpm = model.getBPM();
        if(bpm == 0){
            bpmOutputLabel.setText("オフライン");
        }
        else{
            bpmOutputLabel.setText("現在のBPM : " + model.getBPM());
            bpmTextField.setText("" + model.getBPM());
        }
    }

    public void updateBeat() {
        beatBar.setValue(100);        
    }

    public void createControls(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        controlFrame = new JFrame("コントロール");
        controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controlFrame.setSize(new Dimension(100, 80));

        controlPanel = new JPanel(new GridLayout(1, 2));

        menuBar = new JMenuBar();
        menu = new JMenu("DJコントロール");
        startMenuItem = new JMenuItem("開始");
        menu.add(startMenuItem);
        startMenuItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                controller.start();
            }
        });
        stopMenuItem = new JMenuItem("停止");
        menu.add(stopMenuItem);
        stopMenuItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                controller.stop();
            }
        });
        JMenuItem exit = new JMenuItem("終了");
        menu.add(exit);
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                System.exit(0);
            }
        });
        menuBar.add(menu);
        controlFrame.setJMenuBar(menuBar);

        bpmTextField = new JTextField(2);
        bpmLabel = new JLabel("BPMを入力", SwingConstants.RIGHT);
        setBPMButton = new JButton("設定");
        setBPMButton.setSize(new Dimension(10, 40));
        increaseBPMButton = new JButton(">>");
        decreaseBPMButton = new JButton("<<");
        setBPMButton.addActionListener(this);
        increaseBPMButton.addActionListener(this);
        decreaseBPMButton.addActionListener(this);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        buttonPanel.add(decreaseBPMButton);
        buttonPanel.add(increaseBPMButton);

        JPanel enterPanel = new JPanel(new GridLayout(1, 2));
        enterPanel.add(bpmLabel);
        enterPanel.add(bpmTextField);
        JPanel insideControlPanel = new JPanel(new GridLayout(3, 1));
        insideControlPanel.add(enterPanel);
        insideControlPanel.add(setBPMButton);
        insideControlPanel.add(buttonPanel);
        controlPanel.add(insideControlPanel);

        bpmLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        bpmOutputLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        controlFrame.getRootPane().setDefaultButton(setBPMButton);
        controlFrame.getContentPane().add(controlPanel, BorderLayout.CENTER);

        controlFrame.pack();
        controlFrame.setVisible(true);
    }

    public void enableStopMenuItem(){
        stopMenuItem.setEnabled(true);
    }

    public void disableStopMenuItem(){
        stopMenuItem.setEnabled(false);
    }

    public void enableStartMenuItem(){
        startMenuItem.setEnabled(true);
    }

    public void disableStartMenuItem(){
        startMenuItem.setEnabled(false);
    }

    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == setBPMButton){
            int bpm = Integer.parseInt(bpmTextField.getText());
            controller.setBPM(bpm);
        }
        else if(event.getSource() == increaseBPMButton){
            controller.increaseBPM();
        }
        else if(event.getSource() == decreaseBPMButton){
            controller.decreaseBPM();
        }
    }
    
}
