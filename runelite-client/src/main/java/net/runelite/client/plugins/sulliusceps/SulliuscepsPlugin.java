package net.runelite.client.plugins.sulliusceps;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.ItemContainer;
import net.runelite.api.Varbits;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Arrays;
import java.util.Set;

import static net.runelite.api.ObjectID.THICK_VINE;
import static net.runelite.api.ObjectID.THICK_VINES;
import static net.runelite.api.ObjectID.VINES_30644;

import static net.runelite.api.ItemID.MUSHROOM;
import static net.runelite.api.ItemID.MORT_MYRE_FUNGUS;
import static net.runelite.api.ItemID.SULLIUSCEP_CAP;

@PluginDescriptor(
		name = "Sulliusceps",
		description = "Show helpful information around Sulliuscep trees.",
		tags = {"sull", "sulliuscep", "woodcut", "wc", "skilling", "overlay"},
		enabledByDefault = false,
		type = PluginType.SKILLING
)

@Slf4j
@Singleton
public class SulliuscepsPlugin extends Plugin
{

	private static final Set<Integer> SULLIUSCEP_REGIONS = ImmutableSet.of(14650, 14651);

	private static final Set<Integer> FUNGI = ImmutableSet.of(MUSHROOM, MORT_MYRE_FUNGUS, SULLIUSCEP_CAP);

	//TODO: Vines overlay with Pickaxes + Rakes.
	private static final Set<Integer> VINES_CUT = ImmutableSet.of(THICK_VINE, THICK_VINES);
	private static final Set<Integer> VINES_RAKE = ImmutableSet.of(VINES_30644);

	@Inject
	private Client client;

	@Inject
	private EventBus eventBus;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private SulliuscepsFungiOverlay sulliuscepsFungiOverlay;

	@Inject
	private SulliuscepSession session;

	private boolean shouldUpdateFungi;
	private Multiset<Integer> inventorySnapshot;
	private int sulliuscepVarLocation;

	@Override
	protected void startUp()
	{
		addSubscriptions();
		overlayManager.add(sulliuscepsFungiOverlay);
	}

	@Override
	protected void shutDown()
	{
		eventBus.unregister(this);
		overlayManager.remove(sulliuscepsFungiOverlay);
	}

	private void addSubscriptions()
	{
		eventBus.subscribe(VarbitChanged.class, this, this::onVarbitChanged);
		eventBus.subscribe(GameTick.class, this, this::onGameTick);
		eventBus.subscribe(ItemContainerChanged.class, this, this::onItemContainerChanged);
	}

	private void onGameTick(final GameTick event)
	{
		if (!isInRegion())
		{
			return;
		}
		if (getLocation(sulliuscepVarLocation) != null)
		{
			if (client.getHintArrowPoint() == null)
			{
				client.setHintArrow(getLocation(sulliuscepVarLocation));
			}
		}
	}

	private void onVarbitChanged(VarbitChanged event)
	{
		if (isInRegion())
		{
			client.clearHintArrow();
			sulliuscepVarLocation = client.getVar(Varbits.SULLIUSCEP_LOCATION);
			ItemContainer itemContainer = client.getItemContainer(InventoryID.INVENTORY);
			if (itemContainer != null)
			{
				inventorySnapshot = HashMultiset.create();
				Arrays.stream(itemContainer.getItems())
						.filter(item -> FUNGI.contains(item.getId()))
						.forEach(item -> inventorySnapshot.add(item.getId(), item.getQuantity()));
			}
		}
	}

	private void onItemContainerChanged(ItemContainerChanged event)
	{
		final ItemContainer container = event.getItemContainer();

		if (!isInRegion() || inventorySnapshot == null || container != client.getItemContainer(InventoryID.INVENTORY))
		{
			return;
		}

		Multiset<Integer> current = HashMultiset.create();

		Arrays.stream(container.getItems())
				.filter(item -> FUNGI.contains(item.getId()))
				.forEach(item -> current.add(item.getId(), item.getQuantity()));
		Multiset<Integer> delta = Multisets.difference(current, inventorySnapshot);

		delta.forEachEntry(session::updateFungiFound);

		inventorySnapshot = null;
	}

	public boolean isInRegion()
	{
		return client.getLocalPlayer() != null
				&& SULLIUSCEP_REGIONS.contains(client.getLocalPlayer().getWorldLocation().getRegionID());
	}


	private WorldPoint getLocation(int varbit)
	{
		switch (varbit)
		{
			case 1:
				return new WorldPoint(3678, 3733, 0);
			case 2:
				return new WorldPoint(3683, 3775, 0);
			case 3:
				return new WorldPoint(3663, 3781, 0);
			case 4:
				return new WorldPoint(3663, 3802, 0);
			case 5:
				return new WorldPoint(3678, 3806, 0);
			default:
				return new WorldPoint(3683, 3758, 0);
		}

	}

}