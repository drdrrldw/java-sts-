package kr.human.ThreadEx07;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
// 생산자 스레드 : 데이터를 만들어 주는 스레드 
@NoArgsConstructor
@Getter
@Setter
public class CalcThread extends Thread {
    
	private SharedArea sharedArea;
    
    public void run() {
    	// 무한 급수를 이용하여 원주율을 구해서 공유 영역에 저장해준다. 
        double total = 0.0;
        for (int cnt = 1; cnt < 1_000_000_000; cnt += 2)
            if (cnt / 2 % 2 == 0)
                total += 1.0 / cnt;
            else
                total -= 1.0 / cnt;
        // System.out.println("원주율 : " + (total * 4));
        sharedArea.setReady(true);
        sharedArea.setResult(total * 4);
        
        // notify 역시 반드시 동기화 블럭으로 감싸줘야한다.
        synchronized (sharedArea) {
        	sharedArea.notify(); 		// 잠자고 있는 스레드에게 통지 메세지를 보낸다.
        	// 잠자고 있는 스레드가 여러개라면 notifyAll() 을 호출한다.
		}
        
    }
}
