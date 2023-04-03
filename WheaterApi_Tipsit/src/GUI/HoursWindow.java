package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JTextPane;
import javax.swing.JWindow;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HoursWindow extends JWindow implements WindowListener {

	JFrame frame;
	Window w;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					HoursWindow window = new HoursWindow();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public HoursWindow(int i, Window w) {
		super();
		this.w=w;
		initialize(i);
		addWindowListener(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int hour) {
		w.hide();
		FlatDarkLaf.setup();
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[125][250,grow][125]", "[][][][][][][][][][][][][][][][grow][]"));
		
		JLabel placeLbl = new JLabel("Trevito, Veneto, Italy");
		placeLbl.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		frame.getContentPane().add(placeLbl, "cell 1 0,alignx center,aligny center");
		
		JLabel dayNameLbl = new JLabel("Lunedì");
		dayNameLbl.setFont(new Font("Segoe UI", Font.BOLD, 18));
		frame.getContentPane().add(dayNameLbl, "cell 1 1,alignx center,aligny center");
		
		JLabel dayDateLbl = new JLabel("19th March");
		dayDateLbl.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		frame.getContentPane().add(dayDateLbl, "cell 1 2,alignx center,aligny center");
		
		JLabel hourLbl = new JLabel(""+hour);
		hourLbl.setFont(new Font("Segoe UI", Font.BOLD, 18));
		frame.getContentPane().add(hourLbl, "cell 1 4,alignx center,aligny center");
		
		JLabel conditionLbl = new JLabel("Condition: XXXXX");
		conditionLbl.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		frame.getContentPane().add(conditionLbl, "cell 1 6,alignx center,aligny center");
		
		JLabel feelTempLbl = new JLabel("Feel Temperature: 17°C");
		feelTempLbl.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		frame.getContentPane().add(feelTempLbl, "cell 1 7,alignx center,aligny center");
		
		JLabel tempLbl = new JLabel("Temperature: 18°C");
		tempLbl.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		frame.getContentPane().add(tempLbl, "cell 1 8,alignx center,aligny center");
		
		JLabel windSpeedLbl = new JLabel("Wind Speed: 12 kmh");
		windSpeedLbl.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		frame.getContentPane().add(windSpeedLbl, "cell 1 9,alignx center,aligny center");
		
		JLabel windDirectionLbl = new JLabel("Wind Direction:  EAST");
		windDirectionLbl.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		frame.getContentPane().add(windDirectionLbl, "cell 1 10,alignx center,aligny center");
		
		JLabel lblRainMm = new JLabel("Rain MM: 12 mm");
		lblRainMm.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		frame.getContentPane().add(lblRainMm, "cell 1 11,alignx center,aligny center");
		
		JLabel humidityLbl = new JLabel("Humidity %:");
		humidityLbl.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		frame.getContentPane().add(humidityLbl, "cell 1 12,alignx center,aligny center");
		
		JLabel cloudsLbl = new JLabel("Clouds: XXXX");
		cloudsLbl.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		frame.getContentPane().add(cloudsLbl, "cell 1 13,alignx center,aligny center");
		
		JTextPane airQuality = new JTextPane();
		airQuality.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		airQuality.setText("CO: 23\r\nNO2: 56\r\nPM10: 46\r\nPM25: 89\r\nSO2: 121");
		airQuality.setEditable(false);
		frame.getContentPane().add(airQuality, "cell 1 15,alignx center,aligny top");
		
		JButton exitBtn = new JButton("Exit");
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w.show();
				frame.dispose();
			}
		});
		frame.getContentPane().add(exitBtn, "cell 1 16,alignx center,aligny center");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		w.hide();
		System.out.println("Hide");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		w.show();
		System.out.println("Show");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		w.show();
		System.out.println("Show");
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
		w.hide();
		System.out.println("Hide");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		w.show();
		System.out.println("Show");
	}

}
