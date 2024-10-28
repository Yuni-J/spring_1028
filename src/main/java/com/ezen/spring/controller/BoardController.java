package com.ezen.spring.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ezen.spring.domain.BoardVO;
import com.ezen.spring.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequestMapping("/board/*")  // 접근 경로
@Slf4j
@RequiredArgsConstructor   // 생성자 주입
@Controller
public class BoardController {
	
	private final BoardService bsv;
	
	// return의 위치와 컨트롤러의 경로가 같으면 void 생략가능
	@GetMapping("/register")
	public String register() {
		// return 은 이동하는 jsp 위치 == destPage
		//	/WEB-INF/views/board/register.jsp
		return "/board/register";
	}

//	@GetMapping("/register")
//	public String register() {
//		return "/board/register";
//	}
	// 위와 동일
//	@GetMapping("/register")
//	public void register() {}
	
	@PostMapping("/insert")
	public String insert(BoardVO bvo) {
		log.info(">>> insert BoardVO > {}", bvo);
		int isOk = bsv.register(bvo);
		log.info(">>> register > {}", isOk>0?"OK":"FAIL");
		//내부 컨트롤러를 다시 접근할 경우  redirect:/경로
		return "redirect:/";
	}
	
	@GetMapping("/list")
	public String list(Model m) {
		// request.setAttribute 역할을 하는 객체 => Model 객체
		List<BoardVO> list = bsv.getList();
		m.addAttribute("list", list);
		return "/board/list";
	}
	
	// 두개의 경로를 하나의 메서드에서 처리
	// "/board/detail" , "/board/modify"
	@GetMapping({"/detail","/modify"})
	// 여러개일때 (@RequestParam("bno") int bno, @RequestParam("writer") String writer...)  
	public void detail(Model m, int bno) {  
		log.info(">>> param bno > {}", bno);
		BoardVO bvo = bsv.getDetail(bno);
		log.info(">>> detail bvo >> {}", bvo);
		m.addAttribute("bvo", bvo);
//		return "/board/detail";
	}
	
	public int update(BoardVO bvo) {
		int isOk = bsv.update(bvo);
		log.info(">>> update > {}", isOk>0?"OK":"FAIL");
		return isOk;
	}
	
	public int delete(BoardVO bvo) {
		int isOk = bsv.delete(bvo);
		log.info(">>> delete > {}", isOk>0?"OK":"FAIL");
		return isOk;
	}
	
	
	
	
	
	
}
