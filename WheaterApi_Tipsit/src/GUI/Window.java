package GUI;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.AbstractBorder;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import java.awt.Label;
import java.awt.Dimension;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;

import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;

public class Window extends JFrame implements ActionListener, WindowListener{

    private JFrame frame;
    private JTextField txtInsertCity;
	private JButton exitBtn;
	private JButton btnCredits;
	private JButton historicalBtn;
	private JButton btnStats;
	private JButton homeBtn;
	private ArrayList<JPanel> panels;
	private JMenu mnNewMenu;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Window window = new Window();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Window() {
        initialize();
    }

    private void initialize() {
    	FlatDarkLaf.setup();
    	panels=new ArrayList<JPanel>();
    	panels.add(new HistoryPane());
    	panels.add(new CreditsPane());
    	panels.add(new HistoryPane());
    	
        
        frame = new JFrame();
        frame.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        frame.setBounds(200, 200, 1000, 600);
        frame.setResizable(false);
        frame.setTitle("JavaWheather | Biasuzzi & Parovel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setContentPane(panels.get(0));
        
        JMenuBar menuBar = new JMenuBar();
        menuBar.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        frame.setJMenuBar(menuBar);
        
        mnNewMenu = new JMenu("Menu");
        mnNewMenu.setToolTipText("Wheather Menu");
        mnNewMenu.setMinimumSize(new Dimension(11, 11));
        mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
        mnNewMenu.setHorizontalTextPosition(SwingConstants.CENTER);
        menuBar.add(mnNewMenu);
        
        homeBtn = new JButton("Home");
        homeBtn.setToolTipText("Go to the home page");
        homeBtn.setMaximumSize(new Dimension(80, 22));
        homeBtn.setMinimumSize(new Dimension(80, 22));
        homeBtn.setPreferredSize(new Dimension(84, 22));
        homeBtn.setMargin(new Insets(4, 17, 4, 17));
        homeBtn.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        homeBtn.setHorizontalTextPosition(SwingConstants.CENTER);
        homeBtn.setSize(new Dimension(80, 22));
        homeBtn.setAlignmentX(CENTER_ALIGNMENT);
        mnNewMenu.add(homeBtn);
        homeBtn.addActionListener(this);
        
        Component verticalStrut = Box.createVerticalStrut(20);
        verticalStrut.setPreferredSize(new Dimension(0, 2));
        mnNewMenu.add(verticalStrut);        
        
        btnStats = new JButton("Stats");
        btnStats.setToolTipText("View weather Stats");
        btnStats.setMinimumSize(new Dimension(80, 22));
        btnStats.setMaximumSize(new Dimension(80, 22));
        btnStats.setPreferredSize(new Dimension(80, 22));
        btnStats.setBounds(new Rectangle(72, 22, 0, 0));
        btnStats.setSize(new Dimension(80, 22));
        btnStats.setMargin(new Insets(2, 15, 2, 15));
        btnStats.setHorizontalTextPosition(SwingConstants.CENTER);
        btnStats.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        btnStats.setAlignmentX(0.5f);
        btnStats.addActionListener(this);
        mnNewMenu.add(btnStats);
        
        Component verticalStrut_3 = Box.createVerticalStrut(20);
        verticalStrut_3.setPreferredSize(new Dimension(0, 2));
        mnNewMenu.add(verticalStrut_3);
        
        historicalBtn = new JButton("History");
        historicalBtn.setToolTipText("View weather History");
        historicalBtn.setPreferredSize(new Dimension(80, 22));
        historicalBtn.setMinimumSize(new Dimension(80, 22));
        historicalBtn.setMaximumSize(new Dimension(80, 22));
        historicalBtn.setSize(new Dimension(80, 22));
        historicalBtn.setMargin(new Insets(2, 15, 2, 15));
        historicalBtn.addActionListener(this);
        historicalBtn.setHorizontalTextPosition(SwingConstants.CENTER);
        historicalBtn.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        historicalBtn.setAlignmentX(0.5f);
        mnNewMenu.add(historicalBtn);
        
        Component verticalStrut_3_1 = Box.createVerticalStrut(20);
        verticalStrut_3_1.setPreferredSize(new Dimension(0, 2));
        mnNewMenu.add(verticalStrut_3_1);
        
        btnCredits = new JButton("Credits");
        btnCredits.setToolTipText("View Credits");
        btnCredits.setMinimumSize(new Dimension(80, 22));
        btnCredits.setMaximumSize(new Dimension(80, 22));
        btnCredits.setSize(new Dimension(80, 22));
        btnCredits.setMargin(new Insets(2, 15, 2, 15));
        btnCredits.setHorizontalTextPosition(SwingConstants.CENTER);
        btnCredits.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        btnCredits.setAlignmentX(0.5f);
        btnCredits.addActionListener(this);
        mnNewMenu.add(btnCredits);
        
        Component verticalStrut_1 = Box.createVerticalStrut(20);
        verticalStrut_1.setPreferredSize(new Dimension(0, 2));
        mnNewMenu.add(verticalStrut_1);
        
        exitBtn = new JButton("Exit");
        exitBtn.setToolTipText("Quit the application");
        exitBtn.setMaximumSize(new Dimension(80, 22));
        exitBtn.setMinimumSize(new Dimension(80, 22));
        exitBtn.setPreferredSize(new Dimension(80, 22));
        exitBtn.setSize(new Dimension(80, 22));
        exitBtn.setMargin(new Insets(2, 15, 2, 15));
        exitBtn.setHorizontalTextPosition(SwingConstants.CENTER);
        exitBtn.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        exitBtn.setAlignmentX(0.5f);
        exitBtn.addActionListener(this);
        mnNewMenu.add(exitBtn);
        
        Component horizontalStrut = Box.createHorizontalStrut(20);
        horizontalStrut.setMaximumSize(new Dimension(30, 32767));
        horizontalStrut.setPreferredSize(new Dimension(30, 0));
        horizontalStrut.setMinimumSize(new Dimension(30, 0));
        menuBar.add(horizontalStrut);

        ImageIcon imageIcon = new ImageIcon("src/images/2search.png");
		Image image = imageIcon.getImage();
		Image newimg = image.getScaledInstance(15, 15, java.awt.Image.SCALE_SMOOTH);
		imageIcon = new ImageIcon(newimg);
		
		txtInsertCity = new JTextField();
		txtInsertCity.setOpaque(true);
		txtInsertCity.setMinimumSize(new Dimension(120, 22));
		txtInsertCity.setHorizontalAlignment(SwingConstants.CENTER);
		txtInsertCity.setToolTipText("Insert Location");
		txtInsertCity.setSize(new Dimension(7, 40));
		txtInsertCity.setPreferredSize(new Dimension(40, 20));
		txtInsertCity.setMaximumSize(new Dimension(120, 22));
		menuBar.add(txtInsertCity);
		txtInsertCity.setColumns(20);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setMaximumSize(new Dimension(10, 32767));
		menuBar.add(horizontalStrut_1);
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.setToolTipText("Search the Location");
		btnNewButton_1.setMaximumSize(new Dimension(65, 22));
		menuBar.add(btnNewButton_1);
//		btnNewButton_1.setPreferredSize(new Dimension(imageIcon.getIconWidth(), imageIcon.getIconHeight()));
    }

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		mnNewMenu.setPopupMenuVisible(false);
		mnNewMenu.setPopupMenuVisible(true);
		if(e.getSource()==exitBtn) {
			System.exit(EXIT_ON_CLOSE);
		}else if(e.getSource()==btnCredits) {
			System.out.println("Credits");
//			frame.getContentPane().hide();
			frame.setContentPane(panels.get(1));
		}else if(e.getSource()==homeBtn) {
			System.out.println("Home");
//			frame.getContentPane().hide();
			frame.setContentPane(panels.get(0));
		}else if(e.getSource()==historicalBtn) {
			System.out.println("History");
//			frame.getContentPane().hide();
			frame.setContentPane(panels.get(2));
		}
	}
}
