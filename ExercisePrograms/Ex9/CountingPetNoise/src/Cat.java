
class Cat extends Animal {
		private static int count;
		public static void increment() { count++; }
		public static int getCount() { return count; }
		public Cat() {};
		public void noise() {
			System.out.println("Meow");
			increment();
		} 
}
