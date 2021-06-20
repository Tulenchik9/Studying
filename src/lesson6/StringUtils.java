package lesson6;

public class StringUtils {


    // 1 - модификатор доступа: (один из 4-х слов)
    // public - доступ внутри всего проекта (90% случаев)
    // ______ - доступ внутри пакета (плюс наследникам)
    // protected - доступ внутри класса и наследникам
    // private - доступ внутри класса
    // 2 - static (есть или нет)
    // 3 - возвращаемый тип (указываем тип) или void если метод ничего не возвращает
    // 4 - название метода (с маленькой буквы)
    // 5 - входящие параметры (всегда в круглых скобках)
    // 6 - тело выполнения метода
    public static int countSpaceInText(String text) {
        char[] charsFromText = text.toCharArray();
        int summ = 0;
        for (int i = 0; i < charsFromText.length; i++) {
            if (charsFromText[i] == ' ') {
                summ++;
            }
        }
        return summ;
    }

    public static String replaceGlasToUppercase(String text) {
        // text = "Коллеги, всем привет"
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'о') {
                text = text.replace('о', 'О');
            }
            if (text.charAt(i) == 'е') {
                text = text.replace('е', 'Е');
            }
            if (text.charAt(i) == 'и') {
                text = text.replace('и', 'И');
            }
            if (text.charAt(i) == 'а') {
                text = text.replace('а', 'А');
            }
            if (text.charAt(i) == 'у') {
                text = text.replace('у', 'У');
            }
            if (text.charAt(i) == 'ю') {
                text = text.replace('ю', 'Ю');
            }
        }
        return text;
    }

    public static void printWordsRevers(String text) {
        String[] partsOfText = text.split(" ");
        for (int i = partsOfText.length - 1; i >= 0; i--) {
            System.out.println(partsOfText[i]);
        }
    }
}