class MyThreadDemo2 {
	public static void main(String[] args) throws Exception{
		Thread t = new Thread() {
   		 @Override
    		public void run() {
		        try {
		            System.out.println("Thread start");
		            Thread.sleep(1000);
		            System.out.println("Thread end");
		        } catch (InterruptedException ie) {
		            System.out.println("Thread Interrupted");
		        } catch (Error e) {
		            System.out.println("Thread threw an error " + e);
		            throw e;
		        } finally {
		            System.out.println("Thread finally");
		        }
    		}
		};
		t.start();
		t.join(100);
		t.stop();
	}
}
