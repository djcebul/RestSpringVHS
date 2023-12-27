package com.djcebul.vhs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vhs")
public class VideoCassetteApi {
    private List<VideoCassette> videoCassettes;

    public VideoCassetteApi() {
        videoCassettes = new ArrayList<>();
        videoCassettes.add(new VideoCassette(1L, "Titanic", LocalDate.of(1995, 1, 5)));
        videoCassettes.add(new VideoCassette(2L, "Forrest Gump", LocalDate.of(1994, 7, 6)));
        videoCassettes.add(new VideoCassette(3L, "The Shawshank Redemption", LocalDate.of(1994, 9, 23)));
        videoCassettes.add(new VideoCassette(4L, "The Godfather", LocalDate.of(1972, 3, 24)));
        videoCassettes.add(new VideoCassette(5L, "Pulp Fiction", LocalDate.of(1994, 10, 14)));
        videoCassettes.add(new VideoCassette(6L, "The Dark Knight", LocalDate.of(2008, 7, 18)));
        videoCassettes.add(new VideoCassette(7L, "Schindler's List", LocalDate.of(1993, 11, 30)));
        videoCassettes.add(new VideoCassette(8L, "Fight Club", LocalDate.of(1999, 9, 10)));
        videoCassettes.add(new VideoCassette(9L, "The Matrix", LocalDate.of(1999, 3, 31)));
        videoCassettes.add(new VideoCassette(10L, "Star Wars: Episode IV - A New Hope", LocalDate.of(1977, 5, 25)));
        videoCassettes.add(new VideoCassette(11L, "The Lord of the Rings: The Fellowship of the Ring", LocalDate.of(2001, 12, 19)));
        videoCassettes.add(new VideoCassette(12L, "Jurassic Park", LocalDate.of(1993, 6, 11)));
        videoCassettes.add(new VideoCassette(13L, "Inception", LocalDate.of(2010, 7, 8)));
        videoCassettes.add(new VideoCassette(14L, "The Shining", LocalDate.of(1980, 5, 23)));
        videoCassettes.add(new VideoCassette(15L, "Gladiator", LocalDate.of(2000, 5, 1)));
        videoCassettes.add(new VideoCassette(16L, "The Silence of the Lambs", LocalDate.of(1991, 2, 14)));
        videoCassettes.add(new VideoCassette(17L, "The Departed", LocalDate.of(2006, 10, 6)));
        videoCassettes.add(new VideoCassette(18L, "The Godfather: Part II", LocalDate.of(1974, 12, 20)));
        videoCassettes.add(new VideoCassette(19L, "The Dark Knight Rises", LocalDate.of(2012, 7, 20)));
        videoCassettes.add(new VideoCassette(20L, "Casablanca", LocalDate.of(1942, 11, 26)));
        videoCassettes.add(new VideoCassette(21L, "The Green Mile", LocalDate.of(1999, 12, 10)));
        videoCassettes.add(new VideoCassette(22L, "The Usual Suspects", LocalDate.of(1995, 8, 16)));
        videoCassettes.add(new VideoCassette(23L, "Saving Private Ryan", LocalDate.of(1998, 7, 24)));
        videoCassettes.add(new VideoCassette(24L, "The Pianist", LocalDate.of(2002, 5, 24)));
        videoCassettes.add(new VideoCassette(25L, "Forrest Gump", LocalDate.of(1994, 7, 6)));
        videoCassettes.add(new VideoCassette(26L, "The Lion King", LocalDate.of(1994, 6, 24)));
        videoCassettes.add(new VideoCassette(27L, "Inglourious Basterds", LocalDate.of(2009, 5, 20)));
        videoCassettes.add(new VideoCassette(28L, "The Godfather: Part III", LocalDate.of(1990, 12, 25)));
        videoCassettes.add(new VideoCassette(29L, "The Big Lebowski", LocalDate.of(1998, 3, 6)));
        videoCassettes.add(new VideoCassette(30L, "The Grand Budapest Hotel", LocalDate.of(2014, 2, 6)));
        videoCassettes.add(new VideoCassette(31L, "The Terminator", LocalDate.of(1984, 10, 26)));
        videoCassettes.add(new VideoCassette(32L, "The Wizard of Oz", LocalDate.of(1939, 8, 25)));
        videoCassettes.add(new VideoCassette(33L, "The Sound of Music", LocalDate.of(1965, 3, 2)));
        videoCassettes.add(new VideoCassette(34L, "The Exorcist", LocalDate.of(1973, 12, 26)));
        videoCassettes.add(new VideoCassette(35L, "Goodfellas", LocalDate.of(1990, 9, 12)));
        videoCassettes.add(new VideoCassette(36L, "Citizen Kane", LocalDate.of(1941, 5, 1)));
        videoCassettes.add(new VideoCassette(37L, "One Flew Over the Cuckoo's Nest", LocalDate.of(1975, 11, 19)));
        videoCassettes.add(new VideoCassette(38L, "Seven Samurai", LocalDate.of(1954, 4, 26)));
        videoCassettes.add(new VideoCassette(39L, "The Breakfast Club", LocalDate.of(1985, 2, 15)));
        videoCassettes.add(new VideoCassette(40L, "A Clockwork Orange", LocalDate.of(1971, 12, 19)));
        videoCassettes.add(new VideoCassette(41L, "Amélie", LocalDate.of(2001, 4, 25)));
        videoCassettes.add(new VideoCassette(42L, "The Great Gatsby", LocalDate.of(2013, 5, 1)));
        videoCassettes.add(new VideoCassette(43L, "Gone with the Wind", LocalDate.of(1939, 12, 15)));
        videoCassettes.add(new VideoCassette(44L, "The Social Network", LocalDate.of(2010, 9, 24)));
        videoCassettes.add(new VideoCassette(45L, "The Godfather: Part III", LocalDate.of(1990, 12, 25)));
        videoCassettes.add(new VideoCassette(46L, "The Truman Show", LocalDate.of(1998, 6, 5)));
        videoCassettes.add(new VideoCassette(47L, "The Maltese Falcon", LocalDate.of(1941, 10, 18)));
        videoCassettes.add(new VideoCassette(48L, "The Princess Bride", LocalDate.of(1987, 9, 25)));
        videoCassettes.add(new VideoCassette(49L, "The Graduate", LocalDate.of(1967, 12, 21)));
        videoCassettes.add(new VideoCassette(50L, "The Fifth Element", LocalDate.of(1997, 5, 7)));
        videoCassettes.add(new VideoCassette(51L, "Eternal Sunshine of the Spotless Mind", LocalDate.of(2004, 3, 19)));
        videoCassettes.add(new VideoCassette(52L, "Blade Runner", LocalDate.of(1982, 6, 25)));
        videoCassettes.add(new VideoCassette(53L, "The Deer Hunter", LocalDate.of(1978, 12, 8)));
        videoCassettes.add(new VideoCassette(54L, "The Graduate", LocalDate.of(1967, 12, 21)));
        videoCassettes.add(new VideoCassette(55L, "The Princess Bride", LocalDate.of(1987, 9, 25)));
        videoCassettes.add(new VideoCassette(56L, "The Maltese Falcon", LocalDate.of(1941, 10, 18)));
        videoCassettes.add(new VideoCassette(57L, "The Truman Show", LocalDate.of(1998, 6, 5)));
        videoCassettes.add(new VideoCassette(58L, "The Godfather: Part III", LocalDate.of(1990, 12, 25)));
        videoCassettes.add(new VideoCassette(59L, "The Social Network", LocalDate.of(2010, 9, 24)));
        videoCassettes.add(new VideoCassette(60L, "Gone with the Wind", LocalDate.of(1939, 12, 15)));
        videoCassettes.add(new VideoCassette(61L, "The Great Gatsby", LocalDate.of(2013, 5, 1)));
        videoCassettes.add(new VideoCassette(62L, "Amélie", LocalDate.of(2001, 4, 25)));
        videoCassettes.add(new VideoCassette(63L, "A Clockwork Orange", LocalDate.of(1971, 12, 19)));
        videoCassettes.add(new VideoCassette(64L, "The Breakfast Club", LocalDate.of(1985, 2, 15)));
        videoCassettes.add(new VideoCassette(65L, "Seven Samurai", LocalDate.of(1954, 4, 26)));
        videoCassettes.add(new VideoCassette(66L, "Citizen Kane", LocalDate.of(1941, 5, 1)));
        videoCassettes.add(new VideoCassette(67L, "One Flew Over the Cuckoo's Nest", LocalDate.of(1975, 11, 19)));
        videoCassettes.add(new VideoCassette(68L, "Goodfellas", LocalDate.of(1990, 9, 12)));
        videoCassettes.add(new VideoCassette(69L, "The Exorcist", LocalDate.of(1973, 12, 26)));
        videoCassettes.add(new VideoCassette(70L, "The Wizard of Oz", LocalDate.of(1939, 8, 25)));
        videoCassettes.add(new VideoCassette(71L, "The Terminator", LocalDate.of(1984, 10, 26)));
        videoCassettes.add(new VideoCassette(72L, "The Grand Budapest Hotel", LocalDate.of(2014, 2, 6)));
        videoCassettes.add(new VideoCassette(73L, "The Truman Show", LocalDate.of(1998, 6, 5)));
        videoCassettes.add(new VideoCassette(74L, "The Maltese Falcon", LocalDate.of(1941, 10, 18)));
        videoCassettes.add(new VideoCassette(75L, "The Princess Bride", LocalDate.of(1987, 9, 25)));
        videoCassettes.add(new VideoCassette(76L, "The Graduate", LocalDate.of(1967, 12, 21)));
        videoCassettes.add(new VideoCassette(77L, "The Deer Hunter", LocalDate.of(1978, 12, 8)));
        videoCassettes.add(new VideoCassette(78L, "Blade Runner", LocalDate.of(1982, 6, 25)));
        videoCassettes.add(new VideoCassette(79L, "Eternal Sunshine of the Spotless Mind", LocalDate.of(2004, 3, 19)));
        videoCassettes.add(new VideoCassette(80L, "The Fifth Element", LocalDate.of(1997, 5, 7)));
        videoCassettes.add(new VideoCassette(81L, "The Godfather: Part III", LocalDate.of(1990, 12, 25)));
        videoCassettes.add(new VideoCassette(82L, "The Social Network", LocalDate.of(2010, 9, 24)));
        videoCassettes.add(new VideoCassette(83L, "Gone with the Wind", LocalDate.of(1939, 12, 15)));
        videoCassettes.add(new VideoCassette(84L, "The Great Gatsby", LocalDate.of(2013, 5, 1)));
        videoCassettes.add(new VideoCassette(85L, "Amélie", LocalDate.of(2001, 4, 25)));
    }
    @GetMapping("/all")
    public List<VideoCassette> getAll() {
        return videoCassettes;
    }
    @GetMapping
    public VideoCassette getById(@RequestParam int index) {
        Optional<VideoCassette> first = videoCassettes.stream().filter(e -> e.getId() == index).findFirst();
        return first.get();
    }
}
