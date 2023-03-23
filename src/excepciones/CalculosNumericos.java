package excepciones;

import java.awt.geom.Point2D;

public class CalculosNumericos {
    public static double calcularRaizCuadrada(double numero) throws ArithmeticException {
        if (numero < 0){
            throw new ArithmeticException("Para calcular la raíz cuadrada el número ingresado debe ser positivo.");
        }
        return Math.sqrt(numero);
    }

    public static double calcularPendienteRecta(double x1, double x2, double y1, double y2) throws ArithmeticException {
        if (x2-x1 == 0){
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return (y2-y1)/(x2-x1);

    }

    public static Point2D.Double calcularPuntoMedioRecta(double x1, double x2, double y1, double y2) throws ArithmeticException {
        double puntoMedioX = (x1+x2)/2;
        double puntoMedioY = (y1+y2)/2;
        if(x1 == x2 && y1 == y2){
            throw new ArithmeticException("No se puede calcular el punto medio");
        }
        return new Point2D.Double(puntoMedioX, puntoMedioY);
    }

    public static double [] calculoRaicesEcuacionCuadratica(double a, double b, double c) throws ArithmeticException {
        //x = (-b ± sqrt(b^2 - 4ac)) / 2a
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            // Complex roots
            throw new ArithmeticException("La ecuación cuadrática tiene raíces complejas.");
        }

        double sqrt_discriminant = Math.sqrt(discriminant);

        double root1 = (-b + sqrt_discriminant) / (2 * a);
        double root2 = (-b - sqrt_discriminant) / (2 * a);

        return new double[] {root1, root2};
    }

    public static String cambiarBase(int num, int base) throws ArithmeticException {
        if (num < 0 || base <= 1) {
            throw new ArithmeticException("El número no se puede convertir a la base especificada.");
        }

        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            int rem = num % base;
            sb.append(rem);
            num = num / base;
        }

        return sb.reverse().toString();
    }
}
