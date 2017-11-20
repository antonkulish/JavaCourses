public class HomeworkStrings {

    public static void main(String[] args) {

        String text = new String("Съешь ещё этих мягких французских булок");

        //String concat(String str)
        text = text.concat(" и запей кефиром");
        System.out.println(text);

        //char charAt(int index)
        char result1 = text.charAt(0);
        char result2 = text.charAt(11);
        char result3 = text.charAt(27);
        char result4 = text.charAt(36);
        char[] symb = new char[]{result1, result2, result3, result4};
        String result = new String(symb);
        System.out.println("Слово, состоящие из букв по индексам - " + result);

        //boolean endsWith(String suffix)
        String a = "запей вискарём";
        boolean endValue = text.endsWith(a);
        if(!endValue) {
            System.out.println("Фраза не заканчивается на '" + a + "'");
        } else {
            System.out.println("Фраза заканчивается на '" + a + "'");
        }

        //boolean equals(Object anObject)
        String b = "Стол";
        boolean retVal = result.equals(b);
        if(!retVal) {
            System.out.println("Слово, состоящие из букв по индексам - '" + result + "', не соответствует слову '" + b + "'");
        } else {
            System.out.println("Слово, состоящие из букв по индексам - '" + result + "', соответствует слову '" + b + "'");
        }

        //boolean equalsIgnoreCase(String anotherString)
        String c = "стул";
        boolean retVal2 = result.equalsIgnoreCase(c);
        if(retVal2) {
            System.out.println("Слово, состоящие из букв по индексам - '" + result + "', соответствует слову '" + c + "'");
        } else {
            System.out.println("Слово, состоящие из букв по индексам - '" + result + "', не соответствует слову '" + c + "'");
        }

        //int length()
        int textLength = text.length();
        System.out.println("Количество символов в фразе - " + textLength);

        //String replace(char oldChar, char newChar)
        String newWord = result.replace('л', 'к');
        System.out.println("Новое слово - " + newWord);

        //String[] split(String regex)
        String separator = " и ";
        String[] parts = text.split(separator);
        String part1 = parts[0];
        String part2 = parts[1];
        System.out.println("Первое действие - " + part1);
        System.out.println("Второе действие - " + part2);

        //boolean startsWith(String prefix)
        String d = "Съешь";
        boolean startValue = text.startsWith(d);
        if(startValue) {
            System.out.println("Фраза начинается на слово '" + d + "'");
        } else {
            System.out.println("Фраза не начинается на слово '" + d + "'");
        }

        //String substring(int beginIndex)
        String endOfPhrase = text.substring(42);
        System.out.println("Фраза заканчивается на '" + endOfPhrase + "'");

        //String substring(int beginIndex, int endIndex)
        String partOfPhrase = text.substring(42, 47);
        System.out.println("Основная часть фразы - '" + partOfPhrase + "'");

        //String toUpperCase()
        text = text.toUpperCase();
        System.out.println(text);

        //String toLowerCase()
        text = text.toLowerCase();
        System.out.println(text);

        //String trim()
        String textWithSpaces = "    " + text + "   ";
        System.out.println(textWithSpaces.trim());
    }
}
