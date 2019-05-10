![](https://i.imgur.com/OVRdQBz.png)



# RuneLitePlus [![Build Status](https://travis-ci.org/runelite-extended/runelite.svg?branch=master)](https://travis-ci.org/runelite-extended/runelite) [![Discord](https://img.shields.io/discord/373382904769675265.svg)](https://discord.gg/HN5gf3m)

[RuneLitePlus](https://runelitepl.us)  is a fork of [RuneLite](https://github.com/runelite/runelite) that provides more functionality and less restrictions while staying open source. This is meant to directly compete with 3rd party RL clients that are trying to sell their code.

## Project Layout

- [cache](cache/src/main/java/net/runelite/cache) - Libraries used for reading/writing cache files, as well as the data in it
- [http-api](http-api/src/main/java/net/runelite/http/api) - API for api.runelite.net
- [http-service](http-service/src/main/java/net/runelite/http/service) - Service for api.runelite.net
- [runelite-api](runelite-api/src/main/java/net/runelite/api) - RuneLite API, interfaces for accessing the client
- [runelite-mixins](runelite-mixins/src/main/java/net/runelite) - Mixins which are injected into the injected client's classes
- [runescape-api](runescape-api/src/main/java/net/runelite) - Mappings correspond to these interfaces, runelite-api is a subset of this
- [runelite-client](runelite-client/src/main/java/net/runelite/client) - Game client with plugins

## License

RuneLitePlus is licensed under the BSD 2-clause license. See the license header in the respective file to be sure.

## Contribute and Develop

We've set up a separate document for our [contribution guidelines](https://github.com/runelite-extended/runelite/blob/master/.github/CONTRIBUTING.md).

## How do I know the .jar you provide is safe?

The .jar file we provide is the same .jar file you would receive if you compiled the client from our repository. You can verify authenticity by manually building the .jar and comparing MD5 hashes.

The current MD5 checksum hash of RuneLitePlus is: 06F03248F379917715DDDE16B8A6BC11

The current SHA1 checksum hash of RuneLitePlus is:1D9AB0900CA8394A80273739D11556CEC1109920

The current SHA-256 checksum hash of RuneLitePlus is:3DA50838268BA360B98E870C56A580F8ADBE1619D6DE7B68C2478DA47545A553
