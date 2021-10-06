package net.runelite.client.plugins.openosrs.externals;

import net.runelite.client.plugins.OPRSExternalPluginManager;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;
import javax.inject.Inject;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.ui.ClientUI;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.PluginPanel;
import net.runelite.client.util.ImageUtil;

public class ExternalPluginManagerPanel extends PluginPanel
{
	private static final ImageIcon ADD_ICON_RAW;
	private static final ImageIcon ADD_HOVER_ICON_RAW;
	private static final ImageIcon ADD_ICON_GH;
	private static final ImageIcon ADD_HOVER_ICON_GH;

	static
	{
		final BufferedImage addIconRaw =
			ImageUtil.loadImageResource(ExternalPluginManagerPanel.class, "add_raw_icon.png");
		final BufferedImage addIconGh = ImageUtil
			.resizeImage(ImageUtil.loadImageResource(ExternalPluginManagerPanel.class, "gh_icon.png"), 14, 14);
		ADD_ICON_RAW = new ImageIcon(addIconRaw);
		ADD_HOVER_ICON_RAW = new ImageIcon(ImageUtil.alphaOffset(addIconRaw, 0.53f));
		ADD_ICON_GH = new ImageIcon(addIconGh);
		ADD_HOVER_ICON_GH = new ImageIcon(ImageUtil.alphaOffset(addIconGh, 0.53f));
	}

	private final OPRSExternalPluginManager externalPluginManager;
	private final EventBus eventBus;

	@Inject
	private ExternalPluginManagerPanel(OPRSExternalPluginManager externalPluginManager, EventBus eventBus)
	{
		super(false);

		this.externalPluginManager = externalPluginManager;
		this.eventBus = eventBus;

		buildPanel();
	}

	private void buildPanel()
	{
		removeAll();

		setLayout(new BorderLayout(0, 10));
		setBackground(ColorScheme.DARK_GRAY_COLOR);

		add(titleBar(), BorderLayout.NORTH);
		add(tabbedPane(), BorderLayout.CENTER);

		revalidate();
		repaint();
	}

