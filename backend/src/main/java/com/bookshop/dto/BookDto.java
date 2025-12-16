package com.bookshop.dto;


import com.bookshop.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookDto {

    private Long bookId;
    private String title;
    private Integer price;
    private Integer point;
    private String imageUrl;
    private String categoryName;
    private String publisherName;
    private List<String> authors;


    // Book → DTO 변환용 생성자
    public BookDto(Book book) {
        this.bookId = book.getBookId();
        this.title = book.getTitle();
        this.price = book.getPrice();
        this.point = book.getPoint();
        this.imageUrl = book.getImageUrl();
        this.publisherName = book.getPublisher().getName();
        this.categoryName = book.getSubcategory().getCategory().getCategoryName();
        this.authors = book.getBookAuthors().stream().map(ba -> ba.getAuthor().getName()).toList();
    }
}
