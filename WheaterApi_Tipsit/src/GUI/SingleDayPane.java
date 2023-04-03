package GUI;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
public class SingleDayPane extends JPanel implements ActionListener{

	private JComboBox comboBox;
	private Window w;

	/**
	 * Create the panel.
	 */
	public SingleDayPane(Window w) {
		this.w=w;
		this.setSize(1000, 600);
		setLayout(new MigLayout("", "[200][200:200:200][195.00][200][200]", "[85][30][20][25][100][25][25][25][25][25][25][25][25][25][25][25][grow]"));
		
		JLabel placeLbl = new JLabel("Trevito, Veneto, Italy");
		add(placeLbl, "cell 1 0,alignx center,aligny bottom");
		
		JLabel dayNameLbl = new JLabel("Lunedì");
		dayNameLbl.setFont(new Font("Segoe UI", Font.BOLD, 18));
		add(dayNameLbl, "cell 1 1,alignx center,aligny center");
		
		JLabel dayDateLbl = new JLabel("19th March");
		add(dayDateLbl, "cell 1 2,alignx center,aligny center");
		
		ImageIcon imageIcon = new ImageIcon("src/images/sole.png");
		Image image = imageIcon.getImage();
		Image newimg = image.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
		imageIcon = new ImageIcon(newimg);
		JLabel iconLabel = new JLabel(imageIcon);
		add(iconLabel, "cell 1 4,alignx center,aligny center");
		
		JLabel lblNewLabel = new JLabel("Select Day Hour");
		add(lblNewLabel, "cell 3 5,alignx center,aligny center");
		
		JLabel conditionDayLbl = new JLabel("Cloudy");
		add(conditionDayLbl, "cell 1 6,alignx center,aligny center");
		
		comboBox = new JComboBox();
		comboBox.addActionListener(this);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00"}));
		add(comboBox, "cell 3 6,alignx center");
		
		JLabel temperatureLbl = new JLabel("MAX: 20°C | MIN: 16 °C | AVG: 18°C");
		add(temperatureLbl, "cell 1 7,alignx center,aligny center");
		
		JLabel windLbl = new JLabel("Wind Max: 20 kmh");
		add(windLbl, "cell 1 8,alignx center,aligny center");
		
		JLabel humidityLbl = new JLabel("Humidiity: 20%");
		add(humidityLbl, "cell 1 9,alignx center,aligny center");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 if (e.getSource() == comboBox) {
			 System.out.println("Ciao");
			 HoursWindow hw = new HoursWindow(comboBox.getSelectedIndex(),w);
			 hw.frame.setVisible(true);
		 }
	}
}
