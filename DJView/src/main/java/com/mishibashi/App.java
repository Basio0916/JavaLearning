package com.mishibashi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
