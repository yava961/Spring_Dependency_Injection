package annotation.model;

import lombok.AllArgsConstructor;

import lombok.Data;

@Data
@AllArgsConstructor
public class Song {
    private String title;
    private String artist;
}
