package Pract20;

public class Root {
    public static void main(String[] args) {
        String text = "Метод replace() заменяет символ в строке.";
        ReloadText ReloadText = new ReloadText();
        ReloadText.wordsCounter(ReloadText.FileToArray(text));
        System.out.println("Самое частое слово: " + ReloadText.getMostUsedWord());
        System.out.println(ReloadText.replace('#', text));
    }
}
