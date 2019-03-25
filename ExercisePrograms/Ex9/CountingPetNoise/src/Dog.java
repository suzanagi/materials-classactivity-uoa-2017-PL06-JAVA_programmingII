
class Dog extends Animal {
		private static int count;
		public static void increment() { count++; }
		public static int getCount() { return count; }
		public Dog() {};
		public void noise() {
			System.out.println("Woof");
			increment();
	   } 
}
