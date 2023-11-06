package javae;

public class CuadradoMagicoEsoterico101 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static String diabolicOrEsoteric(int array[][]) {
        String s = "NO";

        boolean next = true;

        if (array.length > 1 || array.length <= 1024) {
            int CM = 0;
            int CM2 = 0;
            int sumaEsquinas = 0;

            for (int columnas = 0; columnas < array[0].length; columnas++) {
                CM += array[0][columnas];
            } for (int filas = 1; filas < array.length; filas++) {
                int sumaFila = 0;

                for (int columnas = 0; columnas < array[0].length; columnas++) {
                    sumaFila += array[filas][columnas];
                } if (sumaFila != CM) {
                    next = false;
                    break;
                }
            } if (next) {
                for (int columnas = 0; columnas < array[0].length; columnas++) {
                    int sumaColumna = 0;

                    for (int filas = 0; filas < array.length; filas++) {
                        sumaColumna += array[filas][columnas];
                    } if (sumaColumna != CM) {
                        next = false;
                        break;
                    }
                }
            } if (next) {
                int sumaDiagonal = 0;
                for (int pos = 0; pos < array.length; pos++) {
                    sumaDiagonal += array[pos][pos];
                } if (sumaDiagonal != CM) {
                    next = false;
                } if (next) {
                    sumaDiagonal = 0; // ! array[1][1] + array[0][2] + array[2][0]
                    int filas = 0, columnas = array[0].length - 1;
                    while (columnas >= 0) {
                        sumaDiagonal += array[filas][columnas];
                        filas++;
                        columnas--;
                    } if (sumaDiagonal != CM) {
                        next = false;
                    } else {
                        s = "DIABOLICO";
                    }
                }
            } // * Fin Diabolico

            if (next) { // ? Comprobacion de que no haya numeros mas grandes que el nmumero de casillas
                final int NUMERO_DE_CASILLAS = array.length * array.length;
                for (int filas = 0; filas < array.length; filas++) {
                    for (int columnas = 0; columnas < array[0].length; columnas++) {
                        if (array[filas][columnas] > NUMERO_DE_CASILLAS) {
                            next = false;
                            break;
                        }
                    } if (!next) {
                        break;
                    }
                }
            } if (next) { // ? Sacar CM2 y Comprobar que sea igual a la suma de las esquinas
                CM2 = (4 * CM) / array.length;

                sumaEsquinas = array[0][0] + array[array.length - 1][0] + array[0][array.length - 1] + array[array.length - 1][array.length - 1];

                if (CM2 != sumaEsquinas) {
                    next = false;
                }
            } if (next) { // ? Pat o Impar
                int mitad = array.length / 2;
                if (array.length % 2 == 0) { // ? Par
                    int centro = array[mitad][mitad] + array[mitad][mitad - 1] + array[mitad - 1][mitad] + array[mitad - 1][mitad - 1];

                    if (centro == CM2) {
                        int centroLados = array[0][mitad] + array[0][mitad - 1] + array[mitad][0] + array[mitad - 1][0] + array[array.length - 1][mitad] + array[array.length - 1][mitad - 1] + array[mitad][array.length - 1] + array[mitad - 1][array.length - 1];
                        if (centroLados == (CM2 * 2)) {
                            s = "ESOTERICO";
                        }
                    }
                } else { // ? Impar
                    int centro = array[mitad][mitad];

                    if ((centro * 4) == CM2) {
                        int centroLados = array[0][mitad] + array[mitad][0] + array[array.length - 1][mitad] + array[mitad][array.length - 1];
                        if (centroLados == CM2) {
                            s = "ESOTERICO";
                        }
                    }
                }
            }
        } return s;
    }

    public static void main(String[] args) {
        int numFilas;

        for (;;) {
            numFilas = sc.nextInt();

            if (numFilas == 0)
                break;

            int array[][] = new int[numFilas][numFilas];
            
            for (int filas = 0; filas < array.length; filas++) {
                for (int columnas = 0; columnas < array[0].length; columnas++) {
                    array[filas][columnas] = sc.nextInt();
                }
            }

            String s = diabolicOrEsoteric(array);

            System.out.println(s);
        }
    }
}
