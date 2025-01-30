import time

def print_lirik():
    beat_delay = 435

    lirik = [
        ("Ab Dil Chahe Khamoshi Ke Hothon Pe Main Likh Du", beat_delay),
        ("", 2),
        ("Pyari Si Bate Kayi", beat_delay),
        ("", 4),
        ("ho... Kuch Pal Mere Nam Kare Wo Mai Bhi Usne Nam Pe Likhu Mulakate Kayi", beat_delay),
        ("", 5),
        ("Ho Pahli Hi Takni Mein Ban Gayi Jan Pe", beat_delay),
        ("", 3),
        ("Naina Waina Uske Mere Dil Pe Chape", beat_delay),
        ("", 4),
        ("Ab Jau Kaha Pe, Dil Ruka Hai Waha Pe", beat_delay),
        ("", 2),
        ("Jaha Dekh Ke Mujhe Wo Aage Badh Gaya Oye", beat_delay),
        ("", 2),
        ("O Rabba Main Toh Mar Gaya", beat_delay),
        ("Judai Mujhe Kar Gaya Kar Gaya Oye", beat_delay),
        ("O Rabba Main Toh Mar Gaya", beat_delay),
        ("Judai Mujhe Kar Gaya Kar Gaya Oye", beat_delay),
        ("", 4),
    ]

    for baris in lirik:
        teks, delay_per_word = baris
        if teks == "":
            time.sleep(delay_per_word * beat_delay / 1000)  # Delay for break
            continue
        words = teks.split()
        first_word = True
        for word in words:
            if not first_word:
                print(" ", end="", flush=True)
            print(word, end="", flush=True)
            first_word = False
            time.sleep(beat_delay / 1000)
        print()  # Newline after each sentence
        time.sleep(beat_delay * 2 / 1000)  # Pause after each full sentence

def main():
    print_lirik()

if __name__ == "__main__":
    main()
