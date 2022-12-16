package com.reservation.api.reservation.api;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class FilmControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test

	public void tesGetFilms() throws Exception {

		mockMvc.perform(get("/film")).andExpect(status().isOk());
		// void test() {
		// fail("Not yet implemented");
	}

}
