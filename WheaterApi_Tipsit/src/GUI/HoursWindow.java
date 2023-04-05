package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;

import Forecast.Method_Forecast;
import Historical.Method_Historical;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import javax.swing.JTextPane;
import javax.swing.JWindow;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
	public HoursWindow(HashMap<String,String> hm, Window w) {
		super();
		this.w=w;
		initialize(hm);
		addWindowListener(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(HashMap<String,String> hm) {
		System.out.println("Window HoursWindow Created");
		w.hide();
		if(w.isDarkThemeActive()) FlatDarkLaf.setup(); else FlatLightLaf.setup();
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[125][250,grow][125]", "[][][][][][][][][][][][][][][1][50][80][]"));
		
		
		JLabel placeLbl = new JLabel(hm.get("city")+", "+hm.get("region")+", "+hm.get("country"));
		placeLbl.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		frame.getContentPane().add(placeLbl, "cell 1 0,alignx center,aligny center");
		
		JLabel dayNameLbl = new JLabel(Method_Forecast.FindDayOfWeek(hm.get("date"), true));
		dayNameLbl.setFont(new Font("Segoe UI", Font.BOLD, 18));
		frame.getContentPane().add(dayNameLbl, "cell 1 1,alignx center,aligny center");
		
		String[] date=hm.get("date").split(" ");
		
		JLabel dayDateLbl = new JLabel(date[0]);
		dayDateLbl.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		frame.getContentPane().add(dayDateLbl, "cell 1 2,alignx center,aligny center");
		
		JLabel hourLbl = new JLabel(date[1]);
		hourLbl.setFont(new Font("Segoe UI", Font.BOLD, 18));
		frame.getContentPane().add(hourLbl, "cell 1 4,alignx center,aligny center");
		
		JLabel conditionLbl = new JLabel("Condition: "+hm.get("cond"));
		conditionLbl.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		frame.getContentPane().add(conditionLbl, "cell 1 6,alignx center,aligny center");
		
		JLabel feelTempLbl = new JLabel("Feel Temperature: "+hm.get("feeTemp"));
		feelTempLbl.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		frame.getContentPane().add(feelTempLbl, "cell 1 7,alignx center,aligny center");
		
		JLabel tempLbl = new JLabel("Temperature: "+hm.get("temp"));
		tempLbl.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		frame.getContentPane().add(tempLbl, "cell 1 8,alignx center,aligny center");
		
		JLabel windSpeedLbl = new JLabel("Wind Speed: "+hm.get("winSpe")+" kmh");
		windSpeedLbl.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		frame.getContentPane().add(windSpeedLbl, "cell 1 9,alignx center,aligny center");
		
		JLabel windDirectionLbl = new JLabel("Wind Direction:  "+hm.get("winDir"));
		windDirectionLbl.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		frame.getContentPane().add(windDirectionLbl, "cell 1 10,alignx center,aligny center");
		
		JLabel lblRainMm = new JLabel("Rain MM: "+hm.get("precip")+"mm");
		lblRainMm.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		frame.getContentPane().add(lblRainMm, "cell 1 11,alignx center,aligny center");
		
		JLabel humidityLbl = new JLabel("Humidity: "+hm.get("hum")+"%");
		humidityLbl.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		frame.getContentPane().add(humidityLbl, "cell 1 12,alignx center,aligny center");
		
		JLabel cloudsLbl = new JLabel("Clouds: "+hm.get("cloud"));
		cloudsLbl.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		frame.getContentPane().add(cloudsLbl, "cell 1 13,alignx center,aligny center");
		
		JTextPane airQuality = new JTextPane();
		airQuality.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		airQuality.setText("CO: "+hm.get("Co")+"\r\n"
				+ "NO2: "+hm.get("No2")+"\r\n"
				+ "O3: "+hm.get("O3")+"\r\n"
				+ "PM10: "+hm.get("Pm10")+"\r\n"
				+ "PM25: "+hm.get("Pm25")+"\r\n"
				+ "SO2: "+hm.get("So2")+"");
		airQuality.setEditable(false);
		frame.getContentPane().add(airQuality, "cell 1 15,alignx center,aligny top");
		
		JButton exitBtn = new JButton("Exit");
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w.show();
				frame.dispose();
			}
		});
		
		URL url=null;
		try {
			url = new URL("http:"+hm.get("icon"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedImage bf=null;
		try {
			bf = ImageIO.read(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
        ImageIcon icon = new ImageIcon(bf);

        Image image = icon.getImage();
		Image newimg = image.getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(newimg);
		
		JLabel iconLbl = new JLabel(icon);
		frame.getContentPane().add(iconLbl, "cell 1 16,alignx center,aligny center");
		frame.getContentPane().add(exitBtn, "cell 1 17,alignx center,aligny center");
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
