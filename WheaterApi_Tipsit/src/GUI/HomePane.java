package GUI;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Label;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.Icon;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
public class HomePane extends JPanel {

	/**
	 * Create the panel.
	 */
	public HomePane() {
		this.setSize(1000, 600);
		setLayout(new MigLayout("", "[15:15:15][116,grow][80][116,grow][80][116,grow][80][116,grow][80][116,grow][25:25:25]", "[25][30][40][50][20][25][][][100][120][]"));
		
		JLabel placeLabel = new JLabel("Treviso, Veneto, Italy");
		add(placeLabel, "cell 5 0");
		
		JLabel label_day1 = new JLabel("Lunedi");
		label_day1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		label_day1.setHorizontalTextPosition(SwingConstants.CENTER);
		label_day1.setHorizontalAlignment(SwingConstants.CENTER);
		add(label_day1, "cell 1 1,alignx center,aligny center");
		
		JLabel label_day2 = new JLabel("Martedi");
		label_day2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		label_day2.setHorizontalTextPosition(SwingConstants.CENTER);
		label_day2.setHorizontalAlignment(SwingConstants.CENTER);
		add(label_day2, "cell 3 1,alignx center,aligny center");
		
		JLabel label_day3 = new JLabel("Mercoledì");
		label_day3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		label_day3.setHorizontalAlignment(SwingConstants.CENTER);
		label_day3.setHorizontalTextPosition(SwingConstants.CENTER);
		add(label_day3, "cell 5 1,alignx center,aligny center");
		
		JLabel label_day4 = new JLabel("Giovedì");
		label_day4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		label_day4.setHorizontalTextPosition(SwingConstants.CENTER);
		label_day4.setHorizontalAlignment(SwingConstants.CENTER);
		add(label_day4, "cell 7 1,alignx center,aligny center");
		

		ImageIcon imageIcon = new ImageIcon("src/images/sole.png");
		Image image = imageIcon.getImage();
		Image newimg = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
		imageIcon = new ImageIcon(newimg);
		
		JLabel label_day5 = new JLabel("Venerdi");
		label_day5.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		label_day5.setHorizontalAlignment(SwingConstants.CENTER);
		label_day5.setHorizontalTextPosition(SwingConstants.CENTER);
		add(label_day5, "cell 9 1,alignx center,aligny center");
		
		JLabel day1day = new JLabel("19th March");
		add(day1day, "cell 1 2,alignx center,aligny top");
		
		JLabel day2day = new JLabel("19th March");
		add(day2day, "cell 3 2,alignx center,aligny top");
		
		JLabel day3day = new JLabel("19th March");
		add(day3day, "cell 5 2,alignx center,aligny top");
		
		JLabel day4day = new JLabel("19th March");
		add(day4day, "cell 7 2,alignx center,aligny top");
		
		JLabel day5day = new JLabel("19th March");
		add(day5day, "cell 9 2,alignx center,aligny top");
		 
		JLabel iconLabel_day1 = new JLabel(imageIcon);
//		iconLabel.setMinimumSize(new Dimension(200, 200));
//		iconLabel.setMaximumSize(new Dimension(200, 200));
		add(iconLabel_day1, "cell 1 3,alignx center,aligny center");
		
		JLabel iconLabel_day2 = new JLabel(imageIcon);
		add(iconLabel_day2, "cell 3 3,alignx center,aligny center");
		
		JLabel iconLabel_day3 = new JLabel(imageIcon);
		add(iconLabel_day3, "cell 5 3,alignx center,aligny center");
		
		JLabel iconLabel_day4 = new JLabel(imageIcon);
		add(iconLabel_day4, "cell 7 3,alignx center,aligny center");
		
		JLabel iconLabel_day5 = new JLabel(imageIcon);
		add(iconLabel_day5, "cell 9 3,alignx center,aligny center");
		
		JLabel labelWh_day1 = new JLabel("Sunny");
		labelWh_day1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		add(labelWh_day1, "cell 1 5,alignx center,aligny center");
		
		JLabel labelWh_day2 = new JLabel("Sunny");
		labelWh_day2.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		add(labelWh_day2, "cell 3 5,alignx center,aligny center");
		
		JLabel labelWh_day3 = new JLabel("Sunny");
		labelWh_day3.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		add(labelWh_day3, "cell 5 5,alignx center,aligny center");
		
		JLabel labelWh_day4 = new JLabel("Sunny");
		labelWh_day4.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		add(labelWh_day4, "cell 7 5,alignx center,aligny center");
		
		JLabel labelWh_day5 = new JLabel("Sunny");
		labelWh_day5.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		add(labelWh_day5, "cell 9 5,alignx center,aligny center");
		
		JLabel lblTemp_day1 = new JLabel("18 C");
		lblTemp_day1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTemp_day1.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTemp_day1, "cell 1 6,alignx center,aligny center");
		
