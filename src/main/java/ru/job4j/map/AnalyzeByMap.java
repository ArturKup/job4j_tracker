package ru.job4j.map;

import java.util.*;

public class AnalyzeByMap {

    public static double averageScore(List<Pupil> pupils) {
        double grades = 0.0;
        int i = 0;
        double b = 0.0;
        for (Pupil pupil : pupils) {
            List<Subject> s = pupil.getSubjects();
            for (Subject subject : s) {
                grades += subject.getScore();
            }
            b = b + (grades / s.size());
            grades *= 0;
        }
        return b / pupils.size();
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> lb = new ArrayList<>();
        double grades = 0.0;
        double b;
        for (Pupil pupil : pupils) {
            List<Subject> s = pupil.getSubjects();
            for (Subject subject : s) {
                grades += subject.getScore();
            }
            b = grades / s.size();
            grades *= 0;
            Label l = new Label(pupil.getName(), b);
            lb.add(l);
        }
        return lb;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        List<Label> lb = new ArrayList<>();
        int i = 0;
        int a = 0;
        for (Pupil pupil : pupils) {
            String str = pupil.subjects.get(i).name;
            if (str.equals(pupil.subjects.get(i).name)) {
                a = a + pupil.subjects.get(i).score;
            }
            map.put(str, a);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            double db = (double) value / (pupils.size());
            Label l = new Label(key, db);
            lb.add(l);
        }
        return lb;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> lb = new ArrayList<>();
        double grades = 0.0;
        double b;
        for (Pupil pupil : pupils) {
            List<Subject> s = pupil.getSubjects();
            for (Subject subject : s) {
                grades += subject.getScore();
            }
            b = grades;
            grades *= 0;
            Label l = new Label(pupil.getName(), b);
            lb.add(l);
        }
        Collections.sort(lb);
        return lb.get(lb.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        List<Label> lb = new ArrayList<>();
        int i = 0;
        int a = 0;
        for (Pupil pupil : pupils) {
            String str = pupil.subjects.get(i).name;
            if (str.equals(pupil.subjects.get(i).name)) {
                a = a + pupil.subjects.get(i).score;
            }
            map.put(str, a);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            double db = (double) value;
            Label l = new Label(key, db);
            lb.add(l);
        }
        Collections.sort(lb, Comparator.naturalOrder());
        return lb.get(lb.size() - 1);
    }
}
