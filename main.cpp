#include <iostream>
#include <vector>
#include <string>
#include <thread>
#include <chrono>
#include <sstream>
#include <tuple>

void printLirik() {
    const int beatDelay = 435;

    std::vector<std::tuple<std::string, int>> lirik = {
        {"Ab Dil Chahe Khamoshi Ke Hothon Pe Main Likh Du", beatDelay},
        {"", 2},
        {"Pyari Si Bate Kayi", beatDelay},
        {"", 4},
        {"ho... Kuch Pal Mere Nam Kare Wo Mai Bhi Usne Nam Pe Likhu Mulakate Kayi", beatDelay},
        {"", 5},
        {"Ho Pahli Hi Takni Mein Ban Gayi Jan Pe", beatDelay},
        {"", 3},
        {"Naina Waina Uske Mere Dil Pe Chape", beatDelay},
        {"", 4},
        {"Ab Jau Kaha Pe, Dil Ruka Hai Waha Pe", beatDelay},
        {"", 2},
        {"Jaha Dekh Ke Mujhe Wo Aage Badh Gaya Oye", beatDelay},
        {"", 2},
        {"O Rabba Main Toh Mar Gaya", beatDelay},
        {"Judai Mujhe Kar Gaya Kar Gaya Oye", beatDelay},
        {"O Rabba Main Toh Mar Gaya", beatDelay},
        {"Judai Mujhe Kar Gaya Kar Gaya Oye", beatDelay},
        {"", 4},
    };


    for (const auto& baris : lirik) {
        const std::string& teks = std::get<0>(baris);
        int delayPerWord = std::get<1>(baris);
        if (teks.empty()) {
            std::this_thread::sleep_for(std::chrono::milliseconds(delayPerWord * beatDelay)); // Delay for break
            continue;
        }
        std::istringstream iss(teks);
        std::string word;
        bool firstWord = true;
        while (iss >> word) {
            if (!firstWord) {
                std::cout << " ";
            }
            std::cout << word << std::flush;
            firstWord = false;
            std::this_thread::sleep_for(std::chrono::milliseconds(beatDelay));
        }
        std::cout << std::endl;
        std::this_thread::sleep_for(std::chrono::milliseconds(beatDelay * 2));
    }
}

int main() {
    printLirik();
    return 0;
}
