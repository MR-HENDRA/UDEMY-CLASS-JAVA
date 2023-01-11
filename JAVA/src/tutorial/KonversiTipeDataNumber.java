public class KonversiTipeDataNumber {
    public static void main(String[] args) {
        // Widening Casting (Otomatis) : byte -> short -> int -> long -> float -> double
        // Narrowing Casting (Manual) : double -> float -> long -> long -> short -> int

        byte ini_byte = 10;
        short ini_short = ini_byte;
        int ini_int = ini_short;

        System.out.println(ini_byte); // otomatis
        System.out.println(ini_short);
        System.out.println(ini_int);

        byte ini_byte2 = (byte) ini_int; // manual
        System.out.println(ini_byte2);   
    }
}
