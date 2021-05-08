![](https://i.imgur.com/0D5106S.png)



# OpenOSRS injected RuneLite 

[![Build Status](https://github.com/open-osrs/runelite/workflows/OpenOSRS%20-%20CI%20(push)/badge.svg)](https://github.com/open-osrs/runelite/actions?query=workflow%3A%22OpenOSRS+-+CI+%28push%29%22)
[![HitCount](http://hits.dwyl.io/open-osrs/runelite.svg)](http://hits.dwyl.io/open-osrs/runelite)  
[OpenOSRS](https://openosrs.com) is a fully open-source client with no restrictions. We are not affiliated with Jagex or RuneLite.  
  
This is a special branch that uses the upstream client (RuneLite) with the OpenOSRS injector. (bundled)  

From the root module, run the following gradle tasks:  
```clean build run```
  
This branch is still in bringup but most functionality works as intended.  
This branch uses upstreams PlayerManager/OverlayManager etc so keep that in mind if porting a plugin.  
  
Contributions are welcome, but there should be no changes made to runelite-client unless necessary/minor. Mould the api around the client.
## Discord  

[![Discord](https://img.shields.io/discord/373382904769675265.svg)](https://discord.gg/r287wN6bkc)

## Project Layout  

- [cache](cache/src/main/java/net/runelite/cache) - Libraries used for reading/writing cache files, as well as the data in it
- [deobfuscator](deobfuscator/src/main/java/net/runelite/deob) - Can decompile and cleanup gamepacks as well as map updates to newer revs
- [http-api](http-api/src/main/java/net/runelite/http/api) - API for runelite and OpenOSRS
- [injector](injector/src/main/java/com/openosrs/injector) - Bytecode weaver that allows us to add code to the obfuscated gamepack
- [runelite-api](runelite-api/src/main/java/net/runelite/api) - RuneLite API, interfaces for accessing the client
- [runelite-mixins](runelite-mixins/src/main/java/net/runelite) - Classes containing the Objects to be injected using the injector-plugin
- [runescape-api](runescape-api/src/main/java/net/runelite) - Mappings correspond to these interfaces, runelite-api is a subset of this
- [runelite-client](runelite-client/src/main/java/net/runelite/client) - Game client with plugins
- [wiki-scraper](wiki-scraper/src/main/java/net/runelite/data) - Scrapes the runescape wiki https://oldschool.runescape.wiki for the latest npc data

## Building  

We have migrated the project to Gradle. Information on how to setup and build the project can be found at https://github.com/open-osrs/runelite/wiki/Building-with-IntelliJ-IDEA

## Install from Pre-built Binaries 

Installers for Windows, Mac and Linux can be found at https://github.com/open-osrs/launcher/releases

## License  

OpenOSRS is licensed under the BSD 2-clause license. See the license header in the respective file to be sure.

## Contribute and Develop  

We've set up a separate document for our [contribution guidelines](https://github.com/open-osrs/runelite/blob/master/.github/CONTRIBUTING.md).

## Supported By  

OpenOSRS uses profiling tools provided by [YourKit](https://www.yourkit.com/)

Thanks [JetBrains](https://www.jetbrains.com/idea/download/) for providing our developers with IntelliJ IDEA Ultimate Edition.

## Wiki

Check out the [OpenOSRS wiki to learn more](https://github.com/open-osrs/runelite/wiki)
