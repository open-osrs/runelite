package net.runelite.api.queries;

import java.util.Objects;
import java.util.stream.Collectors;
import net.runelite.api.Client;
import net.runelite.api.LocatableQueryResults;
import net.runelite.api.Tile;

public class TileQuery extends TileObjectQuery<Tile, TileQuery>
{
	@Override
	public LocatableQueryResults<Tile> result(Client client)
	{
		return new LocatableQueryResults<>(getTiles(client).stream()
			.filter(Objects::nonNull)
			.filter(predicate)
			.distinct()
			.collect(Collectors.toList()));
	}

}