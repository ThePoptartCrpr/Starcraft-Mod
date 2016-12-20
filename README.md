Minecraft mod based on Starcraft. To install:  

1. In project directory, run command `git clone https://github.com/bvanseghi/Starcraft-Mod.git --branch MC1.10.2 --single-branch SCMC`  

2. Extract Forge 12.18.2.2099 source into {SCMC}  

3. Run command `gradlew setupDecompWorkspace` in {SCMC}  

4. Run command `gradlew eclipse` in {SCMC}  
 * For those using IDEA, you're on your own :P  

5. Any files that are in {SCMC} and {SCMC/forge-docs} can be deleted from {SCMC} (but keep them in {SCMC/forge-docs})  

6. (Optional) make {SCMC/.git} a hidden folder (but not its subfiles)  

7. In your IDE of choice, delete anything not from the mod - it'll be pretty obvious as to what's what  

**If confused about anything, PM wundrweapon#4856 on Discord**
