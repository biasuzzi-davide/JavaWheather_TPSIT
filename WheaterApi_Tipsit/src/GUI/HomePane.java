package GUI;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Label;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Image;
public class HomePane extends JPanel {

	/**
	 * Create the panel.
	 */
	public HomePane() {
		this.setSize(9000, 500);
		setLayout(new MigLayout("", "[26.00][][][60:60:60][][][][][60:60:60][][][][][60:60:60][][][][][60:60:60][][][][][][60:60:60][]", "[][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Lunedi");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel, "cell 3 1,alignx center,aligny center");
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_1, "cell 8 1,alignx center,aligny center");
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		add(lblNewLabel_2, "cell 13 1,alignx center,aligny center");
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_3, "cell 18 1,alignx center,aligny center");
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setHorizontalTextPosition(SwingConstants.CENTER);
		add(lblNewLabel_4, "cell 24 1,alignx center,aligny center");
		

		ImageIcon imageIcon = new ImageIcon("src/pngtree-sun-icon-isolated-on-background-png-image_1790445.jpg");
		Image image = imageIcon.getImage();
		Image newimg = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
		imageIcon = new ImageIcon(newimg);
		 
		JLabel iconLabel = new JLabel(imageIcon);
//		iconLabel.setMinimumSize(new Dimension(200, 200));
//		iconLabel.setMaximumSize(new Dimension(200, 200));
		add(iconLabel, "cell 3 3");
		
		JLabel lblNewLabel_6 = new JLabel("Sunny");
		add(lblNewLabel_6, "cell 3 4,alignx center,aligny center");
		
		JLabel lblNewLabel_5 = new JLabel("18 C");
		lblNewLabel_5.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_5, "cell 3 5,alignx center,aligny center");
	}

}
