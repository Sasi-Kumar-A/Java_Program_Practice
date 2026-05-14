package OOPS;

public class CMObjGen {
	public static void main(String args[]) {
		CM cm1 = CM.getCM("Stalin","04-06-2026");
		CM cm2 = CM.getCM("Yadapadi","04-06-2026");
		CM cm3 = CM.getCM("Seeman","04-06-2026");
		
		
		cm2.getdetails();
	}
}
