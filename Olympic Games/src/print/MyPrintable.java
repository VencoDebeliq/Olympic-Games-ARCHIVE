/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package print;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.util.ArrayList;

/**
 *
 * @author Ventsislav Peychev
 */
public class MyPrintable implements Printable {

    private ArrayList <String> textToPrint;
    private int totalPages = 11;

    public void setTextToPrint(ArrayList <String> textToPrint) {
        this.textToPrint = textToPrint;
    }
    
    public ArrayList <String> getTextToPrint() {
        return textToPrint;
    }

    public MyPrintable()
    {
        this(new ArrayList <> ());
    }
    
    public MyPrintable(ArrayList <String> textToPrint)
    {
        setTextToPrint(textToPrint);
    }
    
    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex >= totalPages) {
            return NO_SUCH_PAGE;
        }
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
        System.out.println(pageFormat.getImageableX() + " " + pageFormat.getImageableY());
        System.out.println("here");
        drawContent(g2d, pageIndex);  
        return PAGE_EXISTS;
    }
    
    private void drawContent(Graphics2D g2d, int pageIndex) {
        int x = 10;
        int y = 10;
        for (String text: textToPrint)
        {
            if (y / 30 % 2 == 0) x = 10;
            else x = 100;
            g2d.drawString(text, x, y);
            System.out.println(pageIndex + 1);
            y += 30;
            System.out.println(text + " " + y);
            if (y >= 670) break;
        }
        for (int i = 0; i < 22; ++i)
        {
            if (!textToPrint.isEmpty())
                textToPrint.remove(0);
        }
    }
}
