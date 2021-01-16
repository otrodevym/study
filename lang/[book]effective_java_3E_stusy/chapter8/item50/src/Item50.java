import java.util.Date;

/**
 * Project : item50
 * Create by IntelliJ IDEA
 * User: hwesd
 * Date: 2021/1/12/0012
 * Time: 오후 10:04:32
 */
public class Item50 {
    static class Period {
        private final Date start;
        private final Date end;

        /**
         * @param start 시작 시간
         * @param end 종료시각. 시작 시각보다 뒤여야 한다.
         * @throws IllegalArgumentException 시작 시각이 종료 시각보다 늦을 때 발생한다.
         * @throws NullPointerException start나 end가 null이면 발생한다.
         */
        public Period(Date start, Date end) {
            this.start = new Date(start.getTime());
            this.end = new Date(end.getTime());

            if (start.compareTo(end) > 0)
                throw new IllegalArgumentException(start + " after " + end);
//            this.start = start;
//            this.end = end;
        }

        public Date getStart() {
            return start;
        }

        public Date getEnd() {
            return end;
        }

        public Date start() {
            return new Date(start.getTime());
        }

        public Date end() {
            return new Date(end.getTime());
        }
    }
    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start, end);
//        end.setYear(78);
        p.end().setYear(78);
    }

}
