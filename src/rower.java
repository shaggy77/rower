/* Zaprojektuj rower. Niech ma obiekt kierownica, pedały, łańcuch i koła. Obiekt koło niech dziedziczy po klasie ogólnej,
a w swoich szczególnych interpretacjach niech różni się tym, czym w rzeczywistości różni się koło przednie od tylnego.
Zakładamy, że pedały są takie same.
*/
public class rower {
    public static void main(String[] args) {
         //z czego składa się rower? rower składa się z części. rower jest programem, części są obiektami.
        części kierownica = new części();
        części pedal_lewy = new części();
        części pedal_prawy = new części();
        części lancuch = new części();
        części kolo_przednie = new części();
        części kolo_tylne = new części();

        System.out.println("rower składa się z: ");

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
