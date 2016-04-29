class MyThreadDemo1 {
	public static void main(String[] args) throws Exception{
		System.out.println(new Thread().currentThread());

		MyThread t = new MyThread();
		t.start();
		t.join(100);
		t.stop();	//	stop() is non-static
	}
}


class MyThread extends Thread {
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread());
			try{
				// Thread.sleep(1);
				Thread.sleep(100);
			} catch (InterruptedException ie) {
	            System.out.println("Thread Interrupted");
	        } catch (Error e) {
	            System.out.println("Thread threw an error " + e);
	            throw e;
	        } finally {
	            System.out.println("Thread finally");
	        }
		}
	}
}