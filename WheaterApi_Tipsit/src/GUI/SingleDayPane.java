package GUI;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.xml.bind.JAXBException;

import Forecast.Method_Forecast;
import Historical.Method_Historical;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.Icon;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
public class SingleDayPane extends JPanel implements ActionListener{

	private JComboBox comboBox;
	private Window w;
	private HashMap<String,String> hm;
	private int day;
	
	/**
	 * Create the panel.
	 * @throws JAXBException 
	 */
	public SingleDayPane(Window w, HashMap<String,String> hm2, int day) throws JAXBException {
		this.w=w;
		this.setSize(1000, 600);
		setLayout(new MigLayout("", "[150][300][150][200][200]", "[45][30][20][25][100][25][20][25][25][25][][25][25][25][25][25][]"));
		hm=hm2;
		this.day=day;
		
		JLabel placeLbl = new JLabel(hm.get("city") + ", " + hm.get("region") + ", " + hm.get("country"));
		add(placeLbl, "cell 1 0,alignx center,aligny bottom");
		JLabel dayNameLbl = new JLabel(Method_Forecast.FindDayOfWeek(hm.get("date"), true));
		dayNameLbl.setFont(new Font("Segoe UI", Font.BOLD, 18));
		add(dayNameLbl, "cell 1 1,alignx center,aligny center");
		
		JLabel dayDateLbl = new JLabel(hm.get("date"));
		add(dayDateLbl, "cell 1 2,alignx center,aligny center");
		
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
		
		JLabel iconLabel = new JLabel(icon);
		add(iconLabel, "cell 1 4,alignx center,aligny center");
		
		JLabel lblNewLabel = new JLabel("Select Day Hour");
		add(lblNewLabel, "flowx,cell 3 5,alignx center,aligny center");
		
		JLabel condLbl = new JLabel(hm.get("cond"));
		add(condLbl, "cell 1 6,alignx center,aligny center");
		
		
		JLabel temperatureLbl = new JLabel("MAX: "+hm.get("maxTemp")+" °C | MIN: "+hm.get("minTemp")+" °C | AVG: "+hm.get("avgTemp")+" °C");
		add(temperatureLbl, "flowx,cell 1 7,alignx center,aligny center");
		
		JLabel precipLbl = new JLabel("Precipitation: "+hm.get("precip")+" mm");
		add(precipLbl, "flowx,cell 1 8,alignx center,aligny center");
		
		JLabel avgVisLbl = new JLabel("Visibility: "+hm.get("avgVis")+" km");
		add(avgVisLbl, "flowx,cell 1 9,alignx center,aligny center");
		
		JLabel sun_moon_lbl = new JLabel("Sunrise: "+hm.get("sunrise")+" | Sunset: "+hm.get("sunset")+" | Moonset: "+hm.get("moonset"));
		add(sun_moon_lbl, "cell 1 10,alignx center,aligny center");
		
		JLabel chaRaiLbl = new JLabel("Chance of rain: "+hm.get("chaRai")+"%");
		add(chaRaiLbl, "flowx,cell 1 11,alignx center,aligny center");
		
		JLabel windLbl = new JLabel("Wind Max: "+hm.get("maxWin")+" kmh");
		add(windLbl, "cell 1 12,alignx center,aligny center");
		
		JLabel no2Lbl = new JLabel("No2: "+hm.get("No2"));
		add(no2Lbl, "flowx,cell 1 13,alignx center,aligny center");
		
		JLabel o3Lbl = new JLabel("O3: "+hm.get("O3"));
		add(o3Lbl, "flowx,cell 1 14,alignx center,aligny center");
		
		JLabel pm10Lbl = new JLabel("Pm10: "+hm.get("Pm10"));
		add(pm10Lbl, "flowx,cell 1 15,alignx center,aligny center");
		
		JLabel snowLbl = new JLabel("Snow: "+hm.get("snow")+" cm");
		add(snowLbl, "cell 1 8,alignx center,aligny center");
		
		JLabel humidityLbl = new JLabel("Humidity: "+hm.get("hum")+"%");
		add(humidityLbl, "cell 1 9,alignx center,aligny center");
		
		JLabel coLbl = new JLabel("Co: "+hm.get("Co"));
		add(coLbl, "cell 1 13,alignx center,aligny center");
		
		JLabel so2Lbl = new JLabel("So2: "+hm.get("So2"));
		add(so2Lbl, "cell 1 14,alignx center,aligny center");
		
		JLabel pm25Lbl = new JLabel("Pm25: "+hm.get("Pm25"));
		add(pm25Lbl, "cell 1 15,alignx center,aligny center");
		
		JLabel chaSnoLbl = new JLabel("Chance of snow: "+hm.get("chaSno")+"%");
		add(chaSnoLbl, "cell 1 11,alignx center,aligny center");
		
		comboBox = new JComboBox();
		comboBox.addActionListener(this);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00"}));
		add(comboBox, "cell 3 5,alignx center,aligny center");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 if (e.getSource() == comboBox) {
			 String[] tmp=hm.get("date").split(" ");
			 String tmp2="";
			 switch(comboBox.getSelectedIndex()) {
			 case 0:
				 tmp2="00:00";
				 break;
			 case 1:
				 tmp2="01:00";
				 break;
			 case 2:
				 tmp2="02:00";
				 break;
			 case 3:
				 tmp2="03:00";
				 break;
			 case 4:
				 tmp2="04:00";
				 break;
			 case 5:
				 tmp2="05:00";
				 break;
			 case 6:
				 tmp2="06:00";
				 break;
			 case 7:
				 tmp2="07:00";
				 break;
			 case 8:
				 tmp2="08:00";
				 break;
			 case 9:
				 tmp2="09:00";
				 break;
			 case 10:
				 tmp2="10:00";
				 break;
			 case 11:
				 tmp2="11:00";
				 break;
			 case 12:
				 tmp2="12:00";
				 break;
			 case 13:
				 tmp2="13:00";
				 break;
			 case 14:
				 tmp2="14:00";
				 break;
			 case 15:
				 tmp2="15:00";
				 break;
			 case 16:
				 tmp2="16:00";
				 break;
			 case 17:
				 tmp2="17:00";
				 break;
			 case 18:
				 tmp2="18:00";
				 break;
			 case 19:
				 tmp2="19:00";
				 break;
			 case 20:
				 tmp2="20:00";
				 break;
			 case 21:
				 tmp2="21:00";
				 break;
			 case 22:
				 tmp2="22:00";
				 break;
			 case 23:
				 tmp2="23:00";
				 break;
			 }
			 String date=tmp[0]+" "+tmp2;
			 HoursWindow hw = null;
			try {
				hw = new HoursWindow(Method_Forecast.DayandHour(hm.get("city"), false, date, day),w);
			} catch (JAXBException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 hw.frame.setVisible(true);
		 }
	}
}

