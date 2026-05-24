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

            //Читаем буквы от "игрока"
            String input = scanner.nextLine();
            //Берём первый символ и переводим в нижний регистр
            char guess = input.toLowerCase().charAt(0);
            //Проверяем есть ил такая буква в слове
            boolean letterFound = false;
            for(int i = 0; i < secretWord.length(); i++)
            {
                if(secretWord.charAt(i) == guess)
                {
                    guessedLetters[i] = guess;
                    letterFound = true;
                }
            }
            //Если буквы нет
            if(!letterFound)
            {
                mistakes++;
                System.out.println("Буквы" + guess + "нету!");
            }
            else
            {
                System.out.println("Верно! Буква" + guess + "есть в слове!");
            }

            //Проверяем угадано ли слово
            wordGuessed = true;
            for (int i = 0; i < guessedLetters.length; i++)
            {
                if (guessedLetters[i] == '_')
                {
                    wordGuessed = false;
                    break;
                }
            }
        }
        //Конец игры
        scanner.close();

        System.out.println("\n=================================");
        if (wordGuessed) {
            System.out.println("Поздравляем! Вы угадали слово: " + secretWord);
            System.out.println("Вы сделали " + mistakes + " ошибок.");
        } else {
            System.out.println("Вы проиграли! Загаданное слово было: " + secretWord);
        }
        System.out.println("=================================");
    }
}