
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class Matrix {
// Field

    protected int SIZE;
    protected int mem[][];
// Constructor

    public Matrix() {
        SIZE = 2;
        mem = new int[SIZE][SIZE];
    }

    public Matrix(int initSIZE) {
        SIZE = initSIZE;
        mem = new int[SIZE][SIZE];
    }
// Method
// Input matrix's member at index i,j
// i and j are integer for position m,n in matrix
// val is an integer for a matrix's member at i,j

    public void setMemberAt(int i, int j, int val) {
        this.mem[i][j] = val;
    }

    public void inputAllMember() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter value for matrix's member < " + SIZE + "*" + SIZE + " >");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                mem[i][j] = sn.nextInt();
            }
        }
    }

    public Matrix add(Matrix a, Matrix b) {
        Matrix c = new Matrix();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                c.mem[i][j] = a.mem[i][j] + b.mem[i][j];
            }
        }
        return c;
    }

    public Matrix substract(Matrix a, Matrix b) {
        Matrix c = new Matrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                c.mem[i][j] = a.mem[i][j] - b.mem[i][j];
            }
        }
        return c;
    }

    public Matrix multiplication(Matrix a, Matrix b) {
        Matrix c = new Matrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                for (int k = 0; k < a.SIZE; k++) {
                    c.mem[i][j] += a.mem[i][k] * b.mem[k][j];
                }
            }
        }
        return c;
    }
// Print out matrix

    @Override
    public String toString() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(mem[i][j] + " ");
            }
            System.out.println("");
        }
        return "";
    }
}
