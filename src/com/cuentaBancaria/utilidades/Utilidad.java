package com.cuentaBancaria.utilidades;

public class Utilidad {
    public static Long createISBN(){
        String uuid = java.util.UUID.randomUUID().toString()
                .replaceAll("[^0-9]","");

        return Long.valueOf(uuid.substring(0,22));
    }
}
