package com.troytech.oca11.part2;


/**
 * Which change enables the code to print the following? James age: 20 Williams age: 3
 * A. Replacing line 5 with public static void main (String [] args) throws MissingInfoException, AgeOutofRangeException {
 * B. Replacing line 5 with public static void main (String [] args) throws.Exception {
 * C. Enclosing line 6 and line 7 within a try block and adding: catch(Exception e1) { //code goes here} catch (missingInfoException e2) { //code goes here} catch (AgeOutofRangeException e3) {//code goes here}
 * D. Enclosing line 6 and line 7 within a try block and adding: catch (missingInfoException e2) { //code goes here} catch (AgeOutofRangeException e3) {//code goes here}
 *
 *
 * Answer: B
 *
 */

class MissingInfoException extends Exception {}
class AgeOutofRangeException extends Exception {}

class Candidate {
	String name;
	int age;
	Candidate(String name, int age) throws Exception {
		if(name == null){

		} else if (age <= 10 || age >= 150) {
			throw new AgeOutofRangeException();
		} else {
			this.name = name;
			this.age = age;
		}
	}

	public String toString() {
		return name + " age: " + age;
	}
}

public class Q6 {

	public static void main(String[] args) throws Exception {
		//try {
			Candidate c = new Candidate("James", 20);
			Candidate c1 = new Candidate("Williams", 32);
		//} catch (Exception e1) {
			//TODO
		//}catch (AgeOutofRangeException e2) {
			//TODO
		//} catch (MissingInfoException e3) {

		//}

		System.out.println(c);
		System.out.println(c1);
	}
}