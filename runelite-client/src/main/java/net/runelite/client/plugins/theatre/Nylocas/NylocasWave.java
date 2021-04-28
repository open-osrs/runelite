/*
 * THIS PLUGIN WAS WRITTEN BY A KEYBOARD-WIELDING MONKEY BOI BUT SHUFFLED BY A KANGAROO WITH THUMBS.
 * The plugin and it's refactoring was intended for xKylee's Externals but I'm sure if you're reading this, you're probably planning to yoink..
 * or you're just genuinely curious. If you're trying to yoink, it doesn't surprise me.. just don't claim it as your own. Cheers.
 */

package net.runelite.client.plugins.theatre.Nylocas;

import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.HashSet;
import lombok.Getter;

public class NylocasWave
{
	public static final int MAX_WAVE = 31;

	static final ImmutableMap<Integer, NylocasWave> waves = ImmutableMap.<Integer, NylocasWave>builder()
		.put(1, new NylocasWave(1, new NyloNPC[]{
			new NyloNPC(NylocasType.RANGE_SMALL, NylocasSpawnPoint.WEST_SOUTH, true),
			new NyloNPC(NylocasType.MAGE_SMALL, NylocasSpawnPoint.SOUTH_EAST),
			new NyloNPC(NylocasType.MELEE_SMALL, NylocasSpawnPoint.EAST_NORTH)}))
		.put(2, new NylocasWave(2, new NyloNPC[]{
			new NyloNPC(NylocasType.MAGE_SMALL, NylocasSpawnPoint.WEST_NORTH),
			new NyloNPC(NylocasType.MELEE_SMALL, NylocasSpawnPoint.SOUTH_WEST, true),
			new NyloNPC(NylocasType.RANGE_SMALL, NylocasSpawnPoint.EAST_SOUTH)}))
		.put(3, new NylocasWave(3, new NyloNPC[]{
			new NyloNPC(NylocasType.MELEE_SMALL, NylocasSpawnPoint.WEST_SOUTH),
			new NyloNPC(NylocasType.RANGE_SMALL, NylocasSpawnPoint.SOUTH_EAST),
			new NyloNPC(NylocasType.MAGE_SMALL, NylocasSpawnPoint.EAST_NORTH, true)}))
		.put(4, new NylocasWave(4, new NyloNPC[]{
			new NyloNPC(NylocasType.RANGE_SMALL, NylocasSpawnPoint.WEST_NORTH),
			new NyloNPC(NylocasType.MAGE_BIG, NylocasSpawnPoint.SOUTH_BIG),
			new NyloNPC(NylocasType.MELEE_SMALL, NylocasSpawnPoint.EAST_SOUTH)}))
		.put(5, new NylocasWave(5, 16, new NyloNPC[]{
			new NyloNPC(NylocasType.RANGE_BIG, NylocasSpawnPoint.WEST_BIG),
			new NyloNPC(NylocasType.MELEE_SMALL, NylocasSpawnPoint.SOUTH_EAST),
			new NyloNPC(NylocasType.MAGE_SMALL, NylocasSpawnPoint.EAST_NORTH)}))
		.put(6, new NylocasWave(6, new NyloNPC[]{
			new NyloNPC(NylocasType.MAGE_SMALL, NylocasSpawnPoint.WEST_NORTH),
			new NyloNPC(NylocasType.RANGE_SMALL, NylocasSpawnPoint.SOUTH_WEST),
			new NyloNPC(NylocasType.MELEE_BIG, NylocasSpawnPoint.EAST_NORTH)}))
		.put(7, new NylocasWave(7, 12, new NyloNPC[]{
			new NyloNPC(NylocasType.MAGE_SMALL, NylocasSpawnPoint.SOUTH_EAST),
			new NyloNPC(NylocasType.RANGE_BIG, NylocasSpawnPoint.SOUTH_BIG, true),
			new NyloNPC(NylocasType.MELEE_SMALL, NylocasSpawnPoint.EAST_NORTH)}))
		.put(8, new NylocasWave(8, new NyloNPC[]{
			new NyloNPC(NylocasType.MAGE_BIG, NylocasSpawnPoint.WEST_BIG, true),
			new NyloNPC(NylocasType.MELEE_SMALL, NylocasSpawnPoint.SOUTH_WEST),
			new NyloNPC(NylocasType.RANGE_SMALL, NylocasSpawnPoint.EAST_SOUTH)}))
		.put(9, new NylocasWave(9, 12, new NyloNPC[]{
			new NyloNPC(NylocasType.RANGE_BIG, NylocasSpawnPoint.WEST_BIG, true),
			new NyloNPC(NylocasType.MELEE_SMALL, NylocasSpawnPoint.WEST_SOUTH),
			new NyloNPC(NylocasType.MAGE_SMALL, NylocasSpawnPoint.EAST_NORTH)}))
		.put(10, new NylocasWave(10, 8, new NyloNPC[]{
			new NyloNPC(NylocasType.RANGE_SMALL, NylocasSpawnPoint.WEST_NORTH),
			new NyloNPC(NylocasType.RANGE_SMALL, NylocasSpawnPoint.WEST_SOUTH, true),
			new NyloNPC(NylocasType.RANGE_SMALL, NylocasSpawnPoint.SOUTH_WEST),
			new NyloNPC(NylocasType.RANGE_SMALL, NylocasSpawnPoint.SOUTH_EAST),
			new NyloNPC(NylocasType.RANGE_SMALL, NylocasSpawnPoint.EAST_NORTH, true),
			new NyloNPC(NylocasType.RANGE_BIG, NylocasSpawnPoint.EAST_NORTH)}))
		.put(11, new NylocasWave(11, 8, new NyloNPC[]{
			new NyloNPC(NylocasType.MAGE_BIG, NylocasSpawnPoint.WEST_BIG, true),
			new NyloNPC(NylocasType.MAGE_SMALL, NylocasSpawnPoint.SOUTH_WEST),
			new NyloNPC(NylocasType.MAGE_SMALL, NylocasSpawnPoint.SOUTH_EAST),
			new NyloNPC(NylocasType.MAGE_SMALL, NylocasSpawnPoint.EAST_NORTH, true),
			new NyloNPC(NylocasType.MAGE_SMALL, NylocasSpawnPoint.EAST_SOUTH)}))
		.put(12, new NylocasWave(12, 8, new NyloNPC[]{
			new NyloNPC(NylocasType.MELEE_SMALL, NylocasSpawnPoint.WEST_NORTH),
			new NyloNPC(NylocasType.MELEE_SMALL, NylocasSpawnPoint.WEST_SOUTH, true),
			new NyloNPC(NylocasType.MELEE_BIG, NylocasSpawnPoint.SOUTH_BIG),
			new NyloNPC(NylocasType.MELEE_SMALL, NylocasSpawnPoint.EAST_NORTH, true),
			new NyloNPC(NylocasType.MELEE_SMALL, NylocasSpawnPoint.EAST_SOUTH)}))
		.put(13, new NylocasWave(13, 8, new NyloNPC[]{
			new NyloNPC(NylocasType.RANGE_SMALL, NylocasSpawnPoint.WEST_NORTH),
			new NyloNPC(NylocasType.MAGE_SMALL, NylocasSpawnPoint.WEST_SOUTH, true),
			new NyloNPC(NylocasType.MELEE_SMALL, NylocasSpawnPoint.SOUTH_WEST),
			new NyloNPC(NylocasType.RANGE_SMALL, NylocasSpawnPoint.SOUTH_EAST),
			new NyloNPC(NylocasType.MELEE_BIG, NylocasSpawnPoint.EAST_NORTH, true)}))
		.put(14, new NylocasWave(14, 8, new NyloNPC[]{
			new NyloNPC(NylocasType.MAGE_SMALL, NylocasSpawnPoint.WEST_NORTH),
			new NyloNPC(NylocasType.MELEE_SMALL, NylocasSpawnPoint.WEST_SOUTH, true),
			new NyloNPC(NylocasType.RANGE_SMALL, NylocasSpawnPoint.SOUTH_WEST),
			new NyloNPC(NylocasType.MAGE_SMALL, NylocasSpawnPoint.SOUTH_EAST),
			new NyloNPC(NylocasType.RANGE_BIG, NylocasSpawnPoint.EAST_NORTH, true)}))
		.put(15, new NylocasWave(15, 8, new NyloNPC[]{
			new NyloNPC(NylocasType.MELEE_SMALL, NylocasSpawnPoint.WEST_NORTH),
			new NyloNPC(NylocasType.RANGE_SMALL, NylocasSpawnPoint.WEST_SOUTH, true),
			new NyloNPC(NylocasType.MAGE_BIG, NylocasSpawnPoint.SOUTH_BIG),
			new NyloNPC(NylocasType.MAGE_SMALL, NylocasSpawnPoint.EAST_NORTH, true),
			new NyloNPC(NylocasType.RANGE_SMALL, NylocasSpawnPoint.EAST_SOUTH)}))
		.put(16, new NylocasWave(16, new NyloNPC[]{
			new NyloNPC(NylocasType.RANGE_SMALL, NylocasSpawnPoint.WEST_NORTH),
			new NyloNPC(NylocasType.MELEE_SMALL, NylocasSpawnPoint.SOUTH_WEST),
			new NyloNPC(NylocasType.MAGE_SMALL, NylocasSpawnPoint.EAST_SOUTH)}))
		.put(17, new NylocasWave(17, 12, new NyloNPC[]{
			new NyloNPC(NylocasType.MAGE_BIG, NylocasSpawnPoint.WEST_BIG),
			new NyloNPC(NylocasType.MAGE_BIG, NylocasSpawnPoint.SOUTH_BIG),
			new NyloNPC(NylocasType.MAGE_BIG, NylocasSpawnPoint.EAST_NORTH)}))
		.put(18, new NylocasWave(18, 8, new NyloNPC[]{
			new NyloNPC(NylocasType.RANGE_BIG, NylocasSpawnPoint.WEST_BIG, true),
			new NyloNPC(NylocasType.RANGE_BIG, NylocasSpawnPoint.SOUTH_BIG),
			new NyloNPC(NylocasType.RANGE_BIG, NylocasSpawnPoint.EAST_NORTH)}))
		.put(19, new NylocasWave(19, 12, new NyloNPC[]{
			new NyloNPC(NylocasType.MAGE_BIG, NylocasSpawnPoint.WEST_BIG),
			new NyloNPC(NylocasType.MAGE_BIG, NylocasSpawnPoint.SOUTH_BIG),
			new NyloNPC(NylocasType.MAGE_BIG, NylocasSpawnPoint.EAST_NORTH, true)}))
		.put(20, new NylocasWave(20, 16, new NyloNPC[]{
			new NyloNPC(NylocasType.MELEE_BIG, NylocasSpawnPoint.WEST_BIG),
			new NyloNPC(NylocasType.MAGE_BIG, NylocasSpawnPoint.SOUTH_BIG, true),
			new NyloNPC(NylocasType.MELEE_BIG, NylocasSpawnPoint.EAST_NORTH)}))
		.put(21, new NylocasWave(21, 8, new NyloNPC[]{
			new NyloNPC(NylocasType.MAGE_SMALL, NylocasSpawnPoint.WEST_NORTH),
			new NyloNPC(NylocasType.MAGE_SMALL, NylocasSpawnPoint.WEST_SOUTH),
			new NyloNPC(NylocasType.MELEE_SMALL, NylocasSpawnPoint.SOUTH_WEST, true),
			new NyloNPC(NylocasType.MELEE_SMALL, NylocasSpawnPoint.SOUTH_EAST),
			new NyloNPC(NylocasType.RANGE_SMALL, NylocasSpawnPoint.EAST_NORTH),
			new NyloNPC(NylocasType.RANGE_SMALL, NylocasSpawnPoint.EAST_SOUTH, true)}))
		.put(22, new NylocasWave(22, 12, new NyloNPC[]{
			new NyloNPC(NylocasType.MELEE_BIG, NylocasSpawnPoint.WEST_BIG),
			new NyloNPC(NylocasType.MAGE_SMALL, NylocasSpawnPoint.SOUTH_WEST),
			new NyloNPC(NylocasType.RANGE_SMALL, NylocasSpawnPoint.SOUTH_EAST),
			new NyloNPC(NylocasType.MAGE_BIG, NylocasSpawnPoint.EAST_NORTH, true)}))
		.put(23, new NylocasWave(23, 8, new NyloNPC[]{
			new NyloNPC(NylocasType.MAGE_SMALL, NylocasSpawnPoint.WEST_NORTH),
			new NyloNPC(NylocasType.RANGE_SMALL, NylocasSpawnPoint.WEST_SOUTH),
			new NyloNPC(NylocasType.RANGE_BIG, NylocasSpawnPoint.SOUTH_BIG, true),
			new NyloNPC(NylocasType.MAGE_BIG, NylocasSpawnPoint.EAST_NORTH)}))
		.put(24, new NylocasWave(24, 8, new NyloNPC[]{
			new NyloNPC(NylocasType.RANGE_BIG, NylocasSpawnPoint.WEST_BIG, true),
			new NyloNPC(NylocasType.MAGE_BIG, NylocasSpawnPoint.SOUTH_BIG, true),
			new NyloNPC(NylocasType.MELEE_BIG, NylocasSpawnPoint.EAST_NORTH, true)}))
		.put(25, new NylocasWave(25, 8, new NyloNPC[]{
			new NyloNPC(NylocasType.MELEE_BIG, NylocasSpawnPoint.WEST_BIG, true),
			new NyloNPC(NylocasType.RANGE_BIG, NylocasSpawnPoint.SOUTH_BIG),
			new NyloNPC(NylocasType.MAGE_BIG, NylocasSpawnPoint.EAST_NORTH)}))
		.put(26, new NylocasWave(26, new NyloNPC[]{
			new NyloNPC(NylocasType.MAGE_BIG, NylocasSpawnPoint.WEST_BIG, true),
			new NyloNPC(NylocasType.MELEE_BIG, NylocasSpawnPoint.SOUTH_BIG),
			new NyloNPC(NylocasType.MAGE_BIG, NylocasSpawnPoint.EAST_NORTH)}))
		.put(27, new NylocasWave(27, 8, new NyloNPC[]{
			new NyloNPC(NylocasType.MAGE_BIG, NylocasSpawnPoint.WEST_BIG),
			new NyloNPC(NylocasType.MELEE_BIG, NylocasSpawnPoint.SOUTH_BIG, true),
			new NyloNPC(NylocasType.MAGE_BIG, NylocasSpawnPoint.EAST_NORTH)}))
		.put(28, new NylocasWave(28, new NyloNPC[]{
			new NyloNPC(NylocasType.MELEE_SMALL, NylocasSpawnPoint.WEST_NORTH),
			new NyloNPC(NylocasType.RANGE_SMALL, NylocasSpawnPoint.WEST_SOUTH, true),
			new NyloNPC(NylocasType.MAGE_SMALL, NylocasSpawnPoint.SOUTH_WEST),
			new NyloNPC(NylocasType.MELEE_SMALL, NylocasSpawnPoint.SOUTH_EAST),
			new NyloNPC(NylocasType.MAGE_SMALL, NylocasSpawnPoint.EAST_NORTH),
			new NyloNPC(NylocasType.RANGE_SMALL, NylocasSpawnPoint.EAST_SOUTH)}))
		.put(29, new NylocasWave(29, new NyloNPC[]{
			new NyloNPC(NylocasType.MELEE_SMALL, NylocasSpawnPoint.WEST_NORTH, true),
			new NyloNPC(NylocasType.RANGE_SMALL, NylocasSpawnPoint.WEST_SOUTH),
			new NyloNPC(NylocasType.MELEE_BIG, NylocasSpawnPoint.SOUTH_BIG),
			new NyloNPC(NylocasType.MAGE_SMALL, NylocasSpawnPoint.EAST_NORTH),
			new NyloNPC(NylocasType.RANGE_SMALL, NylocasSpawnPoint.EAST_SOUTH, true)}))
		.put(30, new NylocasWave(30, new NyloNPC[]{
			new NyloNPC(NylocasType.RANGE_BIG, NylocasSpawnPoint.WEST_BIG),
			new NyloNPC(NylocasType.MAGE_SMALL, NylocasSpawnPoint.SOUTH_WEST),
			new NyloNPC(NylocasType.MELEE_SMALL, NylocasSpawnPoint.SOUTH_EAST),
			new NyloNPC(NylocasType.MAGE_BIG, NylocasSpawnPoint.EAST_BIG, true)}))
		.put(31, new NylocasWave(31, new NyloNPC[]{
			new NyloNPC(NylocasType.MELEE_SMALL, NylocasSpawnPoint.WEST_NORTH),
			new NyloNPC(NylocasType.RANGE_SMALL, NylocasSpawnPoint.WEST_SOUTH),
			new NyloNPC(NylocasType.MAGE_SMALL, NylocasSpawnPoint.SOUTH_WEST),
			new NyloNPC(NylocasType.MELEE_SMALL, NylocasSpawnPoint.SOUTH_EAST),
			new NyloNPC(NylocasType.MAGE_SMALL, NylocasSpawnPoint.EAST_NORTH),
			new NyloNPC(NylocasType.RANGE_SMALL, NylocasSpawnPoint.EAST_SOUTH)}))
		.build();

