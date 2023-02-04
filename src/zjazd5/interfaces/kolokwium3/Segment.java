package zjazd5.interfaces.kolokwium3;

import java.awt.*;
import java.util.Objects;

public class Segment extends Point {
    Point startPoint = new Point();
    Point endPoint = new Point();

    public Segment(int x1, int y1, int x2, int y2) {
        startPoint.x = x1;
        startPoint.y = y1;
        endPoint.x = x2;
        endPoint.y = y2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Segment segment = (Segment) o;
        return Objects.equals(startPoint, segment.startPoint) && Objects.equals(endPoint, segment.endPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), startPoint, endPoint);
    }
}
