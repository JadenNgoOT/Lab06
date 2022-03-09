package Labs.Lab06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;


import static javafx.application.Application.launch;


public class Lab06Part1 extends Application{
    private static double[] avgHousingPricesByYear = {
            247381.0,264171.4,287715.3,294736.1,
            308431.4,322635.9,340253.0,363153.7
    };
    private static double[] avgCommercialPricesByYear = {
            1121585.3,1219479.5,1246354.2,1295364.8,
            1335932.6,1472362.0,1583521.9,1613246.3
    };

    final static String year1 = "2000";
    final static String year2 = "2001";
    final static String year3 = "2002";
    final static String year4 = "2003";
    final static String year5 = "2004";
    final static String year6 = "2005";
    final static String year7 = "2006";
    final static String year8 = "2007";

    @Override
    public void start(Stage stage){
        stage.setTitle("Bar Chart Sample");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc =
                new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle("Price By Year Summary");
        xAxis.setLabel("Year");
        yAxis.setLabel("Price In Dollars");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Average Housing Prices By Year");
        series1.getData().add(new XYChart.Data(year1,avgHousingPricesByYear[0]));
        series1.getData().add(new XYChart.Data(year2,avgHousingPricesByYear[1]));
        series1.getData().add(new XYChart.Data(year3,avgHousingPricesByYear[2]));
        series1.getData().add(new XYChart.Data(year4,avgHousingPricesByYear[3]));
        series1.getData().add(new XYChart.Data(year5,avgHousingPricesByYear[4]));
        series1.getData().add(new XYChart.Data(year6,avgHousingPricesByYear[5]));
        series1.getData().add(new XYChart.Data(year7,avgHousingPricesByYear[6]));
        series1.getData().add(new XYChart.Data(year8,avgHousingPricesByYear[7]));

        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Average Commercial Prices By Year");
        series2.getData().add(new XYChart.Data(year1,avgCommercialPricesByYear[0]));
        series2.getData().add(new XYChart.Data(year2,avgCommercialPricesByYear[1]));
        series2.getData().add(new XYChart.Data(year3,avgCommercialPricesByYear[2]));
        series2.getData().add(new XYChart.Data(year4,avgCommercialPricesByYear[3]));
        series2.getData().add(new XYChart.Data(year5,avgCommercialPricesByYear[4]));
        series2.getData().add(new XYChart.Data(year6,avgCommercialPricesByYear[5]));
        series2.getData().add(new XYChart.Data(year7,avgCommercialPricesByYear[6]));
        series2.getData().add(new XYChart.Data(year8,avgCommercialPricesByYear[7]));

        Scene scene  = new Scene(bc,800,600);
        scene.getStylesheets().add("lab06.css");
        bc.getData().addAll(series1, series2);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}