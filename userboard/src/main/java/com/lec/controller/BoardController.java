package com.lec.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.lec.board.common.SearchVO;
import com.lec.board.service.BoardService;
import com.lec.board.vo.BoardVO;



@Controller
@PropertySource("classpath:config/uploadpath.properties")
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@Autowired
	Environment environment;

	private String uploadFolder = "";
	
	@RequestMapping("/getBoardList.do")
	public String getBoardList(Model model, SearchVO searchVO,
			@RequestParam(defaultValue="1") int curPage,
			@RequestParam(defaultValue="10") int rowSizePerPage,
			@RequestParam(defaultValue="") String searchCategory,
			@RequestParam(defaultValue="") String searchType,
			@RequestParam(defaultValue="") String searchWord) {
		
		searchVO.setTotalRowCount(boardService.getTotalRowCount(searchVO));
		searchVO.setCurPage(curPage);
		searchVO.setRowSizePerPage(rowSizePerPage);
		searchVO.setSearchCategory(searchCategory);
		searchVO.setSearchType(searchType);
		searchVO.setSearchWord(searchWord);
		searchVO.pageSetting();
	
		List<BoardVO> boardList = boardService.getBoardList(searchVO);
		model.addAttribute("searchVO", searchVO);
		model.addAttribute("boardList", boardList);		
		return "board/getBoardList.jsp";
	}
	
	@RequestMapping("*/insertBoard.do")
	public String insertBoard(BoardVO board, Model model) throws IOException {
		MultipartFile uploadFile = board.getUploadFile();
		if (!uploadFile.isEmpty()) {
			String ubd_file = uploadFile.getOriginalFilename();
			uploadFile.transferTo(new File(uploadFolder + ubd_file));
			board.setUbd_file(ubd_file);
		}	
		boardService.insertBoard(board);
		model.addAttribute("msg","글이 정상적으로 등록되었습니다.");
		model.addAttribute("url","getBoardList.do"); // ------------------------------------- 여기 에러
		return "redirect_insert.jsp";
	}	
	
	@RequestMapping(value="/selectBoardView.do", method=RequestMethod.GET)
	public String selectBoardView(Model model, BoardVO board, SearchVO searchVO, @RequestParam int ubd_no) {
		model.addAttribute("searchVO", searchVO);
		model.addAttribute("board", boardService.getBoard(board));
		boardService.updateCount(ubd_no);
		return "board/selectBoardView.jsp";
	}
	
	
	@RequestMapping(value="/updateBoard.do", method=RequestMethod.GET)
	public String updateBoard(Model model, BoardVO board, SearchVO searchVO) {
		model.addAttribute("searchVO", searchVO);
		model.addAttribute("board", boardService.getBoard(board));
		return "board/updateBoard.jsp";
	}
	
	@RequestMapping(value="/updateBoard.do", method=RequestMethod.POST)
	public String updateBoard(Model model, BoardVO board) {
		boardService.updateBoard(board);
		model.addAttribute("msg","글이 정상적으로 수정되었습니다.");
		model.addAttribute("url","getBoardList.do");
		return "board/redirect_update.jsp";
	}	
	
	
	@RequestMapping(value="/deleteBoard.do", method=RequestMethod.GET)
	public String deleteBoard(Model model, BoardVO board, SearchVO searchVO, @RequestParam int ubd_no) {
		board.setUbd_no(ubd_no);
		model.addAttribute("searchVO", searchVO);
		model.addAttribute("board", boardService.getBoard(board));
		return "board/deleteBoard.jsp";
	}
	
	@RequestMapping(value="/deleteBoard.do", method=RequestMethod.POST)
	public String deleteBoard(BoardVO board) {
		boardService.deleteBoard(board);
		return "getBoardList.do";
	}	
	
	@RequestMapping(value="/like.do", method=RequestMethod.GET)
	public String likeCntBoard(@RequestParam int ubd_no) {
		boardService.likeCnt(ubd_no);
		return "selectBoardView.do";
	}	
	
	
}