		JLabel lblTemp_day2 = new JLabel("18 C");
		lblTemp_day2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTemp_day2.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTemp_day2, "cell 3 6,alignx center,aligny center");
		
		JLabel lblTemp_day3 = new JLabel("18 C");
		lblTemp_day3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTemp_day3.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTemp_day3, "cell 5 6,alignx center,aligny center");
		
		JLabel lblTemp_day4 = new JLabel("18 C");
		lblTemp_day4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTemp_day4.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTemp_day4, "cell 7 6,growx,aligny center");
		
		JLabel lblTemp_day5 = new JLabel("18 C");
		lblTemp_day5.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTemp_day5.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTemp_day5, "cell 9 6,growx");
		
		JTextPane mainText1 = new JTextPane();
		mainText1.setEditable(false);
		mainText1.setText("Rain Chanche: 14%\r\nHumidity: 20%\r\nVisibility: 2.3 km\r\nMax Wind: 29 kmh\r\n");
		add(mainText1, "cell 1 8,alignx center,aligny top");
		
		JTextPane mainText2 = new JTextPane();
		mainText2.setEditable(false);
		mainText2.setText("Rain Chanche: 14%\r\nHumidity: 20%\r\nVisibility: 2.3 km\r\nMax Wind: 29 kmh\r\n");
		add(mainText2, "cell 3 8,alignx center,aligny top");
		
		JTextPane mainText3 = new JTextPane();
		mainText3.setText("Rain Chanche: 14%\r\nHumidity: 20%\r\nVisibility: 2.3 km\r\nMax Wind: 29 kmh\r\n");
		mainText3.setEditable(false);
		add(mainText3, "cell 5 8,alignx center,aligny top");
		
		JTextPane mainText4 = new JTextPane();
		mainText4.setText("Rain Chanche: 14%\r\nHumidity: 20%\r\nVisibility: 2.3 km\r\nMax Wind: 29 kmh\r\n");
		mainText4.setEditable(false);
		add(mainText4, "cell 7 8,alignx center,aligny top");
		
		JTextPane mainText5 = new JTextPane();
		mainText5.setText("Rain Chanche: 14%\r\nHumidity: 20%\r\nVisibility: 2.3 km\r\nMax Wind: 29 kmh\r\n");
		mainText5.setEditable(false);
		add(mainText5, "cell 9 8,alignx center,aligny top");
		
		JTextPane airQuality1 = new JTextPane();
		airQuality1.setText("CO: 23\r\nNO2: 56\r\nPM10: 46\r\nPM25: 89\r\nSO2: 121");
		airQuality1.setEditable(false);
		add(airQuality1, "cell 1 9,alignx center,aligny top");
		
		JTextPane airQuality2 = new JTextPane();
		airQuality2.setText("CO: 23\r\nNO2: 56\r\nPM10: 46\r\nPM25: 89\r\nSO2: 121");
		airQuality2.setEditable(false);
		add(airQuality2, "cell 3 9,alignx center,aligny top");
		
		JTextPane airQuality3 = new JTextPane();
		airQuality3.setText("CO: 23\r\nNO2: 56\r\nPM10: 46\r\nPM25: 89\r\nSO2: 121");
		airQuality3.setEditable(false);
		add(airQuality3, "cell 5 9,alignx center,aligny top");
		
		JTextPane airQuality4 = new JTextPane();
		airQuality4.setText("CO: 23\r\nNO2: 56\r\nPM10: 46\r\nPM25: 89\r\nSO2: 121");
		airQuality4.setEditable(false);
		add(airQuality4, "cell 7 9,alignx center,aligny top");
		
		JTextPane airQuality5 = new JTextPane();
		airQuality5.setText("CO: 23\r\nNO2: 56\r\nPM10: 46\r\nPM25: 89\r\nSO2: 121");
		airQuality5.setEditable(false);
		add(airQuality5, "cell 9 9,alignx center,aligny top");
		
		JButton seeMore1 = new JButton("See More");
		add(seeMore1, "cell 1 10,alignx center,aligny center");
		
		JButton seeMore2 = new JButton("See More");
		add(seeMore2, "cell 3 10,alignx center,aligny center");
		
		JButton seeMore3 = new JButton("See More");
		add(seeMore3, "cell 5 10,alignx center,aligny center");
		
		JButton seeMore4 = new JButton("See More");
		add(seeMore4, "cell 7 10,alignx center,aligny center");
		
		JButton seeMore5 = new JButton("See More");
		add(seeMore5, "cell 9 10,alignx center,aligny center");
	}

}
