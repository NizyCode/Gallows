//Нужные библиотеки
import java.util.Random; //Генерация рандомных чисел
import java.util.Scanner;

public class gallows
{
    public static void main(String[] args)
    {
        //Список слов в игре
        String[] words = {"джава", "падаван", "разработка",
                "программирование", "компьютер", "синтаксис",
                "цикл", "строка", "бит", "консоль", "репозиторий",
                "проект", "виселица"};

        //Берём случайное число (номер массива) и возвращаем его
        //Слово под случайным номер и есть загаданное слово
         Random wordChoise = new Random();
         String secretWord = words[wordChoise.nextInt(words.length)];

         //Заменяем буквы слова из массива words на _
         char[] guessedLetters = new char[secretWord.length()];
         for (int i = 0; i < guessedLetters.length; i++)
         {
            guessedLetters[i] = '_';
         }

         //Кол-во ошибок которые сделал игрок
         int mistakes = 0;
         //Макс кол-во ошибок
         int maxMistakes = 6;
         //Флаг угадано ли слово целиком
         boolean wordGuessed = false;
         //включаем наш сканер
        Scanner scanner = new Scanner(System.in);

        //Условие при котором цикл работает пока ошибок меньше максимума
        //И слово ещё не угадано.
        while (mistakes < maxMistakes && !wordGuessed)
        {
            //Выводим на экран
            System.out.println("\nСлово: " + new String(guessedLetters));
            System.out.println("Ошибок сделано: " + mistakes + " из " + maxMistakes);
            System.out.print("Введите букву: ");
        }
    }
}