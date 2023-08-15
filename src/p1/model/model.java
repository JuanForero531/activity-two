package p1.model;

import java.util.Stack;

// Clase Modelo
public class model {

    public int evaluarNotacionPolacaInversa(String expresion) {
        Stack<Integer> pila = new Stack<>();

        // Dividir la cadena de entrada en tokens separados por espacios
        String[] tokens = expresion.split(" ");

        for (String token : tokens) {
            if (esNumero(token)) {
                // Si el token es un número, apílalo en la pila
                pila.push(Integer.parseInt(token));
            } else {
                // Si el token es un operador, desapila los dos números más recientes,
                // realiza la operación y apila el resultado nuevamente en la pila.
                int num2 = pila.pop();
                int num1 = pila.pop();

                int resultado = realizarOperacion(token, num1, num2);
                pila.push(resultado);
            }
        }

        // Al finalizar, el resultado estará en la parte superior de la pila
        return pila.pop();
    }

    private boolean esNumero(String token) {
        // Verificar si un token es un número
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private int realizarOperacion(String operador, int num1, int num2) {
        // Realizar la operación correspondiente al operador
        switch (operador) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Operador inválido: " + operador);
        }
    }
}

