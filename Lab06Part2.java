package Labs.Lab06;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.Group;

public class Lab06Part2 extends Application{
    private static String[] ageGroups = {
            "18-25", "26-35", "36-45", "46-55", "56-65", "65+"
    };
    private static int[] purchasesByAgeGroup = {
            648, 1021, 2453, 3173, 1868, 2247
    };

    @Override
    public void start(Stage stage){
        ObservableList<PieChart.Data> pieChartData =
        FXCollections.observableArrayList(
            new PieChart.Data(ageGroups[0], purchasesByAgeGroup[0]),
            new PieChart.Data(ageGroups[1], purchasesByAgeGroup[1]),
            new PieChart.Data(ageGroups[2], purchasesByAgeGroup[2]),
            new PieChart.Data(ageGroups[3], purchasesByAgeGroup[3]),
            new PieChart.Data(ageGroups[4], purchasesByAgeGroup[4]),
            new PieChart.Data(ageGroups[5], purchasesByAgeGroup[5])
        );

        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Age Group Purchases");

        Scene scene = new Scene(new Group());
        stage.setTitle("Sample Data for the Pie Chart  ");
        stage.setWidth(500);
        stage.setHeight(500);
        scene.getStylesheets().add("lab06.css");

        ((Group) scene.getRoot()).getChildren().add(chart);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
