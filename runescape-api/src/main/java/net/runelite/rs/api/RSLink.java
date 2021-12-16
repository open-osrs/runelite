package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSLink
{
	@Import("previous")
	RSLink getPrevious();

	@Import("next")
	RSLink next();

	@Import("remove")
	void remove();
}
