package net.runelite.rs.api;

import net.runelite.api.Deque;
import net.runelite.mapping.Import;

public interface RSLinkDeque extends Deque
{
	@Import("current")
	RSLink getCurrent();

	@Import("current")
	void setCurrent(RSLink link);

	@Import("sentinel")
	RSLink getSentinel();

	@Import("last")
	RSLink last();

	@Import("previous")
	RSLink previous();

	@Import("addFirst")
	void addFirst(RSLink val);
}
