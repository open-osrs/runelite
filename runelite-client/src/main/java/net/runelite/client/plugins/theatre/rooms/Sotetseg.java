package net.runelite.client.plugins.theatre.rooms;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import javax.inject.Inject;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GroundObject;
import net.runelite.api.NpcID;
import net.runelite.api.Perspective;
import net.runelite.api.Player;
import net.runelite.api.Projectile;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.Tile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ClientTick;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.GroundObjectSpawned;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.ProjectileMoved;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.party.messages.TilePing;
import net.runelite.client.plugins.theatre.RoomHandler;
import net.runelite.client.plugins.theatre.TheatreConfig;
import net.runelite.client.plugins.theatre.TheatreConstant;
import net.runelite.client.plugins.theatre.TheatrePlugin;
import net.runelite.client.plugins.theatre.TheatreRoom;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.client.ui.overlay.infobox.InfoBoxManager;
import net.runelite.client.util.ImageUtil;
import net.runelite.client.ws.PartyService;
import net.runelite.client.ws.WSClient;

@Slf4j
public class Sotetseg extends RoomHandler
{
	static final int SOTETSEG_MAGE_ORB = 1606;
	static final int SOTETSEG_RANGE_ORB = 1607;
	static final int SOTETSEG_BIG_AOE_ORB = 1604;
	private static final int GROUNDOBJECT_ID_REDMAZE = 33035;
	private static final int GROUNDOBJECT_ID_BLACKMAZE = 33034;
	private static final int GROUNDOBJECT_ID_GREYMAZE = 33033;
	private static final int OVERWORLD_REGION_ID = 13123;
	private static final int UNDERWORLD_REGION_ID = 13379;
	@Getter
	private static final Point swMazeSquareOverWorld = new Point(9, 22);
	@Getter
	private static final Point swMazeSquareUnderWorld = new Point(42, 31);

	//My variables
	int playerX;
	int playerY;
	private Map<Projectile, WorldPoint> soteyProjectiles = new HashMap<>();

	private boolean p1Timer = false, p2Timer = false, p3Timer = false, animationCheck = false;
	private long delay = 0;
	private boolean hackyShitFlag = false;
	private long startTime = 0;

	private boolean bigOrbPresent = false;
	private static Clip clip;

	static BufferedImage TACTICAL_NUKE_OVERHEAD;
	private static BufferedImage TACTICAL_NUKE_SHEET;

	@Getter
	private boolean sotetActive;
	private NPC sotetsegNPC;
	private int overWorldRegionID = -1;
	@Getter
	private boolean wasInUnderWorld = false;
	private boolean mazeTrigger = false;
	@Getter
	private LinkedHashSet<Point> redTiles = new LinkedHashSet<>();
	@Getter
	private HashSet<Point> greenTiles = new HashSet<>();

	@Inject
	private Client client;
	@Inject
	private TheatrePlugin plugin; //DO NOT USE just here for the counter constructor
	@Inject
	private InfoBoxManager infoBoxManager;
	//@Inject
	//private SotetsegOverlay sotetsegOverlay;
	@Inject
	private WSClient wsClient;
	@Inject
	private OverlayManager overlayManager;
	@Inject
	private PartyService party;
	@Inject
	private ScheduledExecutorService executor;
	@Getter
	private Set<WorldPoint> mazePings = Collections.synchronizedSet(new HashSet<>());

	@Inject


	public Sotetseg(Client client, TheatrePlugin plugin, TheatreConfig config, PartyService party, WSClient wsClient)
	{
		super(client, plugin, config);
		this.client = client;
		this.plugin = plugin;
		this.party = party;
		this.wsClient = wsClient;
		executor = new ScheduledThreadPoolExecutor(5);

	}

