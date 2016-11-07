package kata4v3;

import java.awt.Dimension;
import java.util.HashMap;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{
    //public HashMap<String,Integer> histogram = new HashMap<>();
    public HistogramDisplay() {
        super("HISTOGRAMA");
        //this.histogram = histogram;
        setContentPane(createPanel());
        pack();
    }
    
    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    public void execute() {
        setVisible(true);
    }
    
        private JFreeChart createChart(DefaultCategoryDataset dataSet) {
        JFreeChart chart = ChartFactory.createBarChart("JFreeChartHistogrem", "Dominios e-mail", "Numero de e-mails", dataSet, PlotOrientation.VERTICAL, false, true, true);
        return chart;
    }

        private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(8, "", "gmail.com");
        dataSet.addValue(2, "", "hotmail.com");
        dataSet.addValue(3, "", "yahoo.com");
        dataSet.addValue(4, "", "live.es");
        return dataSet;
    }

    
    

}
