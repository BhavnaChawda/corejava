package OopsPractical;

public class Shape {
		String Color = null;
		int BorderWidth=0;
//		public Shape() {
//			this.Color= Color;
//			this.BorderWidth=BorderWidth;
//		}
		public void SetColor(String Color) {
			this.Color=Color;
			}
			
		public String getColor() {
			return Color;
		}
		public void setBorderWidth(int BorderWidth) {
			this.BorderWidth=BorderWidth;
		}
		public int getBorderWidth() {
			return BorderWidth;
		}
	}


