package GUI;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Forecast.Method_Forecast;
import Historical.Method_Historical;

import java.awt.Label;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;

import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.net.*;
public class HomePane extends JPanel {

	private JButton seeMore1;
	private JButton seeMore2;
	private JButton seeMore3;
	private JButton seeMore4;
	private JButton seeMore5;

	/**
	 * Create the panel.
	 */
	public HomePane(Window window,HashMap<String, String> hm) {
		System.out.println("Pane Home Created");
		this.setSize(1000, 600);
		setLayout(new MigLayout("", "[15:15:15][140,grow][50][140][50][140,grow][50][140,grow][50][140,grow][25:25:25]", "[25][30][40][50][15][25][][][100][160][]"));

		// JLabel placeLabel = new JLabel("Treviso, Veneto, Italy");
		JLabel placeLabel = new JLabel(hm.get("city") + ", " + hm.get("region") + ", " + hm.get("country"));

		add(placeLabel, "cell 5 0,alignx center,aligny center");

		JLabel label_day1 = new JLabel(Method_Forecast.FindDayOfWeek(hm.get("date" + 0), true));
		label_day1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		label_day1.setHorizontalTextPosition(SwingConstants.CENTER);
		label_day1.setHorizontalAlignment(SwingConstants.CENTER);
		add(label_day1, "cell 1 1,alignx center,aligny center");

		JLabel label_day2 = new JLabel(Method_Forecast.FindDayOfWeek(hm.get("date" + 1), true));
		label_day2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		label_day2.setHorizontalTextPosition(SwingConstants.CENTER);
		label_day2.setHorizontalAlignment(SwingConstants.CENTER);
		add(label_day2, "cell 3 1,alignx center,aligny center");

		JLabel label_day3 = new JLabel(Method_Forecast.FindDayOfWeek(hm.get("date" + 2), true));
		label_day3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		label_day3.setHorizontalAlignment(SwingConstants.CENTER);
		label_day3.setHorizontalTextPosition(SwingConstants.CENTER);
		add(label_day3, "cell 5 1,alignx center,aligny center");

		JLabel label_day4 = new JLabel(Method_Forecast.FindDayOfWeek(hm.get("date" + 3), true));
		label_day4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		label_day4.setHorizontalTextPosition(SwingConstants.CENTER);
		label_day4.setHorizontalAlignment(SwingConstants.CENTER);
		add(label_day4, "cell 7 1,alignx center,aligny center");

		URL url=null;
		try {
			url = new URL("http://cdn.weatherapi.com/weather/64x64/day/113.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedImage c=null;
		try {
			c = ImageIO.read(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ImageIcon sunny = new ImageIcon("src/images/sunny.png");
		ImageIcon sunny = new ImageIcon(c);
		ImageIcon snowing = new ImageIcon("src/images/snowing.png");
		ImageIcon raining = new ImageIcon("src/images/raining.png");
		ImageIcon partlySnowing = new ImageIcon("src/images/partlySnowy.png");
		ImageIcon partlyCloudy = new ImageIcon("src/images/partlyCloudy.png");
		ImageIcon cloudy = new ImageIcon("src/images/cloudy.png");
		
		Image image = sunny.getImage();
		Image newimg = image.getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH);
		sunny = new ImageIcon(newimg);
		
		image = snowing.getImage();
		newimg = image.getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH);
		snowing = new ImageIcon(newimg);
		
		image = raining.getImage();
		newimg = image.getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH);
		raining = new ImageIcon(newimg);
		
		image = partlySnowing.getImage();
		newimg = image.getScaledInstance(84, 80, java.awt.Image.SCALE_SMOOTH);
		partlySnowing = new ImageIcon(newimg);
		
		image = partlyCloudy.getImage();
		newimg = image.getScaledInstance(80, 60, java.awt.Image.SCALE_SMOOTH);
		partlyCloudy = new ImageIcon(newimg);
		
		image = cloudy.getImage();
		newimg = image.getScaledInstance(80, 60, java.awt.Image.SCALE_SMOOTH);
		cloudy = new ImageIcon(newimg);

		JLabel label_day5 = new JLabel(Method_Forecast.FindDayOfWeek(hm.get("date" + 4), true));
		label_day5.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		label_day5.setHorizontalAlignment(SwingConstants.CENTER);
		label_day5.setHorizontalTextPosition(SwingConstants.CENTER);
		add(label_day5, "cell 9 1,alignx center,aligny center");

		JLabel day1day = new JLabel(hm.get("date"+0));
		add(day1day, "cell 1 2,alignx center,aligny top");

		JLabel day2day = new JLabel(hm.get("date"+1));
		add(day2day, "cell 3 2,alignx center,aligny top");

		JLabel day3day = new JLabel(hm.get("date"+2));
		add(day3day, "cell 5 2,alignx center,aligny top");

		JLabel day4day = new JLabel(hm.get("date"+3));
		add(day4day, "cell 7 2,alignx center,aligny top");

		JLabel day5day = new JLabel(hm.get("date"+4));
		add(day5day, "cell 9 2,alignx center,aligny top");

		JLabel iconLabel_day1 = new JLabel(sunny);
//		iconLabel.setMinimumSize(new Dimension(200, 200));
//		iconLabel.setMaximumSize(new Dimension(200, 200));
		add(iconLabel_day1, "cell 1 3,alignx center,aligny center");

		JLabel iconLabel_day2 = new JLabel(cloudy);
		add(iconLabel_day2, "cell 3 3,alignx center,aligny center");

		JLabel iconLabel_day3 = new JLabel(snowing);
		add(iconLabel_day3, "cell 5 3,alignx center,aligny center");

		JLabel iconLabel_day4 = new JLabel(partlyCloudy);
		add(iconLabel_day4, "cell 7 3,alignx center,aligny center");

		JLabel iconLabel_day5 = new JLabel(raining);
		add(iconLabel_day5, "cell 9 3,alignx center,aligny center");

		JLabel labelWh_day1 = new JLabel(hm.get("cond"+0));
		labelWh_day1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		add(labelWh_day1, "cell 1 5,alignx center,aligny center");

		JLabel labelWh_day2 = new JLabel(hm.get("cond"+1));
		labelWh_day2.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		add(labelWh_day2, "cell 3 5,alignx center,aligny center");

		JLabel labelWh_day3 = new JLabel(hm.get("cond"+2));
		labelWh_day3.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		add(labelWh_day3, "cell 5 5,alignx center,aligny center");

		JLabel labelWh_day4 = new JLabel(hm.get("cond"+3));
		labelWh_day4.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		add(labelWh_day4, "cell 7 5,alignx center,aligny center");

		JLabel labelWh_day5 = new JLabel(hm.get("cond"+4));
		labelWh_day5.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		add(labelWh_day5, "cell 9 5,alignx center,aligny center");

		JLabel lblTemp_day1 = new JLabel("Temperature: "+hm.get("avgTemp"+0));
		lblTemp_day1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTemp_day1.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTemp_day1, "cell 1 6,alignx center,aligny center");

		JLabel lblTemp_day2 = new JLabel("Temperature: "+hm.get("avgTemp"+1));
		lblTemp_day2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTemp_day2.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTemp_day2, "cell 3 6,alignx center,aligny center");

