/* Russian
 * Проект: Игра «Виселица» (Hangman)
 * 
 * Описание:
 *   Консольная игра, в которой игроку нужно угадать загаданное слово по буквам.
 *   Словарь предопределён (слова на русском, связанные с программированием).
 *   Игрок вводит буквы по одной. Если буква есть в слове – она открывается,
 *   если нет – увеличивается счётчик ошибок. Максимальное количество ошибок – 5.
 *   Игра заканчивается досрочно, если игрок угадал все буквы, либо после
 *   5 ошибок – тогда слово открывается полностью.
 * 
 * Правила:
 *   - Ввод только одной буквы (первый символ строки, регистр не важен).
 *   - За каждую неверную букву начисляется ошибка.
 *   - Буквы, уже открытые или введённые ранее, никак не отслеживаются
 *     (игрок может вводить повторно – засчитывается как ошибка или успех,
 *      но повторные угаданные буквы не изменяют состояние).
 * 
 * Структура проекта:
 *   - Список слов для угадывания (массив String[] words).
 *   - Генератор случайных чисел (Random) для выбора слова.
 *   - Массив guessedLetters для хранения текущего состояния отгаданного слова.
 *   - Счётчики mistakes (текущее число ошибок) и maxMistakes (максимум ошибок).
 *   - Флаг wordGuessed для досрочного выхода при полном отгадывании.
 *   - Цикл while, который работает до поражения или победы.
 *   - Ввод с клавиатуры через Scanner.
 *   - Финальное сообщение с результатом игры.
 * 
 * Алгоритм:
 *   1. Выбрать случайное слово из словаря.
 *   2. Инициализировать массив отгаданных букв подчёркиваниями '_'.
 *   3. Пока ошибки < 5 и слово не угадано:
 *       - Вывести текущее состояние слова и количество ошибок.
 *       - Запросить у игрока одну букву.
 *       - Если буква есть в загаданном слове – открыть её во всех позициях.
 *       - Иначе увеличить счётчик ошибок и вывести сообщение.
 *       - Проверить, остались ли подчёркивания. Если нет – установить флаг победы.
 *   4. Закрыть Scanner.
 *   5. Вывести результат (победа/поражение) и загаданное слово.
 * 
 * Используемые библиотеки:
 *   - java.util.Random – для генерации случайного индекса слова.
 *   - java.util.Scanner – для чтения ввода пользователя.
 * 
 * Возможные доработки:
 *   - Проверка, что введена именно одна русская буква.
 *   - Хранение уже введённых букв, чтобы не считать повторные ошибки.
 *   - Отображение «виселицы» в виде ASCII-графики.
 *   - Загрузка слов из внешнего файла.
=================================================================================================================================
* English
* Project: Hangman (Виселица)

Description:
A console game where the player has to guess a hidden word letter by letter. The word list is predefined (Russian words related to programming). The player enters one letter at a time. If the letter is in the word, it is revealed; if not, the mistake counter increases. The maximum allowed mistakes is 5. The game ends early if the player guesses all letters, or after 5 mistakes – then the full word is shown.

Rules:

    Only one letter is entered per turn (the first character of the input string, case‑insensitive).

    Each incorrect letter counts as a mistake.

    Letters that have already been guessed (correctly or incorrectly) are not tracked. The player may enter the same letter again – it will be counted as a mistake (if the letter is not in the word) or as a correct guess (if it is), but repeated correct guesses do not change the game state.

Project structure:

    A list of words to guess (String[] words).

    A random number generator (Random) to select a word.

    A char array guessedLetters to store the current state of the guessed word.

    Counters: mistakes (current number of errors) and maxMistakes (maximum allowed errors, 5).

    A boolean flag wordGuessed for early exit when the whole word has been guessed.

    A while loop that runs until the player loses or wins.

    Keyboard input via Scanner.

    A final message showing the result of the game.

Algorithm:

    Choose a random word from the dictionary.

    Initialise the guessed‑letters array with underscores (_).

    While mistakes < 5 and the word is not yet guessed:

        Display the current word state and the number of mistakes.

        Ask the player for one letter.

        If the letter is in the secret word, reveal it at all positions.

        Otherwise, increase the mistake counter and display a message.

        Check if any underscores remain. If not, set the victory flag.

    Close the Scanner.

    Display the result (win / loss) and the secret word.

Libraries used:

    java.util.Random – to generate a random index for selecting a word.

    java.util.Scanner – to read user input from the keyboard.

Possible improvements:

    Validate that exactly one Russian letter is entered.

    Keep track of already tried letters to avoid counting repeated mistakes.

    Display the gallows as ASCII art.

    Load words from an external file.
