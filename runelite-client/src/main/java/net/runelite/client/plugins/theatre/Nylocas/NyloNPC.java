/*
 * THIS PLUGIN WAS WRITTEN BY A KEYBOARD-WIELDING MONKEY BOI BUT SHUFFLED BY A KANGAROO WITH THUMBS.
 * The plugin and it's refactoring was intended for xKylee's Externals but I'm sure if you're reading this, you're probably planning to yoink..
 * or you're just genuinely curious. If you're trying to yoink, it doesn't surprise me.. just don't claim it as your own. Cheers.
 */

package net.runelite.client.plugins.theatre.Nylocas;

import java.util.Objects;
import lombok.Data;

@Data
class NyloNPC
{
	private NylocasType nyloType;

	private NylocasSpawnPoint spawnPoint;

	private boolean aggressive = false;

	NyloNPC(NylocasType nyloType, NylocasSpawnPoint nylocasSpawnPoint)
	{
		this.nyloType = nyloType;
		this.spawnPoint = nylocasSpawnPoint;
	}

	NyloNPC(NylocasType nyloType, NylocasSpawnPoint nylocasSpawnPoint, boolean aggressive)
	{
		this(nyloType, nylocasSpawnPoint);
		this.aggressive = aggressive;
	}

	@Override
	public boolean equals(Object other)
	{
		if (!(other instanceof NyloNPC))
		{
			return false;
		}
		NyloNPC otherNpc = (NyloNPC) other;
		return nyloType.equals(otherNpc.getNyloType()) && spawnPoint.equals(otherNpc.getSpawnPoint());
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(nyloType, spawnPoint);
	}
}
