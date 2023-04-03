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
	private JButton btnHistory;
	private JButton btnStats;
	private JButton btnHome;
	private ArrayList<JPanel> panels;
	private JMenu mnNewMenu;
	private int messageFlag1;

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
        messageFlag1 = 1;
    }

    private void initialize() {
    	FlatDarkLaf.setup();
    	panels=new ArrayList<JPanel>();
    	panels.add(new HomePane(this));
    	panels.add(new CreditsPane());
    	panels.add(new HistoryPane(this));
    	panels.add(new SingleDayPane(this));
    	panels.add(new SingleDayPane(this));
    	panels.add(new SingleDayPane(this));
    	panels.add(new SingleDayPane(this));
    	panels.add(new SingleDayPane(this));
    	panels.add(new StatsPane());
    	panels.add(new HistoryStatsPane());
    	
        
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
        
        btnHome = new JButton("Home");
        btnHome.setToolTipText("Go to the home page");
        btnHome.setMaximumSize(new Dimension(80, 22));
        btnHome.setMinimumSize(new Dimension(80, 22));
        btnHome.setPreferredSize(new Dimension(84, 22));
        btnHome.setMargin(new Insets(4, 17, 4, 17));
        btnHome.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        btnHome.setHorizontalTextPosition(SwingConstants.CENTER);
        btnHome.setSize(new Dimension(80, 22));
        btnHome.setAlignmentX(CENTER_ALIGNMENT);
        mnNewMenu.add(btnHome);
        btnHome.addActionListener(this);
        
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
        
        btnHistory = new JButton("History");
        btnHistory.setToolTipText("View weather History");
        btnHistory.setPreferredSize(new Dimension(80, 22));
        btnHistory.setMinimumSize(new Dimension(80, 22));
        btnHistory.setMaximumSize(new Dimension(80, 22));
        btnHistory.setSize(new Dimension(80, 22));
        btnHistory.setMargin(new Insets(2, 15, 2, 15));
        btnHistory.addActionListener(this);
        btnHistory.setHorizontalTextPosition(SwingConstants.CENTER);
        btnHistory.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        btnHistory.setAlignmentX(0.5f);
        mnNewMenu.add(btnHistory);
        
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
		mnNewMenu.setPopupMenuVisible(true);
		mnNewMenu.setPopupMenuVisible(false);
		mnNewMenu.setPopupMenuVisible(true);
		mnNewMenu.setPopupMenuVisible(false);
		
		if(e.getSource()==exitBtn) {
			System.exit(EXIT_ON_CLOSE);
		}else if(e.getSource()==btnCredits) {
			System.out.println("Credits");
//			frame.getContentPane().hide();
			frame.setContentPane(panels.get(1));
		}else if(e.getSource()==btnHome) {
			System.out.println("Home");
//			frame.getContentPane().hide();
			frame.setContentPane(panels.get(0));
		}else if(e.getSource()==btnHistory) {
			System.out.println("History");
//			frame.getContentPane().hide();
			frame.setContentPane(panels.get(2));
		}else if(e.getSource()==btnStats) {
			System.out.println("Stats");
//			frame.getContentPane().hide();
			// Controlli relativi al pannello che c'è in quel momento
			if(messageFlag1>0) JOptionPane.showMessageDialog(this, "When you enter the statistics, the statistics relating to the screen you are viewing will open, for this reason you can only use the statistics button on the \"Home\" and \"History\" screens");
			messageFlag1=-1;
			if(frame.getContentPane()==panels.get(0)||frame.getContentPane()==panels.get(2)) {
				if(frame.getContentPane()==panels.get(0)) frame.setContentPane(panels.get(8));
				if(frame.getContentPane()==panels.get(2)) frame.setContentPane(panels.get(9));
				// Se il frame in cui siamo è storico allora metto le statische storiche altrimenti quelle normali
			}else {
				JOptionPane.showMessageDialog(this,"To be able to open the statistics you must be in one of the two \"Home\" or \"History\" screens");
			}	
		}else if(e.getSource()==((HistoryPane) panels.get(2)).getSeeMore(1)) {
			System.out.println("Giorno 1");
//			frame.getContentPane().hide();
			frame.setContentPane(panels.get(3));
		}else if(e.getSource()==((HistoryPane) panels.get(2)).getSeeMore(2)) {
			System.out.println("Giorno 2");
//			frame.getContentPane().hide();
			frame.setContentPane(panels.get(4));
		}else if(e.getSource()==((HistoryPane) panels.get(2)).getSeeMore(3)) {
			System.out.println("Giorno 3");
//			frame.getContentPane().hide();
			frame.setContentPane(panels.get(5));
		}else if(e.getSource()==((HistoryPane) panels.get(2)).getSeeMore(4)) {
			System.out.println("Giorno 4");
//			frame.getContentPane().hide();
			frame.setContentPane(panels.get(6));
		}else if(e.getSource()==((HistoryPane) panels.get(2)).getSeeMore(5)) {
			System.out.println("Giorno 5");
//			frame.getContentPane().hide();
			frame.setContentPane(panels.get(7));
		}else if(e.getSource()==((HomePane) panels.get(0)).getSeeMore(1)) {
			System.out.println("Giorno 1");
//			frame.getContentPane().hide();
			frame.setContentPane(panels.get(3));
		}else if(e.getSource()==((HomePane) panels.get(0)).getSeeMore(2)) {
			System.out.println("Giorno 2");
//			frame.getContentPane().hide();
			frame.setContentPane(panels.get(4));
		}else if(e.getSource()==((HomePane) panels.get(0)).getSeeMore(3)) {
			System.out.println("Giorno 3");
//			frame.getContentPane().hide();
			frame.setContentPane(panels.get(5));
		}else if(e.getSource()==((HomePane) panels.get(0)).getSeeMore(4)) {
			System.out.println("Giorno 4");
//			frame.getContentPane().hide();
			frame.setContentPane(panels.get(6));
		}else if(e.getSource()==((HomePane) panels.get(0)).getSeeMore(5)) {
			System.out.println("Giorno 5");
//			frame.getContentPane().hide();
			frame.setContentPane(panels.get(7));
		}
	}
	
	public void hide() {
		System.out.println("Dentro");
		frame.hide();
	}
	
	public void show() {
		System.out.println("Dentro");
		frame.show();
	}
}

