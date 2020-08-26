package com.management.library.librarymanagement.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class LibraryControllerTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testGetBooktitle() throws Exception {
		this.mockMvc.perform(get("/books/title").accept(MediaType.APPLICATION_JSON))
		            .andExpect(status().is2xxSuccessful())
		            .andExpect(content().string("title"));
		
	}

}
