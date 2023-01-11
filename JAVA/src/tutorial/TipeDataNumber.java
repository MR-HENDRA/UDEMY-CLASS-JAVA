public class TipeDataNumber {
    public static void main(String[] args) {
        // Integer Number
        // - byte : -127 s/d 127 (1 byte)
        // - short : -32,768 s/d 32,767 (2 bytes)
        // - int : -2,147,483,368 s/d 2,147,483,367 (4 bytes)
        // - long : -9,223,372,036,854,775,808 s/d 9,223,372,036,854,775,807 (8 bytes)

        byte ini_byte = 100;
        short  ini_short = 1000;
        int ini_int = 10000000;
        long ini_long = 100000000;
        long ini_long2 = 100000000L;
        // untuk memudahkan penulisan kita dapat menggunakan underscore pada angka yang besar
        // contoh = 1_000_000_000

        System.out.println(ini_byte);
        System.out.println(ini_short);
        System.out.println(ini_int);
        System.out.println(ini_long);
        System.out.println(ini_long2);

        // Floating Point Number
        // - float : -3.4e-038 s/d 3.4e+038 (4 byte)
        // - Double : -1.7e-308 s/d 1.7e+308 (8 bytes)
        float ini_float = 10.10f;
        double ini_double = 10.10;

        System.out.println(ini_float);
        System.out.println(ini_double);

        // Literals Number
        // - Decimal : 
        // - Binary : diawali dengan 0b
        // - Hexadecimal : diawali dengan 0x

        int ini_decimalInt = 35;
        int ini_binaryInt = 0b10101010;
        int ini_hexadecimalInt = 0xFFFFFF;

        System.out.println(ini_decimalInt);
        System.out.println(ini_binaryInt);
        System.out.println(ini_hexadecimalInt);
    }

}
