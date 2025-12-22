package com.bookshop.dto.book;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class BookCreateRequestDto {
    private Long BookId;
    private String title;
    private SelectInputDto category;      // 미사용
    private SelectInputDto subCategory;
    private SelectInputDto publisher;
    private Integer price;
    private Integer point;
    private LocalDate publishedDate;
    private String description;
    private String imageUrl;
    private List<SelectInputDto> author;
}
