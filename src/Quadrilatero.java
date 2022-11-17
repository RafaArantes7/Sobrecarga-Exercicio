public class Quadrilatero {
    public static void area(double lado) {

        System.out.println("Area do quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {

        System.out.println("Área do retangulo: " + lado1 * lado2);

    }

    public static void area(double baseMenor, double baseMaior, double altura) {
        System.out.println("Área do trapézio: " + (baseMenor * baseMaior) * altura / 2);

    }

}

/*
 * percebe-se que manteve o nome do método, porem mudou a lista de parametros. A
 * primeira assinatura é 1 é um nome e 1 parametro, segunda assinatura 1 nome e
 * 2 parametros,
 * terceira assinatura 1 nome e 3 parametros
 */
