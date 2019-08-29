package net.runelite.client.util.bootstrap;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;
import org.codehaus.plexus.util.FileUtils;

public class Bootstrap
{
	private String projectVersion = "1.5.32-SNAPSHOT";
	String buildCommit = "6fe334c02648d3f8b38625e3175e3f547d54aa37";
	Client client = new Client();
	String[] clientJvm9Arguments = new String[]{
		"-XX:+DisableAttachMechanism",
		"-Xmx512m",
		"-Xss2m",
		"-XX:CompileThreshold=1500",
		"-Djna.nosys=true"
	};
	String[] clientJvmArguments = new String[]{
		"-XX:+DisableAttachMechanism",
		"-Xmx512m",
		"-Xss2m",
		"-XX:CompileThreshold=1500",
		"-Xincgc",
		"-XX:+UseConcMarkSweepGC",
		"-XX:+UseParNewGC",
		"-Djna.nosys=true"};
	String[] dependencyHashes;
	String[] launcherArguments = new String[]{
		"-XX:+DisableAttachMechanism",
		"-Drunelite.launcher.nojvm=true",
		"-Xmx512m",
		"-Xss2m",
		"-XX:CompileThreshold=1500",
		"-Xincgc",
		"-XX:+UseConcMarkSweepGC",
		"-XX:+UseParNewGC",
		"-Djna.nosys=true"};
	private Artifact[] artifacts = getArtifacts();

	Bootstrap()
	{
	}

