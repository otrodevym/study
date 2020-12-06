public enum Elvis {
   // 세번째 생성 방법
   INSTANCE;
   // public class Elvis {
   // // 첫번째 생성 방법
   // public static final Elvis INSTANCE = new Elvis();

   // // 두번째 생성 방법
   // public static Elvis getInstance() {
   // return INSTANCE;
   // }

   // private Elvis() {

   // }

   // private String test;

   // private void test() {
   // }

   // public void leaveTheBuilding() {
   // }

   public static void main(String[] args) {
      Elvis e = new Elvis();
      // Field f = e.getClass().getDeclaredField("test");
      // f.setAccessible(true);
      // System.out.println("f : " + f.get(e));
      Method m = e.getClass().getDeclaredMethod("test");
      m.setAccessible(true);
      System.out.println("m : " + m.invoke(e, (Object[]) null));
   }

}
