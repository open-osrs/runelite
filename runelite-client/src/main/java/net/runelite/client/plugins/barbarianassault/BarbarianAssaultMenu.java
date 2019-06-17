package net.runelite.client.plugins.barbarianassault;

import com.google.common.collect.Sets;
import lombok.Getter;
import lombok.Setter;
import net.runelite.api.Client;
import net.runelite.api.widgets.Widget;
import net.runelite.client.menus.ComparableEntry;
import net.runelite.client.menus.MenuManager;

import javax.inject.Inject;
import java.util.*;

class BarbarianAssaultMenu
{
	private final Client client;
	private final MenuManager menuManager;
	private final BarbarianAssaultPlugin game;
	private final BarbarianAssaultConfig config;
	private final ArrayList<ComparableEntry> tracker = new ArrayList<>();
	@Getter @Setter
	private boolean hornUpdated = false;
	@Getter @Setter
	private boolean rebuildForced = false;

	@Inject
	BarbarianAssaultMenu(Client client, MenuManager menuManager, BarbarianAssaultPlugin game, BarbarianAssaultConfig config)
	{
		this.client = client;
		this.menuManager = menuManager;
		this.game = game;
		this.config = config;
	}

	private boolean isHornOptionHidden(String option)
	{
		if (game.isInGame() && game.getRole() != null && game.getRole().getTell(client).toLowerCase().equals(option))
		{
			// This will force the menu to be rebuilt after the correct tell is found
			// medic will be added to the menu if it wasn't there before
			// TODO this check messes up spamming horn at start?!?!?!
			if (!hornUpdated)
			{
				rebuildForced = true;
			}
			hornUpdated = true;
			return false;
		}
		return true;
	}

	private boolean isPoisonHidden(String poison)
	{
		Widget listen = client.getWidget(game.getRole().getListen());
		return listen != null && !listen.getText().toLowerCase().equals(poison);
	}

	void clearHiddenMenus()
	{
		// Clears menus from MenuManager and tracker
		for (Iterator<ComparableEntry> iterator = tracker.iterator(); iterator.hasNext();)
		{
			menuManager.removeHiddenEntry(iterator.next());
			iterator.remove();
		}
	}

	//TODO add omega egg use on?
	//TODO healing vial on objects?
	//TODO remove hiding healers with wrong food. I think the highlighting is enough,
	// slow calls tend to be very annoying
	// egg launcher is an npc!
	void validateHiddenMenus(Role role)
	{
		clearHiddenMenus();

		HashSet<Menus> hiddenMenus = Sets.newHashSet(Menus.getMenus());
		HashSet<Menus> conditionalMenus = Sets.newHashSet(Menus.getMenus());

		// Any option left in this set will not be hidden
		// Checking each option for the correct role prevents MenuManager from
		// iterating over off role menu entry options that are not possible
		conditionalMenus.removeIf(entry ->
		{
			switch (entry)
			{
				// Attacker role options
				case ATTACK_PENANCE_FIGHTER:
				case ATTACK_PENANCE_RANGER:
				case GET_SPIKES_PETRIFIED_MUSHROOM:
				case TAKE_ATTACKER_ITEM_MACHINE:
					return role != Role.ATTACKER && config.removeUnusedMenus();

				case TELL_BLUE_ATTACKER_HORN:
				case TELL_GREEN_ATTACKER_HORN:
				case TELL_RED_ATTACKER_HORN:
					return (role == Role.ATTACKER || role == null) && config.removeIncorrectCalls() && isHornOptionHidden(entry.getOption());


				// Defender role Options
				case BLOCK_PENANCE_CAVE:
					return (role != Role.DEFENDER && config.removeUnusedMenus())
							|| (role == Role.DEFENDER && config.removePenanceCave());

				case DUNK_LAVA_CRATER:
				case FIX_RUNNER_TRAP:
				case STOCK_UP_DEFENDER_ITEM_MACHINE:
				case TAKE_DEFENDER_ITEM_MACHINE:
				case TAKE_HAMMER:
				case TAKE_LOGS:
					return role != Role.DEFENDER && config.removeUnusedMenus();

				case TELL_MEAT_DEFENDER_HORN:
				case TELL_TOFU_DEFENDER_HORN:
				case TELL_WORMS_DEFENDER_HORN:
					return (role == Role.DEFENDER || role == null) && config.removeIncorrectCalls() && isHornOptionHidden(entry.getOption());


				// Collector role options
				case CONVERT_COLLECTOR_CONVERTER:
				case LOAD_EGG_HOPPER:
				case TAKE_BLUE_EGG:
				case TAKE_GREEN_EGG:
				case TAKE_RED_EGG:
				case TAKE_YELLOW_EGG:
					return role != Role.COLLECTOR && config.removeUnusedMenus();

				case TELL_ACCURATE_COLLECTOR_HORN:
				case TELL_AGGRESSIVE_COLLECTOR_HORN:
				case TELL_CONTROLLED_COLLECTOR_HORN:
				case TELL_DEFENSIVE_COLLECTOR_HORN:
					return (role == Role.COLLECTOR || role == null) && config.removeIncorrectCalls() && isHornOptionHidden(entry.getOption());


				// Healer role options
				case DUNK_POISON_CRATER:
				case STOCK_UP_HEALER_ITEM_MACHINE:
				case TAKE_HEALER_ITEM_MACHINE:
				case TAKE_FROM_HEALER_SPRING:
				case DRINK_FROM_HEALER_SPRING:
					return role != Role.HEALER && config.removeUnusedMenus();

				case TELL_CRACKERS_HEALER_HORN:
				case TELL_TOFU_HEALER_HORN:
				case TELL_WORMS_HEALER_HORN:
					return (role == Role.HEALER || role == null) && config.removeIncorrectCalls() && isHornOptionHidden(entry.getOption());

				//case USE_VIAL_GAME:
				case USE_VIAL_GROUND:
				case USE_VIAL_ITEM:
				case USE_VIAL_NPC:
				case USE_VIAL_WIDGET:
					return role == Role.HEALER && config.removeUnusedMenus();


				// Any role options
				case DROP_HORN:
				case EXAMINE_HORN:
				case USE_HORN:
					return config.removeIncorrectCalls();

				case MEDIC_HORN:
					return config.removeIncorrectCalls() && !hornUpdated;

				default:
					return config.removeUnusedMenus();
			}
		});

		hiddenMenus.removeAll(conditionalMenus);

		for (Menus entry : hiddenMenus)
		{
			menuManager.addHiddenEntry(entry.getEntry());
			tracker.add(entry.getEntry());
		}
	}


	//TODO poisoned on egg launcher?
	void enableSwaps()
	{
		if (config.swapLadder())
		{
			menuManager.addSwap("climb-down", "ladder", "quick-start", "ladder");
		}
		if (config.swapCollectorBag())
		{
			menuManager.addSwap("look-in", "collection bag", "empty", "collection bag");
		}
		if (config.swapDestroyEggs())
		{
			menuManager.addSwap("use", "blue egg", "destroy", "blue egg");
			menuManager.addSwap("use", "green egg", "destroy", "green egg");
			menuManager.addSwap("use", "red egg", "destroy", "red egg");
		}
	}

	void disableSwaps()
	{
		menuManager.removeSwap("climb-down", "ladder", "quick-start", "ladder");
		menuManager.removeSwap("look-in", "collection bag", "empty", "collection bag");
		menuManager.removeSwap("use", "blue egg", "destroy", "blue egg");
		menuManager.removeSwap("use", "green egg", "destroy", "green egg");
		menuManager.removeSwap("use", "red egg", "destroy", "red egg");

	}

}
