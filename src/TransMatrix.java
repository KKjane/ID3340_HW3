/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TransMatrix extends Matrix {

    public Matrix Transpose() {
        Matrix c = new Matrix();
        for (int i = 0; i < super.SIZE; i++) {
            for (int j = 0; j < super.SIZE; j++) {
                c.mem[i][j] = this.mem[j][i];
            }
        }
        return c;
    }
}
