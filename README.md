Minecraft mod based on Starcraft. To install:
 
1) Create fresh folder [Starcraft-Mod (no git)] in project directory 

2) Extract Forge 12.18.2.2099 source into [/Starcraft-Mod (no git)]  

3) Run command [gradlew setupDecompWorkspace] in [/Starcraft-Mod (no git)] 

4) Run command [gradlew eclipse] in [/Starcraft-Mod (no git)]  

5) In project directory, run command [git clone https://github.com/bvanseghi/Starcraft-Mod.git]  

6) Delete folder [/Starcraft-Mod (no git)/src]  

7) Copy all files/subfolders of [/Starcraft-Mod] to [/Starcraft-Mod (no git)] 

8) (Optional, but recommended) backup [/Starcraft-Mod] and [/Starcraft-Mod (no git)]  

9) Delete [/Starcraft-Mod]  

10) Rename [/Starcraft-Mod (no git)] to [/Starcraft-Mod]  


Alternate method /!\ **UNTESTED** /!\  

1) In project directory, run command [git clone https://github.com/bvanseghi/Starcraft-Mod.git --branch MC1.10.2 --single-branch SCMC]  

2) Extract Forge 12.18.2.2099 source into [/SCMC]  

3) Run command [gradlew setupDecompWorkspace] in [/SCMC]  

4) Run command [gradlew eclipse] in [/SCMC]  
4a) For those using IDEA, you're on your own :P  

5) Any files that are in [/SCMC] and [/SCMC/forge-docs] can be deleted from [/SCMC] (but keep them in [/SCMC/forge-docs])  

6) In your IDE of choice, delete anything not from the mod - it'll be pretty obvious as to what's what  

**If confused about anything, PM wundrweapon#4856 on Discord**