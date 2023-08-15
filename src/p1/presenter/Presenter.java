package p1.presenter;

import p1.model.model;
import p1.view.View;

/**
 *
 * @author forer
 */
public class Presenter {
    private model modelo;
    private View vista;

    public Presenter(model modelo, View vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void evaluarExpresion(String expresion) {
        int resultado = modelo.evaluarNotacionPolacaInversa(expresion);
        vista.mostrarResultado(resultado);
        
    }
    
    
    public static void main(String[] args) {
        // Crear instancias del modelo, vista y presentador
        model modelo = new model();
        View vista = new View();
        Presenter presentador = new Presenter(modelo, vista);

        // Evaluar las expresiones de ejemplo
        presentador.evaluarExpresion("3 4 +");  // Salida: 7
        presentador.evaluarExpresion("5 2 4 * +");  // Salida: 13
        presentador.evaluarExpresion("10 6 9 3 / * +");  // Salida: 28
    }
}