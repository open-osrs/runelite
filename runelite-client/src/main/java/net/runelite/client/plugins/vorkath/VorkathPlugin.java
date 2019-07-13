/*
 * Copyright (c) 2018, https://runelitepl.us
 * Copyright (c) 2019, Infinitay <https://github.com/Infinitay>
 *
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
package net.runelite.client.plugins.vorkath;

import com.google.inject.Inject;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.*;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.util.ImageUtil;
import org.apache.commons.lang3.ArrayUtils;

@PluginDescriptor(
		name = "Vorkath Helper",
		description = "Count vorkath attacks, indicate next phase, wooxwalk timer, indicate path through acid",
		tags = {"combat", "overlay", "pve", "pvm"},
		type = PluginType.PVM,
		enabledByDefault = false
)
@Singleton
@Slf4j
public class VorkathPlugin extends Plugin
{
	private static final int VORKATH_REGION = 9023;

	@Inject
	private Client client;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private VorkathOverlay overlay;

	@Inject
	private ZombifiedSpawnOverlay spawnOverlay;

	@Inject
	private AcidPathOverlay acidPathOverlay;

	@Inject
	private VorkathConfig config;

	@Getter
	private Vorkath vorkath;

	@Getter
	private NPC zombifiedSpawn;

	@Getter
	private List<WorldPoint> acidSpots = new ArrayList<WorldPoint>();

	private int lastAcidSpotsSize = 0;

	@Getter
	private List<WorldPoint> acidFreePath = new ArrayList<WorldPoint>();

	@Getter
	private WorldPoint[] wooxWalkPath = new WorldPoint[2];

	@Getter
	private long wooxWalkTimer = -1;

	@Getter
	private Rectangle wooxWalkBar;

	/**
	 * The last projectile's starting movement cycle
	 */
	private int lastProjectileCycle;

	static final BufferedImage UNKNOWN;
	static final BufferedImage ACID;
	static final BufferedImage FIRE_BALL;
	static final BufferedImage SPAWN;

	static
	{
		UNKNOWN = ImageUtil.getResourceStreamFromClass(VorkathPlugin.class, "magerange.png");
		ACID = ImageUtil.getResourceStreamFromClass(VorkathPlugin.class, "acid.png");
		FIRE_BALL = ImageUtil.getResourceStreamFromClass(VorkathPlugin.class, "fire_strike.png");
		SPAWN = ImageUtil.getResourceStreamFromClass(VorkathPlugin.class, "ice.png");
	}

	@Provides
	VorkathConfig provideConfig(ConfigManager configManager) {
		return configManager.getConfig(VorkathConfig.class);
	}

	@Subscribe
	public void onNpcSpawned(NpcSpawned event)
	{
		if (isAtVorkath())
		{
			if (isVorkath(event.getNpc().getId()))
			{
				vorkath = new Vorkath(event.getNpc());
				lastProjectileCycle = -1;
				overlayManager.add(overlay);
			}
			else if (isZombifiedSpawn(event.getNpc().getId()))
			{
				zombifiedSpawn = event.getNpc();
				overlayManager.add(spawnOverlay);
			}
		}
	}

	@Subscribe
	public void onNpcDespawned(NpcDespawned event)
	{
		if (isAtVorkath())
		{
			if (isVorkath(event.getNpc().getId()))
			{
				vorkath = null;
				lastProjectileCycle = -1;
				overlayManager.remove(overlay);
				overlayManager.remove(acidPathOverlay);
				acidSpots.clear();
				acidFreePath.clear();
				Arrays.fill(wooxWalkPath, null);
				wooxWalkTimer = -1;
			}
			else if (isZombifiedSpawn(event.getNpc().getId()))
			{
				zombifiedSpawn = null;
				overlayManager.remove(spawnOverlay);
			}
		}
	}

	@Subscribe
	public void onProjectileMoved(ProjectileMoved event)
	{
		if (!isAtVorkath())
		{
			return;
		}

		// Capture all acid pool projectiles
		if (event.getProjectile().getId() == ProjectileID.VORKATH_POISON_POOL_AOE)
		{
			addAcidSpot(WorldPoint.fromLocal(client, event.getPosition()));
		}

		// If not an acid pool projectile, capture only initial projectile
		if (event.getProjectile().getStartMovementCycle() == lastProjectileCycle)
		{
			return;
		}

		VorkathAttack vorkathAttack = VorkathAttack.getVorkathAttack(event.getProjectile().getId());
		if (vorkathAttack != null)
		{
			/*log.debug("[Projectile ({})] Game Tick: {}, Game Cycle: {}, Starting Cyle: {} Last Cycle: {}, Initial Projectile?: {}",
				vorkathAttack, client.getTickCount(), client.getGameCycle(), event.getProjectile().getStartMovementCycle(),
				lastProjectileCycle, event.getProjectile().getStartMovementCycle() == client.getGameCycle());*/
			if (VorkathAttack.isBasicAttack(vorkathAttack.getProjectileID()) && vorkath.getAttacksLeft() > 0)
			{
				vorkath.setAttacksLeft(vorkath.getAttacksLeft() - 1);
			}
			else if (vorkathAttack == VorkathAttack.ACID)
			{
				vorkath.updatePhase(Vorkath.Phase.ACID);
				// Sets the phase's progress indicator to done
				vorkath.setAttacksLeft(0);
			}
			else if (vorkathAttack == VorkathAttack.FIRE_BALL)
			{
				vorkath.updatePhase(Vorkath.Phase.FIRE_BALL);
				// Decrement to account for this fire ball
				vorkath.setAttacksLeft(vorkath.getAttacksLeft() - 1);
			}
			else if (vorkathAttack == VorkathAttack.FREEZE_BREATH && vorkath.getLastAttack() != VorkathAttack.ZOMBIFIED_SPAWN)
			{
				// Filters out second invisible freeze attack that is immediately after the Zombified Spawn
				vorkath.updatePhase(Vorkath.Phase.SPAWN);
				// Sets progress of the phase to half
				vorkath.setAttacksLeft(vorkath.getAttacksLeft() - (vorkath.getAttacksLeft() / 2));
			}
			else if (vorkathAttack == VorkathAttack.ZOMBIFIED_SPAWN || (vorkath.getLastAttack() == VorkathAttack.ZOMBIFIED_SPAWN))
			{
				// Also consumes the second invisible freeze attack that is immediately after the Zombified Spawn
				// Sets progress of the phase to done as there are no more attacks within this phase
				vorkath.setAttacksLeft(0);
			}
			else
			{
				// Vorkath fired a basic attack AND there are no more attacks left, typically after phases are over
				vorkath.updatePhase(vorkath.getNextPhase());
				// Decrement to account for this basic attack
				vorkath.setAttacksLeft(vorkath.getAttacksLeft() - 1);
			}

			log.debug("[Vorkath ({})] {}", vorkathAttack, vorkath);
			vorkath.setLastAttack(vorkathAttack);
			lastProjectileCycle = event.getProjectile().getStartMovementCycle();
		}
	}

	@Subscribe
	public void onGameObjectSpawned(GameObjectSpawned event)
	{
		// Capture acid pool game objects if the projectiles were not detected
		if (isAtVorkath() && event.getGameObject().getId() == ObjectID.ACID_POOL
				|| event.getGameObject().getId() == ObjectID.ACID_POOL_32000)
		{
			addAcidSpot(event.getGameObject().getWorldLocation());
		}
	}

	@Subscribe
	public void onGameObjectDespawned(GameObjectDespawned event)
	{
		// Remove acid pools when they despawn
		if (event.getGameObject().getId() == ObjectID.ACID_POOL
				|| event.getGameObject().getId() == ObjectID.ACID_POOL_32000)
		{
			acidSpots.remove(event.getGameObject().getWorldLocation());
		}
	}

	@Subscribe
	public void onAnimationChanged(AnimationChanged event)
	{
		if (isAtVorkath() && vorkath != null && event.getActor().equals(vorkath.getVorkath())
				&& event.getActor().getAnimation() == VorkathAttack.SLASH_ATTACK.getVorkathAnimationID())
		{
			if (vorkath.getAttacksLeft() > 0)
			{
				vorkath.setAttacksLeft(vorkath.getAttacksLeft() - 1);
			}
			else
			{
				// No more attacks left, typically after phases are over
				vorkath.updatePhase(vorkath.getNextPhase());
				// Decrement to account for this basic attack
				vorkath.setAttacksLeft(vorkath.getAttacksLeft() - 1);
			}
			log.debug("[Vorkath (SLASH_ATTACK)] {}", vorkath);
		}
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		if (!isAtVorkath())
		{
			return;
		}

		// Update the acid free path every tick to account for player movement
		if (config.indicateAcidFreePath() && !acidSpots.isEmpty())
		{
			calculateAcidFreePath();
		}

		// Start the timer when the player walks into the WooxWalk zone
		if (config.indicateWooxWalkPath() && config.indicateWooxWalkTick()
				&& wooxWalkPath[0] != null && wooxWalkPath[1] != null)
		{
			WorldPoint playerLocation = client.getLocalPlayer().getWorldLocation();

			if (playerLocation.getX() == wooxWalkPath[0].getX() && playerLocation.getY() == wooxWalkPath[0].getY()
					&& playerLocation.getPlane() == wooxWalkPath[0].getPlane())
			{
				if (wooxWalkTimer == -1)
				{
					wooxWalkTimer = System.currentTimeMillis() - 400;
				}
			}
			else if (playerLocation.getX() == wooxWalkPath[1].getX() && playerLocation.getY() == wooxWalkPath[1].getY()
					&& playerLocation.getPlane() == wooxWalkPath[1].getPlane())
			{
				if (wooxWalkTimer == -1)
				{
					wooxWalkTimer = System.currentTimeMillis() - 1000;
				}
			}
			else if (wooxWalkTimer != -1)
			{
				wooxWalkTimer = -1;
			}
		}
	}

	/**
	 * @return true if the player is in the Vorkath region, false otherwise
	 */
	private boolean isAtVorkath()
	{
		return ArrayUtils.contains(client.getMapRegions(), VORKATH_REGION);
	}

	/**
	 * @param npcID
	 * @return true if the npc is Vorkath, false otherwise
	 */
	private boolean isVorkath(int npcID)
	{
		// Could be done with a a simple name check instead...
		return npcID == NpcID.VORKATH ||
				npcID == NpcID.VORKATH_8058 ||
				npcID == NpcID.VORKATH_8059 ||
				npcID == NpcID.VORKATH_8060 ||
				npcID == NpcID.VORKATH_8061;
	}

	/**
	 * @param npcID
	 * @return true if the npc is a Zombified Spawn, otherwise false
	 */
	private boolean isZombifiedSpawn(int npcID)
	{
		// Could be done with a a simple name check instead...
		return npcID == NpcID.ZOMBIFIED_SPAWN ||
				npcID == NpcID.ZOMBIFIED_SPAWN_8063;
	}

	private void addAcidSpot(WorldPoint acidSpotLocation)
	{
		if (!acidSpots.contains(acidSpotLocation))
		{
			acidSpots.add(acidSpotLocation);
		}
	}

	@Subscribe
	private void onClientTick(ClientTick event)
	{
		if (acidSpots.size() != lastAcidSpotsSize)
		{
			if (acidSpots.size() == 0)
			{
				overlayManager.remove(acidPathOverlay);
				acidFreePath.clear();
				Arrays.fill(wooxWalkPath, null);
				wooxWalkTimer = -1;
			}
			else
			{
				if (config.indicateAcidFreePath())
				{
					calculateAcidFreePath();
				}
				if (config.indicateWooxWalkPath())
				{
					calculateWooxWalkPath();
				}

				overlayManager.add(acidPathOverlay);
			}

			lastAcidSpotsSize = acidSpots.size();
		}
	}

	private void calculateAcidFreePath()
	{
		acidFreePath.clear();

		int[][][] directions = {
				{
						{0, 1}, {0, -1} // Positive and negative Y
				},
				{
						{1, 0}, {-1, 0} // Positive and negative X
				}
		};

		List<WorldPoint> bestPath = new ArrayList<WorldPoint>();
		double bestClicksRequired = 99;

		WorldPoint playerLocation = client.getLocalPlayer().getWorldLocation();
		int maxX = vorkath.getVorkath().getWorldLocation().getX() + 14;
		int minX = vorkath.getVorkath().getWorldLocation().getX() - 8;
		int maxY = vorkath.getVorkath().getWorldLocation().getY() - 1;
		int minY = vorkath.getVorkath().getWorldLocation().getY() - 8;

		// Attempt to search an acid free path, beginning at a location
		// adjacent to the player's location (including diagonals)
		for (int x = -1; x < 2; x++)
		{
			for (int y = -1; y < 2; y++)
			{
				WorldPoint baseLocation = new WorldPoint(playerLocation.getX() + x,
						playerLocation.getY() + y, playerLocation.getPlane());

				if (acidSpots.contains(baseLocation) || baseLocation.getY() < minY
						|| baseLocation.getY() > maxY)
				{
					continue;
				}

				// Search in X and Y direction
				for (int d = 0; d < directions.length; d++)
				{
					// Calculate the clicks required to start walking on the path
					double currentClicksRequired = Math.abs(x) + Math.abs(y);
					if (currentClicksRequired < 2)
					{
						currentClicksRequired += Math.abs(y * directions[d][0][0]) + Math.abs(x * directions[d][0][1]);
					}
					if (d == 0)
					{
						// Prioritize a path in the X direction (sideways)
						currentClicksRequired += 0.5;
					}

					List<WorldPoint> currentPath = new ArrayList<WorldPoint>();
					currentPath.add(baseLocation);

					// Positive X (first iteration) or positive Y (second iteration)
					for (int i = 1; i < 25; i++)
					{
						WorldPoint testingLocation = new WorldPoint(baseLocation.getX() + i*directions[d][0][0],
								baseLocation.getY() + i*directions[d][0][1], baseLocation.getPlane());

						if (acidSpots.contains(testingLocation) || testingLocation.getY() < minY || testingLocation.getY() > maxY
								|| testingLocation.getX() < minX || testingLocation.getX() > maxX)
						{
							break;
						}

						currentPath.add(testingLocation);
					}

					// Negative X (first iteration) or positive Y (second iteration)
					for (int i = 1; i < 25; i++)
					{
						WorldPoint testingLocation = new WorldPoint(baseLocation.getX() + i*directions[d][1][0],
								baseLocation.getY() + i*directions[d][1][1], baseLocation.getPlane());

						if (acidSpots.contains(testingLocation) || testingLocation.getY() < minY || testingLocation.getY() > maxY
								|| testingLocation.getX() < minX || testingLocation.getX() > maxX)
						{
							break;
						}

						currentPath.add(testingLocation);
					}

					if (currentPath.size() >= config.acidFreePathLength()
							&& currentClicksRequired < bestClicksRequired
							|| (currentClicksRequired == bestClicksRequired && currentPath.size() > bestPath.size()))
					{
						bestPath = currentPath;
						bestClicksRequired = currentClicksRequired;
					}
				}
			}
		}

		if (bestClicksRequired != 99)
		{
			acidFreePath = bestPath;
		}
	}

	private void calculateWooxWalkPath()
	{
		wooxWalkTimer = -1;

		updateWooxWalkBar();

		WorldPoint playerLocation = client.getLocalPlayer().getWorldLocation();
		int middleX = vorkath.getVorkath().getWorldLocation().getX() + 3;
		int maxX = vorkath.getVorkath().getWorldLocation().getX() + 14;
		int minX = vorkath.getVorkath().getWorldLocation().getX() - 8;
		int baseX = playerLocation.getX();
		int baseY = vorkath.getVorkath().getWorldLocation().getY() - 5;

		// Loop through the arena tiles in the x-direction and
		// alternate between positive and negative x direction
		for (int i = 0; i < 50; i++)
		{
			// Make sure we always choose the spot closest to
			// the middle of the arena
			int directionRemainder = 0;
			if (playerLocation.getX() < middleX)
			{
				directionRemainder = 1;
			}

			int deviation = (int) Math.floor(i / 2.0);
			if (i % 2 == directionRemainder)
			{
				deviation = -deviation;
			}

			WorldPoint attackLocation = new WorldPoint(baseX + deviation, baseY, playerLocation.getPlane());
			WorldPoint outOfRangeLocation = new WorldPoint(baseX + deviation, baseY - 1, playerLocation.getPlane());

			if (acidSpots.contains(attackLocation) || acidSpots.contains(outOfRangeLocation)
					|| attackLocation.getX() < minX || attackLocation.getX() > maxX)
			{
				continue;
			}

			wooxWalkPath[0] = attackLocation;
			wooxWalkPath[1] = outOfRangeLocation;

			break;
		}
	}

	private void updateWooxWalkBar()
	{
		// Update the WooxWalk tick indicator's dimensions
		// based on the canvas dimensions
		Rectangle screen = client.getWidget(WidgetInfo.EXPERIENCE_TRACKER).getBounds();
		int width = (int) Math.floor(screen.getWidth() / 2.0);
		if (width % 2 == 1)
		{
			width++;
		}
		int height = (int) Math.floor(width / 20.0);
		if (height % 2 == 1)
		{
			height++;
		}
		int x = (int) Math.floor(screen.getX() + width / 2.0);
		int y = (int) Math.floor(screen.getY() + screen.getHeight() - 2*height);
		wooxWalkBar = new Rectangle(x, y, width, height);
	}
}