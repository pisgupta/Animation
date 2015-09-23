package com.example.pankaj.slidingmenu;

import android.util.Log;

/**
 * Created by Pankaj on 9/8/2015.
 */
public class TestString {
    public static void StringTest() {

        StringBuilder sb = new StringBuilder("Hello");
        Log.e("String", sb.toString());
        //System.out.println(sb);// will print Hello
        //System.out.println(sb.hashCode());//
        Log.e("String",sb.hashCode()+"");
        sb.append(" Java");
       // System.out.println(sb);// will print Hello Java
      //  System.out.println(sb.hashCode());//
        Log.e("String", sb.hashCode() + "");
        Log.e("String", sb.toString() + "");
    }


}
