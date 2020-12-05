package com.otrodevym.web.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.hateoas.PagedResources;
import org.springframework.hateoas.PagedResources.PageMetadata;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.otrodevym.web.domain.Board;
import com.otrodevym.web.repository.BoardRepository;


@RestController
@RequestMapping("/api/boards")
public class BoardRestController {

	private BoardRepository boardRepository;
	
	public BoardRestController(BoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}
	
	
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getBoards(@PageableDefault Pageable pageable){
		
		Page<Board> boards = boardRepository.findAll(pageable);
		PageMetadata pageMetadata = new PageMetadata(pageable.getPageSize(), boards.getNumber(), boards.getTotalElements());
		PagedResources<Board> resources = new PagedResources<>(boards.getContent(), pageMetadata);
		resources.add(linkTo(methodOn(BoardRestController.class).getBoards(pageable)).withSelfRel());
		
		return ResponseEntity.ok(resources);
	}
	
	@PostMapping
	public ResponseEntity<?> postBoard(@RequestBody Board board){
		System.out.println(board.toString());
		board.setCreatedDateNow();
		boardRepository.save(board);
		
		return new ResponseEntity<>("{}", HttpStatus.CREATED);
	}
	
	
	@PutMapping("/{idx}")
	public ResponseEntity<?> putBoards(@PathVariable("idx") Long idx, @RequestBody Board board){
		Board parsistboard = boardRepository.getOne(idx);
		parsistboard.update(board);
		
		boardRepository.save(parsistboard);
		return new ResponseEntity<>("{}", HttpStatus.OK);
	}
	
	@DeleteMapping("/{idx}")
	public ResponseEntity<?> deleteBoard(@PathVariable("idx") Long idx){
		
		boardRepository.deleteById(idx);
		
		return new ResponseEntity<>("{}", HttpStatus.OK);
	}
	
}
