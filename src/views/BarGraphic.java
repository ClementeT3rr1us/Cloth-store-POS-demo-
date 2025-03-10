
package views;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Clemente
 */
public class BarGraphic {

    public CategoryDataset createDataSet(ArrayList<Content> contentList){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        for (Content content : contentList) {
            dataSet.addValue(content.getQuantity(), content.getName(), "");
        }
        return dataSet;
    }
    
    
    public JFreeChart createBarChart(CategoryDataset dataSet){
        
        JFreeChart barGraphic = ChartFactory.createBarChart3D(
                "Dados da Loja", 
                "", 
                "Quantidade", 
                dataSet,
                PlotOrientation.VERTICAL, 
                true, 
                true, 
                false);
 
        return barGraphic;
    }
    
    public ChartPanel createGrphic(ArrayList<Content> contenList){
        CategoryDataset dataSet = this.createDataSet(contenList);
        
        JFreeChart graphic = this.createBarChart(dataSet);
        ChartPanel panel = new ChartPanel(graphic);
        panel.setPreferredSize(new Dimension(400, 350));
        return panel;
    }
}
