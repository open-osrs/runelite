import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameShell implements Usernamed {
	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = 1970983367
	)
	static int field852;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = 763008721
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		longValue = -3960298575830209827L
	)
	static long field861;
	@ObfuscatedName("ol")
	static boolean[] field901;
	@ObfuscatedName("oi")
	static boolean[] field855;
	@ObfuscatedName("ot")
	static boolean[] field854;
	@ObfuscatedName("ny")
	static boolean field829;
	@ObfuscatedName("nr")
	static boolean field859;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		intValue = -1525007605
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("pb")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("sg")
	@ObfuscatedGetter(
		intValue = -1236989805
	)
	public static int field915;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = -834376263
	)
	static int field879;
	@ObfuscatedName("qk")
	static boolean field883;
	@ObfuscatedName("ni")
	@ObfuscatedGetter(
		intValue = -964374005
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("nl")
	@ObfuscatedGetter(
		intValue = 663873135
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("nv")
	@ObfuscatedGetter(
		intValue = -863251767
	)
	static int field827;
	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("ou")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("oy")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("nf")
	@ObfuscatedGetter(
		intValue = -1253957595
	)
	static int field716;
	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = 619022291
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("oe")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = 44319291
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("mm")
	@ObfuscatedGetter(
		intValue = 760468781
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("oa")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("tj")
	@ObfuscatedSignature(
		descriptor = "Lba;"
	)
	static final ApproximateRouteStrategy field919;
	@ObfuscatedName("qc")
	@ObfuscatedGetter(
		intValue = 1338518997
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("ne")
	@ObfuscatedGetter(
		intValue = -1341323171
	)
	static int field853;
	@ObfuscatedName("no")
	@ObfuscatedGetter(
		intValue = -1828083517
	)
	static int field923;
	@ObfuscatedName("nh")
	@ObfuscatedGetter(
		intValue = 701419483
	)
	static int field862;
	@ObfuscatedName("nt")
	@ObfuscatedGetter(
		intValue = 1311691811
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("tc")
	static int[] field920;
	@ObfuscatedName("tr")
	static int[] field921;
	@ObfuscatedName("sr")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		intValue = -1916983899
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = 1100002729
	)
	static int field842;
	@ObfuscatedName("na")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = -46428687
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = 1591102325
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("ss")
	@ObfuscatedSignature(
		descriptor = "[Ly;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("si")
	@ObfuscatedGetter(
		intValue = -1073533511
	)
	static int field813;
	@ObfuscatedName("or")
	@ObfuscatedGetter(
		intValue = 1164434239
	)
	static int field685;
	@ObfuscatedName("sl")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerComposition;
	@ObfuscatedName("sk")
	@ObfuscatedGetter(
		intValue = -1302699221
	)
	static int field911;
	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = 823228995
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = 424329615
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("qg")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("qo")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("rd")
	static boolean[] field902;
	@ObfuscatedName("qd")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("ri")
	static int[] field679;
	@ObfuscatedName("rj")
	static int[] field893;
	@ObfuscatedName("qj")
	@ObfuscatedSignature(
		descriptor = "[Ldq;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = -1261756273
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("rt")
	static int[] field705;
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = -1187221809
	)
	static int field845;
	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("qt")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("qu")
	@ObfuscatedGetter(
		intValue = 102746825
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("rc")
	static int[] field644;
	@ObfuscatedName("pw")
	@ObfuscatedGetter(
		intValue = -59171105
	)
	static int field874;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		longValue = 7233000865691692987L
	)
	static long field817;
	@ObfuscatedName("qx")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(
		intValue = 982246175
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("pa")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = 31385275
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		intValue = -1928794307
	)
	static int field666;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = 1307916999
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("pf")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("rx")
	static short field896;
	@ObfuscatedName("rq")
	static short field897;
	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "[Llm;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("rb")
	static short field828;
	@ObfuscatedName("ra")
	static short field903;
	@ObfuscatedName("re")
	static short field731;
	@ObfuscatedName("sf")
	@ObfuscatedGetter(
		intValue = 2093134959
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("rp")
	static short field900;
	@ObfuscatedName("rg")
	@ObfuscatedGetter(
		intValue = 165183815
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("sd")
	@ObfuscatedGetter(
		intValue = -1667977405
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("nq")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("rh")
	@ObfuscatedGetter(
		intValue = -1202571805
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("rw")
	@ObfuscatedGetter(
		intValue = 1226538775
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("np")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("nd")
	@ObfuscatedGetter(
		intValue = -756396665
	)
	static int field837;
	@ObfuscatedName("pg")
	static long[] field868;
	@ObfuscatedName("pq")
	@ObfuscatedGetter(
		intValue = 1378550147
	)
	static int field870;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = 2082201915
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("ml")
	@ObfuscatedGetter(
		intValue = 2082785677
	)
	static int field865;
	@ObfuscatedName("rm")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = -556724327
	)
	static int field707;
	@ObfuscatedName("rr")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("nu")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pl")
	static int[] field693;
	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	static NodeDeque field715;
	@ObfuscatedName("pi")
	static int[] field661;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = -1910543551
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	static NodeDeque field849;
	@ObfuscatedName("nk")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("ob")
	@ObfuscatedGetter(
		intValue = 125760777
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = 404828477
	)
	static int field810;
	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = 1150371503
	)
	static int field811;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = -1643930355
	)
	static int field680;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = -1235624719
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("ph")
	static int[] field863;
	@ObfuscatedName("pm")
	static String field871;
	@ObfuscatedName("sw")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lfo;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("at")
	static boolean field907;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 605856319
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1172386423
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1849937955
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bf")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bz")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -605979109
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 272012315
	)
	static int field651;
	@ObfuscatedName("bw")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 615918673
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("cf")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 719785889
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		longValue = 2825275797086768431L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1844754083
	)
	static int field657;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -322437819
	)
	static int field658;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		longValue = 8108394182568559769L
	)
	static long field794;
	@ObfuscatedName("cu")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("ct")
	@Export("displayFps")
	static boolean displayFps;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 437393179
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -234391383
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1281221669
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -2046139677
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -758214641
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -129094787
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1365563059
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 911963013
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -759989801
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1533630561
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -1287826553
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -795471171
	)
	static int field864;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = -1029151173
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = 965496535
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("ek")
	@ObfuscatedGetter(
		intValue = 114444977
	)
	static int field892;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = -1250433749
	)
	static int field681;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = 1777018145
	)
	static int field682;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static class169 field872;
	@ObfuscatedName("el")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lck;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("ft")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "[Lcf;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = -2095920813
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("ff")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("fs")
	@ObfuscatedGetter(
		intValue = 144391847
	)
	static int field826;
	@ObfuscatedName("fk")
	static int[] field654;
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("fh")
	@ObfuscatedGetter(
		intValue = -179896895
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("fy")
	static boolean field696;
	@ObfuscatedName("fb")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("fl")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("gg")
	@ObfuscatedGetter(
		intValue = -1853046907
	)
	static int field700;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = 252683765
	)
	static int field701;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = -1311284153
	)
	static int field702;
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = 1834916753
	)
	static int field703;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = 1906817031
	)
	static int field704;
	@ObfuscatedName("ga")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("gi")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("gp")
	static final int[] field708;
	@ObfuscatedName("gd")
	@ObfuscatedGetter(
		intValue = -904067663
	)
	static int field850;
	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "[Llm;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSpritePixels;
	@ObfuscatedName("hv")
	@ObfuscatedGetter(
		intValue = -1487008623
	)
	static int field711;
	@ObfuscatedName("hj")
	@ObfuscatedGetter(
		intValue = -408397879
	)
	static int field712;
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = 2027186317
	)
	static int field713;
	@ObfuscatedName("hu")
	@ObfuscatedGetter(
		intValue = 265625939
	)
	static int field714;
	@ObfuscatedName("hx")
	static boolean field692;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = 1926073649
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("hr")
	@ObfuscatedGetter(
		intValue = 256130781
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("ht")
	@ObfuscatedGetter(
		intValue = -933249295
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("hp")
	@ObfuscatedGetter(
		intValue = -1941667663
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("hb")
	@ObfuscatedGetter(
		intValue = 842676911
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		intValue = -159731927
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("hw")
	@ObfuscatedGetter(
		intValue = 797966877
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("iq")
	@ObfuscatedGetter(
		intValue = 1791733175
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = 1677697591
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = 1012131865
	)
	static int field755;
	@ObfuscatedName("io")
	@ObfuscatedGetter(
		intValue = 755654585
	)
	static int field761;
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = 1441714075
	)
	static int field788;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = 1697208315
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("ib")
	@ObfuscatedGetter(
		intValue = 762441025
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = -380994417
	)
	public static int field730;
	@ObfuscatedName("il")
	static boolean field649;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = -1396000555
	)
	static int field732;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("is")
	static boolean field843;
	@ObfuscatedName("iy")
	@ObfuscatedGetter(
		intValue = -1991795959
	)
	static int field918;
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = 664038093
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("ik")
	@ObfuscatedGetter(
		intValue = 1616827889
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("iw")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("if")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("ie")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("iu")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("iv")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("jl")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("jb")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("jx")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("je")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = -31866267
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = 2071172407
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = 473576557
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = -501291535
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = 1855983379
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = 1506174483
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		intValue = -1330486485
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("jn")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = 2114809505
	)
	static int field754;
	@ObfuscatedName("jw")
	@ObfuscatedGetter(
		intValue = 1360375965
	)
	static int field881;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = -2111776897
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = -174164729
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = -563995015
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = 1906459091
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("jk")
	static boolean field848;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = 529038183
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("jz")
	@ObfuscatedGetter(
		intValue = -416908103
	)
	static int field762;
	@ObfuscatedName("jr")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "[Lbq;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = -1303961589
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("ka")
	@ObfuscatedGetter(
		intValue = -191235223
	)
	static int field766;
	@ObfuscatedName("ko")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = -1760199693
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = 248476299
	)
	static int field769;
	@ObfuscatedName("kk")
	static int[] field770;
	@ObfuscatedName("kl")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("kr")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("kv")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("kw")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = -1934640101
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "[[[Ljp;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("kj")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("kd")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("lt")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = 362480773
	)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("lk")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = 1250252403
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("ld")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("ln")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("lz")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("lp")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("lv")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("la")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("lb")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("ls")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("ly")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("lq")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("lu")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = 1731176677
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = -958797827
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		intValue = -987373017
	)
	static int field799;
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = -96598345
	)
	static int field751;
	@ObfuscatedName("mi")
	@ObfuscatedGetter(
		intValue = 1915140309
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("mv")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = -1478069303
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		intValue = 703379227
	)
	static int field836;
	@ObfuscatedName("mj")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("mu")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = -1575535357
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	Buffer field686;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lz;"
	)
	class9 field687;

	static {
		field907 = true; // L: 183
		worldId = 1; // L: 184
		worldProperties = 0; // L: 185
		gameBuild = 0; // L: 187
		isMembersWorld = false; // L: 190
		isLowDetail = false; // L: 191
		clientType = -1; // L: 196
		field651 = -1; // L: 197
		onMobile = false; // L: 198
		gameState = 0; // L: 199
		isLoading = true; // L: 220
		cycle = 0; // L: 221
		mouseLastLastPressedTimeMillis = -1L; // L: 222
		field657 = -1; // L: 224
		field658 = -1; // L: 225
		field794 = -1L; // L: 226
		hadFocus = true; // L: 227
		displayFps = false; // L: 228
		rebootTimer = 0; // L: 229
		hintArrowType = 0; // L: 230
		hintArrowNpcIndex = 0; // L: 231
		hintArrowPlayerIndex = 0; // L: 232
		hintArrowX = 0; // L: 233
		hintArrowY = 0; // L: 234
		hintArrowHeight = 0; // L: 235
		hintArrowSubX = 0; // L: 236
		hintArrowSubY = 0; // L: 237
		playerAttackOption = AttackOption.AttackOption_hidden;
		npcAttackOption = AttackOption.AttackOption_hidden;
		titleLoadingStage = 0; // L: 242
		js5ConnectState = 0;
		field864 = 0; // L: 246
		js5Errors = 0; // L: 268
		loginState = 0; // L: 270
		field892 = 0; // L: 271
		field681 = 0; // L: 272
		field682 = 0; // L: 273
		field872 = class169.field2021; // L: 274
		Login_isUsernameRemembered = false; // L: 283
		secureRandomFuture = new SecureRandomFuture(); // L: 284
		randomDatData = null; // L: 289
		npcs = new NPC[32768]; // L: 293
		npcCount = 0; // L: 294
		npcIndices = new int[32768]; // L: 295
		field826 = 0; // L: 296
		field654 = new int[250]; // L: 297
		packetWriter = new PacketWriter(); // L: 300
		logoutTimer = 0; // L: 302
		field696 = false; // L: 303
		useBufferedSocket = true; // L: 304
		timer = new Timer(); // L: 305
		fontsMap = new HashMap(); // L: 311
		field700 = 0; // L: 318
		field701 = 1; // L: 319
		field702 = 0; // L: 320
		field703 = 1; // L: 321
		field704 = 0; // L: 322
		collisionMaps = new CollisionMap[4]; // L: 330
		isInInstance = false; // L: 331
		instanceChunkTemplates = new int[4][13][13]; // L: 332
		field708 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 333
		field850 = 0; // L: 336
		field711 = 2301979; // L: 348
		field712 = 5063219; // L: 349
		field713 = 3353893; // L: 350
		field714 = 7759444; // L: 351
		field692 = false; // L: 352
		alternativeScrollbarWidth = 0; // L: 353
		camAngleX = 128; // L: 361
		camAngleY = 0; // L: 362
		camAngleDY = 0; // L: 363
		camAngleDX = 0; // L: 364
		mouseCamClickedX = 0; // L: 365
		mouseCamClickedY = 0; // L: 366
		oculusOrbState = 0; // L: 367
		camFollowHeight = 50; // L: 368
		field755 = 0; // L: 372
		field761 = 0; // L: 373
		field788 = 0; // L: 374
		oculusOrbNormalSpeed = 12; // L: 376
		oculusOrbSlowedSpeed = 6; // L: 377
		field730 = 0; // L: 378
		field649 = false; // L: 379
		field732 = 0; // L: 380
		field843 = false; // L: 381
		field918 = 0; // L: 382
		overheadTextCount = 0; // L: 383
		overheadTextLimit = 50; // L: 384
		overheadTextXs = new int[overheadTextLimit]; // L: 385
		overheadTextYs = new int[overheadTextLimit]; // L: 386
		overheadTextAscents = new int[overheadTextLimit]; // L: 387
		overheadTextXOffsets = new int[overheadTextLimit]; // L: 388
		overheadTextColors = new int[overheadTextLimit]; // L: 389
		overheadTextEffects = new int[overheadTextLimit]; // L: 390
		overheadTextCyclesRemaining = new int[overheadTextLimit]; // L: 391
		overheadText = new String[overheadTextLimit]; // L: 392
		tileLastDrawnActor = new int[104][104]; // L: 393
		viewportDrawCount = 0; // L: 394
		viewportTempX = -1; // L: 395
		viewportTempY = -1; // L: 396
		mouseCrossX = 0; // L: 397
		mouseCrossY = 0; // L: 398
		mouseCrossState = 0; // L: 399
		mouseCrossColor = 0; // L: 400
		showMouseCross = true; // L: 401
		field754 = 0; // L: 403
		field881 = 0; // L: 404
		dragItemSlotSource = 0; // L: 407
		draggedWidgetX = 0; // L: 408
		draggedWidgetY = 0; // L: 409
		dragItemSlotDestination = 0; // L: 410
		field848 = false; // L: 411
		itemDragDuration = 0; // L: 412
		field762 = 0; // L: 413
		showLoadingMessages = true; // L: 415
		players = new Player[2048]; // L: 417
		localPlayerIndex = -1; // L: 419
		field766 = 0; // L: 420
		renderSelf = true; // L: 422
		drawPlayerNames = 0; // L: 427
		field769 = 0; // L: 428
		field770 = new int[1000]; // L: 429
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 431
		playerMenuActions = new String[8]; // L: 432
		playerOptionsPriorities = new boolean[8]; // L: 433
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 434
		combatTargetPlayerIndex = -1; // L: 435
		groundItems = new NodeDeque[4][104][104]; // L: 436
		pendingSpawns = new NodeDeque(); // L: 437
		projectiles = new NodeDeque(); // L: 438
		graphicsObjects = new NodeDeque(); // L: 439
		currentLevels = new int[25]; // L: 440
		levels = new int[25]; // L: 441
		experience = new int[25]; // L: 442
		leftClickOpensMenu = 0; // L: 443
		isMenuOpen = false; // L: 444
		menuOptionsCount = 0; // L: 450
		menuArguments1 = new int[500]; // L: 451
		menuArguments2 = new int[500]; // L: 452
		menuOpcodes = new int[500]; // L: 453
		menuIdentifiers = new int[500]; // L: 454
		menuActions = new String[500]; // L: 455
		menuTargets = new String[500]; // L: 456
		menuShiftClick = new boolean[500]; // L: 457
		followerOpsLowPriority = false; // L: 458
		shiftClickDrop = false; // L: 460
		tapToDrop = false; // L: 461
		showMouseOverText = true; // L: 462
		viewportX = -1; // L: 463
		viewportY = -1; // L: 464
		field799 = 0; // L: 468
		field751 = 50; // L: 469
		isItemSelected = 0; // L: 470
		selectedItemName = null; // L: 474
		isSpellSelected = false; // L: 475
		selectedSpellChildIndex = -1; // L: 477
		field836 = -1; // L: 478
		selectedSpellActionName = null; // L: 480
		selectedSpellName = null; // L: 481
		rootInterface = -1; // L: 482
		interfaceParents = new NodeHashTable(8); // L: 483
		field810 = 0; // L: 488
		field811 = -1; // L: 489
		chatEffects = 0; // L: 490
		field865 = 0; // L: 491
		meslayerContinueWidget = null; // L: 492
		runEnergy = 0; // L: 493
		weight = 0; // L: 494
		staffModLevel = 0; // L: 495
		followerIndex = -1; // L: 496
		playerMod = false; // L: 497
		viewportWidget = null; // L: 498
		clickedWidget = null; // L: 499
		clickedWidgetParent = null; // L: 500
		widgetClickX = 0; // L: 501
		widgetClickY = 0; // L: 502
		draggedOnWidget = null; // L: 503
		field859 = false; // L: 504
		field827 = -1; // L: 505
		field716 = -1; // L: 506
		field829 = false; // L: 507
		field853 = -1; // L: 508
		field862 = -1; // L: 509
		isDraggingWidget = false; // L: 510
		cycleCntr = 1; // L: 515
		changedVarps = new int[32]; // L: 518
		changedVarpCount = 0; // L: 519
		changedItemContainers = new int[32]; // L: 520
		field837 = 0; // L: 521
		changedSkills = new int[32]; // L: 522
		changedSkillsCount = 0; // L: 523
		chatCycle = 0; // L: 524
		field879 = 0; // L: 525
		field842 = 0; // L: 526
		field685 = 0; // L: 527
		field680 = 0; // L: 528
		field845 = 0; // L: 529
		mouseWheelRotation = 0; // L: 532
		scriptEvents = new NodeDeque(); // L: 533
		field715 = new NodeDeque(); // L: 534
		field849 = new NodeDeque(); // L: 535
		widgetFlags = new NodeHashTable(512); // L: 536
		rootWidgetCount = 0; // L: 538
		field852 = -2; // L: 539
		field901 = new boolean[100]; // L: 540
		field854 = new boolean[100]; // L: 541
		field855 = new boolean[100]; // L: 542
		rootWidgetXs = new int[100]; // L: 543
		rootWidgetYs = new int[100]; // L: 544
		rootWidgetWidths = new int[100]; // L: 545
		rootWidgetHeights = new int[100]; // L: 546
		gameDrawingMode = 0; // L: 547
		field861 = 0L; // L: 548
		isResizable = true; // L: 549
		field863 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 556
		publicChatMode = 0; // L: 557
		tradeChatMode = 0; // L: 559
		field871 = ""; // L: 560
		field868 = new long[100]; // L: 562
		field707 = 0; // L: 563
		field870 = 0; // L: 565
		field661 = new int[128]; // L: 566
		field693 = new int[128]; // L: 567
		field817 = -1L; // L: 568
		field874 = -1; // L: 571
		mapIconCount = 0; // L: 572
		mapIconXs = new int[1000]; // L: 573
		mapIconYs = new int[1000]; // L: 574
		mapIcons = new SpritePixels[1000]; // L: 575
		destinationX = 0; // L: 576
		destinationY = 0; // L: 577
		minimapState = 0; // L: 584
		currentTrackGroupId = -1; // L: 585
		field883 = false; // L: 586
		soundEffectCount = 0; // L: 592
		soundEffectIds = new int[50]; // L: 593
		queuedSoundEffectLoops = new int[50]; // L: 594
		queuedSoundEffectDelays = new int[50]; // L: 595
		soundLocations = new int[50]; // L: 596
		soundEffects = new SoundEffect[50]; // L: 597
		isCameraLocked = false; // L: 599
		field902 = new boolean[5]; // L: 611
		field679 = new int[5]; // L: 612
		field893 = new int[5]; // L: 613
		field705 = new int[5]; // L: 614
		field644 = new int[5]; // L: 615
		field896 = 256; // L: 616
		field897 = 205; // L: 617
		zoomHeight = 256; // L: 618
		zoomWidth = 320; // L: 619
		field900 = 1; // L: 620
		field731 = 32767; // L: 621
		field828 = 1; // L: 622
		field903 = 32767; // L: 623
		viewportOffsetX = 0; // L: 624
		viewportOffsetY = 0; // L: 625
		viewportWidth = 0; // L: 626
		viewportHeight = 0; // L: 627
		viewportZoom = 0; // L: 628
		playerComposition = new PlayerComposition(); // L: 630
		field813 = -1; // L: 631
		field911 = -1; // L: 632
		platformInfoProvider = new DesktopPlatformInfoProvider(); // L: 634
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 636
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 639
		field915 = -1; // L: 646
		archiveLoaders = new ArrayList(10); // L: 647
		archiveLoadersDone = 0; // L: 648
		field666 = 0; // L: 649
		field919 = new ApproximateRouteStrategy(); // L: 658
		field920 = new int[50]; // L: 659
		field921 = new int[50]; // L: 660
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "312942940"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field861 = class298.currentTimeMillis() + 500L; // L: 4200
		this.resizeJS(); // L: 4201
		if (rootInterface != -1) { // L: 4202
			this.resizeRoot(true);
		}

	} // L: 4203

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-91"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000}; // L: 854
		int[] var2 = new int[]{1000, 100, 500}; // L: 855
		if (var1 != null && var2 != null) { // L: 857
			SoundCache.ByteArrayPool_alternativeSizes = var1; // L: 863
			JagexCache.ByteArrayPool_altSizeArrayCounts = new int[var1.length]; // L: 864
			class23.ByteArrayPool_arrays = new byte[var1.length][][]; // L: 865

			for (int var3 = 0; var3 < SoundCache.ByteArrayPool_alternativeSizes.length; ++var3) { // L: 866
				class23.ByteArrayPool_arrays[var3] = new byte[var2[var3]][]; // L: 867
			}
		} else {
			SoundCache.ByteArrayPool_alternativeSizes = null; // L: 858
			JagexCache.ByteArrayPool_altSizeArrayCounts = null; // L: 859
			class23.ByteArrayPool_arrays = null; // L: 860
		}

		class278.port1 = gameBuild == 0 ? 43594 : worldId + 40000; // L: 870
		Players.port2 = gameBuild == 0 ? 443 : worldId + 50000; // L: 871
		ArchiveDiskAction.port3 = class278.port1; // L: 872
		PlayerComposition.field2551 = class224.field2569; // L: 873
		WorldMapScaleHandler.field366 = class224.field2565; // L: 874
		PlayerComposition.field2557 = class224.field2566; // L: 875
		WorldMapCacheName.field331 = class224.field2567; // L: 876
		GrandExchangeOfferAgeComparator.urlRequester = new UrlRequester(); // L: 877
		this.setUpKeyboard(); // L: 878
		this.setUpMouse(); // L: 879
		KitDefinition.mouseWheel = this.mouseWheel(); // L: 880
		class7.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 881
		AccessFile var4 = null; // L: 884
		ClientPreferences var5 = new ClientPreferences(); // L: 885

		try {
			var4 = WorldMapRegion.getPreferencesFile("", AttackOption.field1174.name, false); // L: 887
			byte[] var6 = new byte[(int)var4.length()]; // L: 888

			int var8;
			for (int var7 = 0; var7 < var6.length; var7 += var8) { // L: 889 890 893
				var8 = var4.read(var6, var7, var6.length - var7); // L: 891
				if (var8 == -1) { // L: 892
					throw new IOException();
				}
			}

			var5 = new ClientPreferences(new Buffer(var6)); // L: 895
		} catch (Exception var11) { // L: 897
		}

		try {
			if (var4 != null) { // L: 899
				var4.close();
			}
		} catch (Exception var10) { // L: 901
		}

		Timer.clientPreferences = var5; // L: 904
		this.setUpClipboard(); // L: 905
		String var12 = Message.null_string; // L: 907
		class60.applet = this; // L: 909
		if (var12 != null) { // L: 910
			class60.field439 = var12;
		}

		if (gameBuild != 0) { // L: 912
			displayFps = true;
		}

		class13.setWindowedMode(Timer.clientPreferences.windowMode); // L: 913
		MilliClock.friendSystem = new FriendSystem(GrandExchangeOfferUnitPriceComparator.loginType); // L: 914
	} // L: 915

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1376035132"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 918
		this.doCycleJs5(); // L: 919
		WorldMapEvent.method809(); // L: 920
		UrlRequester.method3381(); // L: 921
		FontName.playPcmPlayers(); // L: 922
		GraphicsObject.method2090(); // L: 923
		class4.method53(); // L: 924
		if (KitDefinition.mouseWheel != null) { // L: 925
			int var1 = KitDefinition.mouseWheel.useRotation(); // L: 926
			mouseWheelRotation = var1; // L: 927
		}

		if (gameState == 0) { // L: 929
			Canvas.load(); // L: 930
			GrandExchangeEvent.method153(); // L: 931
		} else if (gameState == 5) { // L: 933
			SequenceDefinition.doCycleTitle(this); // L: 934
			Canvas.load(); // L: 935
			GrandExchangeEvent.method153(); // L: 936
		} else if (gameState != 10 && gameState != 11) { // L: 938
			if (gameState == 20) { // L: 939
				SequenceDefinition.doCycleTitle(this); // L: 940
				this.doCycleLoggedOut(); // L: 941
			} else if (gameState == 25) { // L: 943
				WorldMapSection2.method377(false); // L: 944
				field700 = 0; // L: 945
				boolean var43 = true; // L: 946

				int var2;
				for (var2 = 0; var2 < WorldMapIcon_0.regionLandArchives.length; ++var2) { // L: 947
					if (class41.regionMapArchiveIds[var2] != -1 && WorldMapIcon_0.regionLandArchives[var2] == null) { // L: 948 949
						WorldMapIcon_0.regionLandArchives[var2] = GameShell.archive5.takeFile(class41.regionMapArchiveIds[var2], 0); // L: 950
						if (WorldMapIcon_0.regionLandArchives[var2] == null) { // L: 951
							var43 = false; // L: 952
							++field700; // L: 953
						}
					}

					if (GrandExchangeOfferTotalQuantityComparator.regionLandArchiveIds[var2] != -1 && MouseRecorder.regionMapArchives[var2] == null) { // L: 957 958
						MouseRecorder.regionMapArchives[var2] = GameShell.archive5.takeFileEncrypted(GrandExchangeOfferTotalQuantityComparator.regionLandArchiveIds[var2], 0, class227.xteaKeys[var2]); // L: 959
						if (MouseRecorder.regionMapArchives[var2] == null) { // L: 960
							var43 = false; // L: 961
							++field700; // L: 962
						}
					}
				}

				if (!var43) { // L: 967
					field704 = 1; // L: 968
				} else {
					field702 = 0; // L: 971
					var43 = true; // L: 972

					int var4;
					int var5;
					int var10;
					int var11;
					int var12;
					int var14;
					int var15;
					int var16;
					int var17;
					for (var2 = 0; var2 < WorldMapIcon_0.regionLandArchives.length; ++var2) { // L: 973
						byte[] var3 = MouseRecorder.regionMapArchives[var2]; // L: 974
						if (var3 != null) { // L: 975
							var4 = (FileSystem.regions[var2] >> 8) * 64 - NetFileRequest.baseX; // L: 976
							var5 = (FileSystem.regions[var2] & 255) * 64 - class41.baseY; // L: 977
							if (isInInstance) { // L: 978
								var4 = 10; // L: 979
								var5 = 10; // L: 980
							}

							boolean var8 = true; // L: 985
							Buffer var40 = new Buffer(var3); // L: 986
							var10 = -1; // L: 987

							label565:
							while (true) {
								var11 = var40.method5557(); // L: 989
								if (var11 == 0) { // L: 990
									var43 &= var8; // L: 1023
									break;
								}

								var10 += var11; // L: 991
								var12 = 0; // L: 992
								boolean var38 = false; // L: 993

								while (true) {
									while (!var38) { // L: 995
										var14 = var40.readUShortSmart(); // L: 1001
										if (var14 == 0) { // L: 1002
											continue label565;
										}

										var12 += var14 - 1; // L: 1003
										var15 = var12 & 63; // L: 1004
										var16 = var12 >> 6 & 63; // L: 1005
										var17 = var40.readUnsignedByte() >> 2; // L: 1006
										int var41 = var4 + var16; // L: 1007
										int var42 = var5 + var15; // L: 1008
										if (var41 > 0 && var42 > 0 && var41 < 103 && var42 < 103) { // L: 1009
											ObjectComposition var20 = WorldMapDecoration.getObjectDefinition(var10); // L: 1010
											if (var17 != 22 || !isLowDetail || var20.int1 != 0 || var20.interactType == 1 || var20.boolean2) { // L: 1011
												if (!var20.needsModelFiles()) { // L: 1012
													++field702; // L: 1013
													var8 = false; // L: 1014
												}

												var38 = true; // L: 1016
											}
										}
									}

									var14 = var40.readUShortSmart(); // L: 996
									if (var14 == 0) { // L: 997
										break;
									}

									var40.readUnsignedByte(); // L: 998
								}
							}
						}
					}

					if (!var43) { // L: 1026
						field704 = 2; // L: 1027
					} else {
						if (field704 != 0) { // L: 1030
							Varps.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
						}

						FontName.playPcmPlayers(); // L: 1031
						ArchiveLoader.scene.clear(); // L: 1032

						for (var2 = 0; var2 < 4; ++var2) { // L: 1033
							collisionMaps[var2].clear();
						}

						int var36;
						for (var2 = 0; var2 < 4; ++var2) { // L: 1034
							for (var36 = 0; var36 < 104; ++var36) { // L: 1035
								for (var4 = 0; var4 < 104; ++var4) { // L: 1036
									Tiles.Tiles_renderFlags[var2][var36][var4] = 0; // L: 1037
								}
							}
						}

						FontName.playPcmPlayers(); // L: 1041
						DirectByteArrayCopier.method3983(); // L: 1042
						var2 = WorldMapIcon_0.regionLandArchives.length; // L: 1043

						for (ObjectSound var44 = (ObjectSound)ObjectSound.objectSounds.last(); var44 != null; var44 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 1045
							if (var44.stream1 != null) { // L: 1046
								WorldMapManager.pcmStreamMixer.removeSubStream(var44.stream1); // L: 1047
								var44.stream1 = null; // L: 1048
							}

							if (var44.stream2 != null) { // L: 1050
								WorldMapManager.pcmStreamMixer.removeSubStream(var44.stream2); // L: 1051
								var44.stream2 = null; // L: 1052
							}
						}

						ObjectSound.objectSounds.clear(); // L: 1055
						WorldMapSection2.method377(true); // L: 1057
						int var6;
						if (!isInInstance) { // L: 1058
							byte[] var39;
							for (var36 = 0; var36 < var2; ++var36) { // L: 1059
								var4 = (FileSystem.regions[var36] >> 8) * 64 - NetFileRequest.baseX; // L: 1060
								var5 = (FileSystem.regions[var36] & 255) * 64 - class41.baseY; // L: 1061
								var39 = WorldMapIcon_0.regionLandArchives[var36]; // L: 1062
								if (var39 != null) { // L: 1063
									FontName.playPcmPlayers(); // L: 1064
									class69.method1252(var39, var4, var5, class182.field2112 * 8 - 48, UserComparator6.field2013 * 8 - 48, collisionMaps); // L: 1065
								}
							}

							for (var36 = 0; var36 < var2; ++var36) { // L: 1068
								var4 = (FileSystem.regions[var36] >> 8) * 64 - NetFileRequest.baseX; // L: 1069
								var5 = (FileSystem.regions[var36] & 255) * 64 - class41.baseY; // L: 1070
								var39 = WorldMapIcon_0.regionLandArchives[var36]; // L: 1071
								if (var39 == null && UserComparator6.field2013 < 800) { // L: 1072
									FontName.playPcmPlayers(); // L: 1073
									class39.method594(var4, var5, 64, 64); // L: 1074
								}
							}

							WorldMapSection2.method377(true); // L: 1077

							for (var36 = 0; var36 < var2; ++var36) { // L: 1078
								byte[] var37 = MouseRecorder.regionMapArchives[var36]; // L: 1079
								if (var37 != null) { // L: 1080
									var5 = (FileSystem.regions[var36] >> 8) * 64 - NetFileRequest.baseX; // L: 1081
									var6 = (FileSystem.regions[var36] & 255) * 64 - class41.baseY; // L: 1082
									FontName.playPcmPlayers(); // L: 1083
									class169.method3533(var37, var5, var6, ArchiveLoader.scene, collisionMaps); // L: 1084
								}
							}
						}

						int var7;
						int var9;
						int var46;
						if (isInInstance) { // L: 1088
							var36 = 0;

							label477:
							while (true) {
								if (var36 >= 4) {
									for (var36 = 0; var36 < 13; ++var36) { // L: 1115
										for (var4 = 0; var4 < 13; ++var4) { // L: 1116
											var5 = instanceChunkTemplates[0][var36][var4]; // L: 1117
											if (var5 == -1) { // L: 1118
												class39.method594(var36 * 8, var4 * 8, 8, 8); // L: 1119
											}
										}
									}

									WorldMapSection2.method377(true); // L: 1123
									var36 = 0;

									while (true) {
										if (var36 >= 4) {
											break label477;
										}

										FontName.playPcmPlayers(); // L: 1125

										for (var4 = 0; var4 < 13; ++var4) { // L: 1126
											label434:
											for (var5 = 0; var5 < 13; ++var5) { // L: 1127
												var6 = instanceChunkTemplates[var36][var4][var5]; // L: 1128
												if (var6 != -1) { // L: 1129
													var7 = var6 >> 24 & 3; // L: 1130
													var46 = var6 >> 1 & 3; // L: 1131
													var9 = var6 >> 14 & 1023; // L: 1132
													var10 = var6 >> 3 & 2047; // L: 1133
													var11 = (var9 / 8 << 8) + var10 / 8; // L: 1134

													for (var12 = 0; var12 < FileSystem.regions.length; ++var12) { // L: 1135
														if (FileSystem.regions[var12] == var11 && MouseRecorder.regionMapArchives[var12] != null) { // L: 1136
															byte[] var13 = MouseRecorder.regionMapArchives[var12]; // L: 1137
															var14 = var4 * 8; // L: 1138
															var15 = var5 * 8; // L: 1139
															var16 = (var9 & 7) * 8; // L: 1140
															var17 = (var10 & 7) * 8; // L: 1141
															Scene var18 = ArchiveLoader.scene; // L: 1142
															CollisionMap[] var19 = collisionMaps; // L: 1143
															Buffer var47 = new Buffer(var13); // L: 1145
															int var21 = -1; // L: 1146

															while (true) {
																int var22 = var47.method5557(); // L: 1148
																if (var22 == 0) { // L: 1149
																	continue label434;
																}

																var21 += var22; // L: 1150
																int var23 = 0; // L: 1151

																while (true) {
																	int var24 = var47.readUShortSmart(); // L: 1153
																	if (var24 == 0) { // L: 1154
																		break;
																	}

																	var23 += var24 - 1; // L: 1155
																	int var25 = var23 & 63; // L: 1156
																	int var26 = var23 >> 6 & 63; // L: 1157
																	int var27 = var23 >> 12; // L: 1158
																	int var28 = var47.readUnsignedByte(); // L: 1159
																	int var29 = var28 >> 2; // L: 1160
																	int var30 = var28 & 3; // L: 1161
																	if (var27 == var7 && var26 >= var16 && var26 < var16 + 8 && var25 >= var17 && var25 < var17 + 8) { // L: 1162
																		ObjectComposition var31 = WorldMapDecoration.getObjectDefinition(var21); // L: 1163
																		int var32 = var14 + HitSplatDefinition.method4612(var26 & 7, var25 & 7, var46, var31.sizeX, var31.sizeY, var30); // L: 1164
																		int var33 = var15 + World.method1871(var26 & 7, var25 & 7, var46, var31.sizeX, var31.sizeY, var30); // L: 1165
																		if (var32 > 0 && var33 > 0 && var32 < 103 && var33 < 103) { // L: 1166
																			int var34 = var36; // L: 1167
																			if ((Tiles.Tiles_renderFlags[1][var32][var33] & 2) == 2) { // L: 1168
																				var34 = var36 - 1;
																			}

																			CollisionMap var35 = null; // L: 1169
																			if (var34 >= 0) { // L: 1170
																				var35 = var19[var34];
																			}

																			class7.method90(var36, var32, var33, var21, var30 + var46 & 3, var29, var18, var35); // L: 1171
																		}
																	}
																}
															}
														}
													}
												}
											}
										}

										++var36; // L: 1124
									}
								}

								FontName.playPcmPlayers(); // L: 1090

								for (var4 = 0; var4 < 13; ++var4) { // L: 1091
									for (var5 = 0; var5 < 13; ++var5) { // L: 1092
										boolean var45 = false; // L: 1093
										var7 = instanceChunkTemplates[var36][var4][var5]; // L: 1094
										if (var7 != -1) { // L: 1095
											var46 = var7 >> 24 & 3; // L: 1096
											var9 = var7 >> 1 & 3; // L: 1097
											var10 = var7 >> 14 & 1023; // L: 1098
											var11 = var7 >> 3 & 2047; // L: 1099
											var12 = (var10 / 8 << 8) + var11 / 8; // L: 1100

											for (int var50 = 0; var50 < FileSystem.regions.length; ++var50) { // L: 1101
												if (FileSystem.regions[var50] == var12 && WorldMapIcon_0.regionLandArchives[var50] != null) { // L: 1102
													WorldMapDecoration.method381(WorldMapIcon_0.regionLandArchives[var50], var36, var4 * 8, var5 * 8, var46, (var10 & 7) * 8, (var11 & 7) * 8, var9, collisionMaps); // L: 1103
													var45 = true; // L: 1104
													break;
												}
											}
										}

										if (!var45) { // L: 1109
											ReflectionCheck.method2350(var36, var4 * 8, var5 * 8); // L: 1110
										}
									}
								}

								++var36; // L: 1089
							}
						}

						WorldMapSection2.method377(true); // L: 1185
						FontName.playPcmPlayers(); // L: 1186
						LoginPacket.method3673(ArchiveLoader.scene, collisionMaps); // L: 1187
						WorldMapSection2.method377(true); // L: 1188
						var36 = Tiles.Tiles_minPlane; // L: 1189
						if (var36 > GameObject.Client_plane) { // L: 1190
							var36 = GameObject.Client_plane;
						}

						if (var36 < GameObject.Client_plane - 1) { // L: 1191
							var36 = GameObject.Client_plane - 1;
						}

						if (isLowDetail) { // L: 1192
							ArchiveLoader.scene.init(Tiles.Tiles_minPlane);
						} else {
							ArchiveLoader.scene.init(0); // L: 1193
						}

						for (var4 = 0; var4 < 104; ++var4) { // L: 1194
							for (var5 = 0; var5 < 104; ++var5) { // L: 1195
								MouseRecorder.updateItemPile(var4, var5); // L: 1196
							}
						}

						FontName.playPcmPlayers(); // L: 1199

						for (PendingSpawn var48 = (PendingSpawn)pendingSpawns.last(); var48 != null; var48 = (PendingSpawn)pendingSpawns.previous()) { // L: 1201 1202 1208
							if (var48.hitpoints == -1) { // L: 1203
								var48.delay = 0; // L: 1204
								class7.method86(var48); // L: 1205
							} else {
								var48.remove(); // L: 1207
							}
						}

						ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 1211
						PacketBufferNode var49;
						if (WorldMapIcon_0.client.hasFrame()) { // L: 1212
							var49 = ItemContainer.getPacketBufferNode(ClientPacket.field2299, packetWriter.isaacCipher); // L: 1214
							var49.packetBuffer.writeInt(1057001181); // L: 1215
							packetWriter.addNode(var49); // L: 1216
						}

						if (!isInInstance) { // L: 1218
							var4 = (class182.field2112 - 6) / 8; // L: 1219
							var5 = (class182.field2112 + 6) / 8; // L: 1220
							var6 = (UserComparator6.field2013 - 6) / 8; // L: 1221
							var7 = (UserComparator6.field2013 + 6) / 8; // L: 1222

							for (var46 = var4 - 1; var46 <= var5 + 1; ++var46) { // L: 1223
								for (var9 = var6 - 1; var9 <= var7 + 1; ++var9) { // L: 1224
									if (var46 < var4 || var46 > var5 || var9 < var6 || var9 > var7) { // L: 1225
										GameShell.archive5.loadRegionFromName("m" + var46 + "_" + var9); // L: 1226
										GameShell.archive5.loadRegionFromName("l" + var46 + "_" + var9); // L: 1227
									}
								}
							}
						}

						WorldMapCacheName.updateGameState(30); // L: 1231
						FontName.playPcmPlayers(); // L: 1232
						Tiles.field514 = null; // L: 1234
						Tiles.field508 = null; // L: 1235
						class9.field40 = null; // L: 1236
						Username.field3663 = null; // L: 1237
						GrandExchangeOfferWorldComparator.field52 = null; // L: 1238
						Tiles.field511 = null; // L: 1239
						class92.field1173 = null; // L: 1240
						VarbitComposition.Tiles_hue = null; // L: 1241
						ArchiveDiskActionHandler.Tiles_saturation = null; // L: 1242
						class92.Tiles_lightness = null; // L: 1243
						UserComparator7.Tiles_hueMultiplier = null; // L: 1244
						Varcs.field1283 = null; // L: 1245
						var49 = ItemContainer.getPacketBufferNode(ClientPacket.field2235, packetWriter.isaacCipher); // L: 1247
						packetWriter.addNode(var49); // L: 1248
						class225.clock.mark(); // L: 1250

						for (var5 = 0; var5 < 32; ++var5) { // L: 1251
							GameShell.graphicsTickTimes[var5] = 0L;
						}

						for (var5 = 0; var5 < 32; ++var5) { // L: 1252
							GameShell.clientTickTimes[var5] = 0L;
						}

						class8.gameCyclesToDo = 0; // L: 1253
					}
				}
			}
		} else {
			SequenceDefinition.doCycleTitle(this);
		}

		if (gameState == 30) { // L: 1256
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) { // L: 1257
			this.doCycleLoggedOut();
		}

	} // L: 1258

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-20163413"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2 = WorldMapIcon_1.method355(); // L: 1261
		if (var2 && field883 && AbstractWorldMapData.pcmPlayer0 != null) { // L: 1262 1263
			AbstractWorldMapData.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && field861 != 0L && class298.currentTimeMillis() > field861) { // L: 1265 1266
			class13.setWindowedMode(SoundSystem.getWindowedMode()); // L: 1267
		}

		int var3;
		if (var1) { // L: 1270
			for (var3 = 0; var3 < 100; ++var3) { // L: 1271
				field901[var3] = true;
			}
		}

		if (gameState == 0) { // L: 1273
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1274
			ArchiveLoader.drawTitle(GrandExchangeOfferTotalQuantityComparator.fontBold12, class297.fontPlain11, WorldMapLabelSize.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1275
			if (gameState == 20) { // L: 1276
				ArchiveLoader.drawTitle(GrandExchangeOfferTotalQuantityComparator.fontBold12, class297.fontPlain11, WorldMapLabelSize.fontPlain12);
			} else if (gameState == 25) { // L: 1277
				if (field704 == 1) { // L: 1278
					if (field700 > field701) { // L: 1279
						field701 = field700;
					}

					var3 = (field701 * 50 - field700 * 50) / field701; // L: 1280
					Varps.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false); // L: 1281
				} else if (field704 == 2) { // L: 1283
					if (field702 > field703) { // L: 1284
						field703 = field702;
					}

					var3 = (field703 * 50 - field702 * 50) / field703 + 50; // L: 1285
					Varps.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false); // L: 1286
				} else {
					Varps.drawLoadingMessage("Loading - please wait.", false); // L: 1288
				}
			} else if (gameState == 30) { // L: 1290
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1291
				Varps.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1292
				Varps.drawLoadingMessage("Please wait...", false);
			}
		} else {
			ArchiveLoader.drawTitle(GrandExchangeOfferTotalQuantityComparator.fontBold12, class297.fontPlain11, WorldMapLabelSize.fontPlain12); // L: 1282
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) { // L: 1293
			for (var3 = 0; var3 < rootWidgetCount; ++var3) { // L: 1294
				if (field854[var3]) { // L: 1295
					WorldMapIcon_0.rasterProvider.draw(rootWidgetXs[var3], rootWidgetYs[var3], rootWidgetWidths[var3], rootWidgetHeights[var3]); // L: 1296
					field854[var3] = false; // L: 1297
				}
			}
		} else if (gameState > 0) { // L: 1301
			WorldMapIcon_0.rasterProvider.drawFull(0, 0); // L: 1302

			for (var3 = 0; var3 < rootWidgetCount; ++var3) { // L: 1303
				field854[var3] = false;
			}
		}

	} // L: 1305

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-6923156"
	)
	@Export("kill0")
	protected final void kill0() {
		if (Varcs.varcs.hasUnwrittenChanges()) { // L: 1308
			Varcs.varcs.write();
		}

		if (SoundCache.mouseRecorder != null) { // L: 1309
			SoundCache.mouseRecorder.isRunning = false;
		}

		SoundCache.mouseRecorder = null; // L: 1310
		packetWriter.close(); // L: 1311
		WorldMapEvent.method807(); // L: 1312
		class3.method43(); // L: 1313
		KitDefinition.mouseWheel = null; // L: 1314
		if (AbstractWorldMapData.pcmPlayer0 != null) { // L: 1315
			AbstractWorldMapData.pcmPlayer0.shutdown();
		}

		if (FriendLoginUpdate.pcmPlayer1 != null) { // L: 1316
			FriendLoginUpdate.pcmPlayer1.shutdown();
		}

		method1583(); // L: 1317
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 1319
			if (ArchiveDiskActionHandler.field3178 != 0) { // L: 1320
				ArchiveDiskActionHandler.field3178 = 1; // L: 1321

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait(); // L: 1323
				} catch (InterruptedException var5) { // L: 1325
				}
			}
		}

		if (GrandExchangeOfferAgeComparator.urlRequester != null) { // L: 1329
			GrandExchangeOfferAgeComparator.urlRequester.close(); // L: 1330
			GrandExchangeOfferAgeComparator.urlRequester = null; // L: 1331
		}

		try {
			JagexCache.JagexCache_dat2File.close(); // L: 1335

			for (int var4 = 0; var4 < MusicPatchPcmStream.idxCount; ++var4) { // L: 1336
				PlayerComposition.JagexCache_idxFiles[var4].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 1337
			JagexCache.JagexCache_randomDat.close(); // L: 1338
		} catch (Exception var6) { // L: 1340
		}

	} // L: 1342

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "96"
	)
	protected final void vmethod1777() {
	} // L: 667

	public final void init() {
		try {
			if (this.checkHost()) { // L: 673
				for (int var1 = 0; var1 <= 20; ++var1) { // L: 674
					String var2 = this.getParameter(Integer.toString(var1)); // L: 675
					if (var2 != null) { // L: 676
						switch(var1) { // L: 677
						case 1:
							useBufferedSocket = Integer.parseInt(var2) != 0; // L: 740
						case 2:
						case 11:
						case 13:
						case 16:
						default:
							break;
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 713
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 714
							}
							break;
						case 4:
							if (clientType == -1) { // L: 706
								clientType = Integer.parseInt(var2); // L: 707
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 680
							break; // L: 681
						case 6:
							WorldMapScaleHandler.clientLanguage = Language.method3701(Integer.parseInt(var2)); // L: 730
							break; // L: 731
						case 7:
							class25.field125 = ArchiveLoader.method1225(Integer.parseInt(var2)); // L: 745
							break; // L: 746
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 724
							}
							break;
						case 9:
							WorldMapSection1.field317 = var2; // L: 685
							break; // L: 686
						case 10:
							StudioGame[] var3 = new StudioGame[]{StudioGame.runescape, StudioGame.stellardawn, StudioGame.game4, StudioGame.game5, StudioGame.game3, StudioGame.oldscape}; // L: 692
							AttackOption.field1174 = (StudioGame)UrlRequester.findEnumerated(var3, Integer.parseInt(var2)); // L: 694
							if (StudioGame.oldscape == AttackOption.field1174) { // L: 695
								GrandExchangeOfferUnitPriceComparator.loginType = LoginType.oldscape;
							} else {
								GrandExchangeOfferUnitPriceComparator.loginType = LoginType.field4072; // L: 696
							}
							break;
						case 12:
							worldId = Integer.parseInt(var2); // L: 719
							break; // L: 720
						case 14:
							MidiPcmStream.field2455 = Integer.parseInt(var2); // L: 735
							break; // L: 736
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 701
							break; // L: 702
						case 17:
							GrandExchangeOfferTotalQuantityComparator.field75 = var2; // L: 750
						}
					}
				}

				class39.method596(); // L: 756
				WorldMapSprite.worldHost = this.getCodeBase().getHost(); // L: 757
				String var11 = class25.field125.name; // L: 758
				byte var12 = 0; // L: 759

				try {
					MusicPatchPcmStream.idxCount = 21; // L: 762
					JagexCache.cacheGamebuild = var12; // L: 763

					try {
						WorldMapScaleHandler.field365 = System.getProperty("os.name"); // L: 765
					} catch (Exception var18) { // L: 767
						WorldMapScaleHandler.field365 = "Unknown"; // L: 768
					}

					ObjectSound.field1077 = WorldMapScaleHandler.field365.toLowerCase(); // L: 770

					try {
						ItemLayer.userHomeDirectory = System.getProperty("user.home"); // L: 772
						if (ItemLayer.userHomeDirectory != null) { // L: 773
							ItemLayer.userHomeDirectory = ItemLayer.userHomeDirectory + "/";
						}
					} catch (Exception var17) { // L: 775
					}

					try {
						if (ObjectSound.field1077.startsWith("win")) { // L: 777
							if (ItemLayer.userHomeDirectory == null) { // L: 778
								ItemLayer.userHomeDirectory = System.getenv("USERPROFILE");
							}
						} else if (ItemLayer.userHomeDirectory == null) { // L: 781
							ItemLayer.userHomeDirectory = System.getenv("HOME");
						}

						if (ItemLayer.userHomeDirectory != null) { // L: 783
							ItemLayer.userHomeDirectory = ItemLayer.userHomeDirectory + "/";
						}
					} catch (Exception var16) { // L: 785
					}

					if (ItemLayer.userHomeDirectory == null) { // L: 786
						ItemLayer.userHomeDirectory = "~/";
					}

					GraphicsObject.field1117 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", ItemLayer.userHomeDirectory, "/tmp/", ""}; // L: 787
					DynamicObject.field1318 = new String[]{".jagex_cache_" + JagexCache.cacheGamebuild, ".file_store_" + JagexCache.cacheGamebuild}; // L: 788

					label144:
					for (int var13 = 0; var13 < 4; ++var13) { // L: 789
						JagexCache.cacheDir = class58.method917("oldschool", var11, var13); // L: 790
						if (!JagexCache.cacheDir.exists()) { // L: 791
							JagexCache.cacheDir.mkdirs();
						}

						File[] var4 = JagexCache.cacheDir.listFiles(); // L: 792
						if (var4 == null) { // L: 793
							break;
						}

						File[] var5 = var4; // L: 795
						int var6 = 0;

						while (true) {
							if (var6 >= var5.length) {
								break label144;
							}

							File var7 = var5[var6]; // L: 797

							boolean var8;
							try {
								RandomAccessFile var9 = new RandomAccessFile(var7, "rw"); // L: 802
								int var10 = var9.read(); // L: 803
								var9.seek(0L); // L: 804
								var9.write(var10); // L: 805
								var9.seek(0L); // L: 806
								var9.close(); // L: 807
								var8 = true; // L: 809
							} catch (Exception var15) { // L: 811
								var8 = false; // L: 812
							}

							if (!var8) { // L: 815
								break;
							}

							++var6; // L: 796
						}
					}

					File var21 = JagexCache.cacheDir; // L: 822
					FileSystem.FileSystem_cacheDir = var21; // L: 824
					if (!FileSystem.FileSystem_cacheDir.exists()) { // L: 825
						throw new RuntimeException("");
					}

					FileSystem.FileSystem_hasPermissions = true; // L: 826
					WorldMapData_0.method237(); // L: 828
					JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(ModelData0.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 829
					JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(ModelData0.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 830
					PlayerComposition.JagexCache_idxFiles = new BufferedFile[MusicPatchPcmStream.idxCount]; // L: 831

					for (int var14 = 0; var14 < MusicPatchPcmStream.idxCount; ++var14) { // L: 832
						PlayerComposition.JagexCache_idxFiles[var14] = new BufferedFile(new AccessFile(ModelData0.getFile("main_file_cache.idx" + var14), "rw", 1048576L), 6000, 0); // L: 833
					}
				} catch (Exception var19) { // L: 837
					PlayerComposition.RunException_sendStackTrace((String)null, var19); // L: 838
				}

				WorldMapIcon_0.client = this; // L: 840
				class39.clientType = clientType; // L: 841
				if (field651 == -1) { // L: 842
					field651 = 0; // L: 843
				}

				this.startThread(765, 503, 193); // L: 845
			}
		} catch (RuntimeException var20) {
			throw UserComparator9.newRunException(var20, "client.init(" + ')');
		}
	} // L: 846

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1381
			long var2 = class298.currentTimeMillis(); // L: 1384
			int var4 = (int)(var2 - NetCache.field3195); // L: 1385
			NetCache.field3195 = var2; // L: 1386
			if (var4 > 200) { // L: 1387
				var4 = 200;
			}

			NetCache.NetCache_loadTime += var4; // L: 1388
			boolean var1;
			if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) { // L: 1389
				var1 = true; // L: 1390
			} else if (NetCache.NetCache_socket == null) { // L: 1393
				var1 = false; // L: 1394
			} else {
				try {
					label246: {
						if (NetCache.NetCache_loadTime > 30000) { // L: 1398
							throw new IOException();
						}

						NetFileRequest var5;
						Buffer var6;
						while (NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) { // L: 1399
							var5 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first(); // L: 1400
							var6 = new Buffer(4); // L: 1401
							var6.writeByte(1); // L: 1402
							var6.writeMedium((int)var5.key); // L: 1403
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1404
							NetCache.NetCache_pendingPriorityResponses.put(var5, var5.key); // L: 1405
							--NetCache.NetCache_pendingPriorityWritesCount; // L: 1406
							++NetCache.NetCache_pendingPriorityResponsesCount; // L: 1407
						}

						while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) { // L: 1409
							var5 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast(); // L: 1410
							var6 = new Buffer(4); // L: 1411
							var6.writeByte(0); // L: 1412
							var6.writeMedium((int)var5.key); // L: 1413
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1414
							var5.removeDual(); // L: 1415
							NetCache.NetCache_pendingResponses.put(var5, var5.key); // L: 1416
							--NetCache.NetCache_pendingWritesCount; // L: 1417
							++NetCache.NetCache_pendingResponsesCount; // L: 1418
						}

						for (int var17 = 0; var17 < 100; ++var17) { // L: 1420
							int var18 = NetCache.NetCache_socket.available(); // L: 1421
							if (var18 < 0) { // L: 1422
								throw new IOException();
							}

							if (var18 == 0) { // L: 1423
								break;
							}

							NetCache.NetCache_loadTime = 0; // L: 1424
							byte var7 = 0; // L: 1425
							if (NetCache.NetCache_currentResponse == null) { // L: 1426
								var7 = 8;
							} else if (NetCache.field3207 == 0) { // L: 1427
								var7 = 1;
							}

							int var8;
							int var9;
							int var10;
							int var12;
							byte[] var10000;
							int var10001;
							Buffer var25;
							if (var7 > 0) { // L: 1428
								var8 = var7 - NetCache.NetCache_responseHeaderBuffer.offset; // L: 1429
								if (var8 > var18) { // L: 1430
									var8 = var18;
								}

								NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var8); // L: 1431
								if (NetCache.field3210 != 0) { // L: 1432
									for (var9 = 0; var9 < var8; ++var9) { // L: 1433
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = var9 + NetCache.NetCache_responseHeaderBuffer.offset;
										var10000[var10001] ^= NetCache.field3210;
									}
								}

								var25 = NetCache.NetCache_responseHeaderBuffer; // L: 1435
								var25.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) { // L: 1436
									break;
								}

								if (NetCache.NetCache_currentResponse == null) { // L: 1437
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1438
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1439
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort(); // L: 1440
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1441
									var12 = NetCache.NetCache_responseHeaderBuffer.readInt(); // L: 1442
									long var13 = (long)(var10 + (var9 << 16)); // L: 1443
									NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var13); // L: 1444
									UserComparator4.field1988 = true; // L: 1445
									if (var15 == null) { // L: 1446
										var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var13); // L: 1447
										UserComparator4.field1988 = false; // L: 1448
									}

									if (var15 == null) { // L: 1450
										throw new IOException(); // L: 1451
									}

									int var16 = var11 == 0 ? 5 : 9; // L: 1453
									NetCache.NetCache_currentResponse = var15; // L: 1454
									class206.NetCache_responseArchiveBuffer = new Buffer(var16 + var12 + NetCache.NetCache_currentResponse.padding); // L: 1455
									class206.NetCache_responseArchiveBuffer.writeByte(var11); // L: 1456
									class206.NetCache_responseArchiveBuffer.writeInt(var12); // L: 1457
									NetCache.field3207 = 8; // L: 1458
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1459
								} else if (NetCache.field3207 == 0) { // L: 1462
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) { // L: 1463
										NetCache.field3207 = 1; // L: 1464
										NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1465
									} else {
										NetCache.NetCache_currentResponse = null; // L: 1469
									}
								}
							} else {
								var8 = class206.NetCache_responseArchiveBuffer.array.length - NetCache.NetCache_currentResponse.padding; // L: 1475
								var9 = 512 - NetCache.field3207; // L: 1476
								if (var9 > var8 - class206.NetCache_responseArchiveBuffer.offset) { // L: 1477
									var9 = var8 - class206.NetCache_responseArchiveBuffer.offset;
								}

								if (var9 > var18) { // L: 1478
									var9 = var18;
								}

								NetCache.NetCache_socket.read(class206.NetCache_responseArchiveBuffer.array, class206.NetCache_responseArchiveBuffer.offset, var9); // L: 1479
								if (NetCache.field3210 != 0) { // L: 1480
									for (var10 = 0; var10 < var9; ++var10) { // L: 1481
										var10000 = class206.NetCache_responseArchiveBuffer.array;
										var10001 = class206.NetCache_responseArchiveBuffer.offset + var10;
										var10000[var10001] ^= NetCache.field3210;
									}
								}

								var25 = class206.NetCache_responseArchiveBuffer; // L: 1483
								var25.offset += var9;
								NetCache.field3207 += var9; // L: 1484
								if (var8 == class206.NetCache_responseArchiveBuffer.offset) { // L: 1485
									if (16711935L == NetCache.NetCache_currentResponse.key) { // L: 1486
										WorldMapLabel.NetCache_reference = class206.NetCache_responseArchiveBuffer; // L: 1487

										for (var10 = 0; var10 < 256; ++var10) { // L: 1488
											Archive var19 = NetCache.NetCache_archives[var10]; // L: 1489
											if (var19 != null) { // L: 1490
												WorldMapLabel.NetCache_reference.offset = var10 * 8 + 5; // L: 1491
												var12 = WorldMapLabel.NetCache_reference.readInt(); // L: 1492
												int var20 = WorldMapLabel.NetCache_reference.readInt(); // L: 1493
												var19.loadIndex(var12, var20); // L: 1494
											}
										}
									} else {
										NetCache.NetCache_crc.reset(); // L: 1499
										NetCache.NetCache_crc.update(class206.NetCache_responseArchiveBuffer.array, 0, var8); // L: 1500
										var10 = (int)NetCache.NetCache_crc.getValue(); // L: 1501
										if (var10 != NetCache.NetCache_currentResponse.crc) { // L: 1502
											try {
												NetCache.NetCache_socket.close(); // L: 1504
											} catch (Exception var23) { // L: 1506
											}

											++NetCache.NetCache_crcMismatches; // L: 1507
											NetCache.NetCache_socket = null; // L: 1508
											NetCache.field3210 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 1509
											var1 = false; // L: 1510
											break label246;
										}

										NetCache.NetCache_crcMismatches = 0; // L: 1513
										NetCache.NetCache_ioExceptions = 0; // L: 1514
										NetCache.NetCache_currentResponse.archive.write((int)(NetCache.NetCache_currentResponse.key & 65535L), class206.NetCache_responseArchiveBuffer.array, (NetCache.NetCache_currentResponse.key & 16711680L) == 16711680L, UserComparator4.field1988); // L: 1515
									}

									NetCache.NetCache_currentResponse.remove(); // L: 1517
									if (UserComparator4.field1988) { // L: 1518
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount; // L: 1519
									}

									NetCache.field3207 = 0; // L: 1520
									NetCache.NetCache_currentResponse = null; // L: 1521
									class206.NetCache_responseArchiveBuffer = null; // L: 1522
								} else {
									if (NetCache.field3207 != 512) { // L: 1524
										break;
									}

									NetCache.field3207 = 0;
								}
							}
						}

						var1 = true; // L: 1528
					}
				} catch (IOException var24) {
					try {
						NetCache.NetCache_socket.close(); // L: 1532
					} catch (Exception var22) { // L: 1534
					}

					++NetCache.NetCache_ioExceptions; // L: 1535
					NetCache.NetCache_socket = null; // L: 1536
					var1 = false; // L: 1537
				}
			}

			if (!var1) { // L: 1541
				this.doCycleJs5Connect();
			}

		}
	} // L: 1542

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-278380129"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) { // L: 1545
			this.error("js5crc"); // L: 1546
			gameState = 1000; // L: 1547
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) { // L: 1550
				if (gameState <= 5) { // L: 1551
					this.error("js5io"); // L: 1552
					gameState = 1000; // L: 1553
					return; // L: 1554
				}

				field864 = 3000; // L: 1557
				NetCache.NetCache_ioExceptions = 3; // L: 1558
			}

			if (--field864 + 1 <= 0) { // L: 1561
				try {
					if (js5ConnectState == 0) { // L: 1563
						WorldMapManager.js5SocketTask = GameShell.taskHandler.newSocketTask(WorldMapSprite.worldHost, ArchiveDiskAction.port3); // L: 1564
						++js5ConnectState; // L: 1565
					}

					if (js5ConnectState == 1) { // L: 1567
						if (WorldMapManager.js5SocketTask.status == 2) { // L: 1568
							this.js5Error(-1); // L: 1569
							return; // L: 1570
						}

						if (WorldMapManager.js5SocketTask.status == 1) { // L: 1572
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1574
						if (useBufferedSocket) { // L: 1575
							TaskHandler.js5Socket = class219.method4011((Socket)WorldMapManager.js5SocketTask.result, 40000, 5000); // L: 1576
						} else {
							TaskHandler.js5Socket = new NetSocket((Socket)WorldMapManager.js5SocketTask.result, GameShell.taskHandler, 5000); // L: 1579
						}

						Buffer var1 = new Buffer(5); // L: 1581
						var1.writeByte(15); // L: 1582
						var1.writeInt(193); // L: 1583
						TaskHandler.js5Socket.write(var1.array, 0, 5); // L: 1584
						++js5ConnectState; // L: 1585
						LoginPacket.field2341 = class298.currentTimeMillis(); // L: 1586
					}

					if (js5ConnectState == 3) { // L: 1588
						if (TaskHandler.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) { // L: 1589
							int var5 = TaskHandler.js5Socket.readUnsignedByte(); // L: 1590
							if (var5 != 0) { // L: 1591
								this.js5Error(var5); // L: 1592
								return; // L: 1593
							}

							++js5ConnectState; // L: 1595
						} else if (class298.currentTimeMillis() - LoginPacket.field2341 > 30000L) { // L: 1598
							this.js5Error(-2); // L: 1599
							return; // L: 1600
						}
					}

					if (js5ConnectState == 4) { // L: 1604
						AbstractSocket var10 = TaskHandler.js5Socket; // L: 1605
						boolean var2 = gameState > 20; // L: 1606
						if (NetCache.NetCache_socket != null) { // L: 1608
							try {
								NetCache.NetCache_socket.close(); // L: 1610
							} catch (Exception var8) { // L: 1612
							}

							NetCache.NetCache_socket = null; // L: 1613
						}

						NetCache.NetCache_socket = var10; // L: 1615
						SoundSystem.method2564(var2); // L: 1616
						NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1617
						NetCache.NetCache_currentResponse = null; // L: 1618
						class206.NetCache_responseArchiveBuffer = null; // L: 1619
						NetCache.field3207 = 0; // L: 1620

						while (true) {
							NetFileRequest var3 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first(); // L: 1622
							if (var3 == null) { // L: 1623
								while (true) {
									var3 = (NetFileRequest)NetCache.NetCache_pendingResponses.first(); // L: 1629
									if (var3 == null) { // L: 1630
										if (NetCache.field3210 != 0) { // L: 1636
											try {
												Buffer var11 = new Buffer(4); // L: 1638
												var11.writeByte(4); // L: 1639
												var11.writeByte(NetCache.field3210); // L: 1640
												var11.writeShort(0); // L: 1641
												NetCache.NetCache_socket.write(var11.array, 0, 4); // L: 1642
											} catch (IOException var7) {
												try {
													NetCache.NetCache_socket.close(); // L: 1646
												} catch (Exception var6) { // L: 1648
												}

												++NetCache.NetCache_ioExceptions; // L: 1649
												NetCache.NetCache_socket = null; // L: 1650
											}
										}

										NetCache.NetCache_loadTime = 0; // L: 1653
										NetCache.field3195 = class298.currentTimeMillis(); // L: 1654
										WorldMapManager.js5SocketTask = null; // L: 1656
										TaskHandler.js5Socket = null; // L: 1657
										js5ConnectState = 0; // L: 1658
										js5Errors = 0; // L: 1659
										return; // L: 1665
									}

									NetCache.NetCache_pendingWritesQueue.addLast(var3); // L: 1631
									NetCache.NetCache_pendingWrites.put(var3, var3.key); // L: 1632
									++NetCache.NetCache_pendingWritesCount; // L: 1633
									--NetCache.NetCache_pendingResponsesCount; // L: 1634
								}
							}

							NetCache.NetCache_pendingPriorityWrites.put(var3, var3.key); // L: 1624
							++NetCache.NetCache_pendingPriorityWritesCount; // L: 1625
							--NetCache.NetCache_pendingPriorityResponsesCount; // L: 1626
						}
					}
				} catch (IOException var9) { // L: 1662
					this.js5Error(-3); // L: 1663
				}

			}
		}
	} // L: 1548

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1103110959"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		WorldMapManager.js5SocketTask = null; // L: 1668
		TaskHandler.js5Socket = null; // L: 1669
		js5ConnectState = 0; // L: 1670
		if (ArchiveDiskAction.port3 == class278.port1) { // L: 1671
			ArchiveDiskAction.port3 = Players.port2;
		} else {
			ArchiveDiskAction.port3 = class278.port1; // L: 1672
		}

		++js5Errors; // L: 1673
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) { // L: 1674
			if (gameState <= 5) { // L: 1675
				this.error("js5connect_full"); // L: 1676
				gameState = 1000; // L: 1677
			} else {
				field864 = 3000; // L: 1679
			}
		} else if (js5Errors >= 2 && var1 == 6) { // L: 1681
			this.error("js5connect_outofdate"); // L: 1682
			gameState = 1000; // L: 1683
		} else if (js5Errors >= 4) { // L: 1685
			if (gameState <= 5) { // L: 1686
				this.error("js5connect"); // L: 1687
				gameState = 1000; // L: 1688
			} else {
				field864 = 3000; // L: 1690
			}
		}

	} // L: 1692

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-34"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket(); // L: 2201
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 2202

		try {
			if (loginState == 0) { // L: 2204
				if (WorldMapData_0.secureRandom == null && (secureRandomFuture.isDone() || field892 > 250)) { // L: 2205
					WorldMapData_0.secureRandom = secureRandomFuture.get(); // L: 2206
					secureRandomFuture.shutdown(); // L: 2207
					secureRandomFuture = null; // L: 2208
				}

				if (WorldMapData_0.secureRandom != null) { // L: 2210
					if (var1 != null) { // L: 2211
						((AbstractSocket)var1).close(); // L: 2212
						var1 = null; // L: 2213
					}

					WorldMapID.socketTask = null; // L: 2215
					field696 = false; // L: 2216
					field892 = 0; // L: 2217
					loginState = 1; // L: 2218
				}
			}

			if (loginState == 1) { // L: 2221
				if (WorldMapID.socketTask == null) { // L: 2222
					WorldMapID.socketTask = GameShell.taskHandler.newSocketTask(WorldMapSprite.worldHost, ArchiveDiskAction.port3); // L: 2223
				}

				if (WorldMapID.socketTask.status == 2) { // L: 2225
					throw new IOException();
				}

				if (WorldMapID.socketTask.status == 1) { // L: 2226
					if (useBufferedSocket) { // L: 2227
						var1 = class219.method4011((Socket)WorldMapID.socketTask.result, 40000, 5000); // L: 2228
					} else {
						var1 = new NetSocket((Socket)WorldMapID.socketTask.result, GameShell.taskHandler, 5000); // L: 2231
					}

					packetWriter.setSocket((AbstractSocket)var1); // L: 2233
					WorldMapID.socketTask = null; // L: 2234
					loginState = 2; // L: 2235
				}
			}

			PacketBufferNode var3;
			if (loginState == 2) { // L: 2238
				packetWriter.clearBuffer(); // L: 2239
				var3 = class236.method4163(); // L: 2240
				var3.packetBuffer.writeByte(LoginPacket.field2332.id); // L: 2241
				packetWriter.addNode(var3); // L: 2242
				packetWriter.flush(); // L: 2243
				var2.offset = 0; // L: 2244
				loginState = 3; // L: 2245
			}

			int var4;
			boolean var12;
			if (loginState == 3) { // L: 2247
				if (AbstractWorldMapData.pcmPlayer0 != null) { // L: 2248
					AbstractWorldMapData.pcmPlayer0.method2485();
				}

				if (FriendLoginUpdate.pcmPlayer1 != null) { // L: 2249
					FriendLoginUpdate.pcmPlayer1.method2485();
				}

				var12 = true; // L: 2250
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) { // L: 2251 2252
					var12 = false;
				}

				if (var12) { // L: 2254
					var4 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2255
					if (AbstractWorldMapData.pcmPlayer0 != null) { // L: 2256
						AbstractWorldMapData.pcmPlayer0.method2485();
					}

					if (FriendLoginUpdate.pcmPlayer1 != null) { // L: 2257
						FriendLoginUpdate.pcmPlayer1.method2485();
					}

					if (var4 != 0) { // L: 2258
						UserComparator8.getLoginError(var4); // L: 2259
						return; // L: 2260
					}

					var2.offset = 0; // L: 2262
					loginState = 4; // L: 2263
				}
			}

			int var31;
			if (loginState == 4) { // L: 2266
				if (var2.offset < 8) { // L: 2267
					var31 = ((AbstractSocket)var1).available(); // L: 2268
					if (var31 > 8 - var2.offset) { // L: 2269
						var31 = 8 - var2.offset;
					}

					if (var31 > 0) { // L: 2270
						((AbstractSocket)var1).read(var2.array, var2.offset, var31); // L: 2271
						var2.offset += var31; // L: 2272
					}
				}

				if (var2.offset == 8) { // L: 2275
					var2.offset = 0; // L: 2276
					class69.field557 = var2.readLong(); // L: 2277
					loginState = 5; // L: 2278
				}
			}

			int var7;
			int var9;
			int var14;
			if (loginState == 5) { // L: 2281
				packetWriter.packetBuffer.offset = 0; // L: 2282
				packetWriter.clearBuffer(); // L: 2283
				PacketBuffer var22 = new PacketBuffer(500); // L: 2284
				int[] var13 = new int[]{WorldMapData_0.secureRandom.nextInt(), WorldMapData_0.secureRandom.nextInt(), WorldMapData_0.secureRandom.nextInt(), WorldMapData_0.secureRandom.nextInt()}; // L: 2285 2286 2287 2288 2289
				var22.offset = 0; // L: 2290
				var22.writeByte(1); // L: 2291
				var22.writeInt(var13[0]); // L: 2292
				var22.writeInt(var13[1]); // L: 2293
				var22.writeInt(var13[2]); // L: 2294
				var22.writeInt(var13[3]); // L: 2295
				var22.writeLong(class69.field557); // L: 2296
				int var10;
				if (gameState == 40) { // L: 2297
					var22.writeInt(MouseHandler.field487[0]); // L: 2298
					var22.writeInt(MouseHandler.field487[1]); // L: 2299
					var22.writeInt(MouseHandler.field487[2]); // L: 2300
					var22.writeInt(MouseHandler.field487[3]); // L: 2301
				} else {
					var22.writeByte(field872.rsOrdinal()); // L: 2304
					switch(field872.field2022) { // L: 2305
					case 0:
						LinkedHashMap var6 = Timer.clientPreferences.parameters; // L: 2321
						String var8 = Login.Login_username; // L: 2323
						var9 = var8.length(); // L: 2325
						var10 = 0; // L: 2326

						for (int var11 = 0; var11 < var9; ++var11) { // L: 2327
							var10 = (var10 << 5) - var10 + var8.charAt(var11);
						}

						var22.writeInt((Integer)var6.get(var10)); // L: 2330
						break;
					case 1:
						var22.offset += 4; // L: 2315
						break; // L: 2316
					case 2:
					case 3:
						var22.writeMedium(WorldMapSection1.field313); // L: 2309
						++var22.offset; // L: 2310
					}

					var22.writeByte(class323.field3857.rsOrdinal()); // L: 2334
					var22.writeStringCp1252NullTerminated(Login.Login_password); // L: 2335
				}

				var22.encryptRsa(class92.field1170, class92.field1168); // L: 2337
				MouseHandler.field487 = var13; // L: 2338
				PacketBufferNode var5 = class236.method4163(); // L: 2339
				var5.packetBuffer.offset = 0; // L: 2340
				if (gameState == 40) { // L: 2341
					var5.packetBuffer.writeByte(LoginPacket.field2335.id); // L: 2342
				} else {
					var5.packetBuffer.writeByte(LoginPacket.field2334.id); // L: 2345
				}

				var5.packetBuffer.writeShort(0); // L: 2347
				var14 = var5.packetBuffer.offset; // L: 2348
				var5.packetBuffer.writeInt(193); // L: 2349
				var5.packetBuffer.writeInt(1); // L: 2350
				var5.packetBuffer.writeByte(clientType); // L: 2351
				var5.packetBuffer.writeByte(field651); // L: 2352
				var5.packetBuffer.writeBytes(var22.array, 0, var22.offset); // L: 2353
				var7 = var5.packetBuffer.offset; // L: 2354
				var5.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2355
				var5.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2356
				var5.packetBuffer.writeShort(IgnoreList.canvasWidth); // L: 2357
				var5.packetBuffer.writeShort(ModelData0.canvasHeight); // L: 2358
				FileSystem.method3573(var5.packetBuffer); // L: 2359
				var5.packetBuffer.writeStringCp1252NullTerminated(WorldMapSection1.field317); // L: 2360
				var5.packetBuffer.writeInt(MidiPcmStream.field2455); // L: 2361
				Buffer var29 = new Buffer(class58.platformInfo.size()); // L: 2362
				class58.platformInfo.write(var29); // L: 2363
				var5.packetBuffer.writeBytes(var29.array, 0, var29.array.length); // L: 2364
				var5.packetBuffer.writeByte(clientType); // L: 2365
				var5.packetBuffer.writeInt(0); // L: 2366
				var5.packetBuffer.method5718(GameShell.archive5.hash); // L: 2367
				var5.packetBuffer.method5718(GrandExchangeOfferUnitPriceComparator.archive13.hash); // L: 2368
				var5.packetBuffer.method5718(PacketBufferNode.archive12.hash); // L: 2369
				var5.packetBuffer.method5587(ItemContainer.archive11.hash); // L: 2370
				var5.packetBuffer.writeInt(GrandExchangeOfferUnitPriceComparator.archive9.hash); // L: 2371
				var5.packetBuffer.writeInt(NetFileRequest.archive20.hash); // L: 2372
				var5.packetBuffer.method5718(class92.archive10.hash); // L: 2373
				var5.packetBuffer.method5587(class41.archive18.hash); // L: 2374
				var5.packetBuffer.method5588(class169.archive17.hash); // L: 2375
				var5.packetBuffer.method5588(archive15.hash); // L: 2376
				var5.packetBuffer.method5587(WorldMapSprite.archive1.hash); // L: 2377
				var5.packetBuffer.method5718(FontName.archive14.hash); // L: 2378
				var5.packetBuffer.method5587(class195.archive19.hash); // L: 2379
				var5.packetBuffer.method5718(Messages.archive8.hash); // L: 2380
				var5.packetBuffer.method5587(DynamicObject.archive2.hash); // L: 2381
				var5.packetBuffer.method5718(class330.archive3.hash); // L: 2382
				var5.packetBuffer.method5587(SceneTilePaint.archive0.hash); // L: 2383
				var5.packetBuffer.writeInt(class227.archive4.hash); // L: 2384
				var5.packetBuffer.method5587(0); // L: 2385
				var5.packetBuffer.method5588(BuddyRankComparator.archive7.hash); // L: 2386
				var5.packetBuffer.method5718(class217.archive6.hash); // L: 2387
				var5.packetBuffer.xteaEncrypt(var13, var7, var5.packetBuffer.offset); // L: 2388
				var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var14); // L: 2389
				packetWriter.addNode(var5); // L: 2390
				packetWriter.flush(); // L: 2391
				packetWriter.isaacCipher = new IsaacCipher(var13); // L: 2392
				int[] var15 = new int[4]; // L: 2393

				for (var10 = 0; var10 < 4; ++var10) { // L: 2394
					var15[var10] = var13[var10] + 50;
				}

				var2.newIsaacCipher(var15); // L: 2395
				loginState = 6; // L: 2396
			}

			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) { // L: 2398 2399
				var31 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2400
				if (var31 == 21 && gameState == 20) { // L: 2401
					loginState = 12; // L: 2402
				} else if (var31 == 2) { // L: 2404
					loginState = 14; // L: 2405
				} else if (var31 == 15 && gameState == 40) { // L: 2407
					packetWriter.serverPacketLength = -1; // L: 2408
					loginState = 19; // L: 2409
				} else if (var31 == 64) { // L: 2411
					loginState = 10; // L: 2412
				} else if (var31 == 23 && field681 < 1) { // L: 2414
					++field681; // L: 2415
					loginState = 0; // L: 2416
				} else if (var31 == 29) { // L: 2418
					loginState = 17; // L: 2419
				} else {
					if (var31 != 69) { // L: 2421
						UserComparator8.getLoginError(var31); // L: 2425
						return; // L: 2426
					}

					loginState = 7; // L: 2422
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) { // L: 2430 2431
				((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2432
				var2.offset = 0; // L: 2433
				WorldMapLabel.field258 = var2.readUnsignedShort(); // L: 2434
				loginState = 8; // L: 2435
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= WorldMapLabel.field258) { // L: 2438 2439
				var2.offset = 0; // L: 2440
				((AbstractSocket)var1).read(var2.array, var2.offset, WorldMapLabel.field258); // L: 2441
				class7 var23 = BufferedSink.method5889()[var2.readUnsignedByte()]; // L: 2442

				try {
					class12 var32 = ItemContainer.method1250(var23); // L: 2444
					this.field687 = new class9(var2, var32); // L: 2445
					loginState = 9; // L: 2446
				} catch (Exception var20) { // L: 2448
					UserComparator8.getLoginError(22); // L: 2449
					return; // L: 2450
				}
			}

			if (loginState == 9 && this.field687.method112()) { // L: 2454 2455
				this.field686 = this.field687.method98(); // L: 2456
				this.field687.method97(); // L: 2457
				this.field687 = null; // L: 2458
				if (this.field686 == null) { // L: 2459
					UserComparator8.getLoginError(22); // L: 2460
					return; // L: 2461
				}

				packetWriter.clearBuffer(); // L: 2463
				var3 = class236.method4163(); // L: 2464
				var3.packetBuffer.writeByte(LoginPacket.field2336.id); // L: 2465
				var3.packetBuffer.writeShort(this.field686.offset); // L: 2466
				var3.packetBuffer.method5536(this.field686); // L: 2467
				packetWriter.addNode(var3); // L: 2468
				packetWriter.flush(); // L: 2469
				this.field686 = null; // L: 2470
				loginState = 6; // L: 2471
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) { // L: 2474 2475
				class58.field433 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2476
				loginState = 11; // L: 2477
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= class58.field433) { // L: 2480 2481
				((AbstractSocket)var1).read(var2.array, 0, class58.field433); // L: 2482
				var2.offset = 0; // L: 2483
				loginState = 6; // L: 2484
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) { // L: 2487 2488
				field682 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60; // L: 2489
				loginState = 13; // L: 2490
			}

			if (loginState == 13) { // L: 2493
				field892 = 0; // L: 2494
				GameShell.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field682 / 60 + " seconds."); // L: 2495
				if (--field682 <= 0) { // L: 2496
					loginState = 0;
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) { // L: 2499 2500
					UrlRequester.field1963 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2501
					loginState = 15; // L: 2502
				}

				if (loginState == 15 && ((AbstractSocket)var1).available() >= UrlRequester.field1963) { // L: 2505 2506
					var12 = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2507
					((AbstractSocket)var1).read(var2.array, 0, 4); // L: 2508
					var2.offset = 0; // L: 2509
					boolean var24 = false; // L: 2510
					if (var12) { // L: 2511
						var4 = var2.readByteIsaac() << 24; // L: 2512
						var4 |= var2.readByteIsaac() << 16; // L: 2513
						var4 |= var2.readByteIsaac() << 8; // L: 2514
						var4 |= var2.readByteIsaac(); // L: 2515
						String var28 = Login.Login_username; // L: 2517
						var7 = var28.length(); // L: 2519
						int var16 = 0; // L: 2520
						var9 = 0; // L: 2521

						while (true) {
							if (var9 >= var7) {
								if (Timer.clientPreferences.parameters.size() >= 10 && !Timer.clientPreferences.parameters.containsKey(var16)) { // L: 2525 2526
									Iterator var30 = Timer.clientPreferences.parameters.entrySet().iterator(); // L: 2527
									var30.next(); // L: 2528
									var30.remove(); // L: 2529
								}

								Timer.clientPreferences.parameters.put(var16, var4); // L: 2532
								break;
							}

							var16 = (var16 << 5) - var16 + var28.charAt(var9);
							++var9;
						}
					}

					if (Login_isUsernameRemembered) { // L: 2534
						Timer.clientPreferences.rememberedUsername = Login.Login_username; // L: 2535
					} else {
						Timer.clientPreferences.rememberedUsername = null; // L: 2538
					}

					GrandExchangeOffer.savePreferences(); // L: 2540
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte(); // L: 2541
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2542
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte(); // L: 2543
					localPlayerIndex <<= 8; // L: 2544
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte(); // L: 2545
					field766 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2546
					((AbstractSocket)var1).read(var2.array, 0, 1); // L: 2547
					var2.offset = 0; // L: 2548
					ServerPacket[] var26 = Tiles.ServerPacket_values(); // L: 2549
					var14 = var2.readSmartByteShortIsaac(); // L: 2550
					if (var14 < 0 || var14 >= var26.length) { // L: 2551
						throw new IOException(var14 + " " + var2.offset);
					}

					packetWriter.serverPacket = var26[var14]; // L: 2552
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2553
					((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2554
					var2.offset = 0; // L: 2555
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2556

					try {
						class56.method901(WorldMapIcon_0.client, "zap"); // L: 2558
					} catch (Throwable var19) { // L: 2560
					}

					loginState = 16; // L: 2561
				}

				if (loginState == 16) { // L: 2564
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2565
						var2.offset = 0; // L: 2566
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2567
						timer.method5013(); // L: 2568
						Players.method2208(); // L: 2569
						class307.updatePlayer(var2); // L: 2570
						class182.field2112 = -1; // L: 2571
						ItemContainer.loadRegions(false, var2); // L: 2572
						packetWriter.serverPacket = null; // L: 2573
					}

				} else {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) { // L: 2577 2578
						var2.offset = 0; // L: 2579
						((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2580
						var2.offset = 0; // L: 2581
						MusicPatch.field2497 = var2.readUnsignedShort(); // L: 2582
						loginState = 18; // L: 2583
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= MusicPatch.field2497) { // L: 2586 2587
						var2.offset = 0; // L: 2588
						((AbstractSocket)var1).read(var2.array, 0, MusicPatch.field2497); // L: 2589
						var2.offset = 0; // L: 2590
						String var25 = var2.readStringCp1252NullTerminated(); // L: 2591
						String var33 = var2.readStringCp1252NullTerminated(); // L: 2592
						String var27 = var2.readStringCp1252NullTerminated(); // L: 2593
						GameShell.setLoginResponseString(var25, var33, var27); // L: 2594
						WorldMapCacheName.updateGameState(10); // L: 2595
					}

					if (loginState == 19) { // L: 2598
						if (packetWriter.serverPacketLength == -1) { // L: 2599
							if (((AbstractSocket)var1).available() < 2) { // L: 2600
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2601
							var2.offset = 0; // L: 2602
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2603
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2605
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2606
							var2.offset = 0; // L: 2607
							var31 = packetWriter.serverPacketLength; // L: 2608
							timer.method5015(); // L: 2609
							DefaultsGroup.method5939(); // L: 2610
							class307.updatePlayer(var2); // L: 2611
							if (var31 != var2.offset) { // L: 2612
								throw new RuntimeException(); // L: 2613
							}
						}
					} else {
						++field892; // L: 2617
						if (field892 > 2000) { // L: 2618
							if (field681 < 1) { // L: 2619
								if (class278.port1 == ArchiveDiskAction.port3) { // L: 2620
									ArchiveDiskAction.port3 = Players.port2;
								} else {
									ArchiveDiskAction.port3 = class278.port1; // L: 2621
								}

								++field681; // L: 2622
								loginState = 0; // L: 2623
							} else {
								UserComparator8.getLoginError(-3); // L: 2626
							}
						}
					}
				}
			}
		} catch (IOException var21) { // L: 2630
			if (field681 < 1) { // L: 2631
				if (class278.port1 == ArchiveDiskAction.port3) { // L: 2632
					ArchiveDiskAction.port3 = Players.port2;
				} else {
					ArchiveDiskAction.port3 = class278.port1; // L: 2633
				}

				++field681; // L: 2634
				loginState = 0; // L: 2635
			} else {
				UserComparator8.getLoginError(-2); // L: 2638
			}
		}
	} // L: 2497 2575 2615 2624 2627 2636 2639 2641

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-105"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 2988
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 2989
			--logoutTimer;
		}

		if (field696) { // L: 2990
			field696 = false; // L: 2991
			LoginScreenAnimation.method1903(); // L: 2992
		} else {
			if (!isMenuOpen) { // L: 2995
				ApproximateRouteStrategy.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1687(packetWriter); ++var1) { // L: 2996 2997
			}

			if (gameState == 30) { // L: 2999
				int var2;
				PacketBufferNode var15;
				while (class23.method225()) { // L: 3000
					var15 = ItemContainer.getPacketBufferNode(ClientPacket.field2280, packetWriter.isaacCipher); // L: 3001
					var15.packetBuffer.writeByte(0); // L: 3002
					var2 = var15.packetBuffer.offset; // L: 3003
					WorldMapData_0.performReflectionCheck(var15.packetBuffer); // L: 3004
					var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset - var2); // L: 3005
					packetWriter.addNode(var15); // L: 3006
				}

				if (timer.field3614) { // L: 3008
					var15 = ItemContainer.getPacketBufferNode(ClientPacket.field2251, packetWriter.isaacCipher); // L: 3010
					var15.packetBuffer.writeByte(0); // L: 3011
					var2 = var15.packetBuffer.offset; // L: 3012
					timer.write(var15.packetBuffer); // L: 3013
					var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset - var2); // L: 3014
					packetWriter.addNode(var15); // L: 3015
					timer.method5014(); // L: 3016
				}

				int var3;
				int var4;
				int var5;
				int var6;
				int var7;
				int var8;
				int var9;
				int var10;
				int var11;
				int var12;
				synchronized(SoundCache.mouseRecorder.lock) { // L: 3019
					if (!field907) { // L: 3020
						SoundCache.mouseRecorder.index = 0; // L: 3106
					} else if (MouseHandler.MouseHandler_lastButton != 0 || SoundCache.mouseRecorder.index >= 40) { // L: 3021
						PacketBufferNode var16 = null; // L: 3023
						var3 = 0; // L: 3024
						var4 = 0; // L: 3025
						var5 = 0; // L: 3026
						var6 = 0; // L: 3027

						for (var7 = 0; var7 < SoundCache.mouseRecorder.index && (var16 == null || var16.packetBuffer.offset - var3 < 246); ++var7) { // L: 3028 3029
							var4 = var7; // L: 3030
							var8 = SoundCache.mouseRecorder.ys[var7]; // L: 3031
							if (var8 < -1) { // L: 3032
								var8 = -1;
							} else if (var8 > 65534) { // L: 3033
								var8 = 65534;
							}

							var9 = SoundCache.mouseRecorder.xs[var7]; // L: 3034
							if (var9 < -1) { // L: 3035
								var9 = -1;
							} else if (var9 > 65534) { // L: 3036
								var9 = 65534;
							}

							if (var9 != field657 || var8 != field658) { // L: 3037
								if (var16 == null) { // L: 3040
									var16 = ItemContainer.getPacketBufferNode(ClientPacket.field2326, packetWriter.isaacCipher); // L: 3041
									var16.packetBuffer.writeByte(0); // L: 3042
									var3 = var16.packetBuffer.offset; // L: 3043
									PacketBuffer var10000 = var16.packetBuffer; // L: 3044
									var10000.offset += 2;
									var5 = 0; // L: 3045
									var6 = 0; // L: 3046
								}

								if (-1L != field794) { // L: 3051
									var10 = var9 - field657; // L: 3052
									var11 = var8 - field658; // L: 3053
									var12 = (int)((SoundCache.mouseRecorder.millis[var7] - field794) / 20L); // L: 3054
									var5 = (int)((long)var5 + (SoundCache.mouseRecorder.millis[var7] - field794) % 20L); // L: 3055
								} else {
									var10 = var9; // L: 3058
									var11 = var8; // L: 3059
									var12 = Integer.MAX_VALUE; // L: 3060
								}

								field657 = var9; // L: 3062
								field658 = var8; // L: 3063
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 3064
									var10 += 32; // L: 3065
									var11 += 32; // L: 3066
									var16.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 3067
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 3069
									var10 += 128; // L: 3070
									var11 += 128; // L: 3071
									var16.packetBuffer.writeByte(var12 + 128); // L: 3072
									var16.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 3073
								} else if (var12 < 32) { // L: 3075
									var16.packetBuffer.writeByte(var12 + 192); // L: 3076
									if (var9 != -1 && var8 != -1) { // L: 3077
										var16.packetBuffer.writeInt(var9 | var8 << 16); // L: 3078
									} else {
										var16.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var16.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 3081
									if (var9 != -1 && var8 != -1) { // L: 3082
										var16.packetBuffer.writeInt(var9 | var8 << 16); // L: 3083
									} else {
										var16.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6; // L: 3085
								field794 = SoundCache.mouseRecorder.millis[var7]; // L: 3086
							}
						}

						if (var16 != null) { // L: 3088
							var16.packetBuffer.writeLengthByte(var16.packetBuffer.offset - var3); // L: 3089
							var7 = var16.packetBuffer.offset; // L: 3090
							var16.packetBuffer.offset = var3; // L: 3091
							var16.packetBuffer.writeByte(var5 / var6); // L: 3092
							var16.packetBuffer.writeByte(var5 % var6); // L: 3093
							var16.packetBuffer.offset = var7; // L: 3094
							packetWriter.addNode(var16); // L: 3095
						}

						if (var4 >= SoundCache.mouseRecorder.index) { // L: 3097
							SoundCache.mouseRecorder.index = 0;
						} else {
							MouseRecorder var44 = SoundCache.mouseRecorder; // L: 3099
							var44.index -= var4;
							System.arraycopy(SoundCache.mouseRecorder.xs, var4, SoundCache.mouseRecorder.xs, 0, SoundCache.mouseRecorder.index); // L: 3100
							System.arraycopy(SoundCache.mouseRecorder.ys, var4, SoundCache.mouseRecorder.ys, 0, SoundCache.mouseRecorder.index); // L: 3101
							System.arraycopy(SoundCache.mouseRecorder.millis, var4, SoundCache.mouseRecorder.millis, 0, SoundCache.mouseRecorder.index); // L: 3102
						}
					}
				}

				PacketBufferNode var19;
				if (MouseHandler.MouseHandler_lastButton == 1 || !UserComparator9.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 3108
					long var17 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis; // L: 3109
					if (var17 > 32767L) { // L: 3110
						var17 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis; // L: 3111
					var3 = MouseHandler.MouseHandler_lastPressedY; // L: 3112
					if (var3 < 0) { // L: 3113
						var3 = 0;
					} else if (var3 > ModelData0.canvasHeight) { // L: 3114
						var3 = ModelData0.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX; // L: 3115
					if (var4 < 0) { // L: 3116
						var4 = 0;
					} else if (var4 > IgnoreList.canvasWidth) { // L: 3117
						var4 = IgnoreList.canvasWidth;
					}

					var5 = (int)var17; // L: 3118
					var19 = ItemContainer.getPacketBufferNode(ClientPacket.field2329, packetWriter.isaacCipher); // L: 3119
					var19.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1)); // L: 3120
					var19.packetBuffer.writeShort(var4); // L: 3121
					var19.packetBuffer.writeShort(var3); // L: 3122
					packetWriter.addNode(var19); // L: 3123
				}

				if (KeyHandler.field414 > 0) { // L: 3125
					var15 = ItemContainer.getPacketBufferNode(ClientPacket.field2234, packetWriter.isaacCipher); // L: 3126
					var15.packetBuffer.writeShort(0); // L: 3127
					var2 = var15.packetBuffer.offset; // L: 3128
					long var20 = class298.currentTimeMillis(); // L: 3129

					for (var5 = 0; var5 < KeyHandler.field414; ++var5) { // L: 3130
						long var22 = var20 - field817; // L: 3131
						if (var22 > 16777215L) { // L: 3132
							var22 = 16777215L;
						}

						field817 = var20; // L: 3133
						var15.packetBuffer.method5585((int)var22); // L: 3134
						var15.packetBuffer.writeIntME(KeyHandler.field413[var5]); // L: 3135
					}

					var15.packetBuffer.writeLengthShort(var15.packetBuffer.offset - var2); // L: 3137
					packetWriter.addNode(var15); // L: 3138
				}

				if (field732 > 0) { // L: 3140
					--field732;
				}

				if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) { // L: 3141
					field843 = true;
				}

				if (field843 && field732 <= 0) { // L: 3142
					field732 = 20; // L: 3143
					field843 = false; // L: 3144
					var15 = ItemContainer.getPacketBufferNode(ClientPacket.field2275, packetWriter.isaacCipher); // L: 3146
					var15.packetBuffer.method5739(camAngleX); // L: 3147
					var15.packetBuffer.method5739(camAngleY); // L: 3148
					packetWriter.addNode(var15); // L: 3149
				}

				if (ScriptEvent.hasFocus && !hadFocus) { // L: 3151
					hadFocus = true; // L: 3152
					var15 = ItemContainer.getPacketBufferNode(ClientPacket.field2277, packetWriter.isaacCipher); // L: 3154
					var15.packetBuffer.writeByte(1); // L: 3155
					packetWriter.addNode(var15); // L: 3156
				}

				if (!ScriptEvent.hasFocus && hadFocus) { // L: 3158
					hadFocus = false; // L: 3159
					var15 = ItemContainer.getPacketBufferNode(ClientPacket.field2277, packetWriter.isaacCipher); // L: 3161
					var15.packetBuffer.writeByte(0); // L: 3162
					packetWriter.addNode(var15); // L: 3163
				}

				if (WorldMapRectangle.worldMap != null) { // L: 3166
					WorldMapRectangle.worldMap.method6363();
				}

				GrandExchangeOfferNameComparator.method209(); // L: 3167
				NetSocket.method3608(); // L: 3168
				if (gameState == 30) { // L: 3169
					WorldMapDecoration.method382(); // L: 3170
					WorldMapManager.method679(); // L: 3171
					++packetWriter.field1333; // L: 3172
					if (packetWriter.field1333 > 750) { // L: 3173
						LoginScreenAnimation.method1903(); // L: 3174
					} else {
						var1 = Players.Players_count; // L: 3178
						int[] var36 = Players.Players_indices; // L: 3179

						for (var3 = 0; var3 < var1; ++var3) { // L: 3180
							Player var24 = players[var36[var3]]; // L: 3181
							if (var24 != null) { // L: 3182
								WorldMapID.updateActorSequence(var24, 1); // L: 3183
							}
						}

						UserComparator9.method3477(); // L: 3187
						WorldMapManager.method703(); // L: 3188
						++field850; // L: 3189
						if (mouseCrossColor != 0) { // L: 3190
							mouseCrossState += 20; // L: 3191
							if (mouseCrossState >= 400) { // L: 3192
								mouseCrossColor = 0;
							}
						}

						if (NPC.field1131 != null) { // L: 3194
							++field754; // L: 3195
							if (field754 >= 15) { // L: 3196
								CollisionMap.invalidateWidget(NPC.field1131); // L: 3197
								NPC.field1131 = null; // L: 3198
							}
						}

						Widget var35 = EnumComposition.mousedOverWidgetIf1; // L: 3201
						Widget var37 = CollisionMap.field2092; // L: 3202
						EnumComposition.mousedOverWidgetIf1 = null; // L: 3203
						CollisionMap.field2092 = null; // L: 3204
						draggedOnWidget = null; // L: 3205
						field829 = false; // L: 3206
						field859 = false; // L: 3207
						field870 = 0; // L: 3208

						while (GrandExchangeOfferNameComparator.isKeyDown() && field870 < 128) { // L: 3209
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && StudioGame.field3135 == 66) { // L: 3210
								String var40 = ""; // L: 3213

								Message var38;
								for (Iterator var25 = Messages.Messages_hashTable.iterator(); var25.hasNext(); var40 = var40 + var38.sender + ':' + var38.text + '\n') { // L: 3214 3217
									var38 = (Message)var25.next(); // L: 3215
								}

								WorldMapIcon_0.client.clipboardSetString(var40); // L: 3223
							} else if (oculusOrbState != 1 || WorldMapIcon_1.field200 <= 0) { // L: 3226
								field693[field870] = StudioGame.field3135; // L: 3229
								field661[field870] = WorldMapIcon_1.field200; // L: 3230
								++field870; // L: 3231
							}
						}

						boolean var31 = staffModLevel >= 2; // L: 3235
						if (var31 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) { // L: 3237
							var4 = PlayerComposition.localPlayer.plane - mouseWheelRotation; // L: 3238
							if (var4 < 0) { // L: 3239
								var4 = 0;
							} else if (var4 > 3) { // L: 3240
								var4 = 3;
							}

							if (var4 != PlayerComposition.localPlayer.plane) { // L: 3241
								var5 = PlayerComposition.localPlayer.pathX[0] + NetFileRequest.baseX; // L: 3242
								var6 = PlayerComposition.localPlayer.pathY[0] + class41.baseY; // L: 3243
								PacketBufferNode var27 = ItemContainer.getPacketBufferNode(ClientPacket.field2269, packetWriter.isaacCipher); // L: 3246
								var27.packetBuffer.method5578(var5); // L: 3247
								var27.packetBuffer.method5587(0); // L: 3248
								var27.packetBuffer.method5739(var6); // L: 3249
								var27.packetBuffer.writeByte(var4); // L: 3250
								packetWriter.addNode(var27); // L: 3251
							}

							mouseWheelRotation = 0; // L: 3254
						}

						if (rootInterface != -1) { // L: 3256
							class51.updateRootInterface(rootInterface, 0, 0, IgnoreList.canvasWidth, ModelData0.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3257

						while (true) {
							Widget var39;
							ScriptEvent var41;
							Widget var42;
							do {
								var41 = (ScriptEvent)field715.removeLast(); // L: 3259
								if (var41 == null) { // L: 3260
									while (true) {
										do {
											var41 = (ScriptEvent)field849.removeLast(); // L: 3271
											if (var41 == null) { // L: 3272
												while (true) {
													do {
														var41 = (ScriptEvent)scriptEvents.removeLast(); // L: 3283
														if (var41 == null) { // L: 3284
															this.menu(); // L: 3294
															if (WorldMapRectangle.worldMap != null) { // L: 3296
																WorldMapRectangle.worldMap.method6370(GameObject.Client_plane, (PlayerComposition.localPlayer.x >> 7) + NetFileRequest.baseX, (PlayerComposition.localPlayer.y >> 7) + class41.baseY, false); // L: 3297
																WorldMapRectangle.worldMap.loadCache(); // L: 3298
															}

															if (clickedWidget != null) { // L: 3301
																this.method1381();
															}

															if (class171.dragInventoryWidget != null) { // L: 3302
																CollisionMap.invalidateWidget(class171.dragInventoryWidget); // L: 3303
																++itemDragDuration; // L: 3304
																if (MouseHandler.MouseHandler_currentButton == 0) { // L: 3305
																	if (field848) { // L: 3306
																		if (Occluder.hoveredItemContainer == class171.dragInventoryWidget && dragItemSlotSource != dragItemSlotDestination) { // L: 3307
																			Widget var43 = class171.dragInventoryWidget; // L: 3308
																			byte var32 = 0; // L: 3309
																			if (field865 == 1 && var43.contentType == 206) { // L: 3310
																				var32 = 1;
																			}

																			if (var43.itemIds[dragItemSlotDestination] <= 0) { // L: 3311
																				var32 = 0;
																			}

																			if (BoundaryObject.method3341(FaceNormal.getWidgetFlags(var43))) { // L: 3312
																				var6 = dragItemSlotSource; // L: 3313
																				var7 = dragItemSlotDestination; // L: 3314
																				var43.itemIds[var7] = var43.itemIds[var6]; // L: 3315
																				var43.itemQuantities[var7] = var43.itemQuantities[var6]; // L: 3316
																				var43.itemIds[var6] = -1; // L: 3317
																				var43.itemQuantities[var6] = 0; // L: 3318
																			} else if (var32 == 1) { // L: 3320
																				var6 = dragItemSlotSource; // L: 3321
																				var7 = dragItemSlotDestination; // L: 3322

																				while (var6 != var7) { // L: 3323
																					if (var6 > var7) { // L: 3324
																						var43.swapItems(var6 - 1, var6); // L: 3325
																						--var6; // L: 3326
																					} else if (var6 < var7) { // L: 3328
																						var43.swapItems(var6 + 1, var6); // L: 3329
																						++var6; // L: 3330
																					}
																				}
																			} else {
																				var43.swapItems(dragItemSlotDestination, dragItemSlotSource); // L: 3335
																			}

																			var19 = ItemContainer.getPacketBufferNode(ClientPacket.field2302, packetWriter.isaacCipher); // L: 3338
																			var19.packetBuffer.writeInt(class171.dragInventoryWidget.id); // L: 3339
																			var19.packetBuffer.method5739(dragItemSlotSource); // L: 3340
																			var19.packetBuffer.writeShort(dragItemSlotDestination); // L: 3341
																			var19.packetBuffer.writeByte(var32); // L: 3342
																			packetWriter.addNode(var19); // L: 3343
																		}
																	} else if (this.shouldLeftClickOpenMenu()) { // L: 3347
																		this.openMenu(draggedWidgetX, draggedWidgetY); // L: 3348
																	} else if (menuOptionsCount > 0) { // L: 3350
																		var4 = draggedWidgetX; // L: 3351
																		var5 = draggedWidgetY; // L: 3352
																		WorldMapDecoration.method379(WorldMapSection1.tempMenuAction, var4, var5); // L: 3354
																		WorldMapSection1.tempMenuAction = null; // L: 3355
																	}

																	field754 = 10; // L: 3359
																	MouseHandler.MouseHandler_lastButton = 0; // L: 3360
																	class171.dragInventoryWidget = null; // L: 3361
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) { // L: 3364 3365
																	field848 = true; // L: 3366
																}
															}

															if (Scene.shouldSendWalk()) { // L: 3371
																var4 = Scene.Scene_selectedX; // L: 3372
																var5 = Scene.Scene_selectedY; // L: 3373
																var19 = ItemContainer.getPacketBufferNode(ClientPacket.field2232, packetWriter.isaacCipher); // L: 3375
																var19.packetBuffer.writeByte(5); // L: 3376
																var19.packetBuffer.method5739(var4 + NetFileRequest.baseX); // L: 3377
																var19.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3378
																var19.packetBuffer.writeShortLE(var5 + class41.baseY); // L: 3379
																packetWriter.addNode(var19); // L: 3380
																Scene.method3199(); // L: 3381
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3382
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3383
																mouseCrossColor = 1; // L: 3384
																mouseCrossState = 0; // L: 3385
																destinationX = var4; // L: 3386
																destinationY = var5; // L: 3387
															}

															if (var35 != EnumComposition.mousedOverWidgetIf1) { // L: 3389
																if (var35 != null) { // L: 3390
																	CollisionMap.invalidateWidget(var35);
																}

																if (EnumComposition.mousedOverWidgetIf1 != null) { // L: 3391
																	CollisionMap.invalidateWidget(EnumComposition.mousedOverWidgetIf1);
																}
															}

															if (var37 != CollisionMap.field2092 && field751 == field799) { // L: 3393
																if (var37 != null) { // L: 3394
																	CollisionMap.invalidateWidget(var37);
																}

																if (CollisionMap.field2092 != null) { // L: 3395
																	CollisionMap.invalidateWidget(CollisionMap.field2092);
																}
															}

															if (CollisionMap.field2092 != null) { // L: 3397
																if (field799 < field751) { // L: 3398
																	++field799; // L: 3399
																	if (field751 == field799) { // L: 3400
																		CollisionMap.invalidateWidget(CollisionMap.field2092);
																	}
																}
															} else if (field799 > 0) { // L: 3403
																--field799;
															}

															int var28;
															if (oculusOrbState == 0) { // L: 3405
																var4 = PlayerComposition.localPlayer.x; // L: 3406
																var5 = PlayerComposition.localPlayer.y; // L: 3407
																if (SecureRandomFuture.oculusOrbFocalPointX - var4 < -500 || SecureRandomFuture.oculusOrbFocalPointX - var4 > 500 || Decimator.oculusOrbFocalPointY - var5 < -500 || Decimator.oculusOrbFocalPointY - var5 > 500) { // L: 3408
																	SecureRandomFuture.oculusOrbFocalPointX = var4; // L: 3409
																	Decimator.oculusOrbFocalPointY = var5; // L: 3410
																}

																if (var4 != SecureRandomFuture.oculusOrbFocalPointX) { // L: 3412
																	SecureRandomFuture.oculusOrbFocalPointX += (var4 - SecureRandomFuture.oculusOrbFocalPointX) / 16;
																}

																if (var5 != Decimator.oculusOrbFocalPointY) { // L: 3413
																	Decimator.oculusOrbFocalPointY += (var5 - Decimator.oculusOrbFocalPointY) / 16;
																}

																var6 = SecureRandomFuture.oculusOrbFocalPointX >> 7; // L: 3414
																var7 = Decimator.oculusOrbFocalPointY >> 7; // L: 3415
																var8 = SecureRandomFuture.getTileHeight(SecureRandomFuture.oculusOrbFocalPointX, Decimator.oculusOrbFocalPointY, GameObject.Client_plane); // L: 3416
																var9 = 0; // L: 3417
																if (var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) { // L: 3418
																	for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) { // L: 3419
																		for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) { // L: 3420
																			var12 = GameObject.Client_plane; // L: 3421
																			if (var12 < 3 && (Tiles.Tiles_renderFlags[1][var10][var11] & 2) == 2) { // L: 3422
																				++var12;
																			}

																			var28 = var8 - Tiles.Tiles_heights[var12][var10][var11]; // L: 3423
																			if (var28 > var9) { // L: 3424
																				var9 = var28;
																			}
																		}
																	}
																}

																var10 = var9 * 192; // L: 3428
																if (var10 > 98048) { // L: 3429
																	var10 = 98048;
																}

																if (var10 < 32768) { // L: 3430
																	var10 = 32768;
																}

																if (var10 > field918) { // L: 3431
																	field918 += (var10 - field918) / 24;
																} else if (var10 < field918) {
																	field918 += (var10 - field918) / 80; // L: 3432
																}

																PacketWriter.field1341 = SecureRandomFuture.getTileHeight(PlayerComposition.localPlayer.x, PlayerComposition.localPlayer.y, GameObject.Client_plane) - camFollowHeight; // L: 3433
															} else if (oculusOrbState == 1) { // L: 3435
																if (field649 && PlayerComposition.localPlayer != null) { // L: 3437
																	var4 = PlayerComposition.localPlayer.pathX[0]; // L: 3438
																	var5 = PlayerComposition.localPlayer.pathY[0]; // L: 3439
																	if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 3440
																		SecureRandomFuture.oculusOrbFocalPointX = PlayerComposition.localPlayer.x; // L: 3441
																		var6 = SecureRandomFuture.getTileHeight(PlayerComposition.localPlayer.x, PlayerComposition.localPlayer.y, GameObject.Client_plane) - camFollowHeight; // L: 3442
																		if (var6 < PacketWriter.field1341) { // L: 3443
																			PacketWriter.field1341 = var6;
																		}

																		Decimator.oculusOrbFocalPointY = PlayerComposition.localPlayer.y; // L: 3444
																		field649 = false; // L: 3445
																	}
																}

																short var33 = -1; // L: 3448
																if (KeyHandler.KeyHandler_pressedKeys[33]) { // L: 3449
																	var33 = 0;
																} else if (KeyHandler.KeyHandler_pressedKeys[49]) { // L: 3450
																	var33 = 1024;
																}

																if (KeyHandler.KeyHandler_pressedKeys[48]) { // L: 3451
																	if (var33 == 0) { // L: 3452
																		var33 = 1792;
																	} else if (var33 == 1024) { // L: 3453
																		var33 = 1280;
																	} else {
																		var33 = 1536; // L: 3454
																	}
																} else if (KeyHandler.KeyHandler_pressedKeys[50]) { // L: 3456
																	if (var33 == 0) { // L: 3457
																		var33 = 256;
																	} else if (var33 == 1024) { // L: 3458
																		var33 = 768;
																	} else {
																		var33 = 512; // L: 3459
																	}
																}

																byte var34 = 0; // L: 3461
																if (KeyHandler.KeyHandler_pressedKeys[35]) { // L: 3462
																	var34 = -1;
																} else if (KeyHandler.KeyHandler_pressedKeys[51]) { // L: 3463
																	var34 = 1;
																}

																var6 = 0; // L: 3464
																if (var33 >= 0 || var34 != 0) { // L: 3465
																	var6 = KeyHandler.KeyHandler_pressedKeys[81] ? oculusOrbSlowedSpeed * 762441025 * -239492415 : oculusOrbNormalSpeed * -525067469 * 1697208315; // L: 3466
																	var6 *= 16; // L: 3467
																	field761 = var33; // L: 3468
																	field788 = var34; // L: 3469
																}

																if (field755 < var6) { // L: 3471
																	field755 += var6 / 8; // L: 3472
																	if (field755 > var6) { // L: 3473
																		field755 = var6;
																	}
																} else if (field755 > var6) { // L: 3475
																	field755 = field755 * 9 / 10;
																}

																if (field755 > 0) { // L: 3476
																	var7 = field755 / 16; // L: 3477
																	if (field761 >= 0) { // L: 3478
																		var4 = field761 - AbstractArchive.cameraYaw & 2047; // L: 3479
																		var8 = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 3480
																		var9 = Rasterizer3D.Rasterizer3D_cosine[var4]; // L: 3481
																		SecureRandomFuture.oculusOrbFocalPointX += var7 * var8 / 65536; // L: 3482
																		Decimator.oculusOrbFocalPointY += var9 * var7 / 65536; // L: 3483
																	}

																	if (field788 != 0) { // L: 3485
																		PacketWriter.field1341 += var7 * field788; // L: 3486
																		if (PacketWriter.field1341 > 0) { // L: 3487
																			PacketWriter.field1341 = 0;
																		}
																	}
																} else {
																	field761 = -1; // L: 3491
																	field788 = -1; // L: 3492
																}

																if (KeyHandler.KeyHandler_pressedKeys[13]) { // L: 3494
																	packetWriter.addNode(ItemContainer.getPacketBufferNode(ClientPacket.field2244, packetWriter.isaacCipher)); // L: 3496
																	oculusOrbState = 0; // L: 3497
																}
															}

															if (MouseHandler.MouseHandler_currentButton == 4 && UserComparator9.mouseCam) { // L: 3501
																var4 = MouseHandler.MouseHandler_y - mouseCamClickedY; // L: 3502
																camAngleDX = var4 * 2; // L: 3503
																mouseCamClickedY = var4 != -1 && var4 != 1 ? (MouseHandler.MouseHandler_y + mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y * -1308781931 * -1946834755; // L: 3504
																var5 = mouseCamClickedX - MouseHandler.MouseHandler_x; // L: 3505
																camAngleDY = var5 * 2; // L: 3506
																mouseCamClickedX = var5 != -1 && var5 != 1 ? (mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x * -1140294545 * -765435249; // L: 3507
															} else {
																if (KeyHandler.KeyHandler_pressedKeys[96]) { // L: 3510
																	camAngleDY += (-24 - camAngleDY) / 2;
																} else if (KeyHandler.KeyHandler_pressedKeys[97]) { // L: 3511
																	camAngleDY += (24 - camAngleDY) / 2;
																} else {
																	camAngleDY /= 2; // L: 3512
																}

																if (KeyHandler.KeyHandler_pressedKeys[98]) { // L: 3513
																	camAngleDX += (12 - camAngleDX) / 2;
																} else if (KeyHandler.KeyHandler_pressedKeys[99]) { // L: 3514
																	camAngleDX += (-12 - camAngleDX) / 2;
																} else {
																	camAngleDX /= 2; // L: 3515
																}

																mouseCamClickedY = MouseHandler.MouseHandler_y; // L: 3516
																mouseCamClickedX = MouseHandler.MouseHandler_x; // L: 3517
															}

															camAngleY = camAngleDY / 2 + camAngleY & 2047; // L: 3519
															camAngleX += camAngleDX / 2; // L: 3520
															if (camAngleX < 128) { // L: 3521
																camAngleX = 128;
															}

															if (camAngleX > 383) { // L: 3522
																camAngleX = 383;
															}

															if (isCameraLocked) { // L: 3524
																var4 = RouteStrategy.field2124 * 128 + 64; // L: 3525
																var5 = class89.field1140 * 128 + 64; // L: 3526
																var6 = SecureRandomFuture.getTileHeight(var4, var5, GameObject.Client_plane) - class41.field302; // L: 3527
																if (Player.cameraX < var4) { // L: 3528
																	Player.cameraX = (var4 - Player.cameraX) * WorldMapRegion.field271 / 1000 + Player.cameraX + DynamicObject.field1316; // L: 3529
																	if (Player.cameraX > var4) { // L: 3530
																		Player.cameraX = var4;
																	}
																}

																if (Player.cameraX > var4) { // L: 3532
																	Player.cameraX -= WorldMapRegion.field271 * (Player.cameraX - var4) / 1000 + DynamicObject.field1316; // L: 3533
																	if (Player.cameraX < var4) { // L: 3534
																		Player.cameraX = var4;
																	}
																}

																if (KeyHandler.cameraY < var6) { // L: 3536
																	KeyHandler.cameraY = (var6 - KeyHandler.cameraY) * WorldMapRegion.field271 / 1000 + KeyHandler.cameraY + DynamicObject.field1316; // L: 3537
																	if (KeyHandler.cameraY > var6) { // L: 3538
																		KeyHandler.cameraY = var6;
																	}
																}

																if (KeyHandler.cameraY > var6) { // L: 3540
																	KeyHandler.cameraY -= WorldMapRegion.field271 * (KeyHandler.cameraY - var6) / 1000 + DynamicObject.field1316; // L: 3541
																	if (KeyHandler.cameraY < var6) { // L: 3542
																		KeyHandler.cameraY = var6;
																	}
																}

																if (class69.cameraZ < var5) { // L: 3544
																	class69.cameraZ = (var5 - class69.cameraZ) * WorldMapRegion.field271 / 1000 + class69.cameraZ + DynamicObject.field1316; // L: 3545
																	if (class69.cameraZ > var5) { // L: 3546
																		class69.cameraZ = var5;
																	}
																}

																if (class69.cameraZ > var5) { // L: 3548
																	class69.cameraZ -= WorldMapRegion.field271 * (class69.cameraZ - var5) / 1000 + DynamicObject.field1316; // L: 3549
																	if (class69.cameraZ < var5) { // L: 3550
																		class69.cameraZ = var5;
																	}
																}

																var4 = WorldMapData_0.field112 * 128 + 64; // L: 3552
																var5 = EnumComposition.field3340 * 128 + 64; // L: 3553
																var6 = SecureRandomFuture.getTileHeight(var4, var5, GameObject.Client_plane) - class25.field128; // L: 3554
																var7 = var4 - Player.cameraX; // L: 3555
																var8 = var6 - KeyHandler.cameraY; // L: 3556
																var9 = var5 - class69.cameraZ; // L: 3557
																var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9)); // L: 3558
																var11 = (int)(Math.atan2((double)var8, (double)var10) * 325.949D) & 2047; // L: 3559
																var12 = (int)(Math.atan2((double)var7, (double)var9) * -325.949D) & 2047; // L: 3560
																if (var11 < 128) { // L: 3561
																	var11 = 128;
																}

																if (var11 > 383) { // L: 3562
																	var11 = 383;
																}

																if (Skeleton.cameraPitch < var11) { // L: 3563
																	Skeleton.cameraPitch = (var11 - Skeleton.cameraPitch) * ModeWhere.field2405 / 1000 + Skeleton.cameraPitch + Players.field1267; // L: 3564
																	if (Skeleton.cameraPitch > var11) { // L: 3565
																		Skeleton.cameraPitch = var11;
																	}
																}

																if (Skeleton.cameraPitch > var11) { // L: 3567
																	Skeleton.cameraPitch -= ModeWhere.field2405 * (Skeleton.cameraPitch - var11) / 1000 + Players.field1267; // L: 3568
																	if (Skeleton.cameraPitch < var11) { // L: 3569
																		Skeleton.cameraPitch = var11;
																	}
																}

																var28 = var12 - AbstractArchive.cameraYaw; // L: 3571
																if (var28 > 1024) { // L: 3572
																	var28 -= 2048;
																}

																if (var28 < -1024) { // L: 3573
																	var28 += 2048;
																}

																if (var28 > 0) { // L: 3574
																	AbstractArchive.cameraYaw = var28 * ModeWhere.field2405 / 1000 + AbstractArchive.cameraYaw + Players.field1267; // L: 3575
																	AbstractArchive.cameraYaw &= 2047; // L: 3576
																}

																if (var28 < 0) { // L: 3578
																	AbstractArchive.cameraYaw -= Players.field1267 + -var28 * ModeWhere.field2405 / 1000; // L: 3579
																	AbstractArchive.cameraYaw &= 2047; // L: 3580
																}

																int var14 = var12 - AbstractArchive.cameraYaw; // L: 3582
																if (var14 > 1024) { // L: 3583
																	var14 -= 2048;
																}

																if (var14 < -1024) { // L: 3584
																	var14 += 2048;
																}

																if (var14 < 0 && var28 > 0 || var14 > 0 && var28 < 0) { // L: 3585
																	AbstractArchive.cameraYaw = var12;
																}
															}

															for (var4 = 0; var4 < 5; ++var4) { // L: 3587
																int var10002 = field644[var4]++;
															}

															Varcs.varcs.tryWrite(); // L: 3588
															var4 = Occluder.method3378(); // L: 3589
															var5 = VarcInt.method4427(); // L: 3590
															if (var4 > 15000 && var5 > 15000) { // L: 3591
																logoutTimer = 250; // L: 3592
																ChatChannel.method2317(14500); // L: 3593
																var19 = ItemContainer.getPacketBufferNode(ClientPacket.field2303, packetWriter.isaacCipher); // L: 3595
																packetWriter.addNode(var19); // L: 3596
															}

															MilliClock.friendSystem.processFriendUpdates(); // L: 3598
															++packetWriter.pendingWrites; // L: 3599
															if (packetWriter.pendingWrites > 50) { // L: 3600
																var19 = ItemContainer.getPacketBufferNode(ClientPacket.field2322, packetWriter.isaacCipher); // L: 3602
																packetWriter.addNode(var19); // L: 3603
															}

															try {
																packetWriter.flush(); // L: 3606
															} catch (IOException var29) { // L: 3608
																LoginScreenAnimation.method1903(); // L: 3609
															}

															return; // L: 3611
														}

														var42 = var41.widget; // L: 3285
														if (var42.childIndex < 0) { // L: 3286
															break;
														}

														var39 = CollisionMap.getWidget(var42.parentId); // L: 3287
													} while(var39 == null || var39.children == null || var42.childIndex >= var39.children.length || var42 != var39.children[var42.childIndex]); // L: 3288

													class22.runScriptEvent(var41); // L: 3292
												}
											}

											var42 = var41.widget; // L: 3273
											if (var42.childIndex < 0) { // L: 3274
												break;
											}

											var39 = CollisionMap.getWidget(var42.parentId); // L: 3275
										} while(var39 == null || var39.children == null || var42.childIndex >= var39.children.length || var42 != var39.children[var42.childIndex]); // L: 3276

										class22.runScriptEvent(var41); // L: 3280
									}
								}

								var42 = var41.widget; // L: 3261
								if (var42.childIndex < 0) { // L: 3262
									break;
								}

								var39 = CollisionMap.getWidget(var42.parentId); // L: 3263
							} while(var39 == null || var39.children == null || var42.childIndex >= var39.children.length || var42 != var39.children[var42.childIndex]); // L: 3264

							class22.runScriptEvent(var41); // L: 3268
						}
					}
				}
			}
		}
	} // L: 2993 3175

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "890034121"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = IgnoreList.canvasWidth; // L: 4206
		int var2 = ModelData0.canvasHeight; // L: 4207
		if (super.contentWidth < var1) { // L: 4208
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) { // L: 4209
			var2 = super.contentHeight;
		}

		if (Timer.clientPreferences != null) { // L: 4210
			try {
				Client var3 = WorldMapIcon_0.client; // L: 4212
				Object[] var4 = new Object[]{SoundSystem.getWindowedMode()}; // L: 4213
				JSObject.getWindow(var3).call("resize", var4); // L: 4216
			} catch (Throwable var5) { // L: 4219
			}
		}

	} // L: 4221

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-527814205"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) { // L: 4224
			NPCComposition.method4759(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4225
			if (field901[var1]) { // L: 4226
				field854[var1] = true;
			}

			field855[var1] = field901[var1]; // L: 4227
			field901[var1] = false; // L: 4228
		}

		field852 = cycle; // L: 4230
		viewportX = -1; // L: 4231
		viewportY = -1; // L: 4232
		Occluder.hoveredItemContainer = null; // L: 4233
		if (rootInterface != -1) { // L: 4234
			rootWidgetCount = 0; // L: 4235
			KeyHandler.drawWidgets(rootInterface, 0, 0, IgnoreList.canvasWidth, ModelData0.canvasHeight, 0, 0, -1); // L: 4236
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4238
		if (showMouseCross) { // L: 4239
			if (mouseCrossColor == 1) { // L: 4240
				GrandExchangeOfferAgeComparator.crossSprites[mouseCrossState / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4241
			}

			if (mouseCrossColor == 2) { // L: 4243
				GrandExchangeOfferAgeComparator.crossSprites[mouseCrossState / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4244
			}
		}

		if (!isMenuOpen) { // L: 4247
			if (viewportX != -1) { // L: 4248
				WorldMapData_0.method243(viewportX, viewportY);
			}
		} else {
			var1 = AbstractUserComparator.menuX; // L: 4251
			int var2 = DynamicObject.menuY; // L: 4252
			int var3 = Occluder.menuWidth; // L: 4253
			int var4 = class182.menuHeight; // L: 4254
			int var5 = 6116423; // L: 4255
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5); // L: 4256
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0); // L: 4257
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0); // L: 4258
			GrandExchangeOfferTotalQuantityComparator.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1); // L: 4259
			int var6 = MouseHandler.MouseHandler_x; // L: 4260
			int var7 = MouseHandler.MouseHandler_y; // L: 4261

			for (int var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 4262
				int var9 = (menuOptionsCount - 1 - var8) * 15 + var2 + 31; // L: 4263
				int var10 = 16777215; // L: 4264
				if (var6 > var1 && var6 < var3 + var1 && var7 > var9 - 13 && var7 < var9 + 3) { // L: 4265
					var10 = 16776960;
				}

				GrandExchangeOfferTotalQuantityComparator.fontBold12.draw(ArchiveLoader.method1230(var8), var1 + 3, var9, var10, 0); // L: 4266
			}

			Strings.method4157(AbstractUserComparator.menuX, DynamicObject.menuY, Occluder.menuWidth, class182.menuHeight); // L: 4268
		}

		if (gameDrawingMode == 3) { // L: 4270
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4271
				if (field855[var1]) { // L: 4272
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4273
				} else if (field854[var1]) { // L: 4275
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4276
				}
			}
		}

		FriendsList.method5222(GameObject.Client_plane, PlayerComposition.localPlayer.x, PlayerComposition.localPlayer.y, field850); // L: 4280
		field850 = 0; // L: 4281
	} // L: 4282

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(Ldh;B)Z",
		garbageValue = "126"
	)
	final boolean method1687(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 5620
		PacketBuffer var3 = var1.packetBuffer; // L: 5621
		if (var2 == null) { // L: 5622
			return false;
		} else {
			String var17;
			int var18;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 5624
					if (var1.field1332) { // L: 5625
						if (!var2.isAvailable(1)) { // L: 5626
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 5627
						var1.field1333 = 0; // L: 5628
						var1.field1332 = false; // L: 5629
					}

					var3.offset = 0; // L: 5631
					if (var3.method5491()) { // L: 5632
						if (!var2.isAvailable(1)) { // L: 5633
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 5634
						var1.field1333 = 0; // L: 5635
					}

					var1.field1332 = true; // L: 5637
					ServerPacket[] var4 = Tiles.ServerPacket_values(); // L: 5638
					var5 = var3.readSmartByteShortIsaac(); // L: 5639
					if (var5 < 0 || var5 >= var4.length) { // L: 5640
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 5641
					var1.serverPacketLength = var1.serverPacket.length; // L: 5642
				}

				if (var1.serverPacketLength == -1) { // L: 5644
					if (!var2.isAvailable(1)) { // L: 5645
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 5646
					var1.serverPacketLength = var3.array[0] & 255; // L: 5647
				}

				if (var1.serverPacketLength == -2) { // L: 5649
					if (!var2.isAvailable(2)) { // L: 5650
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 5651
					var3.offset = 0; // L: 5652
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 5653
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 5655
					return false;
				}

				var3.offset = 0; // L: 5656
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 5657
				var1.field1333 = 0; // L: 5658
				timer.method5010(); // L: 5659
				var1.field1337 = var1.field1336; // L: 5660
				var1.field1336 = var1.field1335; // L: 5661
				var1.field1335 = var1.serverPacket; // L: 5662
				int var16;
				String var44;
				boolean var46;
				if (ServerPacket.field2139 == var1.serverPacket) { // L: 5663
					var16 = var3.readUShortSmart(); // L: 5664
					var46 = var3.readUnsignedByte() == 1; // L: 5665
					var44 = ""; // L: 5666
					boolean var48 = false; // L: 5667
					if (var46) { // L: 5668
						var44 = var3.readStringCp1252NullTerminated(); // L: 5669
						if (MilliClock.friendSystem.isIgnored(new Username(var44, GrandExchangeOfferUnitPriceComparator.loginType))) { // L: 5670
							var48 = true;
						}
					}

					String var43 = var3.readStringCp1252NullTerminated(); // L: 5672
					if (!var48) { // L: 5673
						class234.addGameMessage(var16, var44, var43);
					}

					var1.serverPacket = null; // L: 5674
					return true; // L: 5675
				}

				if (ServerPacket.field2172 == var1.serverPacket) { // L: 5677
					var16 = var3.method5539(); // L: 5678
					if (var16 == 65535) { // L: 5679
						var16 = -1;
					}

					WorldMapData_0.playSong(var16); // L: 5680
					var1.serverPacket = null; // L: 5681
					return true; // L: 5682
				}

				if (ServerPacket.field2188 == var1.serverPacket) { // L: 5684
					var16 = var3.readUnsignedShort(); // L: 5685
					if (var16 == 65535) { // L: 5686
						var16 = -1;
					}

					var5 = var3.method5586(); // L: 5687
					LoginPacket.method3672(var16, var5); // L: 5688
					var1.serverPacket = null; // L: 5689
					return true; // L: 5690
				}

				if (ServerPacket.field2187 == var1.serverPacket) { // L: 5692
					for (var16 = 0; var16 < VarpDefinition.VarpDefinition_fileCount; ++var16) { // L: 5693
						VarpDefinition var56 = class219.VarpDefinition_get(var16); // L: 5694
						if (var56 != null) { // L: 5695
							Varps.Varps_temp[var16] = 0; // L: 5696
							Varps.Varps_main[var16] = 0; // L: 5697
						}
					}

					class195.method3681(); // L: 5700
					changedVarpCount += 32; // L: 5701
					var1.serverPacket = null; // L: 5702
					return true; // L: 5703
				}

				if (ServerPacket.field2157 == var1.serverPacket) { // L: 5705
					WorldMapData_0.updateNpcs(false, var3); // L: 5706
					var1.serverPacket = null; // L: 5707
					return true; // L: 5708
				}

				if (ServerPacket.field2145 == var1.serverPacket) { // L: 5710
					var16 = var3.readUnsignedByte(); // L: 5711
					FontName.method5354(var16); // L: 5712
					var1.serverPacket = null; // L: 5713
					return true; // L: 5714
				}

				if (ServerPacket.field2152 == var1.serverPacket) { // L: 5716
					UserComparator4.method3465(class194.field2345); // L: 5717
					var1.serverPacket = null; // L: 5718
					return true; // L: 5719
				}

				String var38;
				if (ServerPacket.field2189 == var1.serverPacket) { // L: 5721
					var38 = var3.readStringCp1252NullTerminated(); // L: 5722
					Object[] var55 = new Object[var38.length() + 1]; // L: 5723

					for (var18 = var38.length() - 1; var18 >= 0; --var18) { // L: 5724
						if (var38.charAt(var18) == 's') { // L: 5725
							var55[var18 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var55[var18 + 1] = new Integer(var3.readInt()); // L: 5726
						}
					}

					var55[0] = new Integer(var3.readInt()); // L: 5728
					ScriptEvent var47 = new ScriptEvent(); // L: 5729
					var47.args = var55; // L: 5730
					class22.runScriptEvent(var47); // L: 5731
					var1.serverPacket = null; // L: 5732
					return true; // L: 5733
				}

				if (ServerPacket.field2217 == var1.serverPacket) { // L: 5735
					if (WorldMapArea.clanChat != null) { // L: 5736
						WorldMapArea.clanChat.method5251(var3); // L: 5737
					}

					WorldMapLabel.method469(); // L: 5739
					var1.serverPacket = null; // L: 5740
					return true; // L: 5741
				}

				if (ServerPacket.field2175 == var1.serverPacket) { // L: 5743
					WorldMapData_0.updateNpcs(true, var3); // L: 5744
					var1.serverPacket = null; // L: 5745
					return true; // L: 5746
				}

				if (ServerPacket.field2176 == var1.serverPacket) { // L: 5748
					SoundSystem.readReflectionCheck(var3, var1.serverPacketLength); // L: 5749
					var1.serverPacket = null; // L: 5750
					return true; // L: 5751
				}

				if (ServerPacket.field2174 == var1.serverPacket) { // L: 5753
					var16 = var3.readUnsignedByte(); // L: 5754
					if (var3.readUnsignedByte() == 0) { // L: 5755
						grandExchangeOffers[var16] = new GrandExchangeOffer(); // L: 5756
						var3.offset += 18; // L: 5757
					} else {
						--var3.offset; // L: 5760
						grandExchangeOffers[var16] = new GrandExchangeOffer(var3, false); // L: 5761
					}

					field685 = cycleCntr; // L: 5763
					var1.serverPacket = null; // L: 5764
					return true; // L: 5765
				}

				Widget var51;
				if (ServerPacket.field2150 == var1.serverPacket) { // L: 5767
					var16 = var3.readInt(); // L: 5768
					var51 = CollisionMap.getWidget(var16); // L: 5769
					var51.modelType = 3; // L: 5770
					var51.modelId = PlayerComposition.localPlayer.appearance.getChatHeadId(); // L: 5771
					CollisionMap.invalidateWidget(var51); // L: 5772
					var1.serverPacket = null; // L: 5773
					return true; // L: 5774
				}

				int var7;
				int var9;
				long var12;
				int var19;
				InterfaceParent var20;
				int var21;
				if (ServerPacket.field2184 == var1.serverPacket) { // L: 5776
					var16 = var3.offset + var1.serverPacketLength; // L: 5777
					var5 = var3.readUnsignedShort(); // L: 5778
					var18 = var3.readUnsignedShort(); // L: 5779
					if (var5 != rootInterface) { // L: 5780
						rootInterface = var5; // L: 5781
						this.resizeRoot(false); // L: 5782
						class304.Widget_resetModelFrames(rootInterface); // L: 5783
						VarpDefinition.runWidgetOnLoadListener(rootInterface); // L: 5784

						for (var7 = 0; var7 < 100; ++var7) { // L: 5785
							field901[var7] = true;
						}
					}

					InterfaceParent var45;
					for (; var18-- > 0; var45.field559 = true) { // L: 5787 5797
						var7 = var3.readInt(); // L: 5788
						var19 = var3.readUnsignedShort(); // L: 5789
						var9 = var3.readUnsignedByte(); // L: 5790
						var45 = (InterfaceParent)interfaceParents.get((long)var7); // L: 5791
						if (var45 != null && var19 != var45.group) { // L: 5792
							MouseRecorder.closeInterface(var45, true); // L: 5793
							var45 = null; // L: 5794
						}

						if (var45 == null) { // L: 5796
							var45 = NetFileRequest.method4189(var7, var19, var9);
						}
					}

					for (var20 = (InterfaceParent)interfaceParents.first(); var20 != null; var20 = (InterfaceParent)interfaceParents.next()) { // L: 5799
						if (var20.field559) { // L: 5800
							var20.field559 = false;
						} else {
							MouseRecorder.closeInterface(var20, true); // L: 5802
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 5805

					while (var3.offset < var16) { // L: 5806
						var7 = var3.readInt(); // L: 5807
						var19 = var3.readUnsignedShort(); // L: 5808
						var9 = var3.readUnsignedShort(); // L: 5809
						var21 = var3.readInt(); // L: 5810

						for (int var11 = var19; var11 <= var9; ++var11) { // L: 5811
							var12 = (long)var11 + ((long)var7 << 32); // L: 5812
							widgetFlags.put(new IntegerNode(var21), var12); // L: 5813
						}
					}

					var1.serverPacket = null; // L: 5816
					return true; // L: 5817
				}

				if (ServerPacket.field2143 == var1.serverPacket) { // L: 5819
					class248.field3222 = var3.method5573(); // L: 5820
					PacketWriter.field1331 = var3.method5573(); // L: 5821

					while (var3.offset < var1.serverPacketLength) { // L: 5822
						var16 = var3.readUnsignedByte(); // L: 5823
						class194 var54 = InvDefinition.method4371()[var16]; // L: 5824
						UserComparator4.method3465(var54); // L: 5825
					}

					var1.serverPacket = null; // L: 5827
					return true; // L: 5828
				}

				if (ServerPacket.field2199 == var1.serverPacket) { // L: 5830
					hintArrowType = var3.readUnsignedByte(); // L: 5831
					if (hintArrowType == 1) { // L: 5832
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 5833
						if (hintArrowType == 2) { // L: 5834
							hintArrowSubX = 64; // L: 5835
							hintArrowSubY = 64; // L: 5836
						}

						if (hintArrowType == 3) { // L: 5838
							hintArrowSubX = 0; // L: 5839
							hintArrowSubY = 64; // L: 5840
						}

						if (hintArrowType == 4) { // L: 5842
							hintArrowSubX = 128; // L: 5843
							hintArrowSubY = 64; // L: 5844
						}

						if (hintArrowType == 5) { // L: 5846
							hintArrowSubX = 64; // L: 5847
							hintArrowSubY = 0; // L: 5848
						}

						if (hintArrowType == 6) { // L: 5850
							hintArrowSubX = 64; // L: 5851
							hintArrowSubY = 128; // L: 5852
						}

						hintArrowType = 2; // L: 5854
						hintArrowX = var3.readUnsignedShort(); // L: 5855
						hintArrowY = var3.readUnsignedShort(); // L: 5856
						hintArrowHeight = var3.readUnsignedByte(); // L: 5857
					}

					if (hintArrowType == 10) { // L: 5859
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 5860
					return true; // L: 5861
				}

				if (ServerPacket.field2154 == var1.serverPacket) { // L: 5863
					UserComparator4.method3465(class194.field2348); // L: 5864
					var1.serverPacket = null; // L: 5865
					return true; // L: 5866
				}

				if (ServerPacket.field2149 == var1.serverPacket) { // L: 5868
					var16 = var3.readUnsignedShort(); // L: 5869
					var5 = var3.readUnsignedByte(); // L: 5870
					var18 = var3.readUnsignedShort(); // L: 5871
					class232.queueSoundEffect(var16, var5, var18); // L: 5872
					var1.serverPacket = null; // L: 5873
					return true; // L: 5874
				}

				Widget var40;
				if (ServerPacket.field2191 == var1.serverPacket) { // L: 5876
					var16 = var3.method5582(); // L: 5877
					var5 = var3.readInt(); // L: 5878
					var40 = CollisionMap.getWidget(var5); // L: 5879
					if (var40 != null && var40.type == 0) { // L: 5880
						if (var16 > var40.scrollHeight - var40.height) { // L: 5881
							var16 = var40.scrollHeight - var40.height;
						}

						if (var16 < 0) { // L: 5882
							var16 = 0;
						}

						if (var16 != var40.scrollY) { // L: 5883
							var40.scrollY = var16; // L: 5884
							CollisionMap.invalidateWidget(var40); // L: 5885
						}
					}

					var1.serverPacket = null; // L: 5888
					return true; // L: 5889
				}

				if (ServerPacket.field2219 == var1.serverPacket) { // L: 5891
					minimapState = var3.readUnsignedByte(); // L: 5892
					var1.serverPacket = null; // L: 5893
					return true; // L: 5894
				}

				if (ServerPacket.field2169 == var1.serverPacket) { // L: 5896
					var16 = var3.readUnsignedByte(); // L: 5897
					var5 = var3.readUnsignedByte(); // L: 5898
					var18 = var3.readUnsignedByte(); // L: 5899
					var7 = var3.readUnsignedByte(); // L: 5900
					field902[var16] = true; // L: 5901
					field679[var16] = var5; // L: 5902
					field893[var16] = var18; // L: 5903
					field705[var16] = var7; // L: 5904
					field644[var16] = 0; // L: 5905
					var1.serverPacket = null; // L: 5906
					return true; // L: 5907
				}

				if (ServerPacket.field2214 == var1.serverPacket) { // L: 5909
					for (var16 = 0; var16 < players.length; ++var16) { // L: 5910
						if (players[var16] != null) { // L: 5911
							players[var16].sequence = -1;
						}
					}

					for (var16 = 0; var16 < npcs.length; ++var16) { // L: 5913
						if (npcs[var16] != null) { // L: 5914
							npcs[var16].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 5916
					return true; // L: 5917
				}

				if (ServerPacket.field2165 == var1.serverPacket) { // L: 5919
					UserComparator4.method3465(class194.field2351); // L: 5920
					var1.serverPacket = null; // L: 5921
					return true; // L: 5922
				}

				if (ServerPacket.field2215 == var1.serverPacket) { // L: 5924
					rebootTimer = var3.method5582() * 30; // L: 5925
					field845 = cycleCntr; // L: 5926
					var1.serverPacket = null; // L: 5927
					return true; // L: 5928
				}

				if (ServerPacket.field2153 == var1.serverPacket) { // L: 5930
					var16 = var3.method5643(); // L: 5931
					var5 = var3.method5583(); // L: 5932
					var40 = CollisionMap.getWidget(var16); // L: 5933
					if (var5 != var40.sequenceId || var5 == -1) { // L: 5934
						var40.sequenceId = var5; // L: 5935
						var40.modelFrame = 0; // L: 5936
						var40.modelFrameCycle = 0; // L: 5937
						CollisionMap.invalidateWidget(var40); // L: 5938
					}

					var1.serverPacket = null; // L: 5940
					return true; // L: 5941
				}

				if (ServerPacket.field2207 == var1.serverPacket) { // L: 5943
					class195.method3681(); // L: 5944
					runEnergy = var3.readUnsignedByte(); // L: 5945
					field845 = cycleCntr; // L: 5946
					var1.serverPacket = null; // L: 5947
					return true; // L: 5948
				}

				Widget var58;
				if (ServerPacket.field2218 == var1.serverPacket) { // L: 5950
					var16 = var3.method5580(); // L: 5951
					var5 = var3.readUnsignedShort(); // L: 5952
					var18 = var3.readInt(); // L: 5953
					var58 = CollisionMap.getWidget(var18); // L: 5954
					var58.field2642 = var16 + (var5 << 16); // L: 5955
					var1.serverPacket = null; // L: 5956
					return true; // L: 5957
				}

				if (ServerPacket.field2160 == var1.serverPacket) { // L: 5959
					var16 = var3.readInt(); // L: 5960
					InterfaceParent var53 = (InterfaceParent)interfaceParents.get((long)var16); // L: 5961
					if (var53 != null) { // L: 5962
						MouseRecorder.closeInterface(var53, true);
					}

					if (meslayerContinueWidget != null) { // L: 5963
						CollisionMap.invalidateWidget(meslayerContinueWidget); // L: 5964
						meslayerContinueWidget = null; // L: 5965
					}

					var1.serverPacket = null; // L: 5967
					return true; // L: 5968
				}

				if (ServerPacket.field2185 == var1.serverPacket) { // L: 5970
					var16 = var3.method5643(); // L: 5971
					var5 = var3.method5571(); // L: 5972
					var18 = var3.method5580(); // L: 5973
					var20 = (InterfaceParent)interfaceParents.get((long)var16); // L: 5974
					if (var20 != null) { // L: 5975
						MouseRecorder.closeInterface(var20, var18 != var20.group);
					}

					NetFileRequest.method4189(var16, var18, var5); // L: 5976
					var1.serverPacket = null; // L: 5977
					return true; // L: 5978
				}

				if (ServerPacket.field2162 == var1.serverPacket) { // L: 5980
					MilliClock.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 5981
					class9.FriendSystem_invalidateIgnoreds(); // L: 5982
					field879 = cycleCntr; // L: 5983
					var1.serverPacket = null; // L: 5984
					return true; // L: 5985
				}

				if (ServerPacket.field2216 == var1.serverPacket) { // L: 5987
					var38 = var3.readStringCp1252NullTerminated(); // L: 5988
					var17 = AbstractFont.escapeBrackets(ServerPacket.method3663(AttackOption.method2135(var3))); // L: 5989
					class234.addGameMessage(6, var38, var17); // L: 5990
					var1.serverPacket = null; // L: 5991
					return true; // L: 5992
				}

				if (ServerPacket.field2148 == var1.serverPacket) { // L: 5994
					isCameraLocked = false; // L: 5995

					for (var16 = 0; var16 < 5; ++var16) { // L: 5996
						field902[var16] = false;
					}

					var1.serverPacket = null; // L: 5997
					return true; // L: 5998
				}

				if (ServerPacket.field2204 == var1.serverPacket) { // L: 6000
					ItemContainer.loadRegions(false, var1.packetBuffer); // L: 6001
					var1.serverPacket = null; // L: 6002
					return true; // L: 6003
				}

				if (ServerPacket.field2193 == var1.serverPacket) { // L: 6005
					isCameraLocked = true; // L: 6006
					RouteStrategy.field2124 = var3.readUnsignedByte(); // L: 6007
					class89.field1140 = var3.readUnsignedByte(); // L: 6008
					class41.field302 = var3.readUnsignedShort(); // L: 6009
					DynamicObject.field1316 = var3.readUnsignedByte(); // L: 6010
					WorldMapRegion.field271 = var3.readUnsignedByte(); // L: 6011
					if (WorldMapRegion.field271 >= 100) { // L: 6012
						Player.cameraX = RouteStrategy.field2124 * 128 + 64; // L: 6013
						class69.cameraZ = class89.field1140 * 128 + 64; // L: 6014
						KeyHandler.cameraY = SecureRandomFuture.getTileHeight(Player.cameraX, class69.cameraZ, GameObject.Client_plane) - class41.field302; // L: 6015
					}

					var1.serverPacket = null; // L: 6017
					return true; // L: 6018
				}

				if (ServerPacket.field2224 == var1.serverPacket) { // L: 6020
					if (rootInterface != -1) { // L: 6021
						WorldMapRectangle.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 6022
					return true; // L: 6023
				}

				if (ServerPacket.field2178 == var1.serverPacket) { // L: 6025
					var16 = var3.method5582(); // L: 6026
					rootInterface = var16; // L: 6027
					this.resizeRoot(false); // L: 6028
					class304.Widget_resetModelFrames(var16); // L: 6029
					VarpDefinition.runWidgetOnLoadListener(rootInterface); // L: 6030

					for (var5 = 0; var5 < 100; ++var5) { // L: 6031
						field901[var5] = true;
					}

					var1.serverPacket = null; // L: 6032
					return true; // L: 6033
				}

				if (ServerPacket.field2221 == var1.serverPacket) { // L: 6035
					class248.field3222 = var3.method5571(); // L: 6036
					PacketWriter.field1331 = var3.method5571(); // L: 6037

					for (var16 = PacketWriter.field1331; var16 < PacketWriter.field1331 + 8; ++var16) { // L: 6038
						for (var5 = class248.field3222; var5 < class248.field3222 + 8; ++var5) { // L: 6039
							if (groundItems[GameObject.Client_plane][var16][var5] != null) { // L: 6040
								groundItems[GameObject.Client_plane][var16][var5] = null; // L: 6041
								MouseRecorder.updateItemPile(var16, var5); // L: 6042
							}
						}
					}

					for (PendingSpawn var41 = (PendingSpawn)pendingSpawns.last(); var41 != null; var41 = (PendingSpawn)pendingSpawns.previous()) { // L: 6046 6047 6049
						if (var41.x >= PacketWriter.field1331 && var41.x < PacketWriter.field1331 + 8 && var41.y >= class248.field3222 && var41.y < class248.field3222 + 8 && var41.plane == GameObject.Client_plane) { // L: 6048
							var41.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 6051
					return true; // L: 6052
				}

				if (ServerPacket.field2203 == var1.serverPacket) { // L: 6054
					byte[] var39 = new byte[var1.serverPacketLength]; // L: 6055
					var3.method5493(var39, 0, var39.length); // L: 6056
					Buffer var52 = new Buffer(var39); // L: 6057
					var44 = var52.readStringCp1252NullTerminated(); // L: 6058
					AttackOption.openURL(var44, true, false); // L: 6059
					var1.serverPacket = null; // L: 6060
					return true; // L: 6061
				}

				if (ServerPacket.field2164 == var1.serverPacket) { // L: 6063
					UserComparator4.method3465(class194.field2344); // L: 6064
					var1.serverPacket = null; // L: 6065
					return true; // L: 6066
				}

				if (ServerPacket.field2205 == var1.serverPacket) { // L: 6068
					tradeChatMode = var3.method5573(); // L: 6069
					publicChatMode = var3.method5572(); // L: 6070
					var1.serverPacket = null; // L: 6071
					return true; // L: 6072
				}

				if (ServerPacket.field2197 == var1.serverPacket) { // L: 6074
					var16 = var3.method5591(); // L: 6075
					var5 = var3.method5592(); // L: 6076
					var18 = var3.method5539(); // L: 6077
					if (var18 == 65535) { // L: 6078
						var18 = -1;
					}

					var58 = CollisionMap.getWidget(var16); // L: 6079
					ItemComposition var42;
					if (!var58.isIf3) { // L: 6080
						if (var18 == -1) { // L: 6081
							var58.modelType = 0; // L: 6082
							var1.serverPacket = null; // L: 6083
							return true; // L: 6084
						}

						var42 = SecureRandomCallable.ItemDefinition_get(var18); // L: 6086
						var58.modelType = 4; // L: 6087
						var58.modelId = var18; // L: 6088
						var58.modelAngleX = var42.xan2d; // L: 6089
						var58.modelAngleY = var42.yan2d; // L: 6090
						var58.modelZoom = var42.zoom2d * 100 / var5; // L: 6091
						CollisionMap.invalidateWidget(var58); // L: 6092
					} else {
						var58.itemId = var18; // L: 6095
						var58.itemQuantity = var5; // L: 6096
						var42 = SecureRandomCallable.ItemDefinition_get(var18); // L: 6097
						var58.modelAngleX = var42.xan2d; // L: 6098
						var58.modelAngleY = var42.yan2d; // L: 6099
						var58.modelAngleZ = var42.zan2d; // L: 6100
						var58.modelOffsetX = var42.offsetX2d; // L: 6101
						var58.modelOffsetY = var42.offsetY2d; // L: 6102
						var58.modelZoom = var42.zoom2d; // L: 6103
						if (var42.isStackable == 1) { // L: 6104
							var58.itemQuantityMode = 1;
						} else {
							var58.itemQuantityMode = 2; // L: 6105
						}

						if (var58.field2641 > 0) { // L: 6106
							var58.modelZoom = var58.modelZoom * 32 / var58.field2641;
						} else if (var58.rawWidth > 0) { // L: 6107
							var58.modelZoom = var58.modelZoom * 32 / var58.rawWidth;
						}

						CollisionMap.invalidateWidget(var58); // L: 6108
					}

					var1.serverPacket = null; // L: 6110
					return true; // L: 6111
				}

				boolean var50;
				if (ServerPacket.field2180 == var1.serverPacket) { // L: 6113
					var50 = var3.readBoolean(); // L: 6114
					if (var50) { // L: 6115
						if (WorldMapIcon_0.field148 == null) { // L: 6116
							WorldMapIcon_0.field148 = new class248();
						}
					} else {
						WorldMapIcon_0.field148 = null; // L: 6118
					}

					var1.serverPacket = null; // L: 6119
					return true; // L: 6120
				}

				if (ServerPacket.field2170 == var1.serverPacket) { // L: 6122
					var16 = var3.method5592(); // L: 6123
					var5 = var3.readUnsignedShort(); // L: 6124
					Varps.Varps_temp[var5] = var16; // L: 6125
					if (Varps.Varps_main[var5] != var16) { // L: 6126
						Varps.Varps_main[var5] = var16; // L: 6127
					}

					Script.changeGameOptions(var5); // L: 6129
					changedVarps[++changedVarpCount - 1 & 31] = var5; // L: 6130
					var1.serverPacket = null; // L: 6131
					return true; // L: 6132
				}

				if (ServerPacket.field2186 == var1.serverPacket) { // L: 6134
					destinationX = var3.readUnsignedByte(); // L: 6135
					if (destinationX == 255) { // L: 6136
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 6137
					if (destinationY == 255) { // L: 6138
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 6139
					return true; // L: 6140
				}

				if (ServerPacket.field2167 == var1.serverPacket) { // L: 6142
					for (var16 = 0; var16 < Varps.Varps_main.length; ++var16) { // L: 6143
						if (Varps.Varps_main[var16] != Varps.Varps_temp[var16]) { // L: 6144
							Varps.Varps_main[var16] = Varps.Varps_temp[var16]; // L: 6145
							Script.changeGameOptions(var16); // L: 6146
							changedVarps[++changedVarpCount - 1 & 31] = var16; // L: 6147
						}
					}

					var1.serverPacket = null; // L: 6150
					return true; // L: 6151
				}

				if (ServerPacket.field2210 == var1.serverPacket) { // L: 6153
					WorldMapData_0.method244(var3.readStringCp1252NullTerminated()); // L: 6154
					var1.serverPacket = null; // L: 6155
					return true; // L: 6156
				}

				if (ServerPacket.field2171 == var1.serverPacket) { // L: 6158
					UserComparator4.method3465(class194.field2343); // L: 6159
					var1.serverPacket = null; // L: 6160
					return true; // L: 6161
				}

				long var22;
				long var24;
				if (ServerPacket.field2194 == var1.serverPacket) { // L: 6163
					var38 = var3.readStringCp1252NullTerminated(); // L: 6164
					var22 = (long)var3.readUnsignedShort(); // L: 6165
					var24 = (long)var3.readMedium(); // L: 6166
					PlayerType var26 = (PlayerType)UrlRequester.findEnumerated(class234.PlayerType_values(), var3.readUnsignedByte()); // L: 6167
					long var27 = var24 + (var22 << 32); // L: 6168
					boolean var29 = false; // L: 6169

					for (int var13 = 0; var13 < 100; ++var13) { // L: 6170
						if (var27 == field868[var13]) { // L: 6171
							var29 = true; // L: 6172
							break; // L: 6173
						}
					}

					if (MilliClock.friendSystem.isIgnored(new Username(var38, GrandExchangeOfferUnitPriceComparator.loginType))) { // L: 6176
						var29 = true;
					}

					if (!var29 && field762 == 0) { // L: 6177
						field868[field707] = var27; // L: 6178
						field707 = (field707 + 1) % 100; // L: 6179
						String var30 = AbstractFont.escapeBrackets(ServerPacket.method3663(AttackOption.method2135(var3))); // L: 6180
						byte var49;
						if (var26.isPrivileged) { // L: 6182
							var49 = 7;
						} else {
							var49 = 3; // L: 6183
						}

						if (var26.modIcon != -1) { // L: 6184
							class234.addGameMessage(var49, class25.method248(var26.modIcon) + var38, var30);
						} else {
							class234.addGameMessage(var49, var38, var30); // L: 6185
						}
					}

					var1.serverPacket = null; // L: 6187
					return true; // L: 6188
				}

				long var31;
				if (ServerPacket.field2192 == var1.serverPacket) { // L: 6190
					var38 = var3.readStringCp1252NullTerminated(); // L: 6191
					var22 = var3.readLong(); // L: 6192
					var24 = (long)var3.readUnsignedShort(); // L: 6193
					var31 = (long)var3.readMedium(); // L: 6194
					PlayerType var60 = (PlayerType)UrlRequester.findEnumerated(class234.PlayerType_values(), var3.readUnsignedByte()); // L: 6195
					var12 = (var24 << 32) + var31; // L: 6196
					boolean var14 = false; // L: 6197

					for (int var15 = 0; var15 < 100; ++var15) { // L: 6198
						if (field868[var15] == var12) { // L: 6199
							var14 = true; // L: 6200
							break; // L: 6201
						}
					}

					if (var60.isUser && MilliClock.friendSystem.isIgnored(new Username(var38, GrandExchangeOfferUnitPriceComparator.loginType))) { // L: 6204 6205
						var14 = true;
					}

					if (!var14 && field762 == 0) { // L: 6207
						field868[field707] = var12; // L: 6208
						field707 = (field707 + 1) % 100; // L: 6209
						String var34 = AbstractFont.escapeBrackets(ServerPacket.method3663(AttackOption.method2135(var3))); // L: 6210
						if (var60.modIcon != -1) { // L: 6211
							UserComparator10.addChatMessage(9, class25.method248(var60.modIcon) + var38, var34, ParamDefinition.base37DecodeLong(var22));
						} else {
							UserComparator10.addChatMessage(9, var38, var34, ParamDefinition.base37DecodeLong(var22)); // L: 6212
						}
					}

					var1.serverPacket = null; // L: 6214
					return true; // L: 6215
				}

				if (ServerPacket.field2173 == var1.serverPacket) { // L: 6217
					WorldMapRectangle.logOut(); // L: 6218
					var1.serverPacket = null; // L: 6219
					return false; // L: 6220
				}

				if (ServerPacket.field2168 == var1.serverPacket) { // L: 6222
					UserComparator10.updatePlayers(var3, var1.serverPacketLength); // L: 6223
					TextureProvider.method2848(); // L: 6224
					var1.serverPacket = null; // L: 6225
					return true; // L: 6226
				}

				if (ServerPacket.field2206 == var1.serverPacket) { // L: 6228
					MilliClock.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 6229
					field879 = cycleCntr; // L: 6230
					var1.serverPacket = null; // L: 6231
					return true; // L: 6232
				}

				if (ServerPacket.field2151 == var1.serverPacket) { // L: 6234
					var16 = var3.method5582(); // L: 6235
					var5 = var3.method5591(); // L: 6236
					var40 = CollisionMap.getWidget(var5); // L: 6237
					if (var40.modelType != 2 || var16 != var40.modelId) { // L: 6238
						var40.modelType = 2; // L: 6239
						var40.modelId = var16; // L: 6240
						CollisionMap.invalidateWidget(var40); // L: 6241
					}

					var1.serverPacket = null; // L: 6243
					return true; // L: 6244
				}

				if (ServerPacket.field2190 == var1.serverPacket) { // L: 6246
					var16 = var3.method5643(); // L: 6247
					var5 = var3.method5580(); // L: 6248
					var18 = var5 >> 10 & 31; // L: 6249
					var7 = var5 >> 5 & 31; // L: 6250
					var19 = var5 & 31; // L: 6251
					var9 = (var7 << 11) + (var18 << 19) + (var19 << 3); // L: 6252
					Widget var10 = CollisionMap.getWidget(var16); // L: 6253
					if (var9 != var10.color) { // L: 6254
						var10.color = var9; // L: 6255
						CollisionMap.invalidateWidget(var10); // L: 6256
					}

					var1.serverPacket = null; // L: 6258
					return true; // L: 6259
				}

				if (ServerPacket.field2140 == var1.serverPacket) { // L: 6261
					var16 = var3.readInt(); // L: 6262
					var5 = var3.readUnsignedShort(); // L: 6263
					if (var16 < -70000) { // L: 6264
						var5 += 32768;
					}

					if (var16 >= 0) { // L: 6266
						var40 = CollisionMap.getWidget(var16);
					} else {
						var40 = null; // L: 6267
					}

					for (; var3.offset < var1.serverPacketLength; GrandExchangeOfferNameComparator.itemContainerSetItem(var5, var7, var19 - 1, var9)) { // L: 6268 6282
						var7 = var3.readUShortSmart(); // L: 6269
						var19 = var3.readUnsignedShort(); // L: 6270
						var9 = 0; // L: 6271
						if (var19 != 0) { // L: 6272
							var9 = var3.readUnsignedByte(); // L: 6273
							if (var9 == 255) { // L: 6274
								var9 = var3.readInt();
							}
						}

						if (var40 != null && var7 >= 0 && var7 < var40.itemIds.length) { // L: 6276 6277
							var40.itemIds[var7] = var19; // L: 6278
							var40.itemQuantities[var7] = var9; // L: 6279
						}
					}

					if (var40 != null) { // L: 6284
						CollisionMap.invalidateWidget(var40);
					}

					class195.method3681(); // L: 6285
					changedItemContainers[++field837 - 1 & 31] = var5 & 32767; // L: 6286
					var1.serverPacket = null; // L: 6287
					return true; // L: 6288
				}

				if (ServerPacket.field2198 == var1.serverPacket) { // L: 6290
					byte var59 = var3.method5665(); // L: 6291
					var5 = var3.method5580(); // L: 6292
					Varps.Varps_temp[var5] = var59; // L: 6293
					if (Varps.Varps_main[var5] != var59) { // L: 6294
						Varps.Varps_main[var5] = var59; // L: 6295
					}

					Script.changeGameOptions(var5); // L: 6297
					changedVarps[++changedVarpCount - 1 & 31] = var5; // L: 6298
					var1.serverPacket = null; // L: 6299
					return true; // L: 6300
				}

				if (ServerPacket.field2177 == var1.serverPacket) { // L: 6302
					var16 = var3.readInt(); // L: 6303
					var51 = CollisionMap.getWidget(var16); // L: 6304

					for (var18 = 0; var18 < var51.itemIds.length; ++var18) { // L: 6305
						var51.itemIds[var18] = -1; // L: 6306
						var51.itemIds[var18] = 0; // L: 6307
					}

					CollisionMap.invalidateWidget(var51); // L: 6309
					var1.serverPacket = null; // L: 6310
					return true; // L: 6311
				}

				if (ServerPacket.field2196 == var1.serverPacket) { // L: 6313
					var16 = var3.method5643(); // L: 6314
					var46 = var3.method5571() == 1; // L: 6315
					var40 = CollisionMap.getWidget(var16); // L: 6316
					if (var46 != var40.isHidden) { // L: 6317
						var40.isHidden = var46; // L: 6318
						CollisionMap.invalidateWidget(var40); // L: 6319
					}

					var1.serverPacket = null; // L: 6321
					return true; // L: 6322
				}

				if (ServerPacket.field2212 == var1.serverPacket) { // L: 6324
					UserComparator4.method3465(class194.field2350); // L: 6325
					var1.serverPacket = null; // L: 6326
					return true; // L: 6327
				}

				if (ServerPacket.field2159 == var1.serverPacket) { // L: 6329
					var16 = var3.readInt(); // L: 6330
					var17 = var3.readStringCp1252NullTerminated(); // L: 6331
					var40 = CollisionMap.getWidget(var16); // L: 6332
					if (!var17.equals(var40.text)) { // L: 6333
						var40.text = var17; // L: 6334
						CollisionMap.invalidateWidget(var40); // L: 6335
					}

					var1.serverPacket = null; // L: 6337
					return true; // L: 6338
				}

				if (ServerPacket.field2223 == var1.serverPacket) { // L: 6340
					var16 = var3.readInt(); // L: 6341
					var5 = var3.method5580(); // L: 6342
					var40 = CollisionMap.getWidget(var16); // L: 6343
					if (var40.modelType != 1 || var5 != var40.modelId) { // L: 6344
						var40.modelType = 1; // L: 6345
						var40.modelId = var5; // L: 6346
						CollisionMap.invalidateWidget(var40); // L: 6347
					}

					var1.serverPacket = null; // L: 6349
					return true; // L: 6350
				}

				if (ServerPacket.field2201 == var1.serverPacket) { // L: 6352
					MilliClock.friendSystem.method1919(); // L: 6353
					field879 = cycleCntr; // L: 6354
					var1.serverPacket = null; // L: 6355
					return true; // L: 6356
				}

				Widget var8;
				if (ServerPacket.field2211 == var1.serverPacket) { // L: 6358
					var16 = var3.method5582(); // L: 6359
					var5 = var3.method5539(); // L: 6360
					var18 = var3.method5539(); // L: 6361
					var7 = var3.method5643(); // L: 6362
					var8 = CollisionMap.getWidget(var7); // L: 6363
					if (var5 != var8.modelAngleX || var16 != var8.modelAngleY || var18 != var8.modelZoom) { // L: 6364
						var8.modelAngleX = var5; // L: 6365
						var8.modelAngleY = var16; // L: 6366
						var8.modelZoom = var18; // L: 6367
						CollisionMap.invalidateWidget(var8); // L: 6368
					}

					var1.serverPacket = null; // L: 6370
					return true; // L: 6371
				}

				if (ServerPacket.field2181 == var1.serverPacket) { // L: 6373
					UserComparator4.method3465(class194.field2342); // L: 6374
					var1.serverPacket = null; // L: 6375
					return true; // L: 6376
				}

				if (ServerPacket.field2222 == var1.serverPacket) { // L: 6378
					var16 = var3.method5584(); // L: 6379
					var5 = var3.readShort(); // L: 6380
					var18 = var3.readInt(); // L: 6381
					var58 = CollisionMap.getWidget(var18); // L: 6382
					if (var16 != var58.rawX || var5 != var58.rawY || var58.xAlignment != 0 || var58.yAlignment != 0) { // L: 6383
						var58.rawX = var16; // L: 6384
						var58.rawY = var5; // L: 6385
						var58.xAlignment = 0; // L: 6386
						var58.yAlignment = 0; // L: 6387
						CollisionMap.invalidateWidget(var58); // L: 6388
						this.alignWidget(var58); // L: 6389
						if (var58.type == 0) { // L: 6390
							PendingSpawn.revalidateWidgetScroll(class9.Widget_interfaceComponents[var18 >> 16], var58, false);
						}
					}

					var1.serverPacket = null; // L: 6392
					return true; // L: 6393
				}

				if (ServerPacket.field2161 == var1.serverPacket) { // L: 6395
					var16 = var3.readInt(); // L: 6396
					var5 = var3.readInt(); // L: 6397
					var18 = GrandExchangeOfferNameComparator.getGcDuration(); // L: 6398
					PacketBufferNode var57 = ItemContainer.getPacketBufferNode(ClientPacket.field2255, packetWriter.isaacCipher); // L: 6400
					var57.packetBuffer.method5569(var18); // L: 6401
					var57.packetBuffer.method5718(var16); // L: 6402
					var57.packetBuffer.method5587(var5); // L: 6403
					var57.packetBuffer.method5568(GameShell.fps); // L: 6404
					packetWriter.addNode(var57); // L: 6405
					var1.serverPacket = null; // L: 6406
					return true; // L: 6407
				}

				if (ServerPacket.field2166 == var1.serverPacket) { // L: 6409
					var16 = var3.readUnsignedByte(); // L: 6410
					WorldMapSection1.forceDisconnect(var16); // L: 6411
					var1.serverPacket = null; // L: 6412
					return false; // L: 6413
				}

				if (ServerPacket.field2163 == var1.serverPacket) { // L: 6415
					isCameraLocked = true; // L: 6416
					WorldMapData_0.field112 = var3.readUnsignedByte(); // L: 6417
					EnumComposition.field3340 = var3.readUnsignedByte(); // L: 6418
					class25.field128 = var3.readUnsignedShort(); // L: 6419
					Players.field1267 = var3.readUnsignedByte(); // L: 6420
					ModeWhere.field2405 = var3.readUnsignedByte(); // L: 6421
					if (ModeWhere.field2405 >= 100) { // L: 6422
						var16 = WorldMapData_0.field112 * 128 + 64; // L: 6423
						var5 = EnumComposition.field3340 * 128 + 64; // L: 6424
						var18 = SecureRandomFuture.getTileHeight(var16, var5, GameObject.Client_plane) - class25.field128; // L: 6425
						var7 = var16 - Player.cameraX; // L: 6426
						var19 = var18 - KeyHandler.cameraY; // L: 6427
						var9 = var5 - class69.cameraZ; // L: 6428
						var21 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9)); // L: 6429
						Skeleton.cameraPitch = (int)(Math.atan2((double)var19, (double)var21) * 325.949D) & 2047; // L: 6430
						AbstractArchive.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.949D) & 2047; // L: 6431
						if (Skeleton.cameraPitch < 128) { // L: 6432
							Skeleton.cameraPitch = 128;
						}

						if (Skeleton.cameraPitch > 383) { // L: 6433
							Skeleton.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 6435
					return true; // L: 6436
				}

				if (ServerPacket.field2147 == var1.serverPacket) { // L: 6438
					var16 = var3.readInt(); // L: 6439
					var5 = var3.method5580(); // L: 6440
					if (var5 == 65535) { // L: 6441
						var5 = -1;
					}

					var18 = var3.readInt(); // L: 6442
					var7 = var3.method5539(); // L: 6443
					if (var7 == 65535) { // L: 6444
						var7 = -1;
					}

					for (var19 = var7; var19 <= var5; ++var19) { // L: 6445
						var31 = (long)var19 + ((long)var16 << 32); // L: 6446
						Node var33 = widgetFlags.get(var31); // L: 6447
						if (var33 != null) { // L: 6448
							var33.remove();
						}

						widgetFlags.put(new IntegerNode(var18), var31); // L: 6449
					}

					var1.serverPacket = null; // L: 6451
					return true; // L: 6452
				}

				if (ServerPacket.field2179 == var1.serverPacket) { // L: 6454
					var3.offset += 28; // L: 6455
					if (var3.checkCrc()) { // L: 6456
						WorldMapEvent.method808(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 6457
					return true; // L: 6458
				}

				if (ServerPacket.field2144 == var1.serverPacket) { // L: 6460
					class195.method3681(); // L: 6461
					var16 = var3.method5592(); // L: 6462
					var5 = var3.method5571(); // L: 6463
					var18 = var3.method5571(); // L: 6464
					experience[var18] = var16; // L: 6465
					currentLevels[var18] = var5; // L: 6466
					levels[var18] = 1; // L: 6467

					for (var7 = 0; var7 < 98; ++var7) { // L: 6468
						if (var16 >= Skills.Skills_experienceTable[var7]) {
							levels[var18] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var18; // L: 6469
					var1.serverPacket = null; // L: 6470
					return true; // L: 6471
				}

				if (ServerPacket.field2183 == var1.serverPacket) { // L: 6473
					var38 = var3.readStringCp1252NullTerminated(); // L: 6474
					var5 = var3.method5571(); // L: 6475
					var18 = var3.method5572(); // L: 6476
					if (var18 >= 1 && var18 <= 8) { // L: 6477
						if (var38.equalsIgnoreCase("null")) { // L: 6478
							var38 = null;
						}

						playerMenuActions[var18 - 1] = var38; // L: 6479
						playerOptionsPriorities[var18 - 1] = var5 == 0; // L: 6480
					}

					var1.serverPacket = null; // L: 6482
					return true; // L: 6483
				}

				if (ServerPacket.field2142 == var1.serverPacket) { // L: 6485
					var16 = var3.readInt(); // L: 6486
					var5 = var3.readUnsignedShort(); // L: 6487
					if (var16 < -70000) { // L: 6488
						var5 += 32768;
					}

					if (var16 >= 0) { // L: 6490
						var40 = CollisionMap.getWidget(var16);
					} else {
						var40 = null; // L: 6491
					}

					if (var40 != null) { // L: 6492
						for (var7 = 0; var7 < var40.itemIds.length; ++var7) { // L: 6493
							var40.itemIds[var7] = 0; // L: 6494
							var40.itemQuantities[var7] = 0; // L: 6495
						}
					}

					Language.clearItemContainer(var5); // L: 6498
					var7 = var3.readUnsignedShort(); // L: 6499

					for (var19 = 0; var19 < var7; ++var19) { // L: 6500
						var9 = var3.method5539(); // L: 6501
						var21 = var3.method5572(); // L: 6502
						if (var21 == 255) { // L: 6503
							var21 = var3.method5591();
						}

						if (var40 != null && var19 < var40.itemIds.length) { // L: 6504 6505
							var40.itemIds[var19] = var9; // L: 6506
							var40.itemQuantities[var19] = var21; // L: 6507
						}

						GrandExchangeOfferNameComparator.itemContainerSetItem(var5, var19, var9 - 1, var21); // L: 6510
					}

					if (var40 != null) { // L: 6512
						CollisionMap.invalidateWidget(var40);
					}

					class195.method3681(); // L: 6513
					changedItemContainers[++field837 - 1 & 31] = var5 & 32767; // L: 6514
					var1.serverPacket = null; // L: 6515
					return true; // L: 6516
				}

				if (ServerPacket.field2200 == var1.serverPacket) { // L: 6518
					class195.method3681(); // L: 6519
					weight = var3.readShort(); // L: 6520
					field845 = cycleCntr; // L: 6521
					var1.serverPacket = null; // L: 6522
					return true; // L: 6523
				}

				if (ServerPacket.field2209 == var1.serverPacket) { // L: 6525
					if (var1.serverPacketLength == 0) { // L: 6526
						WorldMapArea.clanChat = null; // L: 6527
					} else {
						if (WorldMapArea.clanChat == null) { // L: 6530
							WorldMapArea.clanChat = new ClanChat(GrandExchangeOfferUnitPriceComparator.loginType, WorldMapIcon_0.client); // L: 6531
						}

						WorldMapArea.clanChat.readUpdate(var3); // L: 6533
					}

					WorldMapLabel.method469(); // L: 6535
					var1.serverPacket = null; // L: 6536
					return true; // L: 6537
				}

				if (ServerPacket.field2213 == var1.serverPacket) { // L: 6539
					UserComparator4.method3465(class194.field2347); // L: 6540
					var1.serverPacket = null; // L: 6541
					return true; // L: 6542
				}

				if (ServerPacket.field2141 == var1.serverPacket) { // L: 6544
					World var37 = new World(); // L: 6545
					var37.host = var3.readStringCp1252NullTerminated(); // L: 6546
					var37.id = var3.readUnsignedShort(); // L: 6547
					var5 = var3.readInt(); // L: 6548
					var37.properties = var5; // L: 6549
					WorldMapCacheName.updateGameState(45); // L: 6550
					var2.close(); // L: 6551
					var2 = null; // L: 6552
					SecureRandomCallable.changeWorld(var37); // L: 6553
					var1.serverPacket = null; // L: 6554
					return false; // L: 6555
				}

				if (ServerPacket.field2182 == var1.serverPacket) { // L: 6557
					UserComparator4.method3465(class194.field2349); // L: 6558
					var1.serverPacket = null; // L: 6559
					return true; // L: 6560
				}

				if (ServerPacket.field2202 == var1.serverPacket) { // L: 6562
					ItemContainer.loadRegions(true, var1.packetBuffer); // L: 6563
					var1.serverPacket = null; // L: 6564
					return true; // L: 6565
				}

				if (ServerPacket.field2158 == var1.serverPacket) { // L: 6567
					var16 = var3.method5582(); // L: 6568
					Actor.method1819(var16); // L: 6569
					changedItemContainers[++field837 - 1 & 31] = var16 & 32767; // L: 6570
					var1.serverPacket = null; // L: 6571
					return true; // L: 6572
				}

				if (ServerPacket.field2220 == var1.serverPacket) { // L: 6574
					privateChatMode = class52.method840(var3.readUnsignedByte()); // L: 6575
					var1.serverPacket = null; // L: 6576
					return true; // L: 6577
				}

				if (ServerPacket.field2208 == var1.serverPacket) { // L: 6579
					PacketWriter.field1331 = var3.method5571(); // L: 6580
					class248.field3222 = var3.method5573(); // L: 6581
					var1.serverPacket = null; // L: 6582
					return true; // L: 6583
				}

				if (ServerPacket.field2195 == var1.serverPacket) { // L: 6585
					var50 = var3.readUnsignedByte() == 1; // L: 6586
					if (var50) { // L: 6587
						class4.field17 = class298.currentTimeMillis() - var3.readLong(); // L: 6588
						AbstractUserComparator.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 6589
					} else {
						AbstractUserComparator.grandExchangeEvents = null; // L: 6591
					}

					field680 = cycleCntr; // L: 6592
					var1.serverPacket = null; // L: 6593
					return true; // L: 6594
				}

				if (ServerPacket.field2155 == var1.serverPacket) { // L: 6596
					var16 = var3.method5592(); // L: 6597
					var5 = var3.method5643(); // L: 6598
					InterfaceParent var6 = (InterfaceParent)interfaceParents.get((long)var16); // L: 6599
					var20 = (InterfaceParent)interfaceParents.get((long)var5); // L: 6600
					if (var20 != null) { // L: 6601
						MouseRecorder.closeInterface(var20, var6 == null || var20.group != var6.group);
					}

					if (var6 != null) { // L: 6602
						var6.remove(); // L: 6603
						interfaceParents.put(var6, (long)var5); // L: 6604
					}

					var8 = CollisionMap.getWidget(var16); // L: 6606
					if (var8 != null) { // L: 6607
						CollisionMap.invalidateWidget(var8);
					}

					var8 = CollisionMap.getWidget(var5); // L: 6608
					if (var8 != null) { // L: 6609
						CollisionMap.invalidateWidget(var8); // L: 6610
						PendingSpawn.revalidateWidgetScroll(class9.Widget_interfaceComponents[var8.id >>> 16], var8, true); // L: 6611
					}

					if (rootInterface != -1) { // L: 6613
						WorldMapRectangle.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 6614
					return true; // L: 6615
				}

				if (ServerPacket.field2146 == var1.serverPacket) { // L: 6617
					var16 = var3.readInt(); // L: 6618
					if (var16 != field730) { // L: 6619
						field730 = var16; // L: 6620
						WorldMapCacheName.method664(); // L: 6621
					}

					var1.serverPacket = null; // L: 6623
					return true; // L: 6624
				}

				if (ServerPacket.field2156 == var1.serverPacket) { // L: 6626
					UserComparator4.method3465(class194.field2346); // L: 6627
					var1.serverPacket = null; // L: 6628
					return true; // L: 6629
				}

				PlayerComposition.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id * 1148115103 * -61586593 : -1) + "," + (var1.field1336 != null ? var1.field1336.id * 1148115103 * -61586593 : -1) + "," + (var1.field1337 != null ? var1.field1337.id * 1148115103 * -61586593 : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 6631
				WorldMapRectangle.logOut(); // L: 6632
			} catch (IOException var35) { // L: 6634
				LoginScreenAnimation.method1903(); // L: 6635
			} catch (Exception var36) {
				var17 = "" + (var1.serverPacket != null ? var1.serverPacket.id * 1148115103 * -61586593 : -1) + "," + (var1.field1336 != null ? var1.field1336.id * 1148115103 * -61586593 : -1) + "," + (var1.field1337 != null ? var1.field1337.id * 1148115103 * -61586593 : -1) + "," + var1.serverPacketLength + "," + (PlayerComposition.localPlayer.pathX[0] + NetFileRequest.baseX) + "," + (PlayerComposition.localPlayer.pathY[0] + class41.baseY) + ","; // L: 6638

				for (var18 = 0; var18 < var1.serverPacketLength && var18 < 50; ++var18) { // L: 6639
					var17 = var17 + var3.array[var18] + ",";
				}

				PlayerComposition.RunException_sendStackTrace(var17, var36); // L: 6640
				WorldMapRectangle.logOut(); // L: 6641
			}

			return true; // L: 6643
		}
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "33"
	)
	@Export("menu")
	final void menu() {
		VertexNormal.method3068(); // L: 7348
		if (class171.dragInventoryWidget == null) { // L: 7349
			if (clickedWidget == null) { // L: 7350
				int var1 = MouseHandler.MouseHandler_lastButton; // L: 7351
				int var2;
				int var3;
				int var4;
				int var5;
				int var7;
				int var8;
				if (isMenuOpen) { // L: 7352
					if (var1 != 1 && (UserComparator9.mouseCam || var1 != 4)) { // L: 7353
						var2 = MouseHandler.MouseHandler_x; // L: 7354
						var3 = MouseHandler.MouseHandler_y; // L: 7355
						if (var2 < AbstractUserComparator.menuX - 10 || var2 > AbstractUserComparator.menuX + Occluder.menuWidth + 10 || var3 < DynamicObject.menuY - 10 || var3 > class182.menuHeight + DynamicObject.menuY + 10) { // L: 7356
							isMenuOpen = false; // L: 7357
							Frames.method3352(AbstractUserComparator.menuX, DynamicObject.menuY, Occluder.menuWidth, class182.menuHeight); // L: 7358
						}
					}

					if (var1 == 1 || !UserComparator9.mouseCam && var1 == 4) { // L: 7361
						var2 = AbstractUserComparator.menuX; // L: 7362
						var3 = DynamicObject.menuY; // L: 7363
						var4 = Occluder.menuWidth; // L: 7364
						var5 = MouseHandler.MouseHandler_lastPressedX; // L: 7365
						int var10 = MouseHandler.MouseHandler_lastPressedY; // L: 7366
						var7 = -1; // L: 7367

						for (var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 7368
							int var9 = (menuOptionsCount - 1 - var8) * 15 + var3 + 31; // L: 7369
							if (var5 > var2 && var5 < var4 + var2 && var10 > var9 - 13 && var10 < var9 + 3) { // L: 7370
								var7 = var8;
							}
						}

						if (var7 != -1) { // L: 7372
							FontName.method5356(var7);
						}

						isMenuOpen = false; // L: 7373
						Frames.method3352(AbstractUserComparator.menuX, DynamicObject.menuY, Occluder.menuWidth, class182.menuHeight); // L: 7374
					}
				} else {
					var2 = WorldMapSprite.method463(); // L: 7378
					if ((var1 == 1 || !UserComparator9.mouseCam && var1 == 4) && var2 >= 0) { // L: 7379
						var3 = menuOpcodes[var2]; // L: 7380
						if (var3 == 39 || var3 == 40 || var3 == 41 || var3 == 42 || var3 == 43 || var3 == 33 || var3 == 34 || var3 == 35 || var3 == 36 || var3 == 37 || var3 == 38 || var3 == 1005) { // L: 7381
							var4 = menuArguments1[var2]; // L: 7382
							var5 = menuArguments2[var2]; // L: 7383
							Widget var6 = CollisionMap.getWidget(var5); // L: 7384
							if (WorldMapSection2.method378(FaceNormal.getWidgetFlags(var6)) || BoundaryObject.method3341(FaceNormal.getWidgetFlags(var6))) { // L: 7385
								if (class171.dragInventoryWidget != null && !field848 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) { // L: 7386 7387
									var7 = draggedWidgetX; // L: 7388
									var8 = draggedWidgetY; // L: 7389
									WorldMapDecoration.method379(WorldMapSection1.tempMenuAction, var7, var8); // L: 7391
									WorldMapSection1.tempMenuAction = null; // L: 7392
								}

								field848 = false; // L: 7396
								itemDragDuration = 0; // L: 7397
								if (class171.dragInventoryWidget != null) { // L: 7398
									CollisionMap.invalidateWidget(class171.dragInventoryWidget);
								}

								class171.dragInventoryWidget = CollisionMap.getWidget(var5); // L: 7399
								dragItemSlotSource = var4; // L: 7400
								draggedWidgetX = MouseHandler.MouseHandler_lastPressedX; // L: 7401
								draggedWidgetY = MouseHandler.MouseHandler_lastPressedY; // L: 7402
								if (var2 >= 0) { // L: 7403
									WorldMapSection1.tempMenuAction = new MenuAction(); // L: 7404
									WorldMapSection1.tempMenuAction.param0 = menuArguments1[var2]; // L: 7405
									WorldMapSection1.tempMenuAction.param1 = menuArguments2[var2]; // L: 7406
									WorldMapSection1.tempMenuAction.opcode = menuOpcodes[var2]; // L: 7407
									WorldMapSection1.tempMenuAction.identifier = menuIdentifiers[var2]; // L: 7408
									WorldMapSection1.tempMenuAction.action = menuActions[var2]; // L: 7409
								}

								CollisionMap.invalidateWidget(class171.dragInventoryWidget); // L: 7411
								return; // L: 7412
							}
						}
					}

					if ((var1 == 1 || !UserComparator9.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) { // L: 7416 7417
						var1 = 2; // L: 7418
					}

					if ((var1 == 1 || !UserComparator9.mouseCam && var1 == 4) && menuOptionsCount > 0) { // L: 7421
						FontName.method5356(var2); // L: 7422
					}

					if (var1 == 2 && menuOptionsCount > 0) { // L: 7424
						this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}
				}

			}
		}
	} // L: 7426

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-745678378"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = WorldMapSprite.method463(); // L: 7429
		return (leftClickOpensMenu == 1 && menuOptionsCount > 2 || Players.method2225(var1)) && !menuShiftClick[var1]; // L: 7430
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2086272336"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		BuddyRankComparator.method3522(var1, var2); // L: 7434
		ArchiveLoader.scene.menuOpen(GameObject.Client_plane, var1, var2, false); // L: 7435
		isMenuOpen = true; // L: 7436
	} // L: 7437

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-6"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		WorldMapManager.method686(rootInterface, IgnoreList.canvasWidth, ModelData0.canvasHeight, var1); // L: 9447
	} // L: 9448

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(Lhe;I)V",
		garbageValue = "1858163346"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : CollisionMap.getWidget(var1.parentId); // L: 9451
		int var3;
		int var4;
		if (var2 == null) { // L: 9454
			var3 = IgnoreList.canvasWidth; // L: 9455
			var4 = ModelData0.canvasHeight; // L: 9456
		} else {
			var3 = var2.width; // L: 9459
			var4 = var2.height; // L: 9460
		}

		TileItem.alignWidgetSize(var1, var3, var4, false); // L: 9462
		class7.alignWidgetPosition(var1, var3, var4); // L: 9463
	} // L: 9464

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "829781970"
	)
	final void method1381() {
		CollisionMap.invalidateWidget(clickedWidget); // L: 10426
		++ScriptFrame.widgetDragDuration; // L: 10427
		if (field829 && field859) { // L: 10428
			int var1 = MouseHandler.MouseHandler_x; // L: 10434
			int var2 = MouseHandler.MouseHandler_y; // L: 10435
			var1 -= widgetClickX; // L: 10436
			var2 -= widgetClickY; // L: 10437
			if (var1 < field827) { // L: 10438
				var1 = field827;
			}

			if (var1 + clickedWidget.width > field827 + clickedWidgetParent.width) { // L: 10439
				var1 = field827 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field716) { // L: 10440
				var2 = field716;
			}

			if (var2 + clickedWidget.height > field716 + clickedWidgetParent.height) { // L: 10441
				var2 = field716 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field853; // L: 10442
			int var4 = var2 - field862; // L: 10443
			int var5 = clickedWidget.dragZoneSize; // L: 10444
			if (ScriptFrame.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 10445 10446
				isDraggingWidget = true; // L: 10447
			}

			int var6 = var1 - field827 + clickedWidgetParent.scrollX; // L: 10450
			int var7 = var2 - field716 + clickedWidgetParent.scrollY; // L: 10451
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 10452
				var8 = new ScriptEvent(); // L: 10453
				var8.widget = clickedWidget; // L: 10454
				var8.mouseX = var6; // L: 10455
				var8.mouseY = var7; // L: 10456
				var8.args = clickedWidget.onDrag; // L: 10457
				class22.runScriptEvent(var8); // L: 10458
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 10460
				if (isDraggingWidget) { // L: 10461
					if (clickedWidget.onDragComplete != null) { // L: 10462
						var8 = new ScriptEvent(); // L: 10463
						var8.widget = clickedWidget; // L: 10464
						var8.mouseX = var6; // L: 10465
						var8.mouseY = var7; // L: 10466
						var8.dragTarget = draggedOnWidget; // L: 10467
						var8.args = clickedWidget.onDragComplete; // L: 10468
						class22.runScriptEvent(var8); // L: 10469
					}

					if (draggedOnWidget != null) { // L: 10471
						Widget var15 = clickedWidget; // L: 10473
						int var11 = FaceNormal.getWidgetFlags(var15); // L: 10476
						int var10 = var11 >> 17 & 7; // L: 10478
						int var12 = var10; // L: 10480
						Widget var17;
						if (var10 == 0) { // L: 10481
							var17 = null; // L: 10482
						} else {
							int var13 = 0;

							while (true) {
								if (var13 >= var12) {
									var17 = var15; // L: 10492
									break;
								}

								var15 = CollisionMap.getWidget(var15.parentId); // L: 10486
								if (var15 == null) { // L: 10487
									var17 = null; // L: 10488
									break; // L: 10489
								}

								++var13; // L: 10485
							}
						}

						if (var17 != null) { // L: 10494
							PacketBufferNode var16 = ItemContainer.getPacketBufferNode(ClientPacket.field2298, packetWriter.isaacCipher); // L: 10496
							var16.packetBuffer.method5578(draggedOnWidget.itemId); // L: 10497
							var16.packetBuffer.method5739(clickedWidget.itemId); // L: 10498
							var16.packetBuffer.method5718(clickedWidget.id); // L: 10499
							var16.packetBuffer.writeShort(clickedWidget.childIndex); // L: 10500
							var16.packetBuffer.method5739(draggedOnWidget.childIndex); // L: 10501
							var16.packetBuffer.method5588(draggedOnWidget.id); // L: 10502
							packetWriter.addNode(var16); // L: 10503
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 10508
					this.openMenu(widgetClickX + field853, widgetClickY + field862); // L: 10509
				} else if (menuOptionsCount > 0) { // L: 10511
					int var14 = field853 + widgetClickX; // L: 10512
					int var9 = widgetClickY + field862; // L: 10513
					WorldMapDecoration.method379(WorldMapSection1.tempMenuAction, var14, var9); // L: 10515
					WorldMapSection1.tempMenuAction = null; // L: 10516
				}

				clickedWidget = null; // L: 10520
			}

		} else {
			if (ScriptFrame.widgetDragDuration > 1) { // L: 10429
				clickedWidget = null; // L: 10430
			}

		}
	} // L: 10432 10522

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(I)Lki;",
		garbageValue = "82536799"
	)
	@Export("username")
	public Username username() {
		return PlayerComposition.localPlayer != null ? PlayerComposition.localPlayer.username : null; // L: 11178
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1868992104"
	)
	public static void method1583() {
		if (NetCache.NetCache_socket != null) { // L: 95
			NetCache.NetCache_socket.close();
		}

	} // L: 96

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-256549050"
	)
	static void method1799() {
		if (Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 239
			Login.currentLoginField = 1; // L: 240
		} else {
			Login.currentLoginField = 0; // L: 243
		}

	} // L: 245
}
