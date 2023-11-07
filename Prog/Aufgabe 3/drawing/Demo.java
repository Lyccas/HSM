package drawing;

import java.awt.Color;

public class Demo {

	public static void main(String[] args) {
		Draw.drawCircle(20, 30, 10, 10, Color.BLACK);
		Draw.drawText(20 + 2, 30 - 5, "0", Color.BLACK);

		Draw.drawCircle(200, 230, 10, 10, Color.BLACK);
		Draw.drawText(200 + 2, 230 - 5, "1", Color.BLACK);

		Draw.drawLine(20 + 5, 30 + 5, 200 + 5, 230 + 5, new Color(255, 180, 180));
		Draw.drawText((20 + 200) / 2, (30 + 230) / 2, "1\u21922", Color.RED);
	}
}
