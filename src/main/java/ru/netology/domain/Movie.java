package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



        import lombok.AllArgsConstructor;
        import lombok.Data;
        import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Movie {
    private int id;
    private String imageUrl;
    private String name;
    private String genre;


    public Movie(int i, String http1, String filmName1, String drama) {

    }
}
