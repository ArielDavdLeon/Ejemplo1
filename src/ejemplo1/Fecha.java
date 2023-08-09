package ejemplo1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    

    public boolean esBisiesto() {
       return (this.anio % 4 == 0 && (this.anio % 100 != 0 || this.anio % 400 == 0));
    }
 
    public int calcularAniosPasados(Fecha fecha2) {
        int anios = fecha2.getAnio() - this.anio;
        if (fecha2.getMes() < this.mes || (fecha2.getMes() == this.mes && fecha2.getDia() < this.dia)) {
            anios--;
        }
        return anios;
    }
}
