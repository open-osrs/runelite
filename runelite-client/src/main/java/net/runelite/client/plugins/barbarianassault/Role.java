package net.runelite.client.plugins.barbarianassault;

import com.google.common.collect.ImmutableMap;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.Client;
import net.runelite.api.ItemID;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;


@AllArgsConstructor
enum Role
{
	ATTACKER(WidgetInfo.BA_ATK_LISTEN_TEXT, WidgetInfo.BA_ATK_CALL_TEXT, WidgetInfo.BA_ATK_ROLE_TEXT, WidgetInfo.BA_ATK_ROLE_SPRITE),
	DEFENDER(WidgetInfo.BA_DEF_LISTEN_TEXT, WidgetInfo.BA_DEF_CALL_TEXT, WidgetInfo.BA_DEF_ROLE_TEXT, WidgetInfo.BA_DEF_ROLE_SPRITE),
	COLLECTOR(WidgetInfo.BA_COLL_LISTEN_TEXT, WidgetInfo.BA_COLL_CALL_TEXT, WidgetInfo.BA_COLL_ROLE_TEXT, WidgetInfo.BA_COLL_ROLE_SPRITE),
	HEALER(WidgetInfo.BA_HEAL_LISTEN_TEXT, WidgetInfo.BA_HEAL_CALL_TEXT, WidgetInfo.BA_HEAL_ROLE_TEXT, WidgetInfo.BA_HEAL_ROLE_SPRITE);

	@Getter
	private final WidgetInfo listen;
	@Getter
	private final WidgetInfo call;
	@Getter
	private final WidgetInfo roleText;
	@Getter
	private final WidgetInfo roleSprite;

	private static final ImmutableMap<String, String> CALLS = ImmutableMap.<String, String>builder()
			.put("Red egg", "Tell-red")
			.put("Green egg", "Tell-green")
			.put("Blue egg", "Tell-blue")
			.put("Controlled/Bullet/Wind", "Tell-controlled")
			.put("Accurate/Field/Water", "Tell-accurate")
			.put("Aggressive/Blunt/Earth", "Tell-aggressive")
			.put("Defensive/Barbed/Fire", "Tell-defensive")
			.put("Tofu", "Tell-tofu")
			.put("Crackers", "Tell-crackers")
			.put("Worms", "Tell-worms")
			.put("Pois. Worms", "Tell-worms")
			.put("Pois. Tofu", "Tell-tofu")
			.put("Pois. Meat", "Tell-meat")
			.build();
	private static final ImmutableMap<String, Integer> ITEMS = ImmutableMap.<String, Integer>builder()
			.put("Tofu", ItemID.TOFU)
			.put("Crackers", ItemID.CRACKERS)
			.put("Worms", ItemID.WORMS)
			.put("Pois. Worms", ItemID.POISONED_WORMS)
			.put("Pois. Tofu", ItemID.POISONED_TOFU)
			.put("Pois. Meat", ItemID.POISONED_MEAT)
			.put("Barbed/Fire", ItemID.BARBED_ARROW)
			.put("Blunt/Earth", ItemID.BLUNT_ARROW)
			.put("Field/Water", ItemID.FIELD_ARROW)
			.put("Bullet/Wind", ItemID.BULLET_ARROW)
			.build();


	int getListenItem(Client client)
	{
		Widget listenWidget = client.getWidget(this.getListen());
		if (listenWidget == null)
		{
			return -1;
		}

		return ITEMS.getOrDefault(listenWidget.getText(), -1);
	}

	String getTell(Client client)
	{
		Widget callWidget = client.getWidget(this.getCall());
		if (callWidget == null)
		{
			return "";
		}

		return CALLS.getOrDefault(callWidget.getText(), "");
	}

}
