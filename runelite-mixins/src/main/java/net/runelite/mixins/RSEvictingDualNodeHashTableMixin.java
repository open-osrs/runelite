package net.runelite.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSEvictingDualNodeHashTable;
import net.runelite.rs.api.RSIterableNodeHashTable;

@Mixin(RSEvictingDualNodeHashTable.class)
public abstract class RSEvictingDualNodeHashTableMixin implements RSEvictingDualNodeHashTable
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	public float threshold;

	@Inject
	public int tmpCapacity;

	@Inject
	RSEvictingDualNodeHashTableMixin()
	{
		setTmpCapacity(this.getCapacity());
	}

	@Inject
	public float getThreshold()
	{
		return threshold;
	}

	@Inject
	public void setThreshold(float threshold)
	{
		this.threshold = threshold;
	}

	@Inject
	public int getTmpCapacity()
	{
		return tmpCapacity;
	}

	@Inject
	public void setTmpCapacity(int tmpCapacity)
	{
		this.tmpCapacity = tmpCapacity;
	}

	@Inject
	public boolean isTrashing()
	{
		return this.getRemainingCapacity() <= 0 && this.getDualNode().previousDual() == null;
	}

	@Inject
	public void resize(int newSize)
	{
		this.increaseCapacity(newSize);
		this.tmpCapacity = this.getCapacity();
	}

	@Inject
	public void increaseCapacity(int newSize)
	{
		if (newSize > this.getCapacity())
		{
			int i;

			for (i = 1; i < newSize; i += i)
			{
				// ignore
			}

			this.setCapacity(i);
			this.reset();

			RSIterableNodeHashTable iterableNodeHashTable = client.createIterableNodeHashTable(i);
			this.setHashTable(iterableNodeHashTable);
		}
	}
}
