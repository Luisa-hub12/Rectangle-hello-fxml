package school.coda.luisactt.ellofxml;

import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class HelloController {

    @FXML
    private Rectangle monRectangle;

    @FXML
    private Slider monSlider;

    private boolean estVisible = true;
    private boolean estVert = true;

    // Bouton
    @FXML
    protected void onHelloButtonClick() {

        estVisible = !estVisible;
        monRectangle.setVisible(estVisible);

        if (estVert) {
            monRectangle.setFill(Color.RED);
        } else {
            monRectangle.setFill(Color.GREEN);
        }

        estVert = !estVert;
    }

    // Clique rectangle
    @FXML
    public void onRectangleClick(MouseEvent mouseEvent) {

        if (monRectangle.getFill().equals(Color.RED)) {
            monRectangle.setFill(Color.GREEN);
        } else {
            monRectangle.setFill(Color.RED);
        }
    }

    // Slider
    @FXML
    public void onSliderChange() {
        monRectangle.setWidth(monSlider.getValue());
    }
}