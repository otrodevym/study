import java.util.EnumSet;
import java.util.Set;

public class Item36 {
    // 비트 열거 상수 - 구닥다리 기법
    public static final int STYLE_BOLD = 1 << 0; // 1
    public static final int STYLE_ITALIC = 1 << 1; // 2
    public static final int STYLE_UNDERLINE = 1 << 2; // 4
    public static final int STYLE_STRIKETHROUGH = 1 << 3; // 8

    public void applyStyles(int styles) { }

    // 비트 필드를 대체하는 현대적 기법
    public enum Style {        BOLD, ITALIC, UNDERLINE, STRIKETHROUGH    }
    public void applyStyles(Set<Style> styles) { }

    public static void main(String[] args) {
        Item36 i = new Item36();
        i.applyStyles(STYLE_BOLD | STYLE_ITALIC);

        i.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
    }
}
