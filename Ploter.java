/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diplomski;

import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import java.util.ArrayList;
import java.util.Iterator;
import org.jfree.chart.demo.*;
/**
 *
 * @author vhailor
 * @param title  the frame title.
 */
public class Ploter extends Karta{
   // ArrayList l1=new ArrayList();
    //ArrayList l2=new ArrayList();
    
    

	public Ploter(ArrayList tocke1, ArrayList tocke2) {
            
            final XYSeries series = new XYSeries("SRTM Data");
            Iterator i1 = tocke1.iterator();
            Iterator i2= tocke2.iterator();
            String pom1, pom2;
            while(i1.hasNext() && i2.hasNext()){
                pom1=String.valueOf(i1.next());
                pom2=String.valueOf(i2.next());
                series.add(Double.valueOf(pom1), Double.valueOf(pom2));
            }
            final XYSeriesCollection data = new XYSeriesCollection(series);
            final JFreeChart chart = ChartFactory.createXYLineChart(
            "Profil",
            "Broj kilometra", 
            "Visina [m]", 
            data,
            PlotOrientation.VERTICAL,
            true,
            true,
            false
        );
       
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        //chartPanel.setBackground(new Color(255,255,255,0));
        setContentPane(chartPanel);
        

    }
    
   /* public void vrijedosti(double x, double y){
        
        
        l1.add(x);
        l2.add(y);
        
    }*/
    
   /* public void XYSeriesDemo(){

        final XYSeries series = new XYSeries("SRTM Data");
        Iterator i1 = l1.iterator();
        Iterator i2= l2.iterator();
        String pom1, pom2;
        while(i1.hasNext() && i2.hasNext()){
            pom1=String.valueOf(i1.next());
            pom2=String.valueOf(i2.next());
            series.add(Double.valueOf(pom1), Double.valueOf(pom2));
        }
        final XYSeriesCollection data = new XYSeriesCollection(series);
        final JFreeChart chart = ChartFactory.createXYLineChart(
            "XY Series Demo",
            "X", 
            "Y", 
            data,
            PlotOrientation.VERTICAL,
            true,
            true,
            false
        );

        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        //setContentPane(chartPanel);
    }*/
    
}
