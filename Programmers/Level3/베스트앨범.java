import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 베스트앨범 {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genrePlayTotal = new HashMap<>();
        Map<String, List<Song>> genreSongs = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            genrePlayTotal.put(genre, genrePlayTotal.getOrDefault(genre, 0) + play);

            List<Song> songList = genreSongs.getOrDefault(genre, new ArrayList<>());
            songList.add(new Song(i, play));
            genreSongs.put(genre, songList);
        }

        List<String> sortedGenres = new ArrayList<>(genrePlayTotal.keySet());
        sortedGenres.sort((a, b) -> genrePlayTotal.get(b) - genrePlayTotal.get(a));

        List<Integer> answerList = new ArrayList<>();

        for (String genre : sortedGenres) {
            List<Song> songList = genreSongs.get(genre);

            songList.sort((a, b) -> {
                if (b.plays != a.plays) {
                    return b.plays - a.plays;
                } else {
                    return a.index - b.index;
                }
            });

            for (int i = 0; i < Math.min(2, songList.size()); i++) {
                answerList.add(songList.get(i).index);
            }
        }

        return answerList.stream().mapToInt(i -> i).toArray();
    }

    static class Song {
        int index;
        int plays;

        public Song(int index, int plays) {
            this.index = index;
            this.plays = plays;
        }
    }
}
