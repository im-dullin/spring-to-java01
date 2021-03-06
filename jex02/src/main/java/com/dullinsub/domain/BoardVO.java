package com.dullinsub.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("board") // .xml resultType 이름 변경가능 
public class BoardVO {
//	private Long rn; > 느슨한 관계도의 장점.
	private Long bno;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	private Date updateDate;
	private int replyCnt;
	
	List<BoardAttachVO> attachs = new ArrayList<>();
}
