package net.runelite.mixins;

import net.runelite.api.events.PostItemComposition;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSEvictingDualNodeHashTable;
import net.runelite.rs.api.RSItemComposition;

@Mixin(RSItemComposition.class)
public abstract class RSItemCompositionMixin implements RSItemComposition
{
	private static final int DEFAULT_CUSTOM_SHIFT_CLICK_INDEX = -2;

	@Shadow("client")
	private static RSClient client;

	@Inject
	private int shiftClickActionIndex = DEFAULT_CUSTOM_SHIFT_CLICK_INDEX;

	@MethodHook(value = "<clinit>", end = true)
	@Inject
	public static void rl$clinit()
	{
		RSEvictingDualNodeHashTable cachedModels2 = client.getItemCompositionCache();
		cachedModels2.resize(1024);
	}

	@Inject
	RSItemCompositionMixin()
	{

	}

	@Inject
	@Override
	public boolean isStackable()
	{
		return getIsStackable() != 0;
	}

	@Inject
	@Override
	public void setShiftClickActionIndex(int shiftClickActionIndex)
	{
		this.shiftClickActionIndex = shiftClickActionIndex;
	}

	@Copy("getShiftClickIndex")
	@Replace("getShiftClickIndex")
	public int copy$getShiftClickActionIndex()
	{
		return shiftClickActionIndex == DEFAULT_CUSTOM_SHIFT_CLICK_INDEX ? copy$getShiftClickActionIndex() : shiftClickActionIndex;
	}

	@Inject
	@Override
	public void resetShiftClickActionIndex()
	{
		shiftClickActionIndex = DEFAULT_CUSTOM_SHIFT_CLICK_INDEX;
	}

	@Inject
	@MethodHook(value = "post", end = true)
	public void post()
	{
		final PostItemComposition event = new PostItemComposition(this);
		client.getCallbacks().post(event);
	}

	@Inject
	@Override
	public int getHaPrice()
	{
		int price = getPrice();
		return (int) ((float) price * 0.6f);
	}
}
