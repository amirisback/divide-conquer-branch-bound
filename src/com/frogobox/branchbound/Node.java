package com.frogobox.branchbound;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * divide-conquer-branch-bound
 * Copyright (C) 07/05/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.branchbound
 */

public class Node {

    public Node parent;
    public int[][] matrix;

    // Blank tile cordinates
    public int x, y;

    // Number of misplaced tiles
    public int cost;

    // The number of moves so far
    public int level;

    public Node(int[][] matrix, int x, int y, int newX, int newY, int level, Node parent) {
        this.parent = parent;
        this.matrix = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            this.matrix[i] = matrix[i].clone();
        }

        // Swap value
        this.matrix[x][y]       = this.matrix[x][y] + this.matrix[newX][newY];
        this.matrix[newX][newY] = this.matrix[x][y] - this.matrix[newX][newY];
        this.matrix[x][y]       = this.matrix[x][y] - this.matrix[newX][newY];

        this.cost = Integer.MAX_VALUE;
        this.level = level;
        this.x = newX;
        this.y = newY;
    }

}
