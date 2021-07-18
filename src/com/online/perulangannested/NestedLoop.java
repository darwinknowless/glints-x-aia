package com.online.perulangannested;

// block class
public class NestedLoop {
	// method main
	public static void main(String[] args) {

		// create / declare variable
		int x, y;

		// melakukan perualangan sebanyak x dan y kali.
		for (x = 0; x <= 5; x++) {
			for (y = 0; y <= 3; y++) {
				// result
				System.out.format("Perulangan [x=%d, y=%d] %n", x, y);

			}
		}
	}
}

// result
/*
 * Perulangan [x=0, y=0] 
 * Perulangan [x=0, y=1] 
 * Perulangan [x=0, y=2] 
 * Perulangan [x=0, y=3] 
 * Perulangan [x=1, y=0] 
 * Perulangan [x=1, y=1] 
 * Perulangan [x=1, y=2]
 * Perulangan [x=1, y=3] 
 * Perulangan [x=2, y=0] 
 * Perulangan [x=2, y=1] 
 * Perulangan [x=2, y=2] 
 * Perulangan [x=2, y=3] 
 * Perulangan [x=3, y=0] 
 * Perulangan [x=3, y=1]
 * Perulangan [x=3, y=2] 
 * Perulangan [x=3, y=3] 
 * Perulangan [x=4, y=0] 
 * Perulangan [x=4, y=1] 
 * Perulangan [x=4, y=2] 
 * Perulangan [x=4, y=3] 
 * Perulangan [x=5, y=0]
 * Perulangan [x=5, y=1] 
 * Perulangan [x=5, y=2] 
 * Perulangan [x=5, y=3]
 */
