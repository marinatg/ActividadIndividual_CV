/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author javier
 */
public class Triangulo implements FiguraGeometrica
{
     /*Atributo de tipo double, que contiene el valor de la base del triángulo*/
    private double base;
    /*Atributo de tipo double, que contiene el valor de la altura del triángulo*/
    private double altura;
     /*Atributo de tipo double, que contiene el valor del area del triángulo*/
    private double areaTriangulo;
    

    public Triangulo(double base, double altura) 
    {
        this.base = base;
        this.altura = altura;
    }
    /**
     * Este método se usa para obtener la base
     * @return base: devuelve la base del triángulo
     */
    public double getBase() 
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }
    /**
     * Este método se usa para obtener la altura
     * @return altura: devuelve la altura del triángulo
     */
    public double getAltura() 
    {
        return altura;
    }

    public void setAltura(double altura) 
    {
        this.altura = altura;
    }
    /**
     * Este método se usa para obtener el area
     * @return area: devuelve el area del triángulo
     */
    public double getareaTriangulo() 
    {
        return areaTriangulo;
    }

    @Override
    public void area() 
    {
        areaTriangulo = base * altura / 2;
    }    
    
}