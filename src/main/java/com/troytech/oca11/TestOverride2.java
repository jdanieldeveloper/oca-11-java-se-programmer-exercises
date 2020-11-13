package com.troytech.oca11;

import java.io.IOException;

public class TestOverride2 {

    void process(int a, String str){return;}

    //public void process(int a, String str) {return;} // it's the same

    //void process(int a, String str) throws IOException {return;} // it's the same

    //private String process(int a, String str){return null;} //permit

    //String process(int a, String str){return null;} // permit
}
