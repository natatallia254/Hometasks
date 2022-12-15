package Lesson_4;

public class Park {
    private String description;
    private String workTimePark;

    static int countAttr;

    public Park(String description, String workTimePark) {
        this.description = description;
        this.workTimePark = workTimePark;
        countAttr++;
    }

    public class attraction {
        private String descrAttr;
        private String workTimeAtt;
        private int costAttr;

        public attraction(String descrAttr, String workTimeAtt, int costAttr) {
            this.descrAttr = descrAttr;
            this.workTimeAtt = workTimeAtt;
            this.costAttr = costAttr;
        }

        public void aboutAttr() {
            System.out.println("Наш парк: "+description+". Время работы: "+workTimePark+". Описание аттракциона: " + descrAttr + ". Время работы: " + workTimeAtt + ". Стоимость: " + costAttr + " руб.");
        }

    }

    public static void main(String[] args) {
        Park.attraction[] attrMass = new attraction[3];
        attrMass[0] = new Park("им.Луначарского приглашает взрослых и детей на отдых","08:00-23:00").new attraction("веселые горки. Для детей и взрослых от 7 лет","10:00-19:00",10);
        attrMass[1] = new Park("им.Луначарского приглашает взрослых и детей на отдых","08:00-23:00").new attraction("супервосемь. Для детей и взрослых от 12 лет","10:00-21:00",13);
        attrMass[2] = new Park("им.Луначарского приглашает взрослых и детей на отдых","08:00-23:00").new attraction("солнышко. Для детей от 5 до 8 лет","10:00-19:00",8);

        for (int i = 0; i < attrMass.length; i++) {
            attrMass[i].aboutAttr();
            System.out.println();
        }

        System.out.println("Количество аттракционов: "+countAttr);

    }

}
