/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *Clase donde se definen las propiedades y los métodos para calcular el area del cuadrado
 * @author javier
 */
public class Cuadrado implements FiguraGeometrica
{
    /*
    Atributos de tipo double que contienen el valor del lado y el area del cuadrado.
    */
    private double lado;
    private double areaCuadrado;
    /**
     * Método consultor del atributo lado
     * @return lado del cuadrado
     */
    public Cuadrado(double lado) 
    {
        this.lado = lado;
    }
    
    public double getLado() 
    {
        return lado;
    }
    /**
     * Método modificador del atributo lado
     * @param lado 
     */
    public void setLado(double lado) 
    {
        this.lado = lado;
    }
    /**
     * Este método se usa para obtener el area
     * @return area: devuelve el area del triángulo
     */
    public double getareaCuadrado() 
    {
        return areaCuadrado;
    }    
    
    @Override
    public void area() 
    {
        areaCuadrado = lado * lado;
    }    
}