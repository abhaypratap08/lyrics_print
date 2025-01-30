public class Main {

    public static void printLirik() {
        final int beatDelay = 435;

        String[][] lirik = {
                {"Ab Dil Chahe Khamoshi Ke Hothon Pe Main Likh Du", String.valueOf(beatDelay)},
                {"", "2"},
                {"Pyari Si Bate Kayi", String.valueOf(beatDelay)},
                {"", "4"},
                {"ho... Kuch Pal Mere Nam Kare Wo Mai Bhi Usne Nam Pe Likhu Mulakate Kayi", String.valueOf(beatDelay)},
                {"", "5"},
                {"Ho Pahli Hi Takni Mein Ban Gayi Jan Pe", String.valueOf(beatDelay)},
                {"", "3"},
                {"Naina Waina Uske Mere Dil Pe Chape", String.valueOf(beatDelay)},
                {"", "4"},
                {"Ab Jau Kaha Pe, Dil Ruka Hai Waha Pe", String.valueOf(beatDelay)},
                {"", "2"},
                {"Jaha Dekh Ke Mujhe Wo Aage Badh Gaya Oye", String.valueOf(beatDelay)},
                {"", "2"},
                {"O Rabba Main Toh Mar Gaya", String.valueOf(beatDelay)},
                {"Judai Mujhe Kar Gaya Kar Gaya Oye", String.valueOf(beatDelay)},
                {"O Rabba Main Toh Mar Gaya", String.valueOf(beatDelay)},
                {"Judai Mujhe Kar Gaya Kar Gaya Oye", String.valueOf(beatDelay)},
                {"", "4"},
        };

        for (String[] baris : lirik) {
            String teks = baris[0];
            int delayPerWord = Integer.parseInt(baris[1]);
            if (teks.isEmpty()) {
                try {
                    Thread.sleep(delayPerWord * beatDelay); // Delay for break
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                continue;
            }
            String[] words = teks.split(" ");
            boolean firstWord = true;
            for (String word : words) {
                if (!firstWord) {
                    System.out.print(" ");
                }
                System.out.print(word);
                firstWord = false;
                try {
                    Thread.sleep(beatDelay); // Delay between words
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println();
            try {
                Thread.sleep(beatDelay * 2); // Pause after full sentence
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        printLirik();
    }
}
