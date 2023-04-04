package GUI;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Forecast.Method_Forecast;
import Historical.Method_Historical;

import java.awt.Label;
import java.util.HashMap;

import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.Icon;
import java.awt.Font;
import javax.swing.JTextPane;
public class StatsPane extends JPanel {

	/**
	 * Create the panel.
	 */
	public StatsPane(HashMap<String,String> hm) {
		System.out.println("Pane Stats Created");
		this.setSize(1000, 600);
		setLayout(new MigLayout("", "[200][225][80][225][200]", "[25][30][20][25][25][25][25][25][25][25][25][25][25][25][25][25][25][25][25]"));
		
		JLabel Stats = new JLabel("Stats");
		Stats.setFont(new Font("Segoe UI", Font.BOLD, 18));
		add(Stats, "cell 2 0,alignx center,aligny center");
		
		JLabel placeLabel = new JLabel(hm.get("city")+", "+hm.get("region")+", "+hm.get("country"));
		add(placeLabel, "cell 2 1,alignx center,aligny center");
		
		JLabel lblNewLabel = new JLabel("Maximum Temperature:");
		add(lblNewLabel, "cell 1 3,alignx right");
		
		JLabel maxTempLbl = new JLabel(hm.get("maxTemp")+"°C");
		add(maxTempLbl, "cell 3 3");
		
		JLabel lblNewLabel_1 = new JLabel("Minimum Temperature: ");
		add(lblNewLabel_1, "cell 1 4,alignx right");
		
		JLabel minTempLbl = new JLabel(hm.get("minTemp")+"°C");
		add(minTempLbl, "cell 3 4");
		
		JLabel lblNewLabel_1_1 = new JLabel("Average Temperature:");
		add(lblNewLabel_1_1, "cell 1 5,alignx right");
		
		JLabel avgTempLbl = new JLabel(hm.get("avgTemp")+"°C");
		add(avgTempLbl, "cell 3 5");
		
		JLabel lblNewLabel_2 = new JLabel("Maximum Speed Wind:");
		add(lblNewLabel_2, "cell 1 6,alignx right");
		
		JLabel maxSpeedWind = new JLabel(hm.get("maxSpeWin")+" km/h");
		add(maxSpeedWind, "cell 3 6");
		
		JLabel lblNewLabel_2_1 = new JLabel("Precipitations: ");
		add(lblNewLabel_2_1, "cell 1 7,alignx right");
		
		JLabel precLbl = new JLabel(hm.get("precip")+" mm");
		add(precLbl, "cell 3 7");
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Snow:");
		add(lblNewLabel_2_1_1, "cell 1 8,alignx right");
		
		JLabel snowLbl = new JLabel(hm.get("snow")+" cm");
		add(snowLbl, "cell 3 8");
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Visibility:");
		add(lblNewLabel_2_1_2, "cell 1 9,alignx right");
		
		JLabel visLbl = new JLabel(hm.get("vis")+" km");
		add(visLbl, "cell 3 9");
		
		JLabel lblNewLabel_3 = new JLabel("Average Humidity:");
		add(lblNewLabel_3, "cell 1 10,alignx right");
		
		JLabel avgHumLbl = new JLabel(hm.get("avgHum")+"%");
		add(avgHumLbl, "cell 3 10");
		
		JLabel lblNewLabel_3_1 = new JLabel("Chanche of Rain:");
		add(lblNewLabel_3_1, "cell 1 11,alignx right");
		
		JLabel chaRaiLbl = new JLabel(hm.get("chaRai")+"%");
		add(chaRaiLbl, "cell 3 11");
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Chanche of Snow:");
		add(lblNewLabel_3_1_1, "cell 1 12,alignx right");
		
		JLabel ChaSnoLbl = new JLabel(hm.get("chaSno")+"%");
		add(ChaSnoLbl, "cell 3 12");
		
		JLabel lblNewLabel_4 = new JLabel("Co:");
		add(lblNewLabel_4, "cell 1 13,alignx right");
		
		JLabel coLbl = new JLabel(hm.get("Co"));
		add(coLbl, "cell 3 13");
		
		JLabel lblNewLabel_5 = new JLabel("No2:");
		add(lblNewLabel_5, "cell 1 14,alignx right");
		
		JLabel no2Lbl = new JLabel(hm.get("No2"));
		add(no2Lbl, "cell 3 14");
		
		JLabel lblNewLabel_6 = new JLabel("O3:");
		add(lblNewLabel_6, "cell 1 15,alignx right");
		
		JLabel o3Lbl = new JLabel(hm.get("O3"));
		add(o3Lbl, "cell 3 15");
		
		JLabel lblNewLabel_7 = new JLabel("Pm10:");
		add(lblNewLabel_7, "cell 1 16,alignx right");
		
		JLabel pm10Lbl = new JLabel(hm.get("Pm10"));
		add(pm10Lbl, "cell 3 16");
		
		JLabel lblNewLabel_8 = new JLabel("Pm25:");
		add(lblNewLabel_8, "cell 1 17,alignx right");
		
		JLabel pm25Lbl = new JLabel(hm.get("Pm25"));
		add(pm25Lbl, "cell 3 17");
		
		JLabel lblNewLabel_9 = new JLabel("So2");
		add(lblNewLabel_9, "cell 1 18,alignx right");
		
		JLabel so2Lbl = new JLabel(hm.get("So2"));
		add(so2Lbl, "cell 3 18");
		

		ImageIcon imageIcon = new ImageIcon("src/images/sole.png");
		Image image = imageIcon.getImage();
		Image newimg = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
		imageIcon = new ImageIcon(newimg);
	}

}
