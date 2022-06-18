public class Main {
    public static void main (String[] args){

        //* Primera parte - Paso de datos*/
        int result = params(10,10,10);

        //* Segunda parte - incremento de puertas*/
        Coche miCoche = new Coche();
        miCoche.incrementar();
        System.out.println(miCoche.puertas);
    }

    //* Creación de función que suma parametros */
    public static int params(int a, int b, int c) {
        return a + b + c;
    }
}

//*Creación de clase Coche */
class Coche {
    public int puertas = 4;

    public void incrementar () {
        this.puertas++;
    }
}
