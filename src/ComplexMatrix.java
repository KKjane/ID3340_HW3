/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class ComplexMatrix extends Matrix {

    protected ComplexNumber mem[][];

    public ComplexMatrix() {
        this.mem = new ComplexNumber[super.SIZE][super.SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                this.mem[i][j] = new ComplexNumber();
            }
        }
    }

    public ComplexMatrix(int initSIZE) {
        super(initSIZE);
        this.mem = new ComplexNumber[super.SIZE][super.SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                this.mem[i][j] = new ComplexNumber();
            }
        }
    }

    public static ComplexMatrix add(ComplexMatrix a, ComplexMatrix b) {
        ComplexMatrix c = new ComplexMatrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                c.mem[i][j] = ComplexNumber.add(a.mem[i][j], b.mem[i][j]);
            }
        }
        return c;
    }

    public static ComplexMatrix substract(ComplexMatrix a, ComplexMatrix b) {
        ComplexMatrix c = new ComplexMatrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                c.mem[i][j] = ComplexNumber.substract(a.mem[i][j], b.mem[i][j]);
            }
        }
        return c;
    }

    public static ComplexMatrix multiple(ComplexMatrix a, ComplexMatrix b) {
        ComplexMatrix c = new ComplexMatrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                for (int k = 0; k < a.SIZE; k++) {
                    c.mem[i][j] = ComplexNumber.add(c.mem[i][j], ComplexNumber.multiple(a.mem[i][k], b.mem[k][j]));
                }
            }
        }
        return c;
    }
}
