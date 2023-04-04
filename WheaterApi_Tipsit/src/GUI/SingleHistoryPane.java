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
import java.util.HashMap;

import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.Icon;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
public class SingleHistoryPane extends JPanel implements ActionListener{

	private JComboBox comboBox;
	private Window w;
	private HashMap<String,String> hm;
	private Method_Forecast forecast;

	/**
	 * Create the panel.
	 * @throws JAXBException 
	 */
	public SingleHistoryPane(Window w, Method_Forecast m_forecast,HashMap<String,String> hm2, int day) throws JAXBException {
		this.w=w;
		forecast=m_forecast;
		String s = hm2.get("date" + day);
		System.out.println("Pane History Single day Created ["+s+"]");
		hm=m_forecast.Day("Treviso", false, s);
		this.setSize(1000, 600);
		setLayout(new MigLayout("", "[150][300][150][200][200]", "[80][30][20][25][100][25][20][25][25][25][25][25][25][25][25][]"));
		
		JLabel placeLbl = new JLabel(hm.get("city") + ", " + hm.get("region") + ", " + hm.get("country"));
		add(placeLbl, "cell 1 0,alignx center,aligny bottom");
		
		JLabel dayNameLbl = new JLabel(m_forecast.FindDayOfWeek(s, true));
		dayNameLbl.setFont(new Font("Segoe UI", Font.BOLD, 18));
		add(dayNameLbl, "cell 1 1,alignx center,aligny center");
		
		JLabel dayDateLbl = new JLabel(hm.get("date"));
		add(dayDateLbl, "cell 1 2,alignx center,aligny center");
		
		ImageIcon imageIcon = new ImageIcon("src/images/sunny.png");
		Image image = imageIcon.getImage();
		Image newimg = image.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
		imageIcon = new ImageIcon(newimg);
		JLabel iconLabel = new JLabel(imageIcon);
		add(iconLabel, "cell 1 4,alignx center,aligny center");
		
		JLabel lblNewLabel = new JLabel("Select Day Hour");
		add(lblNewLabel, "flowx,cell 3 4,alignx center,aligny center");
		
		JLabel condLbl = new JLabel(hm.get("cond"));
		add(condLbl, "cell 1 6,alignx center,aligny center");
		
		
		JLabel temperatureLbl = new JLabel("MAX: "+hm.get("maxTemp")+" °C | MIN: "+hm.get("minTemp")+" °C | AVG: "+hm.get("avgTemp")+" °C");
		add(temperatureLbl, "flowx,cell 1 7,alignx center,aligny center");
		
		JLabel precipLbl = new JLabel("Precipitation: "+hm.get("precip")+" mm");
		add(precipLbl, "flowx,cell 1 8,alignx center,aligny center");
		
		JLabel avgVisLbl = new JLabel("Visibility: "+hm.get("avgVis")+" km");
		add(avgVisLbl, "flowx,cell 1 9,alignx center,aligny center");
		
		JLabel chaRaiLbl = new JLabel("Chance of rain: "+hm.get("chaRai")+"%");
		add(chaRaiLbl, "flowx,cell 1 10,alignx center,aligny center");
		
		JLabel windLbl = new JLabel("Wind Max: "+hm.get("maxWin")+" kmh");
		add(windLbl, "cell 1 11,alignx center,aligny center");
		
		JLabel snowLbl = new JLabel("Snow: "+hm.get("snow")+" cm");
		add(snowLbl, "cell 1 8,alignx center,aligny center");
		
		JLabel humidityLbl = new JLabel("Humidity: "+hm.get("hum")+"%");
		add(humidityLbl, "cell 1 9,alignx center,aligny center");
		
		JLabel chaSnoLbl = new JLabel("Chance of snow: "+hm.get("chaSno")+"%");
		add(chaSnoLbl, "cell 1 10,alignx center,aligny center");
		
		comboBox = new JComboBox();
		comboBox.addActionListener(this);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00"}));
		add(comboBox, "cell 3 4,alignx center");

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
				hw = new HoursWindow(forecast.DayandHour(hm.get("city"), false, date),w);
			} catch (JAXBException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 hw.frame.setVisible(true);
		 }
	}
}

