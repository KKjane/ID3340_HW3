/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class ComplexNumber {

    private double real;
    private double imag;

    public ComplexNumber() {
        this.real = 0;
        this.imag = 0;
    }

    public ComplexNumber(double r, double m) {
        this.real = r;
        this.imag = m;
    }

    public double getRealPart() {
        return real;
    }

    public double getImaginaryPart() {
        return imag;
    }

    public static ComplexNumber add(ComplexNumber s, ComplexNumber t) {
        double r = s.real + t.real;
        double m = s.imag + t.imag;
        return new ComplexNumber(r, m);
    }

    public static ComplexNumber substract(ComplexNumber s, ComplexNumber t) {
        double r = s.real - t.real;
        double m = s.imag - t.imag;
        return new ComplexNumber(r, m);
    }

    public static ComplexNumber multiple(ComplexNumber s, ComplexNumber t) {
        //(a + bi)(c + di) = (ac - bd) + (ad +bc)i
        double re = (s.real * t.real) - (s.imag * t.imag);
        double im = (s.real * t.imag) + (s.imag * t.real);
        return new ComplexNumber(re, im);
    }

    public double magnitude() {
        return Math.sqrt((real * real) + (imag * imag));
    }

    @Override
    public String toString() {
        return "(" + real + "+" + imag + "i)";
    }

    /*
     * Compare two complex number
     * return -1 if a < b
     * return 0 if a = b
     * return 1 if a > b
     */
    public int compare(ComplexNumber s) {
        int x = 0;
        if (Math.abs(Math.sqrt((real * real) + (imag * imag)) - Math.sqrt((s.real * s.real) + (s.imag * s.imag))) < 0.0000001) {
            x = 0;
        } else if ((Math.sqrt((real * real) + (imag * imag)) < Math.sqrt((s.real * s.real) + (s.imag * s.imag)))) {
            x = -1;
        } else if ((Math.sqrt((real * real) + (imag * imag)) > Math.sqrt((s.real * s.real) + (s.imag * s.imag)))) {
            x = 1;
        }
        return x;

    }
}
