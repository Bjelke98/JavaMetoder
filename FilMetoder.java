public class FilMetoder {
    public static void main(String[] args) throws Exception{
        String[] linjer = hentFraFil("eksempel.txt");
        for (String linje : linjer)
            System.out.println(linje.charAt(0));

    }

    public static String[] hentFraFil(String filnavn) throws Exception{
        File fil = new File(filnavn);
        int linjer = 0;
        Scanner leser;
        String[] linjeliste;
        leser = new Scanner(fil);
        while (leser.hasNext()){
            leser.nextLine();
            linjer++;
        }
        leser.close();
        leser = new Scanner(fil);
        linjeliste = new String[linjer];
        for (int i = 0; i < linjer; i++) {
            linjeliste[i] = leser.nextLine();
        }
        leser.close();
        return linjeliste;
    }

}