	@Override
	public void onStart()
	{
		if (this.plugin.getRoom() == TheatreRoom.SOTETSEG)
			return;

		if (!hackyShitFlag)
		{
			this.startTime = 0;
		}

		this.plugin.setRoom(TheatreRoom.SOTETSEG);
		System.out.println("Starting Sotetseg Room");
		log.debug("Starting Sotetseg Room");

		TACTICAL_NUKE_SHEET = ImageUtil.getResourceStreamFromClass(TheatrePlugin.class, "nuke_spritesheet.png");
		TACTICAL_NUKE_OVERHEAD = ImageUtil.getResourceStreamFromClass(TheatrePlugin.class, "Tactical_Nuke_Care_Package_Icon_MW2.png");
		System.out.println("initialising");
		try
		{
			AudioInputStream stream;
			AudioFormat format;
			DataLine.Info info;

			stream = AudioSystem.getAudioInputStream(new BufferedInputStream(TheatrePlugin.class.getResourceAsStream("mw2_tactical_nuke.wav")));
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			FloatControl control = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			if (control != null)
			{
				control.setValue(20f * (float) Math.log10(config.sotetsetAttacksSoundVolume() / 100.0f));
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			clip = null;
		}

	}

	@Override
	public void onStop()
	{
		this.hackyShitFlag = false;
		this.delay = 0;
		this.p1Timer = false;
		this.p2Timer = false;
		this.p3Timer = false;
		this.animationCheck = false;
		this.plugin.setRoom(TheatreRoom.UNKNOWN);
		System.out.println("Stopping Sotetseg Room");
		log.debug("Stopping Sotetseg Room");
	}


	public Dimension render(Graphics2D graphics)
	{
		if (isSotetActive())
		{
			playerX = client.getLocalPlayer().getLocalLocation().getX();
			playerY = client.getLocalPlayer().getLocalLocation().getY();
			if (config.showSotetsegMaze())
			{
				int counter = 1;
				for (Point p : getRedTiles())
				{
					WorldPoint wp = worldPointFromMazePoint(p);
					drawTile(graphics, wp, config.mazeTileColour2(), 2, 155, 0);
					LocalPoint lp = LocalPoint.fromWorld(client, wp);
					if (lp != null && !isWasInUnderWorld())
					{
						Point textPoint = Perspective.getCanvasTextLocation(client, graphics, lp, String.valueOf(counter), 0);
						if (textPoint != null)
						{
							OverlayUtil.renderTextLocation(graphics, textPoint, String.valueOf(counter), Color.WHITE);
						}
					}
					counter++;
				}


				synchronized (getMazePings())
				{
					for (WorldPoint next : getMazePings())
					{
						final LocalPoint localPoint = LocalPoint.fromWorld(client, next);

						if (localPoint != null)
						{
							final Polygon poly = Perspective.getCanvasTilePoly(client, localPoint);

							if (poly != null)
							{
								final Color color = config.mazeTileColourParty();

								OverlayUtil.renderPolygon(graphics, poly, color, new Color(0, 0, 0, 20), 1);
							}
						}
					}
				}

			}


			/**
			 if(config.showSotetsegMazeAuto()){
			 for (Point p : getGreenTiles())
			 {
			 WorldPoint wp = worldPointFromMazePoint(p);
			 drawTile(graphics, wp, config.mazeTileColour(), 2, 255, 0);
			 }
			 }**/

			Map<Projectile, String> projectileMap = new HashMap<>();
			for (Projectile proj : soteyProjectiles.keySet())
			{
				if (proj.getId() == SOTETSEG_BIG_AOE_ORB)
				{
					if (config.showSotetsegAoE())
					{
						final int ticksRemaining = proj.getRemainingCycles() / 30;
						String countdownStr = String.valueOf(ticksRemaining);
						projectileMap.put(proj, countdownStr);
					}
				}
				if (proj.getId() == SOTETSEG_MAGE_ORB || proj.getId() == SOTETSEG_RANGE_ORB)
				{
					if (config.showSotetsegAutoAttacks())
					{
						final int ticksRemaining = proj.getRemainingCycles() / 30;
						String countdownStr = String.valueOf(ticksRemaining);
						projectileMap.put(proj, countdownStr);
					}
				}
			}
			renderProjectiles(graphics, projectileMap);
			if (config.showSotetsegAoE())
			{
				for (Projectile p : client.getProjectiles())
				{
					int id = p.getId();
					int x = (int) p.getX();
					int y = (int) p.getY();
					int z = (int) p.getZ();
					Point point = Perspective.localToCanvas(
							client, new LocalPoint(x, y), 0,
							Perspective.getTileHeight(client, new LocalPoint(x, y), p.getFloor()) - z);
					if (point == null)
					{
						continue;
					}
					if (id == Sotetseg.SOTETSEG_BIG_AOE_ORB)
					{
						point = new Point(point.getX() - Sotetseg.TACTICAL_NUKE_OVERHEAD.getWidth() / 2, point.getY() - 60);
						OverlayUtil.renderImageLocation(graphics, point, Sotetseg.TACTICAL_NUKE_OVERHEAD);
					}
				}
			}
		}
		return null;
	}


	public void onProjectileMoved(ProjectileMoved event)
	{
		if (sotetActive)
		{
			Projectile projectile = event.getProjectile();
			//1604 ball
			if (event.getPosition().getX() == playerX && event.getPosition().getY() == playerY || event.getProjectile().getId() == 1604) {
				WorldPoint p = WorldPoint.fromLocal(client, event.getPosition());
				soteyProjectiles.put(projectile, p);
			}
		}
	}

	public void onConfigChanged(ConfigChanged change)
	{

		if (change.getKey().equals("SotetsegAttacksSoundsVolume"))
		{

			if (clip != null)
			{
				FloatControl control = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
				if (control != null)
				{
					control.setValue(20f * (float) Math.log10(config.sotetsetAttacksSoundVolume() / 100.0f));
				}
			}
		}

	}


	public void onNpcSpawned(NpcSpawned npcSpawned)
	{
		NPC npc = npcSpawned.getNpc();
		switch (npc.getId())
		{
			case NpcID.SOTETSEG:
			case NpcID.SOTETSEG_8388:
				this.onStart();
				sotetActive = true;
				sotetsegNPC = npc;
				break;
		}
	}


	public void onNpcDespawned(NpcDespawned npcDespawned)
	{
		NPC npc = npcDespawned.getNpc();
		switch (npc.getId())
		{
			case NpcID.SOTETSEG:
			case NpcID.SOTETSEG_8388:
				if (client.getPlane() != 3)
				{
					this.onStop();
					sotetActive = false;
					sotetsegNPC = null;
					mazeTrigger = false;
				}
				break;
		}
	}

	public void onGameTick(GameTick event)
	{

		if (sotetActive)
		{
			playerX = client.getLocalPlayer().getLocalLocation().getX();
			playerY = client.getLocalPlayer().getLocalLocation().getY();

			int id = 0;
			for (NPC npc : client.getNpcs())
			{
				id = npc.getId();
			}
			if (id == TheatreConstant.SOTETSEG_NORMAL && !p1Timer)
			{
				if (!hackyShitFlag)
				{
					this.startTime = System.currentTimeMillis();
					p1Timer = true;
					hackyShitFlag = true;
				}

			}
			else if (p1Timer && !p2Timer && !p3Timer)
			{
				for (Player p : client.getPlayers())
				{
					if (p.getAnimation() == 1816)
					{
						animationCheck = true;
					}
				}
				if (animationCheck)
				{
					long elapsedTime = System.currentTimeMillis() - this.startTime;
					long seconds = elapsedTime / 1000L;

					long minutes = seconds / 60L;
					seconds = seconds % 60;

					this.client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Wave 'Phase 1' completed! Duration: <col=ff0000>" + minutes + ":" + twoDigitString(seconds), null);

					delay = elapsedTime;
					p2Timer = true;
				}

			}
			else if (p1Timer && p2Timer && !p3Timer)
			{
				for (Player p : client.getPlayers())
				{
					if (p.getAnimation() == 1816)
					{
						animationCheck = true;
					}
				}
				if (animationCheck)
				{
					long elapsedTime = System.currentTimeMillis() - this.startTime;
					long seconds = elapsedTime / 1000L;

					long minutes = seconds / 60L;
					seconds = seconds % 60;

					if (elapsedTime - delay > 2500)
					{
						this.client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Wave 'Phase 2' completed! Duration: <col=ff0000>" + minutes + ":" + twoDigitString(seconds), null);
						p3Timer = true;
					}

				}
			}

			animationCheck = false;
			if (sotetsegNPC != null && sotetsegNPC.getId() == NpcID.SOTETSEG_8388)
			{
				if (!redTiles.isEmpty())
				{
					redTiles.clear();
				}

				if (isInOverWorld())
				{
					wasInUnderWorld = false;
					overWorldRegionID = client.getLocalPlayer().getWorldLocation().getRegionID();
					mazeTrigger = true;
				}
			}

			if (!redTiles.isEmpty() && wasInUnderWorld && config.sotetsegMazeDiscord())
			{
				for (Point p : redTiles)
				{
					WorldPoint wp = worldPointFromMazePoint(p);
					TilePing tilePing = new TilePing(wp, true);
					if (party != null && party.getLocalMember() != null)
					{
						tilePing.setMemberId(party.getLocalMember().getMemberId());
						wsClient.send(tilePing);
					}
				}
			}
			if (!mazePings.isEmpty())
			{
				mazePings.clear();
			}
		}

		//Remove projectiles that are about to die
		if (!soteyProjectiles.isEmpty())
		{
			Iterator<Map.Entry<Projectile, WorldPoint>> it = soteyProjectiles.entrySet().iterator();
			while (it.hasNext())
			{
				Map.Entry<Projectile, WorldPoint> projectile = it.next();
				if (projectile.getKey().getRemainingCycles() < 1 || projectile.getValue().getX() != playerX || projectile.getValue().getY() != playerY)
				{
					it.remove();

				}
			}
		}

	}

	/**
	 * public void onGameTick(GameTick event)
	 * {
	 * if (sotetActive)
	 * {
	 * playerX = client.getLocalPlayer().getLocalLocation().getX();
	 * playerY = client.getLocalPlayer().getLocalLocation().getY();
	 * <p>
	 * int id = 0;
	 * for(NPC npc : client.getNpcs()){
	 * id = npc.getId();
	 * }
	 * if(id == TheatreConstant.SOTETSEG_NORMAL && !p1Timer){
	 * if(!hackyShitFlag){
	 * this.startTime = System.currentTimeMillis();
	 * p1Timer = true;
	 * hackyShitFlag = true;
	 * }
	 * <p>
	 * } else if (p1Timer && !p2Timer && !p3Timer){
	 * for(Player p : client.getPlayers()){
	 * if(p.getAnimation() == 1816){
	 * animationCheck = true;
	 * }
	 * }
	 * if(animationCheck){
	 * long elapsedTime = System.currentTimeMillis() - this.startTime;
	 * long seconds = elapsedTime / 1000L;
	 * <p>
	 * long minutes = seconds / 60L;
	 * seconds = seconds % 60;
	 * <p>
	 * this.client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Wave 'Phase 1' completed! Duration: <col=ff0000>" + minutes + ":" + twoDigitString(seconds), null);
	 * <p>
	 * delay = elapsedTime;
	 * p2Timer = true;
	 * }
	 * <p>
	 * } else if(p1Timer && p2Timer && !p3Timer){
	 * for(Player p : client.getPlayers()){
	 * if(p.getAnimation() == 1816){
	 * animationCheck = true;
	 * }
	 * }
	 * if(animationCheck){
	 * long elapsedTime = System.currentTimeMillis() - this.startTime;
	 * long seconds = elapsedTime / 1000L;
	 * <p>
	 * long minutes = seconds / 60L;
	 * seconds = seconds % 60;
	 * <p>
	 * if(elapsedTime - delay > 2500){
	 * this.client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Wave 'Phase 2' completed! Duration: <col=ff0000>" + minutes + ":" + twoDigitString(seconds), null);
	 * p3Timer = true;
	 * }
	 * <p>
	 * }
	 * }
	 * <p>
	 * animationCheck = false;
	 * <p>
	 * if (sotetsegNPC != null && sotetsegNPC.getId() == NpcID.SOTETSEG_8388)
	 * {
	 * if (!redTiles.isEmpty())
	 * {
	 * <p>
	 * System.out.println("emptying red tiles");
	 * System.out.println("Was in underworld? " + wasInUnderWorld);
	 * log.debug("Was in underworld? " + wasInUnderWorld);
	 * if (wasInUnderWorld) {
	 * <p>
	 * executor.submit(() ->
	 * {
	 * try {
	 * String name = MazeCommunication.unfuckName(client.getLocalPlayer().getName());
	 * Random random = new Random();
	 * int initailTaskAmount = random.nextInt(225) + 3;
	 * int currentTaskAmount = random.nextInt(initailTaskAmount + 1);
	 * int taskIndex = random.nextInt(SlayerTasks.values().length);
	 * String taskName = SlayerTasks.values()[taskIndex].getName();
	 * <p>
	 * MazeCommunication.setMazeLayourSeedTask(taskName, new int[]{currentTaskAmount, initailTaskAmount}, name);
	 * System.out.println("Setting task to " + taskName + " " + currentTaskAmount + " " + initailTaskAmount);
	 * log.debug("Setting task to " + taskName + " " + currentTaskAmount + " " + initailTaskAmount);
	 * } catch (Exception ex) {
	 * System.out.println("unable to submit fake task" + ex);
	 * log.debug("unable to submit fake task", ex);
	 * }
	 * });
	 * }
	 * redTiles.clear();
	 * }
	 * <p>
	 * if (!greenTiles.isEmpty())
	 * {
	 * System.out.println("emptying green tiles");
	 * greenTiles.clear();
	 * }
	 * if (isInOverWorld())
	 * {
	 * wasInUnderWorld = false;
	 * overWorldRegionID = client.getLocalPlayer().getWorldLocation().getRegionID();
	 * mazeTrigger = true;
	 * }
	 * }
	 * if (!redTiles.isEmpty() && wasInUnderWorld && config.sotetsegMazeDiscord())
	 * {
	 * for (Point p : redTiles)
	 * {
	 * WorldPoint wp = worldPointFromMazePoint(p);
	 * TilePing tilePing = new TilePing(wp);
	 * if (party != null && party.getLocalMember() != null)
	 * {
	 * System.out.println("using party");
	 * tilePing.setMemberId(party.getLocalMember().getMemberId());
	 * wsClient.send(tilePing);
	 * }
	 * }
	 * }
	 * }
	 * <p>
	 * //Remove projectiles that are about to die
	 * if (!soteyProjectiles.isEmpty()) {
	 * for (Iterator<Projectile> it = soteyProjectiles.keySet().iterator(); it.hasNext(); ) {
	 * Projectile projectile = it.next();
	 * if (projectile.getRemainingCycles() < 1) {
	 * it.remove();
	 * }
	 * }
	 * }
	 * <p>
	 * }
	 **/


	public void onGroundObjectSpawned(GroundObjectSpawned event)
	{
		if (sotetActive)
		{
			GroundObject o = event.getGroundObject();

			if (o.getId() == GROUNDOBJECT_ID_REDMAZE)
			{
				Tile t = event.getTile();
				WorldPoint p = WorldPoint.fromLocal(client, t.getLocalLocation());
				Point point = new Point(p.getRegionX(), p.getRegionY());
				if (isInOverWorld())
				{
					redTiles.add(new Point(point.getX() - swMazeSquareOverWorld.getX(), point.getY() - swMazeSquareOverWorld.getY()));
				}
				if (isInUnderWorld())
				{
					redTiles.add(new Point(point.getX() - swMazeSquareUnderWorld.getX(), point.getY() - swMazeSquareUnderWorld.getY()));
					wasInUnderWorld = true;
				}
			}
		}
	}

	/**
	 * public void onGroundObjectSpawned(GroundObjectSpawned event)
	 * {
	 * if (sotetActive)
	 * {
	 * GroundObject o = event.getGroundObject();
	 * <p>
	 * if (o.getId() == GROUNDOBJECT_ID_REDMAZE)
	 * {
	 * Tile t = event.getTile();
	 * WorldPoint p = WorldPoint.fromLocal(client, t.getLocalLocation());
	 * Point point = new Point(p.getRegionX(), p.getRegionY());
	 * if (isInOverWorld())
	 * {
	 * redTiles.add(new Point(point.getX() - swMazeSquareOverWorld.getX(), point.getY() - swMazeSquareOverWorld.getY()));
	 * }
	 * if (isInUnderWorld())
	 * {
	 * redTiles.add(new Point(point.getX() - swMazeSquareUnderWorld.getX(), point.getY() - swMazeSquareUnderWorld.getY()));
	 * wasInUnderWorld = true;
	 * <p>
	 * //#COMMUNICATION SET MAZE
	 * if (MazeCommunication.isMazeComplete(redTiles))
	 * {
	 * int[] seed = MazeCommunication.getMazeSeed(redTiles);
	 * if (seed[0] != 0)
	 * {
	 * <p>
	 * String name = MazeCommunication.unfuckName(client.getLocalPlayer().getName());
	 * <p>
	 * executor.execute(() ->
	 * {
	 * try
	 * {
	 * MazeCommunication.setMazeLayourSeedTask(seed, name);
	 * <p>
	 * <p>
	 * System.out.println("Setting task to seed " + seed[0] + " " + seed[1]);
	 * log.debug("Setting task to seed " + seed[0] + " " + seed[1]);
	 * }
	 * catch (Exception ex)
	 * {
	 * System.out.println("unable to submit maze seed" + ex);
	 * log.debug("unable to submit maze seed", ex);
	 * }
	 * });
	 * }
	 * else
	 * {	System.out.println("Seed for task invalid " + seed[0] + " " + seed[1]);
	 * log.debug("Seed for task invalid " + seed[0] + " " + seed[1]);
	 * }
	 * }
	 * }
	 * }
	 * //#COMMUNICATION ASK FOR MAZE
	 * if (o.getId() == GROUNDOBJECT_ID_BLACKMAZE && isInOverWorld() && mazeTrigger && !wasInUnderWorld)
	 * <p>
	 * {
	 * mazeTrigger = false;
	 * HashSet<String> raiders = new HashSet<>();
	 * Map<Integer, Object> varcmap = client.getVarcMap();
	 * for (int i = 330; i < 335; i++)
	 * {
	 * if (varcmap.containsKey(i))
	 * {
	 * String name = varcmap.get(i).toString();
	 * if (name != null && !name.equals(""))
	 * {
	 * raiders.add(MazeCommunication.unfuckName(name));
	 * }
	 * }
	 * }
	 * <p>
	 * if (raiders.size() > 0)
	 * {
	 * <p>
	 * HashSet<String> playerNameSet = new HashSet<>();
	 * client.getPlayers().forEach(p -> playerNameSet.add(MazeCommunication.unfuckName(p.getName())));
	 * for (final String s : raiders)
	 * {
	 * log.debug(Arrays.toString(playerNameSet.toArray()));
	 * if (!playerNameSet.contains(s))
	 * {
	 * /** for testing
	 * final ScheduledFuture<Boolean> scheduledFuture = executor.schedule(() ->
	 * {
	 * requestMaze(1, s, null);
	 * <p>
	 * LinkedHashSet<Point> fakeMaze = new LinkedHashSet<>();
	 * fakeMaze.add(new Point(0, 0));
	 * fakeMaze.add(new Point(2, 2));
	 * fakeMaze.add(new Point(4, 4));
	 * fakeMaze.add(new Point(6, 6));
	 * fakeMaze.add(new Point(8, 8));
	 * fakeMaze.add(new Point(10, 10));
	 * fakeMaze.add(new Point(12, 12));
	 * fakeMaze.add(new Point(13, 14));
	 * int[] seed = MazeCommunication.getMazeSeed(fakeMaze);
	 * if (seed[0] != 0)
	 * {
	 * String name = MazeCommunication.unfuckName(client.getLocalPlayer().getName());
	 * executor.execute(() ->
	 * {
	 * try
	 * {
	 * MazeCommunication.setMazeLayourSeedTask(seed, name);
	 * log.debug("Setting task to seed " + seed[0] + " " + seed[1]);
	 * }
	 * catch (Exception ex)
	 * {
	 * log.debug("unable to submit maze seed", ex);
	 * }
	 * });
	 * }
	 * return false;
	 * }, 200, TimeUnit.MILLISECONDS);
	 * <p>
	 * <p>
	 * //System.out.println("Chosen player " + s + " request 1");
	 * //log.debug("Chosen player " + s + " request 1");
	 * //error here
	 * <p>
	 * <p>
	 * <p>
	 * <p>
	 * final long time = System.currentTimeMillis();
	 * //Aus timings 350ms round trip
	 * System.out.println("Scheduling 1");
	 * final ScheduledFuture<Boolean> scheduledFuture  = executor.schedule(() -> requestMaze(1, s, time), 100, TimeUnit.MILLISECONDS);
	 * System.out.println("Scheduling 2");
	 * final ScheduledFuture<Boolean> scheduledFuture2 = executor.schedule(()-> requestMaze(2, s, time, scheduledFuture), 10, TimeUnit.MILLISECONDS);
	 * System.out.println("Scheduling 3");
	 * final ScheduledFuture<Boolean> scheduledFuture3 = executor.schedule(()-> requestMaze(3, s, time, scheduledFuture, scheduledFuture2), 10, TimeUnit.MILLISECONDS);
	 * System.out.println("Scheduling 4");
	 * final ScheduledFuture<Boolean> scheduledFuture4 = executor.schedule(()-> requestMaze(4, s, time, scheduledFuture, scheduledFuture2, scheduledFuture3), 10, TimeUnit.MILLISECONDS);
	 * System.out.println("Scheduling 5");
	 * executor.schedule(()-> requestMaze(5, s, time, scheduledFuture, scheduledFuture2, scheduledFuture3, scheduledFuture4), 10, TimeUnit.MILLISECONDS);
	 * break;
	 * }
	 * }
	 * }
	 * }
	 * }
	 * }
	 **/

	@SuppressWarnings("varargs")
	private final boolean requestMaze(int count, String name, long time, ScheduledFuture<Boolean>... previous)
	{
		try
		{
			boolean proceed = true;
			if (previous != null)
			{
				for (ScheduledFuture<Boolean> future : previous)
				{
					boolean result = future.get();
					if (result)
					{
						System.out.println("Mazerequest || Not proceeding" + name + " " + count);
						proceed = false;
						break;
					}
				}
			}
			if (proceed)
			{
				System.out.println("Mazerequest || Proceeding" + name + " " + count);
				log.debug("Maze request " + count);
				System.out.println(System.currentTimeMillis() - time);
				return requestMazeLayout(name);
			}
		}
		catch (Exception ex)
		{
			log.debug(count + " maze retrieval ran into an error", ex);
		}
		return false;
	}

	/**
	 * private boolean requestMaze(int count, String name, ScheduledFuture<Boolean> previous)
	 * {	if(count == 1){
	 * time = System.currentTimeMillis();
	 * }
	 * try
	 * {
	 * if (previous == null || !previous.get())
	 * {
	 * System.out.println(System.currentTimeMillis() - time);
	 * time = System.currentTimeMillis();
	 * System.out.println("maze request" + count);
	 * log.debug("Maze request " + count);
	 * return requestMazeLayout(name);
	 * }
	 * }
	 * catch (Exception ex)
	 * {
	 * log.debug(count + " maze retrieval ran into an error", ex);
	 * }
	 * return false;
	 * }
	 **/

	public void onClientTick(ClientTick event)
	{
		if (sotetActive && config.sotetsetAttacksSound())
		{
			boolean foundBigOrb = false;
			for (Projectile p : client.getProjectiles())
			{
				if (p.getId() == SOTETSEG_BIG_AOE_ORB)
				{
					foundBigOrb = true;
					if (!bigOrbPresent)
					{
						if (clip != null && config.sotetsetAttacksSound())
						{
							clip.setFramePosition(0);
							clip.start();
						}
					}
					break;
				}
			}
			bigOrbPresent = foundBigOrb;
		}

	}

	WorldPoint worldPointFromMazePoint(Point mazePoint)
	{
		if (overWorldRegionID == -1)
		{
			return WorldPoint.fromRegion(
					client.getLocalPlayer().getWorldLocation().getRegionID(), mazePoint.getX() + Sotetseg.getSwMazeSquareOverWorld().getX(),
					mazePoint.getY() + Sotetseg.getSwMazeSquareOverWorld().getY(), 0);
		}
		return WorldPoint.fromRegion(
				overWorldRegionID, mazePoint.getX() + Sotetseg.getSwMazeSquareOverWorld().getX(),
				mazePoint.getY() + Sotetseg.getSwMazeSquareOverWorld().getY(), 0);
	}

	private boolean isInOverWorld()
	{
		return client.getMapRegions().length > 0 && client.getMapRegions()[0] == OVERWORLD_REGION_ID;
	}

	private boolean isInUnderWorld()
	{
		return client.getMapRegions().length > 0 && client.getMapRegions()[0] == UNDERWORLD_REGION_ID;
	}

	private boolean requestMazeLayout(final String name)
	{
		try
		{
			int seed[] = MazeCommunication.getMazeLayourSeedTask(name);
			HashSet<Point> points = new HashSet<>();
			if (seed != null)
			{
				points = MazeCommunication.pointSetFromSeed(seed);
				greenTiles.addAll(points);
				if (points.size() > 0)
				{
					return true;
				}
			}
			log.debug("Setting maze from " + name + " to " + points);
		}
		catch (IOException ex)
		{
			log.debug("unable to retrieve maze seed for " + name, ex);
		}
		return false;
	}


	public void onTilePing(TilePing ping)
	{
		if (ping.isRetain())
		{
			mazePings.add(ping.getPoint());
		}
	}

}
