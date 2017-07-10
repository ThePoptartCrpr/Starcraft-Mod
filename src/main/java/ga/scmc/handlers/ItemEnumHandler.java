package ga.scmc.handlers;

import net.minecraft.util.IStringSerializable;

//So... much... REDUNDANCY
public class ItemEnumHandler {

	public enum BulletType implements IStringSerializable {
		C14("c14", 0);
		
		private int ID;
		private String name;
		
		BulletType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String getName() {
			return name;
		}
		
		@Override
		public String toString() {
			return getName();
		}
	}
	
	
	public static enum C14PartType implements IStringSerializable {
		BARREL("barrel", 0),
		BODY("body", 1),
		GRIP("grip", 2);
		
		private int ID;
		private String name;
		
		private C14PartType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String getName() {
			return name;
		}
		
		@Override
		public String toString() {
			return getName();
		}
	}
	
	
	public static enum CarapaceType implements IStringSerializable {
		T1("t1", 0),
		T2("t2", 1),
		T3("t3", 2);
		
		private int ID;
		private String name;
		
		private CarapaceType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String getName() {
			return name;
		}
		
		@Override
		public String toString() {
			return getName();
		}
	}
	
	
	public static enum CoordinateType implements IStringSerializable {
		CHAR("char", 0),
		SHAKURAS("shakuras", 1);
		
		private int ID;
		private String name;
		
		private CoordinateType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String getName() {
			return name;
		}
		
		@Override
		public String toString() {
			return getName();
		}
	}
	
	public static enum CreditType implements IStringSerializable {
		BRONZE("bronze", 0),
		SILVER("silver", 1),
		GOLD("gold", 2),
		PLATINUM("platinum", 3);
		
		private int ID;
		private String name;
		
		private CreditType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String getName() {
			return name;
		}
		
		@Override
		public String toString() {
			return getName();
		}
	}
	
	
	public static enum CrystalType implements IStringSerializable {
		KHAYDARIN("khaydarin", 0),
		BLOODSHARD("bloodshard", 1),
		URAJ("uraj", 2);
		
		private int ID;
		private String name;
		
		private CrystalType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String getName() {
			return name;
		}
		
		@Override
		public String toString() {
			return getName();
		}
	}
	
	
	public static enum DustType implements IStringSerializable {
		STEEL("steel", 0),
		IRON("iron", 1),
		CARBON("carbon", 2);
		
		private int ID;
		private String name;
		
		private DustType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String getName() {
			return name;
		}
		
		@Override
		public String toString() {
			return getName();
		}
	}
	
	public static enum EnergyType implements IStringSerializable {
		PURE("pure", 0),
		CORRUPTED("corrupted", 1),
		VOID("void", 2);
		
		private int ID;
		private String name;
		
		private EnergyType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String getName() {
			return name;
		}
		
		@Override
		public String toString() {
			return getName();
		}
	}
	
	
	public static enum EssenceType implements IStringSerializable {
		PROTOSS("protoss", 0),
		TERRAN("terran", 1),
		ZERG("zerg", 2);
		
		private int ID;
		private String name;
		
		private EssenceType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String getName() {
			return name;
		}
		
		@Override
		public String toString() {
			return getName();
		}
	}
	
	
	public static enum FocuserType implements IStringSerializable {
		AIUR("aiur", 0),
		DARK("dark", 1);
		
		private int ID;
		private String name;
		
		private FocuserType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String getName() {
			return name;
		}
		
		@Override
		public String toString() {
			return getName();
		}
	}
	
	
	public static enum IngotType implements IStringSerializable {
		COPPER("copper", 0),
		TITANIUM("titanium", 1),
		STEEL("steel", 2);
		
		private int ID;
		private String name;
		
		private IngotType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String getName() {
			return name;
		}
		
		@Override
		public String toString() {
			return getName();
		}
	}
	
	public static enum MineralType implements IStringSerializable {
		BLUE("blue", 0),
		RICH("rich", 1);
		
		private int ID;
		private String name;
		
		private MineralType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String getName() {
			return name;
		}
		
		@Override
		public String toString() {
			return getName();
		}
	}
	
	
	public static enum MutaliskWingType implements IStringSerializable {
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
		
		private MutaliskWingType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String getName() {
			return name;
		}
		
		@Override
		public String toString() {
			return getName();
		}
	}
	
	
	public static enum ProtossArmorPiecesType implements IStringSerializable {
		KHAYDARIN_NODES("knodes", 0),
		WRIST_MOUNTS("wmounts", 1),
		ARCH("arch", 2),
		GUARD("guard", 3),
		DARK_KHAYDARIN_NODES("dark_knodes", 4),
		DARK_WRIST_MOUNTS("dark_wmounts", 5),
		DARK_ARCH("dark_arch", 6),
		DARK_GUARD("dark_guard", 7);
		
		private int ID;
		private String name;
		
		private ProtossArmorPiecesType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String getName() {
			return name;
		}
		
		@Override
		public String toString() {
			return getName();
		}
	}
	
	public static enum ProtossIngotType implements IStringSerializable {
		KHALAI("khalai", 0),
		DARK("dark", 1);
		
		private int ID;
		private String name;
		
		private ProtossIngotType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String getName() {
			return name;
		}
		
		@Override
		public String toString() {
			return getName();
		}
	}
	
	public static enum VespeneType implements IStringSerializable {
		RAW("raw", 0),
		PROTOSS("protoss", 1),
		TERRAN("terran", 2),
		ZERG("zerg", 3);
		
		private int ID;
		private String name;
		
		private VespeneType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String getName() {
			return name;
		}
		
		@Override
		public String toString() {
			return getName();
		}
	}
}