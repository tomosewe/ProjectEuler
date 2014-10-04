/*	Project Euler Main Program
 *	Author: Tomos Ewe - tomosewe@gmail.com
 *
 *	Runs all completed solutions so far.
 *
 */

class ProjectEuler {    
    public static void main(String[] args) {  	
		Euler001 euler001 = new Euler001();
		System.out.println("Project Euler #001: " + euler001.run());
		Euler002 euler002 = new Euler002();
		System.out.println("Project Euler #002: " + euler002.run());			
    }    
}