package com.example.demo.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(FormController.class)
class FormControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void showForm_displaysForm() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("form"))
                .andExpect(model().attributeExists("entry"));
    }

    @Test
    void submitForm_withValidData_redirectsToConfirmation() throws Exception {
        mockMvc.perform(post("/submit")
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                        .param("name", "Alice")
                        .param("age", "30")
                        .param("title", "Engineer")
                        .param("hometown", "Springfield"))
                .andExpect(status().isOk())
                .andExpect(view().name("confirmation"))
                .andExpect(model().attributeExists("entries"));
    }

    @Test
    void submitForm_missingRequiredFields_returnsFormWithErrors() throws Exception {
        mockMvc.perform(post("/submit")
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                        .param("age", "25")
                        .param("hometown", "Town"))
                .andExpect(status().isOk())
                .andExpect(view().name("form"))
                .andExpect(model().attributeHasFieldErrors("entry", "name", "title"));
    }
}
