package com.mishibashi;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageProxy implements Icon{

    volatile ImageIcon imageIcon;
    final URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;
    
    public ImageProxy(URL url){imageURL = url;}

    synchronized void setImageIcon(ImageIcon imageIcon){
        this.imageIcon = imageIcon;
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if(imageIcon != null){
            imageIcon.paintIcon(c, g, x, y);
        }
        else{
            g.drawString("アルバムジャケットを読み込み中です。お待ちください", x + 300, y + 190);
            if(!retrieving){
                retrieving = true;

                retrievalThread = new Thread(new Runnable(){

                    @Override
                    public void run() {
                        try{
                            setImageIcon(new ImageIcon(imageURL, "アルバムジャケット"));
                            c.repaint();
                        }
                        catch(Exception e){
                            e.printStackTrace();
                        }
                    }

                });

                retrievalThread.start();
            }
        }
    }

    @Override
    public int getIconWidth() {
        if(imageIcon != null){
            return imageIcon.getIconWidth();
        }
        else{
            return 800;
        }
    }

    @Override
    public int getIconHeight() {
        if(imageIcon != null){
            return imageIcon.getIconHeight();
        }
        else{
            return 600;
        }
    }
    
}
