package GUI;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Historical.*;

import java.awt.Label;
import java.util.HashMap;

import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.Icon;
import java.awt.Font;
import javax.swing.JTextPane;
public class HistoryStatsPane extends JPanel {

	/**
	 * Create the panel.
	 */
	public HistoryStatsPane(HashMap<String,String> hm) {
		System.out.println("Pane History Stats Created");
		this.setSize(1000, 600);
		setLayout(new MigLayout("", "[200][225][80][225][200]", "[25][30][20][25][25][25][25][25][25][25][25][25][25][25][25][25][25][25][25]"));
		
		JLabel Stats = new JLabel("Stats");
		Stats.setFont(new Font("Segoe UI", Font.BOLD, 18));
		add(Stats, "cell 2 0,alignx center,aligny center");
		
		JLabel placeLabel = new JLabel(hm.get("city")+", "+hm.get("region")+", "+hm.get("country"));
		add(placeLabel, "cell 2 1,alignx center,aligny center");
		
		JLabel lblNewLabel = new JLabel("Maximum Temperature: ");
		add(lblNewLabel, "cell 1 3,alignx right");
		
		JLabel maxTempLbl = new JLabel(hm.get("maxTemp")+"°C");
		add(maxTempLbl, "cell 3 3");
		
		JLabel lblNewLabel_1 = new JLabel("Minimum Temperature: ");
		add(lblNewLabel_1, "cell 1 4,alignx right");
		
		JLabel minTempLbl = new JLabel(hm.get("minTemp")+"°C");
		add(minTempLbl, "cell 3 4");
		
		JLabel lblNewLabel_1_1 = new JLabel("Average Temperature: ");
		add(lblNewLabel_1_1, "cell 1 5,alignx right");
		
		JLabel avgTempLbl = new JLabel(hm.get("avgTemp")+"°C");
		add(avgTempLbl, "cell 3 5");
		
		JLabel lblNewLabel_2 = new JLabel("Maximum Speed Wind: ");
		add(lblNewLabel_2, "cell 1 6,alignx right");
		
		JLabel maxSpeedWind = new JLabel(hm.get("winSpe")+" km/h");
		add(maxSpeedWind, "cell 3 6");
		
		JLabel lblNewLabel_2_1 = new JLabel("Precipitations: ");
		add(lblNewLabel_2_1, "cell 1 7,alignx right");
		
		JLabel precLbl = new JLabel(hm.get("precip")+" mm");
		add(precLbl, "cell 3 7");
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Average Visibility: ");
		add(lblNewLabel_2_1_2, "cell 1 8,alignx right");
		
		JLabel visLbl = new JLabel(hm.get("avgVis")+" km");
		add(visLbl, "cell 3 8");
		
		JLabel lblNewLabel_3 = new JLabel("Average Humidity: ");
		add(lblNewLabel_3, "cell 1 9,alignx right");
		
		JLabel avgHumLbl = new JLabel(hm.get("avgHum")+"%");
		add(avgHumLbl, "cell 3 9");
		

		ImageIcon imageIcon = new ImageIcon("src/images/sole.png");
		Image image = imageIcon.getImage();
		Image newimg = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
		imageIcon = new ImageIcon(newimg);
	}

}
