package java_professional_3.task_3;

public class Main {
    public static void main(String[] args) {
        String str1 = "Эта книга адресована всем, кто изучает русский язык. Но состоит она не из правил, упражнений и учебных текстов. Для этого созданы другие замечательные учебники. У этой книги совсем иная задача. Она поможет вам научиться не только разговаривать, но и размышлять по-русски. Книга, которую вы держите в руках, составлена из афоризмов и размышлений великих мыслителей, писателей, поэтов, философов и общественных деятелей различных эпох. Их мысли - о тех вопросах, которые не перестают волновать человечество.";
        String str2, str3;
        String[] strs = str1.split("\\.");
        str2 = str1.substring(0,str1.length()/2 - 1);
        str3 = str1.substring(str1.length()/2 - 1);
        System.out.println(str2);
        System.out.println(str3);
        for (int i = 0; i < strs.length; i++){
            System.out.println(strs[i].trim());
        }

    }
}
