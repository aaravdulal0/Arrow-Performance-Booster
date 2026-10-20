ArrowXDOp 1.1.0 — Paper 1.21.3 source

Features:
- Grants OP to the Minecraft player named ArrowXD when the plugin enables.
- Logs view distance, simulation distance, and loaded chunk counts at startup.
- Includes a conservative Paper performance tuning guide below.

Important:
- This ZIP contains source code, not a precompiled JAR.
- Build with Java 21 and Maven: `mvn package`
- Output JAR: `target/ArrowXDOp-1.1.0.jar`
- Put the JAR in the server's `plugins/` folder and restart.
- Use only on a server you own or administer.
- The plugin does not disable autosaves or delete entities/chunks; those shortcuts risk data loss or gameplay damage.
- "Paper 21.3" is interpreted as Paper 1.21.3.

Recommended performance settings (review your existing files before changing):
1. In `server.properties`:
   - `view-distance=6`
   - `simulation-distance=4`
   These reduce chunk rendering and ticking load. Increase if you have enough CPU/RAM.
2. In `config/paper-world-defaults.yml`, review `chunks` and `entities` settings using the documentation for your exact Paper build. Avoid copying settings from other versions blindly.
3. Use a current Java 21 runtime for Paper 1.21.3.
4. Profile lag with Paper's built-in `/spark` profiler (if available) before removing plugins or changing mob caps.
5. Keep backups and restart after changing server configuration.

If you only need OP once, run `op ArrowXD` in the server console.
