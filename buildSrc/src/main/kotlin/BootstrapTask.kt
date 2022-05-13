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
    val launcherArguments = arrayOf(
            "-XX:+DisableAttachMechanism",
            "-Drunelite.launcher.nojvm=true",
            "-Xmx512m",
            "-Xss2m",
            "-XX:CompileThreshold=1500",
            "-Xincgc",
            "-XX:+UseConcMarkSweepGC",
            "-XX:+UseParNewGC"
    )

    @Input
    val launcherJvm11Arguments = arrayOf(
            "-XX:+DisableAttachMechanism",
            "-Drunelite.launcher.nojvm=true",
            "-Xmx512m",
            "-Xss2m",
            "-XX:CompileThreshold=1500"
    )

    @Input
    val launcherJvm11WindowsArguments = arrayOf(
            "-XX:+DisableAttachMechanism",
            "-Drunelite.launcher.nojvm=true",
            "-Drunelite.launcher.blacklistedDlls=RTSSHooks.dll,RTSSHooks64.dll,NahimicOSD.dll,k_fps32.dll,k_fps64.dll",
            "-Xmx512m",
            "-Xss2m",
            "-XX:CompileThreshold=1500"
    )

    @Input
    val launcherJvm17Arguments = arrayOf(
            "-XX:+DisableAttachMechanism",
            "-Drunelite.launcher.nojvm=true",
            "-Xmx512m",
            "-Xss2m",
            "-XX:CompileThreshold=1500",
            "--add-opens=java.desktop/sun.awt=ALL-UNNAMED"
    )

    @Input
    val launcherJvm17MacArguments = arrayOf(
            "-XX:+DisableAttachMechanism",
            "-Drunelite.launcher.nojvm=true",
            "-Xmx512m",
            "-Xss2m",
            "-XX:CompileThreshold=1500",
            "--add-opens=java.desktop/sun.awt=ALL-UNNAMED",
            "--add-opens=java.desktop/com.apple.eawt=ALL-UNNAMED"
    )

    @Input
    val launcherJvm17WindowsArguments = arrayOf(
            "-XX:+DisableAttachMechanism",
            "-Drunelite.launcher.nojvm=true",
            "-Drunelite.launcher.blacklistedDlls=RTSSHooks.dll,RTSSHooks64.dll,NahimicOSD.dll,k_fps32.dll,k_fps64.dll",
            "-Xmx512m",
            "-Xss2m",
            "-XX:CompileThreshold=1500",
            "--add-opens=java.desktop/sun.awt=ALL-UNNAMED"
    )

    @Input
    val clientJvmArguments = arrayOf(
            "-XX:+DisableAttachMechanism",
            "-Xmx512m",
            "-Xss2m",
            "-XX:CompileThreshold=1500",
            "-Xincgc",
            "-XX:+UseConcMarkSweepGC",
            "-XX:+UseParNewGC",
            "-Dawt.useSystemAAFontSettings=on",
            "-Dswing.aatext=true"
    )

    @Input
    val clientJvm9Arguments = arrayOf(
            "-XX:+DisableAttachMechanism",
            "-Xmx512m",
            "-Xss2m",
            "-XX:CompileThreshold=1500",
            "-Dawt.useSystemAAFontSettings=on",
            "-Dswing.aatext=true"
    )

    @Input
    val clientJvm17MacArguments = arrayOf(
            "-XX:+DisableAttachMechanism",
            "-Xmx512m",
            "-Xss2m",
            "-XX:CompileThreshold=1500",
            "--add-opens=java.desktop/sun.awt=ALL-UNNAMED",
            "--add-opens=java.desktop/com.apple.eawt=ALL-UNNAMED",
            "-Dawt.useSystemAAFontSettings=on",
            "-Dswing.aatext=true"
    )

    @Input
    val clientJvm17Arguments = arrayOf(
            "-XX:+DisableAttachMechanism",
            "-Xmx512m",
            "-Xss2m",
            "-XX:CompileThreshold=1500",
            "--add-opens=java.desktop/sun.awt=ALL-UNNAMED",
            "-Dawt.useSystemAAFontSettings=on",
            "-Dswing.aatext=true"
    )

    @Input
    val dependencyHashes = JsonBuilder()

    private fun hash(file: ByteArray): String {
        return MessageDigest.getInstance("SHA-256").digest(file).fold("", { str, it -> str + "%02x".format(it) })
    }

    private fun getArtifacts(): Array<JsonBuilder> {
        val artifacts = ArrayList<JsonBuilder>()
        val artifactsSet = HashSet<String>()

        project.configurations["runtimeClasspath"].resolvedConfiguration.resolvedArtifacts.forEach {
            if (it.file.name.contains("injection-annotations")) {
                return@forEach
            }

            val module = it.moduleVersion.id.toString()

            val splat = module.split(":")
            val name = splat[1]
            val group = splat[0]
            val version = splat[2]
            lateinit var path: String
            val platform = ArrayList<JsonBuilder>()

            if (it.file.name.contains("runelite-client") ||
                    it.file.name.contains("http-api") ||
                    it.file.name.contains("runescape-api") ||
                    it.file.name.contains("runelite-api") ||
                    it.file.name.contains("runelite-jshell")) {
                path = "https://github.com/open-osrs/hosting/raw/master/${type}/${it.file.name}"
            } else if (it.file.name.contains("injection-annotations")) {
                path = "https://github.com/open-osrs/hosting/raw/master/" + group.replace(".", "/") + "/${name}/$version/${it.file.name}"
            } else if (!group.contains("runelite")) {
                path = "https://repo.maven.apache.org/maven2/" + group.replace(".", "/") + "/${name}/$version/${name}-$version"
                if (it.classifier != null && it.classifier != "no_aop") {
                    path += "-${it.classifier}"
                }
                path += ".jar"
            } else if (
                    it.file.name.contains("trident") ||
                    it.file.name.contains("discord") ||
                    it.file.name.contains("substance") ||
                    it.file.name.contains("gluegen") ||
                    it.file.name.contains("jogl") ||
                    it.file.name.contains("jocl")
            ) {
                path = "https://repo.runelite.net/"
                path += "${group.replace(".", "/")}/${name}/$version/${name}-$version"
                if (it.classifier != null && it.classifier != "no_aop") {
                    path += "-${it.classifier}"

                    if (it.classifier!!.contains("linux")) {
                        platform.add(JsonBuilder(
                                "name" to "linux"
                        ))
                    } else if (it.classifier!!.contains("windows")) {
                        val json = JsonBuilder(
                                "name" to "win"
                        )

                        if (it.classifier!!.contains("amd64")) {
                            json.add("arch" to "amd64")
                        } else {
                            json.add("arch" to "x86")
                        }

                        platform.add(json)
                    } else if (it.classifier!!.contains("macos")) {
                        val json = JsonBuilder(
                                "name" to "macos"
                        )

                        if (it.classifier!!.contains("x64")) {
                            json.add("arch" to "x86_64")
                        } else if (it.classifier!!.contains("arm64")) {
                            json.add("arch" to "aarch64")
                        }

                        platform.add(json)
                    }
                }
                path += ".jar"
            } else {
                println("ERROR: " + it.file.name + " has no download path!")
                exitProcess(-1)
            }

            val filePath = it.file.absolutePath
            val artifactFile = File(filePath)

            if (!artifactsSet.contains(filePath)) {
                artifactsSet.add(filePath)

                val sha = hash(artifactFile.readBytes())

                val json = JsonBuilder(
                        "name" to it.file.name,
                        "path" to path,
                        "size" to artifactFile.length(),
                        "hash" to sha
                )

                dependencyHashes.add(it.file.name to sha)

                if (platform.isNotEmpty()) {
                    json.add("platform" to platform.toTypedArray())
                }

                artifacts.add(json)
            }
        }

        val cjar = clientJar.get().asFile
        val sha = hash(cjar.readBytes())
        artifacts.add(JsonBuilder(
                "name" to cjar.name,
                "path" to "https://github.com/open-osrs/hosting/raw/master/${type}/${cjar.name}",
                "size" to cjar.length(),
                "hash" to sha
        ))

        dependencyHashes.add(cjar.name to sha)

        return artifacts.toTypedArray()
    }

    @TaskAction
    fun bootstrap() {
        val json = JsonBuilder(
                "projectVersion" to ProjectVersions.openosrsVersion,
                "minimumLauncherVersion" to ProjectVersions.launcherVersion,
                "launcherArguments" to launcherArguments,
                "launcherJvm11Arguments" to launcherJvm11Arguments,
                "launcherJvm11WindowsArguments" to launcherJvm11WindowsArguments,
                "launcherJvm17Arguments" to launcherJvm17Arguments,
                "launcherJvm17MacArguments" to launcherJvm17MacArguments,
                "launcherJvm17WindowsArguments" to launcherJvm17WindowsArguments,
                "clientJvmArguments" to clientJvmArguments,
                "clientJvm9Arguments" to clientJvm9Arguments,
                "clientJvm17MacArguments" to clientJvm17MacArguments,
                "clientJvm17Arguments" to clientJvm17Arguments,
                "buildCommit" to project.extra["gitCommit"],
                "artifacts" to getArtifacts(),
                "dependencyHashes" to dependencyHashes
        ).toString()

        val prettyJson = JsonOutput.prettyPrint(json)

        val bootstrapDir = File("${project.buildDir}/bootstrap")
        bootstrapDir.mkdirs()

        if (type == "stable") {
            File(bootstrapDir, "bootstrap-openosrs.json").printWriter().use { out ->
                out.println(prettyJson)
            }

            File(bootstrapDir, "bootstrap-staging.json").printWriter().use { out ->
                out.println(prettyJson)
            }
        }

        File(bootstrapDir, "bootstrap-${type}.json").printWriter().use { out ->
            out.println(prettyJson)
        }
    }
}
