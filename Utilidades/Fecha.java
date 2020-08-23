package Utilidades;

import java.util.Date;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    private int hora;
    private int minuto;
    private int segundo;

    public Fecha(int dia, int mes, int anio, int hora, int minuto){
        this.setDia(dia);
        this.setMes(mes);
        this.setAnio(anio);
        this.setHora(hora);
        this.setMinuto(minuto);
        this.setSegundo(segundo);
    }

    public Fecha(int dia, int mes, int anio){
        this.setDia(dia);
        this.setMes(mes);
        this.setAnio(anio);        
    }

    public Fecha(int hora, int minuto){
        this.setHora(hora);
        this.setMinuto(minuto);
    }

    public Fecha(){
        /*Constructor Vacio*/
    }

    /*Métodos*/
    public String obtenerFechaHoy(){
        Date fecha = new Date();
        return fecha.toString();
    }

     /*Getters and Setters*/
    public int getDia() {
        return dia;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(final int segundo) {
        this.segundo = segundo;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(final int minuto) {
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(final int hora) {
        this.hora = hora;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(final int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(final int mes) {
        this.mes = mes;
    }

    public void setDia(final int dia) {
        this.dia = dia;
    }
    
}