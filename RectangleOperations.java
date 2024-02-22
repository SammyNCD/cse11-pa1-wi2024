public class RectangleOperations {
    double calculateArea(double width, double height) {
        return width * height;
    }

    double calculatePerimeter(double width, double height) {
        return (width + height) * 2;
    }

    boolean isSquare(double width, double height) {
        return width == height;
    }
}
