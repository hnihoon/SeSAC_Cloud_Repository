package com.example.backend.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ArticleResponseDto {
	private Long id;
	private String title;
	private String content;
	private String imageURL;
	private String originalFileName;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
}
