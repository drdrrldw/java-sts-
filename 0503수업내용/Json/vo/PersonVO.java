package kr.human.Json.vo;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "Person")
@AllArgsConstructor
@NoArgsConstructor
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"name", "age", "gender", "date"})
public class PersonVO {
	@XmlElement
	private String name;
	@XmlElement
	private int age;
	@XmlElement
	@XmlJavaTypeAdapter(GenderAdapter.class)	// 저장/읽기 할때 사용될 클래스 지정. 모양변경
	private Boolean gender;
	@XmlElement
	@XmlJavaTypeAdapter(DateAdapter.class)
	private Date date;
}
