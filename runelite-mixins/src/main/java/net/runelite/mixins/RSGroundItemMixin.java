package net.runelite.mixins;

import net.runelite.api.Tile;
import net.runelite.api.events.ItemQuantityChanged;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSGroundItem;

@Mixin(RSGroundItem.class)
public abstract class RSGroundItemMixin implements RSGroundItem
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private int rl$sceneX = -1;

	@Inject
	private int rl$sceneY = -1;

	@Inject
	RSGroundItemMixin()
	{
	}

	@Inject
	@Override
	public Tile getTile()
	{
		int x = rl$sceneX;
		int y = rl$sceneY;

		if (x == -1 || y == -1)
		{
			return null;
		}

		Tile[][][] tiles = client.getScene().getTiles();
		Tile tile = tiles[client.getPlane()][x][y];
		return tile;
	}

	@Inject
	@Override
	public void onUnlink()
	{
		if (rl$sceneX != -1)
		{
			// on despawn, the first item unlinked is the item despawning. However on spawn
			// items can be delinked in order to sort them, so we can't assume the item here is despawning
			if (client.getLastItemDespawn() == null)
			{
				client.setLastItemDespawn(this);
			}
		}
	}

	@Inject
	@FieldHook(value = "quantity", before = true)
	public void quantityChanged(int quantity)
	{
		if (rl$sceneX != -1)
		{
			client.getLogger().debug("Item quantity changed: {} ({} -> {})", getId(), getQuantity(), quantity);

			ItemQuantityChanged itemQuantityChanged = ItemQuantityChanged.INSTANCE;
			itemQuantityChanged.setItem(this);
			itemQuantityChanged.setTile(getTile());
			itemQuantityChanged.setOldQuantity(getQuantity());
			itemQuantityChanged.setNewQuantity(quantity);

			client.getCallbacks().post(itemQuantityChanged);
		}
	}

	@Inject
	@Override
	public int getX()
	{
		return rl$sceneX;
	}

	@Inject
	@Override
	public void setX(int x)
	{
		rl$sceneX = x;
	}

	@Inject
	@Override
	public int getY()
	{
		return rl$sceneY;
	}

	@Inject
	@Override
	public void setY(int y)
	{
		rl$sceneY = y;
	}
}
