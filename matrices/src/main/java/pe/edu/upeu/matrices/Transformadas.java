package pe.edu.upeu.matrices;

public class Transformadas {
    public void imprimirCadena(String[][] matriz) {
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                if (matriz[f][c] != null && !matriz[f][c].equals("")) {
                    System.out.print(matriz[f][c] + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
    }

    public void transformada06(int dimen, int numInit) {
        String[][] matriz = new String[dimen][dimen];// i = Fila; j=Columna
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][j] = "" + numInit;
                numInit++;
            }
        }
        extracted(matriz);
    }

    public void transformada07(int dimen, int numInit) {
        String[][] matriz = new String[dimen][dimen];
        for (int i = 0; i < dimen; i++) {
            for (int j = 0; j < (dimen - i); j++) {
                matriz[i][j] = "" + numInit;
                numInit++;
            }
        }
        extracted(matriz);
    }

    public void transformada08(int dimen, int numInit) {
        String[][] matriz = new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= (dimen - 1) - i; j++) {
                matriz[i][(j + i)] = " " + numInit;
                numInit++;
            }
        }
        extracted(matriz);
    }

    public void transformada09(int dimen, int numInit) {
        String[][] matriz = new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][((dimen - 1) - i) + j] = " " + numInit;
                numInit++;
            }
        }
        extracted(matriz);

    }

    public void transformada14(int dimen, int valInit) {
        String[][] matriz = new String[dimen][dimen];// i =filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[j][i] = "" + valInit;
                valInit++;
            }
        }
        extracted(matriz);
    }

    public void transformada18(int dimen, int valInit) {
        String[][] matriz = new String[dimen][dimen];// i =filas, j=columnas
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i <= j; i++) {
                matriz[i][(dimen - 1) - j] = "" + valInit;
                valInit++;
            }
        }
        extracted(matriz);
    }

    public void transformada13(int dimen, int valInit) {
        String[][] matriz = new String[dimen][dimen];// i =filas, j=columnas
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i <= (dimen - 1) - j; i++) {
                matriz[i][j] = "" + valInit;
                valInit++;
            }
        }
        extracted(matriz);
    }

    public void transformada17(int dimen, int valInit) {
        String[][] matriz = new String[dimen][dimen];// i =filas, j=columnas
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j <= (dimen - 1) - i; j++) {
                matriz[j][(dimen - 1) - i] = "" + valInit;
                valInit++;
            }
        }
        extracted(matriz);
    }

    public void transformada21(int dimen, int valInit) {
        String[][] matriz = new String[dimen][dimen];// i =filas, j=columnas
        for (int j = 0; j < matriz[0].length; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < matriz.length; i++) {
                    matriz[i][j] = "" + valInit;
                    valInit++;
                }
            } else {
                for (int i = matriz.length - 1; i >= 0; i--) {
                    matriz[i][j] = "" + valInit;
                    valInit++;
                }
            }
        }
        extracted(matriz);
    }

    private void extracted(String[][] matriz) {
        imprimirCadena(matriz);
    }

    public static void main(String[] args) {

        Transformadas Rmq = new Transformadas();
        System.out.println("Ejercicio N° 6");
        Rmq.transformada06(5, 0);
        System.out.println("Ejercicio N° 7");
        Rmq.transformada07(5, 0);
        System.out.println("Ejercicio N° 8");
        Rmq.transformada08(5, 0);
        System.out.println("Ejercicio N° 9");
        Rmq.transformada09(5, 0);
        System.out.println("Ejercicio N° 10");
        Rmq.transformada09(5, 0);
        System.out.println("Ejercicio N° 14");
        Rmq.transformada09(5, 0);
        System.out.println("Ejercicio N° 18");
        Rmq.transformada09(5, 0);
        System.out.println("Ejercicio N° 13");
        Rmq.transformada09(5, 0);
        System.out.println("Ejercicio N° 17");
        Rmq.transformada09(5, 0);
        System.out.println("Ejercicio N° 21");
        Rmq.transformada09(5, 0);

    }

}