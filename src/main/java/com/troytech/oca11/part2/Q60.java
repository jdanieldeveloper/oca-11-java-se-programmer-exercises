package com.troytech.oca11.part2;

import java.io.FileNotFoundException;
import java.io.IOException;

interface SampleClosable { public void close () throws java.io.IOException; }

class SampleImplement1 implements  SampleClosable {
	@Override
	public void close() throws IOException {

	}
}

//bad
/*class SampleImplement2 implements  SampleClosable {
	@Override
	public void close() throws Exception {

	}
}*/

class SampleImplement3 implements  SampleClosable {
	@Override
	public void close() throws FileNotFoundException {

	}
}

class SampleImplement4 implements  SampleClosable {
	@Override
	public void close() {

	}
}


public class Q60 {

	public static void main(String args[]) {

	}
}
