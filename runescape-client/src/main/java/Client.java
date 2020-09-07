import java.io.IOException;
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
	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = -738274361
	)
	static int field881;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = -548379031
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("ob")
	@ObfuscatedGetter(
		longValue = -5904511497921322921L
	)
	static long field890;
	@ObfuscatedName("oo")
	static boolean[] field882;
	@ObfuscatedName("or")
	static boolean[] field884;
	@ObfuscatedName("oz")
	static boolean[] field883;
	@ObfuscatedName("no")
	static boolean field880;
	@ObfuscatedName("ne")
	@ObfuscatedGetter(
		intValue = -565689219
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("ol")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("sr")
	@ObfuscatedGetter(
		intValue = -509271729
	)
	public static int field946;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = 1680416831
	)
	static int field870;
	@ObfuscatedName("nx")
	static boolean field799;
	@ObfuscatedName("qk")
	static boolean field704;
	@ObfuscatedName("nc")
	@ObfuscatedGetter(
		intValue = -1698989409
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("nl")
	@ObfuscatedGetter(
		intValue = 907230791
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("ng")
	@ObfuscatedGetter(
		intValue = -1025599455
	)
	static int field856;
	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("os")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("ou")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("nr")
	@ObfuscatedGetter(
		intValue = -2016835687
	)
	static int field785;
	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = 2115914755
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("oy")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		intValue = -1986502797
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("om")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("nz")
	@ObfuscatedGetter(
		intValue = -1644651357
	)
	static int field864;
	@ObfuscatedName("ta")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	static final ApproximateRouteStrategy field950;
	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("nd")
	@ObfuscatedGetter(
		intValue = 1703929767
	)
	static int field859;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		intValue = 1650820599
	)
	static int field947;
	@ObfuscatedName("ni")
	@ObfuscatedGetter(
		intValue = 918307921
	)
	static int field795;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = -1571954779
	)
	static int field775;
	@ObfuscatedName("qu")
	@ObfuscatedGetter(
		intValue = -1071833827
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("nw")
	static int[] field863;
	@ObfuscatedName("te")
	static int[] field830;
	@ObfuscatedName("tv")
	static int[] field952;
	@ObfuscatedName("nv")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = 965072955
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		intValue = -259926039
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = 706119953
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		intValue = 347041669
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = 1612540519
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("ro")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = 940085397
	)
	static int field937;
	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	@Export("playerAppearance")
	static PlayerAppearance playerAppearance;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = -812618355
	)
	@Export("areaSoundEffectVolume")
	static int areaSoundEffectVolume;
	@ObfuscatedName("rz")
	static boolean[] field922;
	@ObfuscatedName("si")
	@ObfuscatedGetter(
		intValue = 1407217563
	)
	static int field942;
	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("qn")
	@ObfuscatedGetter(
		intValue = -751525007
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("qo")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("qi")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("qa")
	@ObfuscatedGetter(
		intValue = 1720412197
	)
	@Export("musicVolume")
	static int musicVolume;
	@ObfuscatedName("qp")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("sn")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("qx")
	@ObfuscatedSignature(
		descriptor = "[Ldj;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("se")
	@ObfuscatedGetter(
		intValue = 1815598231
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("qt")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = -549724569
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		intValue = 512054773
	)
	@Export("soundEffectVolume")
	static int soundEffectVolume;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = -1205130553
	)
	static int field902;
	@ObfuscatedName("pb")
	@ObfuscatedGetter(
		longValue = -1783844530730786273L
	)
	static long field901;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = 131534275
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("st")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = -127705051
	)
	static int field707;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = 1491507455
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = -1223881297
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("rw")
	static short field769;
	@ObfuscatedName("ru")
	static short field928;
	@ObfuscatedName("np")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("rm")
	static short field938;
	@ObfuscatedName("nt")
	@ObfuscatedGetter(
		intValue = 2062422777
	)
	static int field903;
	@ObfuscatedName("pl")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("ry")
	static short field934;
	@ObfuscatedName("rx")
	static short field932;
	@ObfuscatedName("sj")
	@ObfuscatedGetter(
		intValue = 1522828843
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("rq")
	static short field931;
	@ObfuscatedName("so")
	@ObfuscatedGetter(
		intValue = 112709455
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "[Llp;"
	)
	@Export("mapIcons")
	static Sprite[] mapIcons;
	@ObfuscatedName("pk")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = -618238831
	)
	static int field871;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = -372222431
	)
	static int field898;
	@ObfuscatedName("sv")
	@ObfuscatedGetter(
		intValue = -1397478813
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("rg")
	@ObfuscatedGetter(
		intValue = 1838939771
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = -1096742287
	)
	static int field873;
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = -1729596091
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = -1158906153
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = -1755840079
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("rd")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("rv")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("su")
	@ObfuscatedGetter(
		intValue = 197263845
	)
	static int field949;
	@ObfuscatedName("pa")
	static int[] field900;
	@ObfuscatedName("po")
	static int[] field899;
	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	static NodeDeque field877;
	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "[Lv;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	static NodeDeque field912;
	@ObfuscatedName("oi")
	@ObfuscatedGetter(
		intValue = -1452534743
	)
	static int field872;
	@ObfuscatedName("rr")
	static int[] field740;
	@ObfuscatedName("rh")
	static int[] field678;
	@ObfuscatedName("rl")
	static int[] field926;
	@ObfuscatedName("rk")
	static int[] field925;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = 250230651
	)
	static int field865;
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = 2027886515
	)
	static int field840;
	@ObfuscatedName("mm")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pj")
	static long[] field896;
	@ObfuscatedName("nq")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("nu")
	@ObfuscatedGetter(
		intValue = -1157540783
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = -541473949
	)
	static int field794;
	@ObfuscatedName("pr")
	static int[] field892;
	@ObfuscatedName("pm")
	static String field913;
	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("oe")
	@ObfuscatedGetter(
		intValue = -1163412349
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lft;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("ac")
	static boolean field841;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 908915111
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -2146116225
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -77282259
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bg")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("br")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1456761211
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("ba")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1382758875
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("cu")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -925075011
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		longValue = -6291898819943529903L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -359806485
	)
	static int field798;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -40955973
	)
	static int field686;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		longValue = -3347850541832475541L
	)
	static long field687;
	@ObfuscatedName("cx")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("cp")
	@Export("displayFps")
	static boolean displayFps;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1440208899
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1549228635
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 748257717
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1282268129
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1561023113
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 4072295
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -1130712819
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 573846843
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -1575899159
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -1866562123
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -1673766287
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -1209579601
	)
	static int field712;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("archive1")
	static Archive archive1;
	@ObfuscatedName("ek")
	@ObfuscatedGetter(
		intValue = -55276913
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("ep")
	@ObfuscatedGetter(
		intValue = -789394093
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = -600822047
	)
	static int field822;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = -1163587017
	)
	static int field708;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = 1593310077
	)
	static int field709;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	static class169 field710;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = -764965423
	)
	@Export("port1")
	static int port1;
	@ObfuscatedName("ex")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("fq")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "[Lcw;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("fv")
	@ObfuscatedGetter(
		intValue = 1098794217
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("fz")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("fk")
	@ObfuscatedGetter(
		intValue = -1040652309
	)
	static int field702;
	@ObfuscatedName("fe")
	static int[] field721;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("ff")
	@ObfuscatedGetter(
		intValue = 1553785571
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("fr")
	static boolean field713;
	@ObfuscatedName("fi")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("fw")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = -621015009
	)
	static int field728;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = -1370106321
	)
	static int field711;
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = -814779395
	)
	static int field895;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = -544516033
	)
	static int field791;
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = 1012536071
	)
	static int field732;
	@ObfuscatedName("gp")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("gt")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("gn")
	static final int[] field736;
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = -570359939
	)
	static int field737;
	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "[Llp;"
	)
	@Export("headIconPrayerSprites")
	static Sprite[] headIconPrayerSprites;
	@ObfuscatedName("hh")
	@ObfuscatedGetter(
		intValue = 1066075353
	)
	static int field739;
	@ObfuscatedName("hi")
	@ObfuscatedGetter(
		intValue = 41176893
	)
	static int field670;
	@ObfuscatedName("hk")
	@ObfuscatedGetter(
		intValue = -50916181
	)
	static int field741;
	@ObfuscatedName("hp")
	@ObfuscatedGetter(
		intValue = 1119037931
	)
	static int field742;
	@ObfuscatedName("ht")
	static boolean field743;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = -977399091
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("hs")
	@ObfuscatedGetter(
		intValue = -1443068431
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("hr")
	@ObfuscatedGetter(
		intValue = -711285885
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("hl")
	@ObfuscatedGetter(
		intValue = 1183878553
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		intValue = -1283166721
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = -759899857
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("hw")
	@ObfuscatedGetter(
		intValue = -1838293597
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("hy")
	@ObfuscatedGetter(
		intValue = 170315783
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = -1104542973
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = 692568591
	)
	static int field753;
	@ObfuscatedName("ig")
	@ObfuscatedGetter(
		intValue = -1371213621
	)
	static int field796;
	@ObfuscatedName("io")
	@ObfuscatedGetter(
		intValue = 1555483319
	)
	static int field755;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = 1271248647
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("iw")
	@ObfuscatedGetter(
		intValue = -883817203
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = 1521960939
	)
	static int field758;
	@ObfuscatedName("id")
	static boolean field759;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("iq")
	@ObfuscatedGetter(
		intValue = -1208339905
	)
	static int field829;
	@ObfuscatedName("ik")
	static boolean field761;
	@ObfuscatedName("iv")
	@ObfuscatedGetter(
		intValue = 1611520535
	)
	static int field762;
	@ObfuscatedName("ib")
	@ObfuscatedGetter(
		intValue = 997551691
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = -1325247089
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("iu")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("ie")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("ir")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("in")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("iy")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("il")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("jj")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("jp")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("jd")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = -383835205
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = -22531197
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("ju")
	@ObfuscatedGetter(
		intValue = -1575851953
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = -693132223
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = 1819425115
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = -1679326135
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = -1707383795
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("jv")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("jb")
	@ObfuscatedGetter(
		intValue = 505509921
	)
	static int field782;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = 11951309
	)
	static int field944;
	@ObfuscatedName("jw")
	@ObfuscatedGetter(
		intValue = 526374909
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = -1126513777
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = -1580012453
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = -1831513887
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("jy")
	static boolean field788;
	@ObfuscatedName("jz")
	@ObfuscatedGetter(
		intValue = -1995966425
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = -331224419
	)
	static int field790;
	@ObfuscatedName("jn")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "[Lbf;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = -1852431749
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = 648141605
	)
	static int field888;
	@ObfuscatedName("kw")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = -1302257309
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = 157805175
	)
	static int field771;
	@ObfuscatedName("ks")
	static int[] field930;
	@ObfuscatedName("kd")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("kz")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("kl")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("kv")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("kr")
	@ObfuscatedGetter(
		intValue = 1152347413
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "[[[Lji;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("kf")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("kn")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("kg")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = -475626583
	)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("ll")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 366838629
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = 1781251597
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("la")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("lb")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("ly")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("lt")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("lg")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("lq")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("lo")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("lc")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("lu")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("lv")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("lw")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = 2121046681
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = -116000717
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = 1628287905
	)
	static int field828;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = -1310390487
	)
	static int field770;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = -1061875105
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("md")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		intValue = -1613408879
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = -1738766663
	)
	static int field834;
	@ObfuscatedName("mp")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("mu")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("mi")
	@ObfuscatedGetter(
		intValue = -1035655229
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	Buffer field754;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lm;"
	)
	class9 field714;

	static {
		field841 = true; // L: 183
		worldId = 1; // L: 184
		worldProperties = 0; // L: 185
		gameBuild = 0; // L: 187
		isMembersWorld = false; // L: 190
		isLowDetail = false; // L: 191
		clientType = -1; // L: 196
		onMobile = false; // L: 197
		gameState = 0; // L: 198
		isLoading = true; // L: 219
		cycle = 0; // L: 220
		mouseLastLastPressedTimeMillis = -1L; // L: 221
		field798 = -1; // L: 223
		field686 = -1; // L: 224
		field687 = -1L; // L: 225
		hadFocus = true; // L: 226
		displayFps = false; // L: 227
		rebootTimer = 0; // L: 228
		hintArrowType = 0; // L: 229
		hintArrowNpcIndex = 0; // L: 230
		hintArrowPlayerIndex = 0; // L: 231
		hintArrowX = 0; // L: 232
		hintArrowY = 0; // L: 233
		hintArrowHeight = 0; // L: 234
		hintArrowSubX = 0; // L: 235
		hintArrowSubY = 0; // L: 236
		playerAttackOption = AttackOption.AttackOption_hidden; // L: 238
		npcAttackOption = AttackOption.AttackOption_hidden; // L: 239
		titleLoadingStage = 0; // L: 241
		js5ConnectState = 0; // L: 244
		field712 = 0; // L: 245
		js5Errors = 0; // L: 267
		loginState = 0; // L: 269
		field822 = 0; // L: 270
		field708 = 0; // L: 271
		field709 = 0; // L: 272
		field710 = class169.field2043; // L: 273
		Login_isUsernameRemembered = false; // L: 282
		secureRandomFuture = new SecureRandomFuture(); // L: 283
		randomDatData = null; // L: 288
		npcs = new NPC[32768]; // L: 292
		npcCount = 0; // L: 293
		npcIndices = new int[32768]; // L: 294
		field702 = 0; // L: 295
		field721 = new int[250]; // L: 296
		packetWriter = new PacketWriter(); // L: 299
		logoutTimer = 0; // L: 301
		field713 = false; // L: 302
		useBufferedSocket = true; // L: 303
		timer = new Timer(); // L: 304
		fontsMap = new HashMap(); // L: 310
		field728 = 0; // L: 317
		field711 = 1; // L: 318
		field895 = 0; // L: 319
		field791 = 1; // L: 320
		field732 = 0; // L: 321
		collisionMaps = new CollisionMap[4]; // L: 329
		isInInstance = false; // L: 330
		instanceChunkTemplates = new int[4][13][13]; // L: 331
		field736 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 332
		field737 = 0; // L: 335
		field739 = 2301979; // L: 347
		field670 = 5063219; // L: 348
		field741 = 3353893; // L: 349
		field742 = 7759444; // L: 350
		field743 = false; // L: 351
		alternativeScrollbarWidth = 0; // L: 352
		camAngleX = 128; // L: 360
		camAngleY = 0; // L: 361
		camAngleDY = 0; // L: 362
		camAngleDX = 0; // L: 363
		mouseCamClickedX = 0; // L: 364
		mouseCamClickedY = 0; // L: 365
		oculusOrbState = 0; // L: 366
		camFollowHeight = 50; // L: 367
		field753 = 0; // L: 371
		field796 = 0; // L: 372
		field755 = 0; // L: 373
		oculusOrbNormalSpeed = 12; // L: 375
		oculusOrbSlowedSpeed = 6; // L: 376
		field758 = 0; // L: 377
		field759 = false; // L: 378
		field829 = 0; // L: 379
		field761 = false; // L: 380
		field762 = 0; // L: 381
		overheadTextCount = 0; // L: 382
		overheadTextLimit = 50; // L: 383
		overheadTextXs = new int[overheadTextLimit]; // L: 384
		overheadTextYs = new int[overheadTextLimit]; // L: 385
		overheadTextAscents = new int[overheadTextLimit]; // L: 386
		overheadTextXOffsets = new int[overheadTextLimit]; // L: 387
		overheadTextColors = new int[overheadTextLimit]; // L: 388
		overheadTextEffects = new int[overheadTextLimit]; // L: 389
		overheadTextCyclesRemaining = new int[overheadTextLimit]; // L: 390
		overheadText = new String[overheadTextLimit]; // L: 391
		tileLastDrawnActor = new int[104][104]; // L: 392
		viewportDrawCount = 0; // L: 393
		viewportTempX = -1; // L: 394
		viewportTempY = -1; // L: 395
		mouseCrossX = 0; // L: 396
		mouseCrossY = 0; // L: 397
		mouseCrossState = 0; // L: 398
		mouseCrossColor = 0; // L: 399
		showMouseCross = true; // L: 400
		field782 = 0; // L: 402
		field944 = 0; // L: 403
		dragItemSlotSource = 0; // L: 406
		draggedWidgetX = 0; // L: 407
		draggedWidgetY = 0; // L: 408
		dragItemSlotDestination = 0; // L: 409
		field788 = false; // L: 410
		itemDragDuration = 0; // L: 411
		field790 = 0; // L: 412
		showLoadingMessages = true; // L: 414
		players = new Player[2048]; // L: 416
		localPlayerIndex = -1; // L: 418
		field888 = 0; // L: 419
		renderSelf = true; // L: 421
		drawPlayerNames = 0; // L: 426
		field771 = 0; // L: 427
		field930 = new int[1000]; // L: 428
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 430
		playerMenuActions = new String[8]; // L: 431
		playerOptionsPriorities = new boolean[8]; // L: 432
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 433
		combatTargetPlayerIndex = -1; // L: 434
		groundItems = new NodeDeque[4][104][104]; // L: 435
		pendingSpawns = new NodeDeque(); // L: 436
		projectiles = new NodeDeque(); // L: 437
		graphicsObjects = new NodeDeque(); // L: 438
		currentLevels = new int[25]; // L: 439
		levels = new int[25]; // L: 440
		experience = new int[25]; // L: 441
		leftClickOpensMenu = 0; // L: 442
		isMenuOpen = false; // L: 443
		menuOptionsCount = 0; // L: 449
		menuArguments1 = new int[500]; // L: 450
		menuArguments2 = new int[500]; // L: 451
		menuOpcodes = new int[500]; // L: 452
		menuIdentifiers = new int[500]; // L: 453
		menuActions = new String[500]; // L: 454
		menuTargets = new String[500]; // L: 455
		menuShiftClick = new boolean[500]; // L: 456
		followerOpsLowPriority = false; // L: 457
		shiftClickDrop = false; // L: 459
		tapToDrop = false; // L: 460
		showMouseOverText = true; // L: 461
		viewportX = -1; // L: 462
		viewportY = -1; // L: 463
		field828 = 0; // L: 467
		field770 = 50; // L: 468
		isItemSelected = 0; // L: 469
		selectedItemName = null; // L: 473
		isSpellSelected = false; // L: 474
		selectedSpellChildIndex = -1; // L: 476
		field834 = -1; // L: 477
		selectedSpellActionName = null; // L: 479
		selectedSpellName = null; // L: 480
		rootInterface = -1; // L: 481
		interfaceParents = new NodeHashTable(8); // L: 482
		field865 = 0; // L: 487
		field840 = -1; // L: 488
		chatEffects = 0; // L: 489
		field707 = 0; // L: 490
		meslayerContinueWidget = null; // L: 491
		runEnergy = 0; // L: 492
		weight = 0; // L: 493
		staffModLevel = 0; // L: 494
		followerIndex = -1; // L: 495
		playerMod = false; // L: 496
		viewportWidget = null; // L: 497
		clickedWidget = null; // L: 498
		clickedWidgetParent = null; // L: 499
		widgetClickX = 0; // L: 500
		widgetClickY = 0; // L: 501
		draggedOnWidget = null; // L: 502
		field799 = false; // L: 503
		field856 = -1; // L: 504
		field785 = -1; // L: 505
		field880 = false; // L: 506
		field859 = -1; // L: 507
		field795 = -1; // L: 508
		isDraggingWidget = false; // L: 509
		cycleCntr = 1; // L: 514
		field863 = new int[32]; // L: 517
		field864 = 0; // L: 518
		changedItemContainers = new int[32]; // L: 519
		field903 = 0; // L: 520
		changedSkills = new int[32]; // L: 521
		changedSkillsCount = 0; // L: 522
		chatCycle = 0; // L: 523
		field870 = 0; // L: 524
		field871 = 0; // L: 525
		field872 = 0; // L: 526
		field873 = 0; // L: 527
		field775 = 0; // L: 528
		mouseWheelRotation = 0; // L: 531
		scriptEvents = new NodeDeque(); // L: 532
		field877 = new NodeDeque(); // L: 533
		field912 = new NodeDeque(); // L: 534
		widgetFlags = new NodeHashTable(512); // L: 535
		rootWidgetCount = 0; // L: 537
		field881 = -2; // L: 538
		field882 = new boolean[100]; // L: 539
		field883 = new boolean[100]; // L: 540
		field884 = new boolean[100]; // L: 541
		rootWidgetXs = new int[100]; // L: 542
		rootWidgetYs = new int[100]; // L: 543
		rootWidgetWidths = new int[100]; // L: 544
		rootWidgetHeights = new int[100]; // L: 545
		gameDrawingMode = 0; // L: 546
		field890 = 0L; // L: 547
		isResizable = true; // L: 548
		field892 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 555
		publicChatMode = 0; // L: 556
		tradeChatMode = 0; // L: 558
		field913 = ""; // L: 559
		field896 = new long[100]; // L: 561
		field794 = 0; // L: 562
		field898 = 0; // L: 564
		field899 = new int[128]; // L: 565
		field900 = new int[128]; // L: 566
		field901 = -1L; // L: 567
		field902 = -1; // L: 570
		mapIconCount = 0; // L: 571
		mapIconXs = new int[1000]; // L: 572
		mapIconYs = new int[1000]; // L: 573
		mapIcons = new Sprite[1000]; // L: 574
		destinationX = 0; // L: 575
		destinationY = 0; // L: 576
		minimapState = 0; // L: 583
		musicVolume = 255; // L: 584
		currentTrackGroupId = -1; // L: 585
		field704 = false; // L: 586
		soundEffectVolume = 127; // L: 588
		areaSoundEffectVolume = 127; // L: 589
		soundEffectCount = 0; // L: 594
		soundEffectIds = new int[50]; // L: 595
		queuedSoundEffectLoops = new int[50]; // L: 596
		queuedSoundEffectDelays = new int[50]; // L: 597
		soundLocations = new int[50]; // L: 598
		soundEffects = new SoundEffect[50]; // L: 599
		isCameraLocked = false; // L: 601
		field922 = new boolean[5]; // L: 613
		field678 = new int[5]; // L: 614
		field740 = new int[5]; // L: 615
		field925 = new int[5]; // L: 616
		field926 = new int[5]; // L: 617
		field769 = 256; // L: 618
		field928 = 205; // L: 619
		zoomHeight = 256; // L: 620
		zoomWidth = 320; // L: 621
		field931 = 1; // L: 622
		field932 = 32767; // L: 623
		field938 = 1; // L: 624
		field934 = 32767; // L: 625
		viewportOffsetX = 0; // L: 626
		viewportOffsetY = 0; // L: 627
		viewportWidth = 0; // L: 628
		viewportHeight = 0; // L: 629
		viewportZoom = 0; // L: 630
		playerAppearance = new PlayerAppearance(); // L: 632
		field937 = -1; // L: 633
		field942 = -1; // L: 634
		platformInfoProvider = new DesktopPlatformInfoProvider(); // L: 636
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 638
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 641
		field946 = -1; // L: 648
		archiveLoaders = new ArrayList(10); // L: 649
		archiveLoadersDone = 0; // L: 650
		field949 = 0; // L: 651
		field950 = new ApproximateRouteStrategy(); // L: 660
		field830 = new int[50]; // L: 661
		field952 = new int[50]; // L: 662
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "912814062"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field890 = PacketWriter.currentTimeMillis() + 500L; // L: 3888
		this.resizeJS(); // L: 3889
		if (rootInterface != -1) { // L: 3890
			this.resizeRoot(true);
		}

	} // L: 3891

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1974240025"
	)
	@Export("setUp")
	protected final void setUp() {
		class277.method5089(new int[]{20, 260, 10000}, new int[]{1000, 100, 500}); // L: 784
		port1 = gameBuild == 0 ? 43594 : worldId + 40000; // L: 785
		class23.port2 = gameBuild == 0 ? 443 : worldId + 50000; // L: 786
		WorldMapScaleHandler.port3 = port1; // L: 787
		Calendar.field2535 = class224.field2587; // L: 788
		WorldMapSprite.field253 = class224.field2589; // L: 789
		GrandExchangeOfferTotalQuantityComparator.field83 = class224.field2584; // L: 790
		UserComparator7.field2021 = class224.field2586; // L: 791
		UserComparator4.urlRequester = new UrlRequester(); // L: 792
		this.setUpKeyboard(); // L: 793
		this.setUpMouse(); // L: 794
		Player.mouseWheel = this.mouseWheel(); // L: 795
		Skeleton.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 796
		AccessFile var2 = null; // L: 799
		ClientPreferences var3 = new ClientPreferences(); // L: 800

		try {
			var2 = class2.getPreferencesFile("", Tiles.field532.name, false); // L: 802
			byte[] var4 = new byte[(int)var2.length()]; // L: 803

			int var6;
			for (int var5 = 0; var5 < var4.length; var5 += var6) { // L: 804 805 808
				var6 = var2.read(var4, var5, var4.length - var5); // L: 806
				if (var6 == -1) { // L: 807
					throw new IOException();
				}
			}

			var3 = new ClientPreferences(new Buffer(var4)); // L: 810
		} catch (Exception var8) { // L: 812
		}

		try {
			if (var2 != null) { // L: 814
				var2.close();
			}
		} catch (Exception var7) { // L: 816
		}

		Tile.clientPreferences = var3; // L: 819
		this.setUpClipboard(); // L: 820
		VarbitDefinition.method4593(this, class60.null_string); // L: 821
		if (gameBuild != 0) { // L: 822
			displayFps = true;
		}

		FontName.setWindowedMode(Tile.clientPreferences.windowMode); // L: 823
		class60.friendSystem = new FriendSystem(WorldMapAreaData.loginType); // L: 824
	} // L: 825

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-720509728"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 828
		this.doCycleJs5(); // L: 829
		class58.method907(); // L: 830
		GraphicsObject.method2095(); // L: 831
		RouteStrategy.playPcmPlayers(); // L: 832
		int var2;
		synchronized(KeyHandler.KeyHandler_instance) { // L: 834
			++KeyHandler.KeyHandler_idleCycles; // L: 835
			KeyHandler.field423 = KeyHandler.field399; // L: 836
			KeyHandler.field422 = 0; // L: 837
			if (KeyHandler.field418 >= 0) { // L: 838
				while (KeyHandler.field418 != KeyHandler.field417) { // L: 843
					var2 = KeyHandler.field409[KeyHandler.field417]; // L: 844
					KeyHandler.field417 = KeyHandler.field417 + 1 & 127; // L: 845
					if (var2 < 0) { // L: 846
						KeyHandler.KeyHandler_pressedKeys[~var2] = false;
					} else {
						if (!KeyHandler.KeyHandler_pressedKeys[var2] && KeyHandler.field422 < KeyHandler.field421.length - 1) { // L: 848
							KeyHandler.field421[++KeyHandler.field422 - 1] = var2; // L: 849
						}

						KeyHandler.KeyHandler_pressedKeys[var2] = true; // L: 851
					}
				}
			} else {
				for (var2 = 0; var2 < 112; ++var2) { // L: 839
					KeyHandler.KeyHandler_pressedKeys[var2] = false;
				}

				KeyHandler.field418 = KeyHandler.field417; // L: 840
			}

			if (KeyHandler.field422 > 0) { // L: 855
				KeyHandler.KeyHandler_idleCycles = 0;
			}

			KeyHandler.field399 = KeyHandler.field424; // L: 856
		}

		WallDecoration.method3409(); // L: 859
		if (Player.mouseWheel != null) { // L: 860
			int var43 = Player.mouseWheel.useRotation(); // L: 861
			mouseWheelRotation = var43; // L: 862
		}

		if (gameState == 0) { // L: 864
			class3.load(); // L: 865
			WorldMapLabel.method498(); // L: 866
		} else if (gameState == 5) { // L: 868
			class3.doCycleTitle(this); // L: 869
			class3.load(); // L: 870
			WorldMapLabel.method498(); // L: 871
		} else if (gameState != 10 && gameState != 11) { // L: 873
			if (gameState == 20) { // L: 874
				class3.doCycleTitle(this); // L: 875
				this.doCycleLoggedOut(); // L: 876
			} else if (gameState == 25) { // L: 878
				AttackOption.method2154(false); // L: 879
				field728 = 0; // L: 880
				boolean var54 = true; // L: 881

				for (var2 = 0; var2 < AbstractUserComparator.regionLandArchives.length; ++var2) { // L: 882
					if (GrandExchangeEvents.regionMapArchiveIds[var2] != -1 && AbstractUserComparator.regionLandArchives[var2] == null) { // L: 883 884
						AbstractUserComparator.regionLandArchives[var2] = WorldMapLabel.archive5.takeFile(GrandExchangeEvents.regionMapArchiveIds[var2], 0); // L: 885
						if (AbstractUserComparator.regionLandArchives[var2] == null) { // L: 886
							var54 = false; // L: 887
							++field728; // L: 888
						}
					}

					if (Skeleton.regionLandArchiveIds[var2] != -1 && AbstractWorldMapData.regionMapArchives[var2] == null) { // L: 892 893
						AbstractWorldMapData.regionMapArchives[var2] = WorldMapLabel.archive5.takeFileEncrypted(Skeleton.regionLandArchiveIds[var2], 0, BoundaryObject.xteaKeys[var2]); // L: 894
						if (AbstractWorldMapData.regionMapArchives[var2] == null) { // L: 895
							var54 = false; // L: 896
							++field728; // L: 897
						}
					}
				}

				if (!var54) { // L: 902
					field732 = 1; // L: 903
				} else {
					field895 = 0; // L: 906
					var54 = true; // L: 907

					int var4;
					int var5;
					for (var2 = 0; var2 < AbstractUserComparator.regionLandArchives.length; ++var2) { // L: 908
						byte[] var3 = AbstractWorldMapData.regionMapArchives[var2]; // L: 909
						if (var3 != null) { // L: 910
							var4 = (class90.regions[var2] >> 8) * 64 - WorldMapManager.baseX; // L: 911
							var5 = (class90.regions[var2] & 255) * 64 - WorldMapLabel.baseY; // L: 912
							if (isInInstance) { // L: 913
								var4 = 10; // L: 914
								var5 = 10; // L: 915
							}

							var54 &= class224.method4117(var3, var4, var5); // L: 917
						}
					}

					if (!var54) { // L: 920
						field732 = 2; // L: 921
					} else {
						if (field732 != 0) { // L: 924
							Actor.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
						}

						RouteStrategy.playPcmPlayers(); // L: 925
						ScriptEvent.scene.clear(); // L: 926

						for (var2 = 0; var2 < 4; ++var2) { // L: 927
							collisionMaps[var2].clear();
						}

						int var44;
						for (var2 = 0; var2 < 4; ++var2) { // L: 928
							for (var44 = 0; var44 < 104; ++var44) { // L: 929
								for (var4 = 0; var4 < 104; ++var4) { // L: 930
									Tiles.Tiles_renderFlags[var2][var44][var4] = 0; // L: 931
								}
							}
						}

						RouteStrategy.playPcmPlayers(); // L: 935
						MidiPcmStream.method3920(); // L: 936
						var2 = AbstractUserComparator.regionLandArchives.length; // L: 937
						ModeWhere.method3772(); // L: 938
						AttackOption.method2154(true); // L: 939
						int var7;
						int var8;
						int var10;
						int var11;
						int var12;
						int var13;
						int[] var10000;
						int var47;
						if (!isInInstance) { // L: 940
							var44 = 0;

							label624:
							while (true) {
								byte[] var6;
								if (var44 >= var2) {
									for (var44 = 0; var44 < var2; ++var44) { // L: 969
										var4 = (class90.regions[var44] >> 8) * 64 - WorldMapManager.baseX; // L: 970
										var5 = (class90.regions[var44] & 255) * 64 - WorldMapLabel.baseY; // L: 971
										var6 = AbstractUserComparator.regionLandArchives[var44]; // L: 972
										if (var6 == null && SpotAnimationDefinition.field3261 < 800) { // L: 973
											RouteStrategy.playPcmPlayers(); // L: 974
											Player.method1327(var4, var5, 64, 64); // L: 975
										}
									}

									AttackOption.method2154(true); // L: 978
									var44 = 0;

									while (true) {
										if (var44 >= var2) {
											break label624;
										}

										byte[] var46 = AbstractWorldMapData.regionMapArchives[var44]; // L: 980
										if (var46 != null) { // L: 981
											var5 = (class90.regions[var44] >> 8) * 64 - WorldMapManager.baseX; // L: 982
											var47 = (class90.regions[var44] & 255) * 64 - WorldMapLabel.baseY; // L: 983
											RouteStrategy.playPcmPlayers(); // L: 984
											BuddyRankComparator.method3524(var46, var5, var47, ScriptEvent.scene, collisionMaps); // L: 985
										}

										++var44; // L: 979
									}
								}

								var4 = (class90.regions[var44] >> 8) * 64 - WorldMapManager.baseX; // L: 942
								var5 = (class90.regions[var44] & 255) * 64 - WorldMapLabel.baseY; // L: 943
								var6 = AbstractUserComparator.regionLandArchives[var44]; // L: 944
								if (var6 != null) { // L: 945
									RouteStrategy.playPcmPlayers(); // L: 946
									var7 = class52.field396 * 8 - 48; // L: 947
									var8 = SpotAnimationDefinition.field3261 * 8 - 48; // L: 948
									CollisionMap[] var9 = collisionMaps; // L: 949
									var10 = 0;

									label621:
									while (true) {
										if (var10 >= 4) {
											Buffer var45 = new Buffer(var6); // L: 958
											var11 = 0;

											while (true) {
												if (var11 >= 4) {
													break label621;
												}

												for (var12 = 0; var12 < 64; ++var12) { // L: 960
													for (var13 = 0; var13 < 64; ++var13) { // L: 961
														DynamicObject.loadTerrain(var45, var11, var4 + var12, var5 + var13, var7, var8, 0); // L: 962
													}
												}

												++var11; // L: 959
											}
										}

										for (var11 = 0; var11 < 64; ++var11) { // L: 952
											for (var12 = 0; var12 < 64; ++var12) { // L: 953
												if (var4 + var11 > 0 && var4 + var11 < 103 && var12 + var5 > 0 && var5 + var12 < 103) { // L: 954
													var10000 = var9[var10].flags[var11 + var4];
													var10000[var12 + var5] &= -16777217;
												}
											}
										}

										++var10; // L: 951
									}
								}

								++var44; // L: 941
							}
						}

						int var48;
						if (isInInstance) { // L: 989
							var44 = 0;

							label570:
							while (true) {
								int var15;
								int var16;
								int var17;
								CollisionMap[] var19;
								int var21;
								int var22;
								int var23;
								Buffer var49;
								if (var44 >= 4) {
									for (var44 = 0; var44 < 13; ++var44) { // L: 1039
										for (var4 = 0; var4 < 13; ++var4) { // L: 1040
											var5 = instanceChunkTemplates[0][var44][var4]; // L: 1041
											if (var5 == -1) { // L: 1042
												Player.method1327(var44 * 8, var4 * 8, 8, 8); // L: 1043
											}
										}
									}

									AttackOption.method2154(true); // L: 1047
									var44 = 0;

									while (true) {
										if (var44 >= 4) {
											break label570;
										}

										RouteStrategy.playPcmPlayers(); // L: 1049

										for (var4 = 0; var4 < 13; ++var4) { // L: 1050
											label493:
											for (var5 = 0; var5 < 13; ++var5) { // L: 1051
												var47 = instanceChunkTemplates[var44][var4][var5]; // L: 1052
												if (var47 != -1) { // L: 1053
													var7 = var47 >> 24 & 3; // L: 1054
													var8 = var47 >> 1 & 3; // L: 1055
													var48 = var47 >> 14 & 1023; // L: 1056
													var10 = var47 >> 3 & 2047; // L: 1057
													var11 = (var48 / 8 << 8) + var10 / 8; // L: 1058

													for (var12 = 0; var12 < class90.regions.length; ++var12) { // L: 1059
														if (class90.regions[var12] == var11 && AbstractWorldMapData.regionMapArchives[var12] != null) { // L: 1060
															byte[] var50 = AbstractWorldMapData.regionMapArchives[var12]; // L: 1061
															int var51 = var4 * 8; // L: 1062
															var15 = var5 * 8; // L: 1063
															var16 = (var48 & 7) * 8; // L: 1064
															var17 = (var10 & 7) * 8; // L: 1065
															Scene var52 = ScriptEvent.scene; // L: 1066
															var19 = collisionMaps; // L: 1067
															var49 = new Buffer(var50); // L: 1069
															var21 = -1; // L: 1070

															while (true) {
																var22 = var49.method5632(); // L: 1072
																if (var22 == 0) { // L: 1073
																	continue label493;
																}

																var21 += var22; // L: 1074
																var23 = 0; // L: 1075

																while (true) {
																	int var24 = var49.readUShortSmart(); // L: 1077
																	if (var24 == 0) { // L: 1078
																		break;
																	}

																	var23 += var24 - 1; // L: 1079
																	int var25 = var23 & 63; // L: 1080
																	int var26 = var23 >> 6 & 63; // L: 1081
																	int var27 = var23 >> 12; // L: 1082
																	int var28 = var49.readUnsignedByte(); // L: 1083
																	int var29 = var28 >> 2; // L: 1084
																	int var30 = var28 & 3; // L: 1085
																	if (var7 == var27 && var26 >= var16 && var26 < var16 + 8 && var25 >= var17 && var25 < var17 + 8) { // L: 1086
																		ObjectDefinition var31 = MidiPcmStream.getObjectDefinition(var21); // L: 1087
																		int var34 = var26 & 7; // L: 1090
																		int var35 = var25 & 7; // L: 1091
																		int var37 = var31.sizeX; // L: 1093
																		int var38 = var31.sizeY; // L: 1094
																		int var39;
																		if ((var30 & 1) == 1) { // L: 1096
																			var39 = var37; // L: 1097
																			var37 = var38; // L: 1098
																			var38 = var39; // L: 1099
																		}

																		int var36 = var8 & 3; // L: 1101
																		int var33;
																		if (var36 == 0) { // L: 1102
																			var33 = var34; // L: 1103
																		} else if (var36 == 1) { // L: 1106
																			var33 = var35; // L: 1107
																		} else if (var36 == 2) { // L: 1110
																			var33 = 7 - var34 - (var37 - 1); // L: 1111
																		} else {
																			var33 = 7 - var35 - (var38 - 1); // L: 1114
																		}

																		var39 = var51 + var33; // L: 1116
																		int var40 = var15 + class58.method912(var26 & 7, var25 & 7, var8, var31.sizeX, var31.sizeY, var30); // L: 1117
																		if (var39 > 0 && var40 > 0 && var39 < 103 && var40 < 103) { // L: 1118
																			int var41 = var44; // L: 1119
																			if ((Tiles.Tiles_renderFlags[1][var39][var40] & 2) == 2) { // L: 1120
																				var41 = var44 - 1;
																			}

																			CollisionMap var42 = null; // L: 1121
																			if (var41 >= 0) { // L: 1122
																				var42 = var19[var41];
																			}

																			GrandExchangeOfferWorldComparator.method137(var44, var39, var40, var21, var8 + var30 & 3, var29, var52, var42); // L: 1123
																		}
																	}
																}
															}
														}
													}
												}
											}
										}

										++var44; // L: 1048
									}
								}

								RouteStrategy.playPcmPlayers(); // L: 991

								for (var4 = 0; var4 < 13; ++var4) { // L: 992
									for (var5 = 0; var5 < 13; ++var5) { // L: 993
										boolean var57 = false; // L: 994
										var7 = instanceChunkTemplates[var44][var4][var5]; // L: 995
										if (var7 != -1) { // L: 996
											var8 = var7 >> 24 & 3; // L: 997
											var48 = var7 >> 1 & 3; // L: 998
											var10 = var7 >> 14 & 1023; // L: 999
											var11 = var7 >> 3 & 2047; // L: 1000
											var12 = (var10 / 8 << 8) + var11 / 8; // L: 1001

											for (var13 = 0; var13 < class90.regions.length; ++var13) { // L: 1002
												if (class90.regions[var13] == var12 && AbstractUserComparator.regionLandArchives[var13] != null) { // L: 1003
													byte[] var14 = AbstractUserComparator.regionLandArchives[var13]; // L: 1004
													var15 = var4 * 8; // L: 1005
													var16 = var5 * 8; // L: 1006
													var17 = (var10 & 7) * 8; // L: 1007
													int var18 = (var11 & 7) * 8; // L: 1008
													var19 = collisionMaps; // L: 1009

													for (int var20 = 0; var20 < 8; ++var20) { // L: 1011
														for (var21 = 0; var21 < 8; ++var21) { // L: 1012
															if (var15 + var20 > 0 && var15 + var20 < 103 && var21 + var16 > 0 && var16 + var21 < 103) { // L: 1013
																var10000 = var19[var44].flags[var15 + var20];
																var10000[var16 + var21] &= -16777217;
															}
														}
													}

													var49 = new Buffer(var14); // L: 1016

													for (var21 = 0; var21 < 4; ++var21) { // L: 1017
														for (var22 = 0; var22 < 64; ++var22) { // L: 1018
															for (var23 = 0; var23 < 64; ++var23) { // L: 1019
																if (var8 == var21 && var22 >= var17 && var22 < var17 + 8 && var23 >= var18 && var23 < var18 + 8) { // L: 1020
																	DynamicObject.loadTerrain(var49, var44, var15 + TaskHandler.method3568(var22 & 7, var23 & 7, var48), var16 + Huffman.method4041(var22 & 7, var23 & 7, var48), 0, 0, var48); // L: 1021
																} else {
																	DynamicObject.loadTerrain(var49, 0, -1, -1, 0, 0, 0); // L: 1023
																}
															}
														}
													}

													var57 = true; // L: 1028
													break; // L: 1029
												}
											}
										}

										if (!var57) { // L: 1033
											class58.method914(var44, var4 * 8, var5 * 8); // L: 1034
										}
									}
								}

								++var44; // L: 990
							}
						}

						AttackOption.method2154(true); // L: 1137
						RouteStrategy.playPcmPlayers(); // L: 1138
						HealthBar.method2113(ScriptEvent.scene, collisionMaps); // L: 1139
						AttackOption.method2154(true); // L: 1140
						var44 = Tiles.Tiles_minPlane; // L: 1141
						if (var44 > Huffman.Client_plane) { // L: 1142
							var44 = Huffman.Client_plane;
						}

						if (var44 < Huffman.Client_plane - 1) { // L: 1143
							var44 = Huffman.Client_plane - 1;
						}

						if (isLowDetail) { // L: 1144
							ScriptEvent.scene.init(Tiles.Tiles_minPlane);
						} else {
							ScriptEvent.scene.init(0); // L: 1145
						}

						for (var4 = 0; var4 < 104; ++var4) { // L: 1146
							for (var5 = 0; var5 < 104; ++var5) { // L: 1147
								class13.updateItemPile(var4, var5); // L: 1148
							}
						}

						RouteStrategy.playPcmPlayers(); // L: 1151

						for (PendingSpawn var55 = (PendingSpawn)pendingSpawns.last(); var55 != null; var55 = (PendingSpawn)pendingSpawns.previous()) { // L: 1153 1154 1160
							if (var55.hitpoints == -1) { // L: 1155
								var55.delay = 0; // L: 1156
								WorldMapIcon_1.method375(var55); // L: 1157
							} else {
								var55.remove(); // L: 1159
							}
						}

						ObjectDefinition.ObjectDefinition_cachedModelData.clear(); // L: 1163
						PacketBufferNode var56;
						if (class2.client.hasFrame()) { // L: 1164
							var56 = getPacketBufferNode(ClientPacket.field2251, packetWriter.isaacCipher); // L: 1166
							var56.packetBuffer.writeInt(1057001181); // L: 1167
							packetWriter.addNode(var56); // L: 1168
						}

						if (!isInInstance) { // L: 1170
							var4 = (class52.field396 - 6) / 8; // L: 1171
							var5 = (class52.field396 + 6) / 8; // L: 1172
							var47 = (SpotAnimationDefinition.field3261 - 6) / 8; // L: 1173
							var7 = (SpotAnimationDefinition.field3261 + 6) / 8; // L: 1174

							for (var8 = var4 - 1; var8 <= var5 + 1; ++var8) { // L: 1175
								for (var48 = var47 - 1; var48 <= var7 + 1; ++var48) { // L: 1176
									if (var8 < var4 || var8 > var5 || var48 < var47 || var48 > var7) { // L: 1177
										WorldMapLabel.archive5.loadRegionFromName("m" + var8 + "_" + var48); // L: 1178
										WorldMapLabel.archive5.loadRegionFromName("l" + var8 + "_" + var48); // L: 1179
									}
								}
							}
						}

						CollisionMap.updateGameState(30); // L: 1183
						RouteStrategy.playPcmPlayers(); // L: 1184
						Messages.method2288(); // L: 1185
						var56 = getPacketBufferNode(ClientPacket.field2318, packetWriter.isaacCipher); // L: 1186
						packetWriter.addNode(var56); // L: 1187
						WorldMapLabel.method498(); // L: 1188
					}
				}
			}
		} else {
			class3.doCycleTitle(this);
		}

		if (gameState == 30) { // L: 1190
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) { // L: 1191
			this.doCycleLoggedOut();
		}

	} // L: 1192

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-63"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2 = Script.method2326(); // L: 1195
		if (var2 && field704 && WorldMapManager.pcmPlayer0 != null) { // L: 1196 1197
			WorldMapManager.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && field890 != 0L && PacketWriter.currentTimeMillis() > field890) { // L: 1199 1200
			FontName.setWindowedMode(class39.getWindowedMode()); // L: 1201
		}

		int var3;
		if (var1) { // L: 1204
			for (var3 = 0; var3 < 100; ++var3) { // L: 1205
				field882[var3] = true;
			}
		}

		if (gameState == 0) { // L: 1207
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1208
			Player.drawTitle(class4.fontBold12, DynamicObject.fontPlain11, ItemDefinition.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1209
			if (gameState == 20) { // L: 1210
				Player.drawTitle(class4.fontBold12, DynamicObject.fontPlain11, ItemDefinition.fontPlain12);
			} else if (gameState == 25) { // L: 1211
				if (field732 == 1) { // L: 1212
					if (field728 > field711) { // L: 1213
						field711 = field728;
					}

					var3 = (field711 * 50 - field728 * 50) / field711; // L: 1214
					Actor.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false); // L: 1215
				} else if (field732 == 2) { // L: 1217
					if (field895 > field791) { // L: 1218
						field791 = field895;
					}

					var3 = (field791 * 50 - field895 * 50) / field791 + 50; // L: 1219
					Actor.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false); // L: 1220
				} else {
					Actor.drawLoadingMessage("Loading - please wait.", false); // L: 1222
				}
			} else if (gameState == 30) { // L: 1224
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1225
				Actor.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1226
				Actor.drawLoadingMessage("Please wait...", false);
			}
		} else {
			Player.drawTitle(class4.fontBold12, DynamicObject.fontPlain11, ItemDefinition.fontPlain12); // L: 1216
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) { // L: 1227
			for (var3 = 0; var3 < rootWidgetCount; ++var3) { // L: 1228
				if (field883[var3]) { // L: 1229
					WorldMapSprite.rasterProvider.draw(rootWidgetXs[var3], rootWidgetYs[var3], rootWidgetWidths[var3], rootWidgetHeights[var3]); // L: 1230
					field883[var3] = false; // L: 1231
				}
			}
		} else if (gameState > 0) { // L: 1235
			WorldMapSprite.rasterProvider.drawFull(0, 0); // L: 1236

			for (var3 = 0; var3 < rootWidgetCount; ++var3) { // L: 1237
				field883[var3] = false;
			}
		}

	} // L: 1239

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-645621446"
	)
	@Export("kill0")
	protected final void kill0() {
		if (ClientPreferences.varcs.hasUnwrittenChanges()) { // L: 1242
			ClientPreferences.varcs.write();
		}

		if (ByteArrayPool.mouseRecorder != null) { // L: 1243
			ByteArrayPool.mouseRecorder.isRunning = false;
		}

		ByteArrayPool.mouseRecorder = null; // L: 1244
		packetWriter.close(); // L: 1245
		class195.method3714(); // L: 1246
		PacketWriter.method2357(); // L: 1247
		Player.mouseWheel = null; // L: 1248
		if (WorldMapManager.pcmPlayer0 != null) { // L: 1249
			WorldMapManager.pcmPlayer0.shutdown();
		}

		if (IntHashTable.pcmPlayer1 != null) { // L: 1250
			IntHashTable.pcmPlayer1.shutdown();
		}

		GameObject.method3411(); // L: 1251
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 1253
			if (ArchiveDiskActionHandler.field3179 != 0) { // L: 1254
				ArchiveDiskActionHandler.field3179 = 1; // L: 1255

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait(); // L: 1257
				} catch (InterruptedException var5) { // L: 1259
				}
			}
		}

		if (UserComparator4.urlRequester != null) { // L: 1263
			UserComparator4.urlRequester.close(); // L: 1264
			UserComparator4.urlRequester = null; // L: 1265
		}

		try {
			JagexCache.JagexCache_dat2File.close(); // L: 1269

			for (int var4 = 0; var4 < GZipDecompressor.idxCount; ++var4) { // L: 1270
				JagexCache.JagexCache_idxFiles[var4].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 1271
			JagexCache.JagexCache_randomDat.close(); // L: 1272
		} catch (Exception var6) { // L: 1274
		}

	} // L: 1276

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "28"
	)
	protected final void vmethod1761() {
	} // L: 669

	public final void init() {
		try {
			if (this.checkHost()) { // L: 675
				for (int var1 = 0; var1 <= 19; ++var1) { // L: 676
					String var2 = this.getParameter(Integer.toString(var1)); // L: 677
					if (var2 != null) { // L: 678
						switch(var1) { // L: 679
						case 1:
							useBufferedSocket = Integer.parseInt(var2) != 0; // L: 692
						case 2:
						case 11:
						case 13:
						case 16:
						default:
							break;
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 697
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 698
							}
							break;
						case 4:
							if (clientType == -1) { // L: 755
								clientType = Integer.parseInt(var2); // L: 756
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 730
							break; // L: 731
						case 6:
							int var4 = Integer.parseInt(var2); // L: 736
							Language var3;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) { // L: 738
								var3 = Language.Language_valuesOrdered[var4]; // L: 742
							} else {
								var3 = null; // L: 739
							}

							class58.clientLanguage = var3; // L: 744
							break; // L: 745
						case 7:
							DirectByteArrayCopier.field2525 = TextureProvider.method2863(Integer.parseInt(var2)); // L: 687
							break; // L: 688
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 749
							}
							break;
						case 9:
							class200.field2403 = var2; // L: 715
							break; // L: 716
						case 10:
							Tiles.field532 = (StudioGame)TextureProvider.findEnumerated(class41.method624(), Integer.parseInt(var2)); // L: 703
							if (StudioGame.oldscape == Tiles.field532) { // L: 704
								WorldMapAreaData.loginType = LoginType.oldscape;
							} else {
								WorldMapAreaData.loginType = LoginType.field4062; // L: 705
							}
							break;
						case 12:
							worldId = Integer.parseInt(var2); // L: 710
							break; // L: 711
						case 14:
							GrandExchangeOffer.field99 = Integer.parseInt(var2); // L: 725
							break; // L: 726
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 720
							break; // L: 721
						case 17:
							BZip2State.worldListURL = var2; // L: 682
						}
					}
				}

				HealthBarUpdate.method1818(); // L: 763
				ItemContainer.worldHost = this.getCodeBase().getHost(); // L: 764
				String var5 = DirectByteArrayCopier.field2525.name; // L: 765
				byte var6 = 0; // L: 766

				try {
					class90.method2138("oldschool", var5, var6, 21); // L: 768
				} catch (Exception var7) { // L: 770
					Decimator.RunException_sendStackTrace((String)null, var7); // L: 771
				}

				class2.client = this; // L: 773
				WorldMapID.clientType = clientType; // L: 774
				this.startThread(765, 503, 191); // L: 775
			}
		} catch (RuntimeException var8) {
			throw class25.newRunException(var8, "client.init(" + ')');
		}
	} // L: 776

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "858164113"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1315
			boolean var1 = BoundaryObject.method3384(); // L: 1316
			if (!var1) { // L: 1317
				this.doCycleJs5Connect();
			}

		}
	} // L: 1318

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-32277298"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) { // L: 1321
			this.error("js5crc"); // L: 1322
			gameState = 1000; // L: 1323
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) { // L: 1326
				if (gameState <= 5) { // L: 1327
					this.error("js5io"); // L: 1328
					gameState = 1000; // L: 1329
					return; // L: 1330
				}

				field712 = 3000; // L: 1333
				NetCache.NetCache_ioExceptions = 3; // L: 1334
			}

			if (--field712 + 1 <= 0) { // L: 1337
				try {
					if (js5ConnectState == 0) { // L: 1339
						UserComparator7.js5SocketTask = GameShell.taskHandler.newSocketTask(ItemContainer.worldHost, WorldMapScaleHandler.port3); // L: 1340
						++js5ConnectState; // L: 1341
					}

					if (js5ConnectState == 1) { // L: 1343
						if (UserComparator7.js5SocketTask.status == 2) { // L: 1344
							this.js5Error(-1); // L: 1345
							return; // L: 1346
						}

						if (UserComparator7.js5SocketTask.status == 1) { // L: 1348
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1350
						if (useBufferedSocket) { // L: 1351
							ItemContainer.js5Socket = ModelData0.method3375((Socket)UserComparator7.js5SocketTask.result, 40000, 5000); // L: 1352
						} else {
							ItemContainer.js5Socket = new NetSocket((Socket)UserComparator7.js5SocketTask.result, GameShell.taskHandler, 5000); // L: 1355
						}

						Buffer var1 = new Buffer(5); // L: 1357
						var1.writeByte(15); // L: 1358
						var1.writeInt(191); // L: 1359
						ItemContainer.js5Socket.write(var1.array, 0, 5); // L: 1360
						++js5ConnectState; // L: 1361
						KeyHandler.field428 = PacketWriter.currentTimeMillis(); // L: 1362
					}

					if (js5ConnectState == 3) { // L: 1364
						if (ItemContainer.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) { // L: 1365
							int var2 = ItemContainer.js5Socket.readUnsignedByte(); // L: 1366
							if (var2 != 0) { // L: 1367
								this.js5Error(var2); // L: 1368
								return; // L: 1369
							}

							++js5ConnectState; // L: 1371
						} else if (PacketWriter.currentTimeMillis() - KeyHandler.field428 > 30000L) { // L: 1374
							this.js5Error(-2); // L: 1375
							return; // L: 1376
						}
					}

					if (js5ConnectState == 4) { // L: 1380
						Widget.method4173(ItemContainer.js5Socket, gameState > 20); // L: 1381
						UserComparator7.js5SocketTask = null; // L: 1382
						ItemContainer.js5Socket = null; // L: 1383
						js5ConnectState = 0; // L: 1384
						js5Errors = 0; // L: 1385
					}
				} catch (IOException var3) { // L: 1388
					this.js5Error(-3); // L: 1389
				}

			}
		}
	} // L: 1324 1391

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1255510114"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		UserComparator7.js5SocketTask = null; // L: 1394
		ItemContainer.js5Socket = null; // L: 1395
		js5ConnectState = 0; // L: 1396
		if (WorldMapScaleHandler.port3 == port1) { // L: 1397
			WorldMapScaleHandler.port3 = class23.port2;
		} else {
			WorldMapScaleHandler.port3 = port1; // L: 1398
		}

		++js5Errors; // L: 1399
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) { // L: 1400
			if (gameState <= 5) { // L: 1401
				this.error("js5connect_full"); // L: 1402
				gameState = 1000; // L: 1403
			} else {
				field712 = 3000; // L: 1405
			}
		} else if (js5Errors >= 2 && var1 == 6) { // L: 1407
			this.error("js5connect_outofdate"); // L: 1408
			gameState = 1000; // L: 1409
		} else if (js5Errors >= 4) { // L: 1411
			if (gameState <= 5) { // L: 1412
				this.error("js5connect"); // L: 1413
				gameState = 1000; // L: 1414
			} else {
				field712 = 3000; // L: 1416
			}
		}

	} // L: 1418

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-407945770"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket(); // L: 1853
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 1854

		try {
			if (loginState == 0) { // L: 1856
				if (WorldMapID.secureRandom == null && (secureRandomFuture.isDone() || field822 > 250)) { // L: 1857
					WorldMapID.secureRandom = secureRandomFuture.get(); // L: 1858
					secureRandomFuture.shutdown(); // L: 1859
					secureRandomFuture = null; // L: 1860
				}

				if (WorldMapID.secureRandom != null) { // L: 1862
					if (var1 != null) { // L: 1863
						((AbstractSocket)var1).close(); // L: 1864
						var1 = null; // L: 1865
					}

					MouseRecorder.socketTask = null; // L: 1867
					field713 = false; // L: 1868
					field822 = 0; // L: 1869
					loginState = 1; // L: 1870
				}
			}

			if (loginState == 1) { // L: 1873
				if (MouseRecorder.socketTask == null) { // L: 1874
					MouseRecorder.socketTask = GameShell.taskHandler.newSocketTask(ItemContainer.worldHost, WorldMapScaleHandler.port3); // L: 1875
				}

				if (MouseRecorder.socketTask.status == 2) { // L: 1877
					throw new IOException();
				}

				if (MouseRecorder.socketTask.status == 1) { // L: 1878
					if (useBufferedSocket) { // L: 1879
						var1 = ModelData0.method3375((Socket)MouseRecorder.socketTask.result, 40000, 5000); // L: 1880
					} else {
						var1 = new NetSocket((Socket)MouseRecorder.socketTask.result, GameShell.taskHandler, 5000); // L: 1883
					}

					packetWriter.setSocket((AbstractSocket)var1); // L: 1885
					MouseRecorder.socketTask = null; // L: 1886
					loginState = 2; // L: 1887
				}
			}

			PacketBufferNode var3;
			if (loginState == 2) { // L: 1890
				packetWriter.clearBuffer(); // L: 1891
				var3 = Archive.method4385(); // L: 1892
				var3.packetBuffer.writeByte(LoginPacket.field2360.id); // L: 1893
				packetWriter.addNode(var3); // L: 1894
				packetWriter.flush(); // L: 1895
				var2.offset = 0; // L: 1896
				loginState = 3; // L: 1897
			}

			int var4;
			boolean var12;
			if (loginState == 3) { // L: 1899
				if (WorldMapManager.pcmPlayer0 != null) { // L: 1900
					WorldMapManager.pcmPlayer0.method2517();
				}

				if (IntHashTable.pcmPlayer1 != null) { // L: 1901
					IntHashTable.pcmPlayer1.method2517();
				}

				var12 = true; // L: 1902
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) { // L: 1903 1904
					var12 = false;
				}

				if (var12) { // L: 1906
					var4 = ((AbstractSocket)var1).readUnsignedByte(); // L: 1907
					if (WorldMapManager.pcmPlayer0 != null) { // L: 1908
						WorldMapManager.pcmPlayer0.method2517();
					}

					if (IntHashTable.pcmPlayer1 != null) { // L: 1909
						IntHashTable.pcmPlayer1.method2517();
					}

					if (var4 != 0) { // L: 1910
						class58.getLoginError(var4); // L: 1911
						return; // L: 1912
					}

					var2.offset = 0; // L: 1914
					loginState = 4; // L: 1915
				}
			}

			int var34;
			if (loginState == 4) { // L: 1918
				if (var2.offset < 8) { // L: 1919
					var34 = ((AbstractSocket)var1).available(); // L: 1920
					if (var34 > 8 - var2.offset) { // L: 1921
						var34 = 8 - var2.offset;
					}

					if (var34 > 0) { // L: 1922
						((AbstractSocket)var1).read(var2.array, var2.offset, var34); // L: 1923
						var2.offset += var34; // L: 1924
					}
				}

				if (var2.offset == 8) { // L: 1927
					var2.offset = 0; // L: 1928
					PcmPlayer.field1430 = var2.readLong(); // L: 1929
					loginState = 5; // L: 1930
				}
			}

			int var7;
			int var9;
			int var14;
			if (loginState == 5) { // L: 1933
				packetWriter.packetBuffer.offset = 0; // L: 1934
				packetWriter.clearBuffer(); // L: 1935
				PacketBuffer var22 = new PacketBuffer(500); // L: 1936
				int[] var13 = new int[]{WorldMapID.secureRandom.nextInt(), WorldMapID.secureRandom.nextInt(), WorldMapID.secureRandom.nextInt(), WorldMapID.secureRandom.nextInt()}; // L: 1937 1938 1939 1940 1941
				var22.offset = 0; // L: 1942
				var22.writeByte(1); // L: 1943
				var22.writeInt(var13[0]); // L: 1944
				var22.writeInt(var13[1]); // L: 1945
				var22.writeInt(var13[2]); // L: 1946
				var22.writeInt(var13[3]); // L: 1947
				var22.writeLong(PcmPlayer.field1430); // L: 1948
				int var10;
				if (gameState == 40) { // L: 1949
					var22.writeInt(UserComparator10.field2017[0]); // L: 1950
					var22.writeInt(UserComparator10.field2017[1]); // L: 1951
					var22.writeInt(UserComparator10.field2017[2]); // L: 1952
					var22.writeInt(UserComparator10.field2017[3]); // L: 1953
				} else {
					var22.writeByte(field710.rsOrdinal()); // L: 1956
					switch(field710.field2042) { // L: 1957
					case 0:
					case 1:
						var22.writeMedium(LoginScreenAnimation.field1070); // L: 1966
						++var22.offset; // L: 1967
						break; // L: 1968
					case 2:
						var22.offset += 4; // L: 1960
						break; // L: 1961
					case 3:
						LinkedHashMap var6 = Tile.clientPreferences.parameters; // L: 1973
						String var8 = Login.Login_username; // L: 1975
						var9 = var8.length(); // L: 1977
						var10 = 0; // L: 1978

						for (int var11 = 0; var11 < var9; ++var11) { // L: 1979
							var10 = (var10 << 5) - var10 + var8.charAt(var11);
						}

						var22.writeInt((Integer)var6.get(var10)); // L: 1982
					}

					var22.writeByte(class322.field3841.rsOrdinal()); // L: 1986
					var22.writeStringCp1252NullTerminated(Login.Login_password); // L: 1987
				}

				var22.encryptRsa(class92.field1186, class92.field1187); // L: 1989
				UserComparator10.field2017 = var13; // L: 1990
				PacketBufferNode var5 = Archive.method4385(); // L: 1991
				var5.packetBuffer.offset = 0; // L: 1992
				if (gameState == 40) { // L: 1993
					var5.packetBuffer.writeByte(LoginPacket.field2352.id); // L: 1994
				} else {
					var5.packetBuffer.writeByte(LoginPacket.field2351.id); // L: 1997
				}

				var5.packetBuffer.writeShort(0); // L: 1999
				var14 = var5.packetBuffer.offset; // L: 2000
				var5.packetBuffer.writeInt(191); // L: 2001
				var5.packetBuffer.writeInt(1); // L: 2002
				var5.packetBuffer.writeByte(clientType); // L: 2003
				var5.packetBuffer.writeBytes(var22.array, 0, var22.offset); // L: 2004
				var7 = var5.packetBuffer.offset; // L: 2005
				var5.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2006
				var5.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2007
				var5.packetBuffer.writeShort(FloorDecoration.canvasWidth); // L: 2008
				var5.packetBuffer.writeShort(GameShell.canvasHeight); // L: 2009
				WorldMapData_1.method783(var5.packetBuffer); // L: 2010
				var5.packetBuffer.writeStringCp1252NullTerminated(class200.field2403); // L: 2011
				var5.packetBuffer.writeInt(GrandExchangeOffer.field99); // L: 2012
				Buffer var32 = new Buffer(WorldMapArea.platformInfo.size()); // L: 2013
				WorldMapArea.platformInfo.write(var32); // L: 2014
				var5.packetBuffer.writeBytes(var32.array, 0, var32.array.length); // L: 2015
				var5.packetBuffer.writeByte(clientType); // L: 2016
				var5.packetBuffer.writeInt(0); // L: 2017
				var5.packetBuffer.method5663(WorldMapData_1.archive19.hash); // L: 2018
				var5.packetBuffer.method5663(PlayerAppearance.archive14.hash); // L: 2019
				var5.packetBuffer.writeShortLE(Occluder.archive10.hash); // L: 2020
				var5.packetBuffer.method5662(Huffman.archive8.hash); // L: 2021
				var5.packetBuffer.writeInt(FontName.archive20.hash); // L: 2022
				var5.packetBuffer.method5663(MouseRecorder.archive18.hash); // L: 2023
				var5.packetBuffer.writeShortLE(GrandExchangeOfferUnitPriceComparator.archive4.hash); // L: 2024
				var5.packetBuffer.writeShortLE(PlayerAppearance.archive15.hash); // L: 2025
				var5.packetBuffer.method5662(GrandExchangeEvent.archive11.hash); // L: 2026
				var5.packetBuffer.method5663(WorldMapID.archive3.hash); // L: 2027
				var5.packetBuffer.method5663(TilePaint.archive13.hash); // L: 2028
				var5.packetBuffer.method5663(WorldMapSection1.archive7.hash); // L: 2029
				var5.packetBuffer.writeShortLE(class3.archive17.hash); // L: 2030
				var5.packetBuffer.writeInt(archive1.hash); // L: 2031
				var5.packetBuffer.method5663(0); // L: 2032
				var5.packetBuffer.writeInt(ApproximateRouteStrategy.archive12.hash); // L: 2033
				var5.packetBuffer.method5663(UrlRequester.archive9.hash); // L: 2034
				var5.packetBuffer.method5663(class182.archive0.hash); // L: 2035
				var5.packetBuffer.writeInt(NetFileRequest.archive2.hash); // L: 2036
				var5.packetBuffer.writeInt(CollisionMap.archive6.hash); // L: 2037
				var5.packetBuffer.method5663(WorldMapLabel.archive5.hash); // L: 2038
				var5.packetBuffer.xteaEncrypt(var13, var7, var5.packetBuffer.offset); // L: 2039
				var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var14); // L: 2040
				packetWriter.addNode(var5); // L: 2041
				packetWriter.flush(); // L: 2042
				packetWriter.isaacCipher = new IsaacCipher(var13); // L: 2043
				int[] var15 = new int[4]; // L: 2044

				for (var10 = 0; var10 < 4; ++var10) { // L: 2045
					var15[var10] = var13[var10] + 50;
				}

				var2.newIsaacCipher(var15); // L: 2046
				loginState = 6; // L: 2047
			}

			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) { // L: 2049 2050
				var34 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2051
				if (var34 == 21 && gameState == 20) { // L: 2052
					loginState = 12; // L: 2053
				} else if (var34 == 2) { // L: 2055
					loginState = 14; // L: 2056
				} else if (var34 == 15 && gameState == 40) { // L: 2058
					packetWriter.serverPacketLength = -1; // L: 2059
					loginState = 19; // L: 2060
				} else if (var34 == 64) { // L: 2062
					loginState = 10; // L: 2063
				} else if (var34 == 23 && field708 < 1) { // L: 2065
					++field708; // L: 2066
					loginState = 0; // L: 2067
				} else if (var34 == 29) { // L: 2069
					loginState = 17; // L: 2070
				} else {
					if (var34 != 69) { // L: 2072
						class58.getLoginError(var34); // L: 2076
						return; // L: 2077
					}

					loginState = 7; // L: 2073
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) { // L: 2081 2082
				((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2083
				var2.offset = 0; // L: 2084
				WorldMapIcon_1.field212 = var2.readUnsignedShort(); // L: 2085
				loginState = 8; // L: 2086
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= WorldMapIcon_1.field212) { // L: 2089 2090
				var2.offset = 0; // L: 2091
				((AbstractSocket)var1).read(var2.array, var2.offset, WorldMapIcon_1.field212); // L: 2092
				class7[] var23 = new class7[]{class7.field37}; // L: 2095
				class7 var35 = var23[var2.readUnsignedByte()]; // L: 2097

				try {
					class12 var27 = class7.method102(var35); // L: 2099
					this.field714 = new class9(var2, var27); // L: 2100
					loginState = 9; // L: 2101
				} catch (Exception var20) { // L: 2103
					class58.getLoginError(22); // L: 2104
					return; // L: 2105
				}
			}

			if (loginState == 9 && this.field714.method109()) { // L: 2109 2110
				this.field754 = this.field714.method122(); // L: 2111
				this.field714.method110(); // L: 2112
				this.field714 = null; // L: 2113
				if (this.field754 == null) { // L: 2114
					class58.getLoginError(22); // L: 2115
					return; // L: 2116
				}

				packetWriter.clearBuffer(); // L: 2118
				var3 = Archive.method4385(); // L: 2119
				var3.packetBuffer.writeByte(LoginPacket.field2353.id); // L: 2120
				var3.packetBuffer.writeShort(this.field754.offset); // L: 2121
				var3.packetBuffer.method5611(this.field754); // L: 2122
				packetWriter.addNode(var3); // L: 2123
				packetWriter.flush(); // L: 2124
				this.field754 = null; // L: 2125
				loginState = 6; // L: 2126
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) { // L: 2129 2130
				class60.field456 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2131
				loginState = 11; // L: 2132
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= class60.field456) { // L: 2135 2136
				((AbstractSocket)var1).read(var2.array, 0, class60.field456); // L: 2137
				var2.offset = 0; // L: 2138
				loginState = 6; // L: 2139
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) { // L: 2142 2143
				field709 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60; // L: 2144
				loginState = 13; // L: 2145
			}

			if (loginState == 13) { // L: 2148
				field822 = 0; // L: 2149
				UrlRequester.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field709 / 60 + " seconds."); // L: 2150
				if (--field709 <= 0) { // L: 2151
					loginState = 0;
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) { // L: 2154 2155
					LoginScreenAnimation.field1076 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2156
					loginState = 15; // L: 2157
				}

				if (loginState == 15 && ((AbstractSocket)var1).available() >= LoginScreenAnimation.field1076) { // L: 2160 2161
					var12 = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2162
					((AbstractSocket)var1).read(var2.array, 0, 4); // L: 2163
					var2.offset = 0; // L: 2164
					boolean var24 = false; // L: 2165
					if (var12) { // L: 2166
						var4 = var2.readByteIsaac() << 24; // L: 2167
						var4 |= var2.readByteIsaac() << 16; // L: 2168
						var4 |= var2.readByteIsaac() << 8; // L: 2169
						var4 |= var2.readByteIsaac(); // L: 2170
						String var30 = Login.Login_username; // L: 2172
						var7 = var30.length(); // L: 2174
						int var16 = 0; // L: 2175
						var9 = 0; // L: 2176

						while (true) {
							if (var9 >= var7) {
								if (Tile.clientPreferences.parameters.size() >= 10 && !Tile.clientPreferences.parameters.containsKey(var16)) { // L: 2180 2181
									Iterator var33 = Tile.clientPreferences.parameters.entrySet().iterator(); // L: 2182
									var33.next(); // L: 2183
									var33.remove(); // L: 2184
								}

								Tile.clientPreferences.parameters.put(var16, var4); // L: 2187
								break;
							}

							var16 = (var16 << 5) - var16 + var30.charAt(var9);
							++var9;
						}
					}

					if (Login_isUsernameRemembered) { // L: 2189
						Tile.clientPreferences.rememberedUsername = Login.Login_username; // L: 2190
					} else {
						Tile.clientPreferences.rememberedUsername = null; // L: 2193
					}

					WorldMapData_1.savePreferences(); // L: 2195
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte(); // L: 2196
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2197
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte(); // L: 2198
					localPlayerIndex <<= 8; // L: 2199
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte(); // L: 2200
					field888 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2201
					((AbstractSocket)var1).read(var2.array, 0, 1); // L: 2202
					var2.offset = 0; // L: 2203
					ServerPacket[] var28 = class198.ServerPacket_values(); // L: 2204
					var14 = var2.readSmartByteShortIsaac(); // L: 2205
					if (var14 < 0 || var14 >= var28.length) { // L: 2206
						throw new IOException(var14 + " " + var2.offset);
					}

					packetWriter.serverPacket = var28[var14]; // L: 2207
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2208
					((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2209
					var2.offset = 0; // L: 2210
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2211

					try {
						Client var18 = class2.client; // L: 2213
						JSObject.getWindow(var18).call("zap", (Object[])null); // L: 2216
					} catch (Throwable var19) { // L: 2219
					}

					loginState = 16; // L: 2220
				}

				if (loginState == 16) { // L: 2223
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2224
						var2.offset = 0; // L: 2225
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2226
						timer.method5100(); // L: 2227
						mouseLastLastPressedTimeMillis = -1L; // L: 2230
						ByteArrayPool.mouseRecorder.index = 0; // L: 2231
						GameShell.hasFocus = true; // L: 2232
						hadFocus = true; // L: 2233
						field901 = -1L; // L: 2234
						class171.method3543(); // L: 2235
						packetWriter.clearBuffer(); // L: 2236
						packetWriter.packetBuffer.offset = 0; // L: 2237
						packetWriter.serverPacket = null; // L: 2238
						packetWriter.field1336 = null; // L: 2239
						packetWriter.field1348 = null; // L: 2240
						packetWriter.field1346 = null; // L: 2241
						packetWriter.serverPacketLength = 0; // L: 2242
						packetWriter.field1345 = 0; // L: 2243
						rebootTimer = 0; // L: 2244
						logoutTimer = 0; // L: 2245
						hintArrowType = 0; // L: 2246
						class279.method5091(); // L: 2247
						MouseHandler.MouseHandler_idleCycles = 0; // L: 2249
						Messages.Messages_channels.clear(); // L: 2252
						Messages.Messages_hashTable.clear(); // L: 2253
						Messages.Messages_queue.clear(); // L: 2254
						Messages.Messages_count = 0; // L: 2255
						isItemSelected = 0; // L: 2257
						isSpellSelected = false; // L: 2258
						soundEffectCount = 0; // L: 2259
						camAngleY = 0; // L: 2260
						oculusOrbState = 0; // L: 2261
						ModelData0.field1901 = null; // L: 2262
						minimapState = 0; // L: 2263
						field902 = -1; // L: 2264
						destinationX = 0; // L: 2265
						destinationY = 0; // L: 2266
						playerAttackOption = AttackOption.AttackOption_hidden; // L: 2267
						npcAttackOption = AttackOption.AttackOption_hidden; // L: 2268
						npcCount = 0; // L: 2269
						WorldMapRectangle.method361(); // L: 2270

						for (var34 = 0; var34 < 2048; ++var34) { // L: 2271
							players[var34] = null;
						}

						for (var34 = 0; var34 < 32768; ++var34) { // L: 2272
							npcs[var34] = null;
						}

						combatTargetPlayerIndex = -1; // L: 2273
						projectiles.clear(); // L: 2274
						graphicsObjects.clear(); // L: 2275

						for (var34 = 0; var34 < 4; ++var34) { // L: 2276
							for (var4 = 0; var4 < 104; ++var4) { // L: 2277
								for (int var17 = 0; var17 < 104; ++var17) { // L: 2278
									groundItems[var34][var4][var17] = null; // L: 2279
								}
							}
						}

						pendingSpawns = new NodeDeque(); // L: 2283
						class60.friendSystem.clear(); // L: 2284

						for (var34 = 0; var34 < VarpDefinition.VarpDefinition_fileCount; ++var34) { // L: 2285
							VarpDefinition var37 = class195.VarpDefinition_get(var34); // L: 2286
							if (var37 != null) { // L: 2287
								Varps.Varps_temp[var34] = 0; // L: 2288
								Varps.Varps_main[var34] = 0; // L: 2289
							}
						}

						ClientPreferences.varcs.clearTransient(); // L: 2292
						followerIndex = -1; // L: 2293
						if (rootInterface != -1) { // L: 2294
							SecureRandomFuture.method2225(rootInterface);
						}

						for (InterfaceParent var26 = (InterfaceParent)interfaceParents.first(); var26 != null; var26 = (InterfaceParent)interfaceParents.next()) { // L: 2295
							class58.closeInterface(var26, true); // L: 2296
						}

						rootInterface = -1; // L: 2298
						interfaceParents = new NodeHashTable(8); // L: 2299
						meslayerContinueWidget = null; // L: 2300
						class279.method5091(); // L: 2301
						playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1); // L: 2302

						for (var34 = 0; var34 < 8; ++var34) { // L: 2303
							playerMenuActions[var34] = null; // L: 2304
							playerOptionsPriorities[var34] = false; // L: 2305
						}

						ItemContainer.itemContainers = new NodeHashTable(32); // L: 2308
						isLoading = true; // L: 2310

						for (var34 = 0; var34 < 100; ++var34) { // L: 2311
							field882[var34] = true;
						}

						GrandExchangeEvent.method160(); // L: 2312
						Entity.clanChat = null; // L: 2313

						for (var34 = 0; var34 < 8; ++var34) { // L: 2314
							grandExchangeOffers[var34] = new GrandExchangeOffer();
						}

						WorldMapSection1.grandExchangeEvents = null; // L: 2315
						HorizontalAlignment.updatePlayer(var2); // L: 2317
						class52.field396 = -1; // L: 2318
						WorldMapID.loadRegions(false, var2); // L: 2319
						packetWriter.serverPacket = null; // L: 2320
					}

				} else {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) { // L: 2324 2325
						var2.offset = 0; // L: 2326
						((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2327
						var2.offset = 0; // L: 2328
						WorldMapAreaData.field352 = var2.readUnsignedShort(); // L: 2329
						loginState = 18; // L: 2330
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= WorldMapAreaData.field352) { // L: 2333 2334
						var2.offset = 0; // L: 2335
						((AbstractSocket)var1).read(var2.array, 0, WorldMapAreaData.field352); // L: 2336
						var2.offset = 0; // L: 2337
						String var25 = var2.readStringCp1252NullTerminated(); // L: 2338
						String var36 = var2.readStringCp1252NullTerminated(); // L: 2339
						String var29 = var2.readStringCp1252NullTerminated(); // L: 2340
						UrlRequester.setLoginResponseString(var25, var36, var29); // L: 2341
						CollisionMap.updateGameState(10); // L: 2342
					}

					if (loginState != 19) { // L: 2345
						++field822; // L: 2392
						if (field822 > 2000) { // L: 2393
							if (field708 < 1) { // L: 2394
								if (port1 == WorldMapScaleHandler.port3) { // L: 2395
									WorldMapScaleHandler.port3 = class23.port2;
								} else {
									WorldMapScaleHandler.port3 = port1; // L: 2396
								}

								++field708; // L: 2397
								loginState = 0; // L: 2398
							} else {
								class58.getLoginError(-3); // L: 2401
							}
						}
					} else {
						if (packetWriter.serverPacketLength == -1) { // L: 2346
							if (((AbstractSocket)var1).available() < 2) { // L: 2347
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2348
							var2.offset = 0; // L: 2349
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2350
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2352
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2353
							var2.offset = 0; // L: 2354
							var34 = packetWriter.serverPacketLength; // L: 2355
							timer.method5099(); // L: 2356
							packetWriter.clearBuffer(); // L: 2358
							packetWriter.packetBuffer.offset = 0; // L: 2359
							packetWriter.serverPacket = null; // L: 2360
							packetWriter.field1336 = null; // L: 2361
							packetWriter.field1348 = null; // L: 2362
							packetWriter.field1346 = null; // L: 2363
							packetWriter.serverPacketLength = 0; // L: 2364
							packetWriter.field1345 = 0; // L: 2365
							rebootTimer = 0; // L: 2366
							class279.method5091(); // L: 2367
							minimapState = 0; // L: 2368
							destinationX = 0; // L: 2369

							for (var4 = 0; var4 < 2048; ++var4) { // L: 2370
								players[var4] = null;
							}

							WorldMapLabelSize.localPlayer = null; // L: 2371

							for (var4 = 0; var4 < npcs.length; ++var4) { // L: 2372
								NPC var31 = npcs[var4]; // L: 2373
								if (var31 != null) { // L: 2374
									var31.targetIndex = -1; // L: 2375
									var31.false0 = false; // L: 2376
								}
							}

							ItemContainer.itemContainers = new NodeHashTable(32); // L: 2380
							CollisionMap.updateGameState(30); // L: 2382

							for (var4 = 0; var4 < 100; ++var4) { // L: 2383
								field882[var4] = true;
							}

							GrandExchangeEvent.method160(); // L: 2384
							HorizontalAlignment.updatePlayer(var2); // L: 2386
							if (var34 != var2.offset) { // L: 2387
								throw new RuntimeException(); // L: 2388
							}
						}
					}
				}
			}
		} catch (IOException var21) { // L: 2405
			if (field708 < 1) { // L: 2406
				if (WorldMapScaleHandler.port3 == port1) { // L: 2407
					WorldMapScaleHandler.port3 = class23.port2;
				} else {
					WorldMapScaleHandler.port3 = port1; // L: 2408
				}

				++field708; // L: 2409
				loginState = 0; // L: 2410
			} else {
				class58.getLoginError(-2); // L: 2413
			}
		}
	} // L: 2152 2322 2390 2399 2402 2411 2414 2416

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-634429203"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 2614
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 2615
			--logoutTimer;
		}

		if (field713) { // L: 2616
			field713 = false; // L: 2617
			ArchiveLoader.method1208(); // L: 2618
		} else {
			if (!isMenuOpen) { // L: 2621
				WorldMapAreaData.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1707(packetWriter); ++var1) { // L: 2622 2623
			}

			if (gameState == 30) { // L: 2625
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class105.reflectionChecks.last(); // L: 2629
					boolean var29;
					if (var2 == null) { // L: 2630
						var29 = false; // L: 2631
					} else {
						var29 = true; // L: 2634
					}

					int var3;
					PacketBufferNode var30;
					if (!var29) { // L: 2636
						PacketBufferNode var14;
						int var15;
						if (timer.field3598) { // L: 2644
							var14 = getPacketBufferNode(ClientPacket.field2271, packetWriter.isaacCipher); // L: 2646
							var14.packetBuffer.writeByte(0); // L: 2647
							var15 = var14.packetBuffer.offset; // L: 2648
							timer.write(var14.packetBuffer); // L: 2649
							var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var15); // L: 2650
							packetWriter.addNode(var14); // L: 2651
							timer.method5101(); // L: 2652
						}

						int var4;
						int var5;
						int var6;
						int var7;
						int var8;
						int var9;
						int var10;
						int var11;
						int var12;
						PacketBuffer var10000;
						synchronized(ByteArrayPool.mouseRecorder.lock) { // L: 2655
							if (!field841) { // L: 2656
								ByteArrayPool.mouseRecorder.index = 0; // L: 2742
							} else if (MouseHandler.MouseHandler_lastButton != 0 || ByteArrayPool.mouseRecorder.index >= 40) { // L: 2657
								var30 = null; // L: 2659
								var3 = 0; // L: 2660
								var4 = 0; // L: 2661
								var5 = 0; // L: 2662
								var6 = 0; // L: 2663

								for (var7 = 0; var7 < ByteArrayPool.mouseRecorder.index && (var30 == null || var30.packetBuffer.offset - var3 < 246); ++var7) { // L: 2664 2665
									var4 = var7; // L: 2666
									var8 = ByteArrayPool.mouseRecorder.ys[var7]; // L: 2667
									if (var8 < -1) { // L: 2668
										var8 = -1;
									} else if (var8 > 65534) { // L: 2669
										var8 = 65534;
									}

									var9 = ByteArrayPool.mouseRecorder.xs[var7]; // L: 2670
									if (var9 < -1) { // L: 2671
										var9 = -1;
									} else if (var9 > 65534) { // L: 2672
										var9 = 65534;
									}

									if (var9 != field798 || var8 != field686) { // L: 2673
										if (var30 == null) { // L: 2676
											var30 = getPacketBufferNode(ClientPacket.field2269, packetWriter.isaacCipher); // L: 2677
											var30.packetBuffer.writeByte(0); // L: 2678
											var3 = var30.packetBuffer.offset; // L: 2679
											var10000 = var30.packetBuffer; // L: 2680
											var10000.offset += 2;
											var5 = 0; // L: 2681
											var6 = 0; // L: 2682
										}

										if (field687 != -1L) { // L: 2687
											var10 = var9 - field798; // L: 2688
											var11 = var8 - field686; // L: 2689
											var12 = (int)((ByteArrayPool.mouseRecorder.millis[var7] - field687) / 20L); // L: 2690
											var5 = (int)((long)var5 + (ByteArrayPool.mouseRecorder.millis[var7] - field687) % 20L); // L: 2691
										} else {
											var10 = var9; // L: 2694
											var11 = var8; // L: 2695
											var12 = Integer.MAX_VALUE; // L: 2696
										}

										field798 = var9; // L: 2698
										field686 = var8; // L: 2699
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 2700
											var10 += 32; // L: 2701
											var11 += 32; // L: 2702
											var30.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 2703
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 2705
											var10 += 128; // L: 2706
											var11 += 128; // L: 2707
											var30.packetBuffer.writeByte(var12 + 128); // L: 2708
											var30.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 2709
										} else if (var12 < 32) { // L: 2711
											var30.packetBuffer.writeByte(var12 + 192); // L: 2712
											if (var9 != -1 && var8 != -1) { // L: 2713
												var30.packetBuffer.writeInt(var9 | var8 << 16); // L: 2714
											} else {
												var30.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var30.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 2717
											if (var9 != -1 && var8 != -1) { // L: 2718
												var30.packetBuffer.writeInt(var9 | var8 << 16); // L: 2719
											} else {
												var30.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6; // L: 2721
										field687 = ByteArrayPool.mouseRecorder.millis[var7]; // L: 2722
									}
								}

								if (var30 != null) { // L: 2724
									var30.packetBuffer.writeLengthByte(var30.packetBuffer.offset - var3); // L: 2725
									var7 = var30.packetBuffer.offset; // L: 2726
									var30.packetBuffer.offset = var3; // L: 2727
									var30.packetBuffer.writeByte(var5 / var6); // L: 2728
									var30.packetBuffer.writeByte(var5 % var6); // L: 2729
									var30.packetBuffer.offset = var7; // L: 2730
									packetWriter.addNode(var30); // L: 2731
								}

								if (var4 >= ByteArrayPool.mouseRecorder.index) { // L: 2733
									ByteArrayPool.mouseRecorder.index = 0;
								} else {
									MouseRecorder var49 = ByteArrayPool.mouseRecorder; // L: 2735
									var49.index -= var4;
									System.arraycopy(ByteArrayPool.mouseRecorder.xs, var4, ByteArrayPool.mouseRecorder.xs, 0, ByteArrayPool.mouseRecorder.index); // L: 2736
									System.arraycopy(ByteArrayPool.mouseRecorder.ys, var4, ByteArrayPool.mouseRecorder.ys, 0, ByteArrayPool.mouseRecorder.index); // L: 2737
									System.arraycopy(ByteArrayPool.mouseRecorder.millis, var4, ByteArrayPool.mouseRecorder.millis, 0, ByteArrayPool.mouseRecorder.index); // L: 2738
								}
							}
						}

						PacketBufferNode var18;
						if (MouseHandler.MouseHandler_lastButton == 1 || !ScriptEvent.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 2744
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis; // L: 2745
							if (var16 > 32767L) { // L: 2746
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis; // L: 2747
							var3 = MouseHandler.MouseHandler_lastPressedY; // L: 2748
							if (var3 < 0) { // L: 2749
								var3 = 0;
							} else if (var3 > GameShell.canvasHeight) { // L: 2750
								var3 = GameShell.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX; // L: 2751
							if (var4 < 0) { // L: 2752
								var4 = 0;
							} else if (var4 > FloorDecoration.canvasWidth) { // L: 2753
								var4 = FloorDecoration.canvasWidth;
							}

							var5 = (int)var16; // L: 2754
							var18 = getPacketBufferNode(ClientPacket.field2312, packetWriter.isaacCipher); // L: 2755
							var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1)); // L: 2756
							var18.packetBuffer.writeShort(var4); // L: 2757
							var18.packetBuffer.writeShort(var3); // L: 2758
							packetWriter.addNode(var18); // L: 2759
						}

						if (KeyHandler.field422 > 0) { // L: 2761
							var14 = getPacketBufferNode(ClientPacket.field2308, packetWriter.isaacCipher); // L: 2762
							var14.packetBuffer.writeShort(0); // L: 2763
							var15 = var14.packetBuffer.offset; // L: 2764
							long var19 = PacketWriter.currentTimeMillis(); // L: 2765

							for (var5 = 0; var5 < KeyHandler.field422; ++var5) { // L: 2766
								long var21 = var19 - field901; // L: 2767
								if (var21 > 16777215L) { // L: 2768
									var21 = 16777215L;
								}

								field901 = var19; // L: 2769
								var14.packetBuffer.method5660((int)var21); // L: 2770
								var14.packetBuffer.writeIntME(KeyHandler.field421[var5]); // L: 2771
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15); // L: 2773
							packetWriter.addNode(var14); // L: 2774
						}

						if (field829 > 0) { // L: 2776
							--field829;
						}

						if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) { // L: 2777
							field761 = true;
						}

						if (field761 && field829 <= 0) { // L: 2778
							field829 = 20; // L: 2779
							field761 = false; // L: 2780
							var14 = getPacketBufferNode(ClientPacket.field2289, packetWriter.isaacCipher); // L: 2782
							var14.packetBuffer.method5654(camAngleY); // L: 2783
							var14.packetBuffer.method5653(camAngleX); // L: 2784
							packetWriter.addNode(var14); // L: 2785
						}

						if (GameShell.hasFocus && !hadFocus) { // L: 2787
							hadFocus = true; // L: 2788
							var14 = getPacketBufferNode(ClientPacket.field2299, packetWriter.isaacCipher); // L: 2790
							var14.packetBuffer.writeByte(1); // L: 2791
							packetWriter.addNode(var14); // L: 2792
						}

						if (!GameShell.hasFocus && hadFocus) { // L: 2794
							hadFocus = false; // L: 2795
							var14 = getPacketBufferNode(ClientPacket.field2299, packetWriter.isaacCipher); // L: 2797
							var14.packetBuffer.writeByte(0); // L: 2798
							packetWriter.addNode(var14); // L: 2799
						}

						if (Message.worldMap != null) { // L: 2802
							Message.worldMap.method6428();
						}

						if (class8.ClanChat_inClanChat) { // L: 2804
							if (Entity.clanChat != null) { // L: 2805
								Entity.clanChat.sort(); // L: 2806
							}

							for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 2809
								Player var31 = players[Players.Players_indices[var1]]; // L: 2810
								var31.clearIsInClanChat(); // L: 2811
							}

							class8.ClanChat_inClanChat = false; // L: 2814
						}

						AbstractWorldMapData.method354(); // L: 2817
						if (gameState != 30) { // L: 2818
							return;
						}

						for (PendingSpawn var36 = (PendingSpawn)pendingSpawns.last(); var36 != null; var36 = (PendingSpawn)pendingSpawns.previous()) { // L: 2820 2821 2864
							if (var36.hitpoints > 0) { // L: 2822
								--var36.hitpoints;
							}

							ObjectDefinition var23;
							boolean var37;
							if (var36.hitpoints == 0) { // L: 2823
								if (var36.objectId >= 0) { // L: 2825
									var3 = var36.objectId; // L: 2827
									var4 = var36.field961; // L: 2828
									var23 = MidiPcmStream.getObjectDefinition(var3); // L: 2830
									if (var4 == 11) { // L: 2831
										var4 = 10;
									}

									if (var4 >= 5 && var4 <= 8) { // L: 2832
										var4 = 4;
									}

									var37 = var23.method4703(var4); // L: 2833
									if (!var37) { // L: 2835
										continue;
									}
								}

								WorldMapLabelSize.addPendingSpawnToScene(var36.plane, var36.type, var36.x, var36.y, var36.objectId, var36.field960, var36.field961); // L: 2837
								var36.remove(); // L: 2838
							} else {
								if (var36.delay > 0) { // L: 2842
									--var36.delay;
								}

								if (var36.delay == 0 && var36.x >= 1 && var36.y >= 1 && var36.x <= 102 && var36.y <= 102) { // L: 2843
									if (var36.id >= 0) { // L: 2845
										var3 = var36.id; // L: 2847
										var4 = var36.field964; // L: 2848
										var23 = MidiPcmStream.getObjectDefinition(var3); // L: 2850
										if (var4 == 11) { // L: 2851
											var4 = 10;
										}

										if (var4 >= 5 && var4 <= 8) { // L: 2852
											var4 = 4;
										}

										var37 = var23.method4703(var4); // L: 2853
										if (!var37) { // L: 2855
											continue;
										}
									}

									WorldMapLabelSize.addPendingSpawnToScene(var36.plane, var36.type, var36.x, var36.y, var36.id, var36.orientation, var36.field964); // L: 2857
									var36.delay = -1; // L: 2858
									if (var36.objectId == var36.id && var36.objectId == -1) { // L: 2859
										var36.remove();
									} else if (var36.id == var36.objectId && var36.field960 == var36.orientation && var36.field964 == var36.field961) { // L: 2860
										var36.remove();
									}
								}
							}
						}

						int var10002;
						for (var1 = 0; var1 < soundEffectCount; ++var1) { // L: 2868
							var10002 = queuedSoundEffectDelays[var1]--; // L: 2869
							if (queuedSoundEffectDelays[var1] >= -10) { // L: 2870
								SoundEffect var32 = soundEffects[var1]; // L: 2882
								if (var32 == null) { // L: 2883
									var10000 = null; // L: 2884
									var32 = SoundEffect.readSoundEffect(GrandExchangeOfferUnitPriceComparator.archive4, soundEffectIds[var1], 0);
									if (var32 == null) { // L: 2885
										continue;
									}

									int[] var50 = queuedSoundEffectDelays; // L: 2886
									var50[var1] += var32.calculateDelay();
									soundEffects[var1] = var32; // L: 2887
								}

								if (queuedSoundEffectDelays[var1] < 0) { // L: 2893
									if (soundLocations[var1] != 0) { // L: 2895
										var4 = (soundLocations[var1] & 255) * 128; // L: 2896
										var5 = soundLocations[var1] >> 16 & 255; // L: 2897
										var6 = var5 * 128 + 64 - WorldMapLabelSize.localPlayer.x; // L: 2898
										if (var6 < 0) { // L: 2899
											var6 = -var6;
										}

										var7 = soundLocations[var1] >> 8 & 255; // L: 2900
										var8 = var7 * 128 + 64 - WorldMapLabelSize.localPlayer.y; // L: 2901
										if (var8 < 0) { // L: 2902
											var8 = -var8;
										}

										var9 = var8 + var6 - 128; // L: 2903
										if (var9 > var4) { // L: 2904
											queuedSoundEffectDelays[var1] = -100; // L: 2905
											continue; // L: 2906
										}

										if (var9 < 0) { // L: 2908
											var9 = 0;
										}

										var3 = (var4 - var9) * areaSoundEffectVolume / var4; // L: 2909
									} else {
										var3 = soundEffectVolume; // L: 2911
									}

									if (var3 > 0) { // L: 2912
										RawSound var24 = var32.toRawSound().resample(class9.decimator); // L: 2913
										RawPcmStream var40 = RawPcmStream.createRawPcmStream(var24, 100, var3); // L: 2914
										var40.setNumLoops(queuedSoundEffectLoops[var1] - 1); // L: 2915
										Players.pcmStreamMixer.addSubStream(var40); // L: 2916
									}

									queuedSoundEffectDelays[var1] = -100; // L: 2918
								}
							} else {
								--soundEffectCount; // L: 2871

								for (var15 = var1; var15 < soundEffectCount; ++var15) { // L: 2872
									soundEffectIds[var15] = soundEffectIds[var15 + 1]; // L: 2873
									soundEffects[var15] = soundEffects[var15 + 1]; // L: 2874
									queuedSoundEffectLoops[var15] = queuedSoundEffectLoops[var15 + 1]; // L: 2875
									queuedSoundEffectDelays[var15] = queuedSoundEffectDelays[var15 + 1]; // L: 2876
									soundLocations[var15] = soundLocations[var15 + 1]; // L: 2877
								}

								--var1; // L: 2879
							}
						}

						if (field704 && !HealthBarUpdate.method1815()) { // L: 2921
							if (musicVolume != 0 && currentTrackGroupId != -1) { // L: 2922
								Script.method2322(CollisionMap.archive6, currentTrackGroupId, 0, musicVolume, false);
							}

							field704 = false; // L: 2923
						}

						++packetWriter.field1345; // L: 2926
						if (packetWriter.field1345 > 750) { // L: 2927
							ArchiveLoader.method1208(); // L: 2928
							return; // L: 2929
						}

						var1 = Players.Players_count; // L: 2932
						int[] var33 = Players.Players_indices; // L: 2933

						for (var3 = 0; var3 < var1; ++var3) { // L: 2934
							Player var42 = players[var33[var3]]; // L: 2935
							if (var42 != null) { // L: 2936
								CollisionMap.updateActorSequence(var42, 1); // L: 2937
							}
						}

						for (var1 = 0; var1 < npcCount; ++var1) { // L: 2942
							var15 = npcIndices[var1]; // L: 2943
							NPC var25 = npcs[var15]; // L: 2944
							if (var25 != null) { // L: 2945
								CollisionMap.updateActorSequence(var25, var25.definition.size); // L: 2946
							}
						}

						ClientPacket.method3706(); // L: 2950
						++field737; // L: 2951
						if (mouseCrossColor != 0) { // L: 2952
							mouseCrossState += 20; // L: 2953
							if (mouseCrossState >= 400) { // L: 2954
								mouseCrossColor = 0;
							}
						}

						if (GrandExchangeEvent.field79 != null) { // L: 2956
							++field782; // L: 2957
							if (field782 >= 15) { // L: 2958
								class52.invalidateWidget(GrandExchangeEvent.field79); // L: 2959
								GrandExchangeEvent.field79 = null; // L: 2960
							}
						}

						Widget var38 = TriBool.mousedOverWidgetIf1; // L: 2963
						Widget var34 = Occluder.field1950; // L: 2964
						TriBool.mousedOverWidgetIf1 = null; // L: 2965
						Occluder.field1950 = null; // L: 2966
						draggedOnWidget = null; // L: 2967
						field880 = false; // L: 2968
						field799 = false; // L: 2969
						field898 = 0; // L: 2970

						while (class60.isKeyDown() && field898 < 128) { // L: 2971
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && PlayerAppearance.field2581 == 66) { // L: 2972
								String var44 = ""; // L: 2975

								Message var39;
								for (Iterator var41 = Messages.Messages_hashTable.iterator(); var41.hasNext(); var44 = var44 + var39.sender + ':' + var39.text + '\n') { // L: 2976 2979
									var39 = (Message)var41.next(); // L: 2977
								}

								class2.client.clipboardSetString(var44); // L: 2985
							} else if (oculusOrbState != 1 || PacketWriter.field1350 <= 0) { // L: 2988
								field900[field898] = PlayerAppearance.field2581; // L: 2991
								field899[field898] = PacketWriter.field1350; // L: 2992
								++field898; // L: 2993
							}
						}

						if (JagexCache.method3576() && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) { // L: 2995
							var3 = WorldMapLabelSize.localPlayer.plane - mouseWheelRotation; // L: 2996
							if (var3 < 0) { // L: 2997
								var3 = 0;
							} else if (var3 > 3) { // L: 2998
								var3 = 3;
							}

							if (var3 != WorldMapLabelSize.localPlayer.plane) { // L: 2999
								var4 = WorldMapLabelSize.localPlayer.pathX[0] + WorldMapManager.baseX; // L: 3000
								var5 = WorldMapLabelSize.localPlayer.pathY[0] + WorldMapLabel.baseY; // L: 3001
								var18 = getPacketBufferNode(ClientPacket.field2327, packetWriter.isaacCipher); // L: 3004
								var18.packetBuffer.writeShort(var5); // L: 3005
								var18.packetBuffer.method5662(0); // L: 3006
								var18.packetBuffer.writeShort(var4); // L: 3007
								var18.packetBuffer.method5644(var3); // L: 3008
								packetWriter.addNode(var18); // L: 3009
							}

							mouseWheelRotation = 0; // L: 3012
						}

						if (rootInterface != -1) { // L: 3014
							GameObject.updateRootInterface(rootInterface, 0, 0, FloorDecoration.canvasWidth, GameShell.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3015

						while (true) {
							Widget var43;
							ScriptEvent var45;
							Widget var46;
							do {
								var45 = (ScriptEvent)field877.removeLast(); // L: 3017
								if (var45 == null) { // L: 3018
									while (true) {
										do {
											var45 = (ScriptEvent)field912.removeLast(); // L: 3029
											if (var45 == null) { // L: 3030
												while (true) {
													do {
														var45 = (ScriptEvent)scriptEvents.removeLast(); // L: 3041
														if (var45 == null) { // L: 3042
															this.menu(); // L: 3052
															if (Message.worldMap != null) { // L: 3054
																Message.worldMap.method6482(Huffman.Client_plane, (WorldMapLabelSize.localPlayer.x >> 7) + WorldMapManager.baseX, (WorldMapLabelSize.localPlayer.y >> 7) + WorldMapLabel.baseY, false); // L: 3055
																Message.worldMap.loadCache(); // L: 3056
															}

															if (clickedWidget != null) { // L: 3059
																this.method1458();
															}

															PacketBufferNode var47;
															if (BuddyRankComparator.dragInventoryWidget != null) { // L: 3060
																class52.invalidateWidget(BuddyRankComparator.dragInventoryWidget); // L: 3061
																++itemDragDuration; // L: 3062
																if (MouseHandler.MouseHandler_currentButton == 0) { // L: 3063
																	if (field788) { // L: 3064
																		if (BuddyRankComparator.dragInventoryWidget == VerticalAlignment.hoveredItemContainer && dragItemSlotSource != dragItemSlotDestination) { // L: 3065
																			Widget var48 = BuddyRankComparator.dragInventoryWidget; // L: 3066
																			byte var35 = 0; // L: 3067
																			if (field707 == 1 && var48.contentType == 206) { // L: 3068
																				var35 = 1;
																			}

																			if (var48.itemIds[dragItemSlotDestination] <= 0) { // L: 3069
																				var35 = 0;
																			}

																			if (Widget.method4172(WorldMapIcon_0.getWidgetFlags(var48))) { // L: 3070
																				var5 = dragItemSlotSource; // L: 3071
																				var6 = dragItemSlotDestination; // L: 3072
																				var48.itemIds[var6] = var48.itemIds[var5]; // L: 3073
																				var48.itemQuantities[var6] = var48.itemQuantities[var5]; // L: 3074
																				var48.itemIds[var5] = -1; // L: 3075
																				var48.itemQuantities[var5] = 0; // L: 3076
																			} else if (var35 == 1) { // L: 3078
																				var5 = dragItemSlotSource; // L: 3079
																				var6 = dragItemSlotDestination; // L: 3080

																				while (var6 != var5) { // L: 3081
																					if (var5 > var6) { // L: 3082
																						var48.swapItems(var5 - 1, var5); // L: 3083
																						--var5; // L: 3084
																					} else if (var5 < var6) { // L: 3086
																						var48.swapItems(var5 + 1, var5); // L: 3087
																						++var5; // L: 3088
																					}
																				}
																			} else {
																				var48.swapItems(dragItemSlotDestination, dragItemSlotSource); // L: 3093
																			}

																			var47 = getPacketBufferNode(ClientPacket.field2309, packetWriter.isaacCipher); // L: 3096
																			var47.packetBuffer.method5662(BuddyRankComparator.dragInventoryWidget.id); // L: 3097
																			var47.packetBuffer.writeShort(dragItemSlotDestination); // L: 3098
																			var47.packetBuffer.writeByte(var35); // L: 3099
																			var47.packetBuffer.method5654(dragItemSlotSource); // L: 3100
																			packetWriter.addNode(var47); // L: 3101
																		}
																	} else if (this.shouldLeftClickOpenMenu()) { // L: 3105
																		this.openMenu(draggedWidgetX, draggedWidgetY); // L: 3106
																	} else if (menuOptionsCount > 0) { // L: 3108
																		SecureRandomFuture.method2211(draggedWidgetX, draggedWidgetY); // L: 3109
																	}

																	field782 = 10; // L: 3112
																	MouseHandler.MouseHandler_lastButton = 0; // L: 3113
																	BuddyRankComparator.dragInventoryWidget = null; // L: 3114
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) { // L: 3117 3118
																	field788 = true; // L: 3119
																}
															}

															if (Scene.shouldSendWalk()) { // L: 3124
																var3 = Scene.Scene_selectedX; // L: 3125
																var4 = Scene.Scene_selectedY; // L: 3126
																var47 = getPacketBufferNode(ClientPacket.field2344, packetWriter.isaacCipher); // L: 3128
																var47.packetBuffer.writeByte(5); // L: 3129
																var47.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3130
																var47.packetBuffer.method5654(var3 + WorldMapManager.baseX); // L: 3131
																var47.packetBuffer.writeShort(var4 + WorldMapLabel.baseY); // L: 3132
																packetWriter.addNode(var47); // L: 3133
																Scene.method3360(); // L: 3134
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3135
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3136
																mouseCrossColor = 1; // L: 3137
																mouseCrossState = 0; // L: 3138
																destinationX = var3; // L: 3139
																destinationY = var4; // L: 3140
															}

															if (var38 != TriBool.mousedOverWidgetIf1) { // L: 3142
																if (var38 != null) { // L: 3143
																	class52.invalidateWidget(var38);
																}

																if (TriBool.mousedOverWidgetIf1 != null) { // L: 3144
																	class52.invalidateWidget(TriBool.mousedOverWidgetIf1);
																}
															}

															if (var34 != Occluder.field1950 && field770 == field828) { // L: 3146
																if (var34 != null) { // L: 3147
																	class52.invalidateWidget(var34);
																}

																if (Occluder.field1950 != null) { // L: 3148
																	class52.invalidateWidget(Occluder.field1950);
																}
															}

															if (Occluder.field1950 != null) { // L: 3150
																if (field828 < field770) { // L: 3151
																	++field828; // L: 3152
																	if (field770 == field828) { // L: 3153
																		class52.invalidateWidget(Occluder.field1950);
																	}
																}
															} else if (field828 > 0) { // L: 3156
																--field828;
															}

															WorldMapAreaData.method752(); // L: 3157
															if (isCameraLocked) { // L: 3158
																var3 = HealthBarUpdate.field1038 * 128 + 64; // L: 3159
																var4 = class8.field43 * 128 + 64; // L: 3160
																var5 = ArchiveLoader.getTileHeight(var3, var4, Huffman.Client_plane) - FileSystem.field2099; // L: 3161
																if (VertexNormal.cameraX < var3) { // L: 3162
																	VertexNormal.cameraX = (var3 - VertexNormal.cameraX) * FloorDecoration.field1640 / 1000 + VertexNormal.cameraX + MouseRecorder.field609; // L: 3163
																	if (VertexNormal.cameraX > var3) { // L: 3164
																		VertexNormal.cameraX = var3;
																	}
																}

																if (VertexNormal.cameraX > var3) { // L: 3166
																	VertexNormal.cameraX -= FloorDecoration.field1640 * (VertexNormal.cameraX - var3) / 1000 + MouseRecorder.field609; // L: 3167
																	if (VertexNormal.cameraX < var3) { // L: 3168
																		VertexNormal.cameraX = var3;
																	}
																}

																if (FaceNormal.cameraY < var5) { // L: 3170
																	FaceNormal.cameraY = (var5 - FaceNormal.cameraY) * FloorDecoration.field1640 / 1000 + FaceNormal.cameraY + MouseRecorder.field609; // L: 3171
																	if (FaceNormal.cameraY > var5) { // L: 3172
																		FaceNormal.cameraY = var5;
																	}
																}

																if (FaceNormal.cameraY > var5) { // L: 3174
																	FaceNormal.cameraY -= FloorDecoration.field1640 * (FaceNormal.cameraY - var5) / 1000 + MouseRecorder.field609; // L: 3175
																	if (FaceNormal.cameraY < var5) { // L: 3176
																		FaceNormal.cameraY = var5;
																	}
																}

																if (AbstractWorldMapData.cameraZ < var4) { // L: 3178
																	AbstractWorldMapData.cameraZ = (var4 - AbstractWorldMapData.cameraZ) * FloorDecoration.field1640 / 1000 + AbstractWorldMapData.cameraZ + MouseRecorder.field609; // L: 3179
																	if (AbstractWorldMapData.cameraZ > var4) { // L: 3180
																		AbstractWorldMapData.cameraZ = var4;
																	}
																}

																if (AbstractWorldMapData.cameraZ > var4) { // L: 3182
																	AbstractWorldMapData.cameraZ -= FloorDecoration.field1640 * (AbstractWorldMapData.cameraZ - var4) / 1000 + MouseRecorder.field609; // L: 3183
																	if (AbstractWorldMapData.cameraZ < var4) { // L: 3184
																		AbstractWorldMapData.cameraZ = var4;
																	}
																}

																var3 = SoundCache.field1472 * 128 + 64; // L: 3186
																var4 = TextureProvider.field1561 * 128 + 64; // L: 3187
																var5 = ArchiveLoader.getTileHeight(var3, var4, Huffman.Client_plane) - IgnoreList.field3620; // L: 3188
																var6 = var3 - VertexNormal.cameraX; // L: 3189
																var7 = var5 - FaceNormal.cameraY; // L: 3190
																var8 = var4 - AbstractWorldMapData.cameraZ; // L: 3191
																var9 = (int)Math.sqrt((double)(var8 * var8 + var6 * var6)); // L: 3192
																var10 = (int)(Math.atan2((double)var7, (double)var9) * 325.949D) & 2047; // L: 3193
																var11 = (int)(Math.atan2((double)var6, (double)var8) * -325.949D) & 2047; // L: 3194
																if (var10 < 128) { // L: 3195
																	var10 = 128;
																}

																if (var10 > 383) { // L: 3196
																	var10 = 383;
																}

																if (PacketBuffer.cameraPitch < var10) { // L: 3197
																	PacketBuffer.cameraPitch = (var10 - PacketBuffer.cameraPitch) * class225.field2592 / 1000 + PacketBuffer.cameraPitch + UserComparator9.field2013; // L: 3198
																	if (PacketBuffer.cameraPitch > var10) { // L: 3199
																		PacketBuffer.cameraPitch = var10;
																	}
																}

																if (PacketBuffer.cameraPitch > var10) { // L: 3201
																	PacketBuffer.cameraPitch -= class225.field2592 * (PacketBuffer.cameraPitch - var10) / 1000 + UserComparator9.field2013; // L: 3202
																	if (PacketBuffer.cameraPitch < var10) { // L: 3203
																		PacketBuffer.cameraPitch = var10;
																	}
																}

																var12 = var11 - ServerPacket.cameraYaw; // L: 3205
																if (var12 > 1024) { // L: 3206
																	var12 -= 2048;
																}

																if (var12 < -1024) { // L: 3207
																	var12 += 2048;
																}

																if (var12 > 0) { // L: 3208
																	ServerPacket.cameraYaw = var12 * class225.field2592 / 1000 + ServerPacket.cameraYaw + UserComparator9.field2013; // L: 3209
																	ServerPacket.cameraYaw &= 2047; // L: 3210
																}

																if (var12 < 0) { // L: 3212
																	ServerPacket.cameraYaw -= UserComparator9.field2013 + -var12 * class225.field2592 / 1000; // L: 3213
																	ServerPacket.cameraYaw &= 2047; // L: 3214
																}

																int var26 = var11 - ServerPacket.cameraYaw; // L: 3216
																if (var26 > 1024) { // L: 3217
																	var26 -= 2048;
																}

																if (var26 < -1024) { // L: 3218
																	var26 += 2048;
																}

																if (var26 < 0 && var12 > 0 || var26 > 0 && var12 < 0) { // L: 3219
																	ServerPacket.cameraYaw = var11;
																}
															}

															for (var3 = 0; var3 < 5; ++var3) { // L: 3221
																var10002 = field926[var3]++;
															}

															ClientPreferences.varcs.tryWrite(); // L: 3222
															var3 = ++MouseHandler.MouseHandler_idleCycles - 1; // L: 3225
															var5 = class41.method622(); // L: 3228
															if (var3 > 15000 && var5 > 15000) { // L: 3229
																logoutTimer = 250; // L: 3230
																MouseHandler.MouseHandler_idleCycles = 14500; // L: 3232
																var18 = getPacketBufferNode(ClientPacket.field2258, packetWriter.isaacCipher); // L: 3235
																packetWriter.addNode(var18); // L: 3236
															}

															class60.friendSystem.processFriendUpdates(); // L: 3238
															++packetWriter.pendingWrites; // L: 3239
															if (packetWriter.pendingWrites > 50) { // L: 3240
																var18 = getPacketBufferNode(ClientPacket.field2267, packetWriter.isaacCipher); // L: 3242
																packetWriter.addNode(var18); // L: 3243
															}

															try {
																packetWriter.flush(); // L: 3246
															} catch (IOException var27) { // L: 3248
																ArchiveLoader.method1208(); // L: 3249
															}

															return; // L: 3251
														}

														var46 = var45.widget; // L: 3043
														if (var46.childIndex < 0) { // L: 3044
															break;
														}

														var43 = TileItem.getWidget(var46.parentId); // L: 3045
													} while(var43 == null || var43.children == null || var46.childIndex >= var43.children.length || var46 != var43.children[var46.childIndex]); // L: 3046

													Script.runScriptEvent(var45); // L: 3050
												}
											}

											var46 = var45.widget; // L: 3031
											if (var46.childIndex < 0) { // L: 3032
												break;
											}

											var43 = TileItem.getWidget(var46.parentId); // L: 3033
										} while(var43 == null || var43.children == null || var46.childIndex >= var43.children.length || var46 != var43.children[var46.childIndex]); // L: 3034

										Script.runScriptEvent(var45); // L: 3038
									}
								}

								var46 = var45.widget; // L: 3019
								if (var46.childIndex < 0) { // L: 3020
									break;
								}

								var43 = TileItem.getWidget(var46.parentId); // L: 3021
							} while(var43 == null || var43.children == null || var46.childIndex >= var43.children.length || var46 != var43.children[var46.childIndex]); // L: 3022

							Script.runScriptEvent(var45); // L: 3026
						}
					}

					var30 = getPacketBufferNode(ClientPacket.field2329, packetWriter.isaacCipher); // L: 2637
					var30.packetBuffer.writeByte(0); // L: 2638
					var3 = var30.packetBuffer.offset; // L: 2639
					class195.performReflectionCheck(var30.packetBuffer); // L: 2640
					var30.packetBuffer.writeLengthByte(var30.packetBuffer.offset - var3); // L: 2641
					packetWriter.addNode(var30); // L: 2642
				}
			}
		}
	} // L: 2619

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-415953705"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = FloorDecoration.canvasWidth; // L: 3894
		int var2 = GameShell.canvasHeight; // L: 3895
		if (super.contentWidth < var1) { // L: 3896
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight; // L: 3897
		}

		if (Tile.clientPreferences != null) { // L: 3898
			try {
				class56.method899(class2.client, "resize", new Object[]{class39.getWindowedMode()}); // L: 3900
			} catch (Throwable var4) { // L: 3902
			}
		}

	} // L: 3904

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1826762039"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) { // L: 3907
			class58.method913(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 3908
			if (field882[var1]) { // L: 3909
				field883[var1] = true;
			}

			field884[var1] = field882[var1]; // L: 3910
			field882[var1] = false; // L: 3911
		}

		field881 = cycle; // L: 3913
		viewportX = -1; // L: 3914
		viewportY = -1; // L: 3915
		VerticalAlignment.hoveredItemContainer = null; // L: 3916
		if (rootInterface != -1) { // L: 3917
			rootWidgetCount = 0; // L: 3918
			PlayerAppearance.drawWidgets(rootInterface, 0, 0, FloorDecoration.canvasWidth, GameShell.canvasHeight, 0, 0, -1); // L: 3919
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 3921
		if (showMouseCross) { // L: 3922
			if (mouseCrossColor == 1) { // L: 3923
				ArchiveLoader.crossSprites[mouseCrossState / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 3924
			}

			if (mouseCrossColor == 2) { // L: 3926
				ArchiveLoader.crossSprites[mouseCrossState / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 3927
			}
		}

		if (!isMenuOpen) { // L: 3930
			if (viewportX != -1) { // L: 3931
				var1 = viewportX; // L: 3932
				int var2 = viewportY; // L: 3933
				if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) { // L: 3935 3936
					int var3 = GrandExchangeOffer.method209(); // L: 3937
					String var4;
					if (isItemSelected == 1 && menuOptionsCount < 2) { // L: 3939
						var4 = "Use" + " " + selectedItemName + " " + "->";
					} else if (isSpellSelected && menuOptionsCount < 2) { // L: 3940
						var4 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
					} else {
						var4 = ApproximateRouteStrategy.method1273(var3); // L: 3941
					}

					if (menuOptionsCount > 2) { // L: 3942
						var4 = var4 + WorldMapAreaData.colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2) + " more options";
					}

					class4.fontBold12.drawRandomAlphaAndSpacing(var4, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000); // L: 3943
				}
			}
		} else {
			UserComparator1.method6040(); // L: 3947
		}

		if (gameDrawingMode == 3) { // L: 3948
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 3949
				if (field884[var1]) { // L: 3950
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 3951
				} else if (field883[var1]) { // L: 3953
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 3954
				}
			}
		}

		class197.method3743(Huffman.Client_plane, WorldMapLabelSize.localPlayer.x, WorldMapLabelSize.localPlayer.y, field737); // L: 3958
		field737 = 0; // L: 3959
	} // L: 3960

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(Ldx;B)Z",
		garbageValue = "13"
	)
	final boolean method1707(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 5313
		PacketBuffer var3 = var1.packetBuffer; // L: 5314
		if (var2 == null) { // L: 5315
			return false;
		} else {
			String var17;
			int var18;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 5317
					if (var1.field1344) { // L: 5318
						if (!var2.isAvailable(1)) { // L: 5319
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 5320
						var1.field1345 = 0; // L: 5321
						var1.field1344 = false; // L: 5322
					}

					var3.offset = 0; // L: 5324
					if (var3.method5564()) { // L: 5325
						if (!var2.isAvailable(1)) { // L: 5326
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 5327
						var1.field1345 = 0; // L: 5328
					}

					var1.field1344 = true; // L: 5330
					ServerPacket[] var4 = class198.ServerPacket_values(); // L: 5331
					var5 = var3.readSmartByteShortIsaac(); // L: 5332
					if (var5 < 0 || var5 >= var4.length) { // L: 5333
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 5334
					var1.serverPacketLength = var1.serverPacket.length; // L: 5335
				}

				if (var1.serverPacketLength == -1) { // L: 5337
					if (!var2.isAvailable(1)) { // L: 5338
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 5339
					var1.serverPacketLength = var3.array[0] & 255; // L: 5340
				}

				if (var1.serverPacketLength == -2) { // L: 5342
					if (!var2.isAvailable(2)) { // L: 5343
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 5344
					var3.offset = 0; // L: 5345
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 5346
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 5348
					return false;
				}

				var3.offset = 0; // L: 5349
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 5350
				var1.field1345 = 0; // L: 5351
				timer.method5106(); // L: 5352
				var1.field1346 = var1.field1348; // L: 5353
				var1.field1348 = var1.field1336; // L: 5354
				var1.field1336 = var1.serverPacket; // L: 5355
				int var16;
				if (ServerPacket.field2161 == var1.serverPacket) { // L: 5356
					for (var16 = 0; var16 < VarpDefinition.VarpDefinition_fileCount; ++var16) { // L: 5357
						VarpDefinition var55 = class195.VarpDefinition_get(var16); // L: 5358
						if (var55 != null) { // L: 5359
							Varps.Varps_temp[var16] = 0; // L: 5360
							Varps.Varps_main[var16] = 0; // L: 5361
						}
					}

					DevicePcmPlayerProvider.method897(); // L: 5364
					field864 += 32; // L: 5365
					var1.serverPacket = null; // L: 5366
					return true; // L: 5367
				}

				if (ServerPacket.field2219 == var1.serverPacket) { // L: 5369
					byte var59 = var3.method5730(); // L: 5370
					var5 = var3.readUnsignedShort(); // L: 5371
					Varps.Varps_temp[var5] = var59; // L: 5372
					if (Varps.Varps_main[var5] != var59) { // L: 5373
						Varps.Varps_main[var5] = var59; // L: 5374
					}

					Clock.changeGameOptions(var5); // L: 5376
					field863[++field864 - 1 & 31] = var5; // L: 5377
					var1.serverPacket = null; // L: 5378
					return true; // L: 5379
				}

				if (ServerPacket.field2160 == var1.serverPacket) { // L: 5381
					MouseHandler.method1134(class194.field2363); // L: 5382
					var1.serverPacket = null; // L: 5383
					return true; // L: 5384
				}

				if (ServerPacket.field2208 == var1.serverPacket) { // L: 5386
					rebootTimer = var3.readUnsignedShort() * 30; // L: 5387
					field775 = cycleCntr; // L: 5388
					var1.serverPacket = null; // L: 5389
					return true; // L: 5390
				}

				if (ServerPacket.field2186 == var1.serverPacket) { // L: 5392
					World var39 = new World(); // L: 5393
					var39.host = var3.readStringCp1252NullTerminated(); // L: 5394
					var39.id = var3.readUnsignedShort(); // L: 5395
					var5 = var3.readInt(); // L: 5396
					var39.properties = var5; // L: 5397
					CollisionMap.updateGameState(45); // L: 5398
					var2.close(); // L: 5399
					var2 = null; // L: 5400
					Canvas.changeWorld(var39); // L: 5401
					var1.serverPacket = null; // L: 5402
					return false; // L: 5403
				}

				if (ServerPacket.field2196 == var1.serverPacket) { // L: 5405
					var16 = var3.readInt(); // L: 5406
					if (var16 != field758) { // L: 5407
						field758 = var16; // L: 5408
						ItemContainer.method1225(); // L: 5409
					}

					var1.serverPacket = null; // L: 5411
					return true; // L: 5412
				}

				String var42;
				boolean var48;
				if (ServerPacket.field2222 == var1.serverPacket) { // L: 5414
					var16 = var3.readUShortSmart(); // L: 5415
					var48 = var3.readUnsignedByte() == 1; // L: 5416
					var42 = ""; // L: 5417
					boolean var47 = false; // L: 5418
					if (var48) { // L: 5419
						var42 = var3.readStringCp1252NullTerminated(); // L: 5420
						if (class60.friendSystem.isIgnored(new Username(var42, WorldMapAreaData.loginType))) { // L: 5421
							var47 = true;
						}
					}

					String var44 = var3.readStringCp1252NullTerminated(); // L: 5423
					if (!var47) { // L: 5424
						WorldMapRectangle.addGameMessage(var16, var42, var44);
					}

					var1.serverPacket = null; // L: 5425
					return true; // L: 5426
				}

				if (ServerPacket.field2234 == var1.serverPacket) { // L: 5428
					if (rootInterface != -1) { // L: 5429
						ClientPacket.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 5430
					return true; // L: 5431
				}

				int var7;
				long var9;
				int var19;
				if (ServerPacket.field2223 == var1.serverPacket) { // L: 5433
					var16 = var3.method5667(); // L: 5434
					var5 = var3.method5656(); // L: 5435
					if (var5 == 65535) { // L: 5436
						var5 = -1;
					}

					var18 = var3.readInt(); // L: 5437
					var7 = var3.method5656(); // L: 5438
					if (var7 == 65535) { // L: 5439
						var7 = -1;
					}

					for (var19 = var5; var19 <= var7; ++var19) { // L: 5440
						var9 = ((long)var16 << 32) + (long)var19; // L: 5441
						Node var46 = widgetFlags.get(var9); // L: 5442
						if (var46 != null) { // L: 5443
							var46.remove();
						}

						widgetFlags.put(new IntegerNode(var18), var9); // L: 5444
					}

					var1.serverPacket = null; // L: 5446
					return true; // L: 5447
				}

				long var12;
				int var20;
				int var22;
				InterfaceParent var56;
				if (ServerPacket.field2180 == var1.serverPacket) { // L: 5449
					var16 = var3.offset + var1.serverPacketLength; // L: 5450
					var5 = var3.readUnsignedShort(); // L: 5451
					var18 = var3.readUnsignedShort(); // L: 5452
					if (var5 != rootInterface) { // L: 5453
						rootInterface = var5; // L: 5454
						this.resizeRoot(false); // L: 5455
						PacketWriter.Widget_resetModelFrames(rootInterface); // L: 5456
						class235.runWidgetOnLoadListener(rootInterface); // L: 5457

						for (var7 = 0; var7 < 100; ++var7) { // L: 5458
							field882[var7] = true;
						}
					}

					InterfaceParent var45;
					for (; var18-- > 0; var45.field580 = true) { // L: 5460 5470
						var7 = var3.readInt(); // L: 5461
						var19 = var3.readUnsignedShort(); // L: 5462
						var20 = var3.readUnsignedByte(); // L: 5463
						var45 = (InterfaceParent)interfaceParents.get((long)var7); // L: 5464
						if (var45 != null && var19 != var45.group) { // L: 5465
							class58.closeInterface(var45, true); // L: 5466
							var45 = null; // L: 5467
						}

						if (var45 == null) { // L: 5469
							var45 = WorldMapSprite.method494(var7, var19, var20);
						}
					}

					for (var56 = (InterfaceParent)interfaceParents.first(); var56 != null; var56 = (InterfaceParent)interfaceParents.next()) { // L: 5472
						if (var56.field580) { // L: 5473
							var56.field580 = false;
						} else {
							class58.closeInterface(var56, true); // L: 5475
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 5478

					while (var3.offset < var16) { // L: 5479
						var7 = var3.readInt(); // L: 5480
						var19 = var3.readUnsignedShort(); // L: 5481
						var20 = var3.readUnsignedShort(); // L: 5482
						var22 = var3.readInt(); // L: 5483

						for (int var23 = var19; var23 <= var20; ++var23) { // L: 5484
							var12 = ((long)var7 << 32) + (long)var23; // L: 5485
							widgetFlags.put(new IntegerNode(var22), var12); // L: 5486
						}
					}

					var1.serverPacket = null; // L: 5489
					return true; // L: 5490
				}

				if (ServerPacket.field2179 == var1.serverPacket) { // L: 5492
					class60.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 5493
					KitDefinition.FriendSystem_invalidateIgnoreds(); // L: 5494
					field870 = cycleCntr; // L: 5495
					var1.serverPacket = null; // L: 5496
					return true; // L: 5497
				}

				if (ServerPacket.field2172 == var1.serverPacket) { // L: 5499
					WorldMapID.loadRegions(true, var1.packetBuffer); // L: 5500
					var1.serverPacket = null; // L: 5501
					return true; // L: 5502
				}

				if (ServerPacket.field2206 == var1.serverPacket) { // L: 5504
					MouseHandler.method1134(class194.field2367); // L: 5505
					var1.serverPacket = null; // L: 5506
					return true; // L: 5507
				}

				if (ServerPacket.field2221 == var1.serverPacket) { // L: 5509
					var16 = var3.readUnsignedByte(); // L: 5510
					Frames.method3393(var16); // L: 5511
					var1.serverPacket = null; // L: 5512
					return true; // L: 5513
				}

				if (ServerPacket.field2184 == var1.serverPacket) { // L: 5515
					WorldMapLabelSize.readReflectionCheck(var3, var1.serverPacketLength); // L: 5516
					var1.serverPacket = null; // L: 5517
					return true; // L: 5518
				}

				if (ServerPacket.field2174 == var1.serverPacket) { // L: 5520
					isCameraLocked = true; // L: 5521
					SoundCache.field1472 = var3.readUnsignedByte(); // L: 5522
					TextureProvider.field1561 = var3.readUnsignedByte(); // L: 5523
					IgnoreList.field3620 = var3.readUnsignedShort(); // L: 5524
					UserComparator9.field2013 = var3.readUnsignedByte(); // L: 5525
					class225.field2592 = var3.readUnsignedByte(); // L: 5526
					if (class225.field2592 >= 100) { // L: 5527
						var16 = SoundCache.field1472 * 128 + 64; // L: 5528
						var5 = TextureProvider.field1561 * 128 + 64; // L: 5529
						var18 = ArchiveLoader.getTileHeight(var16, var5, Huffman.Client_plane) - IgnoreList.field3620; // L: 5530
						var7 = var16 - VertexNormal.cameraX; // L: 5531
						var19 = var18 - FaceNormal.cameraY; // L: 5532
						var20 = var5 - AbstractWorldMapData.cameraZ; // L: 5533
						var22 = (int)Math.sqrt((double)(var7 * var7 + var20 * var20)); // L: 5534
						PacketBuffer.cameraPitch = (int)(Math.atan2((double)var19, (double)var22) * 325.949D) & 2047; // L: 5535
						ServerPacket.cameraYaw = (int)(Math.atan2((double)var7, (double)var20) * -325.949D) & 2047; // L: 5536
						if (PacketBuffer.cameraPitch < 128) { // L: 5537
							PacketBuffer.cameraPitch = 128;
						}

						if (PacketBuffer.cameraPitch > 383) { // L: 5538
							PacketBuffer.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 5540
					return true; // L: 5541
				}

				if (ServerPacket.field2195 == var1.serverPacket) { // L: 5543
					isCameraLocked = false; // L: 5544

					for (var16 = 0; var16 < 5; ++var16) { // L: 5545
						field922[var16] = false;
					}

					var1.serverPacket = null; // L: 5546
					return true; // L: 5547
				}

				if (ServerPacket.field2164 == var1.serverPacket) { // L: 5549
					var16 = var3.readInt(); // L: 5550
					InterfaceParent var54 = (InterfaceParent)interfaceParents.get((long)var16); // L: 5551
					if (var54 != null) { // L: 5552
						class58.closeInterface(var54, true);
					}

					if (meslayerContinueWidget != null) { // L: 5553
						class52.invalidateWidget(meslayerContinueWidget); // L: 5554
						meslayerContinueWidget = null; // L: 5555
					}

					var1.serverPacket = null; // L: 5557
					return true; // L: 5558
				}

				if (ServerPacket.field2191 == var1.serverPacket) { // L: 5560
					byte[] var38 = new byte[var1.serverPacketLength]; // L: 5561
					var3.method5566(var38, 0, var38.length); // L: 5562
					Buffer var53 = new Buffer(var38); // L: 5563
					var42 = var53.readStringCp1252NullTerminated(); // L: 5564
					class280.openURL(var42, true, false); // L: 5565
					var1.serverPacket = null; // L: 5566
					return true; // L: 5567
				}

				if (ServerPacket.field2205 == var1.serverPacket) { // L: 5569
					var16 = var3.method5655(); // L: 5570
					rootInterface = var16; // L: 5571
					this.resizeRoot(false); // L: 5572
					PacketWriter.Widget_resetModelFrames(var16); // L: 5573
					class235.runWidgetOnLoadListener(rootInterface); // L: 5574

					for (var5 = 0; var5 < 100; ++var5) { // L: 5575
						field882[var5] = true;
					}

					var1.serverPacket = null; // L: 5576
					return true; // L: 5577
				}

				if (ServerPacket.field2244 == var1.serverPacket) { // L: 5579
					isCameraLocked = true; // L: 5580
					HealthBarUpdate.field1038 = var3.readUnsignedByte(); // L: 5581
					class8.field43 = var3.readUnsignedByte(); // L: 5582
					FileSystem.field2099 = var3.readUnsignedShort(); // L: 5583
					MouseRecorder.field609 = var3.readUnsignedByte(); // L: 5584
					FloorDecoration.field1640 = var3.readUnsignedByte(); // L: 5585
					if (FloorDecoration.field1640 >= 100) { // L: 5586
						VertexNormal.cameraX = HealthBarUpdate.field1038 * 128 + 64; // L: 5587
						AbstractWorldMapData.cameraZ = class8.field43 * 128 + 64; // L: 5588
						FaceNormal.cameraY = ArchiveLoader.getTileHeight(VertexNormal.cameraX, AbstractWorldMapData.cameraZ, Huffman.Client_plane) - FileSystem.field2099; // L: 5589
					}

					var1.serverPacket = null; // L: 5591
					return true; // L: 5592
				}

				if (ServerPacket.field2239 == var1.serverPacket) { // L: 5594
					FloorOverlayDefinition.updateNpcs(true, var3); // L: 5595
					var1.serverPacket = null; // L: 5596
					return true; // L: 5597
				}

				if (ServerPacket.field2211 == var1.serverPacket) { // L: 5599
					var16 = var3.readInt(); // L: 5600
					var5 = var3.method5657(); // L: 5601
					Varps.Varps_temp[var5] = var16; // L: 5602
					if (Varps.Varps_main[var5] != var16) { // L: 5603
						Varps.Varps_main[var5] = var16; // L: 5604
					}

					Clock.changeGameOptions(var5); // L: 5606
					field863[++field864 - 1 & 31] = var5; // L: 5607
					var1.serverPacket = null; // L: 5608
					return true; // L: 5609
				}

				Widget var6;
				if (ServerPacket.field2189 == var1.serverPacket) { // L: 5611
					var16 = var3.method5655(); // L: 5612
					var5 = var3.method5667(); // L: 5613
					var6 = TileItem.getWidget(var5); // L: 5614
					if (var6.modelType != 1 || var16 != var6.modelId) { // L: 5615
						var6.modelType = 1; // L: 5616
						var6.modelId = var16; // L: 5617
						class52.invalidateWidget(var6); // L: 5618
					}

					var1.serverPacket = null; // L: 5620
					return true; // L: 5621
				}

				if (ServerPacket.field2242 == var1.serverPacket) { // L: 5623
					destinationX = var3.readUnsignedByte(); // L: 5624
					if (destinationX == 255) { // L: 5625
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 5626
					if (destinationY == 255) { // L: 5627
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 5628
					return true; // L: 5629
				}

				if (ServerPacket.field2220 == var1.serverPacket) { // L: 5631
					Player.privateChatMode = TileItem.method2202(var3.readUnsignedByte()); // L: 5632
					var1.serverPacket = null; // L: 5633
					return true; // L: 5634
				}

				if (ServerPacket.field2227 == var1.serverPacket) { // L: 5636
					var16 = var3.method5708(); // L: 5637
					var48 = var3.method5612() == 1; // L: 5638
					var6 = TileItem.getWidget(var16); // L: 5639
					if (var48 != var6.isHidden) { // L: 5640
						var6.isHidden = var48; // L: 5641
						class52.invalidateWidget(var6); // L: 5642
					}

					var1.serverPacket = null; // L: 5644
					return true; // L: 5645
				}

				if (ServerPacket.field2202 == var1.serverPacket) { // L: 5647
					MouseHandler.method1134(class194.field2371); // L: 5648
					var1.serverPacket = null; // L: 5649
					return true; // L: 5650
				}

				if (ServerPacket.field2238 == var1.serverPacket) { // L: 5652
					var16 = var3.readUnsignedShort(); // L: 5653
					var5 = var3.readUnsignedByte(); // L: 5654
					var18 = var3.readUnsignedShort(); // L: 5655
					class7.queueSoundEffect(var16, var5, var18); // L: 5656
					var1.serverPacket = null; // L: 5657
					return true; // L: 5658
				}

				if (ServerPacket.field2171 == var1.serverPacket) { // L: 5660
					ViewportMouse.method3098(var3.readStringCp1252NullTerminated()); // L: 5661
					var1.serverPacket = null; // L: 5662
					return true; // L: 5663
				}

				Widget var51;
				if (ServerPacket.field2182 == var1.serverPacket) { // L: 5665
					var16 = var3.method5708(); // L: 5666
					var51 = TileItem.getWidget(var16); // L: 5667

					for (var18 = 0; var18 < var51.itemIds.length; ++var18) { // L: 5668
						var51.itemIds[var18] = -1; // L: 5669
						var51.itemIds[var18] = 0; // L: 5670
					}

					class52.invalidateWidget(var51); // L: 5672
					var1.serverPacket = null; // L: 5673
					return true; // L: 5674
				}

				if (ServerPacket.field2214 == var1.serverPacket) { // L: 5676
					class60.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 5677
					field870 = cycleCntr; // L: 5678
					var1.serverPacket = null; // L: 5679
					return true; // L: 5680
				}

				if (ServerPacket.field2165 == var1.serverPacket) { // L: 5682
					var16 = var3.readInt(); // L: 5683
					var5 = var3.readUnsignedShort(); // L: 5684
					if (var16 < -70000) { // L: 5685
						var5 += 32768;
					}

					if (var16 >= 0) { // L: 5687
						var6 = TileItem.getWidget(var16);
					} else {
						var6 = null; // L: 5688
					}

					if (var6 != null) { // L: 5689
						for (var7 = 0; var7 < var6.itemIds.length; ++var7) { // L: 5690
							var6.itemIds[var7] = 0; // L: 5691
							var6.itemQuantities[var7] = 0; // L: 5692
						}
					}

					SequenceDefinition.clearItemContainer(var5); // L: 5695
					var7 = var3.readUnsignedShort(); // L: 5696

					for (var19 = 0; var19 < var7; ++var19) { // L: 5697
						var20 = var3.method5655(); // L: 5698
						var22 = var3.method5612(); // L: 5699
						if (var22 == 255) { // L: 5700
							var22 = var3.method5708();
						}

						if (var6 != null && var19 < var6.itemIds.length) { // L: 5701 5702
							var6.itemIds[var19] = var20; // L: 5703
							var6.itemQuantities[var19] = var22; // L: 5704
						}

						MidiPcmStream.itemContainerSetItem(var5, var19, var20 - 1, var22); // L: 5707
					}

					if (var6 != null) { // L: 5709
						class52.invalidateWidget(var6);
					}

					DevicePcmPlayerProvider.method897(); // L: 5710
					changedItemContainers[++field903 - 1 & 31] = var5 & 32767; // L: 5711
					var1.serverPacket = null; // L: 5712
					return true; // L: 5713
				}

				if (ServerPacket.field2209 == var1.serverPacket) { // L: 5715
					var16 = var3.readInt(); // L: 5716
					var5 = var3.readInt(); // L: 5717
					var18 = WorldMapData_1.getGcDuration(); // L: 5718
					PacketBufferNode var57 = getPacketBufferNode(ClientPacket.field2262, packetWriter.isaacCipher); // L: 5720
					var57.packetBuffer.writeIntME(var18); // L: 5721
					var57.packetBuffer.method5645(GameShell.fps); // L: 5722
					var57.packetBuffer.method5662(var16); // L: 5723
					var57.packetBuffer.writeShortLE(var5); // L: 5724
					packetWriter.addNode(var57); // L: 5725
					var1.serverPacket = null; // L: 5726
					return true; // L: 5727
				}

				if (ServerPacket.field2163 == var1.serverPacket) { // L: 5729
					for (var16 = 0; var16 < Varps.Varps_main.length; ++var16) { // L: 5730
						if (Varps.Varps_main[var16] != Varps.Varps_temp[var16]) { // L: 5731
							Varps.Varps_main[var16] = Varps.Varps_temp[var16]; // L: 5732
							Clock.changeGameOptions(var16); // L: 5733
							field863[++field864 - 1 & 31] = var16; // L: 5734
						}
					}

					var1.serverPacket = null; // L: 5737
					return true; // L: 5738
				}

				if (ServerPacket.field2216 == var1.serverPacket) { // L: 5740
					DevicePcmPlayerProvider.method897(); // L: 5741
					weight = var3.readShort(); // L: 5742
					field775 = cycleCntr; // L: 5743
					var1.serverPacket = null; // L: 5744
					return true; // L: 5745
				}

				if (ServerPacket.field2240 == var1.serverPacket) { // L: 5747
					MouseHandler.method1134(class194.field2362); // L: 5748
					var1.serverPacket = null; // L: 5749
					return true; // L: 5750
				}

				if (ServerPacket.field2203 == var1.serverPacket) { // L: 5752
					var16 = var3.readUnsignedShort(); // L: 5753
					if (var16 == 65535) { // L: 5754
						var16 = -1;
					}

					WorldMapCacheName.playSong(var16); // L: 5755
					var1.serverPacket = null; // L: 5756
					return true; // L: 5757
				}

				if (ServerPacket.field2215 == var1.serverPacket) { // L: 5759
					var16 = var3.method5657(); // L: 5760
					if (var16 == 65535) { // L: 5761
						var16 = -1;
					}

					var5 = var3.method5740(); // L: 5762
					class298.playSoundJingle(var16, var5); // L: 5763
					var1.serverPacket = null; // L: 5764
					return true; // L: 5765
				}

				if (ServerPacket.field2241 == var1.serverPacket) { // L: 5767
					var16 = var3.readUnsignedShort(); // L: 5768
					var5 = var3.method5667(); // L: 5769
					var6 = TileItem.getWidget(var5); // L: 5770
					if (var6 != null && var6.type == 0) { // L: 5771
						if (var16 > var6.scrollHeight - var6.height) { // L: 5772
							var16 = var6.scrollHeight - var6.height;
						}

						if (var16 < 0) { // L: 5773
							var16 = 0;
						}

						if (var16 != var6.scrollY) { // L: 5774
							var6.scrollY = var16; // L: 5775
							class52.invalidateWidget(var6); // L: 5776
						}
					}

					var1.serverPacket = null; // L: 5779
					return true; // L: 5780
				}

				if (ServerPacket.field2197 == var1.serverPacket) { // L: 5782
					if (var1.serverPacketLength == 0) { // L: 5783
						Entity.clanChat = null; // L: 5784
					} else {
						if (Entity.clanChat == null) { // L: 5787
							Entity.clanChat = new ClanChat(WorldMapAreaData.loginType, class2.client); // L: 5788
						}

						Entity.clanChat.readUpdate(var3); // L: 5790
					}

					ReflectionCheck.method2380(); // L: 5792
					var1.serverPacket = null; // L: 5793
					return true; // L: 5794
				}

				if (ServerPacket.field2168 == var1.serverPacket) { // L: 5796
					FloorOverlayDefinition.updateNpcs(false, var3); // L: 5797
					var1.serverPacket = null; // L: 5798
					return true; // L: 5799
				}

				if (ServerPacket.field2162 == var1.serverPacket) { // L: 5801
					var16 = var3.readUnsignedByte(); // L: 5802
					class89.forceDisconnect(var16); // L: 5803
					var1.serverPacket = null; // L: 5804
					return false; // L: 5805
				}

				if (ServerPacket.field2226 == var1.serverPacket) { // L: 5807
					if (Entity.clanChat != null) { // L: 5808
						Entity.clanChat.method5350(var3); // L: 5809
					}

					ReflectionCheck.method2380(); // L: 5811
					var1.serverPacket = null; // L: 5812
					return true; // L: 5813
				}

				if (ServerPacket.field2228 == var1.serverPacket) { // L: 5815
					MouseHandler.method1134(class194.field2364); // L: 5816
					var1.serverPacket = null; // L: 5817
					return true; // L: 5818
				}

				if (ServerPacket.field2178 == var1.serverPacket) { // L: 5820
					var16 = var3.method5639(); // L: 5821
					var5 = var3.method5639(); // L: 5822
					var42 = var3.readStringCp1252NullTerminated(); // L: 5823
					if (var16 >= 1 && var16 <= 8) { // L: 5824
						if (var42.equalsIgnoreCase("null")) { // L: 5825
							var42 = null;
						}

						playerMenuActions[var16 - 1] = var42; // L: 5826
						playerOptionsPriorities[var16 - 1] = var5 == 0; // L: 5827
					}

					var1.serverPacket = null; // L: 5829
					return true; // L: 5830
				}

				boolean var58;
				if (ServerPacket.field2200 == var1.serverPacket) { // L: 5832
					var58 = var3.readUnsignedByte() == 1; // L: 5833
					if (var58) { // L: 5834
						ItemContainer.field553 = PacketWriter.currentTimeMillis() - var3.readLong(); // L: 5835
						WorldMapSection1.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 5836
					} else {
						WorldMapSection1.grandExchangeEvents = null; // L: 5838
					}

					field873 = cycleCntr; // L: 5839
					var1.serverPacket = null; // L: 5840
					return true; // L: 5841
				}

				if (ServerPacket.field2173 == var1.serverPacket) { // L: 5843
					var16 = var3.method5639(); // L: 5844
					var5 = var3.method5708(); // L: 5845
					var18 = var3.method5655(); // L: 5846
					var56 = (InterfaceParent)interfaceParents.get((long)var5); // L: 5847
					if (var56 != null) { // L: 5848
						class58.closeInterface(var56, var18 != var56.group);
					}

					WorldMapSprite.method494(var5, var18, var16); // L: 5849
					var1.serverPacket = null; // L: 5850
					return true; // L: 5851
				}

				if (ServerPacket.field2183 == var1.serverPacket) { // L: 5853
					tradeChatMode = var3.method5612(); // L: 5854
					publicChatMode = var3.method5612(); // L: 5855
					var1.serverPacket = null; // L: 5856
					return true; // L: 5857
				}

				if (ServerPacket.field2169 == var1.serverPacket) { // L: 5859
					WorldMapIcon_0.field154 = var3.method5646(); // L: 5860
					ScriptEvent.field597 = var3.method5612(); // L: 5861

					while (var3.offset < var1.serverPacketLength) { // L: 5862
						var16 = var3.readUnsignedByte(); // L: 5863
						class194 var52 = UserComparator5.method3518()[var16]; // L: 5864
						MouseHandler.method1134(var52); // L: 5865
					}

					var1.serverPacket = null; // L: 5867
					return true; // L: 5868
				}

				if (ServerPacket.field2188 == var1.serverPacket) { // L: 5870
					class2.updatePlayers(var3, var1.serverPacketLength); // L: 5871
					GameShell.method1109(); // L: 5872
					var1.serverPacket = null; // L: 5873
					return true; // L: 5874
				}

				if (ServerPacket.field2187 == var1.serverPacket) { // L: 5876
					var58 = var3.readBoolean(); // L: 5877
					if (var58) { // L: 5878
						if (ModelData0.field1901 == null) { // L: 5879
							ModelData0.field1901 = new class247();
						}
					} else {
						ModelData0.field1901 = null; // L: 5881
					}

					var1.serverPacket = null; // L: 5882
					return true; // L: 5883
				}

				if (ServerPacket.field2204 == var1.serverPacket) { // L: 5885
					MouseHandler.method1134(class194.field2368); // L: 5886
					var1.serverPacket = null; // L: 5887
					return true; // L: 5888
				}

				if (ServerPacket.field2231 == var1.serverPacket) { // L: 5890
					var16 = var3.readInt(); // L: 5891
					var5 = var3.method5657(); // L: 5892
					var6 = TileItem.getWidget(var16); // L: 5893
					if (var6.modelType != 2 || var5 != var6.modelId) { // L: 5894
						var6.modelType = 2; // L: 5895
						var6.modelId = var5; // L: 5896
						class52.invalidateWidget(var6); // L: 5897
					}

					var1.serverPacket = null; // L: 5899
					return true; // L: 5900
				}

				if (ServerPacket.field2225 == var1.serverPacket) { // L: 5902
					WorldMapIcon_0.field154 = var3.readUnsignedByte(); // L: 5903
					ScriptEvent.field597 = var3.method5646(); // L: 5904
					var1.serverPacket = null; // L: 5905
					return true; // L: 5906
				}

				if (ServerPacket.field2159 == var1.serverPacket) { // L: 5908
					MouseHandler.method1134(class194.field2366); // L: 5909
					var1.serverPacket = null; // L: 5910
					return true; // L: 5911
				}

				if (ServerPacket.field2217 == var1.serverPacket) { // L: 5913
					var16 = var3.readUnsignedByte(); // L: 5914
					if (var3.readUnsignedByte() == 0) { // L: 5915
						grandExchangeOffers[var16] = new GrandExchangeOffer(); // L: 5916
						var3.offset += 18; // L: 5917
					} else {
						--var3.offset; // L: 5920
						grandExchangeOffers[var16] = new GrandExchangeOffer(var3, false); // L: 5921
					}

					field872 = cycleCntr; // L: 5923
					var1.serverPacket = null; // L: 5924
					return true; // L: 5925
				}

				Widget var21;
				if (ServerPacket.field2207 == var1.serverPacket) { // L: 5927
					var16 = var3.method5656(); // L: 5928
					var5 = var3.method5667(); // L: 5929
					var18 = var3.method5657(); // L: 5930
					var21 = TileItem.getWidget(var5); // L: 5931
					var21.field2633 = var16 + (var18 << 16); // L: 5932
					var1.serverPacket = null; // L: 5933
					return true; // L: 5934
				}

				if (ServerPacket.field2158 == var1.serverPacket) { // L: 5936
					var16 = var3.method5708(); // L: 5937
					var5 = var3.method5656(); // L: 5938
					var18 = var5 >> 10 & 31; // L: 5939
					var7 = var5 >> 5 & 31; // L: 5940
					var19 = var5 & 31; // L: 5941
					var20 = (var7 << 11) + (var18 << 19) + (var19 << 3); // L: 5942
					Widget var10 = TileItem.getWidget(var16); // L: 5943
					if (var20 != var10.color) { // L: 5944
						var10.color = var20; // L: 5945
						class52.invalidateWidget(var10); // L: 5946
					}

					var1.serverPacket = null; // L: 5948
					return true; // L: 5949
				}

				if (ServerPacket.field2167 == var1.serverPacket) { // L: 5951
					for (var16 = 0; var16 < players.length; ++var16) { // L: 5952
						if (players[var16] != null) { // L: 5953
							players[var16].sequence = -1;
						}
					}

					for (var16 = 0; var16 < npcs.length; ++var16) { // L: 5955
						if (npcs[var16] != null) { // L: 5956
							npcs[var16].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 5958
					return true; // L: 5959
				}

				if (ServerPacket.field2194 == var1.serverPacket) { // L: 5961
					var16 = var3.readUnsignedShort(); // L: 5962
					if (var16 == 65535) { // L: 5963
						var16 = -1;
					}

					var5 = var3.method5678(); // L: 5964
					var18 = var3.method5678(); // L: 5965
					var21 = TileItem.getWidget(var18); // L: 5966
					ItemDefinition var43;
					if (!var21.isIf3) { // L: 5967
						if (var16 == -1) { // L: 5968
							var21.modelType = 0; // L: 5969
							var1.serverPacket = null; // L: 5970
							return true; // L: 5971
						}

						var43 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var16); // L: 5973
						var21.modelType = 4; // L: 5974
						var21.modelId = var16; // L: 5975
						var21.modelAngleX = var43.xan2d; // L: 5976
						var21.modelAngleY = var43.yan2d; // L: 5977
						var21.modelZoom = var43.zoom2d * 100 / var5; // L: 5978
						class52.invalidateWidget(var21); // L: 5979
					} else {
						var21.itemId = var16; // L: 5982
						var21.itemQuantity = var5; // L: 5983
						var43 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var16); // L: 5984
						var21.modelAngleX = var43.xan2d; // L: 5985
						var21.modelAngleY = var43.yan2d; // L: 5986
						var21.modelAngleZ = var43.zan2d; // L: 5987
						var21.modelOffsetX = var43.offsetX2d; // L: 5988
						var21.modelOffsetY = var43.offsetY2d; // L: 5989
						var21.modelZoom = var43.zoom2d; // L: 5990
						if (var43.isStackable == 1) { // L: 5991
							var21.itemQuantityMode = 1;
						} else {
							var21.itemQuantityMode = 2; // L: 5992
						}

						if (var21.field2728 > 0) { // L: 5993
							var21.modelZoom = var21.modelZoom * 32 / var21.field2728;
						} else if (var21.rawWidth > 0) { // L: 5994
							var21.modelZoom = var21.modelZoom * 32 / var21.rawWidth;
						}

						class52.invalidateWidget(var21); // L: 5995
					}

					var1.serverPacket = null; // L: 5997
					return true; // L: 5998
				}

				Widget var8;
				if (ServerPacket.field2212 == var1.serverPacket) { // L: 6000
					var16 = var3.readInt(); // L: 6001
					var5 = var3.readUnsignedShort(); // L: 6002
					var18 = var3.method5655(); // L: 6003
					var7 = var3.method5656(); // L: 6004
					var8 = TileItem.getWidget(var16); // L: 6005
					if (var18 != var8.modelAngleX || var5 != var8.modelAngleY || var7 != var8.modelZoom) { // L: 6006
						var8.modelAngleX = var18; // L: 6007
						var8.modelAngleY = var5; // L: 6008
						var8.modelZoom = var7; // L: 6009
						class52.invalidateWidget(var8); // L: 6010
					}

					var1.serverPacket = null; // L: 6012
					return true; // L: 6013
				}

				if (ServerPacket.field2181 == var1.serverPacket) { // L: 6015
					WorldMapIcon_0.field154 = var3.method5612(); // L: 6016
					ScriptEvent.field597 = var3.method5639(); // L: 6017

					for (var16 = WorldMapIcon_0.field154; var16 < WorldMapIcon_0.field154 + 8; ++var16) { // L: 6018
						for (var5 = ScriptEvent.field597; var5 < ScriptEvent.field597 + 8; ++var5) { // L: 6019
							if (groundItems[Huffman.Client_plane][var16][var5] != null) { // L: 6020
								groundItems[Huffman.Client_plane][var16][var5] = null; // L: 6021
								class13.updateItemPile(var16, var5); // L: 6022
							}
						}
					}

					for (PendingSpawn var37 = (PendingSpawn)pendingSpawns.last(); var37 != null; var37 = (PendingSpawn)pendingSpawns.previous()) { // L: 6026 6027 6029
						if (var37.x >= WorldMapIcon_0.field154 && var37.x < WorldMapIcon_0.field154 + 8 && var37.y >= ScriptEvent.field597 && var37.y < ScriptEvent.field597 + 8 && var37.plane == Huffman.Client_plane) { // L: 6028
							var37.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 6031
					return true; // L: 6032
				}

				if (ServerPacket.field2170 == var1.serverPacket) { // L: 6034
					DevicePcmPlayerProvider.method897(); // L: 6035
					runEnergy = var3.readUnsignedByte(); // L: 6036
					field775 = cycleCntr; // L: 6037
					var1.serverPacket = null; // L: 6038
					return true; // L: 6039
				}

				long var24;
				long var26;
				String var36;
				if (ServerPacket.field2218 == var1.serverPacket) { // L: 6041
					var36 = var3.readStringCp1252NullTerminated(); // L: 6042
					var24 = (long)var3.readUnsignedShort(); // L: 6043
					var26 = (long)var3.readMedium(); // L: 6044
					PlayerType var28 = (PlayerType)TextureProvider.findEnumerated(ApproximateRouteStrategy.PlayerType_values(), var3.readUnsignedByte()); // L: 6045
					long var29 = var26 + (var24 << 32); // L: 6046
					boolean var31 = false; // L: 6047

					for (int var13 = 0; var13 < 100; ++var13) { // L: 6048
						if (var29 == field896[var13]) { // L: 6049
							var31 = true; // L: 6050
							break; // L: 6051
						}
					}

					if (class60.friendSystem.isIgnored(new Username(var36, WorldMapAreaData.loginType))) { // L: 6054
						var31 = true;
					}

					if (!var31 && field790 == 0) { // L: 6055
						field896[field794] = var29; // L: 6056
						field794 = (field794 + 1) % 100; // L: 6057
						String var32 = AbstractFont.escapeBrackets(Huffman.method4049(ScriptEvent.method1235(var3))); // L: 6058
						byte var49;
						if (var28.isPrivileged) { // L: 6060
							var49 = 7;
						} else {
							var49 = 3; // L: 6061
						}

						if (var28.modIcon != -1) { // L: 6062
							WorldMapRectangle.addGameMessage(var49, WorldMapScaleHandler.method824(var28.modIcon) + var36, var32);
						} else {
							WorldMapRectangle.addGameMessage(var49, var36, var32); // L: 6063
						}
					}

					var1.serverPacket = null; // L: 6065
					return true; // L: 6066
				}

				if (ServerPacket.field2229 == var1.serverPacket) { // L: 6068
					class60.friendSystem.method1919(); // L: 6069
					field870 = cycleCntr; // L: 6070
					var1.serverPacket = null; // L: 6071
					return true; // L: 6072
				}

				if (ServerPacket.field2213 == var1.serverPacket) { // L: 6074
					var16 = var3.method5659(); // L: 6075
					var5 = var3.readInt(); // L: 6076
					var6 = TileItem.getWidget(var5); // L: 6077
					if (var16 != var6.sequenceId || var16 == -1) { // L: 6078
						var6.sequenceId = var16; // L: 6079
						var6.modelFrame = 0; // L: 6080
						var6.modelFrameCycle = 0; // L: 6081
						class52.invalidateWidget(var6); // L: 6082
					}

					var1.serverPacket = null; // L: 6084
					return true; // L: 6085
				}

				if (ServerPacket.field2199 == var1.serverPacket) { // L: 6087
					var3.offset += 28; // L: 6088
					if (var3.checkCrc()) { // L: 6089
						class60.method937(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 6090
					return true; // L: 6091
				}

				if (ServerPacket.field2175 == var1.serverPacket) { // L: 6093
					var16 = var3.method5667(); // L: 6094
					var51 = TileItem.getWidget(var16); // L: 6095
					var51.modelType = 3; // L: 6096
					var51.modelId = WorldMapLabelSize.localPlayer.appearance.getChatHeadId(); // L: 6097
					class52.invalidateWidget(var51); // L: 6098
					var1.serverPacket = null; // L: 6099
					return true; // L: 6100
				}

				if (ServerPacket.field2192 == var1.serverPacket) { // L: 6102
					DevicePcmPlayerProvider.method897(); // L: 6103
					var16 = var3.readInt(); // L: 6104
					var5 = var3.method5612(); // L: 6105
					var18 = var3.readUnsignedByte(); // L: 6106
					experience[var5] = var16; // L: 6107
					currentLevels[var5] = var18; // L: 6108
					levels[var5] = 1; // L: 6109

					for (var7 = 0; var7 < 98; ++var7) { // L: 6110
						if (var16 >= Skills.Skills_experienceTable[var7]) {
							levels[var5] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var5; // L: 6111
					var1.serverPacket = null; // L: 6112
					return true; // L: 6113
				}

				if (ServerPacket.field2235 == var1.serverPacket) { // L: 6115
					hintArrowType = var3.readUnsignedByte(); // L: 6116
					if (hintArrowType == 1) { // L: 6117
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 6118
						if (hintArrowType == 2) { // L: 6119
							hintArrowSubX = 64; // L: 6120
							hintArrowSubY = 64; // L: 6121
						}

						if (hintArrowType == 3) { // L: 6123
							hintArrowSubX = 0; // L: 6124
							hintArrowSubY = 64; // L: 6125
						}

						if (hintArrowType == 4) { // L: 6127
							hintArrowSubX = 128; // L: 6128
							hintArrowSubY = 64; // L: 6129
						}

						if (hintArrowType == 5) { // L: 6131
							hintArrowSubX = 64; // L: 6132
							hintArrowSubY = 0; // L: 6133
						}

						if (hintArrowType == 6) { // L: 6135
							hintArrowSubX = 64; // L: 6136
							hintArrowSubY = 128; // L: 6137
						}

						hintArrowType = 2; // L: 6139
						hintArrowX = var3.readUnsignedShort(); // L: 6140
						hintArrowY = var3.readUnsignedShort(); // L: 6141
						hintArrowHeight = var3.readUnsignedByte(); // L: 6142
					}

					if (hintArrowType == 10) { // L: 6144
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 6145
					return true; // L: 6146
				}

				if (ServerPacket.field2176 == var1.serverPacket) { // L: 6148
					var16 = var3.method5667(); // L: 6149
					var17 = var3.readStringCp1252NullTerminated(); // L: 6150
					var6 = TileItem.getWidget(var16); // L: 6151
					if (!var17.equals(var6.text)) { // L: 6152
						var6.text = var17; // L: 6153
						class52.invalidateWidget(var6); // L: 6154
					}

					var1.serverPacket = null; // L: 6156
					return true; // L: 6157
				}

				if (ServerPacket.field2185 == var1.serverPacket) { // L: 6159
					var16 = var3.readUnsignedByte(); // L: 6160
					var5 = var3.readUnsignedByte(); // L: 6161
					var18 = var3.readUnsignedByte(); // L: 6162
					var7 = var3.readUnsignedByte(); // L: 6163
					field922[var16] = true; // L: 6164
					field678[var16] = var5; // L: 6165
					field740[var16] = var18; // L: 6166
					field925[var16] = var7; // L: 6167
					field926[var16] = 0; // L: 6168
					var1.serverPacket = null; // L: 6169
					return true; // L: 6170
				}

				if (ServerPacket.field2237 == var1.serverPacket) { // L: 6172
					MouseHandler.method1134(class194.field2370); // L: 6173
					var1.serverPacket = null; // L: 6174
					return true; // L: 6175
				}

				if (ServerPacket.field2224 == var1.serverPacket) { // L: 6177
					var36 = var3.readStringCp1252NullTerminated(); // L: 6178
					Object[] var50 = new Object[var36.length() + 1]; // L: 6179

					for (var18 = var36.length() - 1; var18 >= 0; --var18) { // L: 6180
						if (var36.charAt(var18) == 's') { // L: 6181
							var50[var18 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var50[var18 + 1] = new Integer(var3.readInt()); // L: 6182
						}
					}

					var50[0] = new Integer(var3.readInt()); // L: 6184
					ScriptEvent var41 = new ScriptEvent(); // L: 6185
					var41.args = var50; // L: 6186
					Script.runScriptEvent(var41); // L: 6187
					var1.serverPacket = null; // L: 6188
					return true; // L: 6189
				}

				if (ServerPacket.field2177 == var1.serverPacket) { // L: 6191
					WorldMapID.loadRegions(false, var1.packetBuffer); // L: 6192
					var1.serverPacket = null; // L: 6193
					return true; // L: 6194
				}

				if (ServerPacket.field2201 == var1.serverPacket) { // L: 6196
					var16 = var3.method5708(); // L: 6197
					var5 = var3.readInt(); // L: 6198
					InterfaceParent var40 = (InterfaceParent)interfaceParents.get((long)var16); // L: 6199
					var56 = (InterfaceParent)interfaceParents.get((long)var5); // L: 6200
					if (var56 != null) { // L: 6201
						class58.closeInterface(var56, var40 == null || var56.group != var40.group);
					}

					if (var40 != null) { // L: 6202
						var40.remove(); // L: 6203
						interfaceParents.put(var40, (long)var5); // L: 6204
					}

					var8 = TileItem.getWidget(var16); // L: 6206
					if (var8 != null) { // L: 6207
						class52.invalidateWidget(var8);
					}

					var8 = TileItem.getWidget(var5); // L: 6208
					if (var8 != null) { // L: 6209
						class52.invalidateWidget(var8); // L: 6210
						class4.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var8.id >>> 16], var8, true); // L: 6211
					}

					if (rootInterface != -1) { // L: 6213
						ClientPacket.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 6214
					return true; // L: 6215
				}

				if (ServerPacket.field2166 == var1.serverPacket) { // L: 6217
					MouseHandler.method1134(class194.field2361); // L: 6218
					var1.serverPacket = null; // L: 6219
					return true; // L: 6220
				}

				if (ServerPacket.field2193 == var1.serverPacket) { // L: 6222
					var16 = var3.method5657(); // L: 6223
					WorldMapData_0.method263(var16); // L: 6224
					changedItemContainers[++field903 - 1 & 31] = var16 & 32767; // L: 6225
					var1.serverPacket = null; // L: 6226
					return true; // L: 6227
				}

				if (ServerPacket.field2230 == var1.serverPacket) { // L: 6229
					ViewportMouse.logOut(); // L: 6230
					var1.serverPacket = null; // L: 6231
					return false; // L: 6232
				}

				if (ServerPacket.field2232 == var1.serverPacket) { // L: 6234
					minimapState = var3.readUnsignedByte(); // L: 6235
					var1.serverPacket = null; // L: 6236
					return true; // L: 6237
				}

				if (ServerPacket.field2190 == var1.serverPacket) { // L: 6239
					var36 = var3.readStringCp1252NullTerminated(); // L: 6240
					var17 = AbstractFont.escapeBrackets(Huffman.method4049(ScriptEvent.method1235(var3))); // L: 6241
					WorldMapRectangle.addGameMessage(6, var36, var17); // L: 6242
					var1.serverPacket = null; // L: 6243
					return true; // L: 6244
				}

				if (ServerPacket.field2243 == var1.serverPacket) { // L: 6246
					var16 = var3.readInt(); // L: 6247
					var5 = var3.readUnsignedShort(); // L: 6248
					if (var16 < -70000) { // L: 6249
						var5 += 32768;
					}

					if (var16 >= 0) { // L: 6251
						var6 = TileItem.getWidget(var16);
					} else {
						var6 = null; // L: 6252
					}

					for (; var3.offset < var1.serverPacketLength; MidiPcmStream.itemContainerSetItem(var5, var7, var19 - 1, var20)) { // L: 6253 6267
						var7 = var3.readUShortSmart(); // L: 6254
						var19 = var3.readUnsignedShort(); // L: 6255
						var20 = 0; // L: 6256
						if (var19 != 0) { // L: 6257
							var20 = var3.readUnsignedByte(); // L: 6258
							if (var20 == 255) { // L: 6259
								var20 = var3.readInt();
							}
						}

						if (var6 != null && var7 >= 0 && var7 < var6.itemIds.length) { // L: 6261 6262
							var6.itemIds[var7] = var19; // L: 6263
							var6.itemQuantities[var7] = var20; // L: 6264
						}
					}

					if (var6 != null) { // L: 6269
						class52.invalidateWidget(var6);
					}

					DevicePcmPlayerProvider.method897(); // L: 6270
					changedItemContainers[++field903 - 1 & 31] = var5 & 32767; // L: 6271
					var1.serverPacket = null; // L: 6272
					return true; // L: 6273
				}

				if (ServerPacket.field2236 == var1.serverPacket) { // L: 6275
					var36 = var3.readStringCp1252NullTerminated(); // L: 6276
					var24 = var3.readLong(); // L: 6277
					var26 = (long)var3.readUnsignedShort(); // L: 6278
					var9 = (long)var3.readMedium(); // L: 6279
					PlayerType var11 = (PlayerType)TextureProvider.findEnumerated(ApproximateRouteStrategy.PlayerType_values(), var3.readUnsignedByte()); // L: 6280
					var12 = (var26 << 32) + var9; // L: 6281
					boolean var14 = false; // L: 6282

					for (int var15 = 0; var15 < 100; ++var15) { // L: 6283
						if (field896[var15] == var12) { // L: 6284
							var14 = true; // L: 6285
							break; // L: 6286
						}
					}

					if (var11.isUser && class60.friendSystem.isIgnored(new Username(var36, WorldMapAreaData.loginType))) { // L: 6289 6290
						var14 = true;
					}

					if (!var14 && field790 == 0) { // L: 6292
						field896[field794] = var12; // L: 6293
						field794 = (field794 + 1) % 100; // L: 6294
						String var33 = AbstractFont.escapeBrackets(Huffman.method4049(ScriptEvent.method1235(var3))); // L: 6295
						if (var11.modIcon != -1) { // L: 6296
							WorldMapData_0.addChatMessage(9, WorldMapScaleHandler.method824(var11.modIcon) + var36, var33, GrandExchangeOfferTotalQuantityComparator.base37DecodeLong(var24));
						} else {
							WorldMapData_0.addChatMessage(9, var36, var33, GrandExchangeOfferTotalQuantityComparator.base37DecodeLong(var24)); // L: 6297
						}
					}

					var1.serverPacket = null; // L: 6299
					return true; // L: 6300
				}

				if (ServerPacket.field2233 == var1.serverPacket) { // L: 6302
					MouseHandler.method1134(class194.field2365); // L: 6303
					var1.serverPacket = null; // L: 6304
					return true; // L: 6305
				}

				if (ServerPacket.field2210 == var1.serverPacket) { // L: 6307
					var16 = var3.method5678(); // L: 6308
					var5 = var3.readShort(); // L: 6309
					var18 = var3.method5658(); // L: 6310
					var21 = TileItem.getWidget(var16); // L: 6311
					if (var18 != var21.rawX || var5 != var21.rawY || var21.xAlignment != 0 || var21.yAlignment != 0) { // L: 6312
						var21.rawX = var18; // L: 6313
						var21.rawY = var5; // L: 6314
						var21.xAlignment = 0; // L: 6315
						var21.yAlignment = 0; // L: 6316
						class52.invalidateWidget(var21); // L: 6317
						this.alignWidget(var21); // L: 6318
						if (var21.type == 0) { // L: 6319
							class4.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var16 >> 16], var21, false);
						}
					}

					var1.serverPacket = null; // L: 6321
					return true; // L: 6322
				}

				Decimator.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id * -317415457 * 2122570783 : -1) + "," + (var1.field1348 != null ? var1.field1348.id * -317415457 * 2122570783 : -1) + "," + (var1.field1346 != null ? var1.field1346.id * -317415457 * 2122570783 : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 6324
				ViewportMouse.logOut(); // L: 6325
			} catch (IOException var34) { // L: 6327
				ArchiveLoader.method1208(); // L: 6328
			} catch (Exception var35) {
				var17 = "" + (var1.serverPacket != null ? var1.serverPacket.id * -317415457 * 2122570783 : -1) + "," + (var1.field1348 != null ? var1.field1348.id * -317415457 * 2122570783 : -1) + "," + (var1.field1346 != null ? var1.field1346.id * -317415457 * 2122570783 : -1) + "," + var1.serverPacketLength + "," + (WorldMapLabelSize.localPlayer.pathX[0] + WorldMapManager.baseX) + "," + (WorldMapLabelSize.localPlayer.pathY[0] + WorldMapLabel.baseY) + ","; // L: 6331

				for (var18 = 0; var18 < var1.serverPacketLength && var18 < 50; ++var18) { // L: 6332
					var17 = var17 + var3.array[var18] + ",";
				}

				Decimator.RunException_sendStackTrace(var17, var35); // L: 6333
				ViewportMouse.logOut(); // L: 6334
			}

			return true; // L: 6336
		}
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "736639709"
	)
	@Export("menu")
	final void menu() {
		boolean var1 = false; // L: 7056

		int var2;
		int var5;
		while (!var1) { // L: 7057
			var1 = true; // L: 7058

			for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) { // L: 7059
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) { // L: 7060
					String var14 = menuTargets[var2]; // L: 7061
					menuTargets[var2] = menuTargets[var2 + 1]; // L: 7062
					menuTargets[var2 + 1] = var14; // L: 7063
					String var15 = menuActions[var2]; // L: 7064
					menuActions[var2] = menuActions[var2 + 1]; // L: 7065
					menuActions[var2 + 1] = var15; // L: 7066
					var5 = menuOpcodes[var2]; // L: 7067
					menuOpcodes[var2] = menuOpcodes[var2 + 1]; // L: 7068
					menuOpcodes[var2 + 1] = var5; // L: 7069
					var5 = menuArguments1[var2]; // L: 7070
					menuArguments1[var2] = menuArguments1[var2 + 1]; // L: 7071
					menuArguments1[var2 + 1] = var5; // L: 7072
					var5 = menuArguments2[var2]; // L: 7073
					menuArguments2[var2] = menuArguments2[var2 + 1]; // L: 7074
					menuArguments2[var2 + 1] = var5; // L: 7075
					var5 = menuIdentifiers[var2]; // L: 7076
					menuIdentifiers[var2] = menuIdentifiers[var2 + 1]; // L: 7077
					menuIdentifiers[var2 + 1] = var5; // L: 7078
					boolean var13 = menuShiftClick[var2]; // L: 7079
					menuShiftClick[var2] = menuShiftClick[var2 + 1]; // L: 7080
					menuShiftClick[var2 + 1] = var13; // L: 7081
					var1 = false; // L: 7082
				}
			}
		}

		if (BuddyRankComparator.dragInventoryWidget == null) { // L: 7087
			if (clickedWidget == null) { // L: 7088
				int var4;
				label300: {
					int var16 = MouseHandler.MouseHandler_lastButton; // L: 7089
					int var3;
					int var8;
					if (isMenuOpen) { // L: 7090
						int var17;
						int var18;
						if (var16 != 1 && (ScriptEvent.mouseCam || var16 != 4)) { // L: 7091
							var2 = MouseHandler.MouseHandler_x; // L: 7092
							var3 = MouseHandler.MouseHandler_y; // L: 7093
							if (var2 < ChatChannel.menuX - 10 || var2 > DevicePcmPlayerProvider.menuWidth + ChatChannel.menuX + 10 || var3 < menuY - 10 || var3 > WorldMapManager.menuHeight + menuY + 10) { // L: 7094
								isMenuOpen = false; // L: 7095
								var4 = ChatChannel.menuX; // L: 7096
								var5 = menuY; // L: 7097
								var18 = DevicePcmPlayerProvider.menuWidth; // L: 7098
								var17 = WorldMapManager.menuHeight; // L: 7099

								for (var8 = 0; var8 < rootWidgetCount; ++var8) { // L: 7101
									if (rootWidgetWidths[var8] + rootWidgetXs[var8] > var4 && rootWidgetXs[var8] < var4 + var18 && rootWidgetHeights[var8] + rootWidgetYs[var8] > var5 && rootWidgetYs[var8] < var5 + var17) { // L: 7102
										field882[var8] = true;
									}
								}
							}
						}

						if (var16 == 1 || !ScriptEvent.mouseCam && var16 == 4) { // L: 7107
							var2 = ChatChannel.menuX; // L: 7108
							var3 = menuY; // L: 7109
							var4 = DevicePcmPlayerProvider.menuWidth; // L: 7110
							var5 = MouseHandler.MouseHandler_lastPressedX; // L: 7111
							var18 = MouseHandler.MouseHandler_lastPressedY; // L: 7112
							var17 = -1; // L: 7113

							int var9;
							for (var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 7114
								var9 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31; // L: 7115
								if (var5 > var2 && var5 < var4 + var2 && var18 > var9 - 13 && var18 < var9 + 3) { // L: 7116
									var17 = var8;
								}
							}

							if (var17 != -1) { // L: 7118
								Widget.method4175(var17);
							}

							isMenuOpen = false; // L: 7119
							var8 = ChatChannel.menuX; // L: 7120
							var9 = menuY; // L: 7121
							int var10 = DevicePcmPlayerProvider.menuWidth; // L: 7122
							int var11 = WorldMapManager.menuHeight; // L: 7123

							for (int var12 = 0; var12 < rootWidgetCount; ++var12) { // L: 7125
								if (rootWidgetXs[var12] + rootWidgetWidths[var12] > var8 && rootWidgetXs[var12] < var8 + var10 && rootWidgetYs[var12] + rootWidgetHeights[var12] > var9 && rootWidgetYs[var12] < var9 + var11) { // L: 7126
									field882[var12] = true;
								}
							}
						}
					} else {
						var2 = GrandExchangeOffer.method209(); // L: 7132
						if ((var16 == 1 || !ScriptEvent.mouseCam && var16 == 4) && var2 >= 0) { // L: 7133
							var3 = menuOpcodes[var2]; // L: 7134
							if (var3 == 39 || var3 == 40 || var3 == 41 || var3 == 42 || var3 == 43 || var3 == 33 || var3 == 34 || var3 == 35 || var3 == 36 || var3 == 37 || var3 == 38 || var3 == 1005) { // L: 7135
								var4 = menuArguments1[var2]; // L: 7136
								var5 = menuArguments2[var2]; // L: 7137
								Widget var6 = TileItem.getWidget(var5); // L: 7138
								var8 = WorldMapIcon_0.getWidgetFlags(var6); // L: 7140
								boolean var7 = (var8 >> 28 & 1) != 0; // L: 7142
								if (var7) { // L: 7144
									break label300;
								}

								Object var10000 = null;
								if (Widget.method4172(WorldMapIcon_0.getWidgetFlags(var6))) {
									break label300;
								}
							}
						}

						if ((var16 == 1 || !ScriptEvent.mouseCam && var16 == 4) && this.shouldLeftClickOpenMenu()) { // L: 7163 7164
							var16 = 2; // L: 7165
						}

						if ((var16 == 1 || !ScriptEvent.mouseCam && var16 == 4) && menuOptionsCount > 0) { // L: 7168
							Widget.method4175(var2); // L: 7169
						}

						if (var16 == 2 && menuOptionsCount > 0) { // L: 7171
							this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}
					}

					return; // L: 7173
				}

				if (BuddyRankComparator.dragInventoryWidget != null && !field788 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) { // L: 7145 7146
					SecureRandomFuture.method2211(draggedWidgetX, draggedWidgetY); // L: 7147
				}

				field788 = false; // L: 7150
				itemDragDuration = 0; // L: 7151
				if (BuddyRankComparator.dragInventoryWidget != null) { // L: 7152
					class52.invalidateWidget(BuddyRankComparator.dragInventoryWidget);
				}

				BuddyRankComparator.dragInventoryWidget = TileItem.getWidget(var5); // L: 7153
				dragItemSlotSource = var4; // L: 7154
				draggedWidgetX = MouseHandler.MouseHandler_lastPressedX; // L: 7155
				draggedWidgetY = MouseHandler.MouseHandler_lastPressedY; // L: 7156
				if (var2 >= 0) { // L: 7157
					ObjectSound.method1983(var2);
				}

				class52.invalidateWidget(BuddyRankComparator.dragInventoryWidget); // L: 7158
			}
		}
	} // L: 7159

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-40940345"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = GrandExchangeOffer.method209(); // L: 7176
		boolean var2 = leftClickOpensMenu == 1 && menuOptionsCount > 2; // L: 7177
		if (!var2) { // L: 7178
			boolean var3;
			if (var1 < 0) { // L: 7181
				var3 = false; // L: 7182
			} else {
				int var4 = menuOpcodes[var1]; // L: 7185
				if (var4 >= 2000) { // L: 7186
					var4 -= 2000;
				}

				if (var4 == 1007) { // L: 7187
					var3 = true; // L: 7188
				} else {
					var3 = false; // L: 7191
				}
			}

			var2 = var3; // L: 7193
		}

		return var2 && !menuShiftClick[var1]; // L: 7195
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-756667188"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		WorldMapSprite.method493(var1, var2); // L: 7199
		ScriptEvent.scene.menuOpen(Huffman.Client_plane, var1, var2, false); // L: 7200
		isMenuOpen = true; // L: 7201
	} // L: 7202

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "56"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		int var2 = rootInterface; // L: 9185
		int var3 = FloorDecoration.canvasWidth; // L: 9186
		int var4 = GameShell.canvasHeight; // L: 9187
		if (WorldMapSprite.loadInterface(var2)) { // L: 9189
			KeyHandler.resizeInterface(Widget.Widget_interfaceComponents[var2], -1, var3, var4, var1); // L: 9190
		}

	} // L: 9192

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(Lhq;I)V",
		garbageValue = "1722928474"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : TileItem.getWidget(var1.parentId); // L: 9195
		int var3;
		int var4;
		if (var2 == null) { // L: 9198
			var3 = FloorDecoration.canvasWidth; // L: 9199
			var4 = GameShell.canvasHeight; // L: 9200
		} else {
			var3 = var2.width; // L: 9203
			var4 = var2.height; // L: 9204
		}

		MouseRecorder.alignWidgetSize(var1, var3, var4, false); // L: 9206
		DirectByteArrayCopier.alignWidgetPosition(var1, var3, var4); // L: 9207
	} // L: 9208

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "10"
	)
	final void method1458() {
		class52.invalidateWidget(clickedWidget); // L: 10175
		++BoundaryObject.widgetDragDuration; // L: 10176
		if (field880 && field799) { // L: 10177
			int var1 = MouseHandler.MouseHandler_x; // L: 10183
			int var2 = MouseHandler.MouseHandler_y; // L: 10184
			var1 -= widgetClickX; // L: 10185
			var2 -= widgetClickY; // L: 10186
			if (var1 < field856) { // L: 10187
				var1 = field856;
			}

			if (var1 + clickedWidget.width > field856 + clickedWidgetParent.width) { // L: 10188
				var1 = field856 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field785) { // L: 10189
				var2 = field785;
			}

			if (var2 + clickedWidget.height > field785 + clickedWidgetParent.height) { // L: 10190
				var2 = field785 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field859; // L: 10191
			int var4 = var2 - field795; // L: 10192
			int var5 = clickedWidget.dragZoneSize; // L: 10193
			if (BoundaryObject.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 10194 10195
				isDraggingWidget = true; // L: 10196
			}

			int var6 = var1 - field856 + clickedWidgetParent.scrollX; // L: 10199
			int var7 = var2 - field785 + clickedWidgetParent.scrollY; // L: 10200
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 10201
				var8 = new ScriptEvent(); // L: 10202
				var8.widget = clickedWidget; // L: 10203
				var8.mouseX = var6; // L: 10204
				var8.mouseY = var7; // L: 10205
				var8.args = clickedWidget.onDrag; // L: 10206
				Script.runScriptEvent(var8); // L: 10207
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 10209
				if (isDraggingWidget) { // L: 10210
					if (clickedWidget.onDragComplete != null) { // L: 10211
						var8 = new ScriptEvent(); // L: 10212
						var8.widget = clickedWidget; // L: 10213
						var8.mouseX = var6; // L: 10214
						var8.mouseY = var7; // L: 10215
						var8.dragTarget = draggedOnWidget; // L: 10216
						var8.args = clickedWidget.onDragComplete; // L: 10217
						Script.runScriptEvent(var8); // L: 10218
					}

					if (draggedOnWidget != null && ReflectionCheck.method2381(clickedWidget) != null) { // L: 10220
						PacketBufferNode var9 = getPacketBufferNode(ClientPacket.field2266, packetWriter.isaacCipher); // L: 10222
						var9.packetBuffer.writeInt(draggedOnWidget.id); // L: 10223
						var9.packetBuffer.method5663(clickedWidget.id); // L: 10224
						var9.packetBuffer.method5665(clickedWidget.childIndex); // L: 10225
						var9.packetBuffer.method5653(draggedOnWidget.itemId); // L: 10226
						var9.packetBuffer.method5653(draggedOnWidget.childIndex); // L: 10227
						var9.packetBuffer.method5653(clickedWidget.itemId); // L: 10228
						packetWriter.addNode(var9); // L: 10229
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 10233
					this.openMenu(widgetClickX + field859, field795 + widgetClickY); // L: 10234
				} else if (menuOptionsCount > 0) { // L: 10236
					SecureRandomFuture.method2211(widgetClickX + field859, widgetClickY + field795); // L: 10237
				}

				clickedWidget = null; // L: 10240
			}

		} else {
			if (BoundaryObject.widgetDragDuration > 1) { // L: 10178
				clickedWidget = null; // L: 10179
			}

		}
	} // L: 10181 10242

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(I)Lku;",
		garbageValue = "1348007061"
	)
	@Export("username")
	public Username username() {
		return WorldMapLabelSize.localPlayer != null ? WorldMapLabelSize.localPlayer.username : null; // L: 10858
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2048198145"
	)
	public static int method1789(int var0, int var1) {
		int var2;
		for (var2 = 1; var1 > 1; var1 >>= 1) { // L: 24 25
			if ((var1 & 1) != 0) {
				var2 = var0 * var2; // L: 26
			}

			var0 *= var0;
		}

		if (var1 == 1) {
			return var0 * var2;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(DDII)[D",
		garbageValue = "1556840096"
	)
	public static double[] method1378(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1; // L: 18
		double[] var6 = new double[var5]; // L: 19
		int var7 = -var4;

		for (int var8 = 0; var7 <= var4; ++var8) {
			var6[var8] = class278.method5090((double)var7, var0, var2); // L: 21
			++var7; // L: 20
		}

		return var6; // L: 23
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lgf;Llh;I)Lgb;",
		garbageValue = "-1510216701"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2 = ItemContainer.method1226(); // L: 27
		var2.clientPacket = var0; // L: 28
		var2.clientPacketLength = var0.length; // L: 29
		if (var2.clientPacketLength == -1) { // L: 30
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000); // L: 31
		} else if (var2.clientPacketLength <= 18) { // L: 32
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) { // L: 33
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260); // L: 34
		}

		var2.packetBuffer.setIsaacCipher(var1); // L: 35
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id); // L: 36
		var2.index = 0; // L: 37
		return var2; // L: 38
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "887338283"
	)
	static boolean method1792() {
		return (drawPlayerNames & 1) != 0; // L: 4405
	}
}
