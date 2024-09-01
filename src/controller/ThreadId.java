/*1) Fazer uma aplicação que rode 5 Threads que cada uma delas imprima no console o seu
número (TID).
Dica: O número que deve ser impresso é a saída da operação int id = getId() (Para JDK até 18)
ou int id = threadId() (Para JDK a partir da 19) da Thread.
*/
package controller;

public class ThreadId extends Thread{

	public ThreadId() {
		super();
	}

	public void run() {
		int tid = (int)threadId();
		System.out.println("#" + tid);
	}
	
	
}
