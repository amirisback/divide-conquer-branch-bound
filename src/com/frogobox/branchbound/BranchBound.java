package com.frogobox.branchbound;

import static com.frogobox.branchbound.Algorithm.*;

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


public class BranchBound {

    public static void main(String[] args) {

        System.out.println("Java program to solve the 8 puzzle problem (using branch and bound algorithm)");

        // *** SAMPLE DATA ***
        int[][] initial = {{1, 8, 2}, {0, 4, 3}, {7, 6, 5}};
        int[][] goal = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};

        System.out.println("------------------------------------------");
        initState(initial, goal);
        System.out.println("------------------------------------------");

        // White tile coordinate
        int x = 1, y = 0;

        Algorithm branchBound = new Algorithm();
        if (branchBound.isSolvable(initial)) {
            branchBound.solve(initial, goal, x, y);
        } else {
            System.out.println("The given initial is impossible to solve");
        }
        System.out.println("-----------------------------------------");
        System.out.println("Finish Result : ");
        initGoal(goal);

    }

}
