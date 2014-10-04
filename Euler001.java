/*	Project Euler #001
 *	Author: Tomos Ewe - tomosewe@gmail.com
 *
 *	Multiples of 3 and 5
 *	--------------------
 *	If we list all the natural numbers below 10 that are multiples of 3 or 5,
 *	we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *	Find the sum of all the multiples of 3 or 5 below 1000.
 *
 */

class Euler001 {     
    private int sum = 0;
	private final int num = 1000;
		
	public Euler001() {}
        
	public int run() {
		for (int i = 1; i < num; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				sum += i;
			} 			
		}
		return(sum);
	}     
}