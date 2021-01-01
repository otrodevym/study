public class Sample {
    @Item39 public static void m1() {} // 성공
    public static void m2() {}
    @Item39 public static void m3() { throw new RuntimeException("실패");} // 실패
    public static void m4() {}
    @Item39 public void m5() {} // 실패 : 잘못 사용
    public static void m6() {}
    @Item39 public static void m7() { throw new RuntimeException("실패"); } // 실패
    public static void m8() {}
}
