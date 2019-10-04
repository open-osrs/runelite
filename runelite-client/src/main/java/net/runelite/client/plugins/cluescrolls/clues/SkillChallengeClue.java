/*
 * Copyright (c) 2019 Hydrox6 <ikada@protonmail.ch>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.cluescrolls.clues;

import com.google.common.collect.ImmutableSet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.ItemID;
import net.runelite.api.NPC;
import net.runelite.client.plugins.cluescrolls.ClueScrollPlugin;
import net.runelite.client.plugins.cluescrolls.clues.item.AnyRequirementCollection;
import static net.runelite.client.plugins.cluescrolls.clues.item.ItemRequirements.*;
import net.runelite.client.plugins.cluescrolls.clues.item.ItemRequirement;
import net.runelite.client.plugins.cluescrolls.clues.item.SingleItemRequirement;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import static net.runelite.client.plugins.cluescrolls.ClueScrollOverlay.TITLED_CONTENT_COLOR;
import static net.runelite.client.plugins.cluescrolls.ClueScrollWorldOverlay.IMAGE_Z_OFFSET;

@Getter
public class SkillChallengeClue extends ClueScroll implements NpcClueScroll
{
	@AllArgsConstructor
	@Getter
	enum ChallengeType
	{
		CHARLIE("Charlie the Tramp", "Southern Entrance to Varrock"),
		SHERLOCK("Sherlock", "East of the Sorcerer's Tower in Seers' Village");

		private String name;
		private String location;
	}

	private static final AnyRequirementCollection ANY_PICKAXE = any("Any Pickaxe",
		item(ItemID.BRONZE_PICKAXE),
		item(ItemID.IRON_PICKAXE),
		item(ItemID.STEEL_PICKAXE),
		item(ItemID.BLACK_PICKAXE),
		item(ItemID.MITHRIL_PICKAXE),
		item(ItemID.ADAMANT_PICKAXE),
		item(ItemID.RUNE_PICKAXE),
		item(ItemID.DRAGON_PICKAXE),
		item(ItemID.DRAGON_PICKAXE_12797),
		item(ItemID.DRAGON_PICKAXEOR),
		item(ItemID.INFERNAL_PICKAXE),
		item(ItemID.INFERNAL_PICKAXE_UNCHARGED),
		item(ItemID.GILDED_PICKAXE),
		item(ItemID._3RD_AGE_PICKAXE),
		item(ItemID.CRYSTAL_PICKAXE)
	);

	private static final AnyRequirementCollection ANY_AXE = any("Any Axe",
		item(ItemID.BRONZE_AXE),
		item(ItemID.IRON_AXE),
		item(ItemID.STEEL_AXE),
		item(ItemID.BLACK_AXE),
		item(ItemID.MITHRIL_AXE),
		item(ItemID.ADAMANT_AXE),
		item(ItemID.RUNE_AXE),
		item(ItemID.DRAGON_AXE),
		item(ItemID.INFERNAL_AXE),
		item(ItemID.INFERNAL_AXE_UNCHARGED),
		item(ItemID.GILDED_AXE),
		item(ItemID._3RD_AGE_AXE),
		item(ItemID.CRYSTAL_AXE)
	);

	private static final AnyRequirementCollection ANY_HARPOON = any("Harpoon",
		item(ItemID.HARPOON),
		item(ItemID.BARBTAIL_HARPOON),
		item(ItemID.DRAGON_HARPOON),
		item(ItemID.INFERNAL_HARPOON),
		item(ItemID.INFERNAL_HARPOON_UNCHARGED),
		item(ItemID.CRYSTAL_HARPOON)
	);

	private static final Set<SkillChallengeClue> CLUES = ImmutableSet.of(
		// Charlie Tasks
		new SkillChallengeClue("Cook a Pike", "i need to cook charlie a pike.", "i need to take the cooked pike to charlie.", item(ItemID.PIKE), item(ItemID.RAW_PIKE)),
		new SkillChallengeClue("Cook a Trout", "i need to cook charlie a trout.", "i need to take the cooked trout to charlie.", item(ItemID.TROUT), item(ItemID.RAW_TROUT)),
		new SkillChallengeClue("Craft a Leather Body", "i need to craft charlie a leather body.", "i need to take the leather body i crafted to charlie.", item(ItemID.LEATHER_BODY), item(ItemID.LEATHER), item(ItemID.NEEDLE), item(ItemID.THREAD)),
		new SkillChallengeClue("Craft some Leather Chaps", "i need to craft charlie some leather chaps.", "i need to take the leather chaps i crafted to charlie.", item(ItemID.LEATHER_CHAPS), item(ItemID.LEATHER), item(ItemID.NEEDLE), item(ItemID.THREAD)),
		new SkillChallengeClue("Fish a Herring", "i need to fish charlie a herring.", "i need to take a raw herring to charlie.", item(ItemID.RAW_HERRING), any("Fishing rod", item(ItemID.FISHING_ROD), item(ItemID.PEARL_FISHING_ROD)), item(ItemID.FISHING_BAIT)),
		new SkillChallengeClue("Fish a Trout", "i need to fish charlie a trout.", "i need to take a raw trout to charlie.", item(ItemID.RAW_TROUT), any("Fly fishing rod", item(ItemID.FLY_FISHING_ROD), item(ItemID.PEARL_FLY_FISHING_ROD)), item(ItemID.FEATHER)),
		new SkillChallengeClue("Mine a piece of Iron Ore", "i need to mine charlie a piece of iron ore from an iron vein.", "i need to take the iron ore to charlie.", item(ItemID.IRON_ORE), ANY_PICKAXE),
		new SkillChallengeClue("Smith an Iron Dagger", "i need to smith charlie one iron dagger.", "i need to take the iron dagger i smithed to charlie.", item(ItemID.IRON_DAGGER), item(ItemID.IRON_BAR), item(ItemID.HAMMER)),
		// Elite Sherlock Tasks
		new SkillChallengeClue("Equip a Dragon Scimitar.", true, any("Any Dragon Scimitar", item(ItemID.DRAGON_SCIMITAR), item(ItemID.DRAGON_SCIMITAR_OR))),
		new SkillChallengeClue("Enchant some Dragonstone Jewellery.", "enchant a piece of dragonstone jewellery.",
			xOfItem(ItemID.COSMIC_RUNE, 1),
			any("Water Rune x15", xOfItem(ItemID.WATER_RUNE, 15), xOfItem(ItemID.MIST_RUNE, 15), xOfItem(ItemID.MUD_RUNE, 15), xOfItem(ItemID.STEAM_RUNE, 15), item(ItemID.STAFF_OF_WATER), item(ItemID.WATER_BATTLESTAFF), item(ItemID.MYSTIC_WATER_STAFF), item(ItemID.MUD_BATTLESTAFF), item(ItemID.MYSTIC_MUD_STAFF), item(ItemID.MIST_BATTLESTAFF), item(ItemID.MYSTIC_MIST_STAFF), item(ItemID.STEAM_BATTLESTAFF), item(ItemID.MYSTIC_STEAM_STAFF), item(ItemID.STEAM_BATTLESTAFF_12795), item(ItemID.MYSTIC_STEAM_STAFF_12796), item(ItemID.KODAI_WAND)),
			any("Earth Rune x15", xOfItem(ItemID.EARTH_RUNE, 15), xOfItem(ItemID.DUST_RUNE, 15), xOfItem(ItemID.MUD_RUNE, 15), xOfItem(ItemID.LAVA_RUNE, 15), item(ItemID.STAFF_OF_EARTH), item(ItemID.EARTH_BATTLESTAFF), item(ItemID.MYSTIC_EARTH_STAFF), item(ItemID.MUD_BATTLESTAFF), item(ItemID.MYSTIC_MUD_STAFF), item(ItemID.DUST_BATTLESTAFF), item(ItemID.MYSTIC_DUST_STAFF), item(ItemID.LAVA_BATTLESTAFF), item(ItemID.MYSTIC_LAVA_STAFF), item(ItemID.LAVA_BATTLESTAFF_21198), item(ItemID.MYSTIC_LAVA_STAFF_21200)),
			any("Unenchanted Dragonstone Jewellery", item(ItemID.DRAGONSTONE_RING), item(ItemID.DRAGON_NECKLACE), item(ItemID.DRAGON_BRACELET), item(ItemID.DRAGONSTONE_AMULET))),
		new SkillChallengeClue("Craft a nature rune.", item(ItemID.PURE_ESSENCE)),
		new SkillChallengeClue("Catch a mottled eel with aerial fishing in Lake Molch.", any("Fish chunks or King worms", item(ItemID.FISH_CHUNKS), item(ItemID.KING_WORM)), emptySlot("No Gloves", EquipmentInventorySlot.GLOVES)),
		new SkillChallengeClue("Score a goal in skullball.", true, any("Ring of Charos", item(ItemID.RING_OF_CHAROS), item(ItemID.RING_OF_CHAROSA))),
		new SkillChallengeClue("Complete a lap of Ape atoll agility course.", true, any("Ninja Monkey Greegree", item(ItemID.NINJA_MONKEY_GREEGREE), item(ItemID.NINJA_MONKEY_GREEGREE_4025), item(ItemID.KRUK_MONKEY_GREEGREE))),
		new SkillChallengeClue("Create a super defence potion.", item(ItemID.CADANTINE_POTION_UNF), item(ItemID.WHITE_BERRIES)),
		new SkillChallengeClue("Steal from a chest in King Lathas' castle in East Ardougne."),
		new SkillChallengeClue("Craft a green d'hide body.", xOfItem(ItemID.GREEN_DRAGON_LEATHER, 3), item(ItemID.NEEDLE), item(ItemID.THREAD)),
		new SkillChallengeClue("String a yew longbow.", item(ItemID.YEW_LONGBOW_U), item(ItemID.BOW_STRING)),
		new SkillChallengeClue("Kill a Dust Devil.", "slay a dust devil.", true, any("Facemask or Slayer Helmet", item(ItemID.FACEMASK), item(ItemID.SLAYER_HELMET), item(ItemID. SLAYER_HELMET_I), item(ItemID. BLACK_SLAYER_HELMET), item(ItemID. BLACK_SLAYER_HELMET_I), item(ItemID. PURPLE_SLAYER_HELMET), item(ItemID. PURPLE_SLAYER_HELMET_I), item(ItemID. RED_SLAYER_HELMET), item(ItemID. RED_SLAYER_HELMET_I), item(ItemID.GREEN_SLAYER_HELMET), item(ItemID. GREEN_SLAYER_HELMET_I), item(ItemID. TURQUOISE_SLAYER_HELMET), item(ItemID. TURQUOISE_SLAYER_HELMET_I), item(ItemID. HYDRA_SLAYER_HELMET), item(ItemID. HYDRA_SLAYER_HELMET_I))),
		new SkillChallengeClue("Catch a black warlock.", item(ItemID.BUTTERFLY_JAR), any("Butterfly Net", item(ItemID.BUTTERFLY_NET), item(ItemID.MAGIC_BUTTERFLY_NET))),
		new SkillChallengeClue("Catch a red chinchompa.", item(ItemID.BOX_TRAP)),
		new SkillChallengeClue("Mine a piece of mithril ore.", ANY_PICKAXE),
		new SkillChallengeClue("Smith a mithril 2h sword.", item(ItemID.HAMMER), xOfItem(ItemID.MITHRIL_BAR, 3)),
		new SkillChallengeClue("Catch a raw shark.", ANY_HARPOON),
		new SkillChallengeClue("Chop a yew tree.", ANY_AXE),
		new SkillChallengeClue("Fix a magical lamp in Dorgesh-Kaan.", item(ItemID.LIGHT_ORB)),
		new SkillChallengeClue("Burn a yew log.", item(ItemID.YEW_LOGS), item(ItemID.TINDERBOX)),
		new SkillChallengeClue("Cook a swordfish", "cook a swordfish", item(ItemID.RAW_SWORDFISH)),
		new SkillChallengeClue("Craft multiple cosmic runes from a single essence.", item(ItemID.PURE_ESSENCE)),
		new SkillChallengeClue("Plant a watermelon seed.", item(ItemID.RAKE), item(ItemID.SEED_DIBBER), xOfItem(ItemID.WATERMELON_SEED, 3)),
		new SkillChallengeClue("Activate the Chivalry prayer."),
		new SkillChallengeClue("Hand in a Tier 2 or higher set of Shayzien supply armour", "hand in a boxed set of shayzien supply armour at tier 2 or above.", any("Shayzien Supply Set (Tier 2 or higher)", item(ItemID.SHAYZIEN_SUPPLY_SET_2), item(ItemID.SHAYZIEN_SUPPLY_SET_3), item(ItemID.SHAYZIEN_SUPPLY_SET_4), item(ItemID.SHAYZIEN_SUPPLY_SET_5))),
		// Master Sherlock Tasks
		new SkillChallengeClue("Equip an abyssal whip in front of the abyssal demons of the Slayer Tower.", true, any("Abyssal Whip", item(ItemID.ABYSSAL_WHIP), item(ItemID.FROZEN_ABYSSAL_WHIP), item(ItemID.VOLCANIC_ABYSSAL_WHIP))),
		new SkillChallengeClue("Smith a runite med helm.", item(ItemID.HAMMER), item(ItemID.RUNITE_BAR)),
		new SkillChallengeClue("Teleport to a spirit tree you planted yourself."),
		new SkillChallengeClue("Create a Barrows teleport tablet.", item(ItemID.DARK_ESSENCE_BLOCK), xOfItem(ItemID.BLOOD_RUNE, 1), xOfItem(ItemID.LAW_RUNE, 2), xOfItem(ItemID.SOUL_RUNE, 2)),
		new SkillChallengeClue("Kill a Nechryael.", "slay a nechryael"),
		new SkillChallengeClue("Kill a Spiritual Mage while wearing something from their god.", "kill the spiritual, magic and godly whilst representing their own god."),
		new SkillChallengeClue("Create an unstrung dragonstone amulet at a furnace.", item(ItemID.GOLD_BAR), item(ItemID.DRAGONSTONE), item(ItemID.AMULET_MOULD)),
		new SkillChallengeClue("Burn a magic log.", item(ItemID.MAGIC_LOGS), item(ItemID.TINDERBOX)),
		new SkillChallengeClue("Burn a redwood log.", item(ItemID.REDWOOD_LOGS), item(ItemID.TINDERBOX)),
		new SkillChallengeClue("Complete a lap of Rellekka's Rooftop Agility Course", "complete a lap of the rellekka rooftop agility course whilst sporting the finest amount of grace.", true,
			all("A full Graceful set",
				any("", item(ItemID.GRACEFUL_HOOD), item(ItemID.GRACEFUL_HOOD_11851), item(ItemID.GRACEFUL_HOOD_13579), item(ItemID.GRACEFUL_HOOD_13580), item(ItemID.GRACEFUL_HOOD_13591), item(ItemID.GRACEFUL_HOOD_13592), item(ItemID.GRACEFUL_HOOD_13603), item(ItemID.GRACEFUL_HOOD_13604), item(ItemID.GRACEFUL_HOOD_13615), item(ItemID.GRACEFUL_HOOD_13616), item(ItemID.GRACEFUL_HOOD_13627), item(ItemID.GRACEFUL_HOOD_13628), item(ItemID.GRACEFUL_HOOD_13667), item(ItemID.GRACEFUL_HOOD_13668), item(ItemID.GRACEFUL_HOOD_21061), item(ItemID.GRACEFUL_HOOD_21063)),
				any("", item(ItemID.GRACEFUL_CAPE), item(ItemID.GRACEFUL_CAPE_11853), item(ItemID.GRACEFUL_CAPE_13581), item(ItemID.GRACEFUL_CAPE_13582), item(ItemID.GRACEFUL_CAPE_13593), item(ItemID.GRACEFUL_CAPE_13594), item(ItemID.GRACEFUL_CAPE_13605), item(ItemID.GRACEFUL_CAPE_13606), item(ItemID.GRACEFUL_CAPE_13617), item(ItemID.GRACEFUL_CAPE_13618), item(ItemID.GRACEFUL_CAPE_13629), item(ItemID.GRACEFUL_CAPE_13630), item(ItemID.GRACEFUL_CAPE_13669), item(ItemID.GRACEFUL_CAPE_13670), item(ItemID.GRACEFUL_CAPE_21064), item(ItemID.GRACEFUL_CAPE_21066), item(ItemID.AGILITY_CAPE), item(ItemID.AGILITY_CAPET), item(ItemID.MAX_CAPE)),
				any("", item(ItemID.GRACEFUL_TOP), item(ItemID.GRACEFUL_TOP_11855), item(ItemID.GRACEFUL_TOP_13583), item(ItemID.GRACEFUL_TOP_13584), item(ItemID.GRACEFUL_TOP_13595), item(ItemID.GRACEFUL_TOP_13596), item(ItemID.GRACEFUL_TOP_13607), item(ItemID.GRACEFUL_TOP_13608), item(ItemID.GRACEFUL_TOP_13619), item(ItemID.GRACEFUL_TOP_13620), item(ItemID.GRACEFUL_TOP_13631), item(ItemID.GRACEFUL_TOP_13632), item(ItemID.GRACEFUL_TOP_13671), item(ItemID.GRACEFUL_TOP_13672), item(ItemID.GRACEFUL_TOP_21067), item(ItemID.GRACEFUL_TOP_21069)),
				any("", item(ItemID.GRACEFUL_LEGS), item(ItemID.GRACEFUL_LEGS_11857), item(ItemID.GRACEFUL_LEGS_13585), item(ItemID.GRACEFUL_LEGS_13586), item(ItemID.GRACEFUL_LEGS_13597), item(ItemID.GRACEFUL_LEGS_13598), item(ItemID.GRACEFUL_LEGS_13609), item(ItemID.GRACEFUL_LEGS_13610), item(ItemID.GRACEFUL_LEGS_13621), item(ItemID.GRACEFUL_LEGS_13622), item(ItemID.GRACEFUL_LEGS_13633), item(ItemID.GRACEFUL_LEGS_13634), item(ItemID.GRACEFUL_LEGS_13673), item(ItemID.GRACEFUL_LEGS_13674), item(ItemID.GRACEFUL_LEGS_21070), item(ItemID.GRACEFUL_LEGS_21072)),
				any("", item(ItemID.GRACEFUL_GLOVES), item(ItemID.GRACEFUL_GLOVES_11859), item(ItemID.GRACEFUL_GLOVES_13587), item(ItemID.GRACEFUL_GLOVES_13588), item(ItemID.GRACEFUL_GLOVES_13599), item(ItemID.GRACEFUL_GLOVES_13600), item(ItemID.GRACEFUL_GLOVES_13611), item(ItemID.GRACEFUL_GLOVES_13612), item(ItemID.GRACEFUL_GLOVES_13623), item(ItemID.GRACEFUL_GLOVES_13624), item(ItemID.GRACEFUL_GLOVES_13635), item(ItemID.GRACEFUL_GLOVES_13636), item(ItemID.GRACEFUL_GLOVES_13675), item(ItemID.GRACEFUL_GLOVES_13676), item(ItemID.GRACEFUL_GLOVES_21073), item(ItemID.GRACEFUL_GLOVES_21075)),
				any("", item(ItemID.GRACEFUL_BOOTS), item(ItemID.GRACEFUL_BOOTS_11861), item(ItemID.GRACEFUL_BOOTS_13589), item(ItemID.GRACEFUL_BOOTS_13590), item(ItemID.GRACEFUL_BOOTS_13601), item(ItemID.GRACEFUL_BOOTS_13602), item(ItemID.GRACEFUL_BOOTS_13613), item(ItemID.GRACEFUL_BOOTS_13614), item(ItemID.GRACEFUL_BOOTS_13625), item(ItemID.GRACEFUL_BOOTS_13626), item(ItemID.GRACEFUL_BOOTS_13637), item(ItemID.GRACEFUL_BOOTS_13638), item(ItemID.GRACEFUL_BOOTS_13677), item(ItemID.GRACEFUL_BOOTS_13678), item(ItemID.GRACEFUL_BOOTS_21076), item(ItemID.GRACEFUL_BOOTS_21078)))),
		new SkillChallengeClue("Mix an anti-venom potion.", item(ItemID.ANTIDOTE4_5952), xOfItem(ItemID.ZULRAHS_SCALES, 20)),
		new SkillChallengeClue("Mine a piece of Runite ore", "mine a piece of runite ore whilst sporting the finest mining gear.", true, ANY_PICKAXE, all("Prospector kit", item(ItemID.PROSPECTOR_HELMET), item(ItemID.PROSPECTOR_JACKET), item(ItemID.PROSPECTOR_LEGS), item(ItemID.PROSPECTOR_BOOTS))),
		new SkillChallengeClue("Steal a gem from the Ardougne market."),
		new SkillChallengeClue("Pickpocket an elf."),
		new SkillChallengeClue("Bind a blood rune at the blood altar.", item(ItemID.DARK_ESSENCE_FRAGMENTS)),
		new SkillChallengeClue("Create a ranging mix potion.", item(ItemID.RANGING_POTION2), item(ItemID.CAVIAR)),
		new SkillChallengeClue("Fletch a rune dart.", item(ItemID.RUNE_DART_TIP), item(ItemID.FEATHER)),
		new SkillChallengeClue("Cremate a set of fiyr remains.", any("Magic or Redwood Pyre Logs", item(ItemID.MAGIC_PYRE_LOGS), item(ItemID.REDWOOD_PYRE_LOGS)), item(ItemID.TINDERBOX), item(ItemID.FIYR_REMAINS)),
		new SkillChallengeClue("Dissect a sacred eel.", item(ItemID.KNIFE), any("Fishing rod", item(ItemID.FISHING_ROD), item(ItemID.PEARL_FISHING_ROD)), item(ItemID.FISHING_BAIT)),
		new SkillChallengeClue("Kill a lizardman shaman."),
		new SkillChallengeClue("Catch an Anglerfish.", "angle for an anglerfish in your finest fishing gear.", true, any("Fishing rod", item(ItemID.FISHING_ROD), item(ItemID.PEARL_FISHING_ROD)), item(ItemID.SANDWORMS), all("Angler's outfit", item(ItemID.ANGLER_HAT), item(ItemID.ANGLER_TOP), item(ItemID.ANGLER_WADERS), item(ItemID.ANGLER_BOOTS))),
		new SkillChallengeClue("Chop a redwood log.", "chop a redwood log whilst sporting the finest lumberjack gear.", true, ANY_AXE, all("Lumberjack outfit", item(ItemID.LUMBERJACK_HAT), item(ItemID.LUMBERJACK_TOP), item(ItemID.LUMBERJACK_LEGS), item(ItemID.LUMBERJACK_BOOTS))),
		new SkillChallengeClue("Craft a light orb in the Dorgesh-Kaan bank.", item(ItemID.CAVE_GOBLIN_WIRE), item(ItemID.EMPTY_LIGHT_ORB)),
		new SkillChallengeClue("Kill a reanimated Abyssal Demon.", "kill a reanimated abyssal.", xOfItem(ItemID.SOUL_RUNE, 4), xOfItem(ItemID.BLOOD_RUNE, 1), any("Nature Rune x4", xOfItem(ItemID.NATURE_RUNE, 4), item(ItemID.BRYOPHYTAS_STAFF)), range("Ensouled abyssal head", ItemID.ENSOULED_ABYSSAL_HEAD, ItemID.ENSOULED_ABYSSAL_HEAD_13508)),
		new SkillChallengeClue("Kill a Fiyr shade inside Mort'tons shade catacombs.", any("Any Silver Shade Key",  item(ItemID.SILVER_KEY_RED), item(ItemID.SILVER_KEY_BROWN), item(ItemID.SILVER_KEY_CRIMSON), item(ItemID.SILVER_KEY_BLACK), item(ItemID.SILVER_KEY_PURPLE)))
	);

	private final ChallengeType type;
	private final String challenge;
	private final String rawChallenge;
	private final String returnText;
	private final ItemRequirement[] itemRequirements;
	private final SingleItemRequirement returnItem;
	private final boolean requireEquip;
	@Setter
	private boolean challengeCompleted;

	// Charlie Tasks
	private SkillChallengeClue(String challenge, String rawChallenge, String returnText, SingleItemRequirement returnItem, ItemRequirement ... itemRequirements)
	{
		this.type = ChallengeType.CHARLIE;
		this.challenge = challenge;
		this.rawChallenge = rawChallenge;
		this.returnText = returnText;
		this.itemRequirements = itemRequirements;
		this.returnItem = returnItem;
		this.challengeCompleted = false;
		this.requireEquip = false;
	}

	// Non-cryptic Sherlock Tasks
	private SkillChallengeClue(String challenge, ItemRequirement ... itemRequirements)
	{
		this(challenge, challenge.toLowerCase(), itemRequirements);
	}

	// Non-cryptic Sherlock Tasks
	private SkillChallengeClue(String challenge, boolean requireEquip, ItemRequirement ... itemRequirements)
	{
		this(challenge, challenge.toLowerCase(), requireEquip, itemRequirements);
	}

	// Sherlock Tasks
	private SkillChallengeClue(String challenge, String rawChallenge, ItemRequirement ... itemRequirements)
	{
		this(challenge, rawChallenge, false, itemRequirements);
	}

	// Sherlock Tasks
	private SkillChallengeClue(String challenge, String rawChallenge, boolean requireEquip, ItemRequirement ... itemRequirements)
	{
		this.type = ChallengeType.SHERLOCK;
		this.challenge = challenge;
		this.rawChallenge = rawChallenge;
		this.itemRequirements = itemRequirements;
		this.challengeCompleted = false;
		this.requireEquip = requireEquip;
		this.returnText = "<str>" + rawChallenge + "</str>";

		this.returnItem = null;
	}

	@Override
	public void makeOverlayHint(PanelComponent panelComponent, ClueScrollPlugin plugin)
	{
		panelComponent.getChildren().add(TitleComponent.builder().text("Skill Challenge Clue").build());

		if (!challengeCompleted)
		{
			panelComponent.getChildren().add(LineComponent.builder().left("Challenge:").build());
			panelComponent.getChildren().add(LineComponent.builder()
				.left(challenge)
				.leftColor(TITLED_CONTENT_COLOR)
				.build());

			if (itemRequirements.length > 0)
			{
				panelComponent.getChildren().add(LineComponent.builder().left(requireEquip ? "Equipment:" : "Items Required:").build());

				for (LineComponent line : getRequirements(plugin, requireEquip, itemRequirements))
				{
					panelComponent.getChildren().add(line);
				}
			}
		}
		else
		{
			panelComponent.getChildren().add(LineComponent.builder().left("NPC:").build());
			panelComponent.getChildren().add(LineComponent.builder()
				.left(type.getName())
				.leftColor(TITLED_CONTENT_COLOR)
				.build());

			panelComponent.getChildren().add(LineComponent.builder().left("Location:").build());
			panelComponent.getChildren().add(LineComponent.builder()
				.left(type.getLocation())
				.leftColor(TITLED_CONTENT_COLOR)
				.build());

			if (returnItem != null)
			{
				panelComponent.getChildren().add(LineComponent.builder().left("Item:").build());
				for (LineComponent line : getRequirements(plugin, false, returnItem))
				{
					panelComponent.getChildren().add(line);
				}
			}
		}
	}

	@Override
	public void makeWorldOverlayHint(Graphics2D graphics, ClueScrollPlugin plugin)
	{
		// Mark NPC
		if (plugin.getNpcsToMark() != null)
		{
			for (NPC npc : plugin.getNpcsToMark())
			{
				OverlayUtil.renderActorOverlayImage(graphics, npc, plugin.getClueScrollImage(), Color.ORANGE, IMAGE_Z_OFFSET);
			}
		}
	}

	private static List<LineComponent> getRequirements(ClueScrollPlugin plugin, boolean requireEquipped, ItemRequirement ... requirements)
	{
		List<LineComponent> components = new ArrayList<>();

		Item[] equipment = plugin.getEquippedItems();
		Item[] inventory = plugin.getInventoryItems();

		// If equipment is null, the player is wearing nothing
		if (equipment == null)
		{
			equipment = new Item[0];
		}

		// If inventory is null, the player has nothing in their inventory
		if (inventory == null)
		{
			inventory = new Item[0];
		}

		Item[] combined = new Item[equipment.length + inventory.length];
		System.arraycopy(equipment, 0, combined, 0, equipment.length);
		System.arraycopy(inventory, 0, combined, equipment.length, inventory.length);

		for (ItemRequirement requirement : requirements)
		{
			boolean equipmentFulfilled = requirement.fulfilledBy(equipment);
			boolean combinedFulfilled = requirement.fulfilledBy(combined);

			components.add(LineComponent.builder()
				.left(requirement.getCollectiveName(plugin.getClient()))
				.leftColor(TITLED_CONTENT_COLOR)
				.right(combinedFulfilled ? "\u2713" : "\u2717")
				.rightColor(equipmentFulfilled || (combinedFulfilled && !requireEquipped) ? Color.GREEN : (combinedFulfilled ? Color.ORANGE : Color.RED))
				.build());
		}

		return components;
	}

	public static SkillChallengeClue forText(String text, String rawText)
	{
		for (SkillChallengeClue clue : CLUES)
		{
			if (rawText.equalsIgnoreCase(clue.returnText))
			{
				clue.setChallengeCompleted(true);
				return clue;
			}
			else if (text.equals(clue.rawChallenge))
			{
				clue.setChallengeCompleted(false);
				return clue;
			}
		}
		return null;
	}

	@Override
	public String[] getNpcs()
	{
		return new String[] {type.getName()};
	}
}
