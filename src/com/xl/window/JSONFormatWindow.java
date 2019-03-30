package com.xl.window;

import java.awt.Dimension;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.xl.util.JsonFormat;

public class JSONFormatWindow extends JFrame{

	JTextArea editArea;
	JButton button;
	JScrollPane scrollPane;
	
	public JSONFormatWindow(){
		int screen_w,screen_h;
		Toolkit toolkit= Toolkit.getDefaultToolkit();
		screen_w= (int) toolkit.getScreenSize().getWidth();
		screen_h = (int) toolkit.getScreenSize().getHeight();
		JPanel mainJPanel= new JPanel();
		setContentPane(mainJPanel);
		setLayout(new BoxLayout(mainJPanel, BoxLayout.Y_AXIS));
		Box box_v= Box.createVerticalBox();
		getContentPane().add(box_v);
		mainJPanel.setSize(640, 480);
		//
		 editArea= new JTextArea();
		 editArea.setColumns(20);
		 editArea.setRows(10);
		 scrollPane= new JScrollPane(editArea);
		 //scrollPane.add(editArea);
		 
		 button= new JButton("开始转换");
		box_v.add(scrollPane);
		box_v.add(button);
		//设置对齐方式 不然会出问题
		button.setAlignmentX((float) 0.5);
		mainJPanel.add(box_v);
		//设置最大宽高 用于适应布局
		button.setMaximumSize(new Dimension(screen_w,20));
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String textString=JsonFormat.formatJson( editArea.getText().toString());
				editArea.setText(textString);
			}
		});
		setSize(new Dimension(640, 480));
		setTitle("json格式化 - 风的影子 - 2019.3.26");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setVisible(true);
	}
}
