package scmc.blocks.metablocks;


import net.minecraft.util.IStringSerializable;


public class EnumHandler {

	public static enum ProtossMetalType implements IStringSerializable {
		AIUR("aiur", 0),
		DARK("dark", 1),
		GREEN("green", 2),
		BLUE("blue", 3);
		
		private int ID;
		private String name;
		
		private ProtossMetalType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		@Override
		public String getName() {
			return this.name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String toString() {
			return getName();
		}
	}
	
	public static enum PylonCrystalType implements IStringSerializable {
		PURE("pure", 0),
		DARK("dark", 1),
		VOID("void", 2);
		
		private int ID;
		private String name;
		
		private PylonCrystalType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		@Override
		public String getName() {
			return this.name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String toString() {
			return getName();
		}
	}

	
	public static enum ZergStructureCarapaceType implements IStringSerializable {
		T1("t1", 0),
		T2("t2", 1),
		T3("t3", 2);
		
		private int ID;
		private String name;
		
		private ZergStructureCarapaceType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		@Override
		public String getName() {
			return this.name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String toString() {
			return getName();
		}
	}
	
	
	public static enum ZergFleshType implements IStringSerializable {
		PURPLE("purple", 0),
		BROWN("brown", 1),
		PINK("pink", 2),
		BLUE("blue", 3),
		CYAN("cyan", 4),
		GRAY("gray", 5),
		GREEN("green", 6),
		LIGHT_BLUE("lightblue", 7),
		LIME("lime", 8),
		MAGENTA("magenta", 9),
		ORANGE("orange", 10),
		RED("red", 11),
		SILVER("silver", 12),
		WHITE("white", 13),
		YELLOW("yellow", 14);
		
		private int ID;
		private String name;
		
		private ZergFleshType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		@Override
		public String getName() {
			return this.name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String toString() {
			return getName();
		}
	}
	
	
	public static enum DyedIronType implements IStringSerializable {
		PURPLE("purple", 0),
		BROWN("brown", 1),
		PINK("pink", 2),
		BLUE("blue", 3),
		CYAN("cyan", 4),
		GRAY("gray", 5),
		GREEN("green", 6),
		LIGHT_BLUE("lightblue", 7),
		LIME("lime", 8),
		MAGENTA("magenta", 9),
		ORANGE("orange", 10),
		RED("red", 11),
		SILVER("silver", 12),
		YELLOW("yellow", 13);
		
		private int ID;
		private String name;
		
		private DyedIronType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		@Override
		public String getName() {
			return this.name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String toString() {
			return getName();
		}
	}
	
	
	public static enum CompressedMineralType implements IStringSerializable {
		BLUE("blue", 0),
		RICH("rich", 1);
		
		private int ID;
		private String name;
		
		private CompressedMineralType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		@Override
		public String getName() {
			return this.name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String toString() {
			return getName();
		}
	}
	
	
	public static enum CompressedMetalType implements IStringSerializable {
		COPPER("copper", 0),
		STEEL("steel", 1),
		TITANIUM("titanium", 2);
		
		private int ID;
		private String name;
		
		private CompressedMetalType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		@Override
		public String getName() {
			return this.name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String toString() {
			return getName();
		}
	}
}