		JLabel lblTemp_day3 = new JLabel("Temperature: "+hm.get("avgTemp"+2));
		lblTemp_day3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTemp_day3.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTemp_day3, "cell 5 6,alignx center,aligny center");

		JLabel lblTemp_day4 = new JLabel("Temperature: "+hm.get("avgTemp"+3));
		lblTemp_day4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTemp_day4.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTemp_day4, "cell 7 6,growx,aligny center");

		JLabel lblTemp_day5 = new JLabel("Temperature: "+hm.get("avgTemp"+4));
		lblTemp_day5.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTemp_day5.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTemp_day5, "cell 9 6,growx");

		JTextPane mainText1 = new JTextPane();
		mainText1.setEditable(false);
		//mainText1.setText("Rain Chanche: 14%\r\nHumidity: 20%\r\nVisibility: 2.3 km\r\nMax Wind: 29 kmh\r\n");
		mainText1.setText("Rain Chanche: "+hm.get("chaRai"+0)+"\r\n"
					+ "Humidity: "+hm.get("avgHum"+0)+"\r\n"
					+ "Visibility: "+hm.get("avgVis"+0)+" km\r\n"
					+ "Max Wind: "+hm.get("maxWind"+0)+" kmh\r\n");
		add(mainText1, "cell 1 8,alignx center,aligny center");

		JTextPane mainText2 = new JTextPane();
		mainText2.setEditable(false);
		mainText2.setText("Rain Chanche: "+hm.get("chaRai"+1)+"\r\n"
				+ "Humidity: "+hm.get("avgHum"+1)+"\r\n"
				+ "Visibility: "+hm.get("avgVis"+1)+" km\r\n"
				+ "Max Wind: "+hm.get("maxWind"+1)+" kmh\r\n");
		add(mainText2, "cell 3 8,alignx center,aligny center");

		JTextPane mainText3 = new JTextPane();
		mainText3.setText("Rain Chanche: "+hm.get("chaRai"+2)+"\r\n"
				+ "Humidity: "+hm.get("avgHum"+2)+"\r\n"
				+ "Visibility: "+hm.get("avgVis"+2)+" km\r\n"
				+ "Max Wind: "+hm.get("maxWind"+2)+" kmh\r\n");		mainText3.setEditable(false);
		add(mainText3, "cell 5 8,alignx center,aligny center");

		JTextPane mainText4 = new JTextPane();
		mainText4.setText("Rain Chanche: "+hm.get("chaRai"+3)+"\r\n"
				+ "Humidity: "+hm.get("avgHum"+3)+"\r\n"
				+ "Visibility: "+hm.get("avgVis"+3)+" km\r\n"
				+ "Max Wind: "+hm.get("maxWind"+3)+" kmh\r\n");		mainText4.setEditable(false);
		add(mainText4, "cell 7 8,alignx center,aligny center");

		JTextPane mainText5 = new JTextPane();
		mainText5.setText("Rain Chanche: "+hm.get("chaRai"+4)+"\r\n"
				+ "Humidity: "+hm.get("avgHum"+4)+"\r\n"
				+ "Visibility: "+hm.get("avgVis"+4)+" km\r\n"
				+ "Max Wind: "+hm.get("maxWind"+4)+" kmh\r\n");		mainText5.setEditable(false);
		add(mainText5, "cell 9 8,alignx center,aligny center");

		JTextPane airQuality1 = new JTextPane();
		//airQuality1.setText("CO: 23\r\nNO2: 56\r\nPM10: 46\r\nPM25: 89\r\nSO2: 121");
		airQuality1.setText("Co: "+hm.get("Co"+0)+"\r\n"
				+ "NO2: "+hm.get("No2"+0)+"\r\n"
				+ "O3: "+hm.get("O3"+0)+"\r\n"
				+ "Pm10: "+hm.get("Pm10"+0)+"\r\n"
				+ "Pm25: "+hm.get("Pm25"+0)+"\r\n"
				+ "So2: "+hm.get("So2"+0));
		airQuality1.setEditable(false);
		add(airQuality1, "cell 1 9,alignx center,aligny top");

		JTextPane airQuality2 = new JTextPane();
		airQuality2.setText("Co: "+hm.get("Co"+1)+"\r\n"
				+ "NO2: "+hm.get("No2"+1)+"\r\n"
				+ "O3: "+hm.get("O3"+1)+"\r\n"
				+ "Pm10: "+hm.get("Pm10"+1)+"\r\n"
				+ "Pm25: "+hm.get("Pm25"+1)+"\r\n"
				+ "So2: "+hm.get("So2"+1));
		airQuality2.setEditable(false);
		add(airQuality2, "cell 3 9,alignx center,aligny top");

		JTextPane airQuality3 = new JTextPane();
		airQuality3.setText("Co: "+hm.get("Co"+2)+"\r\n"
				+ "NO2: "+hm.get("No2"+2)+"\r\n"
				+ "O3: "+hm.get("O3"+2)+"\r\n"
				+ "Pm10: "+hm.get("Pm10"+2)+"\r\n"
				+ "Pm25: "+hm.get("Pm25"+2)+"\r\n"
				+ "So2: "+hm.get("So2"+2));
		airQuality3.setEditable(false);
		add(airQuality3, "cell 5 9,alignx center,aligny top");

		JTextPane airQuality4 = new JTextPane();
		airQuality4.setText("Co: "+hm.get("Co"+3)+"\r\n"
				+ "NO2: "+hm.get("No2"+3)+"\r\n"
				+ "O3: "+hm.get("O3"+3)+"\r\n"
				+ "Pm10: "+hm.get("Pm10"+3)+"\r\n"
				+ "Pm25: "+hm.get("Pm25"+3)+"\r\n"
				+ "So2: "+hm.get("So2"+3));
		airQuality4.setEditable(false);
		add(airQuality4, "cell 7 9,alignx center,aligny top");

		JTextPane airQuality5 = new JTextPane();
		airQuality5.setText("Co: "+hm.get("Co"+4)+"\r\n"
				+ "NO2: "+hm.get("No2"+4)+"\r\n"
				+ "O3: "+hm.get("O3"+4)+"\r\n"
				+ "Pm10: "+hm.get("Pm10"+4)+"\r\n"
				+ "Pm25: "+hm.get("Pm25"+4)+"\r\n"
				+ "So2: "+hm.get("So2"+4));
		airQuality5.setEditable(false);
		add(airQuality5, "cell 9 9,alignx center,aligny top");

		seeMore1 = new JButton("See More");
		seeMore1.addActionListener(window);
		add(seeMore1, "cell 1 10,alignx center,aligny center");

		seeMore2 = new JButton("See More");
		add(seeMore2, "cell 3 10,alignx center,aligny center");
		seeMore2.addActionListener(window);

		seeMore3 = new JButton("See More");
		add(seeMore3, "cell 5 10,alignx center,aligny center");
		seeMore3.addActionListener(window);

		seeMore4 = new JButton("See More");
		add(seeMore4, "cell 7 10,alignx center,aligny center");
		seeMore4.addActionListener(window);

		seeMore5 = new JButton("See More");
		add(seeMore5, "cell 9 10,alignx center,aligny center");
		seeMore5.addActionListener(window);
	}

	public JButton getSeeMore(int n) {
		switch (n) {
		case 5:
			return seeMore5;
		case 4:
			return seeMore4;
		case 3:
			return seeMore3;
		case 2:
			return seeMore2;
		case 1:
			return seeMore1;
		default:
			throw new IllegalArgumentException("Unexpected value: " + n);
		}
	}

}
