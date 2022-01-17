package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSLink
{
	@Import("previous")
	RSLink getPrevious();

	@Import("previous")
	void setPrevious(RSLink var1);

	@Import("next")
	RSLink next();

	@Import("next")
	RSLink getNext();

	@Import("next")
	void setNext(RSLink var1);

	@Import("remove")
	void remove();
}
