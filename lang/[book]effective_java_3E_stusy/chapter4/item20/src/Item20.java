import java.applet.AudioClip;
import java.util.AbstractList;
import java.util.List;
import java.util.Objects;

public class Item20 {
    interface Singer {
        AudioClip sing(String s);
    }

    interface Songwriter {
        String compose(int chartPosition);
    }

    interface SingerSongwriter extends Singer, Songwriter {
        AudioClip strum();
        void actSensitive();
    }

    static List<Integer> intArrayAsList(int[] a) {
        Objects.requireNonNull(a);
        // 다이아몬드 연산자를 이렇게 사용하는건 자바 9부터 가능하다.
        // 더 낮은 버전을 사용한다면 <Integer>로 수정하자.
        return new AbstractList<Integer>() {
            @Override
            public Integer get(int index) {
                return a[index]; // 오토박싱(아이템 6)
            }

            @Override
            public int size() {
                return a.length;
            }

            @Override
            public Integer set(int index, Integer element) {
                int oldVal = a[index];
                a[index] = element; // 오토언박싱
                return oldVal; // 오토박싱
            }
        };
    }
}
