#include <iostream>
#include <cctype>
#include <string>
#include <map>

int letterValue(char ch)
{
    // This map replaces your switch/case.
    // The upside is that you don't have to specify
    // upper and lower case letters. The downside is
    // that the letter values have to be repeated 
    // for each entry.
    //
    // Notice that we made it a static constant, so the map
    // doesn't get recreated every time we enter the function.
    //
    // NOTE: To compile this code, you'll need to
    // make sure C++11 support is enabled in your
    // compiler (should be fine by default with recent
    // versions of Visual Studio).
    //
    // Also notice that your solution is missing the entry 
    // for 'n', as was pointed out by Edward in his answer.
    //
    static const std::map<char, int> charValues = {
        {'a',1}, {'e',1}, {'i',1}, {'l',1}, {'o',1},
        {'r',1}, {'s',1}, {'t',1}, {'u',1}, {'n',1},
        {'d',2}, {'g',2}, {'b',3}, {'c',3}, {'m',3},
        {'p',3}, {'f',4}, {'h',4}, {'v',4}, {'w',4},
        {'y',4}, {'k',5}, {'j',8}, {'x',8}, {'q',10}, 
        {'z',10}
    };

    // Since you want to return 0 for a non-mapped letter
    // we first find() it, then check the result. The `? :`
    // thingy is the ternary operator, in case you are not
    // familiar with it. It's just like a compact version
    // of an if then else...
    //
    auto iter = charValues.find(std::tolower(ch));
    return (iter != std::end(charValues)) ? iter->second : 0;
}

int gameScore(const std::string & word) // <= Here you can see the const 
         // reference, to avoid copying the string. The `&` means reference.
{
    // Notice the const here to enforce one-time initialization.
    const std::size_t length = word.length();

    int total = 0;
    for (std::size_t i = 0; i < length; i++)
    {
        total += letterValue(word[i]);
    }

    return total;
}

int main()
{
    while (true)
    {
        // Using a string instead of a fixed size array.
        std::string word;
        std::cout << "Enter a word: ";
        std::getline(std::cin, word);

        // std::string has this handy method to test if it is... Empty!
        if (word.empty())
        {
            break;
        }

        const int score = gameScore(word);
        std::cout << "The score for '" << word << "' is " << score << "\n";
    }

    std::cin.get();
}