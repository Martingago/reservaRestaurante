
package com.utils;


import java.util.Calendar;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerNumberModel;

public class Utilidades {

    /**
     * Recibe un objeto modal y lo abre
     * @param modal 
     */
    public static void openModal(JDialog modal){
        modal.pack();
        modal.setVisible(true);
    }
    
    
    
    /**
     * Crea un formato de salida para un spinner
     *
     * @param spinner objeto spinner sobre el que se aplica el formato
     * @param cadena formato de salida
     */
    public static void crearSpinnerFormat(JSpinner spinner, String cadena) {
        Date date = new Date();
        SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        spinner.setModel(sm);
        JSpinner.DateEditor d = new JSpinner.DateEditor(spinner, cadena);
        spinner.setEditor(d);
    }

    /**
     * Establece los valores minimos y maximos para los spinners
     *
     * @param spinner objeto spinner
     * @param minValue valor minimo del spinner
     * @param maxValue valor máximo del spinner
     */
    public static void rangeValueInput(JSpinner spinner, int minValue, int maxValue) {
        SpinnerNumberModel sn = new SpinnerNumberModel(0, minValue, maxValue, 1);
        spinner.setModel(sn);
    }
    
    /**
     * Resetea y añade elementos seleccionables a un dropdown especifico
     * @param dropDown
     * @param datos 
     */
    public static void addDropDownItems(JComboBox dropDown, String[] datos) {
        dropDown.removeAllItems();
        for (String dato : datos) {
            dropDown.addItem(dato);
        }
    }

}
