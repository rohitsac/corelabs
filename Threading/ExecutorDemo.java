import java.util.concurrent.*;

class PrintJob implements Runnable{
	String name;
	PrintJob(String name){
		this.name = name;
	}
	public void run(){
		System.out.println(name+" job started by "+Thread.currentThread().getName());
		try{
			Thread.sleep(1000);
		}catch (Exception e) {	}
		System.out.println(name+" job finished by "+Thread.currentThread().getName());
	}
}

class ExecutorDemo{
	public static void main(String[] args) {
		PrintJob[] jobs = {
							new PrintJob("Durga1"),
							new PrintJob("Durga2"),
							new PrintJob("Durga3"),
							new PrintJob("Durga4"),
							new PrintJob("Durga5"),
							new PrintJob("Durga6"),
						  };
		ExecutorService service = Executors.newFixedThreadPool(3);

		for(PrintJob job : jobs)
			service.submit(job);

		service.shutdown();
	}
}