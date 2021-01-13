package net.runelite.api;

import javax.annotation.Nullable;
import java.util.Arrays;

public enum DialogOption
{
	NPC_CONTINUE(15138819, -1),
	PLAYER_CONTINUE(14221315, -1),
	QUEST(12648448, 0),
	ITEM_ONE(12648448, -1),
	ITEM_TWO(12648448, 0),
	CHAT_OPTION_ONE(14352385, 1),
	CHAT_OPTION_TWO(14352385, 2),
	CHAT_OPTION_THREE(14352385, 3),
	CHAT_OPTION_FOUR(14352385, 4),
	CHAT_OPTION_FIVE(14352385, 5),
	PLAIN_CONTINUE(15007746, -1),
	PLAIN_CONTINUE_TWO(720900, -1);

	private final int widgetUid;
	private final int menuIndex;

	DialogOption(int widgetUid, int menuIndex)
	{
		this.widgetUid = widgetUid;
		this.menuIndex = menuIndex;
	}

	public int getWidgetUid()
	{
		return widgetUid;
	}

	public int getMenuIndex()
	{
		return menuIndex;
	}

	@Nullable
	public static DialogOption of(int widgetUid, int menuIndex)
	{
		return Arrays.stream(values())
				.filter(option -> option.getWidgetUid() == widgetUid && option.getMenuIndex() == menuIndex)
				.findFirst()
				.orElse(null);
	}
}