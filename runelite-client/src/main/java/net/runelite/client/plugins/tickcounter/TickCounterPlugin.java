package net.runelite.client.plugins.tickcounter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import com.google.inject.Provides;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ClientTick;
import net.runelite.api.events.GameTick;
import net.runelite.api.kit.KitType;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;

@PluginDescriptor(name = "Tick Counter",
		description = "Counts combat activity for nearby players",
		enabledByDefault = false,
		type = PluginType.PVP
)
public class TickCounterPlugin extends Plugin {

	@Inject
	private OverlayManager overlayManager;
	@Inject
	private TickCounterConfig config;
	@Inject
	private Client client;
	@Provides
	TickCounterConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(TickCounterConfig.class);
	}
	@Inject
	private TickCounterOverlay overlay;

	Map<String, Integer> activity = new HashMap<>();

	private List<Player> blowpiping = new ArrayList<>();
	boolean instanced = false;
	boolean prevInstance = false;

	@Override
	protected void startUp() throws Exception {
		overlayManager.add(overlay);
	}

	@Override
	protected void shutDown() throws Exception {
		overlayManager.remove(overlay);
		activity.clear();
	}

	@Subscribe
	public void onAnimationChanged(AnimationChanged e) {
		if (!(e.getActor() instanceof Player))
			return;
		Player p = (Player) e.getActor();
		int weapon = -1;
		if (p.getPlayerComposition() != null)
			weapon = p.getPlayerComposition().getEquipmentId(KitType.WEAPON);
		int delta = 0;
		switch (p.getAnimation()) {
			case 7617: // rune knife
			case 8194: // dragon knife
			case 8291: // dragon knife spec
			case 5061: // blowpipe
				if (weapon == 12926)
				{
					blowpiping.add(p);
				}
				else
				{
					delta = 2;
				}
				break;
			case 2323: // rpg
			case 7618: // chin
				delta = 3;
				break;
			case 426: // bow shoot
				if (weapon == 20997) // twisted bow
					delta = 5;
				else // shortbow
					delta = 3;
				break;
			case 376: // dds poke
			case 377: // dds slash
			case 422: // punch
			case 423: // kick
			case 386: // lunge
			case 390: // generic slash
			case 1062: // dds spec
			case 1067: // claw stab
			case 1074: // msb spec
			case 1167: // trident cast
			case 1658: // whip
			case 2890: // arclight spec
			case 3294: // abby dagger slash
			case 3297: // abby dagger poke
			case 3298: // bludgeon attack
			case 3299: // bludgeon spec
			case 3300: // abby dagger spec
			case 7514: // claw spec
			case 7515: // d sword spec
			case 8145: // rapier stab
			case 8288: // dhl stab
			case 8289: // dhl slash
			case 8290: // dhl crush
				delta = 4;
				break;
			case 393: // staff bash
				if (weapon == 13652) { // claw scratch
					delta = 4;
					break;
				}
			case 395: // axe autos
			case 400: // pick smash
			case 1379: //burst or blitz
			case 1979: // barrage spell cast
			case 1162: // strike/bolt spells
			case 7552: // generic crossbow
			case 7855: // surge spells
			case 8056: // scythe swing
				delta = 5;
				break;
			case 401:
				if (weapon == 13576) // dwh bop
					delta = 6;
				else // used by pickaxe and axe
					delta = 5;
				break;
			case 1378:
			case 7045:
			case 7054:
			case 7055: // godsword autos
			case 7511: // dinh's attack
			case 7516: // maul attack
			case 7555: // ballista attack
			case 7638: // zgs spec
			case 7640: // sgs spec
			case 7642: // bgs spec
			case 7643: // bgs spec
			case 7644: // ags spec
				delta = 6;
				break;
			case 428: // chally swipe
			case 440: // chally jab
			case 1203: // chally spec
				delta = 7;
				break;
		case -1:
			blowpiping.remove(p);
			break;
		}
		if (delta > 0) {
			String name = p.getName();
			this.activity.put(name, this.activity.getOrDefault(name, 0) + delta);
		}
	}

	@Subscribe
	public void onClientTick(ClientTick e) {
		/*
		 * Hack for blowpipe since the AnimationChanged event doesn't fire when using a
		 * blowpipe because of its speed. If blowpipe animation restarts, then add 2
		 */
		for (Player p : blowpiping) {
			Actor rsp = p;
			if (rsp.getActionFrame() == 0 && rsp.getActionFrameCycle() == 1) {
				String name = p.getName();
				int activity = this.activity.getOrDefault(name, 0).intValue();
				this.activity.put(name, activity + 2);
			}
		}
	}
	@Subscribe
	public void onGameTick(GameTick tick){
		if(!config.instance())return;
		prevInstance = instanced;
		instanced = client.isInInstancedRegion();
		if(!prevInstance && instanced){
			activity.clear();
		}
	}
}
