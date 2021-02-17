import groovy.json.JsonOutput
import org.gradle.api.DefaultTask
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.*
import org.gradle.kotlin.dsl.extra
import org.gradle.kotlin.dsl.get
import java.io.File
import java.security.MessageDigest
import javax.inject.Inject
import kotlin.system.exitProcess

open class BootstrapTask @Inject constructor(@Input val type: String) : DefaultTask() {

    @InputFile
    @PathSensitive(PathSensitivity.ABSOLUTE)
    val clientJar: RegularFileProperty = project.objects.fileProperty()

    @Input
    val launcherJvm11Arguments = arrayOf("-XX:+DisableAttachMechanism", "-Drunelite.launcher.nojvm=true", "-Xmx1G", "-Xss2m", "-XX:CompileThreshold=1500", "-Djna.nosys=true")

    @Input
    val launcherArguments = arrayOf("-XX:+DisableAttachMechanism", "-Drunelite.launcher.nojvm=true", "-Xmx1G", "-Xss2m", "-XX:CompileThreshold=1500", "-Xincgc", "-XX:+UseConcMarkSweepGC", "-XX:+UseParNewGC", "-Djna.nosys=true")

    @Input
    val clientJvmArguments = arrayOf("-XX:+DisableAttachMechanism", "-Xmx1G", "-Xss2m", "-XX:CompileThreshold=1500", "-Xincgc", "-XX:+UseConcMarkSweepGC", "-XX:+UseParNewGC", "-Djna.nosys=true", "-Dawt.useSystemAAFontSettings=on", "-Dswing.aatext=true")

    @Input
    val clientJvm9Arguments = arrayOf("-XX:+DisableAttachMechanism", "-Xmx1G", "-Xss2m", "-XX:CompileThreshold=1500", "-Djna.nosys=true", "-Dawt.useSystemAAFontSettings=on", "-Dswing.aatext=true")

    private fun hash(file: ByteArray): String {
        return MessageDigest.getInstance("SHA-256").digest(file).fold("", { str, it -> str + "%02x".format(it) })
    }

    private fun getArtifacts(): Array<JsonBuilder> {
        val artifacts = ArrayList<JsonBuilder>()
        val artifactsSet = HashSet<String>()

        project.configurations["runtimeClasspath"].resolvedConfiguration.resolvedArtifacts.forEach {
            val module = it.moduleVersion.id.toString()

            val splat = module.split(":")
            val name = splat[1]
            val group = splat[0]
            val version = splat[2]
            lateinit var path: String

            if (it.file.name.contains("runelite-client") ||
                    it.file.name.contains("http-api") ||
                    it.file.name.contains("runescape-api") ||
                    it.file.name.contains("runelite-api")) {
                path = "https://github.com/open-osrs/hosting/raw/master/${type}/${it.file.name}"
            } else if (it.file.name.contains("injection-annotations")) {
                path = "https://github.com/open-osrs/hosting/raw/master/" + group.replace(".", "/") + "/${name}/$version/${it.file.name}"
            } else if (!group.contains("runelite")) {
                path = "https://repo.maven.apache.org/maven2/" + group.replace(".", "/") + "/${name}/$version/${name}-$version"
                if (it.classifier != null && it.classifier != "no_aop") {
                    path += "-${it.classifier}"
                }
                path += ".jar"
            } else if (it.file.name.contains("trident") || it.file.name.contains("discord") || it.file.name.contains("substance")) {
                path = "https://repo.runelite.net/net/runelite/"
                if (!it.file.name.contains("discord")) {
                    path += "pushingpixels/"
                }
                path += "${name}/$version/${name}-$version.jar"
            }
            else if (it.file.name.contains("gluegen"))
            {
                path = "http://repo.runelite.net/net/runelite/gluegen/gluegen-rt/" + version + "/" + it.file.name
            }
            else if (it.file.name.contains("jogl"))
            {
                path = "http://repo.runelite.net/net/runelite/jogl/jogl-all/" + version + "/" + it.file.name
            }
            else
            {
                println("ERROR: " + it.file.name + " has no download path!")
                exitProcess(-1)
            }



            val filePath = it.file.absolutePath
            val artifactFile = File(filePath)

            if (!artifactsSet.contains(filePath)) {
                artifactsSet.add(filePath)
                artifacts.add(JsonBuilder(
                        "name" to it.file.name,
                        "path" to path,
                        "size" to artifactFile.length(),
                        "hash" to hash(artifactFile.readBytes())
                ))
            }
        }

        val cjar = clientJar.get().asFile
        artifacts.add(JsonBuilder(
                "name" to cjar.name,
                "path" to "https://github.com/open-osrs/hosting/raw/master/${type}/${cjar.name}",
                "size" to cjar.length(),
                "hash" to hash(cjar.readBytes())
        ))

        return artifacts.toTypedArray()
    }

    @TaskAction
    fun bootstrap() {
        val json = JsonBuilder(
                "projectVersion" to ProjectVersions.openosrsVersion,
                "minimumLauncherVersion" to ProjectVersions.launcherVersion,
                "launcherJvm11Arguments" to launcherJvm11Arguments,
                "launcherArguments" to launcherArguments,
                "clientJvmArguments" to clientJvmArguments,
                "clientJvm9Arguments" to clientJvm9Arguments,
                "buildCommit" to project.extra["gitCommit"],
                "artifacts" to getArtifacts()
        ).toString()

        val prettyJson = JsonOutput.prettyPrint(json)

        val bootstrapDir = File("${project.buildDir}/bootstrap")
        bootstrapDir.mkdirs()

        File(bootstrapDir, "bootstrap-${type}.json").printWriter().use { out ->
            out.println(prettyJson)
        }
    }
}
