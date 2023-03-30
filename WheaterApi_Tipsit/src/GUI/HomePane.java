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
public class HomePane extends JPanel {

	/**
	 * Create the panel.
	 */
	public HomePane() {
		this.setSize(1000, 600);
		setLayout(new MigLayout("", "[15:15:15][100:100:100][100:100:100][100:100:100][100:100:100][100:100:100][100:100:100][100:100:100][100:100:100][100:100:100][25:25:25]", "[25][30][20][50][20][25][]"));
		
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
	}

}
