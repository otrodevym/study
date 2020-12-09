public class Item10 {

//     명시적으로 null 검사 할 필요다 없다.
    @Override
//    public boolean equals(Item10 obj) {
    public boolean equals(Object obj) {
//        if( obj == null) {
//            return false;
//        }
        if(!(obj instanceof Item10))
            return false;
        Item10 item = (Item10) obj;



        return true;
    }

    public static void main(String[] args) {

    }

}
