public class GeneradorMapas {
    public static String[][] generarMapa (int n) {
        String[][] mapa = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    mapa[i][j] = "#";
                } else {
                    mapa[i][j] = "X";
                }
            }

        }
        return  mapa;
    }
    public static void imprimirLeyenda(){
        System.out.println("\n # → Borde del mapa (no accesible)\n  X → Suelo del mapa (accesible)");
    }
}
