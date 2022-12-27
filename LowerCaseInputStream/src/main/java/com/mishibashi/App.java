package com.mishibashi;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int c;

        try{
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new ByteArrayInputStream("I know the Decorator Pattern therefore I RULE!".getBytes())));
            while((c = in.read()) >= 0){
                System.out.print((char)c);
            }
            System.out.println("");
            in.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