	static final ImmutableMap<Integer, String[]> wavesHelper = ImmutableMap.<Integer, String[]>builder()
			.put(1, new String[]{"melee", "mage", "range"})
			.put(2, new String[]{"range", "melee", "mage"})
			.put(3, new String[]{"mage", "range", "melee"})
			.put(4, new String[]{"melee", "MAGE", "range"})
			.put(5, new String[]{"mage", "melee", "RANGE"})
			.put(6, new String[]{"MELEE", "range", "mage"})
			.put(7, new String[]{"melee", "RANGE|mage", ""})
			.put(8, new String[]{"range", "melee", "MAGE"})
			.put(9, new String[]{"mage", "", "RANGE|melee"})
			.put(10, new String[]{"RANGE|range", "range|range", "range|range"})
			.put(11, new String[]{"MAGE|mage", "mage|mage", "MAGE"})
			.put(12, new String[]{"melee|melee", "MELEE", "melee|melee"})
			.put(13, new String[]{"MELEE", "range|melee", "mage|range"})
			.put(14, new String[]{"RANGE", "mage|range", "melee|mage"})
			.put(15, new String[]{"mage|range", "MAGE", "range|melee"})
			.put(16, new String[]{"mage-melee-range", "melee-mage-range", "range-mage-range"})
			.put(17, new String[]{"MAGE-MELEE-MAGE", "MAGE-MELEE-MAGE", "MAGE-MELEE-MAGE"})
			.put(18, new String[]{"RANGE-MAGE-RANGE", "RANGE-MAGE-RANGE", "RANGE-MELEE-RANGE"})
			.put(19, new String[]{"MAGE-MELEE-MAGE", "MAGE-MELEE-MAGE", "MAGE-MELEE-MAGE"})
			.put(20, new String[]{"MELEE-RANGE-MELEE", "MAGE-RANGE-MELEE", "MELEE-RANGE-MELEE"})
			.put(21, new String[]{"range-melee-range|range-melee-range", "melee-mage-melee|melee-range-melee", "mage-melee-range|mage-range-mage"})
			.put(22, new String[]{"MAGE-RANGE-MELEE", "range-mage-melee|mage-range-melee", "MELEE-RANGE-MELEE"})
			.put(23, new String[]{"MAGE-RANGE-MELEE", "RANGE-MAGE-MELEE", "range-mage-range|mage-range-melee"})
			.put(24, new String[]{"MELEE", "MAGE", "RANGE-MAGE-MELEE"})
			.put(25, new String[]{"MAGE-MELEE-MAGE", "RANGE", "MELEE"})
			.put(26, new String[]{"MAGE", "MELEE-MAGE-MELEE", "MAGE"})
			.put(27, new String[]{"MAGE-MELEE-MAGE", "MELEE-MAGE-RANGE", "MAGE"})
			.put(28, new String[]{"mage-melee-mage|range-mage-melee", "melee-range-melee|mage-melee-range", "range-melee-mage|melee-mage-melee"})
			.put(29, new String[]{"mage-range-melee|range-melee-mage", "MELEE", "range-melee-range|melee-range-mage"})
			.put(30, new String[]{"MAGE", "melee-range-melee|mage-range-melee", "RANGE-MELEE-RANGE"})
			.put(31, new String[]{"mage-range-mage|range-melee-range", "melee-mage-range|mage-melee-range", "range-mage-range|melee-range-mage"})
			.build();

	@Getter
	private final int wave;

	@Getter
	private final HashSet<NyloNPC> waveData;

	@Getter
	private final int waveDelay;

	private NylocasWave(int wave, NyloNPC[] waveData)
	{
		this(wave, 4, waveData);
	}

	private NylocasWave(int wave, int waveDelay, NyloNPC[] waveData)
	{
		this.wave = wave;
		this.waveData = new HashSet<>(Arrays.asList(waveData));
		this.waveDelay = waveDelay;
	}
}
