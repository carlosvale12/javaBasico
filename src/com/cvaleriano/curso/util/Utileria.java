package com.cvaleriano.curso.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author cvaleriano
 *
 */
public class Utileria {

    DateFormat formatter;
    Timestamp fechaTime;

	private final String PATTERN_FECHA_DIA_MES_ANIO = "dd/MM/yyyy";
    private final String PATTERN_FECHA_DIA_MES_ANIO_HORA_MINUTO_SEGUNDO = "yyyy-MM-dd HH:mm:ss";

    /**
     * 
     */
    public Utileria() {

    }

    /**
     * 
     * @param fechaHoraInicio
     * @return
     */
    public Timestamp fechaStringToTimestamp(String fechaHoraInicio) {
            System.out.println("Fecha llegada: " + fechaHoraInicio);
            try {
                    formatter = new SimpleDateFormat(PATTERN_FECHA_DIA_MES_ANIO);
                    Date fecha = formatter.parse(fechaHoraInicio);
                    fechaTime = new Timestamp(fecha.getTime());
            } catch (ParseException e) {
                    System.out.println(e.getMessage());

            }
            System.out.println(fechaTime.toString());
            return fechaTime;
    }

    
}