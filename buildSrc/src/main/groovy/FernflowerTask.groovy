import org.gradle.api.DefaultTask
import org.gradle.api.logging.Logger
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import org.jetbrains.java.decompiler.main.decompiler.ConsoleDecompiler

class FernflowerTask extends DefaultTask {
    List<String> extraArgs
    String inputJar
    String outputDir
    Logger log = getLogger()
    @InputFile
    File getInputJar() {
        project.file("D:\\183renamed.jar")
    }

    @OutputDirectory
    File getOutputDir() {
        new File("D:\\183renamedDecompiled.jar")

    }

    @TaskAction
    void decompile() {
        getOutputDir().mkdirs()
        def args = [getInputJar().toString(), getOutputDir().toString()]
        if (extraArgs) {
            args.addAll(extraArgs)
        }



        ConsoleDecompiler.main(args as String[])
    }
}