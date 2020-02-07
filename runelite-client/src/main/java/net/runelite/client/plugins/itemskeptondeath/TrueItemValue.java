package net.runelite.client.plugins.itemskeptondeath;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Set;

import static net.runelite.api.ItemID.*;

@Getter(AccessLevel.PACKAGE)
@RequiredArgsConstructor
public enum TrueItemValue {
	GRANITE_MAUL_HANDLE(GRANITE_MAUL_24225, ImmutableSet.of(ORNATE_MAUL_HANDLE, GRANITE_MAUL)),
	GRANITE_MAUL_HANDLE_OR(GRANITE_MAUL_24227, ImmutableSet.of(ORNATE_MAUL_HANDLE, GRANITE_MAUL, GRANITE_CLAMP)),
	TENTACLE_WHIP(ABYSSAL_TENTACLE, ImmutableSet.of(ABYSSAL_WHIP, KRAKEN_TENTACLE));

	private static final ImmutableMap<Integer, TrueItemValue> TRUE_ITEM_VALUE_MAP;

	private final int itemID;
	private final Set<Integer> deconstructedItem;

	static {
		ImmutableMap.Builder<Integer, TrueItemValue> map = ImmutableMap.builder();
		for (TrueItemValue p : values()) {
			map.put(p.getItemID(), p);
		}
		TRUE_ITEM_VALUE_MAP = map.build();
	}

	public static TrueItemValue map(int itemId) {
		return TRUE_ITEM_VALUE_MAP.getOrDefault(itemId, null);
	}
}

