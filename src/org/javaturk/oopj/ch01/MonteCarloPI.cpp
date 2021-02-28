//
//  MonteCarloPI.cpp
//
//  Created by Akin Kaldiroglu on 18/09/15.
//  Copyright © 2015 JavaTurk. All rights reserved.

#include <iostream>
#include <stdlib.h> // srand
#include <ctime>

using namespace std;

# define PI_L  3.141592653589793238462643383279502884L

int main() {
    cout.precision(10);
    int n;
    int dotsInCircle = 0;
    cout << "Please enter number of points: " << endl;
    cin >> n;
    clock_t start = clock();
    for (int i = 0; i < n; i ++) {
        double x = static_cast<double>(rand()) / static_cast<double>(RAND_MAX);
        double y = static_cast<double>(rand()) / static_cast<double>(RAND_MAX);
        double distance = x * x + y * y;
        if (distance <= 1.0)
            dotsInCircle ++;
    }
    clock_t end = clock();
    float time =  ((float) end - start) / CLOCKS_PER_SEC;
    double myPi = (double) 4 * dotsInCircle / n;

    cout << "PI:            " << PI_L << endl;
    cout << "Calculated PI: " << myPi << endl;
    cout << "Time is: " << time << " s." <<endl;

    return 0;
}
