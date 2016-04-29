class DaemonDemo{
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().isDaemon());
		// Thread.currentThread().setDaemon(true);

		Thread t = new Thread();
		System.out.println(t);
		System.out.println(t.isDaemon());
		t.setDaemon(true);
		System.out.println(t.isDaemon());
	}
}