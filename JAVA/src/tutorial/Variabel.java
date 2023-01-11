public class Variabel {
    public static void main(String[] args) {
        String name; // secara tidak langsung
        name = "Usman Hendra";
        System.out.println(name);

        String name2 = "Usman Hendra"; // secara langsung
        System.out.println(name2);

        int age = 19;
        System.out.println(age);

        String address = "Pangale";
        System.out.println(address);

        // mengubah value variabel
        // data bebas diubah selama tipe datanya sama
        name = "Hendra Usman";
        System.out.println(name);
        name2 = "Hendra Usman";
        System.out.println(name2);

        // menggunakan kata kunci var
        // tapi variabel harus langsung diisi

        var name3 = "Hendra Usman";
        System.out.println(name3);

        // var name4; // ERROR ! Karena nilai variabel tidak langsung diisi
        // name4 = "Hendra Usman";
        // System.out.println(name4);

        var age2 = 19;
        System.out.println(age2);

        // menggunakan kata kunci final
        // constant = nilai variabel tidak dapat diubah setelah data di set.

        final String address2 = "Pangale";
        System.out.println(address2);

        // address2 = "Mamuju Tengah"; // ERROR ! Karena variabel address sudah diset
        // dengan kata kynci final
        // System.out.println(address2);

    }
}