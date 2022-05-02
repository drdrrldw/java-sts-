package kr.human.io;

import java.io.Serializable;



public class DataVO implements Serializable {
	// 자바는 클래스 내용이 변할때 마다.
	
	private static final long serialVersionUID = 6629188902613864727L;
	private String stringData;
	private int intData;
	
	
	
	public DataVO(String stringData, int intData) {
		super();
		this.stringData = stringData;
		this.intData = intData;
	}



	public String getStringData() {
		return stringData;
	}

	public void setStringData(String stringData) {
		this.stringData = stringData;
	}


	public int getIntData() {
		return intData;
	}

	public void setIntData(int intData) {
		this.intData = intData;
	}





	@Override
	public String toString() {
		return "DataVO [stringData=" + stringData + ", intData=" + intData + "]";
	}
	
	
	
	
}
