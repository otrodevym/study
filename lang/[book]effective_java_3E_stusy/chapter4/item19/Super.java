public class Super {
    public class Super {
        // 잘못 된 예 - 생성자가 재정의 가능 메서드를 호출한다.
        public Super() {
            overrideMe();
        }

        public void overrideMe() {
        }
    }
}
