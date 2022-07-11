package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        JSONReport js = new JSONReport();
        String text = js.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}