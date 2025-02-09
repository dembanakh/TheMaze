
# The Maze

Team project for university course.

Online multiplayer game for Android.

<img title="In Game" src="/Screenshots/InGame.jpg" alt="InGame" height="350"/>

Players are spawned in a maze-like map generated on the fly. Before each round of game, one bullet is given to a random player (the rest have 0 bullets), and nobody knows who posesses the bullet. The round ends either when that single bullet hits somebody (in which case the player with the bullet gains points, and the dead player loses points) or when the round timer expires (in which case the player with the bullet loses points). Players can use mics in order to develop more elaborate strategies to the game.

<img title="Player Shooting" src="/Screenshots/Shooting.jpg" alt="Shooting" height="350"/>

# Technical Details

The game consists of Android client and authoritative Java server, both built with Gradle. Client utilizes Android Studio, Java and LibGDX library for game front-end. Server utilized Amazon Web Services during the development (obviously, one can host the server on any machine). GRPC framework was exploited to communicate between clients and server.

Features:
1. 3 different map generation algorithms (RANDOM, CAVES and DUNGEON) <img title="Map by RANDOM algorithm" src="/Screenshots/RandomMap.jpg" alt="RandomMap" height="350"/> <img title="Map by CAVES algorithm" src="/Screenshots/CavesMap.jpg" alt="CavesMap" height="350"/> <img title="Map by DUNGEON algorithm" src="/Screenshots/DungeonMap.jpg" alt="DungeonMap" height="350"/>
2. Server-side physics (for limiting cheating attempts)
3. Client-side prediction, Server reconciliation and Entity interpolation (for smooth and ping-robust user experience)
4. Manually implemented collision detection algorithms (circle-circle, circle-walls)
5. Voice Chat (based on small library by [EpicGuru](https://github.com/Epicguru): [VoiceChat](https://github.com/Epicguru/VoiceChat))

# How To Build

1. Paste server machine IP address into "host" field in [server.properties](android/assets/server.properties)
2. Modify "port-main" and "port-voice" fields in [server.properties](android/assets/server.properties) if the default ports (50051 and 50052) are in use by other processes.
3. In server machine command-line: `./gradlew :run:server`
4. In Android Studio install the app on the physical device or emulator (or bundle an apk executable)

# Team

- Me
- [dominik1999w](https://github.com/dominik1999w)
- [Onchao](https://github.com/Onchao)
- [ssalabura](https://github.com/ssalabura)
