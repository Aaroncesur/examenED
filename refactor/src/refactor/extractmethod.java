package refactor;

public class extractmethod {
		public static void main (String[] args) {
			int x = 5;
			
			examplemethod(x);
		}

		private static void examplemethod(int x) {
			for (int i = 0; i < x; i++){
				System.out.println("demo "+ i);
				}
		}
}
