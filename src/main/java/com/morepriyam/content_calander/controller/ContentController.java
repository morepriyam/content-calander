package com.morepriyam.content_calander.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.morepriyam.content_calander.model.Content;
import com.morepriyam.content_calander.model.Status;
import com.morepriyam.content_calander.repository.ContentRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/content")
@CrossOrigin
public class ContentController {

	private final ContentRepository repository;

	public ContentController(ContentRepository repository) {
		this.repository = repository;
	}

	@GetMapping("")
	public List<Content> findAll() {
		return repository.findAll();

	}

	@GetMapping("/{id}")
	public Content findById(@PathVariable Integer id) {
		return repository.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found"));
	}

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("")
	public void create(@Valid @RequestBody Content content) {
		repository.save(content);
	}

	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PutMapping("/{id}")
	public void update(@Valid @RequestBody Content content, @PathVariable Integer id) {
		if (repository.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found");
		}
		repository.save(content);
	}

	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		repository.deleteById(id);
	}

	@GetMapping("/filter/{keyword}")
	public List<Content> findByTitle(@PathVariable String keyword) {
		return repository.findAllByTitleContains(keyword);
	}
	
	@GetMapping("/filter/status/{status}")
	public List<Content> findByStatus(@PathVariable Status status){
		return repository.listbyStatus(status);
	}

}
