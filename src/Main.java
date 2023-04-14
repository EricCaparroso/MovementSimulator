public class Main {

        public static void main(String[] args) {
            String[][] mapa = GeneradorMapas.generarMapa(20);
            for (int i = 0; i < mapa.length; i++) {
                for (int j = 0; j < mapa[i].length; j++) {
                    System.out.print(mapa[i][j] + " ");
                }
                System.out.println();
            }
        }


    }
