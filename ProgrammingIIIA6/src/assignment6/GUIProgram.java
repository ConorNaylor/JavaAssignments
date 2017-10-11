package assignment6;

// Conor Naylor 14316026

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class GUIProgram extends JFrame implements ActionListener
{
	private JPanel smPanel, detailsPanel, LIPanel;
	private JButton onButton, detailsButton, modeButton;
	private GridLayout gridLayout;
	private Container container;
	private JTextArea status;
	private JLabel statusLabel, iLabel;

	// Following colors used to indicate light intensity
	private Color yellow1 = new Color(255, 255, 230);
	private Color yellow2 = new Color(255, 255, 180);
	private Color yellow3 = new Color(255, 255, 140);
	private Color yellow4 = new Color(255, 255, 100);
	private Color yellow5 = new Color(253, 255, 30);

	// Used in the event handler method to control state of switch and console output
	private boolean on = true;
	private String stateOn = "Off";
	private String stateOff = "On";
	private String mode1 = "Timer";
	private String mode2 = "Manual";

	//Used in the event handler method to set system mode: Timer or Manual
	private boolean timer = true;

	private JList intensityList;
	private String intensityNames[] = { "1", "2", "3", "4", "5" }; 
	private Color intensity[] = { yellow1, yellow2, yellow3, yellow4, yellow5 };

	public GUIProgram()
	{
		super ("Light System");		// Sets title

		gridLayout = new GridLayout(1,3,10,10);		// Instantiates GridLayout layout
		container = getContentPane();
		container.setLayout(gridLayout);

		// Create panels detailsPanel, smPanel, LIPanel;
		smPanel = new JPanel(); 		//Switch-Mode Panel
		smPanel.setLayout(new GridLayout(2,1,5,5));
		detailsPanel = new JPanel();
		detailsPanel.setLayout(new BorderLayout());
		LIPanel = new JPanel();			// Light Intensity panel
		LIPanel.setLayout(new BorderLayout());

		// Adds three main panels stated above to container
		container.add(smPanel);
		container.add(detailsPanel);
		container.add(LIPanel);


		// On-Off Switch
		onButton = new JButton("On");
		smPanel.add(onButton);
		onButton.addActionListener(this);

		// Details button
		detailsButton = new JButton("Display System Details");
		detailsButton.setPreferredSize(new Dimension(80,130));
		detailsPanel.add(detailsButton, BorderLayout.NORTH);
		detailsButton.addActionListener(this);

		// Status Panel
		statusLabel = new JLabel("Status of Light System:");
		statusLabel.setPreferredSize(new Dimension(80,120));
		detailsPanel.add(statusLabel, BorderLayout.CENTER);

		// Mode Panel
		modeButton = new JButton("Manual");
		smPanel.add(modeButton);
		modeButton.addActionListener(this);

		//Status Panel
		status = new JTextArea("Click 'Display System Details'");
		status.setPreferredSize(new Dimension(80,130));		//Sets preferred size of text area
		status.setEditable(false);							//Makes it uneditable
		detailsPanel.add(status, BorderLayout.SOUTH);		//Adds status to details panel

		// Intensity Panel
		iLabel = new JLabel("Select a light intensity level");	//Create label for light intensity list
		intensityList = new JList(intensityNames);				//Instantiates list with names 1-5					
		intensityList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Allows single selection of color array
		LIPanel.add(iLabel, BorderLayout.NORTH);				//Adds the label to the top of the panel
		LIPanel.add(intensityList, BorderLayout.CENTER);		//Adds the list to the centre of the panel
		intensityList.setSelectedIndex(0);						// Sets default color

		intensityList.addListSelectionListener(new ListSelectionListener()  // Inner class used to handle events for the background color change
				{
			public void valueChanged( ListSelectionEvent event)
			{
				if(on == true)
				{
					container.setBackground(intensity[intensityList.getSelectedIndex()]);
					smPanel.setBackground(intensity[intensityList.getSelectedIndex()]);
					detailsPanel.setBackground(intensity[intensityList.getSelectedIndex()]);
				}
			}
				}
				);


	}

	@Override
	public void actionPerformed(ActionEvent e) //Event handler method
	{
		if(e.getSource() == onButton)
		{
			if(on == true)		//If system is off then the background will be white
			{
				container.setBackground(Color.white);
				smPanel.setBackground(Color.white);
				detailsPanel.setBackground(Color.white);
				onButton.setText(stateOn);
				on = false;
				System.out.println("Event: Light switched " + stateOn + "\n");
			}
			else
			{
				container.setBackground(intensity[intensityList.getSelectedIndex()]);
				smPanel.setBackground(intensity[intensityList.getSelectedIndex()]);
				detailsPanel.setBackground(intensity[intensityList.getSelectedIndex()]);
				onButton.setText(stateOff);
				on = true;
				System.out.println("Event: Light switched " + stateOff + "\n");
			}
		}

		if(e.getSource() == detailsButton)			//If details button is pressed, it will update the string thats prints in the status text field 
		{
			System.out.println("Event: Details button pressed.\n");
			status.setText("");
			status.append("The light is switched ");
			if(on == true)
			{
				status.append(stateOff + "\n");
			}
			else
			{
				status.append(stateOn + "\n");
			}
			status.append("The mode is set as ");
			if(timer == true)
			{
				status.append(mode2 + "\n");
			}
			else
			{
				status.append(mode1 + "\n");

			}
			int i;
			if(on == true)
			{
				status.append("The light intensity is set at level " + (intensityList.getSelectedIndex() + 1));
			}
			else
				status.append("The light intensity is set at level 0");



		}

		if(e.getSource() == modeButton)		//If the mode button is pressed this handler will change the text on the button
		{
			if(timer == false)
			{
				System.out.println("Event: Light system has been set to manual mode.\n");
				modeButton.setText(mode2);
				timer = true;
			}

			else
			{
				System.out.println("Event: Light system has been set to timer mode.\n");
				modeButton.setText(mode1);
				timer = false;
			}

		}

	}

	public static void main(String[] args)
	{
		GUIProgram gui = new GUIProgram();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(700, 350);
		gui.setVisible(true);
		gui.setLocationRelativeTo(null);
	}

}

