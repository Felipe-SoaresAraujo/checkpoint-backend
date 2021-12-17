package br.com.enderecopaciente.endereco.util;

import java.sql.Timestamp;
import java.util.Date;


public class UtilDate {

    public static Timestamp dateToTimestampo(Date date){
        Timestamp timestamp = new Timestamp(date.getTime());
        return timestamp;

    }
}
