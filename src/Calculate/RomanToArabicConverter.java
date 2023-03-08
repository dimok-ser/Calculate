package Calculate;

public enum RomanToArabicConverter {
    I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9),  X(10), i(1), ii(2), iii(3), iv(4), v(5), vi(6), vii(7), viii(8), ix(9),  x(10), O(0), o(0);
    private final int value;

    private RomanToArabicConverter(int value){
        this.value = value;
    }
        public int toInt () {
        return value;
    }

}
