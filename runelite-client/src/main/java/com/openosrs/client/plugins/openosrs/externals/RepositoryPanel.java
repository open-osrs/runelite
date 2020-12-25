package com.openosrs.client.plugins.openosrs.externals;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.inject.Inject;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.runelite.client.eventbus.EventBus;
import com.openosrs.client.events.ExternalRepositoryChanged;
import com.openosrs.client.plugins.ExternalPluginManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.ui.ColorScheme;
import org.pf4j.update.UpdateRepository;

public class RepositoryPanel extends JPanel
{
	@Inject
	public EventBus eventBus;

	private final ExternalPluginManager externalPluginManager;

	private final GridBagConstraints c = new GridBagConstraints();

	RepositoryPanel(ExternalPluginManager externalPluginManager, EventBus eventBus)
	{
		this.externalPluginManager = externalPluginManager;

		setLayout(new GridBagLayout());
		setBackground(ColorScheme.DARK_GRAY_COLOR);
		setBorder(new EmptyBorder(0, 10, 0, 10));

		onExternalRepositoryChanged(null);

		eventBus.register(this);
	}

	@Subscribe
	private void onExternalRepositoryChanged(ExternalRepositoryChanged event)
	{
		removeAll();

		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 1;
		c.gridy = 0;
		c.insets = new Insets(5, 0, 0, 0);

		for (UpdateRepository repository : externalPluginManager.getRepositories())
		{
			final RepositoryBox p = new RepositoryBox(externalPluginManager, repository);
			add(p, c);
			c.gridy++;
		}
	}
}
