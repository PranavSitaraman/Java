del Output /S /Q
mkdir Output
javac --module-path "C:/Users/Pranav Sitaraman/Documents/Programming/Java/JavaFX/lib" --add-modules javafx.base,javafx.controls,javafx.fxml,javafx.graphics,javafx.media,javafx.swing,javafx.web,javafx.swt *.java -d Output
cd Output
start java --module-path "C:/Users/Pranav Sitaraman/Documents/Programming/Java/JavaFX/lib" --add-modules javafx.base,javafx.controls,javafx.fxml,javafx.graphics,javafx.media,javafx.swing,javafx.web,javafx.swt main