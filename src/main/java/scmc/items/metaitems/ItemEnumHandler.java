package scmc.items.metaitems;


import net.minecraft.util.IStringSerializable;


public class ItemEnumHandler {

	public static enum MineralType implements IStringSerializable {
		BLUE("blue", 0),
		RICH("rich", 1);
		
		private int ID;
		private String name;
		
		private MineralType(String name, int ID) {
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
	
	
	public static enum IngotType implements IStringSerializable {
		COPPER("copper", 0),
		ALIEN("alien", 1),
		ALIENDARK("aliendark", 2),
		TITANIUM("titanium", 3),
		STEEL("steel", 4);
		
		private int ID;
		private String name;
		
		private IngotType(String name, int ID) {
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
	
	public static enum CoordinateType implements IStringSerializable {
		CHAR("char", 0),
		SHAKURAS("shakuras", 1);
		
		private int ID;
		private String name;
		
		private CoordinateType(String name, int ID) {
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
	
	
	public static enum FocuserType implements IStringSerializable {
		AIUR("aiur", 0),
		DARK("dark", 1);
		
		private int ID;
		private String name;
		
		private FocuserType(String name, int ID) {
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
	
	
	public static enum BulletType implements IStringSerializable {
		C14("c14", 0);
		
		private int ID;
		private String name;
		
		private BulletType(String name, int ID) {
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