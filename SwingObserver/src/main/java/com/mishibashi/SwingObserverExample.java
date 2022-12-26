package com.mishibashi;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Hello world!
 *
 */
public class SwingObserverExample 
{
    JFrame frame;
    public static void main( String[] args )
    {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go(){
        frame = new JFrame();

        JButton button = new JButton("これをすべきですか？");
        button.addActionListener(event -> System.out.println("してはいけません、後悔しますよ！"));
        button.addActionListener(event -> System.out.println("さあ、やってしまいなさい！"));
    }
}
