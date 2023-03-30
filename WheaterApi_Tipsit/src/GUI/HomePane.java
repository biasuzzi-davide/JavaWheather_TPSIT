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
public class HomePane extends JPanel {

	/**
	 * Create the panel.
	 */
	public HomePane() {
		this.setSize(1000, 600);
		setLayout(new MigLayout("", "[26.00][][][60:60:60][][][][][60:60:60][][][][][60:60:60][][][][][60:60:60][][][][][60:60:60][][]", "[][][][][][]"));
		
		JLabel label_day1 = new JLabel("Lunedi");
		label_day1.setHorizontalTextPosition(SwingConstants.CENTER);
		label_day1.setHorizontalAlignment(SwingConstants.CENTER);
		add(label_day1, "cell 3 1,alignx center,aligny center");
		
		JLabel label_day2 = new JLabel("Martedi");
		label_day2.setHorizontalTextPosition(SwingConstants.CENTER);
		label_day2.setHorizontalAlignment(SwingConstants.CENTER);
		add(label_day2, "cell 8 1,alignx center,aligny center");
		
		JLabel label_day3 = new JLabel("Mercoledì");
		label_day3.setHorizontalAlignment(SwingConstants.CENTER);
		label_day3.setHorizontalTextPosition(SwingConstants.CENTER);
		add(label_day3, "cell 13 1,alignx center,aligny center");
		
		JLabel label_day4 = new JLabel("Giovedì");
		label_day4.setHorizontalTextPosition(SwingConstants.CENTER);
		label_day4.setHorizontalAlignment(SwingConstants.CENTER);
		add(label_day4, "cell 18 1,alignx center,aligny center");
		

		ImageIcon imageIcon = new ImageIcon("src/images/sole.png");
		Image image = imageIcon.getImage();
		Image newimg = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
		imageIcon = new ImageIcon(newimg);
		
		JLabel label_day5 = new JLabel("Venerdi");
		label_day5.setHorizontalAlignment(SwingConstants.CENTER);
		label_day5.setHorizontalTextPosition(SwingConstants.CENTER);
		add(label_day5, "cell 23 1,alignx center,aligny center");
		 
		JLabel iconLabel_day1 = new JLabel(imageIcon);
//		iconLabel.setMinimumSize(new Dimension(200, 200));
//		iconLabel.setMaximumSize(new Dimension(200, 200));
		add(iconLabel_day1, "cell 3 3");
		
		JLabel iconLabel_day2 = new JLabel(imageIcon);
		add(iconLabel_day2, "cell 8 3");
		
		JLabel iconLabel_day3 = new JLabel(imageIcon);
		add(iconLabel_day3, "cell 13 3");
		
		JLabel iconLabel_day4 = new JLabel(imageIcon);
		add(iconLabel_day4, "cell 18 3");
		
		JLabel iconLabel_day5 = new JLabel(imageIcon);
		add(iconLabel_day5, "cell 23 3");
		
		JLabel labelWh_day1 = new JLabel("Sunny");
		add(labelWh_day1, "cell 3 4,alignx center,aligny center");
		
		JLabel labelWh_day2 = new JLabel("Sunny");
		add(labelWh_day2, "cell 8 4,alignx center,aligny center");
		
		JLabel labelWh_day3 = new JLabel("Sunny");
		add(labelWh_day3, "cell 13 4,alignx center,aligny center");
		
		JLabel labelWh_day4 = new JLabel("Sunny");
		add(labelWh_day4, "cell 18 4,alignx center,aligny center");
		
		JLabel labelWh_day5 = new JLabel("Sunny");
		add(labelWh_day5, "cell 23 4,alignx center,aligny center");
		
		JLabel lblTemp_day1 = new JLabel("18 C");
		lblTemp_day1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTemp_day1.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTemp_day1, "cell 3 5,alignx center,aligny center");
		
		JLabel lblTemp_day2 = new JLabel("18 C");
		lblTemp_day2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTemp_day2.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTemp_day2, "cell 8 5,alignx center,aligny center");
		
		JLabel lblTemp_day3 = new JLabel("18 C");
		lblTemp_day3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTemp_day3.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTemp_day3, "cell 13 5,alignx center,aligny center");
		
		JLabel lblTemp_day4 = new JLabel("18 C");
		lblTemp_day4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTemp_day4.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTemp_day4, "cell 18 5,growx,aligny center");
		
		JLabel lblTemp_day5 = new JLabel("18 C");
		lblTemp_day5.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTemp_day5.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTemp_day5, "cell 23 5,growx");
	}

}
