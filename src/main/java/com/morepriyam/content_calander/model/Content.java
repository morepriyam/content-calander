package com.morepriyam.content_calander.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import jakarta.validation.constraints.NotBlank;

@Table(value="Content")
public record Content(@Id Integer id,

		@NotBlank String title, @NotBlank String desc, Status Status, Type ContentType,
		@NotBlank LocalDateTime dateCreated, LocalDateTime dateUpdated, String url) {
}
