package com.ezen.spring.service;

import java.util.List;

import com.ezen.spring.domain.BoardVO;

public interface BoardService {

	int register(BoardVO bvo);

	List<BoardVO> getList();

	BoardVO getDetail(int bno);



}
