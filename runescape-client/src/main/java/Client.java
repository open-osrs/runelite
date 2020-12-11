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
	static int field835;
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
	static PlayerAppearance playerAppearance;
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
	static Sprite[] mapIcons;
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
	static int[] field834;
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
		longValue = -2825275797086768431L
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
		intValue = 1167284940
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -1763909312
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -1394707008
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
	static Sprite[] headIconPrayerSprites;
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
		intValue = 58718588
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
		field907 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		clientType = -1;
		field651 = -1;
		onMobile = false;
		gameState = 0;
		isLoading = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = 1L;
		field657 = -1;
		field658 = -1;
		field794 = -1L;
		hadFocus = true;
		displayFps = false;
		rebootTimer = 0;
		hintArrowType = 0;
		hintArrowNpcIndex = 0;
		hintArrowPlayerIndex = 0;
		hintArrowX = 0;
		hintArrowY = 0;
		hintArrowHeight = 0;
		hintArrowSubX = 0;
		hintArrowSubY = 0;
		playerAttackOption = AttackOption.AttackOption_hidden;
		npcAttackOption = AttackOption.AttackOption_hidden;
		titleLoadingStage = 0;
		js5ConnectState = 0;
		field864 = 0;
		js5Errors = 0;
		loginState = 0;
		field892 = 0;
		field681 = 0;
		field682 = 0;
		field872 = class169.field2021;
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC[32768];
		npcCount = 0;
		npcIndices = new int[32768];
		field826 = 0;
		field654 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		field696 = false;
		useBufferedSocket = true;
		timer = new Timer();
		fontsMap = new HashMap();
		field700 = 0;
		field701 = 1;
		field702 = 0;
		field703 = 1;
		field704 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field708 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field850 = 0;
		field711 = 2301979;
		field712 = 5063219;
		field713 = 3353893;
		field714 = 7759444;
		field692 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field755 = 0;
		field761 = 0;
		field788 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		field730 = 0;
		field649 = false;
		field732 = 0;
		field843 = false;
		field918 = 0;
		overheadTextCount = 0;
		overheadTextLimit = 50;
		overheadTextXs = new int[overheadTextLimit];
		overheadTextYs = new int[overheadTextLimit];
		overheadTextAscents = new int[overheadTextLimit];
		overheadTextXOffsets = new int[overheadTextLimit];
		overheadTextColors = new int[overheadTextLimit];
		overheadTextEffects = new int[overheadTextLimit];
		overheadTextCyclesRemaining = new int[overheadTextLimit];
		overheadText = new String[overheadTextLimit];
		tileLastDrawnActor = new int[104][104];
		viewportDrawCount = 0;
		viewportTempX = -1;
		viewportTempY = -1;
		mouseCrossX = 0;
		mouseCrossY = 0;
		mouseCrossState = 0;
		mouseCrossColor = 0;
		showMouseCross = true;
		field754 = 0;
		field881 = 0;
		dragItemSlotSource = 0;
		draggedWidgetX = 0;
		draggedWidgetY = 0;
		dragItemSlotDestination = 0;
		field848 = false;
		itemDragDuration = 0;
		field762 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		field766 = 0;
		renderSelf = true;
		drawPlayerNames = 0;
		field769 = 0;
		field770 = new int[1000];
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerMenuActions = new String[8];
		playerOptionsPriorities = new boolean[8];
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		combatTargetPlayerIndex = -1;
		groundItems = new NodeDeque[4][104][104];
		pendingSpawns = new NodeDeque();
		projectiles = new NodeDeque();
		graphicsObjects = new NodeDeque();
		currentLevels = new int[25];
		levels = new int[25];
		experience = new int[25];
		leftClickOpensMenu = 0;
		isMenuOpen = false;
		menuOptionsCount = 0;
		menuArguments1 = new int[500];
		menuArguments2 = new int[500];
		menuOpcodes = new int[500];
		menuIdentifiers = new int[500];
		menuActions = new String[500];
		menuTargets = new String[500];
		menuShiftClick = new boolean[500];
		followerOpsLowPriority = false;
		shiftClickDrop = false;
		tapToDrop = false;
		showMouseOverText = true;
		viewportX = -1;
		viewportY = -1;
		field799 = 0;
		field751 = 50;
		isItemSelected = 0;
		selectedItemName = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		field836 = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field810 = 0;
		field811 = -1;
		chatEffects = 0;
		field865 = 0;
		meslayerContinueWidget = null;
		runEnergy = 0;
		weight = 0;
		staffModLevel = 0;
		followerIndex = -1;
		playerMod = false;
		viewportWidget = null;
		clickedWidget = null;
		clickedWidgetParent = null;
		widgetClickX = 0;
		widgetClickY = 0;
		draggedOnWidget = null;
		field859 = false;
		field827 = -1;
		field716 = -1;
		field829 = false;
		field853 = -1;
		field862 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		field834 = new int[32];
		field835 = 0;
		changedItemContainers = new int[32];
		field837 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		chatCycle = 0;
		field879 = 0;
		field842 = 0;
		field685 = 0;
		field680 = 0;
		field845 = 0;
		mouseWheelRotation = 0;
		scriptEvents = new NodeDeque();
		field715 = new NodeDeque();
		field849 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field852 = -2;
		field901 = new boolean[100];
		field854 = new boolean[100];
		field855 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field861 = 0L;
		isResizable = true;
		field863 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field871 = "";
		field868 = new long[100];
		field707 = 0;
		field870 = 0;
		field661 = new int[128];
		field693 = new int[128];
		field817 = -1L;
		field874 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new Sprite[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		currentTrackGroupId = -1;
		field883 = false;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field902 = new boolean[5];
		field679 = new int[5];
		field893 = new int[5];
		field705 = new int[5];
		field644 = new int[5];
		field896 = 256;
		field897 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field900 = 1;
		field731 = 32767;
		field828 = 1;
		field903 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerAppearance();
		field813 = -1;
		field911 = -1;
		platformInfoProvider = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field915 = -1;
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field666 = 0;
		field919 = new ApproximateRouteStrategy();
		field920 = new int[50];
		field921 = new int[50];
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "312942940"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field861 = class298.currentTimeMillis() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.resizeRoot(true);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-91"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000};
		int[] var2 = new int[]{1000, 100, 500};
		if (var1 != null && var2 != null) {
			SoundCache.ByteArrayPool_alternativeSizes = var1;
			JagexCache.ByteArrayPool_altSizeArrayCounts = new int[var1.length];
			class23.ByteArrayPool_arrays = new byte[var1.length][][];

			for (int var3 = 0; var3 < SoundCache.ByteArrayPool_alternativeSizes.length; ++var3) {
				class23.ByteArrayPool_arrays[var3] = new byte[var2[var3]][];
			}
		} else {
			SoundCache.ByteArrayPool_alternativeSizes = null;
			JagexCache.ByteArrayPool_altSizeArrayCounts = null;
			class23.ByteArrayPool_arrays = null;
		}

		class278.port1 = gameBuild == 0 ? 43594 : worldId + 40000;
		Players.port2 = gameBuild == 0 ? 443 : worldId + 50000;
		ArchiveDiskAction.port3 = class278.port1;
		PlayerAppearance.field2551 = class224.field2569;
		WorldMapScaleHandler.field366 = class224.field2565;
		PlayerAppearance.field2557 = class224.field2566;
		WorldMapCacheName.field331 = class224.field2567;
		GrandExchangeOfferAgeComparator.urlRequester = new UrlRequester();
		this.setUpKeyboard();
		this.setUpMouse();
		KitDefinition.mouseWheel = this.mouseWheel();
		class7.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		AccessFile var4 = null;
		ClientPreferences var5 = new ClientPreferences();

		try {
			var4 = WorldMapRegion.getPreferencesFile("", AttackOption.field1174.name, false);
			byte[] var6 = new byte[(int)var4.length()];

			int var8;
			for (int var7 = 0; var7 < var6.length; var7 += var8) {
				var8 = var4.read(var6, var7, var6.length - var7);
				if (var8 == -1) {
					throw new IOException();
				}
			}

			var5 = new ClientPreferences(new Buffer(var6));
		} catch (Exception var11) {
		}

		try {
			if (var4 != null) {
				var4.close();
			}
		} catch (Exception var10) {
		}

		Timer.clientPreferences = var5;
		this.setUpClipboard();
		String var12 = Message.null_string;
		class60.applet = this;
		if (var12 != null) {
			class60.field439 = var12;
		}

		if (gameBuild != 0) {
			displayFps = true;
		}

		class13.setWindowedMode(Timer.clientPreferences.windowMode);
		MilliClock.friendSystem = new FriendSystem(GrandExchangeOfferUnitPriceComparator.loginType);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1376035132"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();
		WorldMapEvent.method809();
		UrlRequester.method3381();
		FontName.playPcmPlayers();
		GraphicsObject.method2090();
		class4.method53();
		if (KitDefinition.mouseWheel != null) {
			int var1 = KitDefinition.mouseWheel.useRotation();
			mouseWheelRotation = var1;
		}

		if (gameState == 0) {
			Canvas.load();
			GrandExchangeEvent.method153();
		} else if (gameState == 5) {
			SequenceDefinition.doCycleTitle(this);
			Canvas.load();
			GrandExchangeEvent.method153();
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				SequenceDefinition.doCycleTitle(this);
				this.doCycleLoggedOut();
			} else if (gameState == 25) {
				WorldMapSection2.method377(false);
				field700 = 0;
				boolean var43 = true;

				int var2;
				for (var2 = 0; var2 < WorldMapIcon_0.regionLandArchives.length; ++var2) {
					if (class41.regionMapArchiveIds[var2] != -1 && WorldMapIcon_0.regionLandArchives[var2] == null) {
						WorldMapIcon_0.regionLandArchives[var2] = GameShell.archive5.takeFile(class41.regionMapArchiveIds[var2], 0);
						if (WorldMapIcon_0.regionLandArchives[var2] == null) {
							var43 = false;
							++field700;
						}
					}

					if (GrandExchangeOfferTotalQuantityComparator.regionLandArchiveIds[var2] != -1 && MouseRecorder.regionMapArchives[var2] == null) {
						MouseRecorder.regionMapArchives[var2] = GameShell.archive5.takeFileEncrypted(GrandExchangeOfferTotalQuantityComparator.regionLandArchiveIds[var2], 0, class227.xteaKeys[var2]);
						if (MouseRecorder.regionMapArchives[var2] == null) {
							var43 = false;
							++field700;
						}
					}
				}

				if (!var43) {
					field704 = 1;
				} else {
					field702 = 0;
					var43 = true;

					int var4;
					int var5;
					int var10;
					int var11;
					int var12;
					int var14;
					int var15;
					int var16;
					int var17;
					for (var2 = 0; var2 < WorldMapIcon_0.regionLandArchives.length; ++var2) {
						byte[] var3 = MouseRecorder.regionMapArchives[var2];
						if (var3 != null) {
							var4 = (FileSystem.regions[var2] >> 8) * 64 - NetFileRequest.baseX * 64;
							var5 = (FileSystem.regions[var2] & 255) * 64 - class41.baseY * 64;
							if (isInInstance) {
								var4 = 10;
								var5 = 10;
							}

							boolean var8 = true;
							Buffer var40 = new Buffer(var3);
							var10 = -1;

							label565:
							while (true) {
								var11 = var40.method5557();
								if (var11 == 0) {
									var43 &= var8;
									break;
								}

								var10 += var11;
								var12 = 0;
								boolean var38 = false;

								while (true) {
									while (!var38) {
										var14 = var40.readUShortSmart();
										if (var14 == 0) {
											continue label565;
										}

										var12 += var14 - 1;
										var15 = var12 & 63;
										var16 = var12 >> 6 & 63;
										var17 = var40.readUnsignedByte() >> 2;
										int var41 = var4 + var16;
										int var42 = var5 + var15;
										if (var41 > 0 && var42 > 0 && var41 < 103 && var42 < 103) {
											ObjectDefinition var20 = WorldMapDecoration.getObjectDefinition(var10);
											if (var17 != 22 || !isLowDetail || var20.int1 != 0 || var20.interactType == 1 || var20.boolean2) {
												if (!var20.needsModelFiles()) {
													++field702;
													var8 = false;
												}

												var38 = true;
											}
										}
									}

									var14 = var40.readUShortSmart();
									if (var14 == 0) {
										break;
									}

									var40.readUnsignedByte();
								}
							}
						}
					}

					if (!var43) {
						field704 = 2;
					} else {
						if (field704 != 0) {
							Varps.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
						}

						FontName.playPcmPlayers();
						ArchiveLoader.scene.clear();

						for (var2 = 0; var2 < 4; ++var2) {
							collisionMaps[var2].clear();
						}

						int var36;
						for (var2 = 0; var2 < 4; ++var2) {
							for (var36 = 0; var36 < 104; ++var36) {
								for (var4 = 0; var4 < 104; ++var4) {
									Tiles.Tiles_renderFlags[var2][var36][var4] = 0;
								}
							}
						}

						FontName.playPcmPlayers();
						DirectByteArrayCopier.method3983();
						var2 = WorldMapIcon_0.regionLandArchives.length;

						for (ObjectSound var44 = (ObjectSound)ObjectSound.objectSounds.last(); var44 != null; var44 = (ObjectSound)ObjectSound.objectSounds.previous()) {
							if (var44.stream1 != null) {
								WorldMapManager.pcmStreamMixer.removeSubStream(var44.stream1);
								var44.stream1 = null;
							}

							if (var44.stream2 != null) {
								WorldMapManager.pcmStreamMixer.removeSubStream(var44.stream2);
								var44.stream2 = null;
							}
						}

						ObjectSound.objectSounds.clear();
						WorldMapSection2.method377(true);
						int var6;
						if (!isInInstance) {
							byte[] var39;
							for (var36 = 0; var36 < var2; ++var36) {
								var4 = (FileSystem.regions[var36] >> 8) * 64 - NetFileRequest.baseX * 64;
								var5 = (FileSystem.regions[var36] & 255) * 64 - class41.baseY * 64;
								var39 = WorldMapIcon_0.regionLandArchives[var36];
								if (var39 != null) {
									FontName.playPcmPlayers();
									class69.method1252(var39, var4, var5, class182.field2112 * 8 - 48, UserComparator6.field2013 * 8 - 48, collisionMaps);
								}
							}

							for (var36 = 0; var36 < var2; ++var36) {
								var4 = (FileSystem.regions[var36] >> 8) * 64 - NetFileRequest.baseX * 64;
								var5 = (FileSystem.regions[var36] & 255) * 64 - class41.baseY * 64;
								var39 = WorldMapIcon_0.regionLandArchives[var36];
								if (var39 == null && UserComparator6.field2013 < 800) {
									FontName.playPcmPlayers();
									class39.method594(var4, var5, 64, 64);
								}
							}

							WorldMapSection2.method377(true);

							for (var36 = 0; var36 < var2; ++var36) {
								byte[] var37 = MouseRecorder.regionMapArchives[var36];
								if (var37 != null) {
									var5 = (FileSystem.regions[var36] >> 8) * 64 - NetFileRequest.baseX * 64;
									var6 = (FileSystem.regions[var36] & 255) * 64 - class41.baseY * 64;
									FontName.playPcmPlayers();
									class169.method3533(var37, var5, var6, ArchiveLoader.scene, collisionMaps);
								}
							}
						}

						int var7;
						int var9;
						int var46;
						if (isInInstance) {
							var36 = 0;

							label477:
							while (true) {
								if (var36 >= 4) {
									for (var36 = 0; var36 < 13; ++var36) {
										for (var4 = 0; var4 < 13; ++var4) {
											var5 = instanceChunkTemplates[0][var36][var4];
											if (var5 == -1) {
												class39.method594(var36 * 8, var4 * 8, 8, 8);
											}
										}
									}

									WorldMapSection2.method377(true);
									var36 = 0;

									while (true) {
										if (var36 >= 4) {
											break label477;
										}

										FontName.playPcmPlayers();

										for (var4 = 0; var4 < 13; ++var4) {
											label434:
											for (var5 = 0; var5 < 13; ++var5) {
												var6 = instanceChunkTemplates[var36][var4][var5];
												if (var6 != -1) {
													var7 = var6 >> 24 & 3;
													var46 = var6 >> 1 & 3;
													var9 = var6 >> 14 & 1023;
													var10 = var6 >> 3 & 2047;
													var11 = (var9 / 8 << 8) + var10 / 8;

													for (var12 = 0; var12 < FileSystem.regions.length; ++var12) {
														if (FileSystem.regions[var12] == var11 && MouseRecorder.regionMapArchives[var12] != null) {
															byte[] var13 = MouseRecorder.regionMapArchives[var12];
															var14 = var4 * 8;
															var15 = var5 * 8;
															var16 = (var9 & 7) * 8;
															var17 = (var10 & 7) * 8;
															Scene var18 = ArchiveLoader.scene;
															CollisionMap[] var19 = collisionMaps;
															Buffer var47 = new Buffer(var13);
															int var21 = -1;

															while (true) {
																int var22 = var47.method5557();
																if (var22 == 0) {
																	continue label434;
																}

																var21 += var22;
																int var23 = 0;

																while (true) {
																	int var24 = var47.readUShortSmart();
																	if (var24 == 0) {
																		break;
																	}

																	var23 += var24 - 1;
																	int var25 = var23 & 63;
																	int var26 = var23 >> 6 & 63;
																	int var27 = var23 >> 12;
																	int var28 = var47.readUnsignedByte();
																	int var29 = var28 >> 2;
																	int var30 = var28 & 3;
																	if (var27 == var7 && var26 >= var16 && var26 < var16 + 8 && var25 >= var17 && var25 < var17 + 8) {
																		ObjectDefinition var31 = WorldMapDecoration.getObjectDefinition(var21);
																		int var32 = var14 + HitSplatDefinition.method4612(var26 & 7, var25 & 7, var46, var31.sizeX, var31.sizeY, var30);
																		int var33 = var15 + World.method1871(var26 & 7, var25 & 7, var46, var31.sizeX, var31.sizeY, var30);
																		if (var32 > 0 && var33 > 0 && var32 < 103 && var33 < 103) {
																			int var34 = var36;
																			if ((Tiles.Tiles_renderFlags[1][var32][var33] & 2) == 2) {
																				var34 = var36 - 1;
																			}

																			CollisionMap var35 = null;
																			if (var34 >= 0) {
																				var35 = var19[var34];
																			}

																			class7.method90(var36, var32, var33, var21, var30 + var46 & 3, var29, var18, var35);
																		}
																	}
																}
															}
														}
													}
												}
											}
										}

										++var36;
									}
								}

								FontName.playPcmPlayers();

								for (var4 = 0; var4 < 13; ++var4) {
									for (var5 = 0; var5 < 13; ++var5) {
										boolean var45 = false;
										var7 = instanceChunkTemplates[var36][var4][var5];
										if (var7 != -1) {
											var46 = var7 >> 24 & 3;
											var9 = var7 >> 1 & 3;
											var10 = var7 >> 14 & 1023;
											var11 = var7 >> 3 & 2047;
											var12 = (var10 / 8 << 8) + var11 / 8;

											for (int var50 = 0; var50 < FileSystem.regions.length; ++var50) {
												if (FileSystem.regions[var50] == var12 && WorldMapIcon_0.regionLandArchives[var50] != null) {
													WorldMapDecoration.method381(WorldMapIcon_0.regionLandArchives[var50], var36, var4 * 8, var5 * 8, var46, (var10 & 7) * 8, (var11 & 7) * 8, var9, collisionMaps);
													var45 = true;
													break;
												}
											}
										}

										if (!var45) {
											ReflectionCheck.method2350(var36, var4 * 8, var5 * 8);
										}
									}
								}

								++var36;
							}
						}

						WorldMapSection2.method377(true);
						FontName.playPcmPlayers();
						LoginPacket.method3673(ArchiveLoader.scene, collisionMaps);
						WorldMapSection2.method377(true);
						var36 = Tiles.Tiles_minPlane;
						if (var36 > GameObject.Client_plane) {
							var36 = GameObject.Client_plane;
						}

						if (var36 < GameObject.Client_plane - 1) {
							var36 = GameObject.Client_plane - 1;
						}

						if (isLowDetail) {
							ArchiveLoader.scene.init(Tiles.Tiles_minPlane);
						} else {
							ArchiveLoader.scene.init(0);
						}

						for (var4 = 0; var4 < 104; ++var4) {
							for (var5 = 0; var5 < 104; ++var5) {
								MouseRecorder.updateItemPile(var4, var5);
							}
						}

						FontName.playPcmPlayers();

						for (PendingSpawn var48 = (PendingSpawn)pendingSpawns.last(); var48 != null; var48 = (PendingSpawn)pendingSpawns.previous()) {
							if (var48.hitpoints == -1) {
								var48.delay = 0;
								class7.method86(var48);
							} else {
								var48.remove();
							}
						}

						ObjectDefinition.ObjectDefinition_cachedModelData.clear();
						PacketBufferNode var49;
						if (WorldMapIcon_0.client.hasFrame()) {
							var49 = ItemContainer.getPacketBufferNode(ClientPacket.field2299, packetWriter.isaacCipher);
							var49.packetBuffer.writeInt(1057001181);
							packetWriter.addNode(var49);
						}

						if (!isInInstance) {
							var4 = (class182.field2112 - 6) / 8;
							var5 = (class182.field2112 + 6) / 8;
							var6 = (UserComparator6.field2013 - 6) / 8;
							var7 = (UserComparator6.field2013 + 6) / 8;

							for (var46 = var4 - 1; var46 <= var5 + 1; ++var46) {
								for (var9 = var6 - 1; var9 <= var7 + 1; ++var9) {
									if (var46 < var4 || var46 > var5 || var9 < var6 || var9 > var7) {
										GameShell.archive5.loadRegionFromName("m" + var46 + "_" + var9);
										GameShell.archive5.loadRegionFromName("l" + var46 + "_" + var9);
									}
								}
							}
						}

						WorldMapCacheName.updateGameState(30);
						FontName.playPcmPlayers();
						Tiles.field514 = null;
						Tiles.field508 = null;
						class9.field40 = null;
						Username.field3663 = null;
						GrandExchangeOfferWorldComparator.field52 = null;
						Tiles.field511 = null;
						class92.field1173 = null;
						VarbitDefinition.Tiles_hue = null;
						ArchiveDiskActionHandler.Tiles_saturation = null;
						class92.Tiles_lightness = null;
						UserComparator7.Tiles_hueMultiplier = null;
						Varcs.field1283 = null;
						var49 = ItemContainer.getPacketBufferNode(ClientPacket.field2235, packetWriter.isaacCipher);
						packetWriter.addNode(var49);
						class225.clock.mark();

						for (var5 = 0; var5 < 32; ++var5) {
							GameShell.graphicsTickTimes[var5] = 0L;
						}

						for (var5 = 0; var5 < 32; ++var5) {
							GameShell.clientTickTimes[var5] = 0L;
						}

						class8.gameCyclesToDo = 0;
					}
				}
			}
		} else {
			SequenceDefinition.doCycleTitle(this);
		}

		if (gameState == 30) {
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) {
			this.doCycleLoggedOut();
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-20163413"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2 = WorldMapIcon_1.method355();
		if (var2 && field883 && AbstractWorldMapData.pcmPlayer0 != null) {
			AbstractWorldMapData.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && field861 != 0L && class298.currentTimeMillis() > field861) {
			class13.setWindowedMode(SoundSystem.getWindowedMode());
		}

		int var3;
		if (var1) {
			for (var3 = 0; var3 < 100; ++var3) {
				field901[var3] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) {
			ArchiveLoader.drawTitle(GrandExchangeOfferTotalQuantityComparator.fontBold12, class297.fontPlain11, WorldMapLabelSize.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				ArchiveLoader.drawTitle(GrandExchangeOfferTotalQuantityComparator.fontBold12, class297.fontPlain11, WorldMapLabelSize.fontPlain12);
			} else if (gameState == 25) {
				if (field704 == 1) {
					if (field700 > field701) {
						field701 = field700;
					}

					var3 = (field701 * 50 - field700 * 50) / field701;
					Varps.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
				} else if (field704 == 2) {
					if (field702 > field703) {
						field703 = field702;
					}

					var3 = (field703 * 50 - field702 * 50) / field703 + 50;
					Varps.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
				} else {
					Varps.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				Varps.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				Varps.drawLoadingMessage("Please wait...", false);
			}
		} else {
			ArchiveLoader.drawTitle(GrandExchangeOfferTotalQuantityComparator.fontBold12, class297.fontPlain11, WorldMapLabelSize.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var3 = 0; var3 < rootWidgetCount; ++var3) {
				if (field854[var3]) {
					WorldMapIcon_0.rasterProvider.draw(rootWidgetXs[var3], rootWidgetYs[var3], rootWidgetWidths[var3], rootWidgetHeights[var3]);
					field854[var3] = false;
				}
			}
		} else if (gameState > 0) {
			WorldMapIcon_0.rasterProvider.drawFull(0, 0);

			for (var3 = 0; var3 < rootWidgetCount; ++var3) {
				field854[var3] = false;
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-6923156"
	)
	@Export("kill0")
	protected final void kill0() {
		if (Varcs.varcs.hasUnwrittenChanges()) {
			Varcs.varcs.write();
		}

		if (SoundCache.mouseRecorder != null) {
			SoundCache.mouseRecorder.isRunning = false;
		}

		SoundCache.mouseRecorder = null;
		packetWriter.close();
		WorldMapEvent.method807();
		class3.method43();
		KitDefinition.mouseWheel = null;
		if (AbstractWorldMapData.pcmPlayer0 != null) {
			AbstractWorldMapData.pcmPlayer0.shutdown();
		}

		if (FriendLoginUpdate.pcmPlayer1 != null) {
			FriendLoginUpdate.pcmPlayer1.shutdown();
		}

		method1583();
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3178 != 0) {
				ArchiveDiskActionHandler.field3178 = 1;

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
				} catch (InterruptedException var5) {
				}
			}
		}

		if (GrandExchangeOfferAgeComparator.urlRequester != null) {
			GrandExchangeOfferAgeComparator.urlRequester.close();
			GrandExchangeOfferAgeComparator.urlRequester = null;
		}

		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var4 = 0; var4 < MusicPatchPcmStream.idxCount; ++var4) {
				PlayerAppearance.JagexCache_idxFiles[var4].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var6) {
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "96"
	)
	protected final void vmethod1777() {
	}

	public final void init() {
		try {
			if (this.checkHost()) {
				for (int var1 = 0; var1 <= 20; ++var1) {
					String var2 = this.getParameter(Integer.toString(var1));
					if (var2 != null) {
						switch(var1) {
						case 1:
							useBufferedSocket = Integer.parseInt(var2) != 0;
						case 2:
						case 11:
						case 13:
						case 16:
						default:
							break;
						case 3:
							if (var2.equalsIgnoreCase("true")) {
								isMembersWorld = true;
							} else {
								isMembersWorld = false;
							}
							break;
						case 4:
							if (clientType == -1) {
								clientType = Integer.parseInt(var2);
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2);
							break;
						case 6:
							WorldMapScaleHandler.clientLanguage = Language.method3701(Integer.parseInt(var2));
							break;
						case 7:
							class25.field125 = ArchiveLoader.method1225(Integer.parseInt(var2));
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							WorldMapSection1.field317 = var2;
							break;
						case 10:
							StudioGame[] var3 = new StudioGame[]{StudioGame.runescape, StudioGame.stellardawn, StudioGame.game4, StudioGame.game5, StudioGame.game3, StudioGame.oldscape};
							AttackOption.field1174 = (StudioGame)UrlRequester.findEnumerated(var3, Integer.parseInt(var2));
							if (StudioGame.oldscape == AttackOption.field1174) {
								GrandExchangeOfferUnitPriceComparator.loginType = LoginType.oldscape;
							} else {
								GrandExchangeOfferUnitPriceComparator.loginType = LoginType.field4072;
							}
							break;
						case 12:
							worldId = Integer.parseInt(var2);
							break;
						case 14:
							MidiPcmStream.field2455 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							GrandExchangeOfferTotalQuantityComparator.field75 = var2;
						}
					}
				}

				class39.method596();
				WorldMapSprite.worldHost = this.getCodeBase().getHost();
				String var11 = class25.field125.name;
				byte var12 = 0;

				try {
					MusicPatchPcmStream.idxCount = 21;
					JagexCache.cacheGamebuild = var12;

					try {
						WorldMapScaleHandler.field365 = System.getProperty("os.name");
					} catch (Exception var18) {
						WorldMapScaleHandler.field365 = "Unknown";
					}

					ObjectSound.field1077 = WorldMapScaleHandler.field365.toLowerCase();

					try {
						TileItemPile.userHomeDirectory = System.getProperty("user.home");
						if (TileItemPile.userHomeDirectory != null) {
							TileItemPile.userHomeDirectory = TileItemPile.userHomeDirectory + "/";
						}
					} catch (Exception var17) {
					}

					try {
						if (ObjectSound.field1077.startsWith("win")) {
							if (TileItemPile.userHomeDirectory == null) {
								TileItemPile.userHomeDirectory = System.getenv("USERPROFILE");
							}
						} else if (TileItemPile.userHomeDirectory == null) {
							TileItemPile.userHomeDirectory = System.getenv("HOME");
						}

						if (TileItemPile.userHomeDirectory != null) {
							TileItemPile.userHomeDirectory = TileItemPile.userHomeDirectory + "/";
						}
					} catch (Exception var16) {
					}

					if (TileItemPile.userHomeDirectory == null) {
						TileItemPile.userHomeDirectory = "~/";
					}

					GraphicsObject.field1117 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", TileItemPile.userHomeDirectory, "/tmp/", ""};
					DynamicObject.field1318 = new String[]{".jagex_cache_" + JagexCache.cacheGamebuild, ".file_store_" + JagexCache.cacheGamebuild};

					label144:
					for (int var13 = 0; var13 < 4; ++var13) {
						JagexCache.cacheDir = class58.method917("oldschool", var11, var13);
						if (!JagexCache.cacheDir.exists()) {
							JagexCache.cacheDir.mkdirs();
						}

						File[] var4 = JagexCache.cacheDir.listFiles();
						if (var4 == null) {
							break;
						}

						File[] var5 = var4;
						int var6 = 0;

						while (true) {
							if (var6 >= var5.length) {
								break label144;
							}

							File var7 = var5[var6];

							boolean var8;
							try {
								RandomAccessFile var9 = new RandomAccessFile(var7, "rw");
								int var10 = var9.read();
								var9.seek(0L);
								var9.write(var10);
								var9.seek(0L);
								var9.close();
								var8 = true;
							} catch (Exception var15) {
								var8 = false;
							}

							if (!var8) {
								break;
							}

							++var6;
						}
					}

					File var21 = JagexCache.cacheDir;
					FileSystem.FileSystem_cacheDir = var21;
					if (!FileSystem.FileSystem_cacheDir.exists()) {
						throw new RuntimeException("");
					}

					FileSystem.FileSystem_hasPermissions = true;
					WorldMapData_0.method237();
					JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(ModelData0.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
					JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(ModelData0.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
					PlayerAppearance.JagexCache_idxFiles = new BufferedFile[MusicPatchPcmStream.idxCount];

					for (int var14 = 0; var14 < MusicPatchPcmStream.idxCount; ++var14) {
						PlayerAppearance.JagexCache_idxFiles[var14] = new BufferedFile(new AccessFile(ModelData0.getFile("main_file_cache.idx" + var14), "rw", 1048576L), 6000, 0);
					}
				} catch (Exception var19) {
					PlayerAppearance.RunException_sendStackTrace((String)null, var19);
				}

				WorldMapIcon_0.client = this;
				class39.clientType = clientType;
				if (field651 == -1) {
					field651 = 0;
				}

				this.startThread(765, 503, 193);
			}
		} catch (RuntimeException var20) {
			throw UserComparator9.newRunException(var20, "client.init(" + ')');
		}
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			long var2 = class298.currentTimeMillis();
			int var4 = (int)(var2 - NetCache.field3195);
			NetCache.field3195 = var2;
			if (var4 > 200) {
				var4 = 200;
			}

			NetCache.NetCache_loadTime += var4;
			boolean var1;
			if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) {
				var1 = true;
			} else if (NetCache.NetCache_socket == null) {
				var1 = false;
			} else {
				try {
					label246: {
						if (NetCache.NetCache_loadTime > 30000) {
							throw new IOException();
						}

						NetFileRequest var5;
						Buffer var6;
						while (NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) {
							var5 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first();
							var6 = new Buffer(4);
							var6.writeByte(1);
							var6.writeMedium((int)var5.key);
							NetCache.NetCache_socket.write(var6.array, 0, 4);
							NetCache.NetCache_pendingPriorityResponses.put(var5, var5.key);
							--NetCache.NetCache_pendingPriorityWritesCount;
							++NetCache.NetCache_pendingPriorityResponsesCount;
						}

						while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) {
							var5 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast();
							var6 = new Buffer(4);
							var6.writeByte(0);
							var6.writeMedium((int)var5.key);
							NetCache.NetCache_socket.write(var6.array, 0, 4);
							var5.removeDual();
							NetCache.NetCache_pendingResponses.put(var5, var5.key);
							--NetCache.NetCache_pendingWritesCount;
							++NetCache.NetCache_pendingResponsesCount;
						}

						for (int var17 = 0; var17 < 100; ++var17) {
							int var18 = NetCache.NetCache_socket.available();
							if (var18 < 0) {
								throw new IOException();
							}

							if (var18 == 0) {
								break;
							}

							NetCache.NetCache_loadTime = 0;
							byte var7 = 0;
							if (NetCache.NetCache_currentResponse == null) {
								var7 = 8;
							} else if (NetCache.field3207 == 0) {
								var7 = 1;
							}

							int var8;
							int var9;
							int var10;
							int var12;
							byte[] var10000;
							int var10001;
							Buffer var25;
							if (var7 > 0) {
								var8 = var7 - NetCache.NetCache_responseHeaderBuffer.offset;
								if (var8 > var18) {
									var8 = var18;
								}

								NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var8);
								if (NetCache.field3210 != 0) {
									for (var9 = 0; var9 < var8; ++var9) {
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = var9 + NetCache.NetCache_responseHeaderBuffer.offset;
										var10000[var10001] ^= NetCache.field3210;
									}
								}

								var25 = NetCache.NetCache_responseHeaderBuffer;
								var25.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) {
									break;
								}

								if (NetCache.NetCache_currentResponse == null) {
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort();
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
									var12 = NetCache.NetCache_responseHeaderBuffer.readInt();
									long var13 = (long)(var10 + (var9 << 16));
									NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var13);
									UserComparator4.field1988 = true;
									if (var15 == null) {
										var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var13);
										UserComparator4.field1988 = false;
									}

									if (var15 == null) {
										throw new IOException();
									}

									int var16 = var11 == 0 ? 5 : 9;
									NetCache.NetCache_currentResponse = var15;
									class206.NetCache_responseArchiveBuffer = new Buffer(var16 + var12 + NetCache.NetCache_currentResponse.padding);
									class206.NetCache_responseArchiveBuffer.writeByte(var11);
									class206.NetCache_responseArchiveBuffer.writeInt(var12);
									NetCache.field3207 = 8;
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
								} else if (NetCache.field3207 == 0) {
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) {
										NetCache.field3207 = 1;
										NetCache.NetCache_responseHeaderBuffer.offset = 0;
									} else {
										NetCache.NetCache_currentResponse = null;
									}
								}
							} else {
								var8 = class206.NetCache_responseArchiveBuffer.array.length - NetCache.NetCache_currentResponse.padding;
								var9 = 512 - NetCache.field3207;
								if (var9 > var8 - class206.NetCache_responseArchiveBuffer.offset) {
									var9 = var8 - class206.NetCache_responseArchiveBuffer.offset;
								}

								if (var9 > var18) {
									var9 = var18;
								}

								NetCache.NetCache_socket.read(class206.NetCache_responseArchiveBuffer.array, class206.NetCache_responseArchiveBuffer.offset, var9);
								if (NetCache.field3210 != 0) {
									for (var10 = 0; var10 < var9; ++var10) {
										var10000 = class206.NetCache_responseArchiveBuffer.array;
										var10001 = class206.NetCache_responseArchiveBuffer.offset + var10;
										var10000[var10001] ^= NetCache.field3210;
									}
								}

								var25 = class206.NetCache_responseArchiveBuffer;
								var25.offset += var9;
								NetCache.field3207 += var9;
								if (var8 == class206.NetCache_responseArchiveBuffer.offset) {
									if (16711935L == NetCache.NetCache_currentResponse.key) {
										WorldMapLabel.NetCache_reference = class206.NetCache_responseArchiveBuffer;

										for (var10 = 0; var10 < 256; ++var10) {
											Archive var19 = NetCache.NetCache_archives[var10];
											if (var19 != null) {
												WorldMapLabel.NetCache_reference.offset = var10 * 8 + 5;
												var12 = WorldMapLabel.NetCache_reference.readInt();
												int var20 = WorldMapLabel.NetCache_reference.readInt();
												var19.loadIndex(var12, var20);
											}
										}
									} else {
										NetCache.NetCache_crc.reset();
										NetCache.NetCache_crc.update(class206.NetCache_responseArchiveBuffer.array, 0, var8);
										var10 = (int)NetCache.NetCache_crc.getValue();
										if (var10 != NetCache.NetCache_currentResponse.crc) {
											try {
												NetCache.NetCache_socket.close();
											} catch (Exception var23) {
											}

											++NetCache.NetCache_crcMismatches;
											NetCache.NetCache_socket = null;
											NetCache.field3210 = (byte)((int)(Math.random() * 255.0D + 1.0D));
											var1 = false;
											break label246;
										}

										NetCache.NetCache_crcMismatches = 0;
										NetCache.NetCache_ioExceptions = 0;
										NetCache.NetCache_currentResponse.archive.write((int)(NetCache.NetCache_currentResponse.key & 65535L), class206.NetCache_responseArchiveBuffer.array, (NetCache.NetCache_currentResponse.key & 16711680L) == 16711680L, UserComparator4.field1988);
									}

									NetCache.NetCache_currentResponse.remove();
									if (UserComparator4.field1988) {
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount;
									}

									NetCache.field3207 = 0;
									NetCache.NetCache_currentResponse = null;
									class206.NetCache_responseArchiveBuffer = null;
								} else {
									if (NetCache.field3207 != 512) {
										break;
									}

									NetCache.field3207 = 0;
								}
							}
						}

						var1 = true;
					}
				} catch (IOException var24) {
					try {
						NetCache.NetCache_socket.close();
					} catch (Exception var22) {
					}

					++NetCache.NetCache_ioExceptions;
					NetCache.NetCache_socket = null;
					var1 = false;
				}
			}

			if (!var1) {
				this.doCycleJs5Connect();
			}

		}
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-278380129"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) {
			this.error("js5crc");
			gameState = 1000;
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					gameState = 1000;
					return;
				}

				field864 = 3000;
				NetCache.NetCache_ioExceptions = 3;
			}

			if (--field864 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						WorldMapManager.js5SocketTask = GameShell.taskHandler.newSocketTask(WorldMapSprite.worldHost, ArchiveDiskAction.port3);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (WorldMapManager.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (WorldMapManager.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						if (useBufferedSocket) {
							TaskHandler.js5Socket = class219.method4011((Socket)WorldMapManager.js5SocketTask.result, 40000, 5000);
						} else {
							TaskHandler.js5Socket = new NetSocket((Socket)WorldMapManager.js5SocketTask.result, GameShell.taskHandler, 5000);
						}

						Buffer var1 = new Buffer(5);
						var1.writeByte(15);
						var1.writeInt(193);
						TaskHandler.js5Socket.write(var1.array, 0, 5);
						++js5ConnectState;
						LoginPacket.field2341 = class298.currentTimeMillis();
					}

					if (js5ConnectState == 3) {
						if (TaskHandler.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) {
							int var5 = TaskHandler.js5Socket.readUnsignedByte();
							if (var5 != 0) {
								this.js5Error(var5);
								return;
							}

							++js5ConnectState;
						} else if (class298.currentTimeMillis() - LoginPacket.field2341 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						AbstractSocket var10 = TaskHandler.js5Socket;
						boolean var2 = gameState > 20;
						if (NetCache.NetCache_socket != null) {
							try {
								NetCache.NetCache_socket.close();
							} catch (Exception var8) {
							}

							NetCache.NetCache_socket = null;
						}

						NetCache.NetCache_socket = var10;
						SoundSystem.method2564(var2);
						NetCache.NetCache_responseHeaderBuffer.offset = 0;
						NetCache.NetCache_currentResponse = null;
						class206.NetCache_responseArchiveBuffer = null;
						NetCache.field3207 = 0;

						while (true) {
							NetFileRequest var3 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first();
							if (var3 == null) {
								while (true) {
									var3 = (NetFileRequest)NetCache.NetCache_pendingResponses.first();
									if (var3 == null) {
										if (NetCache.field3210 != 0) {
											try {
												Buffer var11 = new Buffer(4);
												var11.writeByte(4);
												var11.writeByte(NetCache.field3210);
												var11.writeShort(0);
												NetCache.NetCache_socket.write(var11.array, 0, 4);
											} catch (IOException var7) {
												try {
													NetCache.NetCache_socket.close();
												} catch (Exception var6) {
												}

												++NetCache.NetCache_ioExceptions;
												NetCache.NetCache_socket = null;
											}
										}

										NetCache.NetCache_loadTime = 0;
										NetCache.field3195 = class298.currentTimeMillis();
										WorldMapManager.js5SocketTask = null;
										TaskHandler.js5Socket = null;
										js5ConnectState = 0;
										js5Errors = 0;
										return;
									}

									NetCache.NetCache_pendingWritesQueue.addLast(var3);
									NetCache.NetCache_pendingWrites.put(var3, var3.key);
									++NetCache.NetCache_pendingWritesCount;
									--NetCache.NetCache_pendingResponsesCount;
								}
							}

							NetCache.NetCache_pendingPriorityWrites.put(var3, var3.key);
							++NetCache.NetCache_pendingPriorityWritesCount;
							--NetCache.NetCache_pendingPriorityResponsesCount;
						}
					}
				} catch (IOException var9) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1103110959"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		WorldMapManager.js5SocketTask = null;
		TaskHandler.js5Socket = null;
		js5ConnectState = 0;
		if (ArchiveDiskAction.port3 == class278.port1) {
			ArchiveDiskAction.port3 = Players.port2;
		} else {
			ArchiveDiskAction.port3 = class278.port1;
		}

		++js5Errors;
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
			if (gameState <= 5) {
				this.error("js5connect_full");
				gameState = 1000;
			} else {
				field864 = 3000;
			}
		} else if (js5Errors >= 2 && var1 == 6) {
			this.error("js5connect_outofdate");
			gameState = 1000;
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				gameState = 1000;
			} else {
				field864 = 3000;
			}
		}

	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-34"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (loginState == 0) {
				if (WorldMapData_0.secureRandom == null && (secureRandomFuture.isDone() || field892 > 250)) {
					WorldMapData_0.secureRandom = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (WorldMapData_0.secureRandom != null) {
					if (var1 != null) {
						((AbstractSocket)var1).close();
						var1 = null;
					}

					WorldMapID.socketTask = null;
					field696 = false;
					field892 = 0;
					loginState = 1;
				}
			}

			if (loginState == 1) {
				if (WorldMapID.socketTask == null) {
					WorldMapID.socketTask = GameShell.taskHandler.newSocketTask(WorldMapSprite.worldHost, ArchiveDiskAction.port3);
				}

				if (WorldMapID.socketTask.status == 2) {
					throw new IOException();
				}

				if (WorldMapID.socketTask.status == 1) {
					if (useBufferedSocket) {
						var1 = class219.method4011((Socket)WorldMapID.socketTask.result, 40000, 5000);
					} else {
						var1 = new NetSocket((Socket)WorldMapID.socketTask.result, GameShell.taskHandler, 5000);
					}

					packetWriter.setSocket((AbstractSocket)var1);
					WorldMapID.socketTask = null;
					loginState = 2;
				}
			}

			PacketBufferNode var3;
			if (loginState == 2) {
				packetWriter.clearBuffer();
				var3 = class236.method4163();
				var3.packetBuffer.writeByte(LoginPacket.field2332.id);
				packetWriter.addNode(var3);
				packetWriter.flush();
				var2.offset = 0;
				loginState = 3;
			}

			int var4;
			boolean var12;
			if (loginState == 3) {
				if (AbstractWorldMapData.pcmPlayer0 != null) {
					AbstractWorldMapData.pcmPlayer0.method2485();
				}

				if (FriendLoginUpdate.pcmPlayer1 != null) {
					FriendLoginUpdate.pcmPlayer1.method2485();
				}

				var12 = true;
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) {
					var12 = false;
				}

				if (var12) {
					var4 = ((AbstractSocket)var1).readUnsignedByte();
					if (AbstractWorldMapData.pcmPlayer0 != null) {
						AbstractWorldMapData.pcmPlayer0.method2485();
					}

					if (FriendLoginUpdate.pcmPlayer1 != null) {
						FriendLoginUpdate.pcmPlayer1.method2485();
					}

					if (var4 != 0) {
						UserComparator8.getLoginError(var4);
						return;
					}

					var2.offset = 0;
					loginState = 4;
				}
			}

			int var31;
			if (loginState == 4) {
				if (var2.offset < 8) {
					var31 = ((AbstractSocket)var1).available();
					if (var31 > 8 - var2.offset) {
						var31 = 8 - var2.offset;
					}

					if (var31 > 0) {
						((AbstractSocket)var1).read(var2.array, var2.offset, var31);
						var2.offset += var31;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					class69.field557 = var2.readLong();
					loginState = 5;
				}
			}

			int var7;
			int var9;
			int var14;
			if (loginState == 5) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var22 = new PacketBuffer(500);
				int[] var13 = new int[]{WorldMapData_0.secureRandom.nextInt(), WorldMapData_0.secureRandom.nextInt(), WorldMapData_0.secureRandom.nextInt(), WorldMapData_0.secureRandom.nextInt()};
				var22.offset = 0;
				var22.writeByte(1);
				var22.writeInt(var13[0]);
				var22.writeInt(var13[1]);
				var22.writeInt(var13[2]);
				var22.writeInt(var13[3]);
				var22.writeLong(class69.field557);
				int var10;
				if (gameState == 40) {
					var22.writeInt(MouseHandler.field487[0]);
					var22.writeInt(MouseHandler.field487[1]);
					var22.writeInt(MouseHandler.field487[2]);
					var22.writeInt(MouseHandler.field487[3]);
				} else {
					var22.writeByte(field872.rsOrdinal());
					switch(field872.field2022) {
					case 0:
						LinkedHashMap var6 = Timer.clientPreferences.parameters;
						String var8 = Login.Login_username;
						var9 = var8.length();
						var10 = 0;

						for (int var11 = 0; var11 < var9; ++var11) {
							var10 = (var10 << 5) - var10 + var8.charAt(var11);
						}

						var22.writeInt((Integer)var6.get(var10));
						break;
					case 1:
						var22.offset += 4;
						break;
					case 2:
					case 3:
						var22.writeMedium(WorldMapSection1.field313);
						++var22.offset;
					}

					var22.writeByte(class323.field3857.rsOrdinal());
					var22.writeStringCp1252NullTerminated(Login.Login_password);
				}

				var22.encryptRsa(class92.field1170, class92.field1168);
				MouseHandler.field487 = var13;
				PacketBufferNode var5 = class236.method4163();
				var5.packetBuffer.offset = 0;
				if (gameState == 40) {
					var5.packetBuffer.writeByte(LoginPacket.field2335.id);
				} else {
					var5.packetBuffer.writeByte(LoginPacket.field2334.id);
				}

				var5.packetBuffer.writeShort(0);
				var14 = var5.packetBuffer.offset;
				var5.packetBuffer.writeInt(193);
				var5.packetBuffer.writeInt(1);
				var5.packetBuffer.writeByte(clientType);
				var5.packetBuffer.writeByte(field651);
				var5.packetBuffer.writeBytes(var22.array, 0, var22.offset);
				var7 = var5.packetBuffer.offset;
				var5.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var5.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var5.packetBuffer.writeShort(IgnoreList.canvasWidth);
				var5.packetBuffer.writeShort(ModelData0.canvasHeight);
				FileSystem.method3573(var5.packetBuffer);
				var5.packetBuffer.writeStringCp1252NullTerminated(WorldMapSection1.field317);
				var5.packetBuffer.writeInt(MidiPcmStream.field2455);
				Buffer var29 = new Buffer(class58.platformInfo.size());
				class58.platformInfo.write(var29);
				var5.packetBuffer.writeBytes(var29.array, 0, var29.array.length);
				var5.packetBuffer.writeByte(clientType);
				var5.packetBuffer.writeInt(0);
				var5.packetBuffer.method5718(GameShell.archive5.hash);
				var5.packetBuffer.method5718(GrandExchangeOfferUnitPriceComparator.archive13.hash);
				var5.packetBuffer.method5718(PacketBufferNode.archive12.hash);
				var5.packetBuffer.method5587(ItemContainer.archive11.hash);
				var5.packetBuffer.writeInt(GrandExchangeOfferUnitPriceComparator.archive9.hash);
				var5.packetBuffer.writeInt(NetFileRequest.archive20.hash);
				var5.packetBuffer.method5718(class92.archive10.hash);
				var5.packetBuffer.method5587(class41.archive18.hash);
				var5.packetBuffer.method5588(class169.archive17.hash);
				var5.packetBuffer.method5588(archive15.hash);
				var5.packetBuffer.method5587(WorldMapSprite.archive1.hash);
				var5.packetBuffer.method5718(FontName.archive14.hash);
				var5.packetBuffer.method5587(class195.archive19.hash);
				var5.packetBuffer.method5718(Messages.archive8.hash);
				var5.packetBuffer.method5587(DynamicObject.archive2.hash);
				var5.packetBuffer.method5718(class330.archive3.hash);
				var5.packetBuffer.method5587(TilePaint.archive0.hash);
				var5.packetBuffer.writeInt(class227.archive4.hash);
				var5.packetBuffer.method5587(0);
				var5.packetBuffer.method5588(BuddyRankComparator.archive7.hash);
				var5.packetBuffer.method5718(class217.archive6.hash);
				var5.packetBuffer.xteaEncrypt(var13, var7, var5.packetBuffer.offset);
				var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var14);
				packetWriter.addNode(var5);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var13);
				int[] var15 = new int[4];

				for (var10 = 0; var10 < 4; ++var10) {
					var15[var10] = var13[var10] + 50;
				}

				var2.newIsaacCipher(var15);
				loginState = 6;
			}

			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) {
				var31 = ((AbstractSocket)var1).readUnsignedByte();
				if (var31 == 21 && gameState == 20) {
					loginState = 12;
				} else if (var31 == 2) {
					loginState = 14;
				} else if (var31 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					loginState = 19;
				} else if (var31 == 64) {
					loginState = 10;
				} else if (var31 == 23 && field681 < 1) {
					++field681;
					loginState = 0;
				} else if (var31 == 29) {
					loginState = 17;
				} else {
					if (var31 != 69) {
						UserComparator8.getLoginError(var31);
						return;
					}

					loginState = 7;
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) {
				((AbstractSocket)var1).read(var2.array, 0, 2);
				var2.offset = 0;
				WorldMapLabel.field258 = var2.readUnsignedShort();
				loginState = 8;
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= WorldMapLabel.field258) {
				var2.offset = 0;
				((AbstractSocket)var1).read(var2.array, var2.offset, WorldMapLabel.field258);
				class7 var23 = BufferedSink.method5889()[var2.readUnsignedByte()];

				try {
					class12 var32 = ItemContainer.method1250(var23);
					this.field687 = new class9(var2, var32);
					loginState = 9;
				} catch (Exception var20) {
					UserComparator8.getLoginError(22);
					return;
				}
			}

			if (loginState == 9 && this.field687.method112()) {
				this.field686 = this.field687.method98();
				this.field687.method97();
				this.field687 = null;
				if (this.field686 == null) {
					UserComparator8.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var3 = class236.method4163();
				var3.packetBuffer.writeByte(LoginPacket.field2336.id);
				var3.packetBuffer.writeShort(this.field686.offset);
				var3.packetBuffer.method5536(this.field686);
				packetWriter.addNode(var3);
				packetWriter.flush();
				this.field686 = null;
				loginState = 6;
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) {
				class58.field433 = ((AbstractSocket)var1).readUnsignedByte();
				loginState = 11;
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= class58.field433) {
				((AbstractSocket)var1).read(var2.array, 0, class58.field433);
				var2.offset = 0;
				loginState = 6;
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) {
				field682 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
				loginState = 13;
			}

			if (loginState == 13) {
				field892 = 0;
				GameShell.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field682 / 60 + " seconds.");
				if (--field682 <= 0) {
					loginState = 0;
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) {
					UrlRequester.field1963 = ((AbstractSocket)var1).readUnsignedByte();
					loginState = 15;
				}

				if (loginState == 15 && ((AbstractSocket)var1).available() >= UrlRequester.field1963) {
					var12 = ((AbstractSocket)var1).readUnsignedByte() == 1;
					((AbstractSocket)var1).read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var24 = false;
					if (var12) {
						var4 = var2.readByteIsaac() << 24;
						var4 |= var2.readByteIsaac() << 16;
						var4 |= var2.readByteIsaac() << 8;
						var4 |= var2.readByteIsaac();
						String var28 = Login.Login_username;
						var7 = var28.length();
						int var16 = 0;
						var9 = 0;

						while (true) {
							if (var9 >= var7) {
								if (Timer.clientPreferences.parameters.size() >= 10 && !Timer.clientPreferences.parameters.containsKey(var16)) {
									Iterator var30 = Timer.clientPreferences.parameters.entrySet().iterator();
									var30.next();
									var30.remove();
								}

								Timer.clientPreferences.parameters.put(var16, var4);
								break;
							}

							var16 = (var16 << 5) - var16 + var28.charAt(var9);
							++var9;
						}
					}

					if (Login_isUsernameRemembered) {
						Timer.clientPreferences.rememberedUsername = Login.Login_username;
					} else {
						Timer.clientPreferences.rememberedUsername = null;
					}

					GrandExchangeOffer.savePreferences();
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte();
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1;
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte();
					field766 = ((AbstractSocket)var1).readUnsignedByte();
					((AbstractSocket)var1).read(var2.array, 0, 1);
					var2.offset = 0;
					ServerPacket[] var26 = Tiles.ServerPacket_values();
					var14 = var2.readSmartByteShortIsaac();
					if (var14 < 0 || var14 >= var26.length) {
						throw new IOException(var14 + " " + var2.offset);
					}

					packetWriter.serverPacket = var26[var14];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					((AbstractSocket)var1).read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						class56.method901(WorldMapIcon_0.client, "zap");
					} catch (Throwable var19) {
					}

					loginState = 16;
				}

				if (loginState == 16) {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method5013();
						Players.method2208();
						class307.updatePlayer(var2);
						class182.field2112 = -1;
						ItemContainer.loadRegions(false, var2);
						packetWriter.serverPacket = null;
					}

				} else {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, 2);
						var2.offset = 0;
						MusicPatch.field2497 = var2.readUnsignedShort();
						loginState = 18;
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= MusicPatch.field2497) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, MusicPatch.field2497);
						var2.offset = 0;
						String var25 = var2.readStringCp1252NullTerminated();
						String var33 = var2.readStringCp1252NullTerminated();
						String var27 = var2.readStringCp1252NullTerminated();
						GameShell.setLoginResponseString(var25, var33, var27);
						WorldMapCacheName.updateGameState(10);
					}

					if (loginState == 19) {
						if (packetWriter.serverPacketLength == -1) {
							if (((AbstractSocket)var1).available() < 2) {
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2);
							var2.offset = 0;
							packetWriter.serverPacketLength = var2.readUnsignedShort();
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
							var2.offset = 0;
							var31 = packetWriter.serverPacketLength;
							timer.method5015();
							DefaultsGroup.method5939();
							class307.updatePlayer(var2);
							if (var31 != var2.offset) {
								throw new RuntimeException();
							}
						}
					} else {
						++field892;
						if (field892 > 2000) {
							if (field681 < 1) {
								if (class278.port1 == ArchiveDiskAction.port3) {
									ArchiveDiskAction.port3 = Players.port2;
								} else {
									ArchiveDiskAction.port3 = class278.port1;
								}

								++field681;
								loginState = 0;
							} else {
								UserComparator8.getLoginError(-3);
							}
						}
					}
				}
			}
		} catch (IOException var21) {
			if (field681 < 1) {
				if (class278.port1 == ArchiveDiskAction.port3) {
					ArchiveDiskAction.port3 = Players.port2;
				} else {
					ArchiveDiskAction.port3 = class278.port1;
				}

				++field681;
				loginState = 0;
			} else {
				UserComparator8.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-105"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) {
			--rebootTimer;
		}

		if (logoutTimer > 0) {
			--logoutTimer;
		}

		if (field696) {
			field696 = false;
			LoginScreenAnimation.method1903();
		} else {
			if (!isMenuOpen) {
				ApproximateRouteStrategy.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1687(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				int var2;
				PacketBufferNode var15;
				while (class23.method225()) {
					var15 = ItemContainer.getPacketBufferNode(ClientPacket.field2280, packetWriter.isaacCipher);
					var15.packetBuffer.writeByte(0);
					var2 = var15.packetBuffer.offset;
					WorldMapData_0.performReflectionCheck(var15.packetBuffer);
					var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset - var2);
					packetWriter.addNode(var15);
				}

				if (timer.field3614) {
					var15 = ItemContainer.getPacketBufferNode(ClientPacket.field2251, packetWriter.isaacCipher);
					var15.packetBuffer.writeByte(0);
					var2 = var15.packetBuffer.offset;
					timer.write(var15.packetBuffer);
					var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset - var2);
					packetWriter.addNode(var15);
					timer.method5014();
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
				synchronized(SoundCache.mouseRecorder.lock) {
					if (!field907) {
						SoundCache.mouseRecorder.index = 0;
					} else if (MouseHandler.MouseHandler_lastButton != 0 || SoundCache.mouseRecorder.index >= 40) {
						PacketBufferNode var16 = null;
						var3 = 0;
						var4 = 0;
						var5 = 0;
						var6 = 0;

						for (var7 = 0; var7 < SoundCache.mouseRecorder.index && (var16 == null || var16.packetBuffer.offset - var3 < 246); ++var7) {
							var4 = var7;
							var8 = SoundCache.mouseRecorder.ys[var7];
							if (var8 < -1) {
								var8 = -1;
							} else if (var8 > 65534) {
								var8 = 65534;
							}

							var9 = SoundCache.mouseRecorder.xs[var7];
							if (var9 < -1) {
								var9 = -1;
							} else if (var9 > 65534) {
								var9 = 65534;
							}

							if (var9 != field657 || var8 != field658) {
								if (var16 == null) {
									var16 = ItemContainer.getPacketBufferNode(ClientPacket.field2326, packetWriter.isaacCipher);
									var16.packetBuffer.writeByte(0);
									var3 = var16.packetBuffer.offset;
									PacketBuffer var10000 = var16.packetBuffer;
									var10000.offset += 2;
									var5 = 0;
									var6 = 0;
								}

								if (-1L != field794) {
									var10 = var9 - field657;
									var11 = var8 - field658;
									var12 = (int)((SoundCache.mouseRecorder.millis[var7] - field794) / 20L);
									var5 = (int)((long)var5 + (SoundCache.mouseRecorder.millis[var7] - field794) % 20L);
								} else {
									var10 = var9;
									var11 = var8;
									var12 = Integer.MAX_VALUE;
								}

								field657 = var9;
								field658 = var8;
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
									var10 += 32;
									var11 += 32;
									var16.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
									var10 += 128;
									var11 += 128;
									var16.packetBuffer.writeByte(var12 + 128);
									var16.packetBuffer.writeShort(var11 + (var10 << 8));
								} else if (var12 < 32) {
									var16.packetBuffer.writeByte(var12 + 192);
									if (var9 != -1 && var8 != -1) {
										var16.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var16.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var16.packetBuffer.writeShort((var12 & 8191) + 57344);
									if (var9 != -1 && var8 != -1) {
										var16.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var16.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6;
								field794 = SoundCache.mouseRecorder.millis[var7];
							}
						}

						if (var16 != null) {
							var16.packetBuffer.writeLengthByte(var16.packetBuffer.offset - var3);
							var7 = var16.packetBuffer.offset;
							var16.packetBuffer.offset = var3;
							var16.packetBuffer.writeByte(var5 / var6);
							var16.packetBuffer.writeByte(var5 % var6);
							var16.packetBuffer.offset = var7;
							packetWriter.addNode(var16);
						}

						if (var4 >= SoundCache.mouseRecorder.index) {
							SoundCache.mouseRecorder.index = 0;
						} else {
							MouseRecorder var44 = SoundCache.mouseRecorder;
							var44.index -= var4;
							System.arraycopy(SoundCache.mouseRecorder.xs, var4, SoundCache.mouseRecorder.xs, 0, SoundCache.mouseRecorder.index);
							System.arraycopy(SoundCache.mouseRecorder.ys, var4, SoundCache.mouseRecorder.ys, 0, SoundCache.mouseRecorder.index);
							System.arraycopy(SoundCache.mouseRecorder.millis, var4, SoundCache.mouseRecorder.millis, 0, SoundCache.mouseRecorder.index);
						}
					}
				}

				PacketBufferNode var19;
				if (MouseHandler.MouseHandler_lastButton == 1 || !UserComparator9.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
					long var17 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L;
					if (var17 > 32767L) {
						var17 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L;
					var3 = MouseHandler.MouseHandler_lastPressedY;
					if (var3 < 0) {
						var3 = 0;
					} else if (var3 > ModelData0.canvasHeight) {
						var3 = ModelData0.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX;
					if (var4 < 0) {
						var4 = 0;
					} else if (var4 > IgnoreList.canvasWidth) {
						var4 = IgnoreList.canvasWidth;
					}

					var5 = (int)var17;
					var19 = ItemContainer.getPacketBufferNode(ClientPacket.field2329, packetWriter.isaacCipher);
					var19.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
					var19.packetBuffer.writeShort(var4);
					var19.packetBuffer.writeShort(var3);
					packetWriter.addNode(var19);
				}

				if (KeyHandler.field414 > 0) {
					var15 = ItemContainer.getPacketBufferNode(ClientPacket.field2234, packetWriter.isaacCipher);
					var15.packetBuffer.writeShort(0);
					var2 = var15.packetBuffer.offset;
					long var20 = class298.currentTimeMillis();

					for (var5 = 0; var5 < KeyHandler.field414; ++var5) {
						long var22 = var20 - field817;
						if (var22 > 16777215L) {
							var22 = 16777215L;
						}

						field817 = var20;
						var15.packetBuffer.method5585((int)var22);
						var15.packetBuffer.writeIntME(KeyHandler.field413[var5]);
					}

					var15.packetBuffer.writeLengthShort(var15.packetBuffer.offset - var2);
					packetWriter.addNode(var15);
				}

				if (field732 > 0) {
					--field732;
				}

				if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) {
					field843 = true;
				}

				if (field843 && field732 <= 0) {
					field732 = 20;
					field843 = false;
					var15 = ItemContainer.getPacketBufferNode(ClientPacket.field2275, packetWriter.isaacCipher);
					var15.packetBuffer.method5739(camAngleX);
					var15.packetBuffer.method5739(camAngleY);
					packetWriter.addNode(var15);
				}

				if (ScriptEvent.hasFocus && !hadFocus) {
					hadFocus = true;
					var15 = ItemContainer.getPacketBufferNode(ClientPacket.field2277, packetWriter.isaacCipher);
					var15.packetBuffer.writeByte(1);
					packetWriter.addNode(var15);
				}

				if (!ScriptEvent.hasFocus && hadFocus) {
					hadFocus = false;
					var15 = ItemContainer.getPacketBufferNode(ClientPacket.field2277, packetWriter.isaacCipher);
					var15.packetBuffer.writeByte(0);
					packetWriter.addNode(var15);
				}

				if (WorldMapRectangle.worldMap != null) {
					WorldMapRectangle.worldMap.method6363();
				}

				GrandExchangeOfferNameComparator.method209();
				NetSocket.method3608();
				if (gameState == 30) {
					WorldMapDecoration.method382();
					WorldMapManager.method679();
					++packetWriter.field1333;
					if (packetWriter.field1333 > 750) {
						LoginScreenAnimation.method1903();
					} else {
						var1 = Players.Players_count;
						int[] var36 = Players.Players_indices;

						for (var3 = 0; var3 < var1; ++var3) {
							Player var24 = players[var36[var3]];
							if (var24 != null) {
								WorldMapID.updateActorSequence(var24, 1);
							}
						}

						UserComparator9.method3477();
						WorldMapManager.method703();
						++field850;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 400;
							if (mouseCrossState * 20 >= 400) {
								mouseCrossColor = 0;
							}
						}

						if (NPC.field1131 != null) {
							++field754;
							if (field754 >= 15) {
								CollisionMap.invalidateWidget(NPC.field1131);
								NPC.field1131 = null;
							}
						}

						Widget var35 = EnumDefinition.mousedOverWidgetIf1;
						Widget var37 = CollisionMap.field2092;
						EnumDefinition.mousedOverWidgetIf1 = null;
						CollisionMap.field2092 = null;
						draggedOnWidget = null;
						field829 = false;
						field859 = false;
						field870 = 0;

						while (GrandExchangeOfferNameComparator.isKeyDown() && field870 < 128) {
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && StudioGame.field3135 == 66) {
								String var40 = "";

								Message var38;
								for (Iterator var25 = Messages.Messages_hashTable.iterator(); var25.hasNext(); var40 = var40 + var38.sender + ':' + var38.text + '\n') {
									var38 = (Message)var25.next();
								}

								WorldMapIcon_0.client.clipboardSetString(var40);
							} else if (oculusOrbState != 1 || WorldMapIcon_1.field200 <= 0) {
								field693[field870] = StudioGame.field3135;
								field661[field870] = WorldMapIcon_1.field200;
								++field870;
							}
						}

						boolean var31 = staffModLevel >= 2;
						if (var31 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) {
							var4 = PlayerAppearance.localPlayer.plane - mouseWheelRotation;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > 3) {
								var4 = 3;
							}

							if (var4 != PlayerAppearance.localPlayer.plane) {
								var5 = PlayerAppearance.localPlayer.pathX[0] + NetFileRequest.baseX * 64;
								var6 = PlayerAppearance.localPlayer.pathY[0] + class41.baseY * 64;
								PacketBufferNode var27 = ItemContainer.getPacketBufferNode(ClientPacket.field2269, packetWriter.isaacCipher);
								var27.packetBuffer.method5578(var5);
								var27.packetBuffer.method5587(0);
								var27.packetBuffer.method5739(var6);
								var27.packetBuffer.writeByte(var4);
								packetWriter.addNode(var27);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							class51.updateRootInterface(rootInterface, 0, 0, IgnoreList.canvasWidth, ModelData0.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var39;
							ScriptEvent var41;
							Widget var42;
							do {
								var41 = (ScriptEvent)field715.removeLast();
								if (var41 == null) {
									while (true) {
										do {
											var41 = (ScriptEvent)field849.removeLast();
											if (var41 == null) {
												while (true) {
													do {
														var41 = (ScriptEvent)scriptEvents.removeLast();
														if (var41 == null) {
															this.menu();
															if (WorldMapRectangle.worldMap != null) {
																WorldMapRectangle.worldMap.method6370(GameObject.Client_plane, NetFileRequest.baseX * 64 + (PlayerAppearance.localPlayer.x >> 7), class41.baseY * 64 + (PlayerAppearance.localPlayer.y >> 7), false);
																WorldMapRectangle.worldMap.loadCache();
															}

															if (clickedWidget != null) {
																this.method1381();
															}

															if (class171.dragInventoryWidget != null) {
																CollisionMap.invalidateWidget(class171.dragInventoryWidget);
																++itemDragDuration;
																if (MouseHandler.MouseHandler_currentButton == 0) {
																	if (field848) {
																		if (Occluder.hoveredItemContainer == class171.dragInventoryWidget && dragItemSlotSource != dragItemSlotDestination) {
																			Widget var43 = class171.dragInventoryWidget;
																			byte var32 = 0;
																			if (field865 == 1 && var43.contentType == 206) {
																				var32 = 1;
																			}

																			if (var43.itemIds[dragItemSlotDestination] <= 0) {
																				var32 = 0;
																			}

																			if (BoundaryObject.method3341(FaceNormal.getWidgetFlags(var43))) {
																				var6 = dragItemSlotSource;
																				var7 = dragItemSlotDestination;
																				var43.itemIds[var7] = var43.itemIds[var6];
																				var43.itemQuantities[var7] = var43.itemQuantities[var6];
																				var43.itemIds[var6] = -1;
																				var43.itemQuantities[var6] = 0;
																			} else if (var32 == 1) {
																				var6 = dragItemSlotSource;
																				var7 = dragItemSlotDestination;

																				while (var6 != var7) {
																					if (var6 > var7) {
																						var43.swapItems(var6 - 1, var6);
																						--var6;
																					} else if (var6 < var7) {
																						var43.swapItems(var6 + 1, var6);
																						++var6;
																					}
																				}
																			} else {
																				var43.swapItems(dragItemSlotDestination, dragItemSlotSource);
																			}

																			var19 = ItemContainer.getPacketBufferNode(ClientPacket.field2302, packetWriter.isaacCipher);
																			var19.packetBuffer.writeInt(class171.dragInventoryWidget.id);
																			var19.packetBuffer.method5739(dragItemSlotSource);
																			var19.packetBuffer.writeShort(dragItemSlotDestination);
																			var19.packetBuffer.writeByte(var32);
																			packetWriter.addNode(var19);
																		}
																	} else if (this.shouldLeftClickOpenMenu()) {
																		this.openMenu(draggedWidgetX, draggedWidgetY);
																	} else if (menuOptionsCount > 0) {
																		var4 = draggedWidgetX;
																		var5 = draggedWidgetY;
																		WorldMapDecoration.method379(WorldMapSection1.tempMenuAction, var4, var5);
																		WorldMapSection1.tempMenuAction = null;
																	}

																	field754 = 10;
																	MouseHandler.MouseHandler_lastButton = 0;
																	class171.dragInventoryWidget = null;
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) {
																	field848 = true;
																}
															}

															if (Scene.shouldSendWalk()) {
																var4 = Scene.Scene_selectedX;
																var5 = Scene.Scene_selectedY;
																var19 = ItemContainer.getPacketBufferNode(ClientPacket.field2232, packetWriter.isaacCipher);
																var19.packetBuffer.writeByte(5);
																var19.packetBuffer.method5739(NetFileRequest.baseX * 64 + var4);
																var19.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
																var19.packetBuffer.writeShortLE(class41.baseY * 64 + var5);
																packetWriter.addNode(var19);
																Scene.method3199();
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																mouseCrossColor = 1;
																mouseCrossState = 0;
																destinationX = var4;
																destinationY = var5;
															}

															if (var35 != EnumDefinition.mousedOverWidgetIf1) {
																if (var35 != null) {
																	CollisionMap.invalidateWidget(var35);
																}

																if (EnumDefinition.mousedOverWidgetIf1 != null) {
																	CollisionMap.invalidateWidget(EnumDefinition.mousedOverWidgetIf1);
																}
															}

															if (var37 != CollisionMap.field2092 && field751 == field799) {
																if (var37 != null) {
																	CollisionMap.invalidateWidget(var37);
																}

																if (CollisionMap.field2092 != null) {
																	CollisionMap.invalidateWidget(CollisionMap.field2092);
																}
															}

															if (CollisionMap.field2092 != null) {
																if (field799 < field751) {
																	++field799;
																	if (field751 == field799) {
																		CollisionMap.invalidateWidget(CollisionMap.field2092);
																	}
																}
															} else if (field799 > 0) {
																--field799;
															}

															int var28;
															if (oculusOrbState == 0) {
																var4 = PlayerAppearance.localPlayer.x;
																var5 = PlayerAppearance.localPlayer.y;
																if (SecureRandomFuture.oculusOrbFocalPointX - var4 < -500 || SecureRandomFuture.oculusOrbFocalPointX - var4 > 500 || Decimator.oculusOrbFocalPointY - var5 < -500 || Decimator.oculusOrbFocalPointY - var5 > 500) {
																	SecureRandomFuture.oculusOrbFocalPointX = var4;
																	Decimator.oculusOrbFocalPointY = var5;
																}

																if (var4 != SecureRandomFuture.oculusOrbFocalPointX) {
																	SecureRandomFuture.oculusOrbFocalPointX += (var4 - SecureRandomFuture.oculusOrbFocalPointX) / 16;
																}

																if (var5 != Decimator.oculusOrbFocalPointY) {
																	Decimator.oculusOrbFocalPointY += (var5 - Decimator.oculusOrbFocalPointY) / 16;
																}

																var6 = SecureRandomFuture.oculusOrbFocalPointX >> 7;
																var7 = Decimator.oculusOrbFocalPointY >> 7;
																var8 = SecureRandomFuture.getTileHeight(SecureRandomFuture.oculusOrbFocalPointX, Decimator.oculusOrbFocalPointY, GameObject.Client_plane);
																var9 = 0;
																if (var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) {
																	for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
																		for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) {
																			var12 = GameObject.Client_plane;
																			if (var12 < 3 && (Tiles.Tiles_renderFlags[1][var10][var11] & 2) == 2) {
																				++var12;
																			}

																			var28 = var8 - Tiles.Tiles_heights[var12][var10][var11];
																			if (var28 > var9) {
																				var9 = var28;
																			}
																		}
																	}
																}

																var10 = var9 * 192;
																if (var10 > 98048) {
																	var10 = 98048;
																}

																if (var10 < 32768) {
																	var10 = 32768;
																}

																if (var10 > field918) {
																	field918 += (var10 - field918) / 24;
																} else if (var10 < field918) {
																	field918 += (var10 - field918) / 80;
																}

																PacketWriter.field1341 = SecureRandomFuture.getTileHeight(PlayerAppearance.localPlayer.x, PlayerAppearance.localPlayer.y, GameObject.Client_plane) - camFollowHeight;
															} else if (oculusOrbState == 1) {
																if (field649 && PlayerAppearance.localPlayer != null) {
																	var4 = PlayerAppearance.localPlayer.pathX[0];
																	var5 = PlayerAppearance.localPlayer.pathY[0];
																	if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
																		SecureRandomFuture.oculusOrbFocalPointX = PlayerAppearance.localPlayer.x;
																		var6 = SecureRandomFuture.getTileHeight(PlayerAppearance.localPlayer.x, PlayerAppearance.localPlayer.y, GameObject.Client_plane) - camFollowHeight;
																		if (var6 < PacketWriter.field1341) {
																			PacketWriter.field1341 = var6;
																		}

																		Decimator.oculusOrbFocalPointY = PlayerAppearance.localPlayer.y;
																		field649 = false;
																	}
																}

																short var33 = -1;
																if (KeyHandler.KeyHandler_pressedKeys[33]) {
																	var33 = 0;
																} else if (KeyHandler.KeyHandler_pressedKeys[49]) {
																	var33 = 1024;
																}

																if (KeyHandler.KeyHandler_pressedKeys[48]) {
																	if (var33 == 0) {
																		var33 = 1792;
																	} else if (var33 == 1024) {
																		var33 = 1280;
																	} else {
																		var33 = 1536;
																	}
																} else if (KeyHandler.KeyHandler_pressedKeys[50]) {
																	if (var33 == 0) {
																		var33 = 256;
																	} else if (var33 == 1024) {
																		var33 = 768;
																	} else {
																		var33 = 512;
																	}
																}

																byte var34 = 0;
																if (KeyHandler.KeyHandler_pressedKeys[35]) {
																	var34 = -1;
																} else if (KeyHandler.KeyHandler_pressedKeys[51]) {
																	var34 = 1;
																}

																var6 = 0;
																if (var33 >= 0 || var34 != 0) {
																	var6 = KeyHandler.KeyHandler_pressedKeys[81] ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed;
																	var6 *= 16;
																	field761 = var33;
																	field788 = var34;
																}

																if (field755 < var6) {
																	field755 += var6 / 8;
																	if (field755 > var6) {
																		field755 = var6;
																	}
																} else if (field755 > var6) {
																	field755 = field755 * 9 / 10;
																}

																if (field755 > 0) {
																	var7 = field755 / 16;
																	if (field761 >= 0) {
																		var4 = field761 - AbstractArchive.cameraYaw & 2047;
																		var8 = Rasterizer3D.Rasterizer3D_sine[var4];
																		var9 = Rasterizer3D.Rasterizer3D_cosine[var4];
																		SecureRandomFuture.oculusOrbFocalPointX += var7 * var8 / 65536;
																		Decimator.oculusOrbFocalPointY += var9 * var7 / 65536;
																	}

																	if (field788 != 0) {
																		PacketWriter.field1341 += var7 * field788;
																		if (PacketWriter.field1341 > 0) {
																			PacketWriter.field1341 = 0;
																		}
																	}
																} else {
																	field761 = -1;
																	field788 = -1;
																}

																if (KeyHandler.KeyHandler_pressedKeys[13]) {
																	packetWriter.addNode(ItemContainer.getPacketBufferNode(ClientPacket.field2244, packetWriter.isaacCipher));
																	oculusOrbState = 0;
																}
															}

															if (MouseHandler.MouseHandler_currentButton == 4 && UserComparator9.mouseCam) {
																var4 = MouseHandler.MouseHandler_y - mouseCamClickedY;
																camAngleDX = var4 * 2;
																mouseCamClickedY = var4 != -1 && var4 != 1 ? (MouseHandler.MouseHandler_y + mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y;
																var5 = mouseCamClickedX - MouseHandler.MouseHandler_x;
																camAngleDY = var5 * 2;
																mouseCamClickedX = var5 != -1 && var5 != 1 ? (mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x;
															} else {
																if (KeyHandler.KeyHandler_pressedKeys[96]) {
																	camAngleDY += (-24 - camAngleDY) / 2;
																} else if (KeyHandler.KeyHandler_pressedKeys[97]) {
																	camAngleDY += (24 - camAngleDY) / 2;
																} else {
																	camAngleDY /= 2;
																}

																if (KeyHandler.KeyHandler_pressedKeys[98]) {
																	camAngleDX += (12 - camAngleDX) / 2;
																} else if (KeyHandler.KeyHandler_pressedKeys[99]) {
																	camAngleDX += (-12 - camAngleDX) / 2;
																} else {
																	camAngleDX /= 2;
																}

																mouseCamClickedY = MouseHandler.MouseHandler_y;
																mouseCamClickedX = MouseHandler.MouseHandler_x;
															}

															camAngleY = camAngleDY / 2 + camAngleY & 2047;
															camAngleX += camAngleDX / 2;
															if (camAngleX < 128) {
																camAngleX = 128;
															}

															if (camAngleX > 383) {
																camAngleX = 383;
															}

															if (isCameraLocked) {
																var4 = RouteStrategy.field2124 * 16384 + 64;
																var5 = class89.field1140 * 16384 + 64;
																var6 = SecureRandomFuture.getTileHeight(var4, var5, GameObject.Client_plane) - class41.field302;
																if (Player.cameraX < var4) {
																	Player.cameraX = (var4 - Player.cameraX) * WorldMapRegion.field271 / 1000 + Player.cameraX + DynamicObject.field1316;
																	if (Player.cameraX > var4) {
																		Player.cameraX = var4;
																	}
																}

																if (Player.cameraX > var4) {
																	Player.cameraX -= WorldMapRegion.field271 * (Player.cameraX - var4) / 1000 + DynamicObject.field1316;
																	if (Player.cameraX < var4) {
																		Player.cameraX = var4;
																	}
																}

																if (KeyHandler.cameraY < var6) {
																	KeyHandler.cameraY = (var6 - KeyHandler.cameraY) * WorldMapRegion.field271 / 1000 + KeyHandler.cameraY + DynamicObject.field1316;
																	if (KeyHandler.cameraY > var6) {
																		KeyHandler.cameraY = var6;
																	}
																}

																if (KeyHandler.cameraY > var6) {
																	KeyHandler.cameraY -= WorldMapRegion.field271 * (KeyHandler.cameraY - var6) / 1000 + DynamicObject.field1316;
																	if (KeyHandler.cameraY < var6) {
																		KeyHandler.cameraY = var6;
																	}
																}

																if (class69.cameraZ < var5) {
																	class69.cameraZ = (var5 - class69.cameraZ) * WorldMapRegion.field271 / 1000 + class69.cameraZ + DynamicObject.field1316;
																	if (class69.cameraZ > var5) {
																		class69.cameraZ = var5;
																	}
																}

																if (class69.cameraZ > var5) {
																	class69.cameraZ -= WorldMapRegion.field271 * (class69.cameraZ - var5) / 1000 + DynamicObject.field1316;
																	if (class69.cameraZ < var5) {
																		class69.cameraZ = var5;
																	}
																}

																var4 = WorldMapData_0.field112 * 16384 + 64;
																var5 = EnumDefinition.field3340 * 16384 + 64;
																var6 = SecureRandomFuture.getTileHeight(var4, var5, GameObject.Client_plane) - class25.field128;
																var7 = var4 - Player.cameraX;
																var8 = var6 - KeyHandler.cameraY;
																var9 = var5 - class69.cameraZ;
																var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9));
																var11 = (int)(Math.atan2((double)var8, (double)var10) * 325.949D) & 2047;
																var12 = (int)(Math.atan2((double)var7, (double)var9) * -325.949D) & 2047;
																if (var11 < 128) {
																	var11 = 128;
																}

																if (var11 > 383) {
																	var11 = 383;
																}

																if (Skeleton.cameraPitch < var11) {
																	Skeleton.cameraPitch = (var11 - Skeleton.cameraPitch) * ModeWhere.field2405 / 1000 + Skeleton.cameraPitch + Players.field1267;
																	if (Skeleton.cameraPitch > var11) {
																		Skeleton.cameraPitch = var11;
																	}
																}

																if (Skeleton.cameraPitch > var11) {
																	Skeleton.cameraPitch -= ModeWhere.field2405 * (Skeleton.cameraPitch - var11) / 1000 + Players.field1267;
																	if (Skeleton.cameraPitch < var11) {
																		Skeleton.cameraPitch = var11;
																	}
																}

																var28 = var12 - AbstractArchive.cameraYaw;
																if (var28 > 1024) {
																	var28 -= 2048;
																}

																if (var28 < -1024) {
																	var28 += 2048;
																}

																if (var28 > 0) {
																	AbstractArchive.cameraYaw = var28 * ModeWhere.field2405 / 1000 + AbstractArchive.cameraYaw + Players.field1267;
																	AbstractArchive.cameraYaw &= 2047;
																}

																if (var28 < 0) {
																	AbstractArchive.cameraYaw -= Players.field1267 + -var28 * ModeWhere.field2405 / 1000;
																	AbstractArchive.cameraYaw &= 2047;
																}

																int var14 = var12 - AbstractArchive.cameraYaw;
																if (var14 > 1024) {
																	var14 -= 2048;
																}

																if (var14 < -1024) {
																	var14 += 2048;
																}

																if (var14 < 0 && var28 > 0 || var14 > 0 && var28 < 0) {
																	AbstractArchive.cameraYaw = var12;
																}
															}

															for (var4 = 0; var4 < 5; ++var4) {
																int var10002 = field644[var4]++;
															}

															Varcs.varcs.tryWrite();
															var4 = Occluder.method3378();
															var5 = VarcInt.method4427();
															if (var4 > 15000 && var5 > 15000) {
																logoutTimer = 250;
																ChatChannel.method2317(14500);
																var19 = ItemContainer.getPacketBufferNode(ClientPacket.field2303, packetWriter.isaacCipher);
																packetWriter.addNode(var19);
															}

															MilliClock.friendSystem.processFriendUpdates();
															++packetWriter.pendingWrites;
															if (packetWriter.pendingWrites > 50) {
																var19 = ItemContainer.getPacketBufferNode(ClientPacket.field2322, packetWriter.isaacCipher);
																packetWriter.addNode(var19);
															}

															try {
																packetWriter.flush();
															} catch (IOException var29) {
																LoginScreenAnimation.method1903();
															}

															return;
														}

														var42 = var41.widget;
														if (var42.childIndex < 0) {
															break;
														}

														var39 = CollisionMap.getWidget(var42.parentId);
													} while(var39 == null || var39.children == null || var42.childIndex >= var39.children.length || var42 != var39.children[var42.childIndex]);

													class22.runScriptEvent(var41);
												}
											}

											var42 = var41.widget;
											if (var42.childIndex < 0) {
												break;
											}

											var39 = CollisionMap.getWidget(var42.parentId);
										} while(var39 == null || var39.children == null || var42.childIndex >= var39.children.length || var42 != var39.children[var42.childIndex]);

										class22.runScriptEvent(var41);
									}
								}

								var42 = var41.widget;
								if (var42.childIndex < 0) {
									break;
								}

								var39 = CollisionMap.getWidget(var42.parentId);
							} while(var39 == null || var39.children == null || var42.childIndex >= var39.children.length || var42 != var39.children[var42.childIndex]);

							class22.runScriptEvent(var41);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "890034121"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = IgnoreList.canvasWidth;
		int var2 = ModelData0.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (Timer.clientPreferences != null) {
			try {
				Client var3 = WorldMapIcon_0.client;
				Object[] var4 = new Object[]{SoundSystem.getWindowedMode()};
				JSObject.getWindow(var3).call("resize", var4);
			} catch (Throwable var5) {
			}
		}

	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-527814205"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) {
			NPCDefinition.method4759(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (field901[var1]) {
				field854[var1] = true;
			}

			field855[var1] = field901[var1];
			field901[var1] = false;
		}

		field852 = cycle;
		viewportX = -1;
		viewportY = -1;
		Occluder.hoveredItemContainer = null;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			KeyHandler.drawWidgets(rootInterface, 0, 0, IgnoreList.canvasWidth, ModelData0.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				GrandExchangeOfferAgeComparator.crossSprites[mouseCrossState * 20 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				GrandExchangeOfferAgeComparator.crossSprites[mouseCrossState * 20 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		if (!isMenuOpen) {
			if (viewportX != -1) {
				WorldMapData_0.method243(viewportX, viewportY);
			}
		} else {
			var1 = AbstractUserComparator.menuX;
			int var2 = DynamicObject.menuY;
			int var3 = Occluder.menuWidth;
			int var4 = class182.menuHeight;
			int var5 = 6116423;
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5);
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
			GrandExchangeOfferTotalQuantityComparator.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1);
			int var6 = MouseHandler.MouseHandler_x;
			int var7 = MouseHandler.MouseHandler_y;

			for (int var8 = 0; var8 < menuOptionsCount; ++var8) {
				int var9 = (menuOptionsCount - 1 - var8) * 15 + var2 + 31;
				int var10 = 16777215;
				if (var6 > var1 && var6 < var3 + var1 && var7 > var9 - 13 && var7 < var9 + 3) {
					var10 = 16776960;
				}

				GrandExchangeOfferTotalQuantityComparator.fontBold12.draw(ArchiveLoader.method1230(var8), var1 + 3, var9, var10, 0);
			}

			Strings.method4157(AbstractUserComparator.menuX, DynamicObject.menuY, Occluder.menuWidth, class182.menuHeight);
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field855[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field854[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		FriendsList.method5222(GameObject.Client_plane, PlayerAppearance.localPlayer.x, PlayerAppearance.localPlayer.y, field850);
		field850 = 0;
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(Ldh;B)Z",
		garbageValue = "126"
	)
	final boolean method1687(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			String var17;
			int var18;
			try {
				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1332) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1333 = 0;
						var1.field1332 = false;
					}

					var3.offset = 0;
					if (var3.method5491()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1333 = 0;
					}

					var1.field1332 = true;
					ServerPacket[] var4 = Tiles.ServerPacket_values();
					var5 = var3.readSmartByteShortIsaac();
					if (var5 < 0 || var5 >= var4.length) {
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5];
					var1.serverPacketLength = var1.serverPacket.length;
				}

				if (var1.serverPacketLength == -1) {
					if (!var2.isAvailable(1)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1);
					var1.serverPacketLength = var3.array[0] & 255;
				}

				if (var1.serverPacketLength == -2) {
					if (!var2.isAvailable(2)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2);
					var3.offset = 0;
					var1.serverPacketLength = var3.readUnsignedShort();
				}

				if (!var2.isAvailable(var1.serverPacketLength)) {
					return false;
				}

				var3.offset = 0;
				var2.read(var3.array, 0, var1.serverPacketLength);
				var1.field1333 = 0;
				timer.method5010();
				var1.field1337 = var1.field1336;
				var1.field1336 = var1.field1335;
				var1.field1335 = var1.serverPacket;
				int var16;
				String var44;
				boolean var46;
				if (ServerPacket.field2139 == var1.serverPacket) {
					var16 = var3.readUShortSmart();
					var46 = var3.readUnsignedByte() == 1;
					var44 = "";
					boolean var48 = false;
					if (var46) {
						var44 = var3.readStringCp1252NullTerminated();
						if (MilliClock.friendSystem.isIgnored(new Username(var44, GrandExchangeOfferUnitPriceComparator.loginType))) {
							var48 = true;
						}
					}

					String var43 = var3.readStringCp1252NullTerminated();
					if (!var48) {
						class234.addGameMessage(var16, var44, var43);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2172 == var1.serverPacket) {
					var16 = var3.method5539();
					if (var16 == 65535) {
						var16 = -1;
					}

					WorldMapData_0.playSong(var16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2188 == var1.serverPacket) {
					var16 = var3.readUnsignedShort();
					if (var16 == 65535) {
						var16 = -1;
					}

					var5 = var3.method5586();
					LoginPacket.method3672(var16, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2187 == var1.serverPacket) {
					for (var16 = 0; var16 < VarpDefinition.VarpDefinition_fileCount; ++var16) {
						VarpDefinition var56 = class219.VarpDefinition_get(var16);
						if (var56 != null) {
							Varps.Varps_temp[var16] = 0;
							Varps.Varps_main[var16] = 0;
						}
					}

					class195.method3681();
					field835 += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2157 == var1.serverPacket) {
					WorldMapData_0.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2145 == var1.serverPacket) {
					var16 = var3.readUnsignedByte();
					FontName.method5354(var16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2152 == var1.serverPacket) {
					UserComparator4.method3465(class194.field2345);
					var1.serverPacket = null;
					return true;
				}

				String var38;
				if (ServerPacket.field2189 == var1.serverPacket) {
					var38 = var3.readStringCp1252NullTerminated();
					Object[] var55 = new Object[var38.length() + 1];

					for (var18 = var38.length() - 1; var18 >= 0; --var18) {
						if (var38.charAt(var18) == 's') {
							var55[var18 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var55[var18 + 1] = new Integer(var3.readInt());
						}
					}

					var55[0] = new Integer(var3.readInt());
					ScriptEvent var47 = new ScriptEvent();
					var47.args = var55;
					class22.runScriptEvent(var47);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2217 == var1.serverPacket) {
					if (WorldMapArea.clanChat != null) {
						WorldMapArea.clanChat.method5251(var3);
					}

					WorldMapLabel.method469();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2175 == var1.serverPacket) {
					WorldMapData_0.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2176 == var1.serverPacket) {
					SoundSystem.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2174 == var1.serverPacket) {
					var16 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var16] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var16] = new GrandExchangeOffer(var3, false);
					}

					field685 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				Widget var51;
				if (ServerPacket.field2150 == var1.serverPacket) {
					var16 = var3.readInt();
					var51 = CollisionMap.getWidget(var16);
					var51.modelType = 3;
					var51.modelId = PlayerAppearance.localPlayer.appearance.getChatHeadId();
					CollisionMap.invalidateWidget(var51);
					var1.serverPacket = null;
					return true;
				}

				int var7;
				int var9;
				long var12;
				int var19;
				InterfaceParent var20;
				int var21;
				if (ServerPacket.field2184 == var1.serverPacket) {
					var16 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					var18 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.resizeRoot(false);
						class304.Widget_resetModelFrames(rootInterface);
						VarpDefinition.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							field901[var7] = true;
						}
					}

					InterfaceParent var45;
					for (; var18-- > 0; var45.field559 = true) {
						var7 = var3.readInt();
						var19 = var3.readUnsignedShort();
						var9 = var3.readUnsignedByte();
						var45 = (InterfaceParent)interfaceParents.get((long)var7);
						if (var45 != null && var19 != var45.group) {
							MouseRecorder.closeInterface(var45, true);
							var45 = null;
						}

						if (var45 == null) {
							var45 = NetFileRequest.method4189(var7, var19, var9);
						}
					}

					for (var20 = (InterfaceParent)interfaceParents.first(); var20 != null; var20 = (InterfaceParent)interfaceParents.next()) {
						if (var20.field559) {
							var20.field559 = false;
						} else {
							MouseRecorder.closeInterface(var20, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var16) {
						var7 = var3.readInt();
						var19 = var3.readUnsignedShort();
						var9 = var3.readUnsignedShort();
						var21 = var3.readInt();

						for (int var11 = var19; var11 <= var9; ++var11) {
							var12 = (long)var11 + ((long)var7 << 32);
							widgetFlags.put(new IntegerNode(var21), var12);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2143 == var1.serverPacket) {
					class248.field3222 = var3.method5573();
					PacketWriter.field1331 = var3.method5573();

					while (var3.offset < var1.serverPacketLength) {
						var16 = var3.readUnsignedByte();
						class194 var54 = InvDefinition.method4371()[var16];
						UserComparator4.method3465(var54);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2199 == var1.serverPacket) {
					hintArrowType = var3.readUnsignedByte();
					if (hintArrowType == 1) {
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) {
						if (hintArrowType == 2) {
							hintArrowSubX = 4096;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 3) {
							hintArrowSubX = 0;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 4) {
							hintArrowSubX = 8192;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 5) {
							hintArrowSubX = 4096;
							hintArrowSubY = 0;
						}

						if (hintArrowType == 6) {
							hintArrowSubX = 4096;
							hintArrowSubY = 8192;
						}

						hintArrowType = 2;
						hintArrowX = var3.readUnsignedShort();
						hintArrowY = var3.readUnsignedShort();
						hintArrowHeight = var3.readUnsignedByte() * 4;
					}

					if (hintArrowType == 10) {
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2154 == var1.serverPacket) {
					UserComparator4.method3465(class194.field2348);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2149 == var1.serverPacket) {
					var16 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var18 = var3.readUnsignedShort();
					class232.queueSoundEffect(var16, var5, var18);
					var1.serverPacket = null;
					return true;
				}

				Widget var40;
				if (ServerPacket.field2191 == var1.serverPacket) {
					var16 = var3.method5582();
					var5 = var3.readInt();
					var40 = CollisionMap.getWidget(var5);
					if (var40 != null && var40.type == 0) {
						if (var16 > var40.scrollHeight - var40.height) {
							var16 = var40.scrollHeight - var40.height;
						}

						if (var16 < 0) {
							var16 = 0;
						}

						if (var16 != var40.scrollY) {
							var40.scrollY = var16;
							CollisionMap.invalidateWidget(var40);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2219 == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2169 == var1.serverPacket) {
					var16 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var18 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field902[var16] = true;
					field679[var16] = var5;
					field893[var16] = var18;
					field705[var16] = var7;
					field644[var16] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2214 == var1.serverPacket) {
					for (var16 = 0; var16 < players.length; ++var16) {
						if (players[var16] != null) {
							players[var16].sequence = -1;
						}
					}

					for (var16 = 0; var16 < npcs.length; ++var16) {
						if (npcs[var16] != null) {
							npcs[var16].sequence = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2165 == var1.serverPacket) {
					UserComparator4.method3465(class194.field2351);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2215 == var1.serverPacket) {
					rebootTimer = var3.method5582() * 30;
					field845 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2153 == var1.serverPacket) {
					var16 = var3.method5643();
					var5 = var3.method5583();
					var40 = CollisionMap.getWidget(var16);
					if (var5 != var40.sequenceId || var5 == -1) {
						var40.sequenceId = var5;
						var40.modelFrame = 0;
						var40.modelFrameCycle = 0;
						CollisionMap.invalidateWidget(var40);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2207 == var1.serverPacket) {
					class195.method3681();
					runEnergy = var3.readUnsignedByte();
					field845 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				Widget var58;
				if (ServerPacket.field2218 == var1.serverPacket) {
					var16 = var3.method5580();
					var5 = var3.readUnsignedShort();
					var18 = var3.readInt();
					var58 = CollisionMap.getWidget(var18);
					var58.field2642 = var16 + (var5 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2160 == var1.serverPacket) {
					var16 = var3.readInt();
					InterfaceParent var53 = (InterfaceParent)interfaceParents.get((long)var16);
					if (var53 != null) {
						MouseRecorder.closeInterface(var53, true);
					}

					if (meslayerContinueWidget != null) {
						CollisionMap.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2185 == var1.serverPacket) {
					var16 = var3.method5643();
					var5 = var3.method5571();
					var18 = var3.method5580();
					var20 = (InterfaceParent)interfaceParents.get((long)var16);
					if (var20 != null) {
						MouseRecorder.closeInterface(var20, var18 != var20.group);
					}

					NetFileRequest.method4189(var16, var18, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2162 == var1.serverPacket) {
					MilliClock.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					class9.FriendSystem_invalidateIgnoreds();
					field879 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2216 == var1.serverPacket) {
					var38 = var3.readStringCp1252NullTerminated();
					var17 = AbstractFont.escapeBrackets(ServerPacket.method3663(AttackOption.method2135(var3)));
					class234.addGameMessage(6, var38, var17);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2148 == var1.serverPacket) {
					isCameraLocked = false;

					for (var16 = 0; var16 < 5; ++var16) {
						field902[var16] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2204 == var1.serverPacket) {
					ItemContainer.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2193 == var1.serverPacket) {
					isCameraLocked = true;
					RouteStrategy.field2124 = var3.readUnsignedByte() * 128;
					class89.field1140 = var3.readUnsignedByte() * 128;
					class41.field302 = var3.readUnsignedShort();
					DynamicObject.field1316 = var3.readUnsignedByte();
					WorldMapRegion.field271 = var3.readUnsignedByte();
					if (WorldMapRegion.field271 >= 100) {
						Player.cameraX = RouteStrategy.field2124 * 16384 + 64;
						class69.cameraZ = class89.field1140 * 16384 + 64;
						KeyHandler.cameraY = SecureRandomFuture.getTileHeight(Player.cameraX, class69.cameraZ, GameObject.Client_plane) - class41.field302;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2224 == var1.serverPacket) {
					if (rootInterface != -1) {
						WorldMapRectangle.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2178 == var1.serverPacket) {
					var16 = var3.method5582();
					rootInterface = var16;
					this.resizeRoot(false);
					class304.Widget_resetModelFrames(var16);
					VarpDefinition.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						field901[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2221 == var1.serverPacket) {
					class248.field3222 = var3.method5571();
					PacketWriter.field1331 = var3.method5571();

					for (var16 = PacketWriter.field1331; var16 < PacketWriter.field1331 + 8; ++var16) {
						for (var5 = class248.field3222; var5 < class248.field3222 + 8; ++var5) {
							if (groundItems[GameObject.Client_plane][var16][var5] != null) {
								groundItems[GameObject.Client_plane][var16][var5] = null;
								MouseRecorder.updateItemPile(var16, var5);
							}
						}
					}

					for (PendingSpawn var41 = (PendingSpawn)pendingSpawns.last(); var41 != null; var41 = (PendingSpawn)pendingSpawns.previous()) {
						if (var41.x >= PacketWriter.field1331 && var41.x < PacketWriter.field1331 + 8 && var41.y >= class248.field3222 && var41.y < class248.field3222 + 8 && var41.plane == GameObject.Client_plane) {
							var41.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2203 == var1.serverPacket) {
					byte[] var39 = new byte[var1.serverPacketLength];
					var3.method5493(var39, 0, var39.length);
					Buffer var52 = new Buffer(var39);
					var44 = var52.readStringCp1252NullTerminated();
					AttackOption.openURL(var44, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2164 == var1.serverPacket) {
					UserComparator4.method3465(class194.field2344);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2205 == var1.serverPacket) {
					tradeChatMode = var3.method5573();
					publicChatMode = var3.method5572();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2197 == var1.serverPacket) {
					var16 = var3.method5591();
					var5 = var3.method5592();
					var18 = var3.method5539();
					if (var18 == 65535) {
						var18 = -1;
					}

					var58 = CollisionMap.getWidget(var16);
					ItemDefinition var42;
					if (!var58.isIf3) {
						if (var18 == -1) {
							var58.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var42 = SecureRandomCallable.ItemDefinition_get(var18);
						var58.modelType = 4;
						var58.modelId = var18;
						var58.modelAngleX = var42.xan2d;
						var58.modelAngleY = var42.yan2d;
						var58.modelZoom = var42.zoom2d * 100 / var5;
						CollisionMap.invalidateWidget(var58);
					} else {
						var58.itemId = var18;
						var58.itemQuantity = var5;
						var42 = SecureRandomCallable.ItemDefinition_get(var18);
						var58.modelAngleX = var42.xan2d;
						var58.modelAngleY = var42.yan2d;
						var58.modelAngleZ = var42.zan2d;
						var58.modelOffsetX = var42.offsetX2d;
						var58.modelOffsetY = var42.offsetY2d;
						var58.modelZoom = var42.zoom2d;
						if (var42.isStackable == 1) {
							var58.itemQuantityMode = 1;
						} else {
							var58.itemQuantityMode = 2;
						}

						if (var58.field2641 > 0) {
							var58.modelZoom = var58.modelZoom * 32 / var58.field2641;
						} else if (var58.rawWidth > 0) {
							var58.modelZoom = var58.modelZoom * 32 / var58.rawWidth;
						}

						CollisionMap.invalidateWidget(var58);
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var50;
				if (ServerPacket.field2180 == var1.serverPacket) {
					var50 = var3.readBoolean();
					if (var50) {
						if (WorldMapIcon_0.field148 == null) {
							WorldMapIcon_0.field148 = new class248();
						}
					} else {
						WorldMapIcon_0.field148 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2170 == var1.serverPacket) {
					var16 = var3.method5592();
					var5 = var3.readUnsignedShort();
					Varps.Varps_temp[var5] = var16;
					if (Varps.Varps_main[var5] != var16) {
						Varps.Varps_main[var5] = var16;
					}

					Script.changeGameOptions(var5);
					field834[++field835 - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2186 == var1.serverPacket) {
					destinationX = var3.readUnsignedByte();
					if (destinationX == 255) {
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte();
					if (destinationY == 255) {
						destinationY = 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2167 == var1.serverPacket) {
					for (var16 = 0; var16 < Varps.Varps_main.length; ++var16) {
						if (Varps.Varps_main[var16] != Varps.Varps_temp[var16]) {
							Varps.Varps_main[var16] = Varps.Varps_temp[var16];
							Script.changeGameOptions(var16);
							field834[++field835 - 1 & 31] = var16;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2210 == var1.serverPacket) {
					WorldMapData_0.method244(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2171 == var1.serverPacket) {
					UserComparator4.method3465(class194.field2343);
					var1.serverPacket = null;
					return true;
				}

				long var22;
				long var24;
				if (ServerPacket.field2194 == var1.serverPacket) {
					var38 = var3.readStringCp1252NullTerminated();
					var22 = (long)var3.readUnsignedShort();
					var24 = (long)var3.readMedium();
					PlayerType var26 = (PlayerType)UrlRequester.findEnumerated(class234.PlayerType_values(), var3.readUnsignedByte());
					long var27 = var24 + (var22 << 32);
					boolean var29 = false;

					for (int var13 = 0; var13 < 100; ++var13) {
						if (var27 == field868[var13]) {
							var29 = true;
							break;
						}
					}

					if (MilliClock.friendSystem.isIgnored(new Username(var38, GrandExchangeOfferUnitPriceComparator.loginType))) {
						var29 = true;
					}

					if (!var29 && field762 == 0) {
						field868[field707] = var27;
						field707 = (field707 + 1) % 100;
						String var30 = AbstractFont.escapeBrackets(ServerPacket.method3663(AttackOption.method2135(var3)));
						byte var49;
						if (var26.isPrivileged) {
							var49 = 7;
						} else {
							var49 = 3;
						}

						if (var26.modIcon != -1) {
							class234.addGameMessage(var49, class25.method248(var26.modIcon) + var38, var30);
						} else {
							class234.addGameMessage(var49, var38, var30);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				long var31;
				if (ServerPacket.field2192 == var1.serverPacket) {
					var38 = var3.readStringCp1252NullTerminated();
					var22 = var3.readLong();
					var24 = (long)var3.readUnsignedShort();
					var31 = (long)var3.readMedium();
					PlayerType var60 = (PlayerType)UrlRequester.findEnumerated(class234.PlayerType_values(), var3.readUnsignedByte());
					var12 = (var24 << 32) + var31;
					boolean var14 = false;

					for (int var15 = 0; var15 < 100; ++var15) {
						if (field868[var15] == var12) {
							var14 = true;
							break;
						}
					}

					if (var60.isUser && MilliClock.friendSystem.isIgnored(new Username(var38, GrandExchangeOfferUnitPriceComparator.loginType))) {
						var14 = true;
					}

					if (!var14 && field762 == 0) {
						field868[field707] = var12;
						field707 = (field707 + 1) % 100;
						String var34 = AbstractFont.escapeBrackets(ServerPacket.method3663(AttackOption.method2135(var3)));
						if (var60.modIcon != -1) {
							UserComparator10.addChatMessage(9, class25.method248(var60.modIcon) + var38, var34, ParamDefinition.base37DecodeLong(var22));
						} else {
							UserComparator10.addChatMessage(9, var38, var34, ParamDefinition.base37DecodeLong(var22));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2173 == var1.serverPacket) {
					WorldMapRectangle.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2168 == var1.serverPacket) {
					UserComparator10.updatePlayers(var3, var1.serverPacketLength);
					TextureProvider.method2848();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2206 == var1.serverPacket) {
					MilliClock.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field879 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2151 == var1.serverPacket) {
					var16 = var3.method5582();
					var5 = var3.method5591();
					var40 = CollisionMap.getWidget(var5);
					if (var40.modelType != 2 || var16 != var40.modelId) {
						var40.modelType = 2;
						var40.modelId = var16;
						CollisionMap.invalidateWidget(var40);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2190 == var1.serverPacket) {
					var16 = var3.method5643();
					var5 = var3.method5580();
					var18 = var5 >> 10 & 31;
					var7 = var5 >> 5 & 31;
					var19 = var5 & 31;
					var9 = (var7 << 11) + (var18 << 19) + (var19 << 3);
					Widget var10 = CollisionMap.getWidget(var16);
					if (var9 != var10.color) {
						var10.color = var9;
						CollisionMap.invalidateWidget(var10);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2140 == var1.serverPacket) {
					var16 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var16 < -70000) {
						var5 += 32768;
					}

					if (var16 >= 0) {
						var40 = CollisionMap.getWidget(var16);
					} else {
						var40 = null;
					}

					for (; var3.offset < var1.serverPacketLength; GrandExchangeOfferNameComparator.itemContainerSetItem(var5, var7, var19 - 1, var9)) {
						var7 = var3.readUShortSmart();
						var19 = var3.readUnsignedShort();
						var9 = 0;
						if (var19 != 0) {
							var9 = var3.readUnsignedByte();
							if (var9 == 255) {
								var9 = var3.readInt();
							}
						}

						if (var40 != null && var7 >= 0 && var7 < var40.itemIds.length) {
							var40.itemIds[var7] = var19;
							var40.itemQuantities[var7] = var9;
						}
					}

					if (var40 != null) {
						CollisionMap.invalidateWidget(var40);
					}

					class195.method3681();
					changedItemContainers[++field837 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2198 == var1.serverPacket) {
					byte var59 = var3.method5665();
					var5 = var3.method5580();
					Varps.Varps_temp[var5] = var59;
					if (Varps.Varps_main[var5] != var59) {
						Varps.Varps_main[var5] = var59;
					}

					Script.changeGameOptions(var5);
					field834[++field835 - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2177 == var1.serverPacket) {
					var16 = var3.readInt();
					var51 = CollisionMap.getWidget(var16);

					for (var18 = 0; var18 < var51.itemIds.length; ++var18) {
						var51.itemIds[var18] = -1;
						var51.itemIds[var18] = 0;
					}

					CollisionMap.invalidateWidget(var51);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2196 == var1.serverPacket) {
					var16 = var3.method5643();
					var46 = var3.method5571() == 1;
					var40 = CollisionMap.getWidget(var16);
					if (var46 != var40.isHidden) {
						var40.isHidden = var46;
						CollisionMap.invalidateWidget(var40);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2212 == var1.serverPacket) {
					UserComparator4.method3465(class194.field2350);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2159 == var1.serverPacket) {
					var16 = var3.readInt();
					var17 = var3.readStringCp1252NullTerminated();
					var40 = CollisionMap.getWidget(var16);
					if (!var17.equals(var40.text)) {
						var40.text = var17;
						CollisionMap.invalidateWidget(var40);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2223 == var1.serverPacket) {
					var16 = var3.readInt();
					var5 = var3.method5580();
					var40 = CollisionMap.getWidget(var16);
					if (var40.modelType != 1 || var5 != var40.modelId) {
						var40.modelType = 1;
						var40.modelId = var5;
						CollisionMap.invalidateWidget(var40);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2201 == var1.serverPacket) {
					MilliClock.friendSystem.method1919();
					field879 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				Widget var8;
				if (ServerPacket.field2211 == var1.serverPacket) {
					var16 = var3.method5582();
					var5 = var3.method5539();
					var18 = var3.method5539();
					var7 = var3.method5643();
					var8 = CollisionMap.getWidget(var7);
					if (var5 != var8.modelAngleX || var16 != var8.modelAngleY || var18 != var8.modelZoom) {
						var8.modelAngleX = var5;
						var8.modelAngleY = var16;
						var8.modelZoom = var18;
						CollisionMap.invalidateWidget(var8);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2181 == var1.serverPacket) {
					UserComparator4.method3465(class194.field2342);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2222 == var1.serverPacket) {
					var16 = var3.method5584();
					var5 = var3.readShort();
					var18 = var3.readInt();
					var58 = CollisionMap.getWidget(var18);
					if (var16 != var58.rawX || var5 != var58.rawY || var58.xAlignment != 0 || var58.yAlignment != 0) {
						var58.rawX = var16;
						var58.rawY = var5;
						var58.xAlignment = 0;
						var58.yAlignment = 0;
						CollisionMap.invalidateWidget(var58);
						this.alignWidget(var58);
						if (var58.type == 0) {
							PendingSpawn.revalidateWidgetScroll(class9.Widget_interfaceComponents[var18 >> 16], var58, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2161 == var1.serverPacket) {
					var16 = var3.readInt();
					var5 = var3.readInt();
					var18 = GrandExchangeOfferNameComparator.getGcDuration();
					PacketBufferNode var57 = ItemContainer.getPacketBufferNode(ClientPacket.field2255, packetWriter.isaacCipher);
					var57.packetBuffer.method5569(var18);
					var57.packetBuffer.method5718(var16);
					var57.packetBuffer.method5587(var5);
					var57.packetBuffer.method5568(GameShell.fps);
					packetWriter.addNode(var57);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2166 == var1.serverPacket) {
					var16 = var3.readUnsignedByte();
					WorldMapSection1.forceDisconnect(var16);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2163 == var1.serverPacket) {
					isCameraLocked = true;
					WorldMapData_0.field112 = var3.readUnsignedByte() * 128;
					EnumDefinition.field3340 = var3.readUnsignedByte() * 128;
					class25.field128 = var3.readUnsignedShort();
					Players.field1267 = var3.readUnsignedByte();
					ModeWhere.field2405 = var3.readUnsignedByte();
					if (ModeWhere.field2405 >= 100) {
						var16 = WorldMapData_0.field112 * 16384 + 64;
						var5 = EnumDefinition.field3340 * 16384 + 64;
						var18 = SecureRandomFuture.getTileHeight(var16, var5, GameObject.Client_plane) - class25.field128;
						var7 = var16 - Player.cameraX;
						var19 = var18 - KeyHandler.cameraY;
						var9 = var5 - class69.cameraZ;
						var21 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9));
						Skeleton.cameraPitch = (int)(Math.atan2((double)var19, (double)var21) * 325.949D) & 2047;
						AbstractArchive.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.949D) & 2047;
						if (Skeleton.cameraPitch < 128) {
							Skeleton.cameraPitch = 128;
						}

						if (Skeleton.cameraPitch > 383) {
							Skeleton.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2147 == var1.serverPacket) {
					var16 = var3.readInt();
					var5 = var3.method5580();
					if (var5 == 65535) {
						var5 = -1;
					}

					var18 = var3.readInt();
					var7 = var3.method5539();
					if (var7 == 65535) {
						var7 = -1;
					}

					for (var19 = var7; var19 <= var5; ++var19) {
						var31 = (long)var19 + ((long)var16 << 32);
						Node var33 = widgetFlags.get(var31);
						if (var33 != null) {
							var33.remove();
						}

						widgetFlags.put(new IntegerNode(var18), var31);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2179 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						WorldMapEvent.method808(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2144 == var1.serverPacket) {
					class195.method3681();
					var16 = var3.method5592();
					var5 = var3.method5571();
					var18 = var3.method5571();
					experience[var18] = var16;
					currentLevels[var18] = var5;
					levels[var18] = 1;

					for (var7 = 0; var7 < 98; ++var7) {
						if (var16 >= Skills.Skills_experienceTable[var7]) {
							levels[var18] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var18;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2183 == var1.serverPacket) {
					var38 = var3.readStringCp1252NullTerminated();
					var5 = var3.method5571();
					var18 = var3.method5572();
					if (var18 >= 1 && var18 <= 8) {
						if (var38.equalsIgnoreCase("null")) {
							var38 = null;
						}

						playerMenuActions[var18 - 1] = var38;
						playerOptionsPriorities[var18 - 1] = var5 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2142 == var1.serverPacket) {
					var16 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var16 < -70000) {
						var5 += 32768;
					}

					if (var16 >= 0) {
						var40 = CollisionMap.getWidget(var16);
					} else {
						var40 = null;
					}

					if (var40 != null) {
						for (var7 = 0; var7 < var40.itemIds.length; ++var7) {
							var40.itemIds[var7] = 0;
							var40.itemQuantities[var7] = 0;
						}
					}

					Language.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();

					for (var19 = 0; var19 < var7; ++var19) {
						var9 = var3.method5539();
						var21 = var3.method5572();
						if (var21 == 255) {
							var21 = var3.method5591();
						}

						if (var40 != null && var19 < var40.itemIds.length) {
							var40.itemIds[var19] = var9;
							var40.itemQuantities[var19] = var21;
						}

						GrandExchangeOfferNameComparator.itemContainerSetItem(var5, var19, var9 - 1, var21);
					}

					if (var40 != null) {
						CollisionMap.invalidateWidget(var40);
					}

					class195.method3681();
					changedItemContainers[++field837 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2200 == var1.serverPacket) {
					class195.method3681();
					weight = var3.readShort();
					field845 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2209 == var1.serverPacket) {
					if (var1.serverPacketLength == 0) {
						WorldMapArea.clanChat = null;
					} else {
						if (WorldMapArea.clanChat == null) {
							WorldMapArea.clanChat = new ClanChat(GrandExchangeOfferUnitPriceComparator.loginType, WorldMapIcon_0.client);
						}

						WorldMapArea.clanChat.readUpdate(var3);
					}

					WorldMapLabel.method469();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2213 == var1.serverPacket) {
					UserComparator4.method3465(class194.field2347);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2141 == var1.serverPacket) {
					World var37 = new World();
					var37.host = var3.readStringCp1252NullTerminated();
					var37.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var37.properties = var5;
					WorldMapCacheName.updateGameState(45);
					var2.close();
					var2 = null;
					SecureRandomCallable.changeWorld(var37);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2182 == var1.serverPacket) {
					UserComparator4.method3465(class194.field2349);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2202 == var1.serverPacket) {
					ItemContainer.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2158 == var1.serverPacket) {
					var16 = var3.method5582();
					Actor.method1819(var16);
					changedItemContainers[++field837 - 1 & 31] = var16 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2220 == var1.serverPacket) {
					privateChatMode = class52.method840(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2208 == var1.serverPacket) {
					PacketWriter.field1331 = var3.method5571();
					class248.field3222 = var3.method5573();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2195 == var1.serverPacket) {
					var50 = var3.readUnsignedByte() == 1;
					if (var50) {
						class4.field17 = class298.currentTimeMillis() - var3.readLong();
						AbstractUserComparator.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						AbstractUserComparator.grandExchangeEvents = null;
					}

					field680 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2155 == var1.serverPacket) {
					var16 = var3.method5592();
					var5 = var3.method5643();
					InterfaceParent var6 = (InterfaceParent)interfaceParents.get((long)var16);
					var20 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var20 != null) {
						MouseRecorder.closeInterface(var20, var6 == null || var20.group != var6.group);
					}

					if (var6 != null) {
						var6.remove();
						interfaceParents.put(var6, (long)var5);
					}

					var8 = CollisionMap.getWidget(var16);
					if (var8 != null) {
						CollisionMap.invalidateWidget(var8);
					}

					var8 = CollisionMap.getWidget(var5);
					if (var8 != null) {
						CollisionMap.invalidateWidget(var8);
						PendingSpawn.revalidateWidgetScroll(class9.Widget_interfaceComponents[var8.id >>> 16], var8, true);
					}

					if (rootInterface != -1) {
						WorldMapRectangle.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2146 == var1.serverPacket) {
					var16 = var3.readInt();
					if (var16 != field730) {
						field730 = var16;
						WorldMapCacheName.method664();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2156 == var1.serverPacket) {
					UserComparator4.method3465(class194.field2346);
					var1.serverPacket = null;
					return true;
				}

				PlayerAppearance.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1336 != null ? var1.field1336.id : -1) + "," + (var1.field1337 != null ? var1.field1337.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				WorldMapRectangle.logOut();
			} catch (IOException var35) {
				LoginScreenAnimation.method1903();
			} catch (Exception var36) {
				var17 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1336 != null ? var1.field1336.id : -1) + "," + (var1.field1337 != null ? var1.field1337.id : -1) + "," + var1.serverPacketLength + "," + (PlayerAppearance.localPlayer.pathX[0] + NetFileRequest.baseX * 64) + "," + (PlayerAppearance.localPlayer.pathY[0] + class41.baseY * 64) + ",";

				for (var18 = 0; var18 < var1.serverPacketLength && var18 < 50; ++var18) {
					var17 = var17 + var3.array[var18] + ",";
				}

				PlayerAppearance.RunException_sendStackTrace(var17, var36);
				WorldMapRectangle.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "33"
	)
	@Export("menu")
	final void menu() {
		VertexNormal.method3068();
		if (class171.dragInventoryWidget == null) {
			if (clickedWidget == null) {
				int var1 = MouseHandler.MouseHandler_lastButton;
				int var2;
				int var3;
				int var4;
				int var5;
				int var7;
				int var8;
				if (isMenuOpen) {
					if (var1 != 1 && (UserComparator9.mouseCam || var1 != 4)) {
						var2 = MouseHandler.MouseHandler_x;
						var3 = MouseHandler.MouseHandler_y;
						if (var2 < AbstractUserComparator.menuX - 10 || var2 > AbstractUserComparator.menuX + Occluder.menuWidth + 10 || var3 < DynamicObject.menuY - 10 || var3 > class182.menuHeight + DynamicObject.menuY + 10) {
							isMenuOpen = false;
							Frames.method3352(AbstractUserComparator.menuX, DynamicObject.menuY, Occluder.menuWidth, class182.menuHeight);
						}
					}

					if (var1 == 1 || !UserComparator9.mouseCam && var1 == 4) {
						var2 = AbstractUserComparator.menuX;
						var3 = DynamicObject.menuY;
						var4 = Occluder.menuWidth;
						var5 = MouseHandler.MouseHandler_lastPressedX;
						int var10 = MouseHandler.MouseHandler_lastPressedY;
						var7 = -1;

						for (var8 = 0; var8 < menuOptionsCount; ++var8) {
							int var9 = (menuOptionsCount - 1 - var8) * 15 + var3 + 31;
							if (var5 > var2 && var5 < var4 + var2 && var10 > var9 - 13 && var10 < var9 + 3) {
								var7 = var8;
							}
						}

						if (var7 != -1) {
							FontName.method5356(var7);
						}

						isMenuOpen = false;
						Frames.method3352(AbstractUserComparator.menuX, DynamicObject.menuY, Occluder.menuWidth, class182.menuHeight);
					}
				} else {
					var2 = WorldMapSprite.method463();
					if ((var1 == 1 || !UserComparator9.mouseCam && var1 == 4) && var2 >= 0) {
						var3 = menuOpcodes[var2];
						if (var3 == 39 || var3 == 40 || var3 == 41 || var3 == 42 || var3 == 43 || var3 == 33 || var3 == 34 || var3 == 35 || var3 == 36 || var3 == 37 || var3 == 38 || var3 == 1005) {
							var4 = menuArguments1[var2];
							var5 = menuArguments2[var2];
							Widget var6 = CollisionMap.getWidget(var5);
							if (WorldMapSection2.method378(FaceNormal.getWidgetFlags(var6)) || BoundaryObject.method3341(FaceNormal.getWidgetFlags(var6))) {
								if (class171.dragInventoryWidget != null && !field848 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) {
									var7 = draggedWidgetX;
									var8 = draggedWidgetY;
									WorldMapDecoration.method379(WorldMapSection1.tempMenuAction, var7, var8);
									WorldMapSection1.tempMenuAction = null;
								}

								field848 = false;
								itemDragDuration = 0;
								if (class171.dragInventoryWidget != null) {
									CollisionMap.invalidateWidget(class171.dragInventoryWidget);
								}

								class171.dragInventoryWidget = CollisionMap.getWidget(var5);
								dragItemSlotSource = var4;
								draggedWidgetX = MouseHandler.MouseHandler_lastPressedX;
								draggedWidgetY = MouseHandler.MouseHandler_lastPressedY;
								if (var2 >= 0) {
									WorldMapSection1.tempMenuAction = new MenuAction();
									WorldMapSection1.tempMenuAction.param0 = menuArguments1[var2];
									WorldMapSection1.tempMenuAction.param1 = menuArguments2[var2];
									WorldMapSection1.tempMenuAction.opcode = menuOpcodes[var2];
									WorldMapSection1.tempMenuAction.identifier = menuIdentifiers[var2];
									WorldMapSection1.tempMenuAction.action = menuActions[var2];
								}

								CollisionMap.invalidateWidget(class171.dragInventoryWidget);
								return;
							}
						}
					}

					if ((var1 == 1 || !UserComparator9.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) {
						var1 = 2;
					}

					if ((var1 == 1 || !UserComparator9.mouseCam && var1 == 4) && menuOptionsCount > 0) {
						FontName.method5356(var2);
					}

					if (var1 == 2 && menuOptionsCount > 0) {
						this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}
				}

			}
		}
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-745678378"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = WorldMapSprite.method463();
		return (leftClickOpensMenu == 1 && menuOptionsCount > 2 || Players.method2225(var1)) && !menuShiftClick[var1];
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2086272336"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		BuddyRankComparator.method3522(var1, var2);
		ArchiveLoader.scene.menuOpen(GameObject.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-6"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		WorldMapManager.method686(rootInterface, IgnoreList.canvasWidth, ModelData0.canvasHeight, var1);
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(Lhe;I)V",
		garbageValue = "1858163346"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : CollisionMap.getWidget(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = IgnoreList.canvasWidth;
			var4 = ModelData0.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		TileItem.alignWidgetSize(var1, var3, var4, false);
		class7.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "829781970"
	)
	final void method1381() {
		CollisionMap.invalidateWidget(clickedWidget);
		++ScriptFrame.widgetDragDuration;
		if (field829 && field859) {
			int var1 = MouseHandler.MouseHandler_x;
			int var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field827) {
				var1 = field827;
			}

			if (var1 + clickedWidget.width > field827 + clickedWidgetParent.width) {
				var1 = field827 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field716) {
				var2 = field716;
			}

			if (var2 + clickedWidget.height > field716 + clickedWidgetParent.height) {
				var2 = field716 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field853;
			int var4 = var2 - field862;
			int var5 = clickedWidget.dragZoneSize;
			if (ScriptFrame.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field827 + clickedWidgetParent.scrollX;
			int var7 = var2 - field716 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				class22.runScriptEvent(var8);
			}

			if (MouseHandler.MouseHandler_currentButton == 0) {
				if (isDraggingWidget) {
					if (clickedWidget.onDragComplete != null) {
						var8 = new ScriptEvent();
						var8.widget = clickedWidget;
						var8.mouseX = var6;
						var8.mouseY = var7;
						var8.dragTarget = draggedOnWidget;
						var8.args = clickedWidget.onDragComplete;
						class22.runScriptEvent(var8);
					}

					if (draggedOnWidget != null) {
						Widget var15 = clickedWidget;
						int var11 = FaceNormal.getWidgetFlags(var15);
						int var10 = var11 >> 17 & 7;
						int var12 = var10;
						Widget var17;
						if (var10 == 0) {
							var17 = null;
						} else {
							int var13 = 0;

							while (true) {
								if (var13 >= var12) {
									var17 = var15;
									break;
								}

								var15 = CollisionMap.getWidget(var15.parentId);
								if (var15 == null) {
									var17 = null;
									break;
								}

								++var13;
							}
						}

						if (var17 != null) {
							PacketBufferNode var16 = ItemContainer.getPacketBufferNode(ClientPacket.field2298, packetWriter.isaacCipher);
							var16.packetBuffer.method5578(draggedOnWidget.itemId);
							var16.packetBuffer.method5739(clickedWidget.itemId);
							var16.packetBuffer.method5718(clickedWidget.id);
							var16.packetBuffer.writeShort(clickedWidget.childIndex);
							var16.packetBuffer.method5739(draggedOnWidget.childIndex);
							var16.packetBuffer.method5588(draggedOnWidget.id);
							packetWriter.addNode(var16);
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(widgetClickX + field853, widgetClickY + field862);
				} else if (menuOptionsCount > 0) {
					int var14 = field853 + widgetClickX;
					int var9 = widgetClickY + field862;
					WorldMapDecoration.method379(WorldMapSection1.tempMenuAction, var14, var9);
					WorldMapSection1.tempMenuAction = null;
				}

				clickedWidget = null;
			}

		} else {
			if (ScriptFrame.widgetDragDuration > 1) {
				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(I)Lki;",
		garbageValue = "82536799"
	)
	@Export("username")
	public Username username() {
		return PlayerAppearance.localPlayer != null ? PlayerAppearance.localPlayer.username : null;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1868992104"
	)
	public static void method1583() {
		if (NetCache.NetCache_socket != null) {
			NetCache.NetCache_socket.close();
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-256549050"
	)
	static void method1799() {
		if (Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}

	}
}