	private JPanel titleBar()
	{
		JPanel titlePanel = new JPanel(new BorderLayout());
		titlePanel.setBorder(new EmptyBorder(10, 10, 10, 10));

		JLabel title = new JLabel();
		JLabel addGHRepo = new JLabel(ADD_ICON_GH);
		JLabel addRawRepo = new JLabel(ADD_ICON_RAW);

		JPanel buttonHolder = new JPanel(new BorderLayout());
		buttonHolder.setBorder(new EmptyBorder(0, 0, 0, 0));

		title.setText("External Plugin Manager");
		title.setForeground(Color.WHITE);

		addGHRepo.setToolTipText("Add new GitHub repository");
		addGHRepo.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mousePressed(MouseEvent mouseEvent)
			{
				if (externalPluginManager.getWarning())
				{
					JCheckBox checkbox = new JCheckBox("Don't show again.");
					int answer = showWarningDialog(checkbox);

					if (answer == 1)
					{
						return;
					}

					if (checkbox.isSelected())
					{
						externalPluginManager.setWarning(false);
					}
				}

				JTextField owner = new JTextField();
				JTextField name = new JTextField();
				Object[] message = {
					"Github Repository owner:", owner,
					"Github Repository name:", name
				};

				int option =
					JOptionPane.showConfirmDialog(ClientUI.getFrame(), message, "Add repository", JOptionPane.OK_CANCEL_OPTION);
				if (option != JOptionPane.OK_OPTION || owner.getText().equals("") || name.getText().equals(""))
				{
					return;
				}

				if (externalPluginManager.doesGhRepoExist(owner.getText(), name.getText()))
				{
					JOptionPane.showMessageDialog(ClientUI.getFrame(), "This repository already exists.", "Error!",
						JOptionPane.ERROR_MESSAGE);
					return;
				}

				if (OPRSExternalPluginManager.testGHRepository(owner.getText(), name.getText()))
				{
					JOptionPane.showMessageDialog(ClientUI.getFrame(), "This doesn't appear to be a valid repository.", "Error!",
						JOptionPane.ERROR_MESSAGE);
					return;
				}

				externalPluginManager.addGHRepository(owner.getText(), name.getText());
			}

			@Override
			public void mouseEntered(MouseEvent mouseEvent)
			{
				addGHRepo.setIcon(ADD_HOVER_ICON_GH);
			}

			@Override
			public void mouseExited(MouseEvent mouseEvent)
			{
				addGHRepo.setIcon(ADD_ICON_GH);
			}
		});
		addGHRepo.setBorder(new EmptyBorder(0, 3, 0, 0));

		addRawRepo.setToolTipText("Add new raw repository");
		addRawRepo.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mousePressed(MouseEvent mouseEvent)
			{
				if (externalPluginManager.getWarning())
				{
					JCheckBox checkbox = new JCheckBox("Don't show again.");
					int answer = showWarningDialog(checkbox);

					if (answer == 1)
					{
						return;
					}
					
					if (checkbox.isSelected())
					{
						externalPluginManager.setWarning(false);
					}
				}

				JTextField id = new JTextField();
				JTextField url = new JTextField();
				Object[] message = {
					"Repository ID:", id,
					"Repository URL:", url
				};

				int option =
					JOptionPane.showConfirmDialog(ClientUI.getFrame(), message, "Add repository", JOptionPane.OK_CANCEL_OPTION);
				if (option != JOptionPane.OK_OPTION || id.getText().equals("") || url.getText().equals(""))
				{
					return;
				}

				if (id.getText().startsWith("gh:") || id.getText().contains("|"))
				{
					JOptionPane.showMessageDialog(ClientUI.getFrame(),
						"Repository id cannot begin with \"gh:\"\nor contain the pipe character '|'.", "Error!",
						JOptionPane.ERROR_MESSAGE);
					return;
				}

				if (externalPluginManager.doesRepoExist(id.getText()))
				{
					JOptionPane.showMessageDialog(ClientUI.getFrame(),
						String.format("The repository with id %s already exists.", id.getText()), "Error!",
						JOptionPane.ERROR_MESSAGE);
					return;
				}

				URL urlActual;
				String pluginJson = null;
				try
				{
					String urlText = url.getText();

					if (urlText.contains(".json"))
					{
						urlText = urlText.replace(".json/", ".json");

						URL urlObj = new URL(urlText);
						String urlPath = urlObj.getPath();

						pluginJson = urlPath.substring(urlPath.lastIndexOf('/') + 1);
					}

					urlActual = new URL(urlText);
				}
				catch (MalformedURLException e)
				{
					JOptionPane.showMessageDialog(ClientUI.getFrame(), "This doesn't appear to be a valid repository.", "Error!",
						JOptionPane.ERROR_MESSAGE);
					return;
				}

				if ((pluginJson == null && OPRSExternalPluginManager.testRepository(urlActual)) || (pluginJson != null && OPRSExternalPluginManager.testRepository(urlActual, pluginJson)))
				{
					JOptionPane.showMessageDialog(ClientUI.getFrame(), "This doesn't appear to be a valid repository.", "Error!",
						JOptionPane.ERROR_MESSAGE);
					return;
				}

				if (pluginJson == null)
				{
					externalPluginManager.addRepository(id.getText(), urlActual);
				}
				else
				{
					externalPluginManager.addRepository(id.getText(), urlActual, pluginJson);
				}
			}

			@Override
			public void mouseEntered(MouseEvent mouseEvent)
			{
				addRawRepo.setIcon(ADD_HOVER_ICON_RAW);
			}

			@Override
			public void mouseExited(MouseEvent mouseEvent)
			{
				addRawRepo.setIcon(ADD_ICON_RAW);
			}
		});
		addRawRepo.setBorder(new EmptyBorder(0, 0, 0, 3));

		titlePanel.add(title, BorderLayout.WEST);
		buttonHolder.add(addRawRepo, BorderLayout.WEST);
		buttonHolder.add(addGHRepo, BorderLayout.EAST);
		titlePanel.add(buttonHolder, BorderLayout.EAST);

		return titlePanel;
	}

	private JTabbedPane tabbedPane()
	{
		JTabbedPane mainTabPane = new JTabbedPane();

		PluginsPanel pluginPanel = new PluginsPanel(this.externalPluginManager, this.eventBus);
		JScrollPane repositoryPanel = wrapContainer(new RepositoryPanel(this.externalPluginManager, this.eventBus));

		mainTabPane.add("Plugins", pluginPanel);
		mainTabPane.add("Repositories", repositoryPanel);

		return mainTabPane;
	}

	private int showWarningDialog(JCheckBox checkbox)
	{
		Object[] options = {"Okay, I accept the risk", "Never mind, turn back", checkbox};
		return JOptionPane.showOptionDialog(new JFrame(),
			"Adding plugins from unverified sources may put your account, or personal information at risk!   \n",
			"Account security warning",
			JOptionPane.YES_NO_OPTION,
			JOptionPane.WARNING_MESSAGE,
			null,
			options,
			options[0]);
	}

	static JScrollPane wrapContainer(final JPanel container)
	{
		final JPanel wrapped = new JPanel(new BorderLayout());
		wrapped.add(container, BorderLayout.NORTH);

		final JScrollPane scroller = new JScrollPane(wrapped);
		scroller.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroller.getVerticalScrollBar().setPreferredSize(new Dimension(8, 0));

		return scroller;
	}
}
