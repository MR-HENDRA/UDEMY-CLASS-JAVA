public class TipeDataNonPrimitif {
    public static void main(String[] args) {
        // Tipe data bukan primitif selalu memiliki default value dan bisa bernilai null
        // bisa memiliki method/function

        // Tipe Data Primitif || Tipe Data Non-Primitif
        // byte || Byte
        // short || Short
        // int || Integer
        // long || Long
        // float || Float
        // double || Double
        // char || Character
        // boolean || Boolean

        Integer ini_Integer = 100;
        Long ini_Long = 10000L;
        System.out.println(ini_Integer);
        System.out.println(ini_Long);

        Byte ini_Byte = null;
        System.out.println(ini_Byte);

        ini_Byte = 100;
        System.out.println(ini_Byte);

        int ini_int = 100;

        Integer ini_object = ini_int; // konversi dari type data primitif ke bukan primitif
        System.out.println(ini_object);

        short iniShort = ini_object.shortValue(); // konversi dari non-primitif ke primitif menggunakan function
        long iniLong = ini_object.longValue();
        float iniFloat = ini_object.floatValue();

        System.out.println(iniShort);
        System.out.println(iniLong);
        System.out.println(iniFloat);

    }
}