	public static String getChecksumObject(Serializable object) throws IOException, NoSuchAlgorithmException
	{
		try (ByteArrayOutputStream baos = new ByteArrayOutputStream(); ObjectOutputStream oos = new ObjectOutputStream(baos))
		{
			oos.writeObject(object);
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] thedigest = md.digest(baos.toByteArray());
			return DatatypeConverter.printHexBinary(thedigest);
		}
	}

	private static String getChecksumFile(String filepath) throws IOException, NoSuchAlgorithmException
	{
		System.out.println("Generating Hash for " + filepath);
		MessageDigest md = MessageDigest.getInstance("SHA-256");

		try (DigestInputStream dis = new DigestInputStream(new FileInputStream(filepath), md))
		{
			//empty loop to clear the data
			while (dis.read() != -1)
			{
			}
			md = dis.getMessageDigest();
		}

		return bytesToHex(md.digest());

	}

	private static String bytesToHex(byte[] hashInBytes)
	{

		StringBuilder sb = new StringBuilder();
		for (byte b : hashInBytes)
		{
			sb.append(String.format("%02x", b));
		}
		return sb.toString();

	}

	public void copyTodir(String origPath, String newPath)
	{
		try
		{
			FileUtils.copyFileToDirectory(new File(origPath), new File(newPath));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	private Artifact[] getArtifacts()
	{
		try
		{
			artifacts = new Artifact[48];

			//Static artifacts
			artifacts[0] = new Artifact();
			artifacts[0].hash = "b12331da8683e5f107d294adeebb83ecf9124abc1db533554d2a8d3c62832d75";
			artifacts[0].name = "asm-all-6.0_BETA.jar";
			artifacts[0].path = "https://mvn.runelite.net/org/ow2/asm/asm-all/6.0_BETA/asm-all-6.0_BETA.jar";
			artifacts[0].size = "265176";
			artifacts[1] = new Artifact();
			artifacts[1].hash = "7f0f013961c81d7069d0c0afc569de9ef4791b700be37fab417b0f5352294b73";
			artifacts[1].name = "naturalmouse-2.0.1.jar";
			artifacts[1].path = "https://repo1.maven.org/maven2/com/github/joonasvali/naturalmouse/naturalmouse/2.0.1/naturalmouse-2.0.1.jar";
			artifacts[1].size = "3168921";
			artifacts[2] = new Artifact();
			artifacts[2].hash = "72c88d597188ab386ec4de598203675d6286de569812454d732e379c9ecb0ed7";
			artifacts[2].name = "jcl-core-2.8jar";
			artifacts[2].path = "https://repo1.maven.org/maven2/org/xeustechnologies/jcl-core/2.8/jcl-core-2.8.jar";
			artifacts[2].size = "3168921";
			artifacts[4] = new Artifact();
			artifacts[4].hash = "6d9e5b86cfd1dd44c676899285b5bb4fa0d371cf583e8164f9c8a0366553242b";
			artifacts[4].name = "slf4j-api-1.7.26.jar";
			artifacts[4].path = "https://repo1.maven.org/maven2/org/slf4j/slf4j-api/1.7.26/slf4j-api-1.7.26.jar";
			artifacts[4].size = "41203";
			artifacts[5] = new Artifact();
			artifacts[5].hash = "fb53f8539e7fcb8f093a56e138112056ec1dc809ebb020b59d8a36a5ebac37e0";
			artifacts[5].name = "logback-classic-1.2.3.jar";
			artifacts[5].path = "https://mvn.runelite.net/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar";
			artifacts[5].size = "290339";
			artifacts[6] = new Artifact();
			artifacts[6].hash = "5946d837fe6f960c02a53eda7a6926ecc3c758bbdd69aa453ee429f858217f22";
			artifacts[6].name = "logback-core-1.2.3.jar";
			artifacts[6].path = "https://mvn.runelite.net/ch/qos/logback/logback-core/1.2.3/logback-core-1.2.3.jar";
			artifacts[6].size = "471901";
			artifacts[7] = new Artifact();
			artifacts[7].hash = "df26cc58f235f477db07f753ba5a3ab243ebe5789d9f89ecf68dd62ea9a66c28";
			artifacts[7].name = "jopt-simple-5.0.4.jar";
			artifacts[7].path = "https://repo1.maven.org/maven2/net/sf/jopt-simple/jopt-simple/5.0.4/jopt-simple-5.0.4.jar";
			artifacts[7].size = "78826";
			artifacts[8] = new Artifact();
			artifacts[8].hash = "73e4d6ae5f0e8f9d292a4db83a2479b5468f83d972ac1ff36d6d0b43943b4f91";
			artifacts[8].name = "guava-28.0-jre.jar";
			artifacts[8].path = "https://repo1.maven.org/maven2/com/google/guava/guava/28.0-jre/guava-28.0-jre.jar";
			artifacts[8].size = "2649860";
			artifacts[9] = new Artifact();
			artifacts[9].hash = "766ad2a0783f2687962c8ad74ceecc38a28b9f72a2d085ee438b7813e928d0c7";
			artifacts[9].name = "jsr305-3.0.2.jar";
			artifacts[9].path = "https://repo1.maven.org/maven2/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.jar";
			artifacts[9].size = "33015";
			artifacts[10] = new Artifact();
			artifacts[10].hash = "cb4cfad870bf563a07199f3ebea5763f0dec440fcda0b318640b1feaa788656b";
			artifacts[10].name = "error_prone_annotations-2.0.18.jar";
			artifacts[10].path = "https://mvn.runelite.net/com/google/errorprone/error_prone_annotations/2.0.18/error_prone_annotations-2.0.18.jar";
			artifacts[10].size = "12078";
			artifacts[11] = new Artifact();
			artifacts[11].hash = "2994a7eb78f2710bd3d3bfb639b2c94e219cedac0d4d084d516e78c16dddecf6";
			artifacts[11].name = "j2objc-annotations-1.1.jar";
			artifacts[11].path = "https://mvn.runelite.net/com/google/j2objc/j2objc-annotations/1.1/j2objc-annotations-1.1.jar";
			artifacts[11].size = "8782";
			artifacts[12] = new Artifact();
			artifacts[12].hash = "2068320bd6bad744c3673ab048f67e30bef8f518996fa380033556600669905d";
			artifacts[12].name = "animal-sniffer-annotations-1.14.jar";
			artifacts[12].path = "https://mvn.runelite.net/org/codehaus/mojo/animal-sniffer-annotations/1.14/animal-sniffer-annotations-1.14.jar";
			artifacts[12].size = "3482";
			artifacts[13] = new Artifact();
			artifacts[13].hash = "d258ff1bd9b8b527872f8402648226658ad3149f1f40e74b0566d69e7e042fbc";
			artifacts[13].name = "guice-4.2.2-no_aop.jar";
			artifacts[13].path = "https://repo1.maven.org/maven2/com/google/inject/guice/4.2.2/guice-4.2.2.jar";
			artifacts[13].size = "428603";
			artifacts[14] = new Artifact();
			artifacts[14].hash = "91c77044a50c481636c32d916fd89c9118a72195390452c81065080f957de7ff";
			artifacts[14].name = "javax.inject-1.jar";
			artifacts[14].path = "https://mvn.runelite.net/javax/inject/javax.inject/1/javax.inject-1.jar";
			artifacts[14].size = "2497";
			artifacts[15] = new Artifact();
			artifacts[15].hash = "0addec670fedcd3f113c5c8091d783280d23f75e3acb841b61a9cdb079376a08";
			artifacts[15].name = "aopalliance-1.0.jar";
			artifacts[15].path = "https://mvn.runelite.net/aopalliance/aopalliance/1.0/aopalliance-1.0.jar";
			artifacts[15].size = "4467";
			artifacts[16] = new Artifact();
			artifacts[16].hash = "233a0149fc365c9f6edbd683cfe266b19bdc773be98eabdaf6b3c924b48e7d81";
			artifacts[16].name = "gson-2.8.5.jar";
			artifacts[16].path = "https://mvn.runelite.net/com/google/code/gson/gson/2.8.5/gson-2.8.5.jar";
			artifacts[16].size = "241622";
			artifacts[17] = new Artifact();
			artifacts[17].hash = "0467d25f408428824d5c9c09ec60ee1f0bc341d9bf48971a77fd14939a826c83";
			artifacts[17].name = "substance-8.0.02.jar";
			artifacts[17].path = "https://repo.runelite.net/net/runelite/pushingpixels/substance/8.0.02/substance-8.0.02.jar";
			artifacts[17].size = "1589195";
			artifacts[18] = new Artifact();
			artifacts[18].hash = "3214e1c23d549d5d67c91da4da1ef33c5248470bb824f91cbe8f9e0beea59eef";
			artifacts[18].name = "trident-1.5.00.jar";
			artifacts[18].path = "https://repo.runelite.net/net/runelite/pushingpixels/trident/1.5.00/trident-1.5.00.jar";
			artifacts[18].size = "79726";
			artifacts[19] = new Artifact();
			artifacts[19].hash = "d4a57bbc1627da7c391308fd0fe910b83170fb66afd117236a5b111d2db1590b";
			artifacts[19].name = "commons-text-1.2.jar";
			artifacts[19].path = "https://mvn.runelite.net/org/apache/commons/commons-text/1.2/commons-text-1.2.jar";
			artifacts[19].size = "136544";
			artifacts[20] = new Artifact();
			artifacts[20].hash = "6e8dc31e046508d9953c96534edf0c2e0bfe6f468966b5b842b3f87e43b6a847";
			artifacts[20].name = "commons-lang3-3.7.jar";
			artifacts[20].path = "https://mvn.runelite.net/org/apache/commons/commons-lang3/3.7/commons-lang3-3.7.jar";
			artifacts[20].size = "499634";
			artifacts[21] = new Artifact();
			artifacts[21].hash = "e74603dc77b4183f108480279dbbf7fed3ac206069478636406c1fb45e83b31a";
			artifacts[21].name = "jogl-all-2.3.2.jar";
			artifacts[21].path = "https://mvn.runelite.net/org/jogamp/jogl/jogl-all/2.3.2/jogl-all-2.3.2.jar";
			artifacts[21].size = "3414448";
			artifacts[22] = new Artifact();
			artifacts[22].hash = "8c53b1884cef19309d34fd10a94b010136d9d6de9a88c386f46006fb47acab5d";
			artifacts[22].name = "jogl-all-2.3.2-natives-windows-amd64.jar";
			artifacts[22].path = "https://mvn.runelite.net/org/jogamp/jogl/jogl-all/2.3.2/jogl-all-2.3.2-natives-windows-amd64.jar";
			artifacts[22].size = "240721";
			artifacts[23] = new Artifact();
			artifacts[23].hash = "507a0e6bd1ee4e81c3dfb287783af93775864eec742988d4162f98ce0cbac9d6";
			artifacts[23].name = "jogl-all-2.3.2-natives-windows-i586.jar";
			artifacts[23].path = "https://mvn.runelite.net/org/jogamp/jogl/jogl-all/2.3.2/jogl-all-2.3.2-natives-windows-i586.jar";
			artifacts[23].size = "209445";
			artifacts[24] = new Artifact();
			artifacts[24].hash = "82637302ae9effdf7d6f302e1050ad6aee3b13019914ddda5b502b9faa980216";
			artifacts[24].name = "jogl-all-2.3.2-natives-linux-amd64.jar";
			artifacts[24].path = "https://mvn.runelite.net/org/jogamp/jogl/jogl-all/2.3.2/jogl-all-2.3.2-natives-linux-amd64.jar";
			artifacts[24].size = "224010";
			artifacts[25] = new Artifact();
			artifacts[25].hash = "f474ef2ef01be24ec811d3858b0f4bc5659076975f4a58ddd79abd787e9305c7";
			artifacts[25].name = "jogl-all-2.3.2-natives-linux-i586.jar";
			artifacts[25].path = "https://mvn.runelite.net/org/jogamp/jogl/jogl-all/2.3.2/jogl-all-2.3.2-natives-linux-i586.jar";
			artifacts[25].size = "217274";
			artifacts[26] = new Artifact();
			artifacts[26].hash = "084844543b18f7ff71b4c0437852bd22f0cb68d7e44c2c611c1bbea76f8c6fdf";
			artifacts[26].name = "gluegen-rt-2.3.2.jar";
			artifacts[26].path = "https://mvn.runelite.net/org/jogamp/gluegen/gluegen-rt/2.3.2/gluegen-rt-2.3.2.jar";
			artifacts[26].size = "345605";
			artifacts[27] = new Artifact();
			artifacts[27].hash = "3474017422eff384db466bdb56c96c61220c43133a9da6329cf1781bea16c6b6";
			artifacts[27].name = "gluegen-rt-2.3.2-natives-windows-amd64.jar";
			artifacts[27].path = "https://mvn.runelite.net/org/jogamp/gluegen/gluegen-rt/2.3.2/gluegen-rt-2.3.2-natives-windows-amd64.jar";
			artifacts[27].size = "8159";
			artifacts[28] = new Artifact();
			artifacts[28].hash = "4eeed9fc2ebea5b9dc48a342b9478d127e989a2e1aa7129b512a98ec75cde338";
			artifacts[28].name = "gluegen-rt-2.3.2-natives-windows-i586.jar";
			artifacts[28].path = "https://mvn.runelite.net/org/jogamp/gluegen/gluegen-rt/2.3.2/gluegen-rt-2.3.2-natives-windows-i586.jar";
			artifacts[28].size = "7577";
			artifacts[29] = new Artifact();
			artifacts[29].hash = "f2dfd1800202059cf7e0294db5d57755147304e6eb220a9277526dbe6842bde2";
			artifacts[29].name = "gluegen-rt-2.3.2-natives-linux-amd64.jar";
			artifacts[29].path = "https://mvn.runelite.net/org/jogamp/gluegen/gluegen-rt/2.3.2/gluegen-rt-2.3.2-natives-linux-amd64.jar";
			artifacts[29].size = "4149";
			artifacts[30] = new Artifact();
			artifacts[30].hash = "1365d463f98c0abec92f3ad6b35aa4b53a9599a517800cf99fdabea6712ca7ec";
			artifacts[30].name = "gluegen-rt-2.3.2-natives-linux-i586.jar";
			artifacts[30].path = "https://mvn.runelite.net/org/jogamp/gluegen/gluegen-rt/2.3.2/gluegen-rt-2.3.2-natives-linux-i586.jar";
			artifacts[30].size = "4130";
			artifacts[31] = new Artifact();
			artifacts[31].hash = "7b7ae00e2aa98c3b2b5ac76e793e2c9b752bf51c86c54654dbd473843a25f1aa";
			artifacts[31].name = "jbsdiff-1.0.jar";
			artifacts[31].path = "https://mvn.runelite.net/io/sigpipe/jbsdiff/1.0/jbsdiff-1.0.jar";
			artifacts[31].size = "24589";
			artifacts[32] = new Artifact();
			artifacts[32].hash = "55bbfe26cee9296fd5b7c0d47ce6a00ea4dd572e235b63e9bb4eaf6f802315e4";
			artifacts[32].name = "commons-compress-1.5.jar";
			artifacts[32].path = "https://mvn.runelite.net/org/apache/commons/commons-compress/1.5/commons-compress-1.5.jar";
			artifacts[32].size = "256241";
			artifacts[33] = new Artifact();
			artifacts[33].hash = "fbc9de96a0cc193a125b4008dbc348e9ed54e5e13fc67b8ed40e645d303cc51b";
			artifacts[33].name = "jna-4.5.1.jar";
			artifacts[33].path = "https://mvn.runelite.net/net/java/dev/jna/jna/4.5.1/jna-4.5.1.jar";
			artifacts[33].size = "1440662";
			artifacts[34] = new Artifact();
			artifacts[34].hash = "890391047a225a7a599f33e665f9bedaee2037d9fe6f1b23d9d2369d69f0f28f";
			artifacts[34].name = "jna-platform-5.4.0.jar";
			artifacts[34].path = "https://repo1.maven.org/maven2/net/java/dev/jna/jna-platform/5.4.0/jna-platform-5.4.0.jar";
			artifacts[34].size = "2327547";
			artifacts[38] = new Artifact();
			artifacts[38].hash = "0e0392ea5c0d303bca20e13b2340086d7a347b22ad625f967989ee8723b6ac3c";
			artifacts[38].name = "okhttp-4.0.1.jar";
			artifacts[38].path = "https://repo1.maven.org/maven2/com/squareup/okhttp3/okhttp/4.0.1/okhttp-4.0.1.jar";
			artifacts[38].size = "394987";
			artifacts[39] = new Artifact();
			artifacts[39].hash = "e58c97406a6bb1138893750299ac63c6aa04b38b6b49eae1bfcad1a63ef9ba1b";
			artifacts[39].name = "okio-2.2.2.jar";
			artifacts[39].path = "https://repo1.maven.org/maven2/com/squareup/okio/okio/2.2.2/okio-2.2.2.jar";
			artifacts[39].size = "81088";
			artifacts[40] = new Artifact();
			artifacts[40].hash = "9d4924588d6280c7516db3a4b7298306db5b6f0d1cdf568ce738309b5660f008";
			artifacts[40].name = "commons-csv-1.4.jar";
			artifacts[40].path = "https://mvn.runelite.net/org/apache/commons/commons-csv/1.4/commons-csv-1.4.jar";
			artifacts[40].size = "39978";
			artifacts[41] = new Artifact();
			artifacts[41].hash = "7e26a8d043418f2f22d5f6a3083a9a131817009ee8cd72c004e83b50d1849a7c";
			artifacts[41].name = "discord-1.1.jar";
			artifacts[41].path = "https://repo.runelite.net/net/runelite/discord/1.1/discord-1.1.jar";
			artifacts[41].size = "617294";
			artifacts[42] = new Artifact();
			artifacts[42].hash = "21b5cac673a156cd8d6cf9efe15ff267b6353eeb129678aa4b39542683ba0dc2";
			artifacts[42].name = "rxjava-2.2.10.jar";
			artifacts[42].path = "https://raw.githubusercontent.com/runelite-extended/maven-repo/master/artifacts/" + artifacts[42].name;
			artifacts[42].size = "2348810";
			artifacts[43] = new Artifact();
			artifacts[43].hash = "830a08b9d5c20ab8e2033c16fc6ee067e6ffcd0c730f303d648aadfa81210d62";
			artifacts[43].name = "rxrelay-2.1.0.jar";
			artifacts[43].path = "https://raw.githubusercontent.com/runelite-extended/maven-repo/master/artifacts/" + artifacts[43].name;
			artifacts[43].size = "27750";
			artifacts[44] = new Artifact();
			artifacts[44].hash = "cc09ab0b140e0d0496c2165d4b32ce24f4d6446c0a26c5dc77b06bdf99ee8fae";
			artifacts[44].name = "reactive-streams-1.0.2.jar";
			artifacts[44].path = "https://raw.githubusercontent.com/runelite-extended/maven-repo/master/artifacts/" + artifacts[44].name;
			artifacts[44].size = "27750";
			artifacts[45] = new Artifact();
			artifacts[45].hash = "f76f9812a703ba5085af8f51769e60e8ecd5e99b55b2ced097cf2343e972ad7b";
			artifacts[45].name = "kotlin-stdlib-1.3.40.jar";
			artifacts[45].path = "https://repo1.maven.org/maven2/org/jetbrains/kotlin/kotlin-stdlib/1.3.40/kotlin-stdlib-1.3.40.jar";
			artifacts[45].size = "27750";
			artifacts[46] = new Artifact();
			artifacts[46].hash = "a171ee4c734dd2da837e4b16be9df4661afab72a41adaf31eb84dfdaf936ca26";
			artifacts[46].name = "failureaccess-1.0.1.jar";
			artifacts[46].path = "https://repo1.maven.org/maven2/com/google/guava/failureaccess/1.0.1/failureaccess-1.0.1.jar";
			artifacts[46].size = "27750";

			//Dynamic artifacts
			artifacts[3] = new Artifact();
			artifacts[3].name = "client-" + projectVersion + ".jar";
			artifacts[3].hash = getChecksumFile("./runelite-client/build/libs/" + artifacts[3].name);
			artifacts[3].path = "http://download.tuxfamily.org/rlplus/" + Bootstrapper.remoteLocation + artifacts[3].name;
			artifacts[3].size = Long.toString(getFileSize("./runelite-client/build/libs/" + artifacts[3].name));
			copyTodir("./runelite-client/build/libs/" + artifacts[3].name, Bootstrapper.localLocation);
			artifacts[35] = new Artifact();
			artifacts[35].name = "runelite-api-" + projectVersion + ".jar";
			artifacts[35].hash = getChecksumFile("./runelite-api/build/libs/" + artifacts[35].name);
			artifacts[35].path = "http://download.tuxfamily.org/rlplus/" + Bootstrapper.remoteLocation + artifacts[35].name;
			artifacts[35].size = Long.toString(getFileSize("./runelite-api/build/libs/" + artifacts[35].name));
			copyTodir("./runelite-api/build/libs/" + artifacts[35].name, Bootstrapper.localLocation);
			artifacts[36] = new Artifact();
			artifacts[36].name = "runescape-api-" + projectVersion + ".jar";
			artifacts[36].hash = getChecksumFile("./runescape-api/build/libs/" + artifacts[36].name);
			artifacts[36].path = "http://download.tuxfamily.org/rlplus/" + Bootstrapper.remoteLocation + artifacts[36].name;
			artifacts[36].size = Long.toString(getFileSize("./runescape-api/build/libs/" + artifacts[36].name));
			copyTodir("./runescape-api/build/libs/" + artifacts[36].name, Bootstrapper.localLocation);
			artifacts[37] = new Artifact();
			artifacts[37].name = "http-api-" + projectVersion + ".jar";
			artifacts[37].hash = getChecksumFile("./http-api/build/libs/" + artifacts[37].name);
			artifacts[37].path = "http://download.tuxfamily.org/rlplus/" + Bootstrapper.remoteLocation + artifacts[37].name;
			artifacts[37].size = Long.toString(getFileSize("./http-api/build/libs/" + artifacts[37].name));
			copyTodir("./http-api/build/libs/" + artifacts[37].name, Bootstrapper.localLocation);
			artifacts[47] = new Artifact();
			artifacts[47].name = "injected-client-" + projectVersion + ".jar";
			artifacts[47].hash = getChecksumFile("./injected-client/build/libs/" + artifacts[47].name);
			artifacts[47].path = "http://download.tuxfamily.org/rlplus/" + Bootstrapper.remoteLocation + artifacts[47].name;
			artifacts[47].size = Long.toString(getFileSize("./injected-client/build/libs/" + artifacts[47].name));
			copyTodir("./injected-client/build/libs/" + artifacts[47].name, Bootstrapper.localLocation);
		}
		catch (IOException | NoSuchAlgorithmException e)
		{
			e.printStackTrace();
		}
		return artifacts;
	}

	private long getFileSize(String fileLocation)
	{
		File f = new File(fileLocation);
		return f.length();
	}

	class Artifact
	{
		String hash;
		String name;
		String path;
		String size;
	}

}
