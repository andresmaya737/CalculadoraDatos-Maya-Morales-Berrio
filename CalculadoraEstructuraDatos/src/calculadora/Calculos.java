package calculadora;

import java.util.ArrayList;

public class Calculos {

    //variables
    ArrayList<String> vectorCadena = new ArrayList<>();
    private double num1;
    private double num2;
    private double resultadoOperacion;
   
    
    //separa numeros de operadores y los añade a un ArrayList
    public ArrayList<String> definirVector(String cadena) {
        String num = "";
        char[] v = cadena.toCharArray();
        boolean a = false;
        ArrayList<String> vectorAEnviar = new ArrayList<>();
        int i = 0;
        while (i < v.length) {
            a = false;
            num = "";
            int j = i;
            while (j < v.length && v[j] != '*' && v[j] != '/' && v[j] != '+' && v[j] != '_') {
                  num += v[j] ;
                  a  = true;
                  j++;
            }
            i = j;
            if (a == true) {
                vectorAEnviar.add(num);
                a = false;
            } else {
                vectorAEnviar.add(String.valueOf(v[i]));
                i++;
            }
        }
        vectorCadena = vectorAEnviar;
        return vectorCadena;
    }
    

   
   

public double definirPrioridad(String cadena) {
        vectorCadena = definirVector(cadena);

        while (vectorCadena.size() != 1) {
            
            if (vectorCadena.contains("*")) {
                int posOperador = vectorCadena.indexOf("*");
                num1 = Double.valueOf(vectorCadena.get(posOperador - 1));
                num2 = Double.valueOf(vectorCadena.get(posOperador + 1));
                resultadoOperacion = num1 * num2;
                vectorCadena.set(posOperador, String.valueOf(resultadoOperacion));
                vectorCadena.remove(posOperador - 1);
                vectorCadena.remove(posOperador);

            } else 
                if (vectorCadena.contains("/")) {
                int posOperador = vectorCadena.indexOf("/");
                num1 = Double.valueOf(vectorCadena.get(posOperador - 1));
                num2 = Double.valueOf(vectorCadena.get(posOperador + 1));
                resultadoOperacion = num1 / num2;
                vectorCadena.set(posOperador, String.valueOf(resultadoOperacion));
                vectorCadena.remove(posOperador - 1);
                vectorCadena.remove(posOperador);

            }   
            else if (vectorCadena.contains("+")) {
                int posOperador = vectorCadena.indexOf("+");
                num1 = Double.valueOf(vectorCadena.get(posOperador - 1));
                num2 = Double.valueOf(vectorCadena.get(posOperador + 1));
                resultadoOperacion = num1 + num2;
                vectorCadena.set(posOperador, String.valueOf(resultadoOperacion));
                vectorCadena.remove(posOperador - 1);
                vectorCadena.remove(posOperador);

            } 
            else if (vectorCadena.contains("_")) {
                int posOperador = vectorCadena.indexOf("_");
                num1 = Double.valueOf(vectorCadena.get(posOperador - 1));
                num2 = Double.valueOf(vectorCadena.get(posOperador + 1));
                resultadoOperacion = num1 - num2;
                vectorCadena.set(posOperador, String.valueOf(resultadoOperacion));
                vectorCadena.remove(posOperador - 1);
                vectorCadena.remove(posOperador);
            }
        }

        return resultadoOperacion;

    }
}

   