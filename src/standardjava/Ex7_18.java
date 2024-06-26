package standardjava;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex7_18 {
	
	public static void main(String[] args) {
		Button b = new Button("Start!");
		b.addActionListener(new EventHandler());
		// 한번 쓸 메소드는 익명 클래스로 만듬
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!");
			}
		});
	}

}

class EventHandler implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!");
	}
}
