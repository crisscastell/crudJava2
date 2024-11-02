public class Validador {
    public static int validarNumeros(int num) throws NumeroInvalidoException {
        if (num<=0 || num >=8) {
            throw new NumeroInvalidoException("El numero debe ser del 1 al 7");
        }
        return num;
    }

    public static String validarLetras(String str) throws IllegalArgumentException {
        if (!str.matches("[a-zA-Z]+")){
            throw new IllegalArgumentException("Debe contener sólo letras");
        }
        return str;
    }

    public static int validarNumeroActualizar(int num) throws NumeroActualizarInvalido {
        if (num<=0 || num >=6) {
            throw new NumeroInvalidoException("El numero debe ser del 1 al 5");
        }
        return num;
    }

    public static int validarNumeroEntero(int num) throws NumeroEnteroException {
        if (num<=0) {
            throw new NumeroInvalidoException("El numero debe ser entero positivo");
        }
        return num;
    }
}
