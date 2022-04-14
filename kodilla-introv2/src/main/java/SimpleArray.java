public class SimpleArray {
    public static void main(String[] args) {
        String[] rapAlbums = new String[5];
        rapAlbums[0] = "The Chronic";
        rapAlbums[1] = "Good kid, m.A.A.d city";
        rapAlbums[2] = "Get Rich Or Die Tryin'";
        rapAlbums[3] = "Victory Lap";
        rapAlbums[4] = "2014 Forest Hills Drive";

        String rapAlbum = rapAlbums[3];
        System.out.println(rapAlbum);

        int numberOfElements = rapAlbums.length;
        System.out.println("Tablica z albumami zawiera "+numberOfElements+" elementow.");


    }
}
