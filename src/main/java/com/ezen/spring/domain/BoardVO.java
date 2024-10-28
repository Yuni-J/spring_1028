package com.ezen.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BoardVO {
	
	private int bno;
	private String title;
	private String writer;
	private String content;
	private String isDel;
	private String regDate;
	private String modDate;
	

}
