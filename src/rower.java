/* Zaprojektuj rower. Niech ma obiekt kierownica, pedały, łańcuch i koła. Obiekt koło niech dziedziczy po klasie ogólnej,
a w swoich szczególnych interpretacjach niech różni się tym, czym w rzeczywistości różni się koło przednie od tylnego.
Zakładamy, że pedały są takie same.
*/
public class rower {
    public static void main(String[] args) {
         //z czego składa się rower? rower składa się z części. rower jest programem, części są obiektami.
        części kierownica = new części("2kg", 1, "kieruje rowerem", );
        części pedal_lewy = new części("275dag", 1, "pedałuje", false );
        części pedal_prawy = new części("275dag", 1, "pedałuje", true );
        części lancuch = new części("108dag", 1, "napędza koło");
        części kolo_przednie = new części("1,8kg", 1, "skręca", null, true);
        części kolo_tylne = new części("2,3kg",1,"rozpędza rower", null, false);

        System.out.println("rower składa się z: ");

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
