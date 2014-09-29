
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
public class BinaryMatrix extends Matrix {

    public BinaryMatrix() {
        super.SIZE = 2;
    }

    public BinaryMatrix(int initSIZE) {
        super(initSIZE);
    }

    @Override
    public void inputAllMember() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter value for binary matrix's member < " + SIZE + "*" + SIZE + " > [only 0,1]");
        for (int i = 0; i < this.SIZE; i++) {
            for (int j = 0; j < this.SIZE; j++) {
                this.mem[i][j] = sn.nextByte();
            }
        }
    }

    public static BinaryMatrix add(BinaryMatrix a, BinaryMatrix b) {
        BinaryMatrix c = new BinaryMatrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                c.mem[i][j] = a.mem[i][j] + b.mem[i][j];
                if (c.mem[i][j] > 1) {
                    c.mem[i][j] = 1;
                }
            }
        }
        return c;
    }

    public static BinaryMatrix substract(BinaryMatrix a, BinaryMatrix b) {
        BinaryMatrix c = new BinaryMatrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                c.mem[i][j] = (byte) (a.mem[i][j] - b.mem[i][j]);
                if (c.mem[i][j] < 0) {
                    c.mem[i][j] = 0;
                }
            }
        }
        return c;
    }

    public static BinaryMatrix multiplication(BinaryMatrix a, BinaryMatrix b) {
        BinaryMatrix c = new BinaryMatrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                for (int k = 0; k < a.SIZE; k++) {
                    c.mem[i][j] += a.mem[i][k] * b.mem[k][j];
                    if (c.mem[i][j] > 1) {
                        c.mem[i][j] = 1;
                    }
                }
            }
        }
        return c;
    }

    @Override
    public String toString() {
        for (int i = 0; i < this.SIZE; i++) {
            for (int j = 0; j < this.SIZE; j++) {
                System.out.print(this.mem[i][j] + " ");
            }
            System.out.println("");
        }
        return "";
    }
}